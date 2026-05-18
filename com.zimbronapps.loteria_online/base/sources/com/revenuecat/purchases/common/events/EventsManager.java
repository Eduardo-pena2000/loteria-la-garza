package com.revenuecat.purchases.common.events;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.D;
import Da.Q;
import Da.S;
import Da.v;
import Da.w;
import Qa.l;
import Qa.p;
import Qa.r;
import Ya.h;
import Za.G;
import ab.b;
import ab.d;
import ab.e;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventListener;
import com.revenuecat.purchases.DebugEventName;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.ads.events.AdEvent;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.events.CustomPaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.RateLimiter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import tb.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EventsManager {
    public static final String AD_EVENTS_FILE_PATH = "RevenueCat/event_store/ad_event_store.jsonl";
    public static final Companion Companion = new Companion(null);
    public static final String EVENTS_FILE_PATH_NEW = "RevenueCat/event_store/event_store.jsonl";
    public static final int EVENTS_TO_CLEAR_ON_LIMIT = 50;
    public static final double FILE_SIZE_LIMIT_KB = 2048.0d;
    private static final int FLUSH_COUNT = 50;
    private static final int MAX_FLUSH_BATCHES = 10;
    private static final String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    private static final UUID appSessionID;
    private static final b json;
    private final UUID appSessionID$1;
    private DebugEventListener debugEventListener;
    private final Dispatcher eventsDispatcher;
    private final EventsFileHelper fileHelper;
    private AtomicBoolean flushInProgress;
    private final IdentityManager identityManager;
    private final EventsFileHelper legacyEventsFileHelper;
    private boolean legacyFlushTriggered;
    private boolean pendingPriorityFlush;
    private final r postEvents;
    private final RateLimiter priorityFlushRateLimiter;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ void getEVENTS_TO_CLEAR_ON_LIMIT$annotations() {
        }

        public static /* synthetic */ void getFILE_SIZE_LIMIT_KB$annotations() {
        }

        private static /* synthetic */ void getJson$annotations() {
        }

        public final EventsFileHelper adEvents(FileHelper fileHelper) {
            t.g(fileHelper, "fileHelper");
            return new EventsFileHelper(fileHelper, "RevenueCat/event_store/ad_event_store.jsonl", EventsManager$Companion$adEvents$1.INSTANCE, EventsManager$Companion$adEvents$2.INSTANCE);
        }

        public final EventsFileHelper backendEvents(FileHelper fileHelper) {
            t.g(fileHelper, "fileHelper");
            return new EventsFileHelper(fileHelper, "RevenueCat/event_store/event_store.jsonl", EventsManager$Companion$backendEvents$1.INSTANCE, EventsManager$Companion$backendEvents$2.INSTANCE);
        }

        public final UUID getAppSessionID$purchases_defaultsBc8Release() {
            return EventsManager.access$getAppSessionID$cp();
        }

        public final EventsFileHelper paywalls(FileHelper fileHelper) {
            t.g(fileHelper, "fileHelper");
            return new EventsFileHelper(fileHelper, "RevenueCat/paywall_event_store/paywall_event_store.jsonl", EventsManager$Companion$paywalls$1.INSTANCE, new EventsManager$Companion$paywalls$2(PaywallStoredEvent.Companion));
        }

        private Companion() {
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ Delay $delay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Delay delay) {
            super(0);
            this.$delay = delay;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            if (EventsManager.access$getFlushInProgress$p(EventsManager.this).getAndSet(true)) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Flush already in progress.");
                    return;
                }
                return;
            }
            DebugEventListener debugEventListener = EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FLUSH_STARTED, null, 2, null));
            }
            EventsManager.access$flushNextBatch(EventsManager.this, 1, this.$delay);
            if (EventsManager.access$getLegacyFlushTriggered$p(EventsManager.this)) {
                return;
            }
            EventsManager.access$setLegacyFlushTriggered$p(EventsManager.this, true);
            EventsManager.access$flushLegacyEvents(EventsManager.this);
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ EventsFileHelper $legacyEventsFileHelper;

        public static final class 4 extends u implements Qa.a {
            final /* synthetic */ EventsFileHelper $legacyEventsFileHelper;
            final /* synthetic */ List $storedLegacyEventsWithNullValues;
            final /* synthetic */ EventsManager this$0;

            public static final class 2 extends u implements Qa.a {
                final /* synthetic */ EventsFileHelper $legacyEventsFileHelper;
                final /* synthetic */ List $storedLegacyEventsWithNullValues;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 2(EventsFileHelper eventsFileHelper, List list) {
                    super(0);
                    this.$legacyEventsFileHelper = eventsFileHelper;
                    this.$storedLegacyEventsWithNullValues = list;
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return I.a;
                }

                public final void invoke() {
                    this.$legacyEventsFileHelper.clear(this.$storedLegacyEventsWithNullValues.size());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 4(EventsManager eventsManager, EventsFileHelper eventsFileHelper, List list) {
                super(0);
                this.this$0 = eventsManager;
                this.$legacyEventsFileHelper = eventsFileHelper;
                this.$storedLegacyEventsWithNullValues = list;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Legacy event flush: success.");
                }
                EventsManager.enqueue$default(this.this$0, null, new 2(this.$legacyEventsFileHelper, this.$storedLegacyEventsWithNullValues), 1, null);
            }
        }

        public static final class 5 extends u implements p {
            final /* synthetic */ EventsFileHelper $legacyEventsFileHelper;
            final /* synthetic */ List $storedLegacyEventsWithNullValues;
            final /* synthetic */ EventsManager this$0;

            public static final class 2 extends u implements Qa.a {
                final /* synthetic */ EventsFileHelper $legacyEventsFileHelper;
                final /* synthetic */ boolean $shouldMarkAsSynced;
                final /* synthetic */ List $storedLegacyEventsWithNullValues;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 2(boolean z, EventsFileHelper eventsFileHelper, List list) {
                    super(0);
                    this.$shouldMarkAsSynced = z;
                    this.$legacyEventsFileHelper = eventsFileHelper;
                    this.$storedLegacyEventsWithNullValues = list;
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return I.a;
                }

                public final void invoke() {
                    if (this.$shouldMarkAsSynced) {
                        this.$legacyEventsFileHelper.clear(this.$storedLegacyEventsWithNullValues.size());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 5(EventsManager eventsManager, EventsFileHelper eventsFileHelper, List list) {
                super(2);
                this.this$0 = eventsManager;
                this.$legacyEventsFileHelper = eventsFileHelper;
                this.$storedLegacyEventsWithNullValues = list;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError, boolean z) {
                t.g(purchasesError, "error");
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Legacy event flush error: " + purchasesError + '.', null);
                EventsManager.enqueue$default(this.this$0, null, new 2(z, this.$legacyEventsFileHelper, this.$storedLegacyEventsWithNullValues), 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(EventsFileHelper eventsFileHelper) {
            super(0);
            this.$legacyEventsFileHelper = eventsFileHelper;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            List access$getLegacyPaywallsStoredEvents = EventsManager.access$getLegacyPaywallsStoredEvents(EventsManager.this);
            List c0 = D.c0(access$getLegacyPaywallsStoredEvents);
            ArrayList arrayList = new ArrayList(w.y(c0, 10));
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                arrayList.add(new BackendStoredEvent.Paywalls(((PaywallStoredEvent) it.next()).toBackendEvent()));
            }
            if (c0.isEmpty()) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "No legacy events to sync. Skipping legacy flush.");
                    return;
                }
                return;
            }
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "Legacy event flush: posting " + arrayList.size() + " events.");
            }
            r access$getPostEvents$p = EventsManager.access$getPostEvents$p(EventsManager.this);
            ArrayList arrayList2 = new ArrayList(w.y(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(BackendStoredEventKt.toBackendEvent((BackendStoredEvent.Paywalls) it2.next()));
            }
            access$getPostEvents$p.invoke(new EventsRequest(arrayList2), Delay.LONG, new 4(EventsManager.this, this.$legacyEventsFileHelper, access$getLegacyPaywallsStoredEvents), new 5(EventsManager.this, this.$legacyEventsFileHelper, access$getLegacyPaywallsStoredEvents));
        }
    }

    public static final class 5 extends u implements Qa.a {
        final /* synthetic */ int $batchNumber;
        final /* synthetic */ long $batchStartTimeMillis;
        final /* synthetic */ Delay $delay;
        final /* synthetic */ List $storedEventsWithNullValues;

        public static final class 2 extends u implements Qa.a {
            final /* synthetic */ int $batchNumber;
            final /* synthetic */ Delay $delay;
            final /* synthetic */ List $storedEventsWithNullValues;
            final /* synthetic */ EventsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(EventsManager eventsManager, List list, int i, Delay delay) {
                super(0);
                this.this$0 = eventsManager;
                this.$storedEventsWithNullValues = list;
                this.$batchNumber = i;
                this.$delay = delay;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                EventsManager.access$getFileHelper$p(this.this$0).clear(this.$storedEventsWithNullValues.size());
                EventsManager.access$flushNextBatch(this.this$0, this.$batchNumber + 1, this.$delay);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(int i, long j, List list, Delay delay) {
            super(0);
            this.$batchNumber = i;
            this.$batchStartTimeMillis = j;
            this.$storedEventsWithNullValues = list;
            this.$delay = delay;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            int i = this.$batchNumber;
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "New event flush (batch " + i + "): success.");
            }
            DebugEventListener debugEventListener = EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FLUSH_COMPLETED, S.l(new q[]{x.a("batch_number", String.valueOf(this.$batchNumber)), x.a("elapsed_millis", String.valueOf(System.currentTimeMillis() - this.$batchStartTimeMillis))})));
            }
            EventsManager eventsManager = EventsManager.this;
            EventsManager.enqueue$default(eventsManager, null, new 2(eventsManager, this.$storedEventsWithNullValues, this.$batchNumber, this.$delay), 1, null);
        }
    }

    public static final class 6 extends u implements p {
        final /* synthetic */ int $batchNumber;
        final /* synthetic */ List $storedEventsWithNullValues;

        public static final class 3 extends u implements Qa.a {
            final /* synthetic */ boolean $shouldMarkAsSynced;
            final /* synthetic */ List $storedEventsWithNullValues;
            final /* synthetic */ EventsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(boolean z, EventsManager eventsManager, List list) {
                super(0);
                this.$shouldMarkAsSynced = z;
                this.this$0 = eventsManager;
                this.$storedEventsWithNullValues = list;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                if (this.$shouldMarkAsSynced) {
                    EventsManager.access$getFileHelper$p(this.this$0).clear(this.$storedEventsWithNullValues.size());
                }
                EventsManager.access$onFlushComplete(this.this$0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 6(int i, List list) {
            super(2);
            this.$batchNumber = i;
            this.$storedEventsWithNullValues = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z) {
            t.g(purchasesError, "error");
            int i = this.$batchNumber;
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "New event flush (batch " + i + ") error: " + purchasesError + '.', null);
            DebugEventListener debugEventListener = EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                DebugEventName debugEventName = DebugEventName.FLUSH_ERROR;
                Map c = Q.c();
                c.put("errorCode", purchasesError.getCode().name());
                String underlyingErrorMessage = purchasesError.getUnderlyingErrorMessage();
                if (underlyingErrorMessage != null) {
                    c.put("underlyingErrorMessage", G.q1(underlyingErrorMessage, 80));
                }
                I i2 = I.a;
                debugEventListener.onDebugEventReceived(new DebugEvent(debugEventName, Q.b(c)));
            }
            EventsManager eventsManager = EventsManager.this;
            EventsManager.enqueue$default(eventsManager, null, new 3(z, eventsManager, this.$storedEventsWithNullValues), 1, null);
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ O $events;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(O o) {
            super(1);
            this.$events = o;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return I.a;
        }

        public final void invoke(h hVar) {
            t.g(hVar, "sequence");
            this.$events.a = Ya.r.G(Ya.r.D(hVar, 50));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ O $events;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(O o) {
            super(1);
            this.$events = o;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return I.a;
        }

        public final void invoke(h hVar) {
            t.g(hVar, "sequence");
            this.$events.a = Ya.r.G(Ya.r.D(hVar, 50));
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ FeatureEvent $event;
        final /* synthetic */ EventsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(FeatureEvent featureEvent, EventsManager eventsManager) {
            super(0);
            this.$event = featureEvent;
            this.this$0 = eventsManager;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            BackendStoredEvent backendStoredEvent;
            FeatureEvent featureEvent = this.$event;
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            Config config = Config.INSTANCE;
            if (config.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Tracking event: " + featureEvent);
            }
            FeatureEvent featureEvent2 = this.$event;
            if (featureEvent2 instanceof PaywallEvent) {
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((PaywallEvent) featureEvent2, EventsManager.access$getIdentityManager$p(this.this$0).getCurrentAppUserID());
            } else if (featureEvent2 instanceof CustomerCenterImpressionEvent) {
                String currentAppUserID = EventsManager.access$getIdentityManager$p(this.this$0).getCurrentAppUserID();
                String uuid = EventsManager.access$getAppSessionID$p(this.this$0).toString();
                t.f(uuid, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomerCenterImpressionEvent) featureEvent2, currentAppUserID, uuid);
            } else if (featureEvent2 instanceof CustomerCenterSurveyOptionChosenEvent) {
                String currentAppUserID2 = EventsManager.access$getIdentityManager$p(this.this$0).getCurrentAppUserID();
                String uuid2 = EventsManager.access$getAppSessionID$p(this.this$0).toString();
                t.f(uuid2, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomerCenterSurveyOptionChosenEvent) featureEvent2, currentAppUserID2, uuid2);
            } else if (featureEvent2 instanceof AdEvent.Displayed) {
                String currentAppUserID3 = EventsManager.access$getIdentityManager$p(this.this$0).getCurrentAppUserID();
                String uuid3 = EventsManager.access$getAppSessionID$p(this.this$0).toString();
                t.f(uuid3, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Displayed) featureEvent2, currentAppUserID3, uuid3);
            } else if (featureEvent2 instanceof AdEvent.Open) {
                String currentAppUserID4 = EventsManager.access$getIdentityManager$p(this.this$0).getCurrentAppUserID();
                String uuid4 = EventsManager.access$getAppSessionID$p(this.this$0).toString();
                t.f(uuid4, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Open) featureEvent2, currentAppUserID4, uuid4);
            } else if (featureEvent2 instanceof AdEvent.Revenue) {
                String currentAppUserID5 = EventsManager.access$getIdentityManager$p(this.this$0).getCurrentAppUserID();
                String uuid5 = EventsManager.access$getAppSessionID$p(this.this$0).toString();
                t.f(uuid5, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Revenue) featureEvent2, currentAppUserID5, uuid5);
            } else if (featureEvent2 instanceof AdEvent.Loaded) {
                String currentAppUserID6 = EventsManager.access$getIdentityManager$p(this.this$0).getCurrentAppUserID();
                String uuid6 = EventsManager.access$getAppSessionID$p(this.this$0).toString();
                t.f(uuid6, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Loaded) featureEvent2, currentAppUserID6, uuid6);
            } else if (featureEvent2 instanceof AdEvent.FailedToLoad) {
                String currentAppUserID7 = EventsManager.access$getIdentityManager$p(this.this$0).getCurrentAppUserID();
                String uuid7 = EventsManager.access$getAppSessionID$p(this.this$0).toString();
                t.f(uuid7, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.FailedToLoad) featureEvent2, currentAppUserID7, uuid7);
            } else if (featureEvent2 instanceof CustomPaywallEvent.Impression) {
                String currentAppUserID8 = EventsManager.access$getIdentityManager$p(this.this$0).getCurrentAppUserID();
                String uuid8 = EventsManager.access$getAppSessionID$p(this.this$0).toString();
                t.f(uuid8, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomPaywallEvent.Impression) featureEvent2, currentAppUserID8, uuid8);
            } else {
                backendStoredEvent = null;
            }
            if (backendStoredEvent != null) {
                EventsManager.access$checkFileSizeAndClearIfNeeded(this.this$0);
                EventsManager.access$getFileHelper$p(this.this$0).appendEvent(backendStoredEvent);
                if (this.$event.isPriorityEvent()) {
                    EventsManager.access$performPriorityFlush(this.this$0);
                    return;
                }
                return;
            }
            FeatureEvent featureEvent3 = this.$event;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (config.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler2.d("[Purchases] - " + logLevel.name(), "Backend event not implemented for: " + featureEvent3);
            }
        }
    }

    static {
        UUID randomUUID = UUID.randomUUID();
        t.f(randomUUID, "randomUUID()");
        appSessionID = randomUUID;
        json = tb.u.b((b) null, EventsManager$Companion$json$1.INSTANCE, 1, (Object) null);
    }

    public EventsManager(UUID uuid, EventsFileHelper eventsFileHelper, EventsFileHelper eventsFileHelper2, IdentityManager identityManager, Dispatcher dispatcher, r rVar, RateLimiter rateLimiter) {
        t.g(uuid, "appSessionID");
        t.g(eventsFileHelper2, "fileHelper");
        t.g(identityManager, "identityManager");
        t.g(dispatcher, "eventsDispatcher");
        t.g(rVar, "postEvents");
        t.g(rateLimiter, "priorityFlushRateLimiter");
        this.appSessionID$1 = uuid;
        this.legacyEventsFileHelper = eventsFileHelper;
        this.fileHelper = eventsFileHelper2;
        this.identityManager = identityManager;
        this.eventsDispatcher = dispatcher;
        this.postEvents = rVar;
        this.priorityFlushRateLimiter = rateLimiter;
        this.flushInProgress = new AtomicBoolean(false);
    }

    public static /* synthetic */ void a(Qa.a aVar) {
        enqueue$lambda$10(aVar);
    }

    public static final /* synthetic */ void access$checkFileSizeAndClearIfNeeded(EventsManager eventsManager) {
        eventsManager.checkFileSizeAndClearIfNeeded();
    }

    public static final /* synthetic */ void access$flushLegacyEvents(EventsManager eventsManager) {
        eventsManager.flushLegacyEvents();
    }

    public static final /* synthetic */ void access$flushNextBatch(EventsManager eventsManager, int i, Delay delay) {
        eventsManager.flushNextBatch(i, delay);
    }

    public static final /* synthetic */ UUID access$getAppSessionID$cp() {
        return appSessionID;
    }

    public static final /* synthetic */ UUID access$getAppSessionID$p(EventsManager eventsManager) {
        return eventsManager.appSessionID$1;
    }

    public static final /* synthetic */ EventsFileHelper access$getFileHelper$p(EventsManager eventsManager) {
        return eventsManager.fileHelper;
    }

    public static final /* synthetic */ AtomicBoolean access$getFlushInProgress$p(EventsManager eventsManager) {
        return eventsManager.flushInProgress;
    }

    public static final /* synthetic */ IdentityManager access$getIdentityManager$p(EventsManager eventsManager) {
        return eventsManager.identityManager;
    }

    public static final /* synthetic */ b access$getJson$cp() {
        return json;
    }

    public static final /* synthetic */ boolean access$getLegacyFlushTriggered$p(EventsManager eventsManager) {
        return eventsManager.legacyFlushTriggered;
    }

    public static final /* synthetic */ List access$getLegacyPaywallsStoredEvents(EventsManager eventsManager) {
        return eventsManager.getLegacyPaywallsStoredEvents();
    }

    public static final /* synthetic */ r access$getPostEvents$p(EventsManager eventsManager) {
        return eventsManager.postEvents;
    }

    public static final /* synthetic */ void access$onFlushComplete(EventsManager eventsManager) {
        eventsManager.onFlushComplete();
    }

    public static final /* synthetic */ void access$performPriorityFlush(EventsManager eventsManager) {
        eventsManager.performPriorityFlush();
    }

    public static final /* synthetic */ void access$setLegacyFlushTriggered$p(EventsManager eventsManager, boolean z) {
        eventsManager.legacyFlushTriggered = z;
    }

    private final void checkFileSizeAndClearIfNeeded() {
        if (this.fileHelper.fileSizeInKB() >= 2048.0d) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Event store size limit reached. Clearing oldest events to free up space.");
            }
            this.fileHelper.clear(50);
            DebugEventListener debugEventListener = this.debugEventListener;
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FILE_SIZE_LIMIT_REACHED, null, 2, null));
            }
        }
    }

    private final void enqueue(Delay delay, Qa.a aVar) {
        this.eventsDispatcher.enqueue(new a(aVar), delay);
    }

    public static /* synthetic */ void enqueue$default(EventsManager eventsManager, Delay delay, Qa.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            delay = Delay.NONE;
        }
        eventsManager.enqueue(delay, aVar);
    }

    private static final void enqueue$lambda$10(Qa.a aVar) {
        aVar.invoke();
    }

    public static /* synthetic */ void flushEvents$default(EventsManager eventsManager, Delay delay, int i, Object obj) {
        if ((i & 1) != 0) {
            delay = Delay.DEFAULT;
        }
        eventsManager.flushEvents(delay);
    }

    private final void flushLegacyEvents() {
        EventsFileHelper eventsFileHelper = this.legacyEventsFileHelper;
        if (eventsFileHelper == null) {
            return;
        }
        enqueue$default(this, null, new 1(eventsFileHelper), 1, null);
    }

    private final void flushNextBatch(int i, Delay delay) {
        DebugEventListener debugEventListener;
        if (i > 10) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Reached maximum number of flush batches (10). Stopping flush.");
            }
            onFlushComplete();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        List storedEvents = getStoredEvents();
        List c0 = D.c0(storedEvents);
        if (c0.isEmpty()) {
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "No new events to sync.");
            }
            if (i == 1 && (debugEventListener = this.debugEventListener) != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FLUSH_SKIPPED_NO_EVENTS, null, 2, null));
            }
            onFlushComplete();
            return;
        }
        LogLevel logLevel3 = LogLevel.VERBOSE;
        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            currentLogHandler3.v("[Purchases] - " + logLevel3.name(), "New event flush (batch " + i + "): posting " + c0.size() + " events.");
        }
        r rVar = this.postEvents;
        ArrayList arrayList = new ArrayList(w.y(c0, 10));
        Iterator it = c0.iterator();
        while (it.hasNext()) {
            arrayList.add(BackendStoredEventKt.toBackendEvent((BackendStoredEvent) it.next()));
        }
        rVar.invoke(new EventsRequest(arrayList), delay, new 5(i, currentTimeMillis, storedEvents, delay), new 6(i, storedEvents));
    }

    private final List getLegacyPaywallsStoredEvents() {
        O o = new O();
        o.a = v.n();
        EventsFileHelper eventsFileHelper = this.legacyEventsFileHelper;
        if (eventsFileHelper != null) {
            eventsFileHelper.readFile(new 1(o));
        }
        return (List) o.a;
    }

    private final List getStoredEvents() {
        O o = new O();
        o.a = v.n();
        this.fileHelper.readFile(new 1(o));
        return (List) o.a;
    }

    private final void onFlushComplete() {
        this.flushInProgress.set(false);
        startPendingPriorityFlushIfNeeded();
    }

    private final void performPriorityFlush() {
        this.pendingPriorityFlush = true;
        if (!this.flushInProgress.get()) {
            startPendingPriorityFlushIfNeeded();
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Flush in progress. Queuing priority flush.");
        }
    }

    private final void startPendingPriorityFlushIfNeeded() {
        if (this.pendingPriorityFlush) {
            this.pendingPriorityFlush = false;
            if (!this.priorityFlushRateLimiter.shouldProceed()) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Priority flush rate limited. Skipping.");
                    return;
                }
                return;
            }
            if (this.flushInProgress.getAndSet(true)) {
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Flush in progress. Queuing priority flush.");
                }
                this.pendingPriorityFlush = true;
                return;
            }
            LogLevel logLevel3 = LogLevel.DEBUG;
            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "Starting priority flush.");
            }
            flushNextBatch(1, Delay.NONE);
        }
    }

    public final synchronized void flushEvents(Delay delay) {
        t.g(delay, "delay");
        enqueue$default(this, null, new 1(delay), 1, null);
    }

    public final synchronized DebugEventListener getDebugEventListener() {
        return this.debugEventListener;
    }

    public final synchronized void setDebugEventListener(DebugEventListener debugEventListener) {
        try {
            this.debugEventListener = debugEventListener;
            this.fileHelper.setDebugEventCallback(debugEventListener != null ? new EventsManager$debugEventListener$callback$1$1(debugEventListener) : null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void track(FeatureEvent featureEvent) {
        t.g(featureEvent, "event");
        enqueue$default(this, null, new 1(featureEvent, this), 1, null);
    }

    public /* synthetic */ EventsManager(UUID uuid, EventsFileHelper eventsFileHelper, EventsFileHelper eventsFileHelper2, IdentityManager identityManager, Dispatcher dispatcher, r rVar, RateLimiter rateLimiter, int i, k kVar) {
        RateLimiter rateLimiter2;
        UUID uuid2 = (i & 1) != 0 ? appSessionID : uuid;
        if ((i & 64) != 0) {
            b.a aVar = ab.b.b;
            rateLimiter2 = new RateLimiter(5, d.s(60, e.e), (k) null);
        } else {
            rateLimiter2 = rateLimiter;
        }
        this(uuid2, eventsFileHelper, eventsFileHelper2, identityManager, dispatcher, rVar, rateLimiter2);
    }
}

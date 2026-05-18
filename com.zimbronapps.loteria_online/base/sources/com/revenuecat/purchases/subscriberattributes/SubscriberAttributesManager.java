package com.revenuecat.purchases.subscriberattributes;

import Ca.I;
import Ca.x;
import Da.Q;
import Da.S;
import Da.v;
import Qa.l;
import Za.B;
import Za.E;
import android.app.Application;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesManager {
    private final boolean automaticDeviceIdentifierCollectionEnabled;
    private final SubscriberAttributesPoster backend;
    private final SubscriberAttributesCache deviceCache;
    private final DeviceIdentifiersFetcher deviceIdentifiersFetcher;
    private final ObtainDeviceIdentifiersObservable obtainingDeviceIdentifiersObservable;

    public static final class ObtainDeviceIdentifiersObservable extends Observable {
        private final ArrayList listeners = new ArrayList();
        private int numberOfProcesses;

        public ObtainDeviceIdentifiersObservable() {
            addObserver(new a(this));
        }

        private static final void _init_$lambda$2(ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable, Observable observable, Object obj) {
            t.e(observable, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable");
            if (((ObtainDeviceIdentifiersObservable) observable).numberOfProcesses == 0) {
                synchronized (obtainDeviceIdentifiersObservable) {
                    try {
                        Iterator it = obtainDeviceIdentifiersObservable.listeners.iterator();
                        while (it.hasNext()) {
                            ((Qa.a) it.next()).invoke();
                        }
                        obtainDeviceIdentifiersObservable.listeners.clear();
                        I i = I.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public static /* synthetic */ void a(ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable, Observable observable, Object obj) {
            _init_$lambda$2(obtainDeviceIdentifiersObservable, observable, obj);
        }

        public final synchronized int getNumberOfProcesses() {
            return this.numberOfProcesses;
        }

        public final synchronized void setNumberOfProcesses(int i) {
            if (this.numberOfProcesses == i) {
                return;
            }
            this.numberOfProcesses = i;
            setChanged();
            notifyObservers();
        }

        public final synchronized void waitUntilIdle(Qa.a aVar) {
            try {
                t.g(aVar, "completion");
                if (this.numberOfProcesses == 0) {
                    aVar.invoke();
                } else {
                    this.listeners.add(new SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ String $appUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str) {
            super(1);
            this.$appUserID = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map) obj);
            return I.a;
        }

        public final void invoke(Map map) {
            t.g(map, "deviceIdentifiers");
            SubscriberAttributesManager.this.setAttributes(map, this.$appUserID);
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, SubscriberAttributesManager subscriberAttributesManager) {
            super(1);
            this.$completion = lVar;
            this.this$0 = subscriberAttributesManager;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map) obj);
            return I.a;
        }

        public final void invoke(Map map) {
            t.g(map, "deviceIdentifiers");
            this.$completion.invoke(map);
            SubscriberAttributesManager.access$getObtainingDeviceIdentifiersObservable$p(this.this$0).setNumberOfProcesses(r2.getNumberOfProcesses() - 1);
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ l $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, SubscriberAttributesManager subscriberAttributesManager, String str) {
            super(0);
            this.$completion = lVar;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.$completion.invoke(this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes(this.$appUserID));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $setAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar) {
            super(1);
            this.$setAttributes = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map) obj);
            return I.a;
        }

        public final void invoke(Map map) {
            t.g(map, "deviceIdentifiers");
            this.$setAttributes.invoke(map);
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ Qa.a $completion;
        final /* synthetic */ String $currentAppUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.a aVar, String str) {
            super(0);
            this.$completion = aVar;
            this.$currentAppUserID = str;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            LogHandler currentLogHandler;
            String str;
            String str2;
            Map unsyncedSubscriberAttributes = SubscriberAttributesManager.this.getDeviceCache().getUnsyncedSubscriberAttributes();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : unsyncedSubscriberAttributes.entrySet()) {
                if (!E.h0((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                int size = linkedHashMap.size();
                M m = new M();
                SubscriberAttributesManager subscriberAttributesManager = SubscriberAttributesManager.this;
                String str3 = this.$currentAppUserID;
                Qa.a aVar = this.$completion;
                for (Iterator it = linkedHashMap.entrySet().iterator(); it.hasNext(); it = it) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    String str4 = (String) entry2.getKey();
                    Map map = (Map) entry2.getValue();
                    subscriberAttributesManager.getBackend().postSubscriberAttributes(BackendHelpersKt.toBackendMap(map), str4, new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1(subscriberAttributesManager, str4, map, str3, m, aVar, size), new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2(subscriberAttributesManager, str4, map, m, aVar, size));
                    str3 = str3;
                }
                return;
            }
            LogIntent logIntent = LogIntent.DEBUG;
            SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1 = new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            Qa.a aVar2 = this.$completion;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
    }

    public SubscriberAttributesManager(SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesPoster subscriberAttributesPoster, DeviceIdentifiersFetcher deviceIdentifiersFetcher, boolean z) {
        t.g(subscriberAttributesCache, "deviceCache");
        t.g(subscriberAttributesPoster, "backend");
        t.g(deviceIdentifiersFetcher, "deviceIdentifiersFetcher");
        this.deviceCache = subscriberAttributesCache;
        this.backend = subscriberAttributesPoster;
        this.deviceIdentifiersFetcher = deviceIdentifiersFetcher;
        this.automaticDeviceIdentifierCollectionEnabled = z;
        this.obtainingDeviceIdentifiersObservable = new ObtainDeviceIdentifiersObservable();
    }

    public static final /* synthetic */ ObtainDeviceIdentifiersObservable access$getObtainingDeviceIdentifiersObservable$p(SubscriberAttributesManager subscriberAttributesManager) {
        return subscriberAttributesManager.obtainingDeviceIdentifiersObservable;
    }

    private final void getDeviceIdentifiers(Application application, l lVar) {
        ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.obtainingDeviceIdentifiersObservable;
        obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() + 1);
        this.deviceIdentifiersFetcher.getDeviceIdentifiers(application, new 1(lVar, this));
    }

    private final void storeAttributesIfNeeded(Map map, String str) {
        Map allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
        Map linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            SubscriberAttribute subscriberAttribute = (SubscriberAttribute) entry.getValue();
            if (allStoredSubscriberAttributes.containsKey(str2)) {
                SubscriberAttribute subscriberAttribute2 = (SubscriberAttribute) allStoredSubscriberAttributes.get(str2);
                if (!t.c(subscriberAttribute2 != null ? subscriberAttribute2.getValue() : null, subscriberAttribute.getValue())) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        this.deviceCache.setAttributes(str, linkedHashMap);
    }

    public static /* synthetic */ void synchronizeSubscriberAttributesForAllUsers$default(SubscriberAttributesManager subscriberAttributesManager, String str, Qa.a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, aVar);
    }

    public final void collectDeviceIdentifiers(String str, Application application) {
        t.g(str, "appUserID");
        t.g(application, "applicationContext");
        getDeviceIdentifiers(application, new 1(str));
    }

    public final synchronized void copyUnsyncedSubscriberAttributes(String str, String str2) {
        try {
            t.g(str, "originalAppUserId");
            t.g(str2, "newAppUserID");
            Map unsyncedSubscriberAttributes = this.deviceCache.getUnsyncedSubscriberAttributes(str);
            if (unsyncedSubscriberAttributes.isEmpty()) {
                return;
            }
            LogLevel logLevel = LogLevel.INFO;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                String str3 = "[Purchases] - " + logLevel.name();
                String format = String.format("Copying unsynced subscriber attributes from user %s to user %s", Arrays.copyOf(new Object[]{str, str2}, 2));
                t.f(format, "format(...)");
                currentLogHandler.i(str3, format);
            }
            this.deviceCache.setAttributes(str2, unsyncedSubscriberAttributes);
            this.deviceCache.clearAllSubscriberAttributesFromUser(str);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final SubscriberAttributesPoster getBackend() {
        return this.backend;
    }

    public final SubscriberAttributesCache getDeviceCache() {
        return this.deviceCache;
    }

    public final synchronized void getUnsyncedSubscriberAttributes(String str, l lVar) {
        t.g(str, "appUserID");
        t.g(lVar, "completion");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new 1(lVar, this, str));
    }

    public final synchronized void markAsSynced(String str, Map map, List list) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        try {
            t.g(str, "appUserID");
            t.g(map, "attributesToMarkAsSynced");
            t.g(list, "attributeErrors");
            if (!list.isEmpty()) {
                LogIntent logIntent = LogIntent.RC_ERROR;
                SubscriberAttributesManager$markAsSynced$$inlined$log$1 subscriberAttributesManager$markAsSynced$$inlined$log$1 = new SubscriberAttributesManager$markAsSynced$$inlined$log$1(logIntent, list);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str2 = "[Purchases] - " + logLevel.name();
                            str3 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str2 = "[Purchases] - " + logLevel4.name();
                            str3 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str2 = "[Purchases] - " + logLevel6.name();
                            str3 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str2 = "[Purchases] - " + logLevel7.name();
                            str3 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                }
            }
            if (map.isEmpty()) {
                return;
            }
            LogIntent logIntent2 = LogIntent.INFO;
            SubscriberAttributesManager$markAsSynced$$inlined$log$2 subscriberAttributesManager$markAsSynced$$inlined$log$2 = new SubscriberAttributesManager$markAsSynced$$inlined$log$2(logIntent2, str, map);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    break;
            }
            Map allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
            Map C = S.C(allStoredSubscriberAttributes);
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                SubscriberAttribute subscriberAttribute = (SubscriberAttribute) entry.getValue();
                SubscriberAttribute subscriberAttribute2 = (SubscriberAttribute) allStoredSubscriberAttributes.get(str4);
                if (subscriberAttribute2 != null) {
                    if (subscriberAttribute2.isSynced()) {
                        subscriberAttribute2 = null;
                    }
                    if (subscriberAttribute2 != null) {
                        if (!t.c(subscriberAttribute2.getValue(), subscriberAttribute.getValue())) {
                            subscriberAttribute2 = null;
                        }
                        if (subscriberAttribute2 != null) {
                            C.put(str4, SubscriberAttribute.copy$default(subscriberAttribute, null, null, null, null, true, 15, null));
                        }
                    }
                }
            }
            this.deviceCache.setAttributes(str, C);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setAppsFlyerConversionData(String str, Map map) {
        t.g(str, "appUserID");
        if (map == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String stringValueForPrimitive = MapExtensionsKt.getStringValueForPrimitive(map, "media_source");
        if (stringValueForPrimitive != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), stringValueForPrimitive);
        } else {
            String stringValueForPrimitive2 = MapExtensionsKt.getStringValueForPrimitive(map, "af_status");
            if (stringValueForPrimitive2 != null && B.z(stringValueForPrimitive2, "Organic", true)) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), "Organic");
            }
        }
        String stringValueForPrimitive3 = MapExtensionsKt.getStringValueForPrimitive(map, "campaign");
        if (stringValueForPrimitive3 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE.getBackendKey(), stringValueForPrimitive3);
        }
        String stringValueForPrimitive4 = MapExtensionsKt.getStringValueForPrimitive(map, "adgroup");
        if (stringValueForPrimitive4 == null) {
            stringValueForPrimitive4 = MapExtensionsKt.getStringValueForPrimitive(map, "adset");
        }
        if (stringValueForPrimitive4 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE.getBackendKey(), stringValueForPrimitive4);
        }
        String stringValueForPrimitive5 = MapExtensionsKt.getStringValueForPrimitive(map, "af_ad");
        if (stringValueForPrimitive5 == null) {
            stringValueForPrimitive5 = MapExtensionsKt.getStringValueForPrimitive(map, "ad_id");
        }
        if (stringValueForPrimitive5 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE.getBackendKey(), stringValueForPrimitive5);
        }
        String stringValueForPrimitive6 = MapExtensionsKt.getStringValueForPrimitive(map, "af_keywords");
        if (stringValueForPrimitive6 == null) {
            stringValueForPrimitive6 = MapExtensionsKt.getStringValueForPrimitive(map, "keyword");
        }
        if (stringValueForPrimitive6 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE.getBackendKey(), stringValueForPrimitive6);
        }
        String stringValueForPrimitive7 = MapExtensionsKt.getStringValueForPrimitive(map, "creative");
        if (stringValueForPrimitive7 == null) {
            stringValueForPrimitive7 = MapExtensionsKt.getStringValueForPrimitive(map, "af_creative");
        }
        if (stringValueForPrimitive7 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE.getBackendKey(), stringValueForPrimitive7);
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        setAttributes(linkedHashMap, str);
    }

    public final void setAppstackAttributionParams(String str, Map map, Application application) {
        t.g(str, "appUserID");
        t.g(map, "data");
        t.g(application, "applicationContext");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = (String) map.get("appstack_adnetwork");
        if (str2 != null) {
            if (E.h0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), str2);
                linkedHashMap.put("appstack_adnetwork", str2);
            }
        }
        String str3 = (String) map.get("appstack_campaign");
        if (str3 != null) {
            if (E.h0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE.getBackendKey(), str3);
                linkedHashMap.put("appstack_campaign", str3);
            }
        }
        String str4 = (String) map.get("appstack_adset");
        if (str4 != null) {
            if (E.h0(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE.getBackendKey(), str4);
                linkedHashMap.put("appstack_adset", str4);
            }
        }
        String str5 = (String) map.get("appstack_ad");
        if (str5 != null) {
            if (E.h0(str5)) {
                str5 = null;
            }
            if (str5 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE.getBackendKey(), str5);
                linkedHashMap.put("appstack_ad", str5);
            }
        }
        String str6 = (String) map.get("appstack_keywords");
        if (str6 != null) {
            if (E.h0(str6)) {
                str6 = null;
            }
            if (str6 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE.getBackendKey(), str6);
                linkedHashMap.put("appstack_keywords", str6);
            }
        }
        for (String str7 : v.q(new String[]{"fbclid", "gclid", "wbraid", "gbraid", "ttclid"})) {
            String str8 = (String) map.get(str7);
            if (str8 != null) {
                if (E.h0(str8)) {
                    str8 = null;
                }
                if (str8 != null) {
                    linkedHashMap.put(str7, str8);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            setAttributes(linkedHashMap, str);
        }
        String str9 = (String) map.get("appstack_id");
        if (str9 != null) {
            String str10 = E.h0(str9) ? null : str9;
            if (str10 != null) {
                setAttributionID(SubscriberAttributeKey.AttributionIds.Appstack.INSTANCE, str10, str, application);
            }
        }
    }

    public final synchronized void setAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, String str2) {
        t.g(subscriberAttributeKey, "key");
        t.g(str2, "appUserID");
        setAttributes(Q.f(x.a(subscriberAttributeKey.getBackendKey(), str)), str2);
    }

    public final synchronized void setAttributes(Map map, String str) {
        try {
            t.g(map, "attributesToSet");
            t.g(str, "appUserID");
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(x.a(str2, new SubscriberAttribute(str2, (String) entry.getValue(), (DateProvider) null, (Date) null, false, 28, (k) null)));
            }
            storeAttributesIfNeeded(S.x(arrayList), str);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setAttributionID(SubscriberAttributeKey.AttributionIds attributionIds, String str, String str2, Application application) {
        t.g(attributionIds, "attributionKey");
        t.g(str2, "appUserID");
        t.g(application, "applicationContext");
        SubscriberAttributesManager$setAttributionID$setAttributes$1 subscriberAttributesManager$setAttributionID$setAttributes$1 = new SubscriberAttributesManager$setAttributionID$setAttributes$1(attributionIds, str, this, str2);
        if (this.automaticDeviceIdentifierCollectionEnabled) {
            getDeviceIdentifiers(application, new 1(subscriberAttributesManager$setAttributionID$setAttributes$1));
        } else {
            subscriberAttributesManager$setAttributionID$setAttributes$1.invoke(S.h());
        }
    }

    public final void synchronizeSubscriberAttributesForAllUsers(String str, Qa.a aVar) {
        t.g(str, "currentAppUserID");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new 1(aVar, str));
    }
}

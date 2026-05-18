package com.revenuecat.purchases.identity;

import Ca.I;
import Ga.e;
import Ha.b;
import Ha.c;
import Ia.h;
import Qa.l;
import Qa.p;
import Za.B;
import Za.E;
import Za.o;
import android.content.SharedPreferences;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class IdentityManager {
    public static final String UI_PREVIEW_MODE_APP_USER_ID = "$RC_PREVIEW_MODE_USER";
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final OfferingsCache offeringsCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final SubscriberAttributesCache subscriberAttributesCache;
    private final SubscriberAttributesManager subscriberAttributesManager;
    private final boolean uiPreviewMode;
    public static final Companion Companion = new Companion(null);
    private static final o anonymousIdRegex = new o("^\\$RCAnonymousID:([a-f0-9]{32})$");

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean isUserIDAnonymous(String str) {
            t.g(str, "appUserID");
            return IdentityManager.access$getAnonymousIdRegex$cp().h(str);
        }

        private Companion() {
        }
    }

    public static final class 2 extends u implements Qa.a {
        public 2() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            IdentityManager.access$getDeviceCache$p(IdentityManager.this).cleanupOldAttributionData$purchases_defaultsBc8Release();
        }
    }

    public static final class 4 extends u implements Qa.a {
        final /* synthetic */ String $newAppUserID;
        final /* synthetic */ String $oldAppUserID;
        final /* synthetic */ l $onError;
        final /* synthetic */ p $onSuccess;

        public static final class 1 extends u implements p {
            final /* synthetic */ String $newAppUserID;
            final /* synthetic */ String $oldAppUserID;
            final /* synthetic */ p $onSuccess;
            final /* synthetic */ IdentityManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(IdentityManager identityManager, p pVar, String str, String str2) {
                super(2);
                this.this$0 = identityManager;
                this.$onSuccess = pVar;
                this.$oldAppUserID = str;
                this.$newAppUserID = str2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
                return I.a;
            }

            public final void invoke(CustomerInfo customerInfo, boolean z) {
                LogHandler currentLogHandler;
                String str;
                String str2;
                t.g(customerInfo, "customerInfo");
                IdentityManager identityManager = this.this$0;
                String str3 = this.$oldAppUserID;
                String str4 = this.$newAppUserID;
                synchronized (identityManager) {
                    try {
                        LogIntent logIntent = LogIntent.USER;
                        IdentityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1 identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1 = new IdentityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1(logIntent, str4, z);
                        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                            case 1:
                                LogLevel logLevel = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                    str = "[Purchases] - " + logLevel.name();
                                    str2 = (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 2:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                break;
                            case 3:
                                LogLevel logLevel2 = LogLevel.WARN;
                                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 4:
                                LogLevel logLevel3 = LogLevel.INFO;
                                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 5:
                                LogLevel logLevel4 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                    str = "[Purchases] - " + logLevel4.name();
                                    str2 = (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 6:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                break;
                            case 7:
                                LogLevel logLevel5 = LogLevel.INFO;
                                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 8:
                                LogLevel logLevel6 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                    str = "[Purchases] - " + logLevel6.name();
                                    str2 = (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 9:
                                LogLevel logLevel7 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                    str = "[Purchases] - " + logLevel7.name();
                                    str2 = (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 10:
                                LogLevel logLevel8 = LogLevel.WARN;
                                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 11:
                                LogLevel logLevel9 = LogLevel.WARN;
                                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 12:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                break;
                            case 13:
                                LogLevel logLevel10 = LogLevel.WARN;
                                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 14:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                break;
                        }
                        IdentityManager.access$getDeviceCache$p(identityManager).clearCachesForAppUserID$purchases_defaultsBc8Release(str3);
                        IdentityManager.access$getOfferingsCache$p(identityManager).clearCache();
                        IdentityManager.access$getSubscriberAttributesCache$p(identityManager).clearSubscriberAttributesIfSyncedForSubscriber(str3);
                        IdentityManager.access$getDeviceCache$p(identityManager).cacheAppUserID$purchases_defaultsBc8Release(str4);
                        IdentityManager.access$getDeviceCache$p(identityManager).cacheCustomerInfo$purchases_defaultsBc8Release(str4, customerInfo);
                        IdentityManager.access$copySubscriberAttributesToNewUserIfOldIsAnonymous(identityManager, str3, str4);
                        IdentityManager.access$getOfflineEntitlementsManager$p(identityManager).resetOfflineCustomerInfoCache();
                        I i = I.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.$onSuccess.invoke(customerInfo, Boolean.valueOf(z));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(String str, String str2, l lVar, p pVar) {
            super(0);
            this.$oldAppUserID = str;
            this.$newAppUserID = str2;
            this.$onError = lVar;
            this.$onSuccess = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            Backend access$getBackend$p = IdentityManager.access$getBackend$p(IdentityManager.this);
            String str = this.$oldAppUserID;
            String str2 = this.$newAppUserID;
            access$getBackend$p.logIn(str, str2, new 1(IdentityManager.this, this.$onSuccess, str, str2), this.$onError);
        }
    }

    public static final class 3 extends u implements Qa.a {
        final /* synthetic */ l $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(l lVar) {
            super(0);
            this.$completion = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            LogHandler currentLogHandler;
            String str;
            String str2;
            IdentityManager identityManager = IdentityManager.this;
            IdentityManager.access$resetAndSaveUserID(identityManager, IdentityManager.access$generateRandomID(identityManager));
            LogIntent logIntent = LogIntent.USER;
            IdentityManager$logOut$3$invoke$$inlined$log$1 identityManager$logOut$3$invoke$$inlined$log$1 = new IdentityManager$logOut$3$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            this.$completion.invoke((Object) null);
        }
    }

    public IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, OfferingsCache offeringsCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, Dispatcher dispatcher, boolean z) {
        t.g(deviceCache, "deviceCache");
        t.g(subscriberAttributesCache, "subscriberAttributesCache");
        t.g(subscriberAttributesManager, "subscriberAttributesManager");
        t.g(offeringsCache, "offeringsCache");
        t.g(backend, "backend");
        t.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        t.g(dispatcher, "dispatcher");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCache = subscriberAttributesCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.dispatcher = dispatcher;
        this.uiPreviewMode = z;
    }

    public static /* synthetic */ void a(Qa.a aVar) {
        enqueue$lambda$13(aVar);
    }

    public static final /* synthetic */ void access$copySubscriberAttributesToNewUserIfOldIsAnonymous(IdentityManager identityManager, String str, String str2) {
        identityManager.copySubscriberAttributesToNewUserIfOldIsAnonymous(str, str2);
    }

    public static final /* synthetic */ String access$generateRandomID(IdentityManager identityManager) {
        return identityManager.generateRandomID();
    }

    public static final /* synthetic */ o access$getAnonymousIdRegex$cp() {
        return anonymousIdRegex;
    }

    public static final /* synthetic */ Backend access$getBackend$p(IdentityManager identityManager) {
        return identityManager.backend;
    }

    public static final /* synthetic */ DeviceCache access$getDeviceCache$p(IdentityManager identityManager) {
        return identityManager.deviceCache;
    }

    public static final /* synthetic */ OfferingsCache access$getOfferingsCache$p(IdentityManager identityManager) {
        return identityManager.offeringsCache;
    }

    public static final /* synthetic */ OfflineEntitlementsManager access$getOfflineEntitlementsManager$p(IdentityManager identityManager) {
        return identityManager.offlineEntitlementsManager;
    }

    public static final /* synthetic */ SubscriberAttributesCache access$getSubscriberAttributesCache$p(IdentityManager identityManager) {
        return identityManager.subscriberAttributesCache;
    }

    public static final /* synthetic */ void access$resetAndSaveUserID(IdentityManager identityManager, String str) {
        identityManager.resetAndSaveUserID(str);
    }

    private final void copySubscriberAttributesToNewUserIfOldIsAnonymous(String str, String str2) {
        if (Companion.isUserIDAnonymous(str)) {
            this.subscriberAttributesManager.copyUnsyncedSubscriberAttributes(str, str2);
        }
    }

    private final synchronized void enqueue(Qa.a aVar) {
        this.dispatcher.enqueue(new a(aVar), Delay.NONE);
    }

    private static final void enqueue$lambda$13(Qa.a aVar) {
        aVar.invoke();
    }

    private final String generateRandomID() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("$RCAnonymousID:");
        String uuid = UUID.randomUUID().toString();
        t.f(uuid, "randomUUID().toString()");
        Locale locale = Locale.ROOT;
        t.f(locale, "ROOT");
        String lowerCase = uuid.toLowerCase(locale);
        t.f(lowerCase, "toLowerCase(...)");
        String H = B.H(lowerCase, "-", "", false, 4, (Object) null);
        LogIntent logIntent = LogIntent.USER;
        IdentityManager$generateRandomID$lambda$12$$inlined$log$1 identityManager$generateRandomID$lambda$12$$inlined$log$1 = new IdentityManager$generateRandomID$lambda$12$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
        }
        sb.append(H);
        return sb.toString();
    }

    private final void invalidateETagCacheIfNeeded(String str) {
        if (!t.c(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE) && shouldInvalidateETagCache(this.deviceCache.getCachedCustomerInfo$purchases_defaultsBc8Release(str))) {
            LogLevel logLevel = LogLevel.INFO;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.i("[Purchases] - " + logLevel.name(), "Detected unverified cached CustomerInfo but verification is enabled. Invalidating Etag cache.");
            }
            this.backend.clearCaches();
        }
    }

    private final synchronized void resetAndSaveUserID(String str) {
        this.deviceCache.clearCachesForAppUserID$purchases_defaultsBc8Release(getCurrentAppUserID());
        this.offeringsCache.clearCache();
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        this.deviceCache.cacheAppUserID$purchases_defaultsBc8Release(str);
        this.backend.clearCaches();
    }

    private final boolean shouldInvalidateETagCache(CustomerInfo customerInfo) {
        return (customerInfo == null || customerInfo.getEntitlements().getVerification() != VerificationResult.NOT_REQUESTED || t.c(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE)) ? false : true;
    }

    public final Object aliasCurrentUserIdTo(String str, e eVar) {
        String currentAppUserID = getCurrentAppUserID();
        Ga.k kVar = new Ga.k(b.c(eVar));
        this.backend.aliasUsers(str, currentAppUserID, new IdentityManager$aliasCurrentUserIdTo$2$1(this, kVar, currentAppUserID, str), new IdentityManager$aliasCurrentUserIdTo$2$2(kVar));
        Object a = kVar.a();
        if (a == c.f()) {
            h.c(eVar);
        }
        return a == c.f() ? a : I.a;
    }

    public final synchronized void configure(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        try {
            if (this.uiPreviewMode) {
                LogIntent logIntent = LogIntent.USER;
                IdentityManager$configure$$inlined$log$1 identityManager$configure$$inlined$log$1 = new IdentityManager$configure$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str2 = "[Purchases] - " + logLevel.name();
                            str3 = (String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str2 = "[Purchases] - " + logLevel4.name();
                            str3 = (String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str2 = "[Purchases] - " + logLevel6.name();
                            str3 = (String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str2 = "[Purchases] - " + logLevel7.name();
                            str3 = (String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$configure$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                }
                str = "$RC_PREVIEW_MODE_USER";
            } else if (str == null || E.h0(str)) {
                if (str != null && E.h0(str)) {
                    LogIntent logIntent2 = LogIntent.WARNING;
                    IdentityManager$configure$$inlined$log$2 identityManager$configure$$inlined$log$2 = new IdentityManager$configure$$inlined$log$2(logIntent2);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) identityManager$configure$$inlined$log$2.invoke());
                                break;
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                    }
                }
                str = this.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release();
                if (str == null && (str = this.deviceCache.getLegacyCachedAppUserID$purchases_defaultsBc8Release()) == null) {
                    str = generateRandomID();
                }
            }
            LogIntent logIntent3 = LogIntent.USER;
            IdentityManager$configure$$inlined$log$3 identityManager$configure$$inlined$log$3 = new IdentityManager$configure$$inlined$log$3(logIntent3, str);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                case 1:
                    LogLevel logLevel21 = LogLevel.DEBUG;
                    LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        currentLogHandler18.d("[Purchases] - " + logLevel21.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel22 = LogLevel.WARN;
                    LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler19.w("[Purchases] - " + logLevel22.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel23 = LogLevel.INFO;
                    LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler20.i("[Purchases] - " + logLevel23.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel24 = LogLevel.DEBUG;
                    LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        currentLogHandler21.d("[Purchases] - " + logLevel24.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel25 = LogLevel.INFO;
                    LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler22.i("[Purchases] - " + logLevel25.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel26 = LogLevel.DEBUG;
                    LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        currentLogHandler23.d("[Purchases] - " + logLevel26.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel27 = LogLevel.DEBUG;
                    LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        currentLogHandler24.d("[Purchases] - " + logLevel27.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel28 = LogLevel.WARN;
                    LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel29 = LogLevel.WARN;
                    LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel30 = LogLevel.WARN;
                    LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (String) identityManager$configure$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
            }
            SharedPreferences.Editor startEditing$purchases_defaultsBc8Release = this.deviceCache.startEditing$purchases_defaultsBc8Release();
            this.deviceCache.cacheAppUserID$purchases_defaultsBc8Release(str, startEditing$purchases_defaultsBc8Release);
            this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(str, startEditing$purchases_defaultsBc8Release);
            invalidateETagCacheIfNeeded(str);
            startEditing$purchases_defaultsBc8Release.apply();
            enqueue(new 2());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean currentUserIsAnonymous() {
        Companion companion;
        String cachedAppUserID$purchases_defaultsBc8Release;
        try {
            companion = Companion;
            cachedAppUserID$purchases_defaultsBc8Release = this.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release();
            if (cachedAppUserID$purchases_defaultsBc8Release == null) {
                cachedAppUserID$purchases_defaultsBc8Release = "";
            }
        } catch (Throwable th) {
            throw th;
        }
        return companion.isUserIDAnonymous(cachedAppUserID$purchases_defaultsBc8Release) || t.c(this.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release(), this.deviceCache.getLegacyCachedAppUserID$purchases_defaultsBc8Release());
    }

    public final String getCurrentAppUserID() {
        String cachedAppUserID$purchases_defaultsBc8Release = this.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release();
        return cachedAppUserID$purchases_defaultsBc8Release == null ? "" : cachedAppUserID$purchases_defaultsBc8Release;
    }

    public final void logIn(String str, p pVar, l lVar) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(str, "newAppUserID");
        t.g(pVar, "onSuccess");
        t.g(lVar, "onError");
        if (t.c(getCurrentAppUserID(), "$RC_PREVIEW_MODE_USER") || t.c(str, "$RC_PREVIEW_MODE_USER")) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnsupportedError, "Operation not supported in UI preview mode");
            LogUtilsKt.errorLog(purchasesError);
            lVar.invoke(purchasesError);
            return;
        }
        if (E.h0(str)) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.InvalidAppUserIdError, "Error logging in: appUserID can't be null, empty or blank");
            LogUtilsKt.errorLog(purchasesError2);
            lVar.invoke(purchasesError2);
            return;
        }
        LogIntent logIntent = LogIntent.USER;
        IdentityManager$logIn$$inlined$log$1 identityManager$logIn$$inlined$log$1 = new IdentityManager$logIn$$inlined$log$1(logIntent, this, str);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$logIn$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, new 4(getCurrentAppUserID(), str, lVar, pVar));
    }

    public final synchronized void logOut(l lVar) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(lVar, "completion");
        if (t.c(getCurrentAppUserID(), "$RC_PREVIEW_MODE_USER")) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnsupportedError, "Operation not supported in UI preview mode");
            LogUtilsKt.errorLog(purchasesError);
            lVar.invoke(purchasesError);
            return;
        }
        if (!currentUserIsAnonymous()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new 3(lVar));
            return;
        }
        LogIntent logIntent = LogIntent.RC_ERROR;
        IdentityManager$logOut$$inlined$log$1 identityManager$logOut$$inlined$log$1 = new IdentityManager$logOut$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$logOut$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
        }
        lVar.invoke(new PurchasesError(PurchasesErrorCode.LogOutWithAnonymousUserError, null, 2, null));
    }

    public final void switchUser(String str) {
        t.g(str, "newAppUserID");
        if (t.c(getCurrentAppUserID(), "$RC_PREVIEW_MODE_USER") || t.c(str, "$RC_PREVIEW_MODE_USER")) {
            LogUtilsKt.errorLog(new PurchasesError(PurchasesErrorCode.UnsupportedError, "Operation not supported in UI preview mode"));
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            String str2 = "[Purchases] - " + logLevel.name();
            String format = String.format("Switching to user %s.", Arrays.copyOf(new Object[]{str}, 1));
            t.f(format, "format(...)");
            currentLogHandler.d(str2, format);
        }
        resetAndSaveUserID(str);
    }

    public /* synthetic */ IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, OfferingsCache offeringsCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, Dispatcher dispatcher, boolean z, int i, k kVar) {
        this(deviceCache, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, backend, offlineEntitlementsManager, dispatcher, (i & 128) != 0 ? false : z);
    }
}

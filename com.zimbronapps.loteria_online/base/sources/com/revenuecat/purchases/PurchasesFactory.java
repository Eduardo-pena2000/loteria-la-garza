package com.revenuecat.purchases;

import Ca.I;
import Qa.p;
import Qa.r;
import Za.E;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.revenuecat.purchases.APIKeyValidator;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.events.EventsRequest;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.IsDebugBuildProvider;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesFactory {
    public static final Companion Companion = new Companion(null);
    private final APIKeyValidator apiKeyValidator;
    private final IsDebugBuildProvider isDebugBuild;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final boolean shouldInitializeDiagnostics$purchases_defaultsBc8Release(boolean z, boolean z2) {
            return z && !z2;
        }

        private Companion() {
        }
    }

    public static final class LowPriorityThreadFactory implements ThreadFactory {
        private final String threadName;

        public LowPriorityThreadFactory(String str) {
            t.g(str, "threadName");
            this.threadName = str;
        }

        public static /* synthetic */ void a(Runnable runnable) {
            newThread$lambda$1(runnable);
        }

        private static final void newThread$lambda$1(Runnable runnable) {
            if (runnable != null) {
                Process.setThreadPriority(5);
                runnable.run();
            }
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new g(runnable), this.threadName);
        }
    }

    public static final class 1 extends u implements r {
        final /* synthetic */ Backend $backend;
        final /* synthetic */ URL $baseURL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Backend backend, URL url) {
            super(4);
            this.$backend = backend;
            this.$baseURL = url;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((EventsRequest) obj, (Delay) obj2, (Qa.a) obj3, (p) obj4);
            return I.a;
        }

        public final void invoke(EventsRequest eventsRequest, Delay delay, Qa.a aVar, p pVar) {
            t.g(eventsRequest, "request");
            t.g(delay, "delay");
            t.g(aVar, "onSuccess");
            t.g(pVar, "onError");
            this.$backend.postEvents(eventsRequest, this.$baseURL, delay, aVar, pVar);
        }
    }

    public PurchasesFactory(IsDebugBuildProvider isDebugBuildProvider, APIKeyValidator aPIKeyValidator) {
        t.g(isDebugBuildProvider, "isDebugBuild");
        t.g(aPIKeyValidator, "apiKeyValidator");
        this.isDebugBuild = isDebugBuildProvider;
        this.apiKeyValidator = aPIKeyValidator;
    }

    private final ExecutorService createDefaultExecutor() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        t.f(newSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        return newSingleThreadScheduledExecutor;
    }

    private final ExecutorService createEventsExecutor() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new LowPriorityThreadFactory("revenuecat-events-thread"));
        t.f(newSingleThreadScheduledExecutor, "newSingleThreadScheduled…venuecat-events-thread\"))");
        return newSingleThreadScheduledExecutor;
    }

    private final EventsManager createEventsManager(IdentityManager identityManager, Dispatcher dispatcher, Backend backend, EventsFileHelper eventsFileHelper, EventsFileHelper eventsFileHelper2, URL url) {
        return new EventsManager(null, eventsFileHelper, eventsFileHelper2, identityManager, dispatcher, new 1(backend, url), null, 65, null);
    }

    public static /* synthetic */ Purchases createPurchases$default(PurchasesFactory purchasesFactory, PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, ForceServerErrorStrategy forceServerErrorStrategy, boolean z, boolean z2, String str, int i, Object obj) {
        return purchasesFactory.createPurchases(purchasesConfiguration, platformInfo, url, (i & 8) != 0 ? null : billingAbstract, (i & 16) != 0 ? null : forceServerErrorStrategy, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? "https://api.revenuecat.com/" : str);
    }

    private final Application getApplication(Context context) {
        Application applicationContext = context.getApplicationContext();
        t.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return applicationContext;
    }

    private final boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0c2c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0c8a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0c99  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0ce7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0d87  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0db7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0e27  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0e57  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0e86  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0eb5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0ec4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x07d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.revenuecat.purchases.Purchases createPurchases(com.revenuecat.purchases.PurchasesConfiguration r63, com.revenuecat.purchases.common.PlatformInfo r64, java.net.URL r65, com.revenuecat.purchases.common.BillingAbstract r66, com.revenuecat.purchases.ForceServerErrorStrategy r67, boolean r68, boolean r69, java.lang.String r70) {
        /*
            Method dump skipped, instructions count: 4170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesFactory.createPurchases(com.revenuecat.purchases.PurchasesConfiguration, com.revenuecat.purchases.common.PlatformInfo, java.net.URL, com.revenuecat.purchases.common.BillingAbstract, com.revenuecat.purchases.ForceServerErrorStrategy, boolean, boolean, java.lang.String):com.revenuecat.purchases.Purchases");
    }

    public final APIKeyValidator.ValidationResult validateConfiguration(PurchasesConfiguration purchasesConfiguration) {
        t.g(purchasesConfiguration, "configuration");
        if (!hasPermission(purchasesConfiguration.getContext(), "android.permission.INTERNET")) {
            throw new IllegalArgumentException("Purchases requires INTERNET permission.");
        }
        if (E.h0(purchasesConfiguration.getApiKey())) {
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app");
        }
        APIKeyValidator.ValidationResult validateAndLog = this.apiKeyValidator.validateAndLog(purchasesConfiguration.getApiKey(), purchasesConfiguration.getStore());
        if (this.isDebugBuild.invoke() || validateAndLog != APIKeyValidator.ValidationResult.SIMULATED_STORE) {
            if (purchasesConfiguration.getContext().getApplicationContext() instanceof Application) {
                return validateAndLog;
            }
            throw new IllegalArgumentException("Needs an application context.");
        }
        String redactApiKey = this.apiKeyValidator.redactApiKey(purchasesConfiguration.getApiKey());
        LogUtilsKt.errorLog(new PurchasesError(PurchasesErrorCode.ConfigurationError, "Test Store API key used in release build: " + redactApiKey + ". Please configure the Play Store/Amazon app on the RevenueCat dashboard and use its corresponding API key before releasing. Visit https://rev.cat/sdk-test-store to learn more."));
        SimulatedStoreErrorDialogActivity.Companion.show(purchasesConfiguration.getContext(), redactApiKey);
        return validateAndLog;
    }

    public /* synthetic */ PurchasesFactory(IsDebugBuildProvider isDebugBuildProvider, APIKeyValidator aPIKeyValidator, int i, kotlin.jvm.internal.k kVar) {
        this(isDebugBuildProvider, (i & 2) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }
}

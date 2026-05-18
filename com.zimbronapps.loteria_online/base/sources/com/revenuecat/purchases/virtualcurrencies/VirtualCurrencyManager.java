package com.revenuecat.purchases.virtualcurrencies;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.GetVirtualCurrenciesCallback;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrencyManager {
    private final AppConfig appConfig;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final IdentityManager identityManager;

    public static final class 1 extends u implements l {
        final /* synthetic */ GetVirtualCurrenciesCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(GetVirtualCurrenciesCallback getVirtualCurrenciesCallback) {
            super(1);
            this.$callback = getVirtualCurrenciesCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((VirtualCurrencies) obj);
            return I.a;
        }

        public final void invoke(VirtualCurrencies it) {
            t.g(it, "it");
            this.$callback.onReceived(it);
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ GetVirtualCurrenciesCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(GetVirtualCurrenciesCallback getVirtualCurrenciesCallback) {
            super(1);
            this.$callback = getVirtualCurrenciesCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError it) {
            t.g(it, "it");
            this.$callback.onError(it);
        }
    }

    public static final class 1 implements GetVirtualCurrenciesCallback {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ GetVirtualCurrenciesCallback $completion;

        public 1(String str, GetVirtualCurrenciesCallback getVirtualCurrenciesCallback) {
            this.$appUserID = str;
            this.$completion = getVirtualCurrenciesCallback;
        }

        public void onError(PurchasesError error) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(error, "error");
            LogIntent logIntent = LogIntent.RC_ERROR;
            VirtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1 virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1 = new VirtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1(logIntent, error);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke(), (Throwable) null);
                    break;
            }
            this.$completion.onError(error);
        }

        public void onReceived(VirtualCurrencies virtualCurrencies) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(virtualCurrencies, "virtualCurrencies");
            LogIntent logIntent = LogIntent.RC_SUCCESS;
            VirtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1 virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1 = new VirtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke(), (Throwable) null);
                    break;
            }
            VirtualCurrencyManager.access$cacheVirtualCurrencies(VirtualCurrencyManager.this, virtualCurrencies, this.$appUserID);
            this.$completion.onReceived(virtualCurrencies);
        }
    }

    public VirtualCurrencyManager(IdentityManager identityManager, DeviceCache deviceCache, Backend backend, AppConfig appConfig) {
        t.g(identityManager, "identityManager");
        t.g(deviceCache, "deviceCache");
        t.g(backend, "backend");
        t.g(appConfig, "appConfig");
        this.identityManager = identityManager;
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.appConfig = appConfig;
    }

    public static final /* synthetic */ void access$cacheVirtualCurrencies(VirtualCurrencyManager virtualCurrencyManager, VirtualCurrencies virtualCurrencies, String str) {
        virtualCurrencyManager.cacheVirtualCurrencies(virtualCurrencies, str);
    }

    private final void cacheVirtualCurrencies(VirtualCurrencies virtualCurrencies, String str) {
        this.deviceCache.cacheVirtualCurrencies$purchases_defaultsBc8Release(str, virtualCurrencies);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final VirtualCurrencies fetchCachedVirtualCurrencies(String str, boolean z, boolean z2) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        if (!z2 && this.deviceCache.isVirtualCurrenciesCacheStale$purchases_defaultsBc8Release(str, z)) {
            return null;
        }
        VirtualCurrencies cachedVirtualCurrencies$purchases_defaultsBc8Release = this.deviceCache.getCachedVirtualCurrencies$purchases_defaultsBc8Release(str);
        if (cachedVirtualCurrencies$purchases_defaultsBc8Release == null) {
            LogIntent logIntent = LogIntent.DEBUG;
            VirtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1 virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1 = new VirtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str2 = "[Purchases] - " + logLevel.name();
                        str3 = (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str2 = "[Purchases] - " + logLevel4.name();
                        str3 = (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str2 = "[Purchases] - " + logLevel6.name();
                        str3 = (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str2 = "[Purchases] - " + logLevel7.name();
                        str3 = (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
            }
        }
        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
    }

    private final void fetchVirtualCurrenciesFromBackend(String str, boolean z, GetVirtualCurrenciesCallback getVirtualCurrenciesCallback) {
        this.backend.getVirtualCurrencies(str, z, new 1(getVirtualCurrenciesCallback), new 2(getVirtualCurrenciesCallback));
    }

    private final GetVirtualCurrenciesCallback handleVirtualCurrenciesRequestResult(GetVirtualCurrenciesCallback getVirtualCurrenciesCallback, String str) {
        return new 1(str, getVirtualCurrenciesCallback);
    }

    public final synchronized VirtualCurrencies cachedVirtualCurrencies() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            VirtualCurrencies fetchCachedVirtualCurrencies = fetchCachedVirtualCurrencies(this.identityManager.getCurrentAppUserID(), this.appConfig.isAppBackgrounded(), true);
            if (fetchCachedVirtualCurrencies == null) {
                return null;
            }
            LogIntent logIntent = LogIntent.DEBUG;
            VirtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1 virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1 = new VirtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
            }
            return fetchCachedVirtualCurrencies;
        } finally {
        }
    }

    public final synchronized void invalidateVirtualCurrenciesCache() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            String currentAppUserID = this.identityManager.getCurrentAppUserID();
            LogIntent logIntent = LogIntent.DEBUG;
            VirtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1 virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1 = new VirtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke(), (Throwable) null);
                    break;
            }
            this.deviceCache.clearVirtualCurrenciesCache$purchases_defaultsBc8Release(currentAppUserID);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void virtualCurrencies(GetVirtualCurrenciesCallback callback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            t.g(callback, "callback");
            String currentAppUserID = this.identityManager.getCurrentAppUserID();
            boolean isAppBackgrounded = this.appConfig.isAppBackgrounded();
            VirtualCurrencies fetchCachedVirtualCurrencies = fetchCachedVirtualCurrencies(currentAppUserID, isAppBackgrounded, false);
            if (fetchCachedVirtualCurrencies == null) {
                LogIntent logIntent = LogIntent.DEBUG;
                VirtualCurrencyManager$virtualCurrencies$$inlined$log$2 virtualCurrencyManager$virtualCurrencies$$inlined$log$2 = new VirtualCurrencyManager$virtualCurrencies$$inlined$log$2(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke(), (Throwable) null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke(), (Throwable) null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke(), (Throwable) null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke(), (Throwable) null);
                        break;
                }
                fetchVirtualCurrenciesFromBackend(currentAppUserID, isAppBackgrounded, handleVirtualCurrenciesRequestResult(callback, currentAppUserID));
                return;
            }
            LogIntent logIntent2 = LogIntent.DEBUG;
            VirtualCurrencyManager$virtualCurrencies$$inlined$log$1 virtualCurrencyManager$virtualCurrencies$$inlined$log$1 = new VirtualCurrencyManager$virtualCurrencies$$inlined$log$1(logIntent2);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        str = "[Purchases] - " + logLevel11.name();
                        str2 = (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        str = "[Purchases] - " + logLevel14.name();
                        str2 = (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler14.i("[Purchases] - " + logLevel15.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        str = "[Purchases] - " + logLevel16.name();
                        str2 = (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        str = "[Purchases] - " + logLevel17.name();
                        str2 = (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke(), (Throwable) null);
                    break;
            }
            callback.onReceived(fetchCachedVirtualCurrencies);
        } catch (Throwable th) {
            throw th;
        }
    }
}

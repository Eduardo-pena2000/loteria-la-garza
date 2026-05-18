package com.revenuecat.purchases;

import Ca.H;
import Ca.o;
import Da.D;
import Da.X;
import Da.u;
import Da.v;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.ads.events.AdTracker;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.deeplinks.DeepLinkParser;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontLocaleCallback;
import com.revenuecat.purchases.interfaces.GetVirtualCurrenciesCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import com.revenuecat.purchases.paywalls.events.CustomPaywallEvent;
import com.revenuecat.purchases.paywalls.events.CustomPaywallImpressionParams;
import com.revenuecat.purchases.storage.FileRepository;
import com.revenuecat.purchases.utils.DefaultIsDebugBuildProvider;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Purchases implements LifecycleDelegate {
    private static /* synthetic */ Purchases backingFieldSharedInstance;
    private final PurchasesOrchestrator purchasesOrchestrator;
    public static final Companion Companion = new Companion(null);
    private static final String frameworkVersion = "9.26.1";

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i, Object obj) {
            if ((i & 2) != 0) {
                list = v.n();
            }
            companion.canMakePayments(context, list, callback);
        }

        @Ca.e
        public static /* synthetic */ void getDebugLogsEnabled$annotations() {
        }

        public static /* synthetic */ void getFrameworkVersion$annotations() {
        }

        public static /* synthetic */ void getLogHandler$annotations() {
        }

        public static /* synthetic */ void getLogLevel$annotations() {
        }

        public static /* synthetic */ void getPlatformInfo$annotations() {
        }

        public static /* synthetic */ void getProxyURL$annotations() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        public static /* synthetic */ void isConfigured$annotations() {
        }

        public final void canMakePayments(Context context, Callback callback) {
            t.g(context, "context");
            t.g(callback, "callback");
            canMakePayments$default(this, context, null, callback, 2, null);
        }

        public final Purchases configure(PurchasesConfiguration purchasesConfiguration) {
            PurchasesOrchestrator purchasesOrchestrator$purchases_defaultsBc8Release;
            t.g(purchasesConfiguration, "configuration");
            if (isConfigured()) {
                Purchases backingFieldSharedInstance$purchases_defaultsBc8Release = getBackingFieldSharedInstance$purchases_defaultsBc8Release();
                if (t.c((backingFieldSharedInstance$purchases_defaultsBc8Release == null || (purchasesOrchestrator$purchases_defaultsBc8Release = backingFieldSharedInstance$purchases_defaultsBc8Release.getPurchasesOrchestrator$purchases_defaultsBc8Release()) == null) ? null : purchasesOrchestrator$purchases_defaultsBc8Release.getCurrentConfiguration(), purchasesConfiguration)) {
                    LogLevel logLevel = LogLevel.INFO;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.i("[Purchases] - " + logLevel.name(), "Purchases instance already set with the same configuration. Ignoring duplicate call.");
                    }
                    return getSharedInstance();
                }
                LogLevel logLevel2 = LogLevel.INFO;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.i("[Purchases] - " + logLevel2.name(), "Purchases instance already set. Did you mean to configure two Purchases objects?");
                }
            }
            Purchases createPurchases$default = PurchasesFactory.createPurchases$default(new PurchasesFactory(new DefaultIsDebugBuildProvider(purchasesConfiguration.getContext()), null, 2, null), purchasesConfiguration, getPlatformInfo(), getProxyURL(), null, null, false, false, null, 248, null);
            Purchases.Companion.setSharedInstance$purchases_defaultsBc8Release(createPurchases$default);
            return createPurchases$default;
        }

        public final Purchases getBackingFieldSharedInstance$purchases_defaultsBc8Release() {
            return Purchases.access$getBackingFieldSharedInstance$cp();
        }

        public final boolean getDebugLogsEnabled() {
            return PurchasesOrchestrator.Companion.getDebugLogsEnabled();
        }

        public final String getFrameworkVersion() {
            return Purchases.access$getFrameworkVersion$cp();
        }

        @InternalRevenueCatAPI
        public final Object getImageLoader(Context context) {
            t.g(context, "context");
            return PurchasesOrchestrator.Companion.getImageLoader(context);
        }

        public final synchronized LogHandler getLogHandler() {
            return PurchasesOrchestrator.Companion.getLogHandler();
        }

        public final LogLevel getLogLevel() {
            return PurchasesOrchestrator.Companion.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.Companion.getPlatformInfo();
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.Companion.getProxyURL();
        }

        public final Purchases getSharedInstance() {
            Purchases backingFieldSharedInstance$purchases_defaultsBc8Release = getBackingFieldSharedInstance$purchases_defaultsBc8Release();
            if (backingFieldSharedInstance$purchases_defaultsBc8Release != null) {
                return backingFieldSharedInstance$purchases_defaultsBc8Release;
            }
            throw new H("There is no singleton instance. Make sure you configure Purchases before trying to get the default instance. More info here: https://errors.rev.cat/configuring-sdk");
        }

        public final boolean isConfigured() {
            return getBackingFieldSharedInstance$purchases_defaultsBc8Release() != null;
        }

        public final WebPurchaseRedemption parseAsWebPurchaseRedemption(Intent intent) {
            t.g(intent, "intent");
            Uri data = intent.getData();
            if (data == null) {
                return null;
            }
            return DeepLinkParser.INSTANCE.parseWebPurchaseRedemption(data);
        }

        public final void setBackingFieldSharedInstance$purchases_defaultsBc8Release(Purchases purchases) {
            Purchases.access$setBackingFieldSharedInstance$cp(purchases);
        }

        public final void setDebugLogsEnabled(boolean z) {
            PurchasesOrchestrator.Companion.setDebugLogsEnabled(z);
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            t.g(logHandler, "value");
            PurchasesOrchestrator.Companion.setLogHandler(logHandler);
        }

        public final void setLogLevel(LogLevel logLevel) {
            t.g(logLevel, "value");
            PurchasesOrchestrator.Companion.setLogLevel(logLevel);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            t.g(platformInfo, "value");
            PurchasesOrchestrator.Companion.setPlatformInfo(platformInfo);
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.Companion.setProxyURL(url);
        }

        public final void setSharedInstance$purchases_defaultsBc8Release(Purchases purchases) {
            t.g(purchases, "value");
            Purchases backingFieldSharedInstance$purchases_defaultsBc8Release = getBackingFieldSharedInstance$purchases_defaultsBc8Release();
            if (backingFieldSharedInstance$purchases_defaultsBc8Release != null) {
                backingFieldSharedInstance$purchases_defaultsBc8Release.close();
            }
            setBackingFieldSharedInstance$purchases_defaultsBc8Release(purchases);
        }

        private Companion() {
        }

        public final void canMakePayments(Context context, List list, Callback callback) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(context, "context");
            t.g(list, "features");
            t.g(callback, "callback");
            if (getSharedInstance().getPurchasesOrchestrator$purchases_defaultsBc8Release().getAppConfig().getStore() == Store.PLAY_STORE) {
                PurchasesOrchestrator.Companion.canMakePayments(context, list, callback);
                return;
            }
            LogIntent logIntent = LogIntent.RC_ERROR;
            Purchases$Companion$canMakePayments$$inlined$log$1 purchases$Companion$canMakePayments$$inlined$log$1 = new Purchases$Companion$canMakePayments$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchases$Companion$canMakePayments$$inlined$log$1.invoke(), null);
                    break;
            }
            callback.onReceived(Boolean.TRUE);
        }

        public final WebPurchaseRedemption parseAsWebPurchaseRedemption(String str) {
            t.g(str, "string");
            try {
                Uri parse = Uri.parse(str);
                DeepLinkParser deepLinkParser = DeepLinkParser.INSTANCE;
                t.f(parse, "uri");
                return deepLinkParser.parseWebPurchaseRedemption(parse);
            } catch (Throwable th) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing URL: " + str, th);
                return null;
            }
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesAreCompletedBy.values().length];
            try {
                iArr[PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesAreCompletedBy.MY_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Purchases(PurchasesOrchestrator purchasesOrchestrator) {
        t.g(purchasesOrchestrator, "purchasesOrchestrator");
        this.purchasesOrchestrator = purchasesOrchestrator;
    }

    public static final /* synthetic */ Purchases access$getBackingFieldSharedInstance$cp() {
        return backingFieldSharedInstance;
    }

    public static final /* synthetic */ String access$getFrameworkVersion$cp() {
        return frameworkVersion;
    }

    public static final /* synthetic */ void access$setBackingFieldSharedInstance$cp(Purchases purchases) {
        backingFieldSharedInstance = purchases;
    }

    public static final void canMakePayments(Context context, Callback callback) {
        Companion.canMakePayments(context, callback);
    }

    public static final Purchases configure(PurchasesConfiguration purchasesConfiguration) {
        return Companion.configure(purchasesConfiguration);
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static /* synthetic */ void getAdTracker$annotations() {
    }

    @Ca.e
    public static /* synthetic */ void getAllowSharingPlayStoreAccount$annotations() {
    }

    private static Object getCustomerCenterListener$delegate(Purchases purchases) {
        return P.d(new x(purchases.purchasesOrchestrator, PurchasesOrchestrator.class, "customerCenterListener", "getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", 0));
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getDebugEventListener$annotations() {
    }

    private static Object getDebugEventListener$delegate(Purchases purchases) {
        return P.d(new x(purchases.purchasesOrchestrator, PurchasesOrchestrator.class, "debugEventListener", "getDebugEventListener()Lcom/revenuecat/purchases/DebugEventListener;", 0));
    }

    public static final boolean getDebugLogsEnabled() {
        return Companion.getDebugLogsEnabled();
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getFileRepository$annotations() {
    }

    @Ca.e
    public static /* synthetic */ void getFinishTransactions$annotations() {
    }

    public static final String getFrameworkVersion() {
        return Companion.getFrameworkVersion();
    }

    public static final synchronized LogHandler getLogHandler() {
        LogHandler logHandler;
        synchronized (Purchases.class) {
            logHandler = Companion.getLogHandler();
        }
        return logHandler;
    }

    public static final LogLevel getLogLevel() {
        return Companion.getLogLevel();
    }

    public static final PlatformInfo getPlatformInfo() {
        return Companion.getPlatformInfo();
    }

    public static /* synthetic */ void getProducts$default(Purchases purchases, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            productType = null;
        }
        purchases.getProducts(list, productType, getStoreProductsCallback);
    }

    public static final URL getProxyURL() {
        return Companion.getProxyURL();
    }

    public static final Purchases getSharedInstance() {
        return Companion.getSharedInstance();
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static /* synthetic */ void getStorefrontLocale$annotations() {
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getTrackedEventListener$annotations() {
    }

    private static Object getTrackedEventListener$delegate(Purchases purchases) {
        return P.d(new x(purchases.purchasesOrchestrator, PurchasesOrchestrator.class, "trackedEventListener", "getTrackedEventListener()Lcom/revenuecat/purchases/TrackedEventListener;", 0));
    }

    public static final boolean isConfigured() {
        return Companion.isConfigured();
    }

    public static /* synthetic */ void logIn$default(Purchases purchases, String str, LogInCallback logInCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            logInCallback = null;
        }
        purchases.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(Purchases purchases, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchases.logOut(receiveCustomerInfoCallback);
    }

    public static final WebPurchaseRedemption parseAsWebPurchaseRedemption(Intent intent) {
        return Companion.parseAsWebPurchaseRedemption(intent);
    }

    public static final void setDebugLogsEnabled(boolean z) {
        Companion.setDebugLogsEnabled(z);
    }

    public static final synchronized void setLogHandler(LogHandler logHandler) {
        synchronized (Purchases.class) {
            Companion.setLogHandler(logHandler);
        }
    }

    public static final void setLogLevel(LogLevel logLevel) {
        Companion.setLogLevel(logLevel);
    }

    public static final void setPlatformInfo(PlatformInfo platformInfo) {
        Companion.setPlatformInfo(platformInfo);
    }

    public static final void setProxyURL(URL url) {
        Companion.setProxyURL(url);
    }

    public static final void setSharedInstance$purchases_defaultsBc8Release(Purchases purchases) {
        Companion.setSharedInstance$purchases_defaultsBc8Release(purchases);
    }

    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Purchases purchases, Activity activity, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = u.e(InAppMessageType.BILLING_ISSUES);
        }
        purchases.showInAppMessagesIfNeeded(activity, list);
    }

    public static /* synthetic */ void syncPurchases$default(Purchases purchases, SyncPurchasesCallback syncPurchasesCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchases.syncPurchases(syncPurchasesCallback);
    }

    public static /* synthetic */ void trackCustomPaywallImpression$default(Purchases purchases, CustomPaywallImpressionParams customPaywallImpressionParams, int i, Object obj) {
        if ((i & 1) != 0) {
            customPaywallImpressionParams = new CustomPaywallImpressionParams(null, null, 3, null);
        }
        purchases.trackCustomPaywallImpression(customPaywallImpressionParams);
    }

    public final void close() {
        this.purchasesOrchestrator.close();
        backingFieldSharedInstance = null;
    }

    public final void collectDeviceIdentifiers() {
        this.purchasesOrchestrator.collectDeviceIdentifiers();
    }

    @InternalRevenueCatAPI
    public final void createSupportTicket(String str, String str2, Qa.l lVar, Qa.l lVar2) {
        t.g(str, "email");
        t.g(str2, "description");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        this.purchasesOrchestrator.createSupportTicket(str, str2, lVar, lVar2);
    }

    public final /* synthetic */ AdTracker getAdTracker() {
        return this.purchasesOrchestrator.getAdTracker();
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        return this.purchasesOrchestrator.getAllowSharingPlayStoreAccount();
    }

    public final void getAmazonLWAConsentStatus(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
        t.g(getAmazonLWAConsentStatusCallback, "callback");
        this.purchasesOrchestrator.getAmazonLWAConsentStatus(getAmazonLWAConsentStatusCallback);
    }

    public final synchronized String getAppUserID() {
        return this.purchasesOrchestrator.getAppUserID();
    }

    @InternalRevenueCatAPI
    public final DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        t.g(name, "fontInfo");
        return this.purchasesOrchestrator.getCachedFontFamilyOrStartDownload(name);
    }

    public final VirtualCurrencies getCachedVirtualCurrencies() {
        return this.purchasesOrchestrator.getCachedVirtualCurrencies();
    }

    public final PurchasesConfiguration getCurrentConfiguration() {
        return this.purchasesOrchestrator.getCurrentConfiguration();
    }

    public final void getCustomerCenterConfigData$purchases_defaultsBc8Release(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
        t.g(getCustomerCenterConfigCallback, "callback");
        this.purchasesOrchestrator.getCustomerCenterConfig(getCustomerCenterConfigCallback);
    }

    public final CustomerCenterListener getCustomerCenterListener() {
        return this.purchasesOrchestrator.getCustomerCenterListener();
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        t.g(receiveCustomerInfoCallback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(CacheFetchPolicy.Companion.default(), true, receiveCustomerInfoCallback);
    }

    public final /* synthetic */ DebugEventListener getDebugEventListener() {
        return this.purchasesOrchestrator.getDebugEventListener();
    }

    public final /* synthetic */ FileRepository getFileRepository() {
        return this.purchasesOrchestrator.getFileRepository();
    }

    public final synchronized boolean getFinishTransactions() {
        return this.purchasesOrchestrator.getFinishTransactions();
    }

    @Ca.e
    public final void getNonSubscriptionSkus(List list, GetStoreProductsCallback getStoreProductsCallback) {
        t.g(list, "productIds");
        t.g(getStoreProductsCallback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(D.Q0(list), X.a(ProductType.INAPP), getStoreProductsCallback);
    }

    public final void getOfferings(ReceiveOfferingsCallback receiveOfferingsCallback) {
        t.g(receiveOfferingsCallback, "listener");
        PurchasesOrchestrator.getOfferings$default(this.purchasesOrchestrator, receiveOfferingsCallback, false, 2, null);
    }

    public final synchronized String getPreferredUILocaleOverride() {
        return this.purchasesOrchestrator.getPreferredUILocaleOverride();
    }

    public final void getProducts(List list, GetStoreProductsCallback getStoreProductsCallback) {
        t.g(list, "productIds");
        t.g(getStoreProductsCallback, "callback");
        getProducts(list, null, getStoreProductsCallback);
    }

    public final synchronized PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.purchasesOrchestrator.getFinishTransactions() ? PurchasesAreCompletedBy.REVENUECAT : PurchasesAreCompletedBy.MY_APP;
    }

    public final /* synthetic */ PurchasesOrchestrator getPurchasesOrchestrator$purchases_defaultsBc8Release() {
        return this.purchasesOrchestrator;
    }

    public final Store getStore() {
        return this.purchasesOrchestrator.getStore();
    }

    public final synchronized String getStorefrontCountryCode() {
        return this.purchasesOrchestrator.getStorefrontCountryCode();
    }

    public final Locale getStorefrontLocale() {
        return this.purchasesOrchestrator.getStorefrontLocale();
    }

    @Ca.e
    public final void getSubscriptionSkus(List list, GetStoreProductsCallback getStoreProductsCallback) {
        t.g(list, "productIds");
        t.g(getStoreProductsCallback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(D.Q0(list), X.a(ProductType.SUBS), getStoreProductsCallback);
    }

    public final /* synthetic */ TrackedEventListener getTrackedEventListener() {
        return this.purchasesOrchestrator.getTrackedEventListener();
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.purchasesOrchestrator.getUpdatedCustomerInfoListener();
    }

    public final void getVirtualCurrencies(GetVirtualCurrenciesCallback getVirtualCurrenciesCallback) {
        t.g(getVirtualCurrenciesCallback, "callback");
        this.purchasesOrchestrator.getVirtualCurrencies(getVirtualCurrenciesCallback);
    }

    public final void invalidateCustomerInfoCache() {
        this.purchasesOrchestrator.invalidateCustomerInfoCache();
    }

    public final void invalidateVirtualCurrenciesCache() {
        this.purchasesOrchestrator.invalidateVirtualCurrenciesCache();
    }

    public final boolean isAnonymous() {
        return this.purchasesOrchestrator.isAnonymous();
    }

    public final void logIn(String str) {
        t.g(str, "newAppUserID");
        logIn$default(this, str, null, 2, null);
    }

    public final void logOut() {
        logOut$default(this, null, 1, null);
    }

    @Ca.e
    public void onAppBackgrounded() {
        this.purchasesOrchestrator.onAppBackgrounded();
    }

    @Ca.e
    public void onAppForegrounded() {
        this.purchasesOrchestrator.onAppForegrounded();
    }

    public final boolean overridePreferredUILocale(String str) {
        return this.purchasesOrchestrator.overridePreferredUILocale(str);
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback purchaseCallback) {
        t.g(purchaseParams, "purchaseParams");
        t.g(purchaseCallback, "callback");
        this.purchasesOrchestrator.purchase(purchaseParams, purchaseCallback);
    }

    @Ca.e
    public final void purchasePackage(Activity activity, Package r3, PurchaseCallback purchaseCallback) {
        t.g(activity, "activity");
        t.g(r3, "packageToPurchase");
        t.g(purchaseCallback, "listener");
        purchase(new PurchaseParams.Builder(activity, r3).build(), purchaseCallback);
    }

    @Ca.e
    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, PurchaseCallback purchaseCallback) {
        t.g(activity, "activity");
        t.g(storeProduct, "storeProduct");
        t.g(purchaseCallback, "callback");
        purchase(new PurchaseParams.Builder(activity, storeProduct).build(), purchaseCallback);
    }

    public final void redeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener redeemWebPurchaseListener) {
        t.g(webPurchaseRedemption, "webPurchaseRedemption");
        t.g(redeemWebPurchaseListener, "listener");
        this.purchasesOrchestrator.redeemWebPurchase(webPurchaseRedemption, redeemWebPurchaseListener);
    }

    public final void removeUpdatedCustomerInfoListener() {
        this.purchasesOrchestrator.removeUpdatedCustomerInfoListener();
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        t.g(receiveCustomerInfoCallback, "callback");
        this.purchasesOrchestrator.restorePurchases(receiveCustomerInfoCallback);
    }

    public final void setAd(String str) {
        this.purchasesOrchestrator.setAd(str);
    }

    public final void setAdGroup(String str) {
        this.purchasesOrchestrator.setAdGroup(str);
    }

    public final void setAdjustID(String str) {
        this.purchasesOrchestrator.setAdjustID(str);
    }

    public final void setAirbridgeDeviceID(String str) {
        this.purchasesOrchestrator.setAirbridgeDeviceID(str);
    }

    public final void setAirshipChannelID(String str) {
        this.purchasesOrchestrator.setAirshipChannelID(str);
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z) {
        this.purchasesOrchestrator.setAllowSharingPlayStoreAccount(z);
    }

    public final void setAppsFlyerConversionData(Map map) {
        this.purchasesOrchestrator.setAppsFlyerConversionData(map);
    }

    public final void setAppsflyerID(String str) {
        this.purchasesOrchestrator.setAppsflyerID(str);
    }

    public final void setAppstackAttributionParams(Map map, SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsCallback) {
        t.g(map, "data");
        t.g(syncAttributesAndOfferingsCallback, "callback");
        this.purchasesOrchestrator.setAppstackAttributionParams(map, syncAttributesAndOfferingsCallback);
    }

    public final void setAttributes(Map map) {
        t.g(map, "attributes");
        this.purchasesOrchestrator.setAttributes(map);
    }

    public final void setCampaign(String str) {
        this.purchasesOrchestrator.setCampaign(str);
    }

    public final void setCleverTapID(String str) {
        this.purchasesOrchestrator.setCleverTapID(str);
    }

    public final void setCreative(String str) {
        this.purchasesOrchestrator.setCreative(str);
    }

    public final void setCustomerCenterListener(CustomerCenterListener customerCenterListener) {
        this.purchasesOrchestrator.setCustomerCenterListener(customerCenterListener);
    }

    public final /* synthetic */ void setDebugEventListener(DebugEventListener debugEventListener) {
        this.purchasesOrchestrator.setDebugEventListener(debugEventListener);
    }

    public final void setDisplayName(String str) {
        this.purchasesOrchestrator.setDisplayName(str);
    }

    public final void setEmail(String str) {
        this.purchasesOrchestrator.setEmail(str);
    }

    public final void setFBAnonymousID(String str) {
        this.purchasesOrchestrator.setFBAnonymousID(str);
    }

    public final synchronized void setFinishTransactions(boolean z) {
        this.purchasesOrchestrator.setFinishTransactions(z);
    }

    public final void setFirebaseAppInstanceID(String str) {
        this.purchasesOrchestrator.setFirebaseAppInstanceID(str);
    }

    public final void setKeyword(String str) {
        this.purchasesOrchestrator.setKeyword(str);
    }

    public final void setKochavaDeviceID(String str) {
        this.purchasesOrchestrator.setKochavaDeviceID(str);
    }

    public final void setMediaSource(String str) {
        this.purchasesOrchestrator.setMediaSource(str);
    }

    public final void setMixpanelDistinctID(String str) {
        this.purchasesOrchestrator.setMixpanelDistinctID(str);
    }

    public final void setMparticleID(String str) {
        this.purchasesOrchestrator.setMparticleID(str);
    }

    public final void setOnesignalID(String str) {
        this.purchasesOrchestrator.setOnesignalID(str);
    }

    public final void setOnesignalUserID(String str) {
        this.purchasesOrchestrator.setOnesignalUserID(str);
    }

    public final void setPhoneNumber(String str) {
        this.purchasesOrchestrator.setPhoneNumber(str);
    }

    public final void setPostHogUserId(String str) {
        this.purchasesOrchestrator.setPostHogUserId(str);
    }

    public final synchronized void setPurchasesAreCompletedBy(PurchasesAreCompletedBy purchasesAreCompletedBy) {
        try {
            t.g(purchasesAreCompletedBy, "value");
            PurchasesOrchestrator purchasesOrchestrator = this.purchasesOrchestrator;
            int i = WhenMappings.$EnumSwitchMapping$0[purchasesAreCompletedBy.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    throw new o();
                }
                z = false;
            }
            purchasesOrchestrator.setFinishTransactions(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setPushToken(String str) {
        this.purchasesOrchestrator.setPushToken(str);
    }

    public final void setSolarEngineAccountId(String str) {
        this.purchasesOrchestrator.setSolarEngineAccountId(str);
    }

    public final void setSolarEngineDistinctId(String str) {
        this.purchasesOrchestrator.setSolarEngineDistinctId(str);
    }

    public final void setSolarEngineVisitorId(String str) {
        this.purchasesOrchestrator.setSolarEngineVisitorId(str);
    }

    public final void setTenjinAnalyticsInstallationID(String str) {
        this.purchasesOrchestrator.setTenjinAnalyticsInstallationID(str);
    }

    public final /* synthetic */ void setTrackedEventListener(TrackedEventListener trackedEventListener) {
        this.purchasesOrchestrator.setTrackedEventListener(trackedEventListener);
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.purchasesOrchestrator.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity) {
        t.g(activity, "activity");
        showInAppMessagesIfNeeded$default(this, activity, null, 2, null);
    }

    @Ca.e
    public final void syncAmazonPurchase(String str, String str2, String str3, String str4, Double d) {
        t.g(str, "productID");
        t.g(str2, "receiptID");
        t.g(str3, "amazonUserID");
        this.purchasesOrchestrator.syncAmazonPurchase(str, str2, str3, str4, d, null);
    }

    public final void syncAttributesAndOfferingsIfNeeded(SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsCallback) {
        t.g(syncAttributesAndOfferingsCallback, "callback");
        this.purchasesOrchestrator.syncAttributesAndOfferingsIfNeeded(syncAttributesAndOfferingsCallback);
    }

    @Ca.e
    public final void syncObserverModeAmazonPurchase(String str, String str2, String str3, String str4, Double d) {
        t.g(str, "productID");
        t.g(str2, "receiptID");
        t.g(str3, "amazonUserID");
        syncAmazonPurchase(str, str2, str3, str4, d);
    }

    public final void syncPurchases() {
        syncPurchases$default(this, null, 1, null);
    }

    @InternalRevenueCatAPI
    public final /* synthetic */ void track(FeatureEvent featureEvent) {
        t.g(featureEvent, "event");
        this.purchasesOrchestrator.track(featureEvent);
    }

    public final void trackCustomPaywallImpression() {
        trackCustomPaywallImpression$default(this, null, 1, null);
    }

    public static final void canMakePayments(Context context, List list, Callback callback) {
        Companion.canMakePayments(context, list, callback);
    }

    public static final WebPurchaseRedemption parseAsWebPurchaseRedemption(String str) {
        return Companion.parseAsWebPurchaseRedemption(str);
    }

    public final void getCustomerInfo(CacheFetchPolicy cacheFetchPolicy, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        t.g(cacheFetchPolicy, "fetchPolicy");
        t.g(receiveCustomerInfoCallback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(cacheFetchPolicy, true, receiveCustomerInfoCallback);
    }

    public final void getProducts(List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback) {
        t.g(list, "productIds");
        t.g(getStoreProductsCallback, "callback");
        this.purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    public final void getStorefrontCountryCode(GetStorefrontCallback getStorefrontCallback) {
        t.g(getStorefrontCallback, "callback");
        this.purchasesOrchestrator.getStorefrontCountryCode(getStorefrontCallback);
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public final void getStorefrontLocale(GetStorefrontLocaleCallback getStorefrontLocaleCallback) {
        t.g(getStorefrontLocaleCallback, "callback");
        this.purchasesOrchestrator.getStorefrontLocale(getStorefrontLocaleCallback);
    }

    public final void logIn(String str, LogInCallback logInCallback) {
        t.g(str, "newAppUserID");
        this.purchasesOrchestrator.logIn(str, logInCallback);
    }

    public final void logOut(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List list) {
        t.g(activity, "activity");
        t.g(list, "inAppMessageTypes");
        this.purchasesOrchestrator.showInAppMessagesIfNeeded(activity, list);
    }

    public final void syncAmazonPurchase(String str, String str2, String str3, String str4, Double d, long j) {
        t.g(str, "productID");
        t.g(str2, "receiptID");
        t.g(str3, "amazonUserID");
        this.purchasesOrchestrator.syncAmazonPurchase(str, str2, str3, str4, d, Long.valueOf(j));
    }

    public final void syncPurchases(SyncPurchasesCallback syncPurchasesCallback) {
        this.purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    public final void trackCustomPaywallImpression(CustomPaywallImpressionParams customPaywallImpressionParams) {
        t.g(customPaywallImpressionParams, "params");
        PurchasesOrchestrator purchasesOrchestrator = this.purchasesOrchestrator;
        String paywallId = customPaywallImpressionParams.getPaywallId();
        String offeringId = customPaywallImpressionParams.getOfferingId();
        if (offeringId == null) {
            offeringId = this.purchasesOrchestrator.getCachedCurrentOfferingIdentifier();
        }
        purchasesOrchestrator.track(new CustomPaywallEvent.Impression(null, new CustomPaywallEvent.Impression.Data(paywallId, offeringId), 1, null));
    }
}

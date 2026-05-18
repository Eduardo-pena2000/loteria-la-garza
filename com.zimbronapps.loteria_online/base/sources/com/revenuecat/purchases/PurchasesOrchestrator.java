package com.revenuecat.purchases;

import Ca.I;
import Da.D;
import Da.Q;
import Da.S;
import Da.X;
import Da.Y;
import Da.Z;
import Da.v;
import Da.w;
import Qa.p;
import T4.d;
import ab.b;
import android.app.Activity;
import android.app.Application;
import android.app.backup.BackupManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.E;
import androidx.lifecycle.r;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.revenuecat.purchases.APIKeyValidator;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.ads.events.AdTracker;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DefaultLocaleProvider;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontLocaleCallback;
import com.revenuecat.purchases.interfaces.GetVirtualCurrenciesCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.GalaxyReplacementMode;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import com.revenuecat.purchases.paywalls.FontLoader;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.storage.DefaultFileRepository;
import com.revenuecat.purchases.storage.FileRepository;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CustomActivityLifecycleHandler;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import com.revenuecat.purchases.utils.RateLimiter;
import com.revenuecat.purchases.utils.Result;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencyManager;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator implements LifecycleDelegate, CustomActivityLifecycleHandler {
    private static T4.d cachedImageLoader = null;
    public static final String frameworkVersion = "9.26.1";
    private static URL proxyURL;
    private volatile String _preferredUILocaleOverride;
    private final EventsManager adEventsManager;
    private final AdTracker adTracker;
    private AppConfig appConfig;
    private final Application application;
    private final Backend backend;
    private final BackupManager backupManager;
    private final BillingAbstract billing;
    private final BlockstoreHelper blockstoreHelper;
    private CustomerCenterListener customerCenterListener;
    private final CustomerInfoHelper customerInfoHelper;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsSynchronizer diagnosticsSynchronizer;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Dispatcher dispatcher;
    private final EventsManager eventsManager;
    private final FileRepository fileRepository;
    private final FontLoader fontLoader;
    private final IdentityManager identityManager;
    private final PurchasesConfiguration initialConfiguration;
    private final RateLimiter lastSyncAttributesAndOfferingsRateLimiter;
    private final Ca.l lifecycleHandler$delegate;
    private final DefaultLocaleProvider localeProvider;
    private final Handler mainHandler;
    private final OfferingsManager offeringsManager;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final PostReceiptHelper postReceiptHelper;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;
    private final RateLimiter preferredLocaleOverrideRateLimiter;
    private final Qa.a processLifecycleOwnerProvider;
    private final PurchaseParamsValidator purchaseParamsValidator;
    private final PurchasesStateCache purchasesStateCache;
    private String storefrontCountryCode;
    private final SubscriberAttributesManager subscriberAttributesManager;
    private final SyncPurchasesHelper syncPurchasesHelper;
    private TrackedEventListener trackedEventListener;
    private final VirtualCurrencyManager virtualCurrencyManager;
    private final WebPurchaseRedemptionHelper webPurchaseRedemptionHelper;
    public static final Companion Companion = new Companion(null);
    private static PlatformInfo platformInfo = new PlatformInfo("native", null);

    public static final class 1 extends u implements Qa.a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final r invoke() {
            r l = E.l();
            t.f(l, "get()");
            return l;
        }
    }

    public static final class 2 implements BillingAbstract.StateListener {
        public 2() {
        }

        public void onConnected() {
            PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.access$getPostPendingTransactionsHelper$p(PurchasesOrchestrator.this), PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, 2, null);
            PurchasesOrchestrator.access$getBilling$p(PurchasesOrchestrator.this).getStorefront(new PurchasesOrchestrator$2$onConnected$1(PurchasesOrchestrator.this), PurchasesOrchestrator$2$onConnected$2.INSTANCE);
        }
    }

    public static final class 3 extends u implements Qa.a {
        public 3() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            ((r) PurchasesOrchestrator.this.getProcessLifecycleOwnerProvider().invoke()).getLifecycle().addObserver(PurchasesOrchestrator.access$getLifecycleHandler(PurchasesOrchestrator.this));
            PurchasesOrchestrator.access$getApplication$p(PurchasesOrchestrator.this).registerActivityLifecycleCallbacks(PurchasesOrchestrator.this);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(BillingResult billingResult, List list) {
            canMakePayments$lambda$0(billingResult, list);
        }

        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i, Object obj) {
            if ((i & 2) != 0) {
                list = v.n();
            }
            companion.canMakePayments(context, list, callback);
        }

        private static final void canMakePayments$lambda$0(BillingResult billingResult, List list) {
            t.g(billingResult, "<anonymous parameter 0>");
        }

        public final void canMakePayments(Context context, List list, Callback callback) {
            t.g(context, "context");
            t.g(list, "features");
            t.g(callback, "callback");
            BillingClient build = BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new j()).build();
            build.startConnection(new PurchasesOrchestrator$Companion$canMakePayments$2$1(new Handler(context.getMainLooper()), new AtomicBoolean(false), callback, build, list));
        }

        public final boolean getDebugLogsEnabled() {
            return LogUtilsKt.getDebugLogsEnabled(getLogLevel());
        }

        public final synchronized T4.d getImageLoader(Context context) {
            T4.d access$getCachedImageLoader$cp;
            t.g(context, "context");
            access$getCachedImageLoader$cp = PurchasesOrchestrator.access$getCachedImageLoader$cp();
            if (access$getCachedImageLoader$cp == null) {
                access$getCachedImageLoader$cp = new d.a(context).d(new PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1(context, "revenuecatui_cache", 26214400L)).b();
                PurchasesOrchestrator.access$setCachedImageLoader$cp(access$getCachedImageLoader$cp);
            }
            return access$getCachedImageLoader$cp;
        }

        public final synchronized LogHandler getLogHandler() {
            return LogWrapperKt.getCurrentLogHandler();
        }

        public final LogLevel getLogLevel() {
            return Config.INSTANCE.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.access$getPlatformInfo$cp();
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.access$getProxyURL$cp();
        }

        public final void setDebugLogsEnabled(boolean z) {
            setLogLevel(LogUtilsKt.debugLogsEnabled(LogLevel.Companion, z));
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            t.g(logHandler, "value");
            LogWrapperKt.setCurrentLogHandler(logHandler);
        }

        public final void setLogLevel(LogLevel logLevel) {
            t.g(logLevel, "value");
            Config.INSTANCE.setLogLevel(logLevel);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            t.g(platformInfo, "<set-?>");
            PurchasesOrchestrator.access$setPlatformInfo$cp(platformInfo);
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.access$setProxyURL$cp(url);
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.GALAXY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 2 implements ReceiveOfferingsCallback {
        final /* synthetic */ p $callback;

        public 2(p pVar) {
            this.$callback = pVar;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$callback.invoke((Object) null, purchasesError);
        }

        public void onReceived(Offerings offerings) {
            t.g(offerings, "offerings");
            this.$callback.invoke(offerings, (Object) null);
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
            ((r) PurchasesOrchestrator.this.getProcessLifecycleOwnerProvider().invoke()).getLifecycle().removeObserver(PurchasesOrchestrator.access$getLifecycleHandler(PurchasesOrchestrator.this));
        }
    }

    public static final class 1 implements PurchaseCallback {
        final /* synthetic */ PurchaseCallback $originalCallback;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ Date $startTime;

        public 1(PurchasingData purchasingData, Date date, PurchaseCallback purchaseCallback) {
            this.$purchasingData = purchasingData;
            this.$startTime = date;
            this.$originalCallback = purchaseCallback;
        }

        public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            t.g(storeTransaction, "storeTransaction");
            t.g(customerInfo, "customerInfo");
            PurchasesOrchestrator.access$trackPurchaseResultIfNeeded(PurchasesOrchestrator.this, this.$purchasingData, null, this.$startTime, customerInfo.getEntitlements().getVerification());
            this.$originalCallback.onCompleted(storeTransaction, customerInfo);
        }

        public void onError(PurchasesError purchasesError, boolean z) {
            t.g(purchasesError, "error");
            PurchasesOrchestrator.access$trackPurchaseResultIfNeeded(PurchasesOrchestrator.this, this.$purchasingData, purchasesError, this.$startTime, null);
            this.$originalCallback.onError(purchasesError, z);
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ PurchaseErrorCallback $this_dispatch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
            super(0);
            this.$this_dispatch = purchaseErrorCallback;
            this.$error = purchasesError;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            PurchaseErrorCallback purchaseErrorCallback = this.$this_dispatch;
            PurchasesError purchasesError = this.$error;
            purchaseErrorCallback.onError(purchasesError, purchasesError.getCode() == PurchasesErrorCode.PurchaseCancelledError);
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ GetAmazonLWAConsentStatusCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
            super(1);
            this.$callback = getAmazonLWAConsentStatusCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AmazonLWAConsentStatus) obj);
            return I.a;
        }

        public final void invoke(AmazonLWAConsentStatus amazonLWAConsentStatus) {
            t.g(amazonLWAConsentStatus, "it");
            this.$callback.onSuccess(amazonLWAConsentStatus);
        }
    }

    public static final class 2 extends u implements Qa.l {
        final /* synthetic */ GetAmazonLWAConsentStatusCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
            super(1);
            this.$callback = getAmazonLWAConsentStatusCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "it");
            this.$callback.onError(purchasesError);
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ GetCustomerCenterConfigCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
            super(1);
            this.$callback = getCustomerCenterConfigCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerCenterConfigData) obj);
            return I.a;
        }

        public final void invoke(CustomerCenterConfigData customerCenterConfigData) {
            t.g(customerCenterConfigData, "config");
            this.$callback.onSuccess(customerCenterConfigData);
        }
    }

    public static final class 2 extends u implements Qa.l {
        final /* synthetic */ GetCustomerCenterConfigCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
            super(1);
            this.$callback = getCustomerCenterConfigCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$callback.onError(purchasesError);
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "it");
            this.$listener.onError(purchasesError);
        }
    }

    public static final class 2 extends u implements Qa.l {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return I.a;
        }

        public final void invoke(Offerings offerings) {
            t.g(offerings, "it");
            this.$listener.onReceived(offerings);
        }
    }

    public static final class 1 implements GetStoreProductsCallback {
        final /* synthetic */ GetStoreProductsCallback $callback;
        final /* synthetic */ Map $requestedBasePlansByProductId;

        public 1(Map map, GetStoreProductsCallback getStoreProductsCallback) {
            this.$requestedBasePlansByProductId = map;
            this.$callback = getStoreProductsCallback;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$callback.onError(purchasesError);
        }

        public void onReceived(List list) {
            boolean z;
            t.g(list, "storeProducts");
            if (!this.$requestedBasePlansByProductId.isEmpty()) {
                Map map = this.$requestedBasePlansByProductId;
                List arrayList = new ArrayList();
                for (Object obj : list) {
                    StoreProduct storeProduct = (StoreProduct) obj;
                    Iterable iterable = (Set) map.get(storeProduct.getPurchasingData().getProductId());
                    if (iterable != null) {
                        Iterable iterable2 = iterable;
                        GoogleStoreProduct googleStoreProduct = storeProduct instanceof GoogleStoreProduct ? (GoogleStoreProduct) storeProduct : null;
                        z = D.Y(iterable2, googleStoreProduct != null ? googleStoreProduct.getBasePlanId() : null);
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            this.$callback.onReceived(list);
        }
    }

    public static final class 1 implements BillingAbstract.PurchasesUpdatedListener {
        public 1() {
        }

        public void onPurchasesFailedToUpdate(PurchasesError purchasesError) {
            I i;
            t.g(purchasesError, "purchasesError");
            PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
            synchronized (purchasesOrchestrator) {
                try {
                    ProductChangeCallback access$getAndClearProductChangeCallback = PurchasesOrchestrator.access$getAndClearProductChangeCallback(purchasesOrchestrator);
                    if (access$getAndClearProductChangeCallback != null) {
                        PurchasesOrchestrator.access$dispatch(purchasesOrchestrator, access$getAndClearProductChangeCallback, purchasesError);
                        i = I.a;
                    } else {
                        i = null;
                    }
                    if (i == null) {
                        Iterator it = PurchasesOrchestrator.access$getAndClearAllPurchaseCallbacks(purchasesOrchestrator).iterator();
                        while (it.hasNext()) {
                            PurchasesOrchestrator.access$dispatch(purchasesOrchestrator, (PurchaseCallback) it.next(), purchasesError);
                        }
                    }
                    I i2 = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0016 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:40:0x000b, B:16:0x0054, B:18:0x005e, B:19:0x006b, B:28:0x0067, B:5:0x0016, B:6:0x001a, B:8:0x0020, B:10:0x002c, B:29:0x0033, B:30:0x0037, B:32:0x003d), top: B:39:0x000b }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPurchasesUpdated(java.util.List r10) {
            /*
                r9 = this;
                java.lang.String r0 = "purchases"
                kotlin.jvm.internal.t.g(r10, r0)
                com.revenuecat.purchases.PurchasesOrchestrator r0 = com.revenuecat.purchases.PurchasesOrchestrator.this
                monitor-enter(r0)
                r1 = 1
                if (r10 == 0) goto L16
                boolean r2 = r10.isEmpty()     // Catch: java.lang.Throwable -> L13
                if (r2 == 0) goto L16
            L11:
                r6 = r1
                goto L54
            L13:
                r10 = move-exception
                goto L99
            L16:
                java.util.Iterator r2 = r10.iterator()     // Catch: java.lang.Throwable -> L13
            L1a:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L13
                if (r3 == 0) goto L11
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L13
                com.revenuecat.purchases.models.StoreTransaction r3 = (com.revenuecat.purchases.models.StoreTransaction) r3     // Catch: java.lang.Throwable -> L13
                java.util.List r3 = r3.getProductIds()     // Catch: java.lang.Throwable -> L13
                if (r3 == 0) goto L33
                boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L13
                if (r4 == 0) goto L33
                goto L52
            L33:
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L13
            L37:
                boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L13
                if (r4 == 0) goto L52
                java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L13
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L13
                com.revenuecat.purchases.PurchasesState r5 = r0.getState$purchases_defaultsBc8Release()     // Catch: java.lang.Throwable -> L13
                java.util.Map r5 = r5.getPurchaseCallbacksByProductId()     // Catch: java.lang.Throwable -> L13
                boolean r4 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L13
                if (r4 == 0) goto L37
                goto L1a
            L52:
                r1 = 0
                goto L11
            L54:
                com.revenuecat.purchases.PurchasesState r1 = r0.getState$purchases_defaultsBc8Release()     // Catch: java.lang.Throwable -> L13
                com.revenuecat.purchases.interfaces.ProductChangeCallback r1 = r1.getDeprecatedProductChangeCallback()     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L67
                com.revenuecat.purchases.interfaces.ProductChangeCallback r1 = com.revenuecat.purchases.PurchasesOrchestrator.access$getAndClearProductChangeCallback(r0)     // Catch: java.lang.Throwable -> L13
                android.util.Pair r1 = com.revenuecat.purchases.PurchasesOrchestrator.access$getProductChangeCompletedCallbacks(r0, r1)     // Catch: java.lang.Throwable -> L13
                goto L6b
            L67:
                android.util.Pair r1 = com.revenuecat.purchases.PurchasesOrchestrator.access$getPurchaseCompletedCallbacks(r0)     // Catch: java.lang.Throwable -> L13
            L6b:
                Ca.I r2 = Ca.I.a     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)
                com.revenuecat.purchases.PurchasesOrchestrator r0 = com.revenuecat.purchases.PurchasesOrchestrator.this
                com.revenuecat.purchases.PostTransactionWithProductDetailsHelper r0 = com.revenuecat.purchases.PurchasesOrchestrator.access$getPostTransactionWithProductDetailsHelper$p(r0)
                com.revenuecat.purchases.PurchasesOrchestrator r2 = com.revenuecat.purchases.PurchasesOrchestrator.this
                boolean r3 = r2.getAllowSharingPlayStoreAccount()
                com.revenuecat.purchases.PurchasesOrchestrator r2 = com.revenuecat.purchases.PurchasesOrchestrator.this
                java.lang.String r4 = r2.getAppUserID()
                com.revenuecat.purchases.PostReceiptInitiationSource r5 = com.revenuecat.purchases.PostReceiptInitiationSource.PURCHASE
                java.lang.Object r2 = r1.first
                r7 = r2
                Qa.p r7 = (Qa.p) r7
                java.lang.Object r1 = r1.second
                r8 = r1
                Qa.p r8 = (Qa.p) r8
                r1 = r0
                r2 = r10
                r1.postTransactions(r2, r3, r4, r5, r6, r7, r8)
                com.revenuecat.purchases.PurchasesOrchestrator r10 = com.revenuecat.purchases.PurchasesOrchestrator.this
                com.revenuecat.purchases.common.Delay r0 = com.revenuecat.purchases.common.Delay.NONE
                com.revenuecat.purchases.PurchasesOrchestrator.access$flushEvents(r10, r0)
                return
            L99:
                monitor-exit(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator.getPurchasesUpdatedListener.1.onPurchasesUpdated(java.util.List):void");
        }
    }

    public static final class 1 implements GetStorefrontCallback {
        final /* synthetic */ GetStorefrontLocaleCallback $callback;

        public 1(GetStorefrontLocaleCallback getStorefrontLocaleCallback) {
            this.$callback = getStorefrontLocaleCallback;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$callback.onError(purchasesError);
        }

        public void onReceived(String str) {
            t.g(str, "storefrontCountryCode");
            GetStorefrontLocaleCallback getStorefrontLocaleCallback = this.$callback;
            Locale build = new Locale.Builder().setRegion(str).build();
            t.f(build, "Builder().setRegion(storefrontCountryCode).build()");
            getStorefrontLocaleCallback.onReceived(build);
        }
    }

    public static final class 3 extends u implements Qa.l {
        final /* synthetic */ LogInCallback $callback;

        public static final class 1 extends u implements Qa.a {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(LogInCallback logInCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = logInCallback;
                this.$customerInfo = customerInfo;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onReceived(this.$customerInfo, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            PurchasesOrchestrator.access$dispatch(PurchasesOrchestrator.this, new 1(this.$callback, customerInfo));
        }
    }

    public static final class 4 extends u implements Qa.l {
        final /* synthetic */ LogInCallback $callback;

        public static final class 1 extends u implements Qa.a {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(LogInCallback logInCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = logInCallback;
                this.$error = purchasesError;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onError(this.$error);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            PurchasesOrchestrator.access$dispatch(PurchasesOrchestrator.this, new 1(this.$callback, purchasesError));
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesOrchestrator purchasesOrchestrator) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.this$0 = purchasesOrchestrator;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(purchasesError);
                    return;
                }
                return;
            }
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            synchronized (purchasesOrchestrator) {
                PurchasesState state$purchases_defaultsBc8Release = purchasesOrchestrator.getState$purchases_defaultsBc8Release();
                Map emptyMap = Collections.emptyMap();
                t.f(emptyMap, "emptyMap()");
                purchasesOrchestrator.setState$purchases_defaultsBc8Release(PurchasesState.copy$default(state$purchases_defaultsBc8Release, null, emptyMap, null, false, false, 29, null));
                I i = I.a;
            }
            PurchasesOrchestrator purchasesOrchestrator2 = this.this$0;
            PurchasesOrchestrator.access$updateAllCaches(purchasesOrchestrator2, PurchasesOrchestrator.access$getIdentityManager$p(purchasesOrchestrator2).getCurrentAppUserID(), this.$callback);
            PurchasesOrchestrator.access$getBackupManager$p(this.this$0).dataChanged();
        }
    }

    public static final class 3 extends u implements Qa.a {
        final /* synthetic */ J $firstTimeInForeground;

        public static final class 2 implements ReceiveCustomerInfoCallback {
            final /* synthetic */ PurchasesOrchestrator this$0;

            public 2(PurchasesOrchestrator purchasesOrchestrator) {
                this.this$0 = purchasesOrchestrator;
            }

            public void onError(PurchasesError purchasesError) {
                t.g(purchasesError, "error");
            }

            public void onReceived(CustomerInfo customerInfo) {
                t.g(customerInfo, "customerInfo");
                PurchasesOrchestrator.access$getBlockstoreHelper$p(this.this$0).storeUserIdIfNeeded(customerInfo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(J j) {
            super(0);
            this.$firstTimeInForeground = j;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            DiagnosticsSynchronizer access$getDiagnosticsSynchronizer$p;
            LogHandler currentLogHandler;
            String str;
            String str2;
            if (PurchasesOrchestrator.this.getAppConfig().getUiPreviewMode()) {
                return;
            }
            if (PurchasesOrchestrator.access$shouldRefreshCustomerInfo(PurchasesOrchestrator.this, this.$firstTimeInForeground.a)) {
                LogIntent logIntent = LogIntent.DEBUG;
                PurchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1 purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1 = new PurchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$3$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                CustomerInfoHelper.retrieveCustomerInfo$default(PurchasesOrchestrator.access$getCustomerInfoHelper$p(PurchasesOrchestrator.this), PurchasesOrchestrator.access$getIdentityManager$p(PurchasesOrchestrator.this).getCurrentAppUserID(), CacheFetchPolicy.FETCH_CURRENT, false, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), false, new 2(PurchasesOrchestrator.this), 16, null);
            }
            PurchasesOrchestrator.access$getOfferingsManager$p(PurchasesOrchestrator.this).onAppForeground(PurchasesOrchestrator.access$getIdentityManager$p(PurchasesOrchestrator.this).getCurrentAppUserID());
            PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.access$getPostPendingTransactionsHelper$p(PurchasesOrchestrator.this), PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, 2, null);
            PurchasesOrchestrator.access$synchronizeSubscriberAttributesIfNeeded(PurchasesOrchestrator.this);
            OfflineEntitlementsManager.updateProductEntitlementMappingCacheIfStale$default(PurchasesOrchestrator.this.getOfflineEntitlementsManager(), null, 1, null);
            PurchasesOrchestrator.access$flushEvents(PurchasesOrchestrator.this, Delay.DEFAULT);
            if (this.$firstTimeInForeground.a && AndroidVersionUtilsKt.isAndroidNOrNewer() && (access$getDiagnosticsSynchronizer$p = PurchasesOrchestrator.access$getDiagnosticsSynchronizer$p(PurchasesOrchestrator.this)) != null) {
                access$getDiagnosticsSynchronizer$p.syncDiagnosticsFileIfNeeded();
            }
        }
    }

    public static final class 4 extends u implements p {
        public static final 4 INSTANCE = new 4();

        public 4() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Offerings) obj, (PurchasesError) obj2);
            return I.a;
        }

        public final void invoke(Offerings offerings, PurchasesError purchasesError) {
            if (offerings != null) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Fresh offerings fetch completed successfully");
                    return;
                }
                return;
            }
            LogLevel logLevel2 = LogLevel.DEBUG;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                String str = "[Purchases] - " + logLevel2.name();
                StringBuilder sb = new StringBuilder();
                sb.append("Fresh offerings fetch failed: ");
                sb.append(purchasesError != null ? purchasesError.getMessage() : null);
                currentLogHandler2.d(str, sb.toString());
            }
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ PurchaseCallback $callback;
        final /* synthetic */ Result $purchaseParamsValidationResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PurchaseCallback purchaseCallback, Result result) {
            super(0);
            this.$callback = purchaseCallback;
            this.$purchaseParamsValidationResult = result;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.$callback.onError((PurchasesError) this.$purchaseParamsValidationResult.getValue(), false);
        }
    }

    public static final class 3 extends u implements Qa.l {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ O $previousProductId;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ ReplacementMode $replacementMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(Activity activity, String str, PurchasingData purchasingData, ReplacementMode replacementMode, PresentedOfferingContext presentedOfferingContext, Boolean bool, O o) {
            super(1);
            this.$activity = activity;
            this.$appUserID = str;
            this.$purchasingData = purchasingData;
            this.$replacementMode = replacementMode;
            this.$presentedOfferingContext = presentedOfferingContext;
            this.$isPersonalizedPrice = bool;
            this.$previousProductId = o;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoreTransaction) obj);
            return I.a;
        }

        public final void invoke(StoreTransaction storeTransaction) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(storeTransaction, "purchaseRecord");
            LogIntent logIntent = LogIntent.PURCHASE;
            PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1 purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1 = new PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1(logIntent, this.$previousProductId);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            PurchasesOrchestrator.access$getBilling$p(PurchasesOrchestrator.this).makePurchaseAsync(this.$activity, this.$appUserID, this.$purchasingData, new ReplaceProductInfo(storeTransaction, this.$replacementMode), this.$presentedOfferingContext, this.$isPersonalizedPrice);
        }
    }

    public static final class 4 extends u implements Qa.l {
        final /* synthetic */ PurchaseErrorCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(PurchaseErrorCallback purchaseErrorCallback) {
            super(1);
            this.$listener = purchaseErrorCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(purchasesError, "error");
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1 purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1 = new PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1(logIntent, purchasesError);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            PurchasesOrchestrator.access$getAndClearProductChangeCallback(PurchasesOrchestrator.this);
            PurchasesOrchestrator.access$getAndClearAllPurchaseCallbacks(PurchasesOrchestrator.this);
            PurchasesOrchestrator.access$dispatch(PurchasesOrchestrator.this, this.$listener, purchasesError);
        }
    }

    public static final class 4 extends u implements Qa.a {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callbackWithTracking;

        public static final class 1 extends u implements Qa.l {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ ReceiveCustomerInfoCallback $callbackWithTracking;
            final /* synthetic */ PurchasesOrchestrator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, String str) {
                super(1);
                this.this$0 = purchasesOrchestrator;
                this.$callbackWithTracking = receiveCustomerInfoCallback;
                this.$appUserID = str;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List) obj);
                return I.a;
            }

            public final void invoke(List list) {
                LogHandler currentLogHandler;
                String str;
                String str2;
                t.g(list, "allPurchases");
                if (!list.isEmpty()) {
                    List<StoreTransaction> C0 = D.C0(list, new PurchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$sortedBy$1());
                    PurchasesOrchestrator purchasesOrchestrator = this.this$0;
                    String str3 = this.$appUserID;
                    ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callbackWithTracking;
                    for (StoreTransaction storeTransaction : C0) {
                        PurchasesOrchestrator.access$getPostReceiptHelper$p(purchasesOrchestrator).postTransactionAndConsumeIfNeeded(storeTransaction, null, null, true, str3, PostReceiptInitiationSource.RESTORE, false, new PurchasesOrchestrator$restorePurchases$4$1$3$1$1(C0, storeTransaction, purchasesOrchestrator, receiveCustomerInfoCallback), new PurchasesOrchestrator$restorePurchases$4$1$3$1$2(C0, storeTransaction, purchasesOrchestrator, receiveCustomerInfoCallback));
                    }
                    return;
                }
                LogIntent logIntent = LogIntent.DEBUG;
                PurchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1 purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1 = new PurchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                PurchasesOrchestrator.access$getCustomerInfo(this.this$0, this.$callbackWithTracking);
            }
        }

        public static final class 2 extends u implements Qa.l {
            final /* synthetic */ ReceiveCustomerInfoCallback $callbackWithTracking;
            final /* synthetic */ PurchasesOrchestrator this$0;

            public static final class 1 extends u implements Qa.a {
                final /* synthetic */ ReceiveCustomerInfoCallback $callbackWithTracking;
                final /* synthetic */ PurchasesError $error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                    super(0);
                    this.$callbackWithTracking = receiveCustomerInfoCallback;
                    this.$error = purchasesError;
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return I.a;
                }

                public final void invoke() {
                    this.$callbackWithTracking.onError(this.$error);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
                super(1);
                this.this$0 = purchasesOrchestrator;
                this.$callbackWithTracking = receiveCustomerInfoCallback;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                t.g(purchasesError, "error");
                PurchasesOrchestrator.access$dispatch(this.this$0, new 1(this.$callbackWithTracking, purchasesError));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(0);
            this.$appUserID = str;
            this.$callbackWithTracking = receiveCustomerInfoCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            BillingAbstract access$getBilling$p = PurchasesOrchestrator.access$getBilling$p(PurchasesOrchestrator.this);
            String str = this.$appUserID;
            access$getBilling$p.queryAllPurchases(str, new 1(PurchasesOrchestrator.this, this.$callbackWithTracking, str), new 2(PurchasesOrchestrator.this, this.$callbackWithTracking));
        }
    }

    public static final class 1 extends u implements Qa.a {
        public 1() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            PurchasesOrchestrator.syncPurchases$default(PurchasesOrchestrator.this, null, 1, null);
        }
    }

    public static final class 4 extends u implements Qa.l {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $isoCurrencyCode;
        final /* synthetic */ Double $price;
        final /* synthetic */ Long $purchaseTime;
        final /* synthetic */ String $receiptID;
        final /* synthetic */ PurchasesOrchestrator this$0;

        public static final class 1 extends u implements Qa.l {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return I.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                LogHandler currentLogHandler;
                String str;
                String str2;
                t.g(customerInfo, "it");
                LogIntent logIntent = LogIntent.PURCHASE;
                PurchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1 purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1 = new PurchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1(logIntent, this.$receiptID, this.$amazonUserID);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke(), null);
                        return;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke(), null);
                        return;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke(), null);
                        return;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$1$invoke$$inlined$log$1.invoke(), null);
                        return;
                    default:
                        return;
                }
                currentLogHandler.d(str, str2);
            }
        }

        public static final class 2 extends u implements Qa.l {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                LogHandler currentLogHandler;
                String str;
                String str2;
                t.g(purchasesError, "error");
                LogIntent logIntent = LogIntent.RC_ERROR;
                PurchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1 purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1 = new PurchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1(logIntent, this.$receiptID, this.$amazonUserID, purchasesError);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke(), null);
                        return;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke(), null);
                        return;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke(), null);
                        return;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1.invoke(), null);
                        return;
                    default:
                        return;
                }
                currentLogHandler.d(str, str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(Double d, String str, Long l, String str2, PurchasesOrchestrator purchasesOrchestrator, String str3, String str4) {
            super(1);
            this.$price = d;
            this.$isoCurrencyCode = str;
            this.$purchaseTime = l;
            this.$amazonUserID = str2;
            this.this$0 = purchasesOrchestrator;
            this.$receiptID = str3;
            this.$appUserID = str4;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.a;
        }

        public final void invoke(String str) {
            t.g(str, "normalizedProductID");
            List e = Da.u.e(str);
            Double d = this.$price;
            Double d2 = (d == null || d.doubleValue() == 0.0d) ? null : d;
            String str2 = this.$isoCurrencyCode;
            PostReceiptHelper.postTokenWithoutConsuming$default(PurchasesOrchestrator.access$getPostReceiptHelper$p(this.this$0), this.$receiptID, new ReceiptInfo(e, this.$purchaseTime, null, d2, null, (str2 == null || Za.E.h0(str2)) ? null : str2, null, null, null, null, false, this.$amazonUserID, null, 2004, null), this.this$0.getAllowSharingPlayStoreAccount(), this.$appUserID, PostReceiptInitiationSource.RESTORE, new 1(this.$receiptID, this.$amazonUserID), new 2(this.$receiptID, this.$amazonUserID), null, 128, null);
        }
    }

    public static final class 5 extends u implements Qa.l {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $receiptID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(String str, String str2) {
            super(1);
            this.$receiptID = str;
            this.$amazonUserID = str2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(purchasesError, "error");
            LogIntent logIntent = LogIntent.RC_ERROR;
            PurchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1 purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1 = new PurchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1(logIntent, this.$receiptID, this.$amazonUserID, purchasesError);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke(), null);
                    return;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke(), null);
                    return;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke(), null);
                    return;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$5$invoke$$inlined$log$1.invoke(), null);
                    return;
                default:
                    return;
            }
            currentLogHandler.d(str, str2);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 $receiveOfferingsCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1) {
            super(0);
            this.$receiveOfferingsCallback = purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            PurchasesOrchestrator.this.getOfferings(this.$receiveOfferingsCallback, true);
        }
    }

    public static final class 2 implements ReceiveCustomerInfoCallback {
        final /* synthetic */ SyncPurchasesCallback $listener;

        public 2(SyncPurchasesCallback syncPurchasesCallback) {
            this.$listener = syncPurchasesCallback;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onError(purchasesError);
            }
        }

        public void onReceived(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onSuccess(customerInfo);
            }
        }
    }

    public static final class 3 extends u implements Qa.l {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            t.g(customerInfo, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onSuccess(customerInfo);
            }
        }
    }

    public static final class 4 extends u implements Qa.l {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onError(purchasesError);
            }
        }
    }

    public PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, EventsManager eventsManager, EventsManager eventsManager2, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler, Dispatcher dispatcher, PurchasesConfiguration purchasesConfiguration, FontLoader fontLoader, DefaultLocaleProvider defaultLocaleProvider, WebPurchaseRedemptionHelper webPurchaseRedemptionHelper, VirtualCurrencyManager virtualCurrencyManager, PurchaseParamsValidator purchaseParamsValidator, Qa.a aVar, BlockstoreHelper blockstoreHelper, BackupManager backupManager, FileRepository fileRepository, AdTracker adTracker) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(application, "application");
        t.g(backend, "backend");
        t.g(billingAbstract, "billing");
        t.g(deviceCache, "deviceCache");
        t.g(identityManager, "identityManager");
        t.g(subscriberAttributesManager, "subscriberAttributesManager");
        t.g(appConfig, "appConfig");
        t.g(customerInfoHelper, "customerInfoHelper");
        t.g(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        t.g(dateProvider, "dateProvider");
        t.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        t.g(postReceiptHelper, "postReceiptHelper");
        t.g(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        t.g(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        t.g(syncPurchasesHelper, "syncPurchasesHelper");
        t.g(offeringsManager, "offeringsManager");
        t.g(eventsManager, "eventsManager");
        t.g(eventsManager2, "adEventsManager");
        t.g(paywallPresentedCache, "paywallPresentedCache");
        t.g(purchasesStateCache, "purchasesStateCache");
        t.g(dispatcher, "dispatcher");
        t.g(purchasesConfiguration, "initialConfiguration");
        t.g(fontLoader, "fontLoader");
        t.g(defaultLocaleProvider, "localeProvider");
        t.g(webPurchaseRedemptionHelper, "webPurchaseRedemptionHelper");
        t.g(virtualCurrencyManager, "virtualCurrencyManager");
        t.g(purchaseParamsValidator, "purchaseParamsValidator");
        t.g(aVar, "processLifecycleOwnerProvider");
        t.g(blockstoreHelper, "blockstoreHelper");
        t.g(backupManager, "backupManager");
        t.g(fileRepository, "fileRepository");
        t.g(adTracker, "adTracker");
        this.application = application;
        this.backend = backend;
        this.billing = billingAbstract;
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.appConfig = appConfig;
        this.customerInfoHelper = customerInfoHelper;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.diagnosticsSynchronizer = diagnosticsSynchronizer;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.postReceiptHelper = postReceiptHelper;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.syncPurchasesHelper = syncPurchasesHelper;
        this.offeringsManager = offeringsManager;
        this.eventsManager = eventsManager;
        this.adEventsManager = eventsManager2;
        this.paywallPresentedCache = paywallPresentedCache;
        this.purchasesStateCache = purchasesStateCache;
        this.mainHandler = handler;
        this.dispatcher = dispatcher;
        this.initialConfiguration = purchasesConfiguration;
        this.fontLoader = fontLoader;
        this.localeProvider = defaultLocaleProvider;
        this.webPurchaseRedemptionHelper = webPurchaseRedemptionHelper;
        this.virtualCurrencyManager = virtualCurrencyManager;
        this.purchaseParamsValidator = purchaseParamsValidator;
        this.processLifecycleOwnerProvider = aVar;
        this.blockstoreHelper = blockstoreHelper;
        this.backupManager = backupManager;
        this.fileRepository = fileRepository;
        this.adTracker = adTracker;
        this.lifecycleHandler$delegate = Ca.m.b(new PurchasesOrchestrator$lifecycleHandler$2(this));
        b.a aVar2 = ab.b.b;
        ab.e eVar = ab.e.e;
        this.lastSyncAttributesAndOfferingsRateLimiter = new RateLimiter(5, ab.d.s(60, eVar), (kotlin.jvm.internal.k) null);
        this.preferredLocaleOverrideRateLimiter = new RateLimiter(2, ab.d.s(60, eVar), (kotlin.jvm.internal.k) null);
        this._preferredUILocaleOverride = purchasesConfiguration.getPreferredUILocaleOverride();
        defaultLocaleProvider.setPreferredLocaleOverride(this._preferredUILocaleOverride);
        identityManager.configure(str);
        billingAbstract.setStateListener(new 2());
        billingAbstract.setPurchasesUpdatedListener(getPurchasesUpdatedListener());
        BillingAbstract.startConnectionOnMainThread$default(billingAbstract, 0L, 1, null);
        dispatch(new 3());
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            return;
        }
        LogIntent logIntent = LogIntent.WARNING;
        PurchasesOrchestrator$special$$inlined$log$1 purchasesOrchestrator$special$$inlined$log$1 = new PurchasesOrchestrator$special$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$special$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$special$$inlined$log$1.invoke(), null);
                return;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$special$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$special$$inlined$log$1.invoke(), null);
                return;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$special$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$special$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$special$$inlined$log$1.invoke(), null);
                return;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$special$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$special$$inlined$log$1.invoke(), null);
                return;
            default:
                return;
        }
        currentLogHandler.d(str2, str3);
    }

    public static /* synthetic */ void a(Qa.a aVar) {
        dispatch$lambda$74(aVar);
    }

    public static final /* synthetic */ void access$dispatch(PurchasesOrchestrator purchasesOrchestrator, Qa.a aVar) {
        purchasesOrchestrator.dispatch(aVar);
    }

    public static final /* synthetic */ void access$flushEvents(PurchasesOrchestrator purchasesOrchestrator, Delay delay) {
        purchasesOrchestrator.flushEvents(delay);
    }

    public static final /* synthetic */ List access$getAndClearAllPurchaseCallbacks(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.getAndClearAllPurchaseCallbacks();
    }

    public static final /* synthetic */ ProductChangeCallback access$getAndClearProductChangeCallback(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.getAndClearProductChangeCallback();
    }

    public static final /* synthetic */ Application access$getApplication$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.application;
    }

    public static final /* synthetic */ BackupManager access$getBackupManager$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.backupManager;
    }

    public static final /* synthetic */ BillingAbstract access$getBilling$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.billing;
    }

    public static final /* synthetic */ BlockstoreHelper access$getBlockstoreHelper$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.blockstoreHelper;
    }

    public static final /* synthetic */ T4.d access$getCachedImageLoader$cp() {
        return cachedImageLoader;
    }

    public static final /* synthetic */ void access$getCustomerInfo(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        purchasesOrchestrator.getCustomerInfo(receiveCustomerInfoCallback);
    }

    public static final /* synthetic */ CustomerInfoHelper access$getCustomerInfoHelper$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.customerInfoHelper;
    }

    public static final /* synthetic */ CustomerInfoUpdateHandler access$getCustomerInfoUpdateHandler$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.customerInfoUpdateHandler;
    }

    public static final /* synthetic */ DateProvider access$getDateProvider$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.dateProvider;
    }

    public static final /* synthetic */ DiagnosticsSynchronizer access$getDiagnosticsSynchronizer$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.diagnosticsSynchronizer;
    }

    public static final /* synthetic */ DiagnosticsTracker access$getDiagnosticsTrackerIfEnabled$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.diagnosticsTrackerIfEnabled;
    }

    public static final /* synthetic */ IdentityManager access$getIdentityManager$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.identityManager;
    }

    public static final /* synthetic */ RateLimiter access$getLastSyncAttributesAndOfferingsRateLimiter$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.lastSyncAttributesAndOfferingsRateLimiter;
    }

    public static final /* synthetic */ AppLifecycleHandler access$getLifecycleHandler(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.getLifecycleHandler();
    }

    public static final /* synthetic */ OfferingsManager access$getOfferingsManager$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.offeringsManager;
    }

    public static final /* synthetic */ PlatformInfo access$getPlatformInfo$cp() {
        return platformInfo;
    }

    public static final /* synthetic */ PostPendingTransactionsHelper access$getPostPendingTransactionsHelper$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.postPendingTransactionsHelper;
    }

    public static final /* synthetic */ PostReceiptHelper access$getPostReceiptHelper$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.postReceiptHelper;
    }

    public static final /* synthetic */ PostTransactionWithProductDetailsHelper access$getPostTransactionWithProductDetailsHelper$p(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.postTransactionWithProductDetailsHelper;
    }

    public static final /* synthetic */ Pair access$getProductChangeCompletedCallbacks(PurchasesOrchestrator purchasesOrchestrator, ProductChangeCallback productChangeCallback) {
        return purchasesOrchestrator.getProductChangeCompletedCallbacks(productChangeCallback);
    }

    public static final /* synthetic */ void access$getProductsOfTypes(PurchasesOrchestrator purchasesOrchestrator, Set set, Set set2, List list, Date date, GetStoreProductsCallback getStoreProductsCallback) {
        purchasesOrchestrator.getProductsOfTypes(set, set2, list, date, getStoreProductsCallback);
    }

    public static final /* synthetic */ URL access$getProxyURL$cp() {
        return proxyURL;
    }

    public static final /* synthetic */ PurchaseCallback access$getPurchaseCallback(PurchasesOrchestrator purchasesOrchestrator, String str) {
        return purchasesOrchestrator.getPurchaseCallback(str);
    }

    public static final /* synthetic */ Pair access$getPurchaseCompletedCallbacks(PurchasesOrchestrator purchasesOrchestrator) {
        return purchasesOrchestrator.getPurchaseCompletedCallbacks();
    }

    public static final /* synthetic */ void access$setCachedImageLoader$cp(T4.d dVar) {
        cachedImageLoader = dVar;
    }

    public static final /* synthetic */ void access$setPlatformInfo$cp(PlatformInfo platformInfo2) {
        platformInfo = platformInfo2;
    }

    public static final /* synthetic */ void access$setProxyURL$cp(URL url) {
        proxyURL = url;
    }

    public static final /* synthetic */ void access$setStorefrontCountryCode$p(PurchasesOrchestrator purchasesOrchestrator, String str) {
        purchasesOrchestrator.storefrontCountryCode = str;
    }

    public static final /* synthetic */ boolean access$shouldRefreshCustomerInfo(PurchasesOrchestrator purchasesOrchestrator, boolean z) {
        return purchasesOrchestrator.shouldRefreshCustomerInfo(z);
    }

    public static final /* synthetic */ void access$synchronizeSubscriberAttributesIfNeeded(PurchasesOrchestrator purchasesOrchestrator) {
        purchasesOrchestrator.synchronizeSubscriberAttributesIfNeeded();
    }

    public static final /* synthetic */ void access$trackGetProductsResult(PurchasesOrchestrator purchasesOrchestrator, Date date, Set set, Set set2, PurchasesError purchasesError) {
        purchasesOrchestrator.trackGetProductsResult(date, set, set2, purchasesError);
    }

    public static final /* synthetic */ void access$trackPurchaseResultIfNeeded(PurchasesOrchestrator purchasesOrchestrator, PurchasingData purchasingData, PurchasesError purchasesError, Date date, VerificationResult verificationResult) {
        purchasesOrchestrator.trackPurchaseResultIfNeeded(purchasingData, purchasesError, date, verificationResult);
    }

    public static final /* synthetic */ void access$updateAllCaches(PurchasesOrchestrator purchasesOrchestrator, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        purchasesOrchestrator.updateAllCaches(str, receiveCustomerInfoCallback);
    }

    public static /* synthetic */ void b(Qa.a aVar) {
        enqueue$lambda$67(aVar);
    }

    private final boolean clearInMemoryCacheAndFetchOfferingsWithRateLimit(p pVar) {
        if (this.preferredLocaleOverrideRateLimiter.shouldProceed()) {
            this.offeringsManager.clearInMemoryOfferingsCache();
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Fetching fresh offerings");
            }
            getOfferings$default(this, new 2(pVar), false, 2, null);
            return true;
        }
        LogLevel logLevel2 = LogLevel.DEBUG;
        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) > 0) {
            return false;
        }
        currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Fresh offerings fetch rate limit reached: " + this.preferredLocaleOverrideRateLimiter.getMaxCallsInPeriod() + " per " + ab.b.s(this.preferredLocaleOverrideRateLimiter.getPeriodSeconds-UwyO8pc()) + " seconds. Fetch not triggered.");
        return false;
    }

    private final PurchaseCallback createCallbackWithDiagnosticsIfNeeded(PurchaseCallback purchaseCallback, PurchasingData purchasingData, Date date) {
        return this.diagnosticsTrackerIfEnabled == null ? purchaseCallback : new 1(purchasingData, date, purchaseCallback);
    }

    private final void dispatch(Qa.a aVar) {
        if (t.c(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new h(aVar));
    }

    private static final void dispatch$lambda$74(Qa.a aVar) {
        aVar.invoke();
    }

    private final void enqueue(Qa.a aVar) {
        this.dispatcher.enqueue(new i(aVar), Delay.NONE);
    }

    private static final void enqueue$lambda$67(Qa.a aVar) {
        aVar.invoke();
    }

    private final void flushEvents(Delay delay) {
        if (this.appConfig.getUiPreviewMode()) {
            return;
        }
        this.eventsManager.flushEvents(delay);
        this.adEventsManager.flushEvents(delay);
    }

    private final List getAndClearAllPurchaseCallbacks() {
        List L0;
        synchronized (this) {
            Map purchaseCallbacksByProductId = getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId();
            PurchasesState state$purchases_defaultsBc8Release = getState$purchases_defaultsBc8Release();
            Map emptyMap = Collections.emptyMap();
            t.f(emptyMap, "emptyMap()");
            setState$purchases_defaultsBc8Release(PurchasesState.copy$default(state$purchases_defaultsBc8Release, null, emptyMap, null, false, false, 29, null));
            L0 = D.L0(purchaseCallbacksByProductId.values());
        }
        return L0;
    }

    private final ProductChangeCallback getAndClearProductChangeCallback() {
        ProductChangeCallback deprecatedProductChangeCallback = getState$purchases_defaultsBc8Release().getDeprecatedProductChangeCallback();
        setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), null, null, null, false, false, 27, null));
        return deprecatedProductChangeCallback;
    }

    private final void getCustomerInfo(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        getCustomerInfo(CacheFetchPolicy.Companion.default(), false, receiveCustomerInfoCallback);
    }

    private static Object getDebugEventListener$delegate(PurchasesOrchestrator purchasesOrchestrator) {
        return P.d(new x(purchasesOrchestrator.eventsManager, EventsManager.class, "debugEventListener", "getDebugEventListener()Lcom/revenuecat/purchases/DebugEventListener;", 0));
    }

    private final AppLifecycleHandler getLifecycleHandler() {
        return (AppLifecycleHandler) this.lifecycleHandler$delegate.getValue();
    }

    public static /* synthetic */ void getOfferings$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveOfferingsCallback receiveOfferingsCallback, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        purchasesOrchestrator.getOfferings(receiveOfferingsCallback, z);
    }

    private final Pair getProductChangeCompletedCallbacks(ProductChangeCallback productChangeCallback) {
        return new Pair(new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1(productChangeCallback, this), new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onError$1(productChangeCallback, this));
    }

    public static /* synthetic */ void getProducts$default(PurchasesOrchestrator purchasesOrchestrator, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            productType = null;
        }
        purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    public static /* synthetic */ void getProductsOfTypes$default(PurchasesOrchestrator purchasesOrchestrator, Set set, Set set2, List list, Date date, GetStoreProductsCallback getStoreProductsCallback, int i, Object obj) {
        if ((i & 8) != 0) {
            date = null;
        }
        purchasesOrchestrator.getProductsOfTypes(set, set2, list, date, getStoreProductsCallback);
    }

    private final PurchaseCallback getPurchaseCallback(String str) {
        PurchaseCallback purchaseCallback = (PurchaseCallback) getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId().get(str);
        PurchasesState state$purchases_defaultsBc8Release = getState$purchases_defaultsBc8Release();
        Map purchaseCallbacksByProductId = getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : purchaseCallbacksByProductId.entrySet()) {
            if (!t.c(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        setState$purchases_defaultsBc8Release(PurchasesState.copy$default(state$purchases_defaultsBc8Release, null, linkedHashMap, null, false, false, 29, null));
        return purchaseCallback;
    }

    private final Pair getPurchaseCompletedCallbacks() {
        return new Pair(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(this), new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1(this));
    }

    private final BillingAbstract.PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return new 1();
    }

    public static /* synthetic */ void logIn$default(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            logInCallback = null;
        }
        purchasesOrchestrator.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    private final void replaceOldPurchaseWithNewProduct(PurchasingData purchasingData, String str, ReplacementMode replacementMode, Activity activity, String str2, PresentedOfferingContext presentedOfferingContext, Boolean bool, PurchaseErrorCallback purchaseErrorCallback) {
        ProductType productType = purchasingData.getProductType();
        ProductType productType2 = ProductType.SUBS;
        if (productType != productType2) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, "UpgradeInfo passed to purchase for non-sub product type. No upgrade will occur. Consider using non-upgrade purchase flows for this product.");
            LogUtilsKt.errorLog(purchasesError);
            ProductChangeCallback andClearProductChangeCallback = getAndClearProductChangeCallback();
            if (andClearProductChangeCallback != null) {
                dispatch(andClearProductChangeCallback, purchasesError);
            }
            Iterator it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError);
            }
            return;
        }
        O o = new O();
        o.a = str;
        if (Za.E.T(str, ":", false, 2, (Object) null)) {
            o.a = Za.E.d1(str, ":", (String) null, 2, (Object) null);
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Using incorrect oldProductId: " + str + ". The productId should not contain the basePlanId. Using productId: " + ((String) o.a) + '.');
            }
        }
        this.billing.findPurchaseInPurchaseHistory(str2, productType2, (String) o.a, new 3(activity, str2, purchasingData, replacementMode, presentedOfferingContext, bool, o), new 4(purchaseErrorCallback));
    }

    private final boolean shouldRefreshCustomerInfo(boolean z) {
        if (this.appConfig.getCustomEntitlementComputation()) {
            return false;
        }
        return z || this.deviceCache.isCustomerInfoCacheStale$purchases_defaultsBc8Release(getAppUserID(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startProductChange(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, GalaxyReplacementMode galaxyReplacementMode, Boolean bool, PurchaseCallback purchaseCallback) {
        GoogleReplacementMode googleReplacementMode2;
        String str2;
        I i;
        String productId;
        LogHandler currentLogHandler;
        String str3;
        String str4;
        LogHandler currentLogHandler2;
        String str5;
        String str6;
        List addOnProducts;
        trackPurchaseStarted(purchasingData.getProductId(), purchasingData.getProductType());
        PurchaseCallback createCallbackWithDiagnosticsIfNeeded = createCallbackWithDiagnosticsIfNeeded(purchaseCallback, purchasingData, this.dateProvider.getNow());
        if (purchasingData.getProductType() != ProductType.SUBS) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, "UpgradeInfo passed to purchase for non-sub product type. No upgrade will occur. Consider using non-upgrade purchase flows for this product.");
            LogUtilsKt.errorLog(purchasesError);
            dispatch(createCallbackWithDiagnosticsIfNeeded, purchasesError);
            return;
        }
        if ((purchasingData instanceof GooglePurchasingData.Subscription) && (addOnProducts = ((GooglePurchasingData.Subscription) purchasingData).getAddOnProducts()) != null && (!addOnProducts.isEmpty()) && getStore() != Store.PLAY_STORE) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "Making a purchase with add-ons is only supported on the Play Store.");
            LogUtilsKt.errorLog(purchasesError2);
            dispatch(createCallbackWithDiagnosticsIfNeeded, purchasesError2);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        PurchasesOrchestrator$startProductChange$$inlined$log$1 purchasesOrchestrator$startProductChange$$inlined$log$1 = new PurchasesOrchestrator$startProductChange$$inlined$log$1(logIntent, purchasingData, presentedOfferingContext, str, googleReplacementMode);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str5 = "[Purchases] - " + logLevel.name();
                    str6 = (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke();
                    currentLogHandler2.d(str5, str6);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str5 = "[Purchases] - " + logLevel4.name();
                    str6 = (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke();
                    currentLogHandler2.d(str5, str6);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str5 = "[Purchases] - " + logLevel6.name();
                    str6 = (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke();
                    currentLogHandler2.d(str5, str6);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str5 = "[Purchases] - " + logLevel7.name();
                    str6 = (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke();
                    currentLogHandler2.d(str5, str6);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$$inlined$log$1.invoke(), null);
                break;
        }
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogIntent logIntent2 = LogIntent.WARNING;
                    PurchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1 purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1 = new PurchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1(logIntent2);
                    switch (iArr[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                str3 = "[Purchases] - " + logLevel11.name();
                                str4 = (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke();
                                currentLogHandler.d(str3, str4);
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                str3 = "[Purchases] - " + logLevel14.name();
                                str4 = (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke();
                                currentLogHandler.d(str3, str4);
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler11.i("[Purchases] - " + logLevel15.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                str3 = "[Purchases] - " + logLevel16.name();
                                str4 = (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke();
                                currentLogHandler.d(str3, str4);
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                str3 = "[Purchases] - " + logLevel17.name();
                                str4 = (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke();
                                currentLogHandler.d(str3, str4);
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler12.w("[Purchases] - " + logLevel18.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler13.w("[Purchases] - " + logLevel19.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler14.w("[Purchases] - " + logLevel20.name(), (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startProductChange$lambda$95$$inlined$log$1.invoke(), null);
                            break;
                    }
                }
                if (getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    googleReplacementMode2 = googleReplacementMode;
                    str2 = null;
                } else {
                    googleReplacementMode2 = googleReplacementMode;
                    if (googleReplacementMode2 == GoogleReplacementMode.DEFERRED) {
                        if (Za.E.T(str, ":", false, 2, (Object) null)) {
                            LogLevel logLevel21 = LogLevel.WARN;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                                String str7 = "[Purchases] - " + logLevel21.name();
                                String format = String.format("Passing a basePlanId in oldProductId (%s) during a DEFERRED product change is not recommended. The basePlanId will be stripped automatically.", Arrays.copyOf(new Object[]{str}, 1));
                                t.f(format, "format(...)");
                                currentLogHandler15.w(str7, format);
                            }
                        }
                        productId = Za.E.d1(str, ":", (String) null, 2, (Object) null);
                    } else {
                        productId = purchasingData.getProductId();
                    }
                    setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), null, S.r(getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId(), Q.f(Ca.x.a(productId, createCallbackWithDiagnosticsIfNeeded))), null, false, false, 29, null));
                    str2 = this.identityManager.getCurrentAppUserID();
                }
                I i2 = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str2 != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[getStore().ordinal()];
            replaceOldPurchaseWithNewProduct(purchasingData, str, i3 != 1 ? i3 != 2 ? null : galaxyReplacementMode : googleReplacementMode2, activity, str2, presentedOfferingContext, bool, createCallbackWithDiagnosticsIfNeeded);
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            PurchasesError purchasesError3 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError3);
            Iterator it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError3);
            }
            I i4 = I.a;
        }
    }

    private final void startPurchase(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, Boolean bool, PurchaseCallback purchaseCallback) {
        String str;
        I i;
        LogHandler currentLogHandler;
        String str2;
        String str3;
        List addOnProducts;
        LogHandler currentLogHandler2;
        String str4;
        String str5;
        LogIntent logIntent = LogIntent.PURCHASE;
        PurchasesOrchestrator$startPurchase$$inlined$log$1 purchasesOrchestrator$startPurchase$$inlined$log$1 = new PurchasesOrchestrator$startPurchase$$inlined$log$1(logIntent, purchasingData, presentedOfferingContext);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str4 = "[Purchases] - " + logLevel.name();
                    str5 = (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str4, str5);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str4 = "[Purchases] - " + logLevel4.name();
                    str5 = (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str4, str5);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str4 = "[Purchases] - " + logLevel6.name();
                    str5 = (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str4, str5);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str4 = "[Purchases] - " + logLevel7.name();
                    str5 = (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str4, str5);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$$inlined$log$1.invoke(), null);
                break;
        }
        if ((purchasingData instanceof GooglePurchasingData.Subscription) && (addOnProducts = ((GooglePurchasingData.Subscription) purchasingData).getAddOnProducts()) != null && (!addOnProducts.isEmpty()) && getStore() != Store.PLAY_STORE) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "Making a purchase with add-ons is only supported on the Play Store.");
            LogUtilsKt.errorLog(purchasesError);
            dispatch(purchaseCallback, purchasesError);
            return;
        }
        trackPurchaseStarted(purchasingData.getProductId(), purchasingData.getProductType());
        PurchaseCallback createCallbackWithDiagnosticsIfNeeded = createCallbackWithDiagnosticsIfNeeded(purchaseCallback, purchasingData, this.dateProvider.getNow());
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogIntent logIntent2 = LogIntent.WARNING;
                    PurchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1 purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1 = new PurchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1(logIntent2);
                    switch (iArr[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                str2 = "[Purchases] - " + logLevel11.name();
                                str3 = (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke();
                                currentLogHandler.d(str2, str3);
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                str2 = "[Purchases] - " + logLevel14.name();
                                str3 = (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke();
                                currentLogHandler.d(str2, str3);
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler11.i("[Purchases] - " + logLevel15.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                str2 = "[Purchases] - " + logLevel16.name();
                                str3 = (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke();
                                currentLogHandler.d(str2, str3);
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                str2 = "[Purchases] - " + logLevel17.name();
                                str3 = (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke();
                                currentLogHandler.d(str2, str3);
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler12.w("[Purchases] - " + logLevel18.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler13.w("[Purchases] - " + logLevel19.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler14.w("[Purchases] - " + logLevel20.name(), (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$startPurchase$lambda$84$$inlined$log$1.invoke(), null);
                            break;
                    }
                }
                if (getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    str = null;
                } else {
                    setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), null, S.r(getState$purchases_defaultsBc8Release().getPurchaseCallbacksByProductId(), Q.f(Ca.x.a(purchasingData.getProductId(), createCallbackWithDiagnosticsIfNeeded))), null, false, false, 29, null));
                    str = this.identityManager.getCurrentAppUserID();
                }
                I i2 = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            this.billing.makePurchaseAsync(activity, str, purchasingData, null, presentedOfferingContext, bool);
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError2);
            dispatch(createCallbackWithDiagnosticsIfNeeded, purchasesError2);
        }
    }

    public static /* synthetic */ void syncPurchases$default(PurchasesOrchestrator purchasesOrchestrator, SyncPurchasesCallback syncPurchasesCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    private final void synchronizeSubscriberAttributesIfNeeded() {
        if (this.appConfig.getUiPreviewMode()) {
            return;
        }
        SubscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers$default(this.subscriberAttributesManager, getAppUserID(), null, 2, null);
    }

    private final void trackGetProductsResult(Date date, Set set, Set set2, PurchasesError purchasesError) {
        PurchasesErrorCode code;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long between = DurationExtensionsKt.between(ab.b.b, date, this.dateProvider.getNow());
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        Integer num = null;
        String message = purchasesError != null ? purchasesError.getMessage() : null;
        if (purchasesError != null && (code = purchasesError.getCode()) != null) {
            num = Integer.valueOf(code.getCode());
        }
        diagnosticsTracker.trackGetProductsResult-9VgGkz4(set, set2, message, num, between);
    }

    private final void trackGetProductsStarted(Set set) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGetProductsStarted(set);
        }
    }

    private final void trackPurchaseResultIfNeeded(PurchasingData purchasingData, PurchasesError purchasesError, Date date, VerificationResult verificationResult) {
        PurchasesErrorCode code;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        this.diagnosticsTrackerIfEnabled.trackPurchaseResult-myKFqkg(purchasingData.getProductId(), purchasingData.getProductType(), (purchasesError == null || (code = purchasesError.getCode()) == null) ? null : Integer.valueOf(code.getCode()), purchasesError != null ? purchasesError.getMessage() : null, DurationExtensionsKt.between(ab.b.b, date, this.dateProvider.getNow()), verificationResult);
    }

    private final void trackPurchaseStarted(String str, ProductType productType) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackPurchaseStarted(str, productType);
        }
    }

    private final void updateAllCaches(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        boolean appInBackground = getState$purchases_defaultsBc8Release().getAppInBackground();
        CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, str, CacheFetchPolicy.FETCH_CURRENT, appInBackground, getAllowSharingPlayStoreAccount(), false, receiveCustomerInfoCallback, 16, null);
        OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, str, appInBackground, null, null, 12, null);
    }

    public static /* synthetic */ void updateAllCaches$default(PurchasesOrchestrator purchasesOrchestrator, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.updateAllCaches(str, receiveCustomerInfoCallback);
    }

    public final void close() {
        synchronized (this) {
            PurchasesState state$purchases_defaultsBc8Release = getState$purchases_defaultsBc8Release();
            Map emptyMap = Collections.emptyMap();
            t.f(emptyMap, "emptyMap()");
            setState$purchases_defaultsBc8Release(PurchasesState.copy$default(state$purchases_defaultsBc8Release, null, emptyMap, null, false, false, 29, null));
            I i = I.a;
        }
        this.backend.close();
        this.billing.close();
        setUpdatedCustomerInfoListener(null);
        dispatch(new 2());
    }

    public final void collectDeviceIdentifiers() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1 purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1 = new PurchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$collectDeviceIdentifiers$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.collectDeviceIdentifiers(getAppUserID(), this.application);
    }

    public final void createSupportTicket(String str, String str2, Qa.l lVar, Qa.l lVar2) {
        t.g(str, "email");
        t.g(str2, "description");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        this.backend.postCreateSupportTicket(this.identityManager.getCurrentAppUserID(), str, str2, lVar, lVar2);
    }

    public final AdTracker getAdTracker() {
        return this.adTracker;
    }

    public final boolean getAllowSharingPlayStoreAccount() {
        Boolean allowSharingPlayStoreAccount;
        synchronized (this) {
            allowSharingPlayStoreAccount = getState$purchases_defaultsBc8Release().getAllowSharingPlayStoreAccount();
        }
        return allowSharingPlayStoreAccount != null ? allowSharingPlayStoreAccount.booleanValue() : this.identityManager.currentUserIsAnonymous();
    }

    public final void getAmazonLWAConsentStatus(GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusCallback) {
        t.g(getAmazonLWAConsentStatusCallback, "callback");
        this.billing.getAmazonLWAConsentStatus(new 1(getAmazonLWAConsentStatusCallback), new 2(getAmazonLWAConsentStatusCallback));
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final synchronized String getAppUserID() {
        return this.identityManager.getCurrentAppUserID();
    }

    public final String getCachedCurrentOfferingIdentifier() {
        return this.offeringsManager.getCachedCurrentOfferingIdentifier();
    }

    @InternalRevenueCatAPI
    public final DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        t.g(name, "fontInfo");
        return this.fontLoader.getCachedFontFamilyOrStartDownload(name);
    }

    public final VirtualCurrencies getCachedVirtualCurrencies() {
        return this.virtualCurrencyManager.cachedVirtualCurrencies();
    }

    public final PurchasesConfiguration getCurrentConfiguration() {
        return this.initialConfiguration.getAppUserID() == null ? this.initialConfiguration : PurchasesConfiguration.copy$purchases_defaultsBc8Release$default(this.initialConfiguration, getAppUserID(), null, 2, null);
    }

    public final void getCustomerCenterConfig(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
        t.g(getCustomerCenterConfigCallback, "callback");
        this.backend.getCustomerCenterConfig(this.identityManager.getCurrentAppUserID(), new 1(getCustomerCenterConfigCallback), new 2(getCustomerCenterConfigCallback));
    }

    public final synchronized CustomerCenterListener getCustomerCenterListener() {
        return this.customerCenterListener;
    }

    public final synchronized DebugEventListener getDebugEventListener() {
        return this.eventsManager.getDebugEventListener();
    }

    public final FileRepository getFileRepository() {
        return this.fileRepository;
    }

    public final synchronized boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    public final void getOfferings(ReceiveOfferingsCallback receiveOfferingsCallback, boolean z) {
        t.g(receiveOfferingsCallback, "listener");
        this.offeringsManager.getOfferings(this.identityManager.getCurrentAppUserID(), getState$purchases_defaultsBc8Release().getAppInBackground(), new 1(receiveOfferingsCallback), new 2(receiveOfferingsCallback), z);
    }

    public final OfflineEntitlementsManager getOfflineEntitlementsManager() {
        return this.offlineEntitlementsManager;
    }

    public final String getPreferredUILocaleOverride() {
        return this._preferredUILocaleOverride;
    }

    public final Qa.a getProcessLifecycleOwnerProvider() {
        return this.processLifecycleOwnerProvider;
    }

    public final void getProducts(List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback) {
        Set e;
        t.g(list, "productIds");
        t.g(getStoreProductsCallback, "callback");
        if (productType == null || (e = X.a(productType)) == null) {
            e = Y.e(new ProductType[]{ProductType.SUBS, ProductType.INAPP});
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Za.E.T((String) obj, ":", false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        Set Q0 = D.Q0(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Za.E.T(str, ":", false, 2, (Object) null)) {
                String d1 = Za.E.d1(str, ":", (String) null, 2, (Object) null);
                String V0 = Za.E.V0(str, ":", (String) null, 2, (Object) null);
                if (!Q0.contains(d1)) {
                    Object obj2 = linkedHashMap.get(d1);
                    if (obj2 == null) {
                        obj2 = new LinkedHashSet();
                        linkedHashMap.put(d1, obj2);
                    }
                    ((Set) obj2).add(V0);
                }
                str = d1;
            }
            arrayList2.add(str);
        }
        getProductsOfTypes(D.Q0(arrayList2), e, new 1(linkedHashMap, getStoreProductsCallback));
    }

    public final void getProductsOfTypes(Set set, Set set2, GetStoreProductsCallback getStoreProductsCallback) {
        t.g(set, "productIds");
        t.g(set2, "types");
        t.g(getStoreProductsCallback, "callback");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) set2) {
            if (((ProductType) obj) != ProductType.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        getProductsOfTypes$default(this, set, D.Q0(arrayList), v.n(), null, getStoreProductsCallback, 8, null);
    }

    public final PurchasesState getState$purchases_defaultsBc8Release() {
        return this.purchasesStateCache.getPurchasesState();
    }

    public final Store getStore() {
        return this.appConfig.getStore();
    }

    public final String getStorefrontCountryCode() {
        return this.storefrontCountryCode;
    }

    public final Locale getStorefrontLocale() {
        String str = this.storefrontCountryCode;
        if (str != null) {
            return new Locale.Builder().setRegion(str).build();
        }
        return null;
    }

    public final synchronized TrackedEventListener getTrackedEventListener() {
        return this.trackedEventListener;
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.customerInfoUpdateHandler.getUpdatedCustomerInfoListener();
    }

    public final void getVirtualCurrencies(GetVirtualCurrenciesCallback getVirtualCurrenciesCallback) {
        t.g(getVirtualCurrenciesCallback, "callback");
        this.virtualCurrencyManager.virtualCurrencies(getVirtualCurrenciesCallback);
    }

    public final void invalidateCustomerInfoCache() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1 purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1 = new PurchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$invalidateCustomerInfoCache$$inlined$log$1.invoke(), null);
                break;
        }
        this.deviceCache.clearCustomerInfoCache$purchases_defaultsBc8Release(getAppUserID());
    }

    public final void invalidateVirtualCurrenciesCache() {
        this.virtualCurrencyManager.invalidateVirtualCurrenciesCache();
    }

    public final boolean isAnonymous() {
        return this.identityManager.currentUserIsAnonymous();
    }

    public final void logIn(String str, LogInCallback logInCallback) {
        t.g(str, "newAppUserID");
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        I i = null;
        if (t.c(currentAppUserID, str)) {
            currentAppUserID = null;
        }
        if (currentAppUserID != null) {
            this.blockstoreHelper.clearUserIdBackupIfNeeded(new PurchasesOrchestrator$logIn$2$1(this, str, logInCallback));
            i = I.a;
        }
        if (i == null) {
            CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.Companion.default(), getState$purchases_defaultsBc8Release().getAppInBackground(), getAllowSharingPlayStoreAccount(), false, ListenerConversionsCommonKt.receiveCustomerInfoCallback(new 3(logInCallback), new 4(logInCallback)), 16, null);
        }
    }

    public final void logOut(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.identityManager.logOut(new 1(receiveCustomerInfoCallback, this));
    }

    public void onActivityPaused(Activity activity) {
        t.g(activity, "activity");
        flushEvents(Delay.NONE);
    }

    public void onActivityStarted(Activity activity) {
        t.g(activity, "activity");
        if (this.appConfig.getShowInAppMessagesAutomatically()) {
            showInAppMessagesIfNeeded(activity, Da.r.S0(InAppMessageType.values()));
        }
    }

    public void onAppBackgrounded() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        synchronized (this) {
            setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), null, null, null, true, false, 23, null));
            I i = I.a;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$onAppBackgrounded$$inlined$log$1 purchasesOrchestrator$onAppBackgrounded$$inlined$log$1 = new PurchasesOrchestrator$onAppBackgrounded$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppBackgrounded$$inlined$log$1.invoke(), null);
                break;
        }
        DebugEventListener debugEventListener = getDebugEventListener();
        if (debugEventListener != null) {
            debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.APP_BACKGROUNDED, null, 2, null));
        }
        this.appConfig.setAppBackgrounded(true);
        if (this.appConfig.getUiPreviewMode()) {
            return;
        }
        synchronizeSubscriberAttributesIfNeeded();
        flushEvents(Delay.NONE);
    }

    public void onAppForegrounded() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        J j = new J();
        synchronized (this) {
            j.a = getState$purchases_defaultsBc8Release().getFirstTimeInForeground();
            setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), null, null, null, false, false, 7, null));
            I i = I.a;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$onAppForegrounded$$inlined$log$1 purchasesOrchestrator$onAppForegrounded$$inlined$log$1 = new PurchasesOrchestrator$onAppForegrounded$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$onAppForegrounded$$inlined$log$1.invoke(), null);
                break;
        }
        this.appConfig.setAppBackgrounded(false);
        enqueue(new 3(j));
    }

    public final boolean overridePreferredUILocale(String str) {
        if (t.c(this._preferredUILocaleOverride, str)) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                return false;
            }
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Locale unchanged, no fresh fetch needed");
            return false;
        }
        synchronized (this) {
            this._preferredUILocaleOverride = str;
            this.localeProvider.setPreferredLocaleOverride(str);
            I i = I.a;
        }
        LogLevel logLevel2 = LogLevel.DEBUG;
        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
            currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Locale changed, attempting to fetch fresh offerings");
        }
        return clearInMemoryCacheAndFetchOfferingsWithRateLimit(4.INSTANCE);
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback purchaseCallback) {
        I i;
        t.g(purchaseParams, "purchaseParams");
        t.g(purchaseCallback, "callback");
        Result validate = this.purchaseParamsValidator.validate(purchaseParams);
        if (validate instanceof Result.Error) {
            dispatch(new 1(purchaseCallback, validate));
            return;
        }
        String oldProductId = purchaseParams.getOldProductId();
        if (oldProductId != null) {
            startProductChange(purchaseParams.getActivity$purchases_defaultsBc8Release(), purchaseParams.getPurchasingData$purchases_defaultsBc8Release(), purchaseParams.getPresentedOfferingContext$purchases_defaultsBc8Release(), oldProductId, purchaseParams.getGoogleReplacementMode(), purchaseParams.getGalaxyReplacementMode(), purchaseParams.isPersonalizedPrice(), purchaseCallback);
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            startPurchase(purchaseParams.getActivity$purchases_defaultsBc8Release(), purchaseParams.getPurchasingData$purchases_defaultsBc8Release(), purchaseParams.getPresentedOfferingContext$purchases_defaultsBc8Release(), purchaseParams.isPersonalizedPrice(), purchaseCallback);
        }
    }

    public final void redeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener redeemWebPurchaseListener) {
        t.g(webPurchaseRedemption, "webPurchaseRedemption");
        t.g(redeemWebPurchaseListener, "listener");
        this.webPurchaseRedemptionHelper.handleRedeemWebPurchase(webPurchaseRedemption, redeemWebPurchaseListener);
    }

    public final void removeUpdatedCustomerInfoListener() {
        setUpdatedCustomerInfoListener(null);
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(receiveCustomerInfoCallback, "callback");
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$restorePurchases$$inlined$log$1 purchasesOrchestrator$restorePurchases$$inlined$log$1 = new PurchasesOrchestrator$restorePurchases$$inlined$log$1(logIntent);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$1.invoke(), null);
                break;
        }
        if (!getAllowSharingPlayStoreAccount()) {
            LogIntent logIntent2 = LogIntent.WARNING;
            PurchasesOrchestrator$restorePurchases$$inlined$log$2 purchasesOrchestrator$restorePurchases$$inlined$log$2 = new PurchasesOrchestrator$restorePurchases$$inlined$log$2(logIntent2);
            switch (iArr[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$2.invoke(), null);
                    break;
            }
        }
        if (this.appConfig.getApiKeyValidationResult() != APIKeyValidator.ValidationResult.SIMULATED_STORE) {
            Date now = this.dateProvider.getNow();
            DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
            if (diagnosticsTracker != null) {
                diagnosticsTracker.trackRestorePurchasesStarted();
                I i = I.a;
            }
            String currentAppUserID = this.identityManager.getCurrentAppUserID();
            if (this.diagnosticsTrackerIfEnabled != null) {
                receiveCustomerInfoCallback = new PurchasesOrchestrator$restorePurchases$callbackWithTracking$1(this, now, receiveCustomerInfoCallback);
            }
            this.blockstoreHelper.aliasCurrentAndStoredUserIdsIfNeeded(new 4(currentAppUserID, receiveCustomerInfoCallback));
            return;
        }
        PurchasesOrchestrator$restorePurchases$$inlined$log$3 purchasesOrchestrator$restorePurchases$$inlined$log$3 = new PurchasesOrchestrator$restorePurchases$$inlined$log$3(logIntent);
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel21 = LogLevel.DEBUG;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                    currentLogHandler18.d("[Purchases] - " + logLevel21.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke(), null);
                break;
            case 3:
                LogLevel logLevel22 = LogLevel.WARN;
                LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                    currentLogHandler19.w("[Purchases] - " + logLevel22.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel23 = LogLevel.INFO;
                LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                    currentLogHandler20.i("[Purchases] - " + logLevel23.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel24 = LogLevel.DEBUG;
                LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                    currentLogHandler21.d("[Purchases] - " + logLevel24.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke(), null);
                break;
            case 7:
                LogLevel logLevel25 = LogLevel.INFO;
                LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                    currentLogHandler22.i("[Purchases] - " + logLevel25.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel26 = LogLevel.DEBUG;
                LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                    currentLogHandler23.d("[Purchases] - " + logLevel26.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                    break;
                }
                break;
            case 9:
                LogLevel logLevel27 = LogLevel.DEBUG;
                LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                    currentLogHandler24.d("[Purchases] - " + logLevel27.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                    break;
                }
                break;
            case 10:
                LogLevel logLevel28 = LogLevel.WARN;
                LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                    currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel29 = LogLevel.WARN;
                LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                    currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke(), null);
                break;
            case 13:
                LogLevel logLevel30 = LogLevel.WARN;
                LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                    currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$restorePurchases$$inlined$log$3.invoke(), null);
                break;
        }
        getCustomerInfo(receiveCustomerInfoCallback);
    }

    public final void setAd(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAd$$inlined$log$1 purchasesOrchestrator$setAd$$inlined$log$1 = new PurchasesOrchestrator$setAd$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAd$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE, str, getAppUserID());
    }

    public final void setAdGroup(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAdGroup$$inlined$log$1 purchasesOrchestrator$setAdGroup$$inlined$log$1 = new PurchasesOrchestrator$setAdGroup$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdGroup$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE, str, getAppUserID());
    }

    public final void setAdjustID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAdjustID$$inlined$log$1 purchasesOrchestrator$setAdjustID$$inlined$log$1 = new PurchasesOrchestrator$setAdjustID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAdjustID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Adjust.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAirbridgeDeviceID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1 purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1 = new PurchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirbridgeDeviceID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Airbridge.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAirshipChannelID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAirshipChannelID$$inlined$log$1 purchasesOrchestrator$setAirshipChannelID$$inlined$log$1 = new PurchasesOrchestrator$setAirshipChannelID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAirshipChannelID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.Airship.INSTANCE, str, getAppUserID());
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z) {
        setState$purchases_defaultsBc8Release(PurchasesState.copy$default(getState$purchases_defaultsBc8Release(), Boolean.valueOf(z), null, null, false, false, 30, null));
    }

    public final void setAppConfig(AppConfig appConfig) {
        t.g(appConfig, "<set-?>");
        this.appConfig = appConfig;
    }

    public final void setAppsFlyerConversionData(Map map) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1 purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1 = new PurchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsFlyerConversionData$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAppsFlyerConversionData(getAppUserID(), map);
    }

    public final void setAppsflyerID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAppsflyerID$$inlined$log$1 purchasesOrchestrator$setAppsflyerID$$inlined$log$1 = new PurchasesOrchestrator$setAppsflyerID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppsflyerID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.AppsFlyer.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAppstackAttributionParams(Map map, SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsCallback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(map, "data");
        t.g(syncAttributesAndOfferingsCallback, "callback");
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1 purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1 = new PurchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAppstackAttributionParams$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAppstackAttributionParams(getAppUserID(), map, this.application);
        syncAttributesAndOfferingsIfNeeded(syncAttributesAndOfferingsCallback);
    }

    public final void setAttributes(Map map) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(map, "attributes");
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setAttributes$$inlined$log$1 purchasesOrchestrator$setAttributes$$inlined$log$1 = new PurchasesOrchestrator$setAttributes$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setAttributes$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributes(map, getAppUserID());
    }

    public final void setCampaign(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setCampaign$$inlined$log$1 purchasesOrchestrator$setCampaign$$inlined$log$1 = new PurchasesOrchestrator$setCampaign$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCampaign$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE, str, getAppUserID());
    }

    public final void setCleverTapID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setCleverTapID$$inlined$log$1 purchasesOrchestrator$setCleverTapID$$inlined$log$1 = new PurchasesOrchestrator$setCleverTapID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCleverTapID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.CleverTap.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setCreative(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setCreative$$inlined$log$1 purchasesOrchestrator$setCreative$$inlined$log$1 = new PurchasesOrchestrator$setCreative$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setCreative$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE, str, getAppUserID());
    }

    public final synchronized void setCustomerCenterListener(CustomerCenterListener customerCenterListener) {
        this.customerCenterListener = customerCenterListener;
    }

    public final synchronized void setDebugEventListener(DebugEventListener debugEventListener) {
        this.eventsManager.setDebugEventListener(debugEventListener);
    }

    public final void setDisplayName(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setDisplayName$$inlined$log$1 purchasesOrchestrator$setDisplayName$$inlined$log$1 = new PurchasesOrchestrator$setDisplayName$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setDisplayName$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.DisplayName.INSTANCE, str, getAppUserID());
    }

    public final void setEmail(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setEmail$$inlined$log$1 purchasesOrchestrator$setEmail$$inlined$log$1 = new PurchasesOrchestrator$setEmail$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setEmail$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.Email.INSTANCE, str, getAppUserID());
    }

    public final void setFBAnonymousID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setFBAnonymousID$$inlined$log$1 purchasesOrchestrator$setFBAnonymousID$$inlined$log$1 = new PurchasesOrchestrator$setFBAnonymousID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFBAnonymousID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Facebook.INSTANCE, str, getAppUserID(), this.application);
    }

    public final synchronized void setFinishTransactions(boolean z) {
        this.appConfig.setFinishTransactions(z);
    }

    public final void setFirebaseAppInstanceID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1 purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1 = new PurchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setFirebaseAppInstanceID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId.INSTANCE, str, getAppUserID());
    }

    public final void setKeyword(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setKeyword$$inlined$log$1 purchasesOrchestrator$setKeyword$$inlined$log$1 = new PurchasesOrchestrator$setKeyword$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKeyword$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE, str, getAppUserID());
    }

    public final void setKochavaDeviceID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setKochavaDeviceID$$inlined$log$1 purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1 = new PurchasesOrchestrator$setKochavaDeviceID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setKochavaDeviceID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Kochava.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setMediaSource(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setMediaSource$$inlined$log$1 purchasesOrchestrator$setMediaSource$$inlined$log$1 = new PurchasesOrchestrator$setMediaSource$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMediaSource$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE, str, getAppUserID());
    }

    public final void setMixpanelDistinctID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1 purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1 = new PurchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMixpanelDistinctID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId.INSTANCE, str, getAppUserID());
    }

    public final void setMparticleID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setMparticleID$$inlined$log$1 purchasesOrchestrator$setMparticleID$$inlined$log$1 = new PurchasesOrchestrator$setMparticleID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setMparticleID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Mparticle.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setOnesignalID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setOnesignalID$$inlined$log$1 purchasesOrchestrator$setOnesignalID$$inlined$log$1 = new PurchasesOrchestrator$setOnesignalID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignal.INSTANCE, str, getAppUserID());
    }

    public final void setOnesignalUserID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setOnesignalUserID$$inlined$log$1 purchasesOrchestrator$setOnesignalUserID$$inlined$log$1 = new PurchasesOrchestrator$setOnesignalUserID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setOnesignalUserID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignalUserId.INSTANCE, str, getAppUserID());
    }

    public final void setPhoneNumber(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setPhoneNumber$$inlined$log$1 purchasesOrchestrator$setPhoneNumber$$inlined$log$1 = new PurchasesOrchestrator$setPhoneNumber$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPhoneNumber$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.PhoneNumber.INSTANCE, str, getAppUserID());
    }

    public final void setPostHogUserId(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setPostHogUserId$$inlined$log$1 purchasesOrchestrator$setPostHogUserId$$inlined$log$1 = new PurchasesOrchestrator$setPostHogUserId$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPostHogUserId$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.PostHogUserId.INSTANCE, str, getAppUserID());
    }

    public final void setPushToken(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setPushToken$$inlined$log$1 purchasesOrchestrator$setPushToken$$inlined$log$1 = new PurchasesOrchestrator$setPushToken$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setPushToken$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.FCMTokens.INSTANCE, str, getAppUserID());
    }

    public final void setSolarEngineAccountId(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1 purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1 = new PurchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineAccountId$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.SolarEngineAccountId.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setSolarEngineDistinctId(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1 purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1 = new PurchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineDistinctId$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.SolarEngineDistinctId.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setSolarEngineVisitorId(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1 purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1 = new PurchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setSolarEngineVisitorId$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.SolarEngineVisitorId.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setState$purchases_defaultsBc8Release(PurchasesState purchasesState) {
        t.g(purchasesState, "value");
        this.purchasesStateCache.setPurchasesState(purchasesState);
    }

    public final void setTenjinAnalyticsInstallationID(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1 purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1 = new PurchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$setTenjinAnalyticsInstallationID$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.TenjinAnalyticsInstallationId.INSTANCE, str, getAppUserID());
    }

    public final synchronized void setTrackedEventListener(TrackedEventListener trackedEventListener) {
        this.trackedEventListener = trackedEventListener;
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.customerInfoUpdateHandler.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List list) {
        t.g(activity, "activity");
        t.g(list, "inAppMessageTypes");
        this.billing.showInAppMessagesIfNeeded(activity, list, new 1());
    }

    public final void switchUser(String str) {
        t.g(str, "newAppUserID");
        if (!t.c(this.identityManager.getCurrentAppUserID(), str)) {
            this.identityManager.switchUser(str);
            OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, str, getState$purchases_defaultsBc8Release().getAppInBackground(), null, null, 12, null);
            return;
        }
        LogLevel logLevel = LogLevel.WARN;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            String str2 = "[Purchases] - " + logLevel.name();
            String format = String.format("switchUser called with the same appUserID as the current user %s. This has no effect.", Arrays.copyOf(new Object[]{str}, 1));
            t.f(format, "format(...)");
            currentLogHandler.w(str2, format);
        }
    }

    public final void syncAmazonPurchase(String str, String str2, String str3, String str4, Double d, Long l) {
        LogHandler currentLogHandler;
        String str5;
        String str6;
        LogHandler currentLogHandler2;
        String str7;
        String str8;
        t.g(str, "productID");
        t.g(str2, "receiptID");
        t.g(str3, "amazonUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$syncAmazonPurchase$$inlined$log$1 purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1 = new PurchasesOrchestrator$syncAmazonPurchase$$inlined$log$1(logIntent, str2, str3);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str7 = "[Purchases] - " + logLevel.name();
                    str8 = (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str7, str8);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str7 = "[Purchases] - " + logLevel4.name();
                    str8 = (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str7, str8);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str7 = "[Purchases] - " + logLevel6.name();
                    str8 = (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str7, str8);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str7 = "[Purchases] - " + logLevel7.name();
                    str8 = (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke();
                    currentLogHandler2.d(str7, str8);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$$inlined$log$1.invoke(), null);
                break;
        }
        Set previouslySentHashedTokens$purchases_defaultsBc8Release = this.deviceCache.getPreviouslySentHashedTokens$purchases_defaultsBc8Release();
        if (!previouslySentHashedTokens$purchases_defaultsBc8Release.contains(UtilsKt.sha1(str2))) {
            previouslySentHashedTokens$purchases_defaultsBc8Release = null;
        }
        if (previouslySentHashedTokens$purchases_defaultsBc8Release == null) {
            this.billing.normalizePurchaseData(str, str2, str3, new 4(d, str4, l, str3, this, str2, this.identityManager.getCurrentAppUserID()), new 5(str2, str3));
            return;
        }
        PurchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1 purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1 = new PurchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1(logIntent, str2, str3);
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    str5 = "[Purchases] - " + logLevel11.name();
                    str6 = (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke(), null);
                return;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    str5 = "[Purchases] - " + logLevel14.name();
                    str6 = (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke(), null);
                return;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler11.i("[Purchases] - " + logLevel15.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    str5 = "[Purchases] - " + logLevel16.name();
                    str6 = (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    str5 = "[Purchases] - " + logLevel17.name();
                    str6 = (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler12.w("[Purchases] - " + logLevel18.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler13.w("[Purchases] - " + logLevel19.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke(), null);
                return;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler14.w("[Purchases] - " + logLevel20.name(), (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAmazonPurchase$lambda$14$$inlined$log$1.invoke(), null);
                return;
            default:
                return;
        }
        currentLogHandler.d(str5, str6);
    }

    public final void syncAttributesAndOfferingsIfNeeded(SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsCallback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(syncAttributesAndOfferingsCallback, "callback");
        PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 = new PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1(syncAttributesAndOfferingsCallback);
        if (this.lastSyncAttributesAndOfferingsRateLimiter.shouldProceed()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getAppUserID(), new 2(purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1));
            return;
        }
        LogIntent logIntent = LogIntent.WARNING;
        PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1 purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1 = new PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1(logIntent, this);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1.invoke(), null);
                break;
        }
        getOfferings$default(this, purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1, false, 2, null);
    }

    public final void syncPurchases(SyncPurchasesCallback syncPurchasesCallback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (this.appConfig.getApiKeyValidationResult() != APIKeyValidator.ValidationResult.SIMULATED_STORE) {
            this.syncPurchasesHelper.syncPurchases(getAllowSharingPlayStoreAccount(), getState$purchases_defaultsBc8Release().getAppInBackground(), new 3(syncPurchasesCallback), new 4(syncPurchasesCallback));
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        PurchasesOrchestrator$syncPurchases$$inlined$log$1 purchasesOrchestrator$syncPurchases$$inlined$log$1 = new PurchasesOrchestrator$syncPurchases$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$syncPurchases$$inlined$log$1.invoke(), null);
                break;
        }
        getCustomerInfo(new 2(syncPurchasesCallback));
    }

    public final void track(FeatureEvent featureEvent) {
        t.g(featureEvent, "event");
        if (featureEvent instanceof PaywallEvent) {
            this.paywallPresentedCache.receiveEvent((PaywallEvent) featureEvent);
        }
        this.eventsManager.track(featureEvent);
        TrackedEventListener trackedEventListener = this.trackedEventListener;
        if (trackedEventListener != null) {
            trackedEventListener.onEventTracked(featureEvent);
        }
    }

    public static final /* synthetic */ void access$dispatch(PurchasesOrchestrator purchasesOrchestrator, PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        purchasesOrchestrator.dispatch(purchaseErrorCallback, purchasesError);
    }

    public final void getCustomerInfo(CacheFetchPolicy cacheFetchPolicy, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        t.g(cacheFetchPolicy, "fetchPolicy");
        t.g(receiveCustomerInfoCallback, "callback");
        this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), cacheFetchPolicy, getState$purchases_defaultsBc8Release().getAppInBackground(), getAllowSharingPlayStoreAccount(), z, receiveCustomerInfoCallback);
    }

    public final void getStorefrontCountryCode(GetStorefrontCallback getStorefrontCallback) {
        I i;
        t.g(getStorefrontCallback, "callback");
        String str = this.storefrontCountryCode;
        if (str != null) {
            getStorefrontCallback.onReceived(str);
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            this.billing.getStorefront(new PurchasesOrchestrator$getStorefrontCountryCode$2$1(this, getStorefrontCallback), new PurchasesOrchestrator$getStorefrontCountryCode$2$2(getStorefrontCallback));
        }
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public final void getStorefrontLocale(GetStorefrontLocaleCallback getStorefrontLocaleCallback) {
        t.g(getStorefrontLocaleCallback, "callback");
        getStorefrontCountryCode(new 1(getStorefrontLocaleCallback));
    }

    private final void dispatch(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        dispatch(new 1(purchaseErrorCallback, purchasesError));
    }

    private final void getProductsOfTypes(Set set, Set set2, List list, Date date, GetStoreProductsCallback getStoreProductsCallback) {
        I i;
        if (date == null) {
            trackGetProductsStarted(set);
            date = this.dateProvider.getNow();
        }
        Iterable P0 = D.P0((Iterable) set2);
        ProductType productType = (ProductType) D.g0(P0);
        if (productType != null) {
            P0.remove(productType);
        } else {
            productType = null;
        }
        if (productType != null) {
            this.billing.queryProductDetailsAsync(productType, set, new PurchasesOrchestrator$getProductsOfTypes$1$1(this, set, P0, list, date, getStoreProductsCallback), new PurchasesOrchestrator$getProductsOfTypes$1$2(this, date, set, getStoreProductsCallback));
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            ArrayList arrayList = new ArrayList(w.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((StoreProduct) it.next()).getId());
            }
            trackGetProductsResult(date, set, Z.g(set, D.Q0(arrayList)), null);
            getStoreProductsCallback.onReceived(list);
        }
    }

    public /* synthetic */ PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, EventsManager eventsManager, EventsManager eventsManager2, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler, Dispatcher dispatcher, PurchasesConfiguration purchasesConfiguration, FontLoader fontLoader, DefaultLocaleProvider defaultLocaleProvider, WebPurchaseRedemptionHelper webPurchaseRedemptionHelper, VirtualCurrencyManager virtualCurrencyManager, PurchaseParamsValidator purchaseParamsValidator, Qa.a aVar, BlockstoreHelper blockstoreHelper, BackupManager backupManager, FileRepository fileRepository, AdTracker adTracker, int i, int i2, kotlin.jvm.internal.k kVar) {
        this(application, str, backend, billingAbstract, deviceCache, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, diagnosticsTracker, (i & 4096) != 0 ? new DefaultDateProvider() : dateProvider, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, eventsManager, eventsManager2, paywallPresentedCache, purchasesStateCache, (8388608 & i) != 0 ? new Handler(Looper.getMainLooper()) : handler, dispatcher, purchasesConfiguration, fontLoader, defaultLocaleProvider, (268435456 & i) != 0 ? new WebPurchaseRedemptionHelper(backend, identityManager, offlineEntitlementsManager, customerInfoUpdateHandler, null, 16, null) : webPurchaseRedemptionHelper, virtualCurrencyManager, purchaseParamsValidator, (i & Integer.MIN_VALUE) != 0 ? 1.INSTANCE : aVar, (i2 & 1) != 0 ? new BlockstoreHelper(application, identityManager, null, null, null, 28, null) : blockstoreHelper, (i2 & 2) != 0 ? new BackupManager(application) : backupManager, (i2 & 4) != 0 ? new DefaultFileRepository(application) : fileRepository, (i2 & 8) != 0 ? new AdTracker(eventsManager2) : adTracker);
    }
}

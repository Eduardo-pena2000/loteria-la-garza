package com.revenuecat.purchases.simulatedstore;

import Ca.I;
import Ca.x;
import Da.Q;
import Da.S;
import Da.v;
import Da.w;
import Qa.l;
import android.app.Activity;
import android.os.Handler;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.networking.WebBillingProductResponse;
import com.revenuecat.purchases.common.networking.WebBillingProductsResponse;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.utils.AlertDialogHelper;
import com.revenuecat.purchases.utils.DefaultAlertDialogHelper;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SimulatedStoreBillingWrapper extends BillingAbstract {
    private final Backend backend;
    private volatile boolean connected;
    private final DeviceCache deviceCache;
    private final AlertDialogHelper dialogHelper;
    private final Handler mainHandler;

    public static final class 2 extends u implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onReceive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar, l lVar2) {
            super(1);
            this.$onReceive = lVar;
            this.$onError = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((WebBillingProductsResponse) obj);
            return I.a;
        }

        public final void invoke(WebBillingProductsResponse webBillingProductsResponse) {
            t.g(webBillingProductsResponse, "response");
            try {
                List productDetails = webBillingProductsResponse.getProductDetails();
                ArrayList arrayList = new ArrayList(w.y(productDetails, 10));
                Iterator it = productDetails.iterator();
                while (it.hasNext()) {
                    arrayList.add(SimulatedStoreProductConverter.convertToStoreProduct$default(SimulatedStoreProductConverter.INSTANCE, (WebBillingProductResponse) it.next(), null, 2, null));
                }
                this.$onReceive.invoke(arrayList);
            } catch (PurchasesException e) {
                this.$onError.invoke(e.getError());
            }
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ StoreProduct $product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
            super(0);
            this.$product = storeProduct;
            this.$presentedOfferingContext = presentedOfferingContext;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "[Test store] Performing test purchase. This purchase won't appear in production.");
            }
            SimulatedStoreBillingWrapper.access$completePurchase(SimulatedStoreBillingWrapper.this, this.$product, this.$presentedOfferingContext);
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
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "[Test store] Purchase failure simulated successfully in Test Store.");
            }
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = SimulatedStoreBillingWrapper.this.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(new PurchasesError(PurchasesErrorCode.TestStoreSimulatedPurchaseError, "Simulated error successfully."));
            }
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
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = SimulatedStoreBillingWrapper.this.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(new PurchasesError(PurchasesErrorCode.PurchaseCancelledError, "Purchase cancelled by user"));
            }
        }
    }

    public /* synthetic */ SimulatedStoreBillingWrapper(DeviceCache deviceCache, Handler handler, PurchasesStateProvider purchasesStateProvider, Backend backend, AlertDialogHelper alertDialogHelper, int i, k kVar) {
        this(deviceCache, handler, purchasesStateProvider, backend, (i & 16) != 0 ? new DefaultAlertDialogHelper() : alertDialogHelper);
    }

    public static /* synthetic */ void a(SimulatedStoreBillingWrapper simulatedStoreBillingWrapper) {
        startConnectionOnMainThread$lambda$0(simulatedStoreBillingWrapper);
    }

    public static final /* synthetic */ void access$completePurchase(SimulatedStoreBillingWrapper simulatedStoreBillingWrapper, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        simulatedStoreBillingWrapper.completePurchase(storeProduct, presentedOfferingContext);
    }

    private final void completePurchase(StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        Map h;
        String id;
        long time = new Date().getTime();
        String str = "test_" + time + '_' + UUID.randomUUID();
        List e = Da.u.e(storeProduct.getId());
        ProductType type = storeProduct.getType();
        PurchaseState purchaseState = PurchaseState.PURCHASED;
        Boolean valueOf = Boolean.valueOf(storeProduct.getType() == ProductType.SUBS);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orderId", str);
        jSONObject.put("productId", storeProduct.getId());
        jSONObject.put("purchaseTime", time);
        jSONObject.put("purchaseToken", str);
        jSONObject.put("purchaseState", purchaseState.ordinal());
        I i = I.a;
        PurchaseType purchaseType = PurchaseType.GOOGLE_PURCHASE;
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        String id2 = defaultOption != null ? defaultOption.getId() : null;
        SubscriptionOption defaultOption2 = storeProduct.getDefaultOption();
        if (defaultOption2 == null || (id = defaultOption2.getId()) == null || (h = Q.f(x.a(storeProduct.getId(), id))) == null) {
            h = S.h();
        }
        StoreTransaction storeTransaction = new StoreTransaction(str, e, type, time, str, purchaseState, valueOf, null, jSONObject, presentedOfferingContext, null, purchaseType, null, id2, h, null);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesUpdated(Da.u.e(storeTransaction));
        }
    }

    private final void showPurchaseDialog(Activity activity, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a test purchase and should only be used during development. In production, use a Google/Amazon API key from RevenueCat.\n\n");
        sb.append("Product: " + storeProduct.getId() + '\n');
        sb.append("Price: " + storeProduct.getPrice().getFormatted() + '\n');
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption != null) {
            for (PricingPhase pricingPhase : defaultOption.getPricingPhases()) {
                sb.append("Phase: " + pricingPhase.getPrice().getFormatted() + " for " + pricingPhase.getBillingPeriod().getIso8601() + '\n');
            }
        }
        String sb2 = sb.toString();
        t.f(sb2, "toString(...)");
        this.dialogHelper.showDialog(activity, "Test Store Purchase", sb2, "Test valid Purchase", "Test failed Purchase", "Cancel", new 1(storeProduct, presentedOfferingContext), new 2(), new 3());
    }

    private static final void startConnectionOnMainThread$lambda$0(SimulatedStoreBillingWrapper simulatedStoreBillingWrapper) {
        simulatedStoreBillingWrapper.startConnection();
    }

    public void consumeAndSave(boolean z, StoreTransaction storeTransaction, boolean z2, PostReceiptInitiationSource postReceiptInitiationSource) {
        t.g(storeTransaction, "purchase");
        t.g(postReceiptInitiationSource, "initiationSource");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: consumeAndSave - no-op for test store");
        }
    }

    public void endConnection() {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: Ending connection");
        }
        this.connected = false;
    }

    public void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(productType, "productType");
        t.g(str2, "productId");
        t.g(lVar, "onCompletion");
        t.g(lVar2, "onError");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: findPurchaseInPurchaseHistory for product: " + str2 + " will always fail");
        }
        lVar2.invoke(new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, "No active purchase found for product: " + str2));
    }

    public void getStorefront(l lVar, l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: getStorefront - returning US by default");
        }
        lVar.invoke("US");
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        t.g(activity, "activity");
        t.g(str, "appUserID");
        t.g(purchasingData, "purchasingData");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: makePurchaseAsync for product: " + purchasingData.getProductId());
        }
        SimulatedStorePurchasingData simulatedStorePurchasingData = purchasingData instanceof SimulatedStorePurchasingData ? (SimulatedStorePurchasingData) purchasingData : null;
        if (simulatedStorePurchasingData != null) {
            showPurchaseDialog(activity, simulatedStorePurchasingData.getStoreProduct(), presentedOfferingContext);
            return;
        }
        throw new PurchasesException(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Purchasing data is not a valid SimulatedStorePurchasingData: " + purchasingData.getProductId()));
    }

    public void queryAllPurchases(String str, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(lVar, "onReceivePurchaseHistory");
        t.g(lVar2, "onReceivePurchaseHistoryError");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: queryAllPurchases - returning empty list");
        }
        lVar.invoke(v.n());
    }

    public void queryProductDetailsAsync(ProductType productType, Set set, l lVar, l lVar2) {
        t.g(productType, "productType");
        t.g(set, "productIds");
        t.g(lVar, "onReceive");
        t.g(lVar2, "onError");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: queryProductDetailsAsync for products: " + set);
        }
        Backend backend = this.backend;
        String cachedAppUserID$purchases_defaultsBc8Release = this.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release();
        if (cachedAppUserID$purchases_defaultsBc8Release == null) {
            cachedAppUserID$purchases_defaultsBc8Release = "";
        }
        backend.getWebBillingProducts(cachedAppUserID$purchases_defaultsBc8Release, set, new 2(lVar, lVar2), lVar2);
    }

    public void queryPurchases(String str, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: queryPurchases - returning empty map");
        }
        lVar.invoke(S.h());
    }

    public void showInAppMessagesIfNeeded(Activity activity, List list, Qa.a aVar) {
        t.g(activity, "activity");
        t.g(list, "inAppMessageTypes");
        t.g(aVar, "subscriptionStatusChange");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: showInAppMessagesIfNeeded - no-op for test store");
        }
    }

    public void startConnection() {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "SimulatedStoreBillingAbstract: Starting connection");
        }
        this.connected = true;
        BillingAbstract.StateListener stateListener = getStateListener();
        if (stateListener != null) {
            stateListener.onConnected();
        }
    }

    public void startConnectionOnMainThread(long j) {
        this.mainHandler.postDelayed(new a(this), j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimulatedStoreBillingWrapper(DeviceCache deviceCache, Handler handler, PurchasesStateProvider purchasesStateProvider, Backend backend, AlertDialogHelper alertDialogHelper) {
        super(purchasesStateProvider);
        t.g(deviceCache, "deviceCache");
        t.g(handler, "mainHandler");
        t.g(purchasesStateProvider, "purchasesStateProvider");
        t.g(backend, "backend");
        t.g(alertDialogHelper, "dialogHelper");
        this.deviceCache = deviceCache;
        this.mainHandler = handler;
        this.backend = backend;
        this.dialogHelper = alertDialogHelper;
    }
}

package com.revenuecat.purchases;

import Qa.p;
import android.app.Activity;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontLocaleCallback;
import com.revenuecat.purchases.interfaces.GetVirtualCurrenciesCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ListenerConversionsKt {

    public static final class 1 implements GetAmazonLWAConsentStatusCallback {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;

        public 1(Qa.l lVar, Qa.l lVar2) {
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }

        public void onSuccess(AmazonLWAConsentStatus amazonLWAConsentStatus) {
            t.g(amazonLWAConsentStatus, "consentStatus");
            this.$onSuccess.invoke(amazonLWAConsentStatus);
        }
    }

    public static final class 1 implements GetCustomerCenterConfigCallback {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;

        public 1(Qa.l lVar, Qa.l lVar2) {
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }

        public void onSuccess(CustomerCenterConfigData customerCenterConfigData) {
            t.g(customerCenterConfigData, "customerCenterConfig");
            this.$onSuccess.invoke(customerCenterConfigData);
        }
    }

    public static final class 1 implements GetStorefrontLocaleCallback {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;

        public 1(Qa.l lVar, Qa.l lVar2) {
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }

        public void onReceived(Locale locale) {
            t.g(locale, "storefrontLocale");
            this.$onSuccess.invoke(locale);
        }
    }

    public static final class 1 implements GetVirtualCurrenciesCallback {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;

        public 1(Qa.l lVar, Qa.l lVar2) {
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }

        public void onReceived(VirtualCurrencies virtualCurrencies) {
            t.g(virtualCurrencies, "virtualCurrencies");
            this.$onSuccess.invoke(virtualCurrencies);
        }
    }

    public static final class 1 implements LogInCallback {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ p $onSuccess;

        public 1(p pVar, Qa.l lVar) {
            this.$onSuccess = pVar;
            this.$onError = lVar;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            Qa.l lVar = this.$onError;
            if (lVar != null) {
            }
        }

        public void onReceived(CustomerInfo customerInfo, boolean z) {
            t.g(customerInfo, "customerInfo");
            p pVar = this.$onSuccess;
            if (pVar != null) {
            }
        }
    }

    public static final class 1 implements ProductChangeCallback {
        final /* synthetic */ p $onError;
        final /* synthetic */ p $onSuccess;

        public 1(p pVar, p pVar2) {
            this.$onSuccess = pVar;
            this.$onError = pVar2;
        }

        public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            this.$onSuccess.invoke(storeTransaction, customerInfo);
        }

        public void onError(PurchasesError purchasesError, boolean z) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError, Boolean.valueOf(z));
        }
    }

    public static final class 1 implements SyncAttributesAndOfferingsCallback {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;

        public 1(Qa.l lVar, Qa.l lVar2) {
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }

        public void onSuccess(Offerings offerings) {
            t.g(offerings, "offerings");
            this.$onSuccess.invoke(offerings);
        }
    }

    public static final class 1 implements SyncPurchasesCallback {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;

        public 1(Qa.l lVar, Qa.l lVar2) {
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }

        public void onSuccess(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            this.$onSuccess.invoke(customerInfo);
        }
    }

    public static final GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusListener(Qa.l lVar, Qa.l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        return new 1(lVar, lVar2);
    }

    public static final void getAmazonLWAConsentStatusWith(Purchases purchases, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.getAmazonLWAConsentStatus(getAmazonLWAConsentStatusListener(lVar2, lVar));
    }

    public static /* synthetic */ void getAmazonLWAConsentStatusWith$default(Purchases purchases, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getAmazonLWAConsentStatusWith(purchases, lVar, lVar2);
    }

    public static final GetCustomerCenterConfigCallback getCustomerCenterConfigDataListener(Qa.l lVar, Qa.l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        return new 1(lVar, lVar2);
    }

    public static final void getCustomerInfoWith(Purchases purchases, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.getCustomerInfo(ListenerConversionsCommonKt.receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, lVar, lVar2);
    }

    @Ca.e
    public static final void getNonSubscriptionSkusWith(Purchases purchases, List list, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(list, "skus");
        t.g(lVar, "onError");
        t.g(lVar2, "onReceiveSkus");
        purchases.getProducts(list, ProductType.INAPP, ListenerConversionsCommonKt.getStoreProductsCallback(lVar2, lVar));
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static final void getStorefrontLocaleWith(Purchases purchases, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.getStorefrontLocale(new 1(lVar2, lVar));
    }

    public static /* synthetic */ void getStorefrontLocaleWith$default(Purchases purchases, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getStorefrontLocaleWith(purchases, lVar, lVar2);
    }

    @Ca.e
    public static final void getSubscriptionSkusWith(Purchases purchases, List list, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(list, "skus");
        t.g(lVar, "onError");
        t.g(lVar2, "onReceiveSkus");
        purchases.getProducts(list, ProductType.SUBS, ListenerConversionsCommonKt.getStoreProductsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getSubscriptionSkusWith$default(Purchases purchases, List list, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getSubscriptionSkusWith(purchases, list, lVar, lVar2);
    }

    public static final GetVirtualCurrenciesCallback getVirtualCurrenciesCallback(Qa.l lVar, Qa.l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        return new 1(lVar, lVar2);
    }

    public static final void getVirtualCurrenciesWith(Purchases purchases, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.getVirtualCurrencies(getVirtualCurrenciesCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getVirtualCurrenciesWith$default(Purchases purchases, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getVirtualCurrenciesWith(purchases, lVar, lVar2);
    }

    public static final LogInCallback logInSuccessListener(p pVar, Qa.l lVar) {
        t.g(pVar, "onSuccess");
        t.g(lVar, "onError");
        return new 1(pVar, lVar);
    }

    public static final void logInWith(Purchases purchases, String str, Qa.l lVar, p pVar) {
        t.g(purchases, "<this>");
        t.g(str, "appUserID");
        t.g(lVar, "onError");
        t.g(pVar, "onSuccess");
        purchases.logIn(str, logInSuccessListener(pVar, lVar));
    }

    public static /* synthetic */ void logInWith$default(Purchases purchases, String str, Qa.l lVar, p pVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logInWith(purchases, str, lVar, pVar);
    }

    public static final void logOutWith(Purchases purchases, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.logOut(ListenerConversionsCommonKt.receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void logOutWith$default(Purchases purchases, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logOutWith(purchases, lVar, lVar2);
    }

    public static final ProductChangeCallback productChangeCompletedListener(p pVar, p pVar2) {
        t.g(pVar, "onSuccess");
        t.g(pVar2, "onError");
        return new 1(pVar, pVar2);
    }

    @Ca.e
    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package r3, p pVar, p pVar2) {
        t.g(purchases, "<this>");
        t.g(activity, "activity");
        t.g(r3, "packageToPurchase");
        t.g(pVar, "onError");
        t.g(pVar2, "onSuccess");
        purchases.purchasePackage(activity, r3, ListenerConversionsCommonKt.purchaseCompletedCallback(pVar2, pVar));
    }

    public static /* synthetic */ void purchasePackageWith$default(Purchases purchases, Activity activity, Package r2, p pVar, p pVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            pVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchasePackageWith(purchases, activity, r2, pVar, pVar2);
    }

    @Ca.e
    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, p pVar, p pVar2) {
        t.g(purchases, "<this>");
        t.g(activity, "activity");
        t.g(storeProduct, "storeProduct");
        t.g(pVar, "onError");
        t.g(pVar2, "onSuccess");
        purchases.purchaseProduct(activity, storeProduct, ListenerConversionsCommonKt.purchaseCompletedCallback(pVar2, pVar));
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, p pVar, p pVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            pVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, storeProduct, pVar, pVar2);
    }

    public static final void syncAttributesAndOfferingsIfNeededWith(Purchases purchases, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.syncAttributesAndOfferingsIfNeeded(syncAttributesAndOfferingsListener(lVar2, lVar));
    }

    public static /* synthetic */ void syncAttributesAndOfferingsIfNeededWith$default(Purchases purchases, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncAttributesAndOfferingsIfNeededWith(purchases, lVar, lVar2);
    }

    public static final SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsListener(Qa.l lVar, Qa.l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        return new 1(lVar, lVar2);
    }

    public static final SyncPurchasesCallback syncPurchasesListener(Qa.l lVar, Qa.l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        return new 1(lVar, lVar2);
    }

    public static final void syncPurchasesWith(Purchases purchases, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.syncPurchases(syncPurchasesListener(lVar2, lVar));
    }

    public static /* synthetic */ void syncPurchasesWith$default(Purchases purchases, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncPurchasesWith(purchases, lVar, lVar2);
    }

    public static final void getCustomerInfoWith(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(cacheFetchPolicy, "fetchPolicy");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.getCustomerInfo(cacheFetchPolicy, ListenerConversionsCommonKt.receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, cacheFetchPolicy, lVar, lVar2);
    }
}

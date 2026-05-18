package com.revenuecat.purchases;

import Qa.p;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ListenerConversionsCommonKt {
    private static final Qa.l ON_ERROR_STUB = ListenerConversionsCommonKt$ON_ERROR_STUB$1.INSTANCE;
    private static final p ON_PURCHASE_ERROR_STUB = ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    public static final class 1 implements GetStoreProductsCallback {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onReceived;

        public 1(Qa.l lVar, Qa.l lVar2) {
            this.$onReceived = lVar;
            this.$onError = lVar2;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }

        public void onReceived(List list) {
            t.g(list, "storeProducts");
            this.$onReceived.invoke(list);
        }
    }

    public static final class 1 implements GetStorefrontCallback {
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

        public void onReceived(String str) {
            t.g(str, "storefrontCountryCode");
            this.$onSuccess.invoke(str);
        }
    }

    public static final class 1 implements PurchaseCallback {
        final /* synthetic */ p $onError;
        final /* synthetic */ p $onSuccess;

        public 1(p pVar, p pVar2) {
            this.$onSuccess = pVar;
            this.$onError = pVar2;
        }

        public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            t.g(storeTransaction, "storeTransaction");
            t.g(customerInfo, "customerInfo");
            this.$onSuccess.invoke(storeTransaction, customerInfo);
        }

        public void onError(PurchasesError purchasesError, boolean z) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError, Boolean.valueOf(z));
        }
    }

    public static final class 1 implements ReceiveCustomerInfoCallback {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;

        public 1(Qa.l lVar, Qa.l lVar2) {
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            Qa.l lVar = this.$onError;
            if (lVar != null) {
            }
        }

        public void onReceived(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            Qa.l lVar = this.$onSuccess;
            if (lVar != null) {
            }
        }
    }

    public static final class 1 implements ReceiveOfferingsCallback {
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

        public void onReceived(Offerings offerings) {
            t.g(offerings, "offerings");
            this.$onSuccess.invoke(offerings);
        }
    }

    public static final Qa.l getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final p getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.getOfferings(receiveOfferingsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getOfferingsWith$default(Purchases purchases, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, lVar, lVar2);
    }

    public static final void getProductsWith(Purchases purchases, List list, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(list, "productIds");
        t.g(lVar, "onError");
        t.g(lVar2, "onGetStoreProducts");
        purchases.getProducts(list, getStoreProductsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, lVar, lVar2);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(Qa.l lVar, Qa.l lVar2) {
        t.g(lVar, "onReceived");
        t.g(lVar2, "onError");
        return new 1(lVar, lVar2);
    }

    public static final void getStorefrontCountryCodeWith(Purchases purchases, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.getStorefrontCountryCode(new 1(lVar2, lVar));
    }

    public static /* synthetic */ void getStorefrontCountryCodeWith$default(Purchases purchases, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getStorefrontCountryCodeWith(purchases, lVar, lVar2);
    }

    public static final PurchaseCallback purchaseCompletedCallback(p pVar, p pVar2) {
        t.g(pVar, "onSuccess");
        t.g(pVar2, "onError");
        return new 1(pVar, pVar2);
    }

    public static final void purchaseWith(Purchases purchases, PurchaseParams purchaseParams, p pVar, p pVar2) {
        t.g(purchases, "<this>");
        t.g(purchaseParams, "purchaseParams");
        t.g(pVar, "onError");
        t.g(pVar2, "onSuccess");
        purchases.purchase(purchaseParams, purchaseCompletedCallback(pVar2, pVar));
    }

    public static /* synthetic */ void purchaseWith$default(Purchases purchases, PurchaseParams purchaseParams, p pVar, p pVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            pVar = ON_PURCHASE_ERROR_STUB;
        }
        purchaseWith(purchases, purchaseParams, pVar, pVar2);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(Qa.l lVar, Qa.l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        return new 1(lVar, lVar2);
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(Qa.l lVar, Qa.l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        return new 1(lVar, lVar2);
    }

    public static final void restorePurchasesWith(Purchases purchases, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        purchases.restorePurchases(receiveCustomerInfoCallback(lVar2, lVar));
    }

    public static /* synthetic */ void restorePurchasesWith$default(Purchases purchases, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, lVar, lVar2);
    }

    public static final void getProductsWith(Purchases purchases, List list, ProductType productType, Qa.l lVar, Qa.l lVar2) {
        t.g(purchases, "<this>");
        t.g(list, "productIds");
        t.g(lVar, "onError");
        t.g(lVar2, "onGetStoreProducts");
        purchases.getProducts(list, productType, getStoreProductsCallback(lVar2, lVar));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, ProductType productType, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, productType, lVar, lVar2);
    }
}

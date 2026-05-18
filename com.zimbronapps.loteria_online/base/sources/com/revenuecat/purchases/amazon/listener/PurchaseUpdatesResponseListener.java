package com.revenuecat.purchases.amazon.listener;

import Qa.l;
import Qa.p;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.UserDataResponse;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface PurchaseUpdatesResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        @Deprecated
        public static void onProductDataResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, ProductDataResponse productDataResponse) {
            t.g(productDataResponse, "response");
            PurchaseUpdatesResponseListener.access$onProductDataResponse$jd(purchaseUpdatesResponseListener, productDataResponse);
        }

        @Deprecated
        public static void onPurchaseResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, PurchaseResponse purchaseResponse) {
            t.g(purchaseResponse, "response");
            PurchaseUpdatesResponseListener.access$onPurchaseResponse$jd(purchaseUpdatesResponseListener, purchaseResponse);
        }

        @Deprecated
        public static void onUserDataResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponse userDataResponse) {
            t.g(userDataResponse, "response");
            PurchaseUpdatesResponseListener.access$onUserDataResponse$jd(purchaseUpdatesResponseListener, userDataResponse);
        }
    }

    static /* synthetic */ void access$onProductDataResponse$jd(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, ProductDataResponse productDataResponse) {
        super.onProductDataResponse(productDataResponse);
    }

    static /* synthetic */ void access$onPurchaseResponse$jd(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, PurchaseResponse purchaseResponse) {
        super.onPurchaseResponse(purchaseResponse);
    }

    static /* synthetic */ void access$onUserDataResponse$jd(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponse userDataResponse) {
        super.onUserDataResponse(userDataResponse);
    }

    default void onProductDataResponse(ProductDataResponse productDataResponse) {
        t.g(productDataResponse, "response");
    }

    default void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        t.g(purchaseResponse, "response");
    }

    default void onUserDataResponse(UserDataResponse userDataResponse) {
        t.g(userDataResponse, "response");
    }

    void queryPurchases(p pVar, l lVar);
}

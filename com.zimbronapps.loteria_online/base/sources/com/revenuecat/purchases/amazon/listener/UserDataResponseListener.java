package com.revenuecat.purchases.amazon.listener;

import Qa.l;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface UserDataResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        @Deprecated
        public static void onProductDataResponse(UserDataResponseListener userDataResponseListener, ProductDataResponse productDataResponse) {
            t.g(productDataResponse, "response");
            UserDataResponseListener.access$onProductDataResponse$jd(userDataResponseListener, productDataResponse);
        }

        @Deprecated
        public static void onPurchaseResponse(UserDataResponseListener userDataResponseListener, PurchaseResponse purchaseResponse) {
            t.g(purchaseResponse, "response");
            UserDataResponseListener.access$onPurchaseResponse$jd(userDataResponseListener, purchaseResponse);
        }

        @Deprecated
        public static void onPurchaseUpdatesResponse(UserDataResponseListener userDataResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
            t.g(purchaseUpdatesResponse, "response");
            UserDataResponseListener.access$onPurchaseUpdatesResponse$jd(userDataResponseListener, purchaseUpdatesResponse);
        }
    }

    static /* synthetic */ void access$onProductDataResponse$jd(UserDataResponseListener userDataResponseListener, ProductDataResponse productDataResponse) {
        super.onProductDataResponse(productDataResponse);
    }

    static /* synthetic */ void access$onPurchaseResponse$jd(UserDataResponseListener userDataResponseListener, PurchaseResponse purchaseResponse) {
        super.onPurchaseResponse(purchaseResponse);
    }

    static /* synthetic */ void access$onPurchaseUpdatesResponse$jd(UserDataResponseListener userDataResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
        super.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
    }

    void getUserData(l lVar, l lVar2);

    default void onProductDataResponse(ProductDataResponse productDataResponse) {
        t.g(productDataResponse, "response");
    }

    default void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        t.g(purchaseResponse, "response");
    }

    default void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        t.g(purchaseUpdatesResponse, "response");
    }
}

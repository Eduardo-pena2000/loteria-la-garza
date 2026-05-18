package com.revenuecat.purchases.amazon.listener;

import Qa.l;
import Qa.p;
import android.app.Activity;
import android.os.Handler;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.models.StoreProduct;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface PurchaseResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        @Deprecated
        public static void onProductDataResponse(PurchaseResponseListener purchaseResponseListener, ProductDataResponse productDataResponse) {
            t.g(productDataResponse, "response");
            PurchaseResponseListener.access$onProductDataResponse$jd(purchaseResponseListener, productDataResponse);
        }

        @Deprecated
        public static void onPurchaseUpdatesResponse(PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
            t.g(purchaseUpdatesResponse, "response");
            PurchaseResponseListener.access$onPurchaseUpdatesResponse$jd(purchaseResponseListener, purchaseUpdatesResponse);
        }

        @Deprecated
        public static void onUserDataResponse(PurchaseResponseListener purchaseResponseListener, UserDataResponse userDataResponse) {
            t.g(userDataResponse, "response");
            PurchaseResponseListener.access$onUserDataResponse$jd(purchaseResponseListener, userDataResponse);
        }
    }

    static /* synthetic */ void access$onProductDataResponse$jd(PurchaseResponseListener purchaseResponseListener, ProductDataResponse productDataResponse) {
        super.onProductDataResponse(productDataResponse);
    }

    static /* synthetic */ void access$onPurchaseUpdatesResponse$jd(PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
        super.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
    }

    static /* synthetic */ void access$onUserDataResponse$jd(PurchaseResponseListener purchaseResponseListener, UserDataResponse userDataResponse) {
        super.onUserDataResponse(userDataResponse);
    }

    default void onProductDataResponse(ProductDataResponse productDataResponse) {
        t.g(productDataResponse, "response");
    }

    default void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        t.g(purchaseUpdatesResponse, "response");
    }

    default void onUserDataResponse(UserDataResponse userDataResponse) {
        t.g(userDataResponse, "response");
    }

    void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, p pVar, l lVar);
}

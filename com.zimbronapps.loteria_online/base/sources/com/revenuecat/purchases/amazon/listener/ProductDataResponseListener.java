package com.revenuecat.purchases.amazon.listener;

import Qa.l;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface ProductDataResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        @Deprecated
        public static void onPurchaseResponse(ProductDataResponseListener productDataResponseListener, PurchaseResponse purchaseResponse) {
            t.g(purchaseResponse, "response");
            ProductDataResponseListener.access$onPurchaseResponse$jd(productDataResponseListener, purchaseResponse);
        }

        @Deprecated
        public static void onPurchaseUpdatesResponse(ProductDataResponseListener productDataResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
            t.g(purchaseUpdatesResponse, "response");
            ProductDataResponseListener.access$onPurchaseUpdatesResponse$jd(productDataResponseListener, purchaseUpdatesResponse);
        }

        @Deprecated
        public static void onUserDataResponse(ProductDataResponseListener productDataResponseListener, UserDataResponse userDataResponse) {
            t.g(userDataResponse, "response");
            ProductDataResponseListener.access$onUserDataResponse$jd(productDataResponseListener, userDataResponse);
        }
    }

    static /* synthetic */ void access$onPurchaseResponse$jd(ProductDataResponseListener productDataResponseListener, PurchaseResponse purchaseResponse) {
        super.onPurchaseResponse(purchaseResponse);
    }

    static /* synthetic */ void access$onPurchaseUpdatesResponse$jd(ProductDataResponseListener productDataResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
        super.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
    }

    static /* synthetic */ void access$onUserDataResponse$jd(ProductDataResponseListener productDataResponseListener, UserDataResponse userDataResponse) {
        super.onUserDataResponse(userDataResponse);
    }

    void getProductData(Set set, String str, l lVar, l lVar2);

    default void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        t.g(purchaseResponse, "response");
    }

    default void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        t.g(purchaseUpdatesResponse, "response");
    }

    default void onUserDataResponse(UserDataResponse userDataResponse) {
        t.g(userDataResponse, "response");
    }
}

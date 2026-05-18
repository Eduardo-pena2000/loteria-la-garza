package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import java.util.List;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BillingClientAdapter$queryProductDetailsAsync$productDetailsResponseListenerProxy$1 implements ProductDetailsResponseListener {
    final /* synthetic */ ProductDetailsListener $listener;

    public BillingClientAdapter$queryProductDetailsAsync$productDetailsResponseListenerProxy$1(ProductDetailsListener productDetailsListener) {
        this.$listener = productDetailsListener;
    }

    public void onProductDetailsResponse(BillingResultBridge billingResult, QueryProductDetailsResultsBridge queryProductDetailsResults) {
        t.g(billingResult, "billingResult");
        t.g(queryProductDetailsResults, "queryProductDetailsResults");
        List productDetailsList = queryProductDetailsResults.getProductDetailsList();
        if (productDetailsList.isEmpty()) {
            this.$listener.onProductDetailsResponse(billingResult, null);
        } else {
            JSONObject originalJson = ((ProductDetailsBridge) productDetailsList.get(0)).getOriginalJson();
            this.$listener.onProductDetailsResponse(billingResult, originalJson != null ? originalJson.toString() : null);
        }
    }
}

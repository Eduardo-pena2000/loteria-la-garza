package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Da.u;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;
    private final BillingClientBuilderBridge billingClientBuilderBridge;

    public BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge) {
        t.g(billingClientBuilderBridge, "billingClientBuilderBridge");
        this.billingClientBuilderBridge = billingClientBuilderBridge;
    }

    public String getAdapterVersion() {
        return "8";
    }

    public void initialize(BillingInitializationListener billingInitializationListener) {
        t.g(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        this.billingClientBuilderBridge.setListener(new PurchaseUpdatedListenerProxy(billingInitializationListener));
        this.billingClientBuilderBridge.enablePendingPurchases();
        BillingClientBridgeCommon build = this.billingClientBuilderBridge.build();
        t.e(build, "null cannot be cast to non-null type com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge");
        this.billingClient = (BillingClientBridge) build;
        startConnection(billingInitializationListener);
        get_isInitialized$unity_ads_defaultRelease().setValue(Boolean.TRUE);
    }

    public BillingResultResponseCode isFeatureSupported(String str) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            t.v("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isFeatureSupported(str);
    }

    public boolean isReady() {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            t.v("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isReady();
    }

    public void queryProductDetailsAsync(String productId, String productType, ProductDetailsListener listener) {
        t.g(productId, "productId");
        t.g(productType, "productType");
        t.g(listener, "listener");
        QueryProductDetailsParamsBridge build = QueryProductDetailsParamsBridge.Companion.newBuilder().setProductList(u.e(ProductBridge.Companion.newBuilder().setProductId(productId).setProductType(productType).build())).build();
        ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy = new ProductDetailsResponseListenerProxy(new BillingClientAdapter$queryProductDetailsAsync$productDetailsResponseListenerProxy$1(listener));
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            t.v("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryProductDetailsAsync(build, productDetailsResponseListenerProxy);
    }

    public void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            t.v("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryPurchasesAsync(str, new PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    public void startConnection(BillingClientStateListener billingClientStateListener) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            t.v("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
    }
}

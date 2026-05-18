package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

import Da.u;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;
    private final BillingClientBuilderBridge billingClientBuilderBridge;
    private final int detectedVersion;

    public static final class 1 implements SkuDetailsResponseListener {
        final /* synthetic */ ProductDetailsListener $listener;

        public 1(ProductDetailsListener productDetailsListener) {
            this.$listener = productDetailsListener;
        }

        public void onSkuDetailsUpdated(BillingResultBridge billingResult, List list) {
            t.g(billingResult, "billingResult");
            if (list == null || list.isEmpty()) {
                this.$listener.onProductDetailsResponse(billingResult, null);
                return;
            }
            ProductDetailsListener productDetailsListener = this.$listener;
            JSONObject originalJson = ((SkuDetailsBridge) list.get(0)).getOriginalJson();
            productDetailsListener.onProductDetailsResponse(billingResult, originalJson != null ? originalJson.toString() : null);
        }
    }

    public /* synthetic */ BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge, int i, int i2, k kVar) {
        this(billingClientBuilderBridge, (i2 & 2) != 0 ? 6 : i);
    }

    public String getAdapterVersion() {
        return String.valueOf(this.detectedVersion);
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
        t.e(build, "null cannot be cast to non-null type com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge");
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
        SkuDetailsParamsBridge build = SkuDetailsParamsBridge.newBuilder().setSkuList(u.e(productId)).setType(productType).build();
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            t.v("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.querySkuDetailsAsync(build, new SkuDetailsResponseListenerProxy(new 1(listener)));
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

    public BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge, int i) {
        t.g(billingClientBuilderBridge, "billingClientBuilderBridge");
        this.billingClientBuilderBridge = billingClientBuilderBridge;
        this.detectedVersion = i;
    }
}

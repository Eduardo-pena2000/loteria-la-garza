package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Ca.x;
import Da.S;
import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BillingClientBridge extends BillingClientBridgeCommon {
    public static final Companion Companion = new Companion(null);
    public static final String QUERY_PRODUCT_DETAILS_ASYNC_METHOD = "queryProductDetailsAsync";
    public static final String QUERY_PURCHASES_ASYNC_METHOD = "queryPurchasesAsync";

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final BillingClientBuilderBridge newBuilder(Context context) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
            t.g(context, "context");
            return new BillingClientBuilderBridge(BillingClientBridge.access$callNonVoidStaticMethod$s213701626("newBuilder", context));
        }

        private Companion() {
        }
    }

    public BillingClientBridge(Object obj) {
        super(obj, S.l(x.a("queryPurchasesAsync", new Class[]{QueryPurchasesParamsBridge.Companion.getClassForParams(), PurchasesResponseListenerProxy.getProxyListenerClass()}), x.a("queryProductDetailsAsync", new Class[]{QueryProductDetailsParamsBridge.Companion.getClassForParams(), ProductDetailsResponseListenerProxy.Companion.getProxyListenerClass()})));
    }

    public static final /* synthetic */ Object access$callNonVoidStaticMethod$s213701626(String str, Object... objArr) {
        return BillingClientBridgeCommon.callNonVoidStaticMethod(str, objArr);
    }

    public static final BillingClientBuilderBridge newBuilder(Context context) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return Companion.newBuilder(context);
    }

    public final void queryProductDetailsAsync(QueryProductDetailsParamsBridge queryProductDetailsParamsBridge, ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy) {
        t.g(queryProductDetailsParamsBridge, "queryProductDetailsParamsBridge");
        t.g(productDetailsResponseListenerProxy, "productDetailsResponseListenerProxy");
        callVoidMethod("queryProductDetailsAsync", this._billingClientInternalInstance, queryProductDetailsParamsBridge.getQueryProductDetailsParamsInternalInstance(), productDetailsResponseListenerProxy.getProxyInstance());
    }

    public void queryPurchasesAsync(String str, PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws ClassNotFoundException {
        if (str != null) {
            QueryProductDetailsParamsBridge build = QueryPurchasesParamsBridge.Companion.newBuilder().setProductType(str).build();
            Object obj = this._billingClientInternalInstance;
            Object queryProductDetailsParamsInternalInstance = build.getQueryProductDetailsParamsInternalInstance();
            t.d(purchasesResponseListenerProxy);
            callVoidMethod("queryPurchasesAsync", obj, queryProductDetailsParamsInternalInstance, purchasesResponseListenerProxy.getProxyInstance());
        }
    }

    public void querySkuDetailsAsync(SkuDetailsParamsBridge params, SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws ClassNotFoundException {
        t.g(params, "params");
        t.g(skuDetailsResponseListenerProxy, "skuDetailsResponseListenerProxy");
        throw new NoSuchMethodException("querySkuDetailsAsync does not exist in Billing Library v8, use queryProductDetailsAsync instead");
    }
}

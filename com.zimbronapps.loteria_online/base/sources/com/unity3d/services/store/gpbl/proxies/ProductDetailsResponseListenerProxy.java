package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import java.lang.reflect.Method;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ProductDetailsResponseListenerProxy extends GenericListenerProxy {
    public static final Companion Companion = new Companion(null);
    public static final String onProductDetailsResponseMethodName = "onProductDetailsResponse";
    private final ProductDetailsResponseListener productDetailsResponseListener;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Class getProxyListenerClass() throws ClassNotFoundException {
            t.f(com.android.billingclient.api.ProductDetailsResponseListener.class, "forName(\"com.android.bil…DetailsResponseListener\")");
            return com.android.billingclient.api.ProductDetailsResponseListener.class;
        }

        private Companion() {
        }
    }

    public ProductDetailsResponseListenerProxy(ProductDetailsResponseListener productDetailsResponseListener) {
        this.productDetailsResponseListener = productDetailsResponseListener;
    }

    private final void onPurchasesUpdated(Object obj, Object obj2) {
        QueryProductDetailsResultsBridge queryProductDetailsResultsBridge = new QueryProductDetailsResultsBridge(obj2);
        ProductDetailsResponseListener productDetailsResponseListener = this.productDetailsResponseListener;
        if (productDetailsResponseListener != null) {
            productDetailsResponseListener.onProductDetailsResponse(new BillingResultBridge(obj), queryProductDetailsResultsBridge);
        }
    }

    public final ProductDetailsResponseListener getProductDetailsResponseListener() {
        return this.productDetailsResponseListener;
    }

    public Class getProxyClass() {
        return Companion.getProxyListenerClass();
    }

    public Object invoke(Object proxy, Method method, Object[] objArr) {
        Object obj;
        t.g(proxy, "proxy");
        t.g(method, "method");
        if (!t.c(method.getName(), "onProductDetailsResponse")) {
            return super.invoke(proxy, method, objArr);
        }
        if (objArr != null && (obj = objArr[1]) != null) {
            onPurchasesUpdated(objArr[0], obj);
        }
        return null;
    }
}

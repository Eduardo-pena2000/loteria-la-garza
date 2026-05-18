package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BillingClientBridge extends BillingClientBridgeCommon {
    private static final String queryPurchasesAsyncMethodName = "queryPurchasesAsync";
    private static final String querySkuDetailsAsyncMethodName = "querySkuDetailsAsync";

    public class 1 extends HashMap {
        public 1() throws ClassNotFoundException {
            put("querySkuDetailsAsync", new Class[]{SkuDetailsParamsBridge.getClassForBridge(), SkuDetailsResponseListenerProxy.getProxyListenerClass()});
            put("queryPurchasesAsync", new Class[]{String.class, PurchasesResponseListenerProxy.getProxyListenerClass()});
        }
    }

    public BillingClientBridge(Object obj) throws ClassNotFoundException {
        super(obj, new 1());
    }

    public static BillingClientBuilderBridge newBuilder(Context context) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return new BillingClientBuilderBridge(BillingClientBridgeCommon.callNonVoidStaticMethod("newBuilder", context));
    }

    public void queryPurchasesAsync(String str, PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws ClassNotFoundException {
        callVoidMethod("queryPurchasesAsync", this._billingClientInternalInstance, str, purchasesResponseListenerProxy.getProxyInstance());
    }

    public void querySkuDetailsAsync(SkuDetailsParamsBridge skuDetailsParamsBridge, SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws ClassNotFoundException {
        callVoidMethod("querySkuDetailsAsync", this._billingClientInternalInstance, skuDetailsParamsBridge.getInternalInstance(), skuDetailsResponseListenerProxy.getProxyInstance());
    }
}

package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class BillingClientBuilderBridgeCommon extends GenericBridge implements IBillingClientBuilderBridge {
    protected static final String buildMethodName = "build";
    private static final String setListenerMethodName = "setListener";
    protected Object _billingClientBuilderInternalInstance;

    public class 1 extends HashMap {
        public 1() throws ClassNotFoundException {
            put("setListener", new Class[]{PurchaseUpdatedListenerProxy.getProxyListenerClass()});
            put("build", new Class[0]);
        }
    }

    public BillingClientBuilderBridgeCommon(Object obj, Map map) throws ClassNotFoundException {
        super(appendFunctionAnParameters(map));
        this._billingClientBuilderInternalInstance = obj;
    }

    private static Map appendFunctionAnParameters(Map map) throws ClassNotFoundException {
        map.putAll(new 1());
        return map;
    }

    public String getClassName() {
        return "com.android.billingclient.api.BillingClient$Builder";
    }

    public IBillingClientBuilderBridge setListener(PurchaseUpdatedListenerProxy purchaseUpdatedListenerProxy) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("setListener", this._billingClientBuilderInternalInstance, purchaseUpdatedListenerProxy.getProxyInstance());
        return this;
    }
}

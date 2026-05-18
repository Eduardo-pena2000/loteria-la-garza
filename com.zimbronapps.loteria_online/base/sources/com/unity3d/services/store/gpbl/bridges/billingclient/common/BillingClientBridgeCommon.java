package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class BillingClientBridgeCommon extends GenericBridge implements IBillingClient {
    protected static final String endConnectionMethodName = "endConnection";
    protected static final String isFeatureSupportedMethodName = "isFeatureSupported";
    protected static final String isReadyMethodName = "isReady";
    protected static final String newBuilderMethodName = "newBuilder";
    protected static final String queryPurchaseHistoryAsyncMethodName = "queryPurchaseHistoryAsync";
    protected static final String startConnectionMethodName = "startConnection";
    private static final Map staticMethods = new 1();
    protected final Object _billingClientInternalInstance;

    public class 1 extends HashMap {
        public 1() {
            put("newBuilder", new Class[]{Context.class});
        }
    }

    public class 2 extends HashMap {
        public 2() throws ClassNotFoundException {
            put("newBuilder", new Class[]{Context.class});
            put("startConnection", new Class[]{BillingClientStateListenerProxy.getProxyListenerClass()});
            put("endConnection", new Class[0]);
            put("queryPurchaseHistoryAsync", new Class[]{String.class, PurchaseHistoryResponseListenerProxy.getProxyListenerClass()});
            put("isFeatureSupported", new Class[]{String.class});
            put("isReady", new Class[0]);
        }
    }

    public BillingClientBridgeCommon(Object obj, Map map) throws ClassNotFoundException {
        super(appendFunctionAnParameters(map));
        this._billingClientInternalInstance = obj;
    }

    private static Map appendFunctionAnParameters(Map map) throws ClassNotFoundException {
        map.putAll(new 2());
        return map;
    }

    public static Object callNonVoidStaticMethod(String str, Object... objArr) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return getClassForBridge().getMethod(str, (Class[]) staticMethods.get(str)).invoke((Object) null, objArr);
    }

    public static Class getClassForBridge() throws ClassNotFoundException {
        return BillingClient.class;
    }

    public void endConnection() {
        callVoidMethod("endConnection", this._billingClientInternalInstance, new Object[0]);
    }

    public String getClassName() {
        return "com.android.billingclient.api.BillingClient";
    }

    public BillingResultResponseCode isFeatureSupported(String str) {
        return new BillingResultBridge(callNonVoidMethod("isFeatureSupported", this._billingClientInternalInstance, str)).getResponseCode();
    }

    public boolean isReady() {
        return ((Boolean) callNonVoidMethod("isReady", this._billingClientInternalInstance, new Object[0])).booleanValue();
    }

    public void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListenerProxy purchaseHistoryResponseListenerProxy) throws ClassNotFoundException {
        callVoidMethod("queryPurchaseHistoryAsync", this._billingClientInternalInstance, str, purchaseHistoryResponseListenerProxy.getProxyInstance());
    }

    public void startConnection(BillingClientStateListenerProxy billingClientStateListenerProxy) throws ClassNotFoundException {
        callVoidMethod("startConnection", this._billingClientInternalInstance, billingClientStateListenerProxy.getProxyInstance());
    }
}

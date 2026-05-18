package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BillingClientStateListenerProxy extends GenericListenerProxy {
    private static String onBillingServiceDisconnectedMethodName = "onBillingServiceDisconnected";
    private static String onBillingSetupFinishedMethodName = "onBillingSetupFinished";
    private BillingClientStateListener billingClientStateListener;

    public BillingClientStateListenerProxy(BillingClientStateListener billingClientStateListener) {
        this.billingClientStateListener = billingClientStateListener;
    }

    public static Class getProxyListenerClass() throws ClassNotFoundException {
        return com.android.billingclient.api.BillingClientStateListener.class;
    }

    private void onBillingServiceDisconnected() {
        BillingClientStateListener billingClientStateListener = this.billingClientStateListener;
        if (billingClientStateListener != null) {
            billingClientStateListener.onBillingServiceDisconnected();
        }
    }

    private void onBillingSetupFinished(Object obj) {
        BillingClientStateListener billingClientStateListener = this.billingClientStateListener;
        if (billingClientStateListener != null) {
            billingClientStateListener.onBillingSetupFinished(new BillingResultBridge(obj));
        }
    }

    public Class getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals(onBillingSetupFinishedMethodName)) {
            onBillingSetupFinished(objArr[0]);
        } else {
            if (!method.getName().equals(onBillingServiceDisconnectedMethodName)) {
                return super.invoke(obj, method, objArr);
            }
            onBillingServiceDisconnected();
        }
        return null;
    }
}

package com.unity3d.services.store.gpbl.proxies;

import com.android.billingclient.api.PurchasesUpdatedListener;
import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PurchaseUpdatedListenerProxy extends GenericListenerProxy {
    private static final String onPurchasesUpdatedMethodName = "onPurchasesUpdated";
    private PurchaseUpdatedResponseListener purchaseUpdatedResponseListener;

    public PurchaseUpdatedListenerProxy(PurchaseUpdatedResponseListener purchaseUpdatedResponseListener) {
        this.purchaseUpdatedResponseListener = purchaseUpdatedResponseListener;
    }

    public static Class getProxyListenerClass() throws ClassNotFoundException {
        return PurchasesUpdatedListener.class;
    }

    public Class getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onPurchasesUpdated")) {
            return super.invoke(obj, method, objArr);
        }
        onPurchasesUpdated(objArr[0], (List) objArr[1]);
        return null;
    }

    public void onPurchasesUpdated(Object obj, List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new PurchaseBridge(it.next()));
            }
        } else {
            arrayList = null;
        }
        PurchaseUpdatedResponseListener purchaseUpdatedResponseListener = this.purchaseUpdatedResponseListener;
        if (purchaseUpdatedResponseListener != null) {
            purchaseUpdatedResponseListener.onPurchaseUpdated(new BillingResultBridge(obj), arrayList);
        }
    }
}

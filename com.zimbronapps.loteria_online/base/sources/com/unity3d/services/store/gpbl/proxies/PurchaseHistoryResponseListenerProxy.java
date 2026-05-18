package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PurchaseHistoryResponseListenerProxy extends GenericListenerProxy {
    private static final String onPurchaseHistoryResponseMethodName = "onPurchaseHistoryResponse";
    private int _maxPurchases;
    private PurchaseHistoryResponseListener purchaseHistoryResponseListener;

    public PurchaseHistoryResponseListenerProxy(PurchaseHistoryResponseListener purchaseHistoryResponseListener, int i) {
        this.purchaseHistoryResponseListener = purchaseHistoryResponseListener;
        this._maxPurchases = i;
    }

    public static Class getProxyListenerClass() throws ClassNotFoundException {
        return com.android.billingclient.api.PurchaseHistoryResponseListener.class;
    }

    public Class getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onPurchaseHistoryResponse")) {
            return super.invoke(obj, method, objArr);
        }
        onPurchaseHistoryResponse(objArr[0], (List) objArr[1]);
        return null;
    }

    public void onPurchaseHistoryResponse(Object obj, List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < this._maxPurchases && i < list.size(); i++) {
                arrayList.add(new PurchaseHistoryRecordBridge(list.get(i)));
            }
        } else {
            arrayList = null;
        }
        PurchaseHistoryResponseListener purchaseHistoryResponseListener = this.purchaseHistoryResponseListener;
        if (purchaseHistoryResponseListener != null) {
            purchaseHistoryResponseListener.onPurchaseHistoryUpdated(new BillingResultBridge(obj), arrayList);
        }
    }
}

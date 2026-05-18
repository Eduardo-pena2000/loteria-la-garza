package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PurchasesResultBridge extends GenericBridge {
    private static final String getBillingResultMethodName = "getBillingResult";
    private static final String getPurchasesListMethodName = "getPurchasesList";
    private final Object _purchasesResult;

    public class 1 extends HashMap {
        public 1() {
            put("getBillingResult", new Class[0]);
            put("getPurchasesList", new Class[0]);
        }
    }

    public PurchasesResultBridge(Object obj) {
        super(new 1());
        this._purchasesResult = obj;
    }

    public BillingResultBridge getBillingResult() {
        return new BillingResultBridge(callNonVoidMethod("getBillingResult", this._purchasesResult, new Object[0]));
    }

    public String getClassName() {
        return "com.android.billingclient.api.Purchase$PurchasesResult";
    }

    public List getPurchasesList() {
        List list = (List) callNonVoidMethod("getPurchasesList", this._purchasesResult, new Object[0]);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new PurchaseBridge(it.next()));
            }
        }
        return arrayList;
    }
}

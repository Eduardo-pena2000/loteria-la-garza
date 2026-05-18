package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BillingResultBridge extends GenericBridge {
    private static final String getResponseCodeMethodName = "getResponseCode";
    private final Object _billingResult;

    public class 1 extends HashMap {
        public 1() {
            put("getResponseCode", new Class[0]);
        }
    }

    public BillingResultBridge(Object obj) {
        super(new 1());
        this._billingResult = obj;
    }

    public String getClassName() {
        return "com.android.billingclient.api.BillingResult";
    }

    public BillingResultResponseCode getResponseCode() {
        return BillingResultResponseCode.fromResponseCode(((Integer) callNonVoidMethod("getResponseCode", this._billingResult, new Object[0])).intValue());
    }
}

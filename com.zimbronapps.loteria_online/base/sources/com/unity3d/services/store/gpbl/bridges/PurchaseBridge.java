package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.log.DeviceLog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PurchaseBridge extends CommonJsonResponseBridge {
    private static final String getSignatureMethodName = "getSignature";
    private final Object _purchase;

    public class 1 extends HashMap {
        public 1() {
            put("getSignature", new Class[0]);
        }
    }

    public PurchaseBridge(Object obj) {
        super(obj, new 1());
        this._purchase = obj;
    }

    public String getClassName() {
        return "com.android.billingclient.api.Purchase";
    }

    public String getSignature() {
        return (String) callNonVoidMethod("getSignature", this._purchase, new Object[0]);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseData", getOriginalJson());
            jSONObject.put("signature", getSignature());
        } catch (JSONException e) {
            DeviceLog.warning("Could not build Purchase result Json: ", e.getMessage());
        }
        return jSONObject;
    }
}

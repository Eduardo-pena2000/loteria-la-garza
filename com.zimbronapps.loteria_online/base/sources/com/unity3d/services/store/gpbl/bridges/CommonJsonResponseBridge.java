package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.JsonSerializable;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class CommonJsonResponseBridge extends GenericBridge implements BillingOriginalJsonResponse, JsonSerializable {
    private static final String getOriginalJsonMethodName = "getOriginalJson";
    private final Object _internalBridgeRef;

    public class 1 extends HashMap {
        public 1() {
            put("getOriginalJson", new Class[0]);
        }
    }

    public CommonJsonResponseBridge(Object obj) {
        this(obj, new HashMap());
    }

    private static Map appendCommonResponseMethods(Map map) {
        map.putAll(new 1());
        return map;
    }

    public JSONObject getOriginalJson() {
        try {
            return new JSONObject((String) callNonVoidMethod("getOriginalJson", this._internalBridgeRef, new Object[0]));
        } catch (JSONException e) {
            DeviceLog.error("Couldn't parse BillingResponse JSON : %s", e.getMessage());
            return null;
        }
    }

    public JSONObject toJson() {
        return getOriginalJson();
    }

    public CommonJsonResponseBridge(Object obj, Map map) {
        super(appendCommonResponseMethods(map));
        this._internalBridgeRef = obj;
    }
}

package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.DeviceLog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class JsonFlattener {
    private final JSONObject _jsonData;

    public JsonFlattener(JSONObject jSONObject) {
        this._jsonData = jSONObject;
    }

    private boolean shouldIncludeKey(String str, List list, List list2) {
        if (!list2.contains(str) && list.size() > 0) {
            return list.contains(str);
        }
        return false;
    }

    public JSONObject flattenJson(String str, JsonFlattenerRules jsonFlattenerRules) {
        return jsonFlattenerRules == null ? new JSONObject() : flattenJson(str, jsonFlattenerRules.getTopLevelToInclude(), jsonFlattenerRules.getReduceKeys(), jsonFlattenerRules.getSkipKeys());
    }

    public JSONObject flattenJson(String str, List list, List list2, List list3) {
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator keys = this._jsonData.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (shouldIncludeKey(str2, list, list3)) {
                    Object opt = this._jsonData.opt(str2);
                    if (opt instanceof JSONObject) {
                        new JsonFlattener((JSONObject) opt).flattenJson(str, str2, jSONObject, list2, list3);
                    } else {
                        jSONObject.put(str2, opt);
                    }
                }
            }
        } catch (JSONException e) {
            DeviceLog.error("Could not flatten JSON: %s", e.getMessage());
        }
        return jSONObject;
    }

    public void flattenJson(String str, String str2, JSONObject jSONObject, List list, List list2) throws JSONException {
        Iterator keys = this._jsonData.keys();
        while (keys.hasNext()) {
            String str3 = (String) keys.next();
            if (!list2.contains(str3)) {
                Object obj = this._jsonData.get(str3);
                String format = list.contains(str3) ? str2 : String.format("%s%s%s", new Object[]{str2, str, str3});
                if (obj instanceof JSONObject) {
                    new JsonFlattener((JSONObject) obj).flattenJson(str, format, jSONObject, list, list2);
                } else {
                    jSONObject.put(format, obj);
                }
            }
        }
    }
}

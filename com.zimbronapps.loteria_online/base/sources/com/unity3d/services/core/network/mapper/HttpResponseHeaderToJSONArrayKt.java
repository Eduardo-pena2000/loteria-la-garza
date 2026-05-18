package com.unity3d.services.core.network.mapper;

import Da.v;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpResponseHeaderToJSONArrayKt {
    public static final JSONArray toResponseHeadersMap(Map map) {
        Iterable<Map.Entry> entrySet;
        if (map != null && (entrySet = map.entrySet()) != null) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : entrySet) {
                jSONArray = jSONArray.put(new JSONArray(v.q((String) entry.getKey(), (List) entry.getValue())));
                t.f(jSONArray, "acc.put(JSONArray(listOf(key, value)))");
            }
            if (jSONArray != null) {
                return jSONArray;
            }
        }
        return new JSONArray();
    }
}

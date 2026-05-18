package com.revenuecat.purchases.common.networking;

import Ca.x;
import Da.Q;
import Qa.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class MapConverter {
    private final /* synthetic */ Object tryCast(Object obj, l lVar) {
        t.l(3, "T");
        return obj != null ? lVar.invoke(obj) : obj;
    }

    public final JSONObject convertToJSON$purchases_defaultsBc8Release(Map map) {
        t.g(map, "inputMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                Collection collection = (Iterable) value;
                if ((collection instanceof Collection) && collection.isEmpty()) {
                    value = new JSONObject(Q.f(x.a("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (!(it.next() instanceof String)) {
                            break;
                        }
                    }
                    value = new JSONObject(Q.f(x.a("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
                }
            } else if (value instanceof Map) {
                value = convertToJSON$purchases_defaultsBc8Release((Map) value);
            }
            linkedHashMap.put(key, value);
        }
        return createJSONObject$purchases_defaultsBc8Release(linkedHashMap);
    }

    public final JSONObject createJSONObject$purchases_defaultsBc8Release(Map map) {
        t.g(map, "inputMap");
        return new JSONObject(map);
    }
}

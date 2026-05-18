package com.revenuecat.purchases.utils;

import Qa.l;
import Za.E;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MapExtensionsKt {
    public static final Map filterNotNullValues(Map map) {
        t.g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String getStringValueForPrimitive(Map map, String key) {
        t.g(map, "<this>");
        t.g(key, "key");
        Object obj = map.get(key);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof String ? true : obj instanceof Number ? true : obj instanceof Boolean ? true : obj instanceof Character)) {
            return null;
        }
        String obj2 = obj.toString();
        if (E.h0(obj2)) {
            return null;
        }
        return obj2;
    }

    public static final Map mapNotNullKeys(Map map, l transform) {
        t.g(map, "<this>");
        t.g(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object invoke = transform.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(invoke, entry.getValue());
            }
        }
        return linkedHashMap;
    }
}

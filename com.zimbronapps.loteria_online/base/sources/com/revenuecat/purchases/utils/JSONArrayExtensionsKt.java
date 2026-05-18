package com.revenuecat.purchases.utils;

import Da.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class JSONArrayExtensionsKt {
    public static final List replaceJsonNullWithKotlinNull(List list) {
        t.g(list, "<this>");
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        for (Object obj : list) {
            if (obj instanceof Map) {
                t.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull, T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull?>");
                obj = JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull((Map) obj);
            } else if (obj instanceof List) {
                t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull?>");
                obj = replaceJsonNullWithKotlinNull((List) obj);
            } else if (t.c(obj, JSONObject.NULL)) {
                obj = null;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final List toList(JSONArray jSONArray) {
        t.g(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                obj = JSONObjectExtensionsKt.toMap((JSONObject) obj, true);
            } else if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}

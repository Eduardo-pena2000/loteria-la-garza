package com.revenuecat.purchases.utils;

import Ca.q;
import Ca.x;
import Da.Q;
import Da.S;
import Qa.l;
import Ya.o;
import Ya.r;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class JSONObjectExtensionsKt {

    public static final class 1 extends u implements l {
        final /* synthetic */ boolean $deep;
        final /* synthetic */ JSONObject $this_toMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(boolean z, JSONObject jSONObject) {
            super(1);
            this.$deep = z;
            this.$this_toMap = jSONObject;
        }

        public final q invoke(String str) {
            if (!this.$deep) {
                return x.a(str, this.$this_toMap.get(str));
            }
            Object obj = this.$this_toMap.get(str);
            if (obj instanceof JSONObject) {
                obj = JSONObjectExtensionsKt.toMap((JSONObject) obj, true);
            } else if (obj instanceof JSONArray) {
                obj = JSONArrayExtensionsKt.toList((JSONArray) obj);
            }
            return x.a(str, obj);
        }
    }

    public static final JSONObject copy(JSONObject jSONObject, boolean z) {
        t.g(jSONObject, "<this>");
        return new JSONObject(toMap(jSONObject, z));
    }

    public static /* synthetic */ JSONObject copy$default(JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copy(jSONObject, z);
    }

    public static final Date getDate(JSONObject jSONObject, String jsonKey) {
        t.g(jSONObject, "<this>");
        t.g(jsonKey, "jsonKey");
        Date parse = Iso8601Utils.parse(jSONObject.getString(jsonKey));
        t.f(parse, "parse(getString(jsonKey))");
        return parse;
    }

    public static final Integer getNullableInt(JSONObject jSONObject, String name) {
        t.g(jSONObject, "<this>");
        t.g(name, "name");
        if (jSONObject.isNull(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return Integer.valueOf(jSONObject.getInt(name));
        }
        return null;
    }

    public static final String getNullableString(JSONObject jSONObject, String name) {
        t.g(jSONObject, "<this>");
        t.g(name, "name");
        if (jSONObject.isNull(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static final Date optDate(JSONObject jSONObject, String jsonKey) {
        t.g(jSONObject, "<this>");
        t.g(jsonKey, "jsonKey");
        if (jSONObject.isNull(jsonKey)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getDate(jSONObject, jsonKey);
        }
        return null;
    }

    public static final Integer optNullableInt(JSONObject jSONObject, String name) {
        t.g(jSONObject, "<this>");
        t.g(name, "name");
        if (!jSONObject.has(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableInt(jSONObject, name);
        }
        return null;
    }

    public static final String optNullableString(JSONObject jSONObject, String name) {
        t.g(jSONObject, "<this>");
        t.g(name, "name");
        if (!jSONObject.has(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableString(jSONObject, name);
        }
        return null;
    }

    public static final Map replaceJsonNullWithKotlinNull(Map map) {
        t.g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                t.e(value, "null cannot be cast to non-null type kotlin.collections.Map<K of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull, V of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull?>");
                value = replaceJsonNullWithKotlinNull((Map) value);
            } else if (value instanceof List) {
                t.e(value, "null cannot be cast to non-null type kotlin.collections.List<V of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull?>");
                value = JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull((List) value);
            } else if (t.c(value, JSONObject.NULL)) {
                value = null;
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static final Map toMap(JSONObject jSONObject, boolean z) {
        t.g(jSONObject, "<this>");
        Iterator keys = jSONObject.keys();
        t.f(keys, "this.keys()");
        return S.v(r.z(o.e(keys), new 1(z, jSONObject)));
    }

    public static /* synthetic */ Map toMap$default(JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toMap(jSONObject, z);
    }
}

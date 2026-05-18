package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.l;
import Ca.m;
import Ca.q;
import Ca.x;
import Da.p;
import Da.r;
import Ya.h;
import Ya.o;
import cb.K;
import cb.O;
import cb.P;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class MappersHelpersKt {
    private static K overrideMapperDispatcher;
    private static final l mapperDispatcher$delegate = m.b(MappersHelpersKt$mapperDispatcher$2.INSTANCE);
    private static final O mainScope = P.b();

    public static final JSONObject convertToJson(Map map) {
        t.g(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                jSONObject.put(str, JSONObject.NULL);
            } else if (value instanceof Map) {
                t.e(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                jSONObject.put(str, convertToJson((Map) value));
            } else if (value instanceof List) {
                jSONObject.put(str, convertToJsonArray((List) value));
            } else if (value instanceof Object[]) {
                jSONObject.put(str, convertToJsonArray(r.S0((Object[]) value)));
            } else {
                jSONObject.put(str, value);
            }
        }
        return jSONObject;
    }

    public static final JSONArray convertToJsonArray(List list) {
        t.g(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj == null) {
                jSONArray.put(JSONObject.NULL);
            } else if (obj instanceof Map) {
                t.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                jSONArray.put(convertToJson((Map) obj));
            } else if (obj instanceof Object[]) {
                jSONArray.put(convertToJsonArray(p.c((Object[]) obj)));
            } else if (obj instanceof List) {
                jSONArray.put(convertToJsonArray((List) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static final Map convertToMap(JSONObject jSONObject) {
        t.g(jSONObject, "<this>");
        Iterator keys = jSONObject.keys();
        t.f(keys, "this.keys()");
        h<String> e = o.e(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : e) {
            q a = jSONObject.isNull(str) ? x.a(str, (Object) null) : x.a(str, jSONObject.getString(str));
            linkedHashMap.put(a.c(), a.d());
        }
        return linkedHashMap;
    }

    public static final String formatUsingDeviceLocale(String str, long j) {
        t.g(str, "priceCurrencyCode");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(Currency.getInstance(str));
        String format = currencyInstance.format(j);
        t.f(format, "getCurrencyInstance().ap…ode)\n    }.format(number)");
        return format;
    }

    public static final O getMainScope() {
        return mainScope;
    }

    public static final K getMapperDispatcher() {
        return (K) mapperDispatcher$delegate.getValue();
    }

    public static final K getOverrideMapperDispatcher() {
        return overrideMapperDispatcher;
    }

    public static final void setOverrideMapperDispatcher(K k) {
        overrideMapperDispatcher = k;
    }

    public static final String toIso8601(Date date) {
        t.g(date, "<this>");
        String format = Iso8601Utils.format(date);
        t.f(format, "format(this)");
        return format;
    }

    public static final long toMillis(Date date) {
        t.g(date, "<this>");
        return date.getTime();
    }
}

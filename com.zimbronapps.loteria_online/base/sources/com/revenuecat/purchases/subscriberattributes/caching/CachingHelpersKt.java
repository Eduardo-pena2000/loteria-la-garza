package com.revenuecat.purchases.subscriberattributes.caching;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CachingHelpersKt {
    public static final JSONObject toJSONObject(Map map) {
        t.g(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Map map2 = (Map) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : map2.entrySet()) {
                jSONObject2.put((String) entry2.getKey(), ((SubscriberAttribute) entry2.getValue()).toJSONObject());
            }
            jSONObject.put(str, jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("attributes", jSONObject);
        return jSONObject3;
    }
}

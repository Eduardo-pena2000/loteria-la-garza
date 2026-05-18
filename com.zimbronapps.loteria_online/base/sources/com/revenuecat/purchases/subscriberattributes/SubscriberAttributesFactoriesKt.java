package com.revenuecat.purchases.subscriberattributes;

import Ca.q;
import Ca.x;
import Da.S;
import Qa.l;
import Ya.o;
import Ya.r;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesFactoriesKt {

    public static final class 1 extends u implements l {
        final /* synthetic */ JSONObject $this_buildSubscriberAttributesMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(JSONObject jSONObject) {
            super(1);
            this.$this_buildSubscriberAttributesMap = jSONObject;
        }

        public final q invoke(String str) {
            Object obj = this.$this_buildSubscriberAttributesMap.get(str);
            t.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return x.a(str, new SubscriberAttribute((JSONObject) obj));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ JSONObject $attributesJSONObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(JSONObject jSONObject) {
            super(1);
            this.$attributesJSONObject = jSONObject;
        }

        public final q invoke(String str) {
            Object obj = this.$attributesJSONObject.get(str);
            t.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return x.a(str, SubscriberAttributesFactoriesKt.buildSubscriberAttributesMap((JSONObject) obj));
        }
    }

    public static final Map buildLegacySubscriberAttributes(JSONObject jSONObject) {
        t.g(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        t.f(jSONObject2, "attributesJSONObject");
        return buildSubscriberAttributesMap(jSONObject2);
    }

    public static final Map buildSubscriberAttributesMap(JSONObject jSONObject) {
        t.g(jSONObject, "<this>");
        Iterator keys = jSONObject.keys();
        t.f(keys, "this.keys()");
        return S.v(r.z(o.e(keys), new 1(jSONObject)));
    }

    public static final Map buildSubscriberAttributesMapPerUser(JSONObject jSONObject) {
        t.g(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        Iterator keys = jSONObject2.keys();
        t.f(keys, "attributesJSONObject.keys()");
        return S.v(r.z(o.e(keys), new 1(jSONObject2)));
    }
}

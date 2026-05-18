package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class v5 extends i5 {
    private final a3 g;
    private final JSONArray h;
    private final Context i;
    private final a.a j;

    public v5(a3 a3Var, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.a aVar) {
        super("TaskFetchMediatedAd", kVar, a3Var.b());
        this.g = a3Var;
        this.h = jSONArray;
        this.i = context;
        this.j = aVar;
    }

    public static /* synthetic */ void a(v5 v5Var, JSONObject jSONObject) {
        v5Var.b(jSONObject);
    }

    private void b(JSONObject jSONObject) {
        try {
            r0.c(jSONObject, this.a);
            r0.b(jSONObject, this.a);
            r0.a(jSONObject, this.a);
            l3.f(jSONObject, this.a);
            l3.d(jSONObject, this.a);
            l3.e(jSONObject, this.a);
            l3.g(jSONObject, this.a);
            this.a.m().a();
            MaxAdFormat a2 = this.g.a();
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (a2 == formatFromString) {
                a(jSONObject);
                return;
            }
            String b = this.g.b();
            if (formatFromString == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "Mediated ad response is missing the ad format field for ad unit " + b);
                }
                if (jSONObject.has("ads")) {
                    Map hashMap = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", hashMap);
                    CollectionUtils.putStringIfValid("ad_unit_id", b, hashMap);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), hashMap);
                    this.a.D().a(d2.a1, this.b, hashMap);
                }
                this.j.onAdLoadFailed(b, MaxAdapterError.NO_FILL);
                return;
            }
            String label = formatFromString.getLabel();
            String label2 = a2.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + b + ") is assigned to the correct ad format.";
            if (n7.a(a2, formatFromString)) {
                com.applovin.impl.sdk.o.j(this.b, str);
                a(jSONObject);
                return;
            }
            l1.a(str, new Object[0]);
            com.applovin.impl.sdk.o.h(this.b, str);
            this.j.onAdLoadFailed(b, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            Map hashMap2 = CollectionUtils.hashMap("ad_unit_id", b);
            CollectionUtils.putStringIfValid("name", label2, hashMap2);
            CollectionUtils.putStringIfValid("details", label, hashMap2);
            this.a.D().a(d2.S0, "incompatible_ad_format", hashMap2);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Unable to process mediated ad response for ad unit " + this.g.b(), th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.a.X().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !n7.h(com.applovin.impl.sdk.k.o())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.a.a(x4.M4)).booleanValue()) {
            u3 Y = this.a.Y();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            s3 s3Var = s3.f;
            JsonUtils.putAll(jSONObject3, Y.a(s3Var, t3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, Y.a(s3Var, t3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, Y.a(s3.g, t3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return l3.a(this.a);
    }

    private String f() {
        return l3.b(this.a);
    }

    private JSONObject g() {
        Map a2 = this.a.A().a((Map) null, false, true);
        a2.putAll(this.g.c());
        JSONObject jSONObject = new JSONObject(a2);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private Map h() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("AppLovin-Ad-Unit-Id", this.g.b());
        hashMap.put("AppLovin-Ad-Format", this.g.a().getLabel());
        Map d = this.g.d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", d.get("retry_attempt"), hashMap);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", d.get("retry_delay_sec"), hashMap);
        return hashMap;
    }

    public void run() {
        MaxAdFormat a2 = this.g.a();
        String b = this.g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Fetching next ad for " + a2.getLabel() + " ad unit " + b);
        }
        k2.a();
        if (((Boolean) this.a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "User is connected to a VPN");
        }
        this.a.P().a(d2.h0, a2, b, (MaxError) null);
        if (((Boolean) this.a.a(x4.M4)).booleanValue()) {
            u3 Y = this.a.Y();
            s3 s3Var = s3.f;
            Y.a(s3Var, t3.a(b));
            Y.a(s3Var, t3.a(a2));
        }
        n7.a(this.a, this.b);
        try {
            JSONObject g = g();
            Map hashMap = new HashMap();
            if (!((Boolean) this.a.a(x4.B5)).booleanValue() && !((Boolean) this.a.a(x4.z5)).booleanValue()) {
                hashMap.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.a.a(x4.k5)).booleanValue()) {
                hashMap.put("sdk_key", this.a.i0());
            }
            if (this.a.s0().c()) {
                hashMap.put("test_mode", "1");
            }
            List b2 = this.a.s0().b();
            String str = (String) this.a.n0().getExtraParameters().get("fan");
            if (b2 != null && !b2.isEmpty()) {
                String a3 = H3.a(",", b2);
                hashMap.put("filter_ad_network", a3);
                if (!this.a.s0().c()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.a.s0().d()) {
                    hashMap.put("force_ad_network", a3);
                }
            } else if (StringUtils.isValidString(str)) {
                hashMap.put("filter_ad_network", str);
            }
            a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).c("POST").a(h()).b(f()).a(e()).b(hashMap).a(g).b(((Boolean) this.a.a(r3.y8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.a.a(r3.s7)).intValue()).a(((Integer) this.a.a(x4.W2)).intValue()).b(((Long) this.a.a(r3.r7)).intValue()).a(u4.a.a(((Integer) this.a.a(x4.q5)).intValue())).f(true).a(), this.a, b, a2);
            aVar.c(r3.p7);
            aVar.b(r3.q7);
            this.a.q0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Unable to fetch ad for Ad Unit ID: " + b, th);
            }
            a("", 0, th.getMessage());
        }
    }

    public class a extends l6 {
        final /* synthetic */ String m;
        final /* synthetic */ MaxAdFormat n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, String str, MaxAdFormat maxAdFormat) {
            super(aVar, kVar);
            this.m = str;
            this.n = maxAdFormat;
        }

        public void a(String str, JSONObject jSONObject, int i) {
            if (i == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.l.b());
                Map hashMap = new HashMap(6);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
                CollectionUtils.putStringIfValid("code", String.valueOf(i), hashMap);
                CollectionUtils.putStringIfValid("ad_unit_id", this.m, hashMap);
                CollectionUtils.putStringIfValid("ad_format", this.n.getLabel(), hashMap);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.l.a()), hashMap);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.l.b()), hashMap);
                this.a.P().d(d2.i0, hashMap);
                v5.a(v5.this, jSONObject);
                return;
            }
            v5.a(v5.this, str, i, null);
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            v5.a(v5.this, str, i, str2);
            this.a.D().a("fetchMediatedAd", str, i, str2);
        }
    }

    public static /* synthetic */ void a(v5 v5Var, String str, int i, String str2) {
        v5Var.a(str, i, str2);
    }

    private void e(JSONObject jSONObject) {
        String b = this.g.b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", b);
        jSONObject2.put("ad_format", this.g.a().getLabel());
        Map map = CollectionUtils.map(this.g.d());
        com.applovin.impl.sdk.p a0 = this.a.a0();
        CollectionUtils.putStringIfValid("previous_request_id", a0.b(b), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", a0.a(b), map);
        p.a c = a0.c(b);
        if (c != null) {
            if (Boolean.parseBoolean((String) this.a.n0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", c.a());
                map.put("previous_winning_network_name", c.c());
            }
            if (this.a.R() != null) {
                Queue<y2> c2 = this.a.R().c(b);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (y2 y2Var : c2) {
                    arrayList.add(y2Var.c());
                    arrayList2.add(y2Var.getNetworkName());
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", H3.a(",", arrayList), map);
                CollectionUtils.putStringIfValid("queued_ad_network_names", H3.a(",", arrayList2), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.a.T().a()));
            jSONObject2.put("installed", w3.b(this.a));
            jSONObject2.put("initialized", this.a.S().b());
            jSONObject2.put("initialized_classnames", new JSONArray(this.a.S().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.a.T().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.a.T().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    private void a(JSONObject jSONObject) {
        f6 f6Var = new f6(this.g, jSONObject, this.i, this.a, this.j);
        long j = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j > 0) {
            this.a.q0().a(f6Var, d6.b.MEDIATION, j, true);
        } else {
            this.a.q0().a(f6Var);
        }
    }

    private void a(String str, int i, String str2) {
        MaxErrorImpl maxErrorImpl;
        String b = this.g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "Unable to fetch ad for ad unit " + b + ": server returned " + i);
        }
        if (i == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        Map hashMap = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
        CollectionUtils.putStringIfValid("code", String.valueOf(i), hashMap);
        CollectionUtils.putStringIfValid("error_message", str2, hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", b, hashMap);
        CollectionUtils.putStringIfValid("ad_format", this.g.a().getLabel(), hashMap);
        this.a.P().d(d2.j0, hashMap);
        t2.a(this.j, b, maxErrorImpl);
    }

    private void h(JSONObject jSONObject) {
        JSONArray jSONArray = this.h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.a.n0().getExtraParameters()));
    }
}

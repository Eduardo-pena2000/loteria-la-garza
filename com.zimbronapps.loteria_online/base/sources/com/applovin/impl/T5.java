package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import com.applovin.sdk.AppLovinSdk;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class t5 extends i5 {
    private static final AtomicBoolean j = new AtomicBoolean();
    private final int g;
    private final Object h;
    private b i;

    public interface b {
        void a(JSONObject jSONObject);
    }

    public class c extends i5 {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        public void run() {
            if (t5.a(t5.this) != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "Timing out fetch basic settings...");
                }
                t5.a(t5.this, new JSONObject());
            }
        }
    }

    public t5(int i, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.h = new Object();
        this.g = i;
        this.i = bVar;
    }

    public static /* synthetic */ void a(t5 t5Var, JSONObject jSONObject) {
        t5Var.a(jSONObject);
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return r0.a((String) this.a.a(x4.k0), "5.0/i", b());
    }

    private String g() {
        return r0.a((String) this.a.a(x4.j0), "5.0/i", b());
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = this.a;
            x4 x4Var = x4.z5;
            if (((Boolean) kVar.a(x4Var)).booleanValue() || ((Boolean) this.a.a(x4Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
            jSONObject.put("init_count", this.g);
            jSONObject.put("server_installed_at", this.a.a(x4.o));
            if (this.a.C0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.a.z0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", n7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", n7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.a.a(x4.L3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.a.C());
            jSONObject.put("installed_mediation_adapters", w3.b(this.a));
            Map G = this.a.A().G();
            jSONObject.put("package_name", G.get("package_name"));
            jSONObject.put("app_version", G.get("app_version"));
            jSONObject.put("debug", G.get("debug"));
            jSONObject.put("tg", G.get("tg"));
            jSONObject.put("target_sdk", G.get("target_sdk"));
            jSONObject.put("session_id", G.get("session_id"));
            List list = (List) G.get("application_start_info");
            if (!CollectionUtils.isEmpty((Collection) list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray(list));
            }
            List list2 = (List) G.get("application_exit_info");
            if (!CollectionUtils.isEmpty((Collection) list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray(list2));
            }
            List adUnitIds = this.a.J() != null ? this.a.J().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", G.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_gdprApplies", G.get("IABTCF_gdprApplies"));
            Object obj = G.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.a.x().b());
            Map N = this.a.A().N();
            jSONObject.put("platform", N.get("platform"));
            jSONObject.put("os", N.get("os"));
            jSONObject.put("locale", N.get("locale"));
            jSONObject.put("brand", N.get("brand"));
            jSONObject.put("brand_name", N.get("brand_name"));
            jSONObject.put("hardware", N.get("hardware"));
            jSONObject.put("model", N.get("model"));
            jSONObject.put("revision", N.get("revision"));
            jSONObject.put("is_tablet", N.get("is_tablet"));
            jSONObject.put("screen_size_in", N.get("screen_size_in"));
            jSONObject.put("supported_abis", N.get("supported_abis"));
            Object obj2 = N.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.a.a(x4.W3)).booleanValue()) {
                jSONObject.put("mtl", this.a.m0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            v.a f = this.a.A().f();
            jSONObject.put("dnt", f.c());
            jSONObject.put("dnt_code", f.b().b());
            Boolean b2 = p0.c().b(a());
            if (((Boolean) this.a.a(x4.G3)).booleanValue() && StringUtils.isValidString(f.a()) && !Boolean.TRUE.equals(b2)) {
                jSONObject.put("idfa", f.a());
            }
            l.b H = this.a.A().H();
            if (((Boolean) this.a.a(x4.z3)).booleanValue() && H != null && !Boolean.TRUE.equals(b2)) {
                jSONObject.put("idfv", H.a);
                jSONObject.put("idfv_scope", H.b);
            }
            if (((Boolean) this.a.a(x4.C3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.a.u());
            }
            if (((Boolean) this.a.a(x4.E3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.a.h0());
            }
            if (((Boolean) this.a.a(x4.I3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.a.r());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.a.E());
            if (this.a.s0().c()) {
                jSONObject.put("test_mode", true);
            }
            List b3 = this.a.s0().b();
            if (b3 != null && !b3.isEmpty()) {
                jSONObject.put("test_mode_networks", b3);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.a.n0().getExtraParameters()));
            Map k0 = this.a.k0();
            if (!CollectionUtils.isEmpty(k0)) {
                jSONObject.put("segments", new JSONObject(k0));
            }
        } catch (JSONException e) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Failed to create JSON body", e);
            }
            this.a.D().a(this.b, "createJSONBody", e);
        }
        return jSONObject;
    }

    public Map h() {
        HashMap hashMap = new HashMap();
        if (!((Boolean) this.a.a(x4.A5)).booleanValue() && !((Boolean) this.a.a(x4.z5)).booleanValue()) {
            hashMap.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.a.a(x4.k5)).booleanValue()) {
            hashMap.put("sdk_key", this.a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.a.q(), hashMap);
        Boolean b2 = p0.b().b(a());
        if (b2 != null) {
            hashMap.put("huc", b2.toString());
        }
        Boolean b3 = p0.c().b(a());
        if (b3 != null) {
            hashMap.put("aru", b3.toString());
        }
        Boolean b4 = p0.a().b(a());
        if (b4 != null) {
            hashMap.put("dns", b4.toString());
        }
        return hashMap;
    }

    public void run() {
        if (!o0.i() && j.compareAndSet(false, true)) {
            try {
                m7.a.a(com.applovin.impl.sdk.k.o());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.a(this.b, "Cannot update security provider", th);
                }
            }
        }
        this.a.v0().d(d2.g, (Map) b(g()));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.applovin.impl.sdk.network.a a2 = com.applovin.impl.sdk.network.a.a(this.a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.a.a(x4.L5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.a.a(x4.c3)).intValue()).b(((Integer) this.a.a(x4.f3)).intValue()).c(((Integer) this.a.a(x4.b3)).intValue()).e(((Boolean) this.a.a(x4.o3)).booleanValue()).a(u4.a.a(((Integer) this.a.a(x4.p5)).intValue())).f(true).a();
        this.a.q0().a(new c(this.a), d6.b.TIMEOUT, ((Integer) this.a.a(r3)).intValue() + 250);
        a aVar = new a(a2, this.a, d(), elapsedRealtime);
        aVar.c(x4.j0);
        aVar.b(x4.k0);
        this.a.q0().a(aVar);
    }

    public class a extends l6 {
        final /* synthetic */ long m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z, long j) {
            super(aVar, kVar, z);
            this.m = j;
        }

        public void a(String str, JSONObject jSONObject, int i) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            t5.a(t5.this, jSONObject);
            this.a.v0().d(d2.h, (Map) t5.a(t5.this, str, elapsedRealtime, i, jSONObject, null));
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to fetch basic SDK settings: server returned " + i);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            t5.a(t5.this, jSONObject != null ? jSONObject : new JSONObject());
            this.a.v0().d(d2.i, (Map) t5.a(t5.this, str, elapsedRealtime, i, jSONObject, str2));
        }
    }

    public static /* synthetic */ HashMap a(t5 t5Var, String str, long j2, int i, JSONObject jSONObject, String str2) {
        return t5Var.a(str, j2, i, jSONObject, str2);
    }

    public static /* synthetic */ b a(t5 t5Var) {
        return t5Var.i;
    }

    private HashMap a(String str, long j2, int i, JSONObject jSONObject, String str2) {
        Uri build = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "domain", build.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("attempt_number", Integer.toString(this.g));
        hashMap.put("error_message", str2);
        hashMap.put("url", build.toString());
        hashMap.put("details", jSONObject2.toString());
        hashMap.put("duration_ms", Long.toString(j2));
        hashMap.put("code", Integer.toString(i));
        return hashMap;
    }

    private void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.h) {
            bVar = this.i;
            this.i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}

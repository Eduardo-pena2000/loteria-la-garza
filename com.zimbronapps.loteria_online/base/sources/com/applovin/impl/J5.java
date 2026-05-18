package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class j5 extends i5 {
    public j5(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    public static /* synthetic */ void a(j5 j5Var, JSONObject jSONObject) {
        j5Var.a(jSONObject);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.l A = this.a.A();
        Map p = A.p();
        n7.a("platform", "type", p);
        n7.a("api_level", "sdk_version", p);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(p));
        Map G = A.G();
        n7.a("sdk_version", "applovin_sdk_version", G);
        n7.a("ia", "installed_at", G);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(G));
    }

    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d(this.b, "Submitting user data...");
        }
        Map c = r0.c(this.a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.a.a(x4.F5)).booleanValue() || ((Boolean) this.a.a(x4.z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, c);
            c = null;
        }
        a(c, jSONObject);
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, JSONObject jSONObject, int i) {
            j5.a(j5.this, jSONObject);
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            r0.a(i, this.a);
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.a.o0().a(x4.f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.a.o0().a(x4.j, JsonUtils.getString(jSONObject2, "device_token", ""));
        r0.a(jSONObject2, this.a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).b(r0.b("2.0/device", this.a)).a(r0.a("2.0/device", this.a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.a.a(x4.M5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.a.a(x4.Z2)).intValue()).a(u4.a.a(((Integer) this.a.a(x4.w5)).intValue())).a(), this.a);
        aVar.c(x4.n0);
        aVar.b(x4.o0);
        this.a.q0().a(aVar);
    }
}

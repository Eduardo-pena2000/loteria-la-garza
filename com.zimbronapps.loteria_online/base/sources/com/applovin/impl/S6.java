package com.applovin.impl;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class s6 extends i5 {
    private final p2 g;
    private final Exception h;

    public s6(com.applovin.impl.sdk.k kVar, p2 p2Var, Exception exc) {
        super("TaskValidateLicense", kVar);
        this.g = p2Var;
        this.h = exc;
    }

    private String e() {
        return r0.a((String) this.a.a(x4.v0), (String) this.a.a(x4.w0), this.a);
    }

    private JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        v.a f = this.a.A().f();
        JsonUtils.putBoolean(jSONObject, "dnt", f.c());
        JsonUtils.putString(jSONObject, "dnt_code", f.b().b());
        if (((Boolean) this.a.a(x4.y3)).booleanValue() && StringUtils.isValidString(f.a())) {
            JsonUtils.putString(jSONObject, "idfa", f.a());
        }
        l.b H = this.a.A().H();
        if (((Boolean) this.a.a(x4.z3)).booleanValue() && H != null) {
            JsonUtils.putString(jSONObject, "idfv", H.a);
            JsonUtils.putInt(jSONObject, "idfv_scope", H.b);
        }
        String e = this.a.w0().e();
        if (((Boolean) this.a.a(x4.A3)).booleanValue() && StringUtils.isValidString(e)) {
            JsonUtils.putString(jSONObject, "cuid", e);
        }
        if (((Boolean) this.a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.a.u());
        }
        if (((Boolean) this.a.a(x4.F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.a.h0());
        }
        JsonUtils.putAll(jSONObject, this.a.A().e());
        JSONObject jSONObject2 = new JSONObject();
        p2 p2Var = this.g;
        if (p2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", p2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.g.c());
            JsonUtils.putInt(jSONObject2, "n", this.g.b());
        }
        Exception exc = this.h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return r0.a((String) this.a.a(x4.u0), (String) this.a.a(x4.w0), this.a);
    }

    public void run() {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).b(g()).a(e()).a(f()).c("POST").b(((Boolean) this.a.a(x4.Q5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.a.a(x4.t3)).intValue()).a(u4.a.a(((Integer) this.a.a(x4.y5)).intValue())).a(), this.a);
        aVar.c(x4.u0);
        aVar.b(x4.v0);
        this.a.q0().a(aVar);
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, JSONObject jSONObject, int i) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "License Validation successful");
            }
            a5.b(z4.i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            Map map = CollectionUtils.map("code", String.valueOf(i));
            CollectionUtils.putStringIfValid("url", str, map);
            this.a.v0().d(d2.l, map);
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Failed to validate license: ");
            }
            if (!this.a.c(x4.A).contains(String.valueOf(i))) {
                a5.b(z4.i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.a.v0().d(d2.m, map);
        }
    }
}

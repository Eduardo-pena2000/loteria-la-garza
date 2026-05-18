package com.applovin.impl;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f7 {
    private final com.applovin.impl.sdk.k a;
    private boolean b;
    private List c;

    public f7(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        z4 z4Var = z4.I;
        this.b = ((Boolean) kVar.a(z4Var, Boolean.FALSE)).booleanValue() || y.a(com.applovin.impl.sdk.k.o()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || kVar.A().U();
        kVar.c(z4Var);
    }

    private void e() {
        com.applovin.impl.sdk.j t = this.a.t();
        if (this.b) {
            t.b(this.c);
        } else {
            t.a(this.c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public List b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        List list = this.c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.c == null) {
            return;
        }
        if (list == null || !list.equals(this.c)) {
            this.c = list;
            e();
        }
    }

    public void a() {
        this.a.b(z4.I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        com.applovin.impl.sdk.l A = this.a.A();
        boolean U = A.U();
        String a = A.f().a();
        l.b H = A.H();
        this.b = U || JsonUtils.containsCaseInsensitiveString(a, jSONArray) || JsonUtils.containsCaseInsensitiveString(H != null ? H.a : null, jSONArray);
    }
}

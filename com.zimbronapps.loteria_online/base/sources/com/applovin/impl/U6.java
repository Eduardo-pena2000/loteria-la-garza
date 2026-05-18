package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class u6 extends v6 {
    private final c3 g;

    public u6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.g = c3Var;
    }

    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.g.getFormat().getLabel());
        String s0 = this.g.s0();
        if (!StringUtils.isValidString(s0)) {
            s0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", s0);
        String B = this.g.B();
        if (!StringUtils.isValidString(B)) {
            B = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", B);
    }

    public String f() {
        return "2.0/mvr";
    }

    public boolean h() {
        return this.g.w0();
    }

    public void a(o4 o4Var) {
        this.g.a(o4Var);
    }

    public void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.g.a(o4.a(str));
        this.a.P().a(d2.v0, this.g, CollectionUtils.hashMap("error_message", str));
    }
}

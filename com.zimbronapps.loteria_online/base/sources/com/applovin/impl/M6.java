package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class m6 extends o6 {
    private final com.applovin.impl.sdk.ad.b g;

    public m6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.g = bVar;
    }

    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.g.P());
        String clCode = this.g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Reported reward successfully for ad: " + this.g);
        }
    }

    public String f() {
        return "2.0/cr";
    }

    public o4 h() {
        return this.g.i();
    }

    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "No reward result was found for ad: " + this.g);
        }
    }

    public void a(int i) {
        super.a(i);
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "Failed to report reward for ad: " + this.g + " - error code: " + i);
        }
        this.a.g().a(d2.H, this.g);
    }
}

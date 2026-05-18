package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class j6 extends i5 {
    private final JSONObject g;
    private final JSONObject h;
    private final AppLovinAdLoadListener i;

    public j6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.g = jSONObject;
        this.h = jSONObject2;
        this.i = appLovinAdLoadListener;
    }

    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.g, this.h, this.a);
        boolean booleanValue = JsonUtils.getBoolean(this.g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        m5 m5Var = new m5(aVar, this.a, this.i);
        m5Var.c(booleanValue2);
        m5Var.b(booleanValue);
        this.a.q0().a((i5) m5Var, d6.b.CACHING);
    }
}

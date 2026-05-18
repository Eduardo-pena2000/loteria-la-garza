package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class y0 extends v0 {
    private Map c;

    public y0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public Map f() {
        return this.c;
    }

    public String g() {
        return JsonUtils.getString(this.b, "name", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", name=" + g() + "}";
    }
}

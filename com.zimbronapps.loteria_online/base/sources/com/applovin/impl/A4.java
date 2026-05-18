package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a4 {
    private final String a;
    private final String b;

    public a4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.a = JsonUtils.getString(jSONObject, "id", "");
        this.b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

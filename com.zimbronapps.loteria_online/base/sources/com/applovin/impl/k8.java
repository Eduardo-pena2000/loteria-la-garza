package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class k8 {
    private final String a;
    private final String b;
    private final List c;

    public k8(JSONObject jSONObject) {
        this.a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public List c() {
        return this.c;
    }
}

package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a7 {
    private final a a;
    private final Integer b;
    private final String c;
    private final String d;
    private Boolean e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        private static a b(int i) {
            return i != 0 ? i != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }

        public static /* synthetic */ a a(int i) {
            return b(i);
        }
    }

    public a7(JSONObject jSONObject, String str) {
        this.d = str;
        this.a = a.a(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.b = JsonUtils.getInteger(jSONObject, "id", null);
        this.c = JsonUtils.getString(jSONObject, "name", null);
    }

    public void a(Boolean bool) {
        this.e = bool;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.c;
    }

    public Integer d() {
        return this.b;
    }

    public String e() {
        Boolean bool = this.e;
        return "\n" + this.d + " - " + (bool != null ? String.valueOf(bool) : p0.b().a(com.applovin.impl.sdk.k.o()));
    }

    public a f() {
        return this.a;
    }

    public Boolean a() {
        return this.e;
    }
}

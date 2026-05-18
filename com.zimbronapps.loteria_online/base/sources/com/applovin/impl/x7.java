package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class x7 implements q4 {
    private String a;
    private String b;

    private x7() {
    }

    public static x7 a(p8 p8Var, x7 x7Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (x7Var == null) {
            try {
                x7Var = new x7();
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastSystemInfo", "Error occurred while initializing", th);
                }
                kVar.D().a("VastSystemInfo", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(x7Var.a)) {
            String d = p8Var.d();
            if (StringUtils.isValidString(d)) {
                x7Var.a = d;
            }
        }
        if (!StringUtils.isValidString(x7Var.b)) {
            String str = (String) p8Var.a().get("version");
            if (StringUtils.isValidString(str)) {
                x7Var.b = str;
            }
        }
        return x7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        String str = this.a;
        if (str == null ? x7Var.a != null : !str.equals(x7Var.a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = x7Var.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.a + "', version='" + this.b + "'}";
    }

    public static x7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        x7 x7Var = new x7();
        x7Var.a = JsonUtils.getString(jSONObject, "name", null);
        x7Var.b = JsonUtils.getString(jSONObject, "version", null);
        return x7Var;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.a);
        JsonUtils.putString(jSONObject, "version", this.b);
        return jSONObject;
    }
}

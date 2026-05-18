package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class w7 implements q4 {
    private a a;
    private Uri b;
    private String c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private w7() {
    }

    public static w7 a(p8 p8Var, w7 w7Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (w7Var == null) {
            try {
                w7Var = new w7();
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastNonVideoResource", "Error occurred while initializing", th);
                }
                kVar.D().a("VastNonVideoResource", th);
                return null;
            }
        }
        if (w7Var.b == null && !StringUtils.isValidString(w7Var.c)) {
            String a2 = a(p8Var, "StaticResource");
            if (URLUtil.isValidUrl(a2)) {
                w7Var.b = Uri.parse(a2);
                w7Var.a = a.STATIC;
                return w7Var;
            }
            String a3 = a(p8Var, "IFrameResource");
            if (StringUtils.isValidString(a3)) {
                w7Var.a = a.IFRAME;
                if (URLUtil.isValidUrl(a3)) {
                    w7Var.b = Uri.parse(a3);
                } else {
                    w7Var.c = a3;
                }
                return w7Var;
            }
            String a4 = a(p8Var, "HTMLResource");
            if (StringUtils.isValidString(a4)) {
                w7Var.a = a.HTML;
                if (URLUtil.isValidUrl(a4)) {
                    w7Var.b = Uri.parse(a4);
                } else {
                    w7Var.c = a4;
                }
            }
        }
        return w7Var;
    }

    public String b() {
        return this.c;
    }

    public Uri c() {
        return this.b;
    }

    public a d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        if (this.a != w7Var.a) {
            return false;
        }
        Uri uri = this.b;
        if (uri == null ? w7Var.b != null : !uri.equals(w7Var.b)) {
            return false;
        }
        String str = this.c;
        String str2 = w7Var.c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.a + ", resourceUri=" + this.b + ", resourceContents='" + this.c + "'}";
    }

    private static String a(p8 p8Var, String str) {
        p8 c = p8Var.c(str);
        if (c != null) {
            return c.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    public void a(String str) {
        this.c = str;
    }

    public static w7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a valueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri parse = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        w7 w7Var = new w7();
        w7Var.a = valueOf;
        w7Var.b = parse;
        w7Var.c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return w7Var;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.c);
        return jSONObject;
    }
}

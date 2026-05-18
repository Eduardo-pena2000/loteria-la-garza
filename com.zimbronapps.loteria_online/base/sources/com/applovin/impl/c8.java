package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c8 implements q4 {
    private Uri a;
    private Uri b;
    private a c;
    private String d;
    private int e;
    private int f;
    private long g;

    public enum a {
        Progressive,
        Streaming
    }

    private c8() {
    }

    public static c8 a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String d = p8Var.d();
            if (!URLUtil.isValidUrl(d)) {
                kVar.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return null;
                }
                kVar.O().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri parse = Uri.parse(d);
            c8 c8Var = new c8();
            c8Var.a = parse;
            c8Var.b = parse;
            c8Var.g = a(p8Var);
            c8Var.c = a((String) p8Var.a().get("delivery"));
            c8Var.f = StringUtils.parseInt((String) p8Var.a().get("height"));
            c8Var.e = StringUtils.parseInt((String) p8Var.a().get("width"));
            c8Var.d = ((String) p8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return c8Var;
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastVideoFile", "Error occurred while initializing", th);
            }
            kVar.D().a("VastVideoFile", th);
            return null;
        }
    }

    public long b() {
        return this.g;
    }

    public String c() {
        return this.d;
    }

    public Uri d() {
        return this.a;
    }

    public Uri e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        if (this.e != c8Var.e || this.f != c8Var.f || this.g != c8Var.g) {
            return false;
        }
        Uri uri = this.a;
        if (uri == null ? c8Var.a != null : !uri.equals(c8Var.a)) {
            return false;
        }
        Uri uri2 = this.b;
        if (uri2 == null ? c8Var.b != null : !uri2.equals(c8Var.b)) {
            return false;
        }
        if (this.c != c8Var.c) {
            return false;
        }
        String str = this.d;
        String str2 = c8Var.d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.d;
        return ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31) + Long.valueOf(this.g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.a + ", videoUri=" + this.b + ", deliveryType=" + this.c + ", fileType='" + this.d + "', width=" + this.e + ", height=" + this.f + ", bitrate=" + this.g + '}';
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(p8 p8Var) {
        Map a2 = p8Var.a();
        long parseLong = StringUtils.parseLong((String) a2.get("bitrate"), 0L);
        return parseLong != 0 ? parseLong : (StringUtils.parseLong((String) a2.get("minBitrate"), 0L) + StringUtils.parseLong((String) a2.get("maxBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    public static c8 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri parse = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri parse2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a valueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = JsonUtils.getInt(jSONObject, "height", 0);
        int i3 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        c8 c8Var = new c8();
        c8Var.a = parse;
        c8Var.b = parse2;
        c8Var.c = valueOf;
        c8Var.d = string2;
        c8Var.e = i;
        c8Var.f = i2;
        c8Var.g = i3;
        return c8Var;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.d);
        JsonUtils.putInt(jSONObject, "width", this.e);
        JsonUtils.putInt(jSONObject, "height", this.f);
        JsonUtils.putLong(jSONObject, "bitrate", this.g);
        return jSONObject;
    }
}

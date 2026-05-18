package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class r7 implements q4 {
    private int a;
    private int b;
    private Uri c;
    private w7 d;
    private final Set e = new HashSet();
    private final Map f = new HashMap();

    private r7() {
    }

    public static r7 a(p8 p8Var, r7 r7Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        p8 c;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (r7Var == null) {
            try {
                r7Var = new r7();
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastCompanionAd", "Error occurred while initializing", th);
                }
                kVar.D().a("VastCompanionAd", th);
                return null;
            }
        }
        if (r7Var.a == 0 && r7Var.b == 0) {
            int parseInt = StringUtils.parseInt((String) p8Var.a().get("width"));
            int parseInt2 = StringUtils.parseInt((String) p8Var.a().get("height"));
            if (parseInt > 0 && parseInt2 > 0) {
                r7Var.a = parseInt;
                r7Var.b = parseInt2;
            }
        }
        r7Var.d = w7.a(p8Var, r7Var.d, kVar);
        if (r7Var.c == null && (c = p8Var.c("CompanionClickThrough")) != null) {
            String d = c.d();
            if (StringUtils.isValidString(d)) {
                r7Var.c = Uri.parse(d);
            }
        }
        a8.a(p8Var.a("CompanionClickTracking"), r7Var.e, s7Var, kVar);
        a8.a(p8Var, r7Var.f, s7Var, kVar);
        return r7Var;
    }

    public Set b() {
        return this.e;
    }

    public Uri c() {
        return this.c;
    }

    public Map d() {
        return this.f;
    }

    public w7 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        if (this.a != r7Var.a || this.b != r7Var.b) {
            return false;
        }
        Uri uri = this.c;
        if (uri == null ? r7Var.c != null : !uri.equals(r7Var.c)) {
            return false;
        }
        w7 w7Var = this.d;
        if (w7Var == null ? r7Var.d != null : !w7Var.equals(r7Var.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? r7Var.e != null : !set.equals(r7Var.e)) {
            return false;
        }
        Map map = this.f;
        Map map2 = r7Var.f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        Uri uri = this.c;
        int hashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        w7 w7Var = this.d;
        int hashCode2 = (hashCode + (w7Var != null ? w7Var.hashCode() : 0)) * 31;
        Set set = this.e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.a + ", height=" + this.b + ", destinationUri=" + this.c + ", nonVideoResource=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f + '}';
    }

    public static r7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri parse = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        w7 a = w7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            y7 a2 = y7.a(JsonUtils.getJSONObject(jSONArray, i3, (JSONObject) null), kVar);
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        r7 r7Var = new r7();
        r7Var.a = i;
        r7Var.b = i2;
        r7Var.c = parse;
        r7Var.d = a;
        r7Var.e.addAll(hashSet);
        return r7Var;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.a);
        JsonUtils.putInt(jSONObject, "height", this.b);
        Uri uri = this.c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        w7 w7Var = this.d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", w7Var != null ? w7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((y7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}

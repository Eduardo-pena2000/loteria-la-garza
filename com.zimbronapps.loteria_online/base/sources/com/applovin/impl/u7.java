package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class u7 implements q4 {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    private Uri c;
    private Uri d;
    private int e;
    private int f;

    public static u7 a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        p8 c = p8Var.c("StaticResource");
        if (c == null || !URLUtil.isValidUrl(c.d())) {
            kVar.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            kVar.O().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        u7 u7Var = new u7();
        u7Var.c = Uri.parse(c.d());
        p8 b = p8Var.b("IconClickThrough");
        if (b != null && URLUtil.isValidUrl(b.d())) {
            u7Var.d = Uri.parse(b.d());
        }
        String str = (String) p8Var.a().get("width");
        int i = 0;
        int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) p8Var.a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i = Integer.parseInt(str2);
        }
        int intValue = ((Integer) kVar.a(x4.W4)).intValue();
        if (parseInt <= 0 || i <= 0) {
            u7Var.f = intValue;
            u7Var.e = intValue;
        } else {
            double d = parseInt / i;
            int min = Math.min(Math.max(parseInt, i), intValue);
            if (parseInt >= i) {
                u7Var.e = min;
                u7Var.f = (int) (min / d);
            } else {
                u7Var.f = min;
                u7Var.e = (int) (min * d);
            }
        }
        return u7Var;
    }

    public Set b() {
        return this.a;
    }

    public Uri c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    public Uri e() {
        return this.c;
    }

    public Set f() {
        return this.b;
    }

    public int g() {
        return this.e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, kVar);
        return imageView;
    }

    public static u7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        y7 a;
        y7 a2;
        if (jSONObject == null) {
            return null;
        }
        u7 u7Var = new u7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        u7Var.c = Uri.parse(string);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null && (a2 = y7.a(jSONObject2, kVar)) != null) {
                u7Var.a.add(a2);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "view_trackers", new JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && (a = y7.a(jSONObject3, kVar)) != null) {
                u7Var.b.add(a);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        u7Var.d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        u7Var.e = JsonUtils.getInt(jSONObject, "width", 0);
        u7Var.f = JsonUtils.getInt(jSONObject, "height", 0);
        return u7Var;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((y7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((y7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.e);
        JsonUtils.putInt(jSONObject, "height", this.f);
        return jSONObject;
    }
}

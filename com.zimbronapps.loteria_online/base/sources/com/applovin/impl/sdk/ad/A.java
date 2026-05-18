package com.applovin.impl.sdk.ad;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.adview.e;
import com.applovin.impl.g4;
import com.applovin.impl.h5;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a extends b implements q4 {
    private final String n;
    private final String o;
    private final String p;
    private final g4 q;

    public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.n = g1();
        this.o = k1();
        this.p = j1();
        this.q = new g4(this);
    }

    public static /* synthetic */ void e1(a aVar, h5 h5Var) {
        aVar.s(h5Var);
    }

    private String j1() {
        return getStringFromAdObject("stream_url", "");
    }

    private /* synthetic */ void s(h5 h5Var) {
        h5Var.b("html", this.n);
        h5Var.b("stream_url", this.p);
    }

    public boolean C0() {
        return containsKeyForAdObject("stream_url");
    }

    public void E0() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.a(new d(this));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.n);
            JsonUtils.putString(this.adObject, "stream_url", this.p);
        }
    }

    public String I() {
        return this.o;
    }

    public void a(List list) {
        String g1 = g1();
        if (CollectionUtils.isEmpty((Collection) list) || TextUtils.isEmpty(g1)) {
            return;
        }
        Map l = l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String uri = ((Uri) it.next()).toString();
            String str = (String) l.get(uri);
            if (StringUtils.isValidString(str)) {
                g1 = StringUtils.replace(g1, uri, str);
            }
        }
        d(g1);
    }

    public void c(Uri uri) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    public Uri c0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : e1();
    }

    public void d(String str) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    public e.a f1() {
        return a(getIntFromAdObject("expandable_style", e.a.INVISIBLE.b()));
    }

    public String g1() {
        return getStringFromAdObject("html", "");
    }

    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        JSONObject jSONObject;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            jSONObject = h5Var.a();
        } else {
            synchronized (this.fullResponseLock) {
                deepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObject = deepCopy;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject2, "html", this.n);
            JsonUtils.putString(jSONObject2, "video", this.o);
            JsonUtils.putString(jSONObject2, "stream_url", this.p);
        }
        return jSONObject;
    }

    public float h1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public boolean hasVideoUrl() {
        return l0() != null;
    }

    public String i1() {
        return this.p;
    }

    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.e0().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    public String k1() {
        return getStringFromAdObject("video", "");
    }

    public Uri l0() {
        String j1 = j1();
        if (StringUtils.isValidString(j1)) {
            return Uri.parse(j1);
        }
        String k1 = k1();
        if (StringUtils.isValidString(k1)) {
            return Uri.parse(k1);
        }
        return null;
    }

    public boolean l1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public void m1() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    public boolean y0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public Uri e1() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public g4 getAdEventTracker() {
        return this.q;
    }

    public static a a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null || (jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null)) == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, "html", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, "video", "");
        JsonUtils.putString(jSONObject3, "html", JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, "video", JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        a aVar = new a(jSONObject3, jSONObject2, kVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator keys = jSONObject4.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String string3 = JsonUtils.getString(jSONObject4, str, null);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(string3)) {
                aVar.a(str, string3);
            }
        }
        aVar.d(string);
        if (StringUtils.isValidString(string2)) {
            aVar.c(Uri.parse(string2));
        }
        return aVar;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.n);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.o);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.p);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : l().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", h5Var.a());
        } else {
            synchronized (this.fullResponseLock) {
                JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
            }
        }
        return jSONObject;
    }
}

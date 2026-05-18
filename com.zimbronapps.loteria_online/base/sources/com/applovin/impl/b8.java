package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b8 implements q4 {
    private List a;
    private List b;
    private int c;
    private Uri d;
    private final Set e;
    private u7 f;
    private final Map g;

    private b8() {
        this.a = Collections.emptyList();
        this.b = Collections.emptyList();
        this.e = new HashSet();
        this.g = new HashMap();
    }

    public static b8 a(p8 p8Var, b8 b8Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        p8 c;
        u7 a;
        List a2;
        p8 c2;
        List a3;
        p8 c3;
        int a4;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (s7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (b8Var == null) {
            try {
                b8Var = new b8(s7Var);
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastVideoCreative", "Error occurred while initializing", th);
                }
                kVar.D().a("VastVideoCreative", th);
                return null;
            }
        }
        if (b8Var.c == 0 && (c3 = p8Var.c("Duration")) != null && (a4 = a(c3.d(), kVar)) > 0) {
            b8Var.c = a4;
        }
        p8 c4 = p8Var.c("MediaFiles");
        if (c4 != null && (a3 = a(c4, kVar)) != null && a3.size() > 0) {
            List list = b8Var.a;
            if (list != null) {
                a3.addAll(list);
            }
            b8Var.a = a3;
        }
        p8 c5 = p8Var.c("VideoClicks");
        if (c5 != null) {
            if (b8Var.d == null && (c2 = c5.c("ClickThrough")) != null) {
                String d = c2.d();
                if (StringUtils.isValidString(d)) {
                    b8Var.d = Uri.parse(d);
                }
            }
            a8.a(c5.a("ClickTracking"), b8Var.e, s7Var, kVar);
        }
        p8 c6 = p8Var.c("Icons");
        if (c6 != null && (a = u7.a((c = c6.c("Icon")), kVar)) != null) {
            p8 c7 = c.c("IconClicks");
            if (c7 != null && (a2 = c7.a("IconClickTracking")) != null) {
                a8.a(a2, a.a, s7Var, kVar);
            }
            List a5 = c.a("IconViewTracking");
            if (a5 != null) {
                a8.a(a5, a.b, s7Var, kVar);
            }
            b8Var.f = a;
        }
        a8.a(p8Var, b8Var.g, s7Var, kVar);
        return b8Var;
    }

    public static /* synthetic */ int b(c8 c8Var, c8 c8Var2) {
        return a(c8Var, c8Var2);
    }

    public Uri c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    public Map e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        if (this.c != b8Var.c) {
            return false;
        }
        List list = this.a;
        if (list == null ? b8Var.a != null : !list.equals(b8Var.a)) {
            return false;
        }
        Uri uri = this.d;
        if (uri == null ? b8Var.d != null : !uri.equals(b8Var.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? b8Var.e != null : !set.equals(b8Var.e)) {
            return false;
        }
        Map map = this.g;
        Map map2 = b8Var.g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public u7 f() {
        return this.f;
    }

    public List g() {
        return this.a;
    }

    public int hashCode() {
        List list = this.a;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.c) * 31;
        Uri uri = this.d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.g;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.a + ", durationSeconds=" + this.c + ", destinationUri=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.g + ", industryIcon=" + this.f + '}';
    }

    public Set b() {
        return this.e;
    }

    private b8(s7 s7Var) {
        this.a = Collections.emptyList();
        this.b = Collections.emptyList();
        this.e = new HashSet();
        this.g = new HashMap();
        this.b = s7Var.f();
    }

    private static int a(String str, com.applovin.impl.sdk.k kVar) {
        try {
            if (CollectionUtils.explode(str, ":").size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt((String) r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt((String) r1.get(1))) + StringUtils.parseInt((String) r1.get(2)));
            }
        } catch (Throwable unused) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        List a = p8Var.a("MediaFile");
        ArrayList arrayList = new ArrayList(a.size());
        List explode = CollectionUtils.explode((String) kVar.a(x4.S4));
        List explode2 = CollectionUtils.explode((String) kVar.a(x4.R4));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            c8 a2 = c8.a((p8) it.next(), kVar);
            if (a2 != null) {
                try {
                    String c = a2.c();
                    if (StringUtils.isValidString(c) && !explode.contains(c)) {
                        arrayList.add(a2);
                    } else {
                        if (((Boolean) kVar.a(x4.T4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a2.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(a2);
                            }
                        }
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().k("VastVideoCreative", "Video file not supported: " + a2);
                        }
                    }
                } catch (Throwable th) {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("VastVideoCreative", "Failed to validate video file: " + a2, th);
                    }
                }
            }
        }
        return arrayList;
    }

    public c8 a(long j) {
        List list = this.a;
        c8 c8Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<c8> arrayList = new ArrayList(3);
        for (String str : this.b) {
            for (c8 c8Var2 : this.a) {
                String c = c8Var2.c();
                if (StringUtils.isValidString(c) && str.equalsIgnoreCase(c)) {
                    arrayList.add(c8Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.a;
        }
        Collections.sort(arrayList, new S());
        for (c8 c8Var3 : arrayList) {
            if (c8Var3.b() > j) {
                break;
            }
            c8Var = c8Var3;
        }
        return c8Var != null ? c8Var : (c8) arrayList.get(0);
    }

    private static /* synthetic */ int a(c8 c8Var, c8 c8Var2) {
        return Long.compare(c8Var.b(), c8Var2.b());
    }

    public static b8 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        b8 b8Var = new b8();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "video_files", new JSONArray());
        b8Var.a = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            c8 a = c8.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), kVar);
            if (a != null) {
                b8Var.a.add(a);
            }
        }
        b8Var.b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.emptyList());
        b8Var.c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        b8Var.d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            y7 a2 = y7.a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), kVar);
            if (a2 != null) {
                b8Var.e.add(a2);
            }
        }
        b8Var.f = u7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), kVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            HashSet hashSet = new HashSet();
            String str = (String) keys.next();
            JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, str, new JSONArray());
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                y7 a3 = y7.a(JsonUtils.getJSONObject(jSONArray3, i3, (JSONObject) null), kVar);
                if (a3 != null) {
                    hashSet.add(a3);
                }
            }
            b8Var.g.put(str, hashSet);
        }
        return b8Var;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((c8) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray(this.b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.c);
        Uri uri = this.d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((y7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        u7 u7Var = this.f;
        if (u7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", u7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.g.keySet()) {
            Set set = (Set) this.g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((y7) it3.next()).a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}

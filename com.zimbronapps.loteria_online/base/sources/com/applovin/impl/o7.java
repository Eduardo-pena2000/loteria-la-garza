package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class o7 extends com.applovin.impl.sdk.ad.b implements q4 {
    private final String n;
    private final String o;
    private final x7 p;
    private final long q;
    private final b8 r;
    private final r7 s;
    private final String t;
    private final q7 u;
    private final l4 v;
    private final Set w;
    private final Set x;

    public static class b {
        private JSONObject a;
        private JSONObject b;
        private com.applovin.impl.sdk.k c;
        private long d;
        private String e;
        private String f;
        private x7 g;
        private b8 h;
        private r7 i;
        private q7 j;
        private Set k;
        private Set l;

        public static /* synthetic */ JSONObject a(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ JSONObject b(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ Set c(b bVar) {
            return bVar.l;
        }

        public static /* synthetic */ long d(b bVar) {
            return bVar.d;
        }

        public static /* synthetic */ com.applovin.impl.sdk.k e(b bVar) {
            return bVar.c;
        }

        public static /* synthetic */ String f(b bVar) {
            return bVar.e;
        }

        public static /* synthetic */ x7 g(b bVar) {
            return bVar.g;
        }

        public static /* synthetic */ String h(b bVar) {
            return bVar.f;
        }

        public static /* synthetic */ b8 i(b bVar) {
            return bVar.h;
        }

        public static /* synthetic */ r7 j(b bVar) {
            return bVar.i;
        }

        public static /* synthetic */ q7 k(b bVar) {
            return bVar.j;
        }

        public static /* synthetic */ Set l(b bVar) {
            return bVar.k;
        }

        public static /* synthetic */ JSONObject a(b bVar, JSONObject jSONObject) {
            bVar.a = jSONObject;
            return jSONObject;
        }

        public static /* synthetic */ JSONObject b(b bVar, JSONObject jSONObject) {
            bVar.b = jSONObject;
            return jSONObject;
        }

        public static /* synthetic */ Set a(b bVar, Set set) {
            bVar.l = set;
            return set;
        }

        public static /* synthetic */ String b(b bVar, String str) {
            bVar.f = str;
            return str;
        }

        public static /* synthetic */ long a(b bVar, long j) {
            bVar.d = j;
            return j;
        }

        public static /* synthetic */ Set b(b bVar, Set set) {
            bVar.k = set;
            return set;
        }

        public static /* synthetic */ com.applovin.impl.sdk.k a(b bVar, com.applovin.impl.sdk.k kVar) {
            bVar.c = kVar;
            return kVar;
        }

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public static /* synthetic */ String a(b bVar, String str) {
            bVar.e = str;
            return str;
        }

        public static /* synthetic */ x7 a(b bVar, x7 x7Var) {
            bVar.g = x7Var;
            return x7Var;
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public static /* synthetic */ b8 a(b bVar, b8 b8Var) {
            bVar.h = b8Var;
            return b8Var;
        }

        public b b(Set set) {
            this.k = set;
            return this;
        }

        public static /* synthetic */ r7 a(b bVar, r7 r7Var) {
            bVar.i = r7Var;
            return r7Var;
        }

        public static /* synthetic */ q7 a(b bVar, q7 q7Var) {
            bVar.j = q7Var;
            return q7Var;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(com.applovin.impl.sdk.k kVar) {
            if (kVar != null) {
                this.c = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f = str;
            return this;
        }

        public b a(x7 x7Var) {
            this.g = x7Var;
            return this;
        }

        public b a(b8 b8Var) {
            this.h = b8Var;
            return this;
        }

        public b a(r7 r7Var) {
            this.i = r7Var;
            return this;
        }

        public b a(q7 q7Var) {
            this.j = q7Var;
            return this;
        }

        public b a(Set set) {
            this.l = set;
            return this;
        }

        public b a(long j) {
            this.d = j;
            return this;
        }

        public o7 a() {
            return new o7(this, null);
        }
    }

    public enum c {
        COMPANION_AD,
        VIDEO
    }

    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    public /* synthetic */ o7(b bVar, a aVar) {
        this(bVar);
    }

    public static /* synthetic */ List e1(o7 o7Var, h5 h5Var) {
        return o7Var.s(h5Var);
    }

    private Set h1() {
        r7 r7Var = this.s;
        return r7Var != null ? r7Var.b() : Collections.emptySet();
    }

    private String k1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private Set o1() {
        b8 b8Var = this.r;
        return b8Var != null ? b8Var.b() : Collections.emptySet();
    }

    private /* synthetic */ List s(h5 h5Var) {
        return n7.a(h5Var.a("vimp_urls", new JSONObject()), getClCode(), null, k1(), J(), N0(), this.sdk);
    }

    public List A() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new P3(this));
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, k1(), J(), N0(), this.sdk);
        }
        return a2;
    }

    public boolean B0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && f1() != null;
    }

    public boolean C0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    public void E0() {
    }

    public String I() {
        return this.t;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public Uri c0() {
        return f1();
    }

    public void d(String str) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7) || !super.equals(obj)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        String str = this.n;
        if (str == null ? o7Var.n != null : !str.equals(o7Var.n)) {
            return false;
        }
        String str2 = this.o;
        if (str2 == null ? o7Var.o != null : !str2.equals(o7Var.o)) {
            return false;
        }
        x7 x7Var = this.p;
        if (x7Var == null ? o7Var.p != null : !x7Var.equals(o7Var.p)) {
            return false;
        }
        b8 b8Var = this.r;
        if (b8Var == null ? o7Var.r != null : !b8Var.equals(o7Var.r)) {
            return false;
        }
        r7 r7Var = this.s;
        if (r7Var == null ? o7Var.s != null : !r7Var.equals(o7Var.s)) {
            return false;
        }
        q7 q7Var = this.u;
        if (q7Var == null ? o7Var.u != null : !q7Var.equals(o7Var.u)) {
            return false;
        }
        Set set = this.w;
        if (set == null ? o7Var.w != null : !set.equals(o7Var.w)) {
            return false;
        }
        Set set2 = this.x;
        Set set3 = o7Var.x;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    public Uri f1() {
        b8 b8Var = this.r;
        if (b8Var != null) {
            return b8Var.c();
        }
        return null;
    }

    public r7 g1() {
        return this.s;
    }

    public long getCreatedAtMillis() {
        return this.q;
    }

    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    public boolean hasVideoUrl() {
        List g;
        b8 b8Var = this.r;
        return (b8Var == null || (g = b8Var.g()) == null || g.size() <= 0) ? false : true;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.n;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        x7 x7Var = this.p;
        int hashCode4 = (hashCode3 + (x7Var != null ? x7Var.hashCode() : 0)) * 31;
        b8 b8Var = this.r;
        int hashCode5 = (hashCode4 + (b8Var != null ? b8Var.hashCode() : 0)) * 31;
        r7 r7Var = this.s;
        int hashCode6 = (hashCode5 + (r7Var != null ? r7Var.hashCode() : 0)) * 31;
        q7 q7Var = this.u;
        int hashCode7 = (hashCode6 + (q7Var != null ? q7Var.hashCode() : 0)) * 31;
        Set set = this.w;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.x;
        return hashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public String i1() {
        return getStringFromAdObject("html_template", "");
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.u != null;
    }

    public c j1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    public Uri l0() {
        c8 q1 = q1();
        if (q1 != null) {
            return q1.e();
        }
        return null;
    }

    public u7 l1() {
        b8 b8Var = this.r;
        if (b8Var != null) {
            return b8Var.f();
        }
        return null;
    }

    public long m1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public x7 n1() {
        return this.p;
    }

    public b8 p1() {
        return this.r;
    }

    public c8 q1() {
        Long f = r0.f(this.sdk);
        return this.r.a(f != null ? f.longValue() : 0L);
    }

    public boolean r1() {
        return l1() != null;
    }

    public boolean s1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void t1() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public String toString() {
        return "VastAd{title='" + this.n + "', adDescription='" + this.o + "', systemInfo=" + this.p + ", videoCreative=" + this.r + ", companionAd=" + this.s + ", adVerifications=" + this.u + ", impressionTrackers=" + this.w + ", errorTrackers=" + this.x + '}';
    }

    public boolean u1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean v1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean w1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean x1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    public boolean y0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public boolean y1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    private o7(b bVar) {
        super(b.a(bVar), b.b(bVar), b.e(bVar));
        this.n = b.f(bVar);
        this.p = b.g(bVar);
        this.o = b.h(bVar);
        this.r = b.i(bVar);
        this.s = b.j(bVar);
        this.u = b.k(bVar);
        this.w = b.l(bVar);
        this.x = b.c(bVar);
        this.v = new l4(this);
        Uri l0 = l0();
        if (l0 != null) {
            this.t = l0.toString();
        } else {
            this.t = "";
        }
        this.q = b.d(bVar);
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.w;
        }
        if (dVar == d.VIDEO_CLICK) {
            return o1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return h1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return l1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return l1().f();
        }
        if (dVar == d.ERROR) {
            return this.x;
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }

    public q7 e1() {
        return this.u;
    }

    public l4 getAdEventTracker() {
        return this.v;
    }

    private Set a(c cVar, String[] strArr) {
        Map d2;
        r7 r7Var;
        b8 b8Var;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (b8Var = this.r) != null) {
                d2 = b8Var.e();
            } else {
                d2 = (cVar != c.COMPANION_AD || (r7Var = this.s) == null) ? null : r7Var.d();
            }
            HashSet hashSet = new HashSet();
            if (d2 != null && !d2.isEmpty()) {
                for (String str : strArr) {
                    if (d2.containsKey(str)) {
                        hashSet.addAll((Collection) d2.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    public static o7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        b.b(bVar, jSONObject2);
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        b.a(bVar, jSONObject3);
        b.a(bVar, kVar);
        b.a(bVar, JsonUtils.getLong(jSONObject, "created_at_millis", 0L));
        b.a(bVar, JsonUtils.getString(jSONObject, "title", ""));
        b.b(bVar, JsonUtils.getString(jSONObject, "ad_description", ""));
        b.a(bVar, x7.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), kVar));
        b.a(bVar, b8.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), kVar));
        b.a(bVar, r7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), kVar));
        b.a(bVar, q7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), kVar));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            y7 a2 = y7.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), kVar);
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        b.b(bVar, (Set) hashSet);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            y7 a3 = y7.a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), kVar);
            if (a3 != null) {
                hashSet2.add(a3);
            }
        }
        b.a(bVar, (Set) hashSet2);
        o7 o7Var = new o7(bVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator keys = jSONObject4.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String string = JsonUtils.getString(jSONObject4, str, null);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(string)) {
                o7Var.a(str, string);
            }
        }
        return o7Var;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.q);
        JsonUtils.putString(jSONObject, "title", this.n);
        JsonUtils.putString(jSONObject, "ad_description", this.o);
        x7 x7Var = this.p;
        if (x7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", x7Var.a());
        }
        b8 b8Var = this.r;
        if (b8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", b8Var.a());
        }
        r7 r7Var = this.s;
        if (r7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", r7Var.a());
        }
        q7 q7Var = this.u;
        if (q7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", q7Var.a());
        }
        if (this.w != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                jSONArray.put(((y7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.x != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.x.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
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

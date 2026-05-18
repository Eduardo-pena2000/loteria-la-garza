package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class b {
    public static final Date h = new Date(0);
    public JSONObject a;
    public JSONObject b;
    public Date c;
    public JSONArray d;
    public JSONObject e;
    public long f;
    public JSONArray g;

    public static class b {
        public JSONObject a;
        public Date b;
        public JSONArray c;
        public JSONObject d;
        public long e;
        public JSONArray f;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public b a() {
            return new b(this.a, this.b, this.c, this.d, this.e, this.f, null);
        }

        public b b(Map map) {
            this.a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(JSONArray jSONArray) {
            try {
                this.f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b h(long j) {
            this.e = j;
            return this;
        }

        public b() {
            this.a = new JSONObject();
            this.b = b.a();
            this.c = new JSONArray();
            this.d = new JSONObject();
            this.e = 0L;
            this.f = new JSONArray();
        }
    }

    public /* synthetic */ b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2, a aVar) {
        this(jSONObject, date, jSONArray, jSONObject2, j, jSONArray2);
    }

    public static /* synthetic */ Date a() {
        return h;
    }

    public static b b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new b(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    public static b d(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b(null);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < j().length(); i++) {
            JSONObject jSONObject = j().getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string3 = jSONArray.getString(i2);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
        }
        return hashMap;
    }

    public JSONArray e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.a.toString().equals(((b) obj).toString());
        }
        return false;
    }

    public Set f(b bVar) {
        JSONObject g = d(bVar.a).g();
        Map c = c();
        Map c2 = bVar.c();
        HashSet hashSet = new HashSet();
        Iterator keys = g().keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (!bVar.g().has(str)) {
                hashSet.add(str);
            } else if (!g().get(str).equals(bVar.g().get(str))) {
                hashSet.add(str);
            } else if ((i().has(str) && !bVar.i().has(str)) || (!i().has(str) && bVar.i().has(str))) {
                hashSet.add(str);
            } else if (i().has(str) && bVar.i().has(str) && !i().getJSONObject(str).toString().equals(bVar.i().getJSONObject(str).toString())) {
                hashSet.add(str);
            } else if (c.containsKey(str) != c2.containsKey(str)) {
                hashSet.add(str);
            } else if (c.containsKey(str) && c2.containsKey(str) && !((Map) c.get(str)).equals(c2.get(str))) {
                hashSet.add(str);
            } else {
                g.remove(str);
            }
        }
        Iterator keys2 = g.keys();
        while (keys2.hasNext()) {
            hashSet.add((String) keys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.b;
    }

    public Date h() {
        return this.c;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public JSONObject i() {
        return this.e;
    }

    public JSONArray j() {
        return this.g;
    }

    public long k() {
        return this.f;
    }

    public String toString() {
        return this.a.toString();
    }

    public b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = j;
        this.g = jSONArray2;
        this.a = jSONObject3;
    }
}

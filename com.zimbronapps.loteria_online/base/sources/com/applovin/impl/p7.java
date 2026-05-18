package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class p7 implements q4 {
    private final String a;
    private final List b;
    private final String c;
    private final Set d;

    private p7(String str, List list, String str2, Set set) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = set;
    }

    public static p7 a(p8 p8Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        try {
            String str = (String) p8Var.a().get("vendor");
            p8 b = p8Var.b("VerificationParameters");
            String d = b != null ? b.d() : null;
            List a = p8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a.size());
            Iterator it = a.iterator();
            while (it.hasNext()) {
                v7 a2 = v7.a((p8) it.next(), kVar);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            HashMap hashMap = new HashMap();
            a8.a(p8Var, (Map) hashMap, s7Var, kVar);
            return new p7(str, arrayList, d, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerification", "Error occurred while initializing", th);
            }
            kVar.D().a("VastAdVerification", th);
            return null;
        }
    }

    public Set b() {
        return this.d;
    }

    public List c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p7 p7Var = (p7) obj;
        String str = this.a;
        if (str == null ? p7Var.a != null : !str.equals(p7Var.a)) {
            return false;
        }
        List list = this.b;
        if (list == null ? p7Var.b != null : !list.equals(p7Var.b)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? p7Var.c != null : !str2.equals(p7Var.c)) {
            return false;
        }
        Set set = this.d;
        Set set2 = p7Var.d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.d;
        return hashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.a + "'javascriptResources='" + this.b + "'verificationParameters='" + this.c + "'errorEventTrackers='" + this.d + "'}";
    }

    public static p7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "javascript_resources", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            v7 a = v7.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), kVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            y7 a2 = y7.a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), kVar);
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        return new p7(string, arrayList, string2, hashSet);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.a);
        if (this.b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((v7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.c);
        if (this.d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}

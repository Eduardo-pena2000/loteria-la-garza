package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class q7 implements q4 {
    private final List a;

    private q7(List list) {
        this.a = list;
    }

    public static q7 a(p8 p8Var, q7 q7Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        try {
            List b = q7Var != null ? q7Var.b() : new ArrayList();
            Iterator it = p8Var.a("Verification").iterator();
            while (it.hasNext()) {
                p7 a = p7.a((p8) it.next(), s7Var, kVar);
                if (a != null) {
                    b.add(a);
                }
            }
            return new q7(b);
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            kVar.D().a("VastAdVerifications", th);
            return null;
        }
    }

    public List b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q7) {
            return this.a.equals(((q7) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.a + "'}";
    }

    public static q7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "verifications", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            p7 a = p7.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), kVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new q7(arrayList);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        if (this.a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((p7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}

package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaia {
    private List zza;

    public zzaia() {
        this.zza = new ArrayList();
    }

    public static zzaia zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzaia(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(jSONObject == null ? new zzaib() : new zzaib(v.a(jSONObject.optString("federatedId")), v.a(jSONObject.optString("displayName")), v.a(jSONObject.optString("photoUrl")), v.a(jSONObject.optString("providerId")), null, v.a(jSONObject.optString("phoneNumber")), v.a(jSONObject.optString("email"))));
        }
        return new zzaia(arrayList);
    }

    private zzaia(List list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }

    public final List zza() {
        return this.zza;
    }
}

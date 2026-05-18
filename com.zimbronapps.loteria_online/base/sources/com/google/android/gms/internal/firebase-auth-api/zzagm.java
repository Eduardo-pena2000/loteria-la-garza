package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzagm {
    private final String zza;

    public zzagm(String str) {
        this.zza = t.f(str);
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}

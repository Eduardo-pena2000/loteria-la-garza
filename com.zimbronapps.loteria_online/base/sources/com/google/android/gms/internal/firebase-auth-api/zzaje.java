package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaje implements zzafa {
    private String zza;
    private String zzb;
    private final String zzc;
    private final String zzd;
    private boolean zze = true;

    public zzaje(String str, String str2, String str3, String str4) {
        this.zza = t.f(str);
        this.zzb = t.f(str2);
        this.zzc = str3;
        this.zzd = str4;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zza);
        jSONObject.put("password", this.zzb);
        jSONObject.put("returnSecureToken", this.zze);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            zzajk.zza(jSONObject, "captchaResponse", str2);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}

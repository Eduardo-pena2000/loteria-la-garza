package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaim implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;

    public zzaim(String str) {
        this.zzc = str;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            zzajk.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzajk.zza(jSONObject);
        }
        String str5 = this.zze;
        if (str5 != null) {
            jSONObject.put("idToken", str5);
        }
        return jSONObject.toString();
    }

    public zzaim(String str, String str2, String str3, String str4, String str5, String str6) {
        this.zza = t.f(str);
        this.zzb = t.f(str2);
        this.zzc = str4;
        this.zzd = str5;
        this.zze = str6;
    }
}

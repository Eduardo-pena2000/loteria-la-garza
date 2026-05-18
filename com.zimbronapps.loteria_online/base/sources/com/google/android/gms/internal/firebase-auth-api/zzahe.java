package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzahe implements zzahb {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    private zzahe(String str, String str2, String str3, String str4, String str5) {
        t.f(str);
        this.zza = t.f(str2);
        this.zzb = str3;
        this.zzc = str4;
        this.zzd = str5;
    }

    public static zzahe zza(String str, String str2, String str3, String str4) {
        t.f(str2);
        t.f(str4);
        return new zzahe("totp", str, str2, str3, str4);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzb;
        if (str != null) {
            jSONObject2.put("verificationCode", str);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zza);
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("mfaEnrollmentId", str3);
        }
        return jSONObject.toString();
    }
}

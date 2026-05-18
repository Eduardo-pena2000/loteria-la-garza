package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzahd implements zzagz {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzahd(String str, String str2, String str3, String str4, String str5, String str6) {
        t.f(str);
        this.zza = t.f(str2);
        this.zzc = str3;
        this.zzd = str4;
        this.zzb = str5;
        this.zze = str6;
    }

    public final /* synthetic */ zzagz zza(String str) {
        this.zza = str;
        return this;
    }

    public static zzahd zza(String str, String str2, String str3, String str4, String str5) {
        t.f(str3);
        t.f(str2);
        return new zzahd("phone", str, str2, str3, str4, str5);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaProvider", 1);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("tenantId", str4);
        }
        return jSONObject.toString();
    }
}

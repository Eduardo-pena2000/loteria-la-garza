package com.google.android.gms.internal.firebase-auth-api;

import android.text.TextUtils;
import com.google.android.gms.common.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzajg implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzajg() {
    }

    public static zzajg zza(String str, String str2, boolean z) {
        zzajg zzajgVar = new zzajg();
        zzajgVar.zzb = t.f(str);
        zzajgVar.zzc = t.f(str2);
        zzajgVar.zzf = z;
        return zzajgVar;
    }

    public static zzajg zzb(String str, String str2, boolean z) {
        zzajg zzajgVar = new zzajg();
        zzajgVar.zza = t.f(str);
        zzajgVar.zzd = t.f(str2);
        zzajgVar.zzf = z;
        return zzajgVar;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}

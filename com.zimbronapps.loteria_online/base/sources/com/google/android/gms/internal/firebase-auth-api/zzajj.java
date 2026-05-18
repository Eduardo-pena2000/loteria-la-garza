package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzajj implements zzaez {
    private static final String zza = "zzajj";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;
    private String zzf;
    private String zzg;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajj zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = v.a(jSONObject.optString("idToken", (String) null));
            this.zzc = v.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            v.a(jSONObject.optString("localId", (String) null));
            this.zze = jSONObject.optBoolean("isNewUser", false);
            this.zzf = v.a(jSONObject.optString("temporaryProof", (String) null));
            this.zzg = v.a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (JSONException | NullPointerException e) {
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}

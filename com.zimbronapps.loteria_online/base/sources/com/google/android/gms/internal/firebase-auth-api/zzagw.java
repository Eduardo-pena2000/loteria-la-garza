package com.google.android.gms.internal.firebase-auth-api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzagw implements zzaez {
    private static final String zza = "zzagw";
    private String zzb;
    private String zzc;
    private boolean zzd;
    private long zze;
    private List zzf;
    private String zzg;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagw zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", (String) null);
            jSONObject.optString("email", (String) null);
            this.zzb = jSONObject.optString("idToken", (String) null);
            this.zzc = jSONObject.optString("refreshToken", (String) null);
            this.zzd = jSONObject.optBoolean("isNewUser", false);
            this.zze = jSONObject.optLong("expiresIn", 0L);
            this.zzf = zzahy.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzg = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (JSONException | NullPointerException e) {
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public final long zza() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzg);
    }

    public final boolean zzg() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zzb;
    }
}

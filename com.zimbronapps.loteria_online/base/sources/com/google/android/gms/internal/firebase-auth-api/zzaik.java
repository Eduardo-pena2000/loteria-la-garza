package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzaik implements zzaez {
    private static final String zza = "zzaik";
    private String zzb;
    private zzaia zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaik zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = v.a(jSONObject.optString("email"));
            v.a(jSONObject.optString("passwordHash"));
            jSONObject.optBoolean("emailVerified", false);
            v.a(jSONObject.optString("displayName"));
            v.a(jSONObject.optString("photoUrl"));
            this.zzc = zzaia.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = v.a(jSONObject.optString("idToken"));
            this.zze = v.a(jSONObject.optString("refreshToken"));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (JSONException | NullPointerException e) {
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List zze() {
        zzaia zzaiaVar = this.zzc;
        if (zzaiaVar != null) {
            return zzaiaVar.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}

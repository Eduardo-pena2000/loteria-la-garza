package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzajh implements zzaez {
    private static final String zza = "zzajh";
    private String zzb;
    private String zzc;
    private long zzd;
    private List zze;
    private String zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajh zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            v.a(jSONObject.optString("localId", (String) null));
            v.a(jSONObject.optString("email", (String) null));
            v.a(jSONObject.optString("displayName", (String) null));
            this.zzb = v.a(jSONObject.optString("idToken", (String) null));
            v.a(jSONObject.optString("photoUrl", (String) null));
            this.zzc = v.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = zzahy.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzf = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (JSONException | NullPointerException e) {
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzf);
    }

    public final String zzb() {
        return this.zzb;
    }
}

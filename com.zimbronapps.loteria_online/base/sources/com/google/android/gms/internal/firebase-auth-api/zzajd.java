package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import J7.A0;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzajd implements zzaez {
    private static final String zza = "zzajd";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private List zzp;
    private String zzq;

    public final long zza() {
        return this.zze;
    }

    public final A0 zzb() {
        if (TextUtils.isEmpty(this.zzj) && TextUtils.isEmpty(this.zzk)) {
            return null;
        }
        return A0.U1(this.zzg, this.zzk, this.zzj, this.zzn, this.zzl);
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzo;
    }

    public final List zzk() {
        return this.zzp;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzq);
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzi;
    }

    public final boolean zzo() {
        return this.zzb || !TextUtils.isEmpty(this.zzm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajd zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = v.a(jSONObject.optString("idToken", (String) null));
            this.zzd = v.a(jSONObject.optString("refreshToken", (String) null));
            this.zze = jSONObject.optLong("expiresIn", 0L);
            v.a(jSONObject.optString("localId", (String) null));
            this.zzf = v.a(jSONObject.optString("email", (String) null));
            v.a(jSONObject.optString("displayName", (String) null));
            v.a(jSONObject.optString("photoUrl", (String) null));
            this.zzg = v.a(jSONObject.optString("providerId", (String) null));
            this.zzh = v.a(jSONObject.optString("rawUserInfo", (String) null));
            this.zzi = jSONObject.optBoolean("isNewUser", false);
            this.zzj = jSONObject.optString("oauthAccessToken", (String) null);
            this.zzk = jSONObject.optString("oauthIdToken", (String) null);
            this.zzm = v.a(jSONObject.optString("errorMessage", (String) null));
            this.zzn = v.a(jSONObject.optString("pendingToken", (String) null));
            this.zzo = v.a(jSONObject.optString("tenantId", (String) null));
            this.zzp = zzahy.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzq = v.a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.zzl = v.a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (JSONException | NullPointerException e) {
            throw zzajk.zza((Exception) e, zza, str);
        }
    }
}

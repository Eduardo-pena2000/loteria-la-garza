package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzaha implements zzaez {
    private static final String zza = "zzaha";
    private String zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaha zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = v.a(jSONObject.optString("idToken"));
            this.zzc = v.a(jSONObject.optString("refreshToken"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}

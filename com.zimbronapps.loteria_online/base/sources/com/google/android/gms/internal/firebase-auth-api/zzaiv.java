package com.google.android.gms.internal.firebase-auth-api;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaiv extends zzair {
    private static final String zza = "zzaiv";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzaiv zzb(String str) throws zzacn {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzac.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (JSONException | NullPointerException e) {
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public final /* synthetic */ zzaez zza(String str) throws zzacn {
        return (zzaiv) zza(str);
    }

    public final String zza() {
        return this.zzb;
    }
}

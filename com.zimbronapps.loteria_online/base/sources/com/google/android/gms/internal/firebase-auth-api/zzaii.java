package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzaii implements zzaez {
    private static final String zza = "zzaii";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaii zza(String str) throws zzacn {
        try {
            this.zzb = v.a(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (JSONException | NullPointerException e) {
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}

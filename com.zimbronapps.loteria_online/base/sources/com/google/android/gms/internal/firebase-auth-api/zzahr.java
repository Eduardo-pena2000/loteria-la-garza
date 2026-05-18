package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzahr implements zzaez {
    private static final String zza = "zzahr";
    private String zzb;

    public zzahr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahr zza(String str) throws zzacn {
        try {
            this.zzb = v.a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (JSONException | NullPointerException e) {
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public zzahr(String str) {
        this.zzb = str;
    }

    public final String zza() {
        return this.zzb;
    }
}

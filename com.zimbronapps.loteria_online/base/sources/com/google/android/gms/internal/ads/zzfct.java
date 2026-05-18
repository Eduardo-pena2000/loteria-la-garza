package com.google.android.gms.internal.ads;

import V5.o0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfct implements zzfav {
    private final String zza;
    private final String zzb;

    public zzfct(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject h = V5.S.h((JSONObject) obj, "pii");
            h.put("doritos", this.zza);
            h.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            o0.k("Failed putting doritos string.");
        }
    }
}

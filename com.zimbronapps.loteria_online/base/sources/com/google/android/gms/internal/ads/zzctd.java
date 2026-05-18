package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzctd implements zzikg {
    private final zzikp zza;

    private zzctd(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzctd zza(zzikp zzikpVar) {
        return new zzctd(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcww) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}

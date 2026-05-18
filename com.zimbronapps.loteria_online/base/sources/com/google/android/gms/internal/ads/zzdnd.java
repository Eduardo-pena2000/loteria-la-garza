package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdnd {
    private final JSONObject zza;
    private final zzdtk zzb;
    private final R5.b zzc;
    private final zzcce zzd;

    public zzdnd(JSONObject jSONObject, zzdtk zzdtkVar, R5.b bVar, zzcce zzcceVar) {
        this.zza = jSONObject;
        this.zzb = zzdtkVar;
        this.zzc = bVar;
        this.zzd = zzcceVar;
    }

    public final R5.b zza() {
        return this.zzc;
    }

    public final zzcce zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdtk zzd() {
        return this.zzb;
    }
}

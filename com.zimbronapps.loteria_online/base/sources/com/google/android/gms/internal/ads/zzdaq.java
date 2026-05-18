package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdaq implements zzikg {
    private final zzdao zza;
    private final zzikp zzb;

    private zzdaq(zzdao zzdaoVar, zzikp zzikpVar) {
        this.zza = zzdaoVar;
        this.zzb = zzikpVar;
    }

    public static zzdaq zza(zzdao zzdaoVar, zzikp zzikpVar) {
        return new zzdaq(zzdaoVar, zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zzf = this.zza.zzf(((zzcmj) this.zzb).zza());
        zziko.zzb(zzf);
        return zzf;
    }
}

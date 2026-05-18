package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdlf implements zzikg {
    private final zzdkr zza;
    private final zzikp zzb;

    private zzdlf(zzdkr zzdkrVar, zzikp zzikpVar) {
        this.zza = zzdkrVar;
        this.zzb = zzikpVar;
    }

    public static zzdlf zza(zzdkr zzdkrVar, zzikp zzikpVar) {
        return new zzdlf(zzdkrVar, zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zze = this.zza.zze((zzczw) this.zzb.zzb());
        zziko.zzb(zze);
        return zze;
    }
}

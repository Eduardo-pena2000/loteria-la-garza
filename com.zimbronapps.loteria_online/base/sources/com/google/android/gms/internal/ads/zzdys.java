package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdys implements zzikg {
    private final zzdyo zza;
    private final zzikp zzb;

    private zzdys(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzdyoVar;
        this.zzb = zzikpVar;
    }

    public static zzdys zza(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdys(zzdyoVar, zzikpVar, zzikpVar2);
    }

    public static Set zzc(zzdyo zzdyoVar, zzdyy zzdyyVar, Executor executor) {
        Set zzd = zzdyo.zzd(zzdyyVar, executor);
        zziko.zzb(zzd);
        return zzd;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzdyy) this.zzb.zzb(), zzfmk.zzc());
    }
}

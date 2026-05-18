package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdyu implements zzikg {
    private final zzikp zza;

    private zzdyu(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzdyu zza(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdyu(zzdyoVar, zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzf = zzdyo.zzf((zzdyy) this.zza.zzb(), zzfmk.zzc());
        zziko.zzb(zzf);
        return zzf;
    }
}

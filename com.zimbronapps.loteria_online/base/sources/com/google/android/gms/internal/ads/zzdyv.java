package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdyv implements zzikg {
    private final zzikp zza;

    private zzdyv(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzdyv zza(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdyv(zzdyoVar, zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzg = zzdyo.zzg((zzdyy) this.zza.zzb(), zzfmk.zzc());
        zziko.zzb(zzg);
        return zzg;
    }
}

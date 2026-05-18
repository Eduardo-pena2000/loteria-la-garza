package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdyp implements zzikg {
    private final zzikp zza;

    private zzdyp(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzdyp zza(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdyp(zzdyoVar, zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zza = zzdyo.zza((zzdyy) this.zza.zzb(), zzfmk.zzc());
        zziko.zzb(zza);
        return zza;
    }
}

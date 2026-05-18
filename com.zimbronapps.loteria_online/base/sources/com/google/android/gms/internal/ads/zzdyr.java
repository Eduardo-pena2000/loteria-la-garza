package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdyr implements zzikg {
    private final zzikp zza;

    private zzdyr(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzdyr zza(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdyr(zzdyoVar, zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc = zzdyo.zzc((zzdyy) this.zza.zzb(), zzfmk.zzc());
        zziko.zzb(zzc);
        return zzc;
    }
}

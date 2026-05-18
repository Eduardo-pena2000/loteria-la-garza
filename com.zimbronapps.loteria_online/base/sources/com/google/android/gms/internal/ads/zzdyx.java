package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdyx implements zzikg {
    private final zzikp zza;

    private zzdyx(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzdyx zza(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdyx(zzdyoVar, zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzi = zzdyo.zzi((zzdyy) this.zza.zzb(), zzfmk.zzc());
        zziko.zzb(zzi);
        return zzi;
    }
}

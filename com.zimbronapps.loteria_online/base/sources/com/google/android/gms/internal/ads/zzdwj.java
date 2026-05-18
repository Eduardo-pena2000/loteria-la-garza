package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdwj implements zzikg {
    private final zzikp zza;

    private zzdwj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzdwj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdwj(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgzy zzc = zzfmk.zzc();
        Set singleton = ((Boolean) S5.D.c().zzd(zzbhe.zzgd)).booleanValue() ? Collections.singleton(new zzdje(((zzdxc) this.zza).zza(), zzc)) : Collections.emptySet();
        zziko.zzb(singleton);
        return singleton;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcmr implements zzikg {
    private final zzikp zza;

    private zzcmr(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzcmr zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcmr(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((Boolean) S5.D.c().zzd(zzbhe.zzcj)).booleanValue() ? Collections.singleton(new zzdje((zzeam) this.zza.zzb(), zzfmk.zzc())) : Collections.emptySet();
        zziko.zzb(singleton);
        return singleton;
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzewy implements zzikg {
    private final zzikp zza;

    private zzewy(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzewy zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzewy(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzezj(zzexv.zzc(), ((Integer) S5.D.c().zzd(zzbhe.zznI)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}

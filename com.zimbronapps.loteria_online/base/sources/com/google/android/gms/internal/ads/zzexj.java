package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzexj implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzexj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzexj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzexj(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzezj(((zzfaj) this.zza).zzb(), ((Integer) S5.D.c().zzd(zzbhe.zznB)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}

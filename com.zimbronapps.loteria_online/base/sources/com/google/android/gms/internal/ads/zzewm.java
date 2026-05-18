package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzewm implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzewm(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzewm zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzewm(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzezj(((zzeta) this.zza).zzb(), ((Integer) S5.D.c().zzd(zzbhe.zznQ)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}

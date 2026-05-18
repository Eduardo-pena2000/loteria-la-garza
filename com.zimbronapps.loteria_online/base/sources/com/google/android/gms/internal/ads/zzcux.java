package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcux implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcux(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcux zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcux(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzezj(((zzeva) this.zza).zzb(), ((Integer) S5.D.c().zzd(zzbhe.zznY)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}

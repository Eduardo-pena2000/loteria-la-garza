package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzewv implements zzikg {
    private final zzikp zza;

    private zzewv(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzewv zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzewv(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgup zzh;
        zzevn zzc = zzevp.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzeX)).booleanValue()) {
            zzh = zzgup.zzi(new zzezj(zzc, ((Integer) S5.D.c().zzd(zzbhe.zzeY)).intValue(), scheduledExecutorService));
        } else {
            zzh = zzgup.zzh();
        }
        zziko.zzb(zzh);
        return zzh;
    }
}

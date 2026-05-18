package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcme implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzcme(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar4;
    }

    public static zzcme zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzcme(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        int intValue = Integer.valueOf(zzcmc.zzj()).intValue();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        zzfrf zzb = ((zzfrg) this.zzb).zzb();
        E6.f fVar = (E6.f) this.zzc.zzb();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzO)).booleanValue()) {
            return new zzfqr(intValue, scheduledExecutorService, zzb, fVar);
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzetd implements zzfax {
    private final x7.e zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzetd(x7.e eVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = eVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    public final x7.e zza() {
        x7.e eVar = this.zza;
        zzetc zzetcVar = zzetc.zza;
        Executor executor = this.zzb;
        x7.e zzj = zzgzo.zzj(eVar, zzetcVar, executor);
        if (((Integer) S5.D.c().zzd(zzbhe.zznV)).intValue() > 0) {
            zzj = zzgzo.zzi(zzj, ((Integer) S5.D.c().zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgzo.zzh(zzj, Throwable.class, zzetb.zza, executor);
    }

    public final int zzb() {
        return 6;
    }
}

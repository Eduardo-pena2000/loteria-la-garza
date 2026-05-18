package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhae extends zzhaa implements zzgzz {
    final ScheduledExecutorService zza;

    public zzhae(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgzx schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhan zze = zzhan.zze(runnable, null);
        return new zzhac(zze, scheduledExecutorService.schedule(zze, j, timeUnit));
    }

    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzgzx schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzhan zzhanVar = new zzhan(callable);
        return new zzhac(zzhanVar, this.zza.schedule(zzhanVar, j, timeUnit));
    }

    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgzx scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzhad zzhadVar = new zzhad(runnable);
        return new zzhac(zzhadVar, this.zza.scheduleAtFixedRate(zzhadVar, j, j2, timeUnit));
    }

    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgzx scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzhad zzhadVar = new zzhad(runnable);
        return new zzhac(zzhadVar, this.zza.scheduleWithFixedDelay(zzhadVar, j, j2, timeUnit));
    }
}

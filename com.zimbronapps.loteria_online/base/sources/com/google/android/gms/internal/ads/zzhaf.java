package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhaf {
    public static Executor zza() {
        return zzgzd.INSTANCE;
    }

    public static zzgzy zzb(ExecutorService executorService) {
        if (executorService instanceof zzgzy) {
            return (zzgzy) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzhae((ScheduledExecutorService) executorService) : new zzhaa(executorService);
    }

    public static zzgzz zzc(ScheduledExecutorService scheduledExecutorService) {
        return new zzhae(scheduledExecutorService);
    }

    public static Executor zzd(Executor executor, zzgyh zzgyhVar) {
        executor.getClass();
        return executor == zzgzd.INSTANCE ? executor : new zzhab(executor, zzgyhVar);
    }

    public static /* synthetic */ void zze(Executor executor, zzgyh zzgyhVar, Runnable runnable) {
        zzf(executor, zzgyhVar, runnable);
    }

    private static /* synthetic */ void zzf(Executor executor, zzgyh zzgyhVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            zzgyhVar.zzb(e);
        }
    }
}

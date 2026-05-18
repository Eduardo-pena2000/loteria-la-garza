package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgzo extends zzgzq {
    public static x7.e zza(Object obj) {
        return obj == null ? zzgzs.zza : new zzgzs(obj);
    }

    public static x7.e zzb() {
        return zzgzs.zza;
    }

    public static x7.e zzc(Throwable th) {
        th.getClass();
        return new zzgzr(th);
    }

    public static x7.e zzd(Callable callable, Executor executor) {
        zzhan zzhanVar = new zzhan(callable);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static x7.e zze(Runnable runnable, Executor executor) {
        zzhan zze = zzhan.zze(runnable, null);
        executor.execute(zze);
        return zze;
    }

    public static x7.e zzf(zzgyv zzgyvVar, Executor executor) {
        zzhan zzhanVar = new zzhan(zzgyvVar);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static x7.e zzg(x7.e eVar, Class cls, zzgqt zzgqtVar, Executor executor) {
        int i = zzgyg.zzd;
        zzgyf zzgyfVar = new zzgyf(eVar, cls, zzgqtVar);
        eVar.addListener(zzgyfVar, zzhaf.zzd(executor, zzgyfVar));
        return zzgyfVar;
    }

    public static x7.e zzh(x7.e eVar, Class cls, zzgyw zzgywVar, Executor executor) {
        int i = zzgyg.zzd;
        zzgye zzgyeVar = new zzgye(eVar, cls, zzgywVar);
        eVar.addListener(zzgyeVar, zzhaf.zzd(executor, zzgyeVar));
        return zzgyeVar;
    }

    public static x7.e zzi(x7.e eVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return eVar.isDone() ? eVar : zzhak.zze(eVar, j, timeUnit, scheduledExecutorService);
    }

    public static x7.e zzj(x7.e eVar, zzgyw zzgywVar, Executor executor) {
        int i = zzgyn.zzc;
        zzgyl zzgylVar = new zzgyl(eVar, zzgywVar);
        eVar.addListener(zzgylVar, zzhaf.zzd(executor, zzgylVar));
        return zzgylVar;
    }

    public static x7.e zzk(x7.e eVar, zzgqt zzgqtVar, Executor executor) {
        int i = zzgyn.zzc;
        zzgym zzgymVar = new zzgym(eVar, zzgqtVar);
        eVar.addListener(zzgymVar, zzhaf.zzd(executor, zzgymVar));
        return zzgymVar;
    }

    @SafeVarargs
    public static x7.e zzl(x7.e... eVarArr) {
        return new zzgyx(zzguf.zzr(eVarArr), true);
    }

    public static x7.e zzm(Iterable iterable) {
        return new zzgyx(zzguf.zzp(iterable), true);
    }

    public static zzgzn zzn(Iterable iterable) {
        return new zzgzn(false, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgzn zzo(x7.e... eVarArr) {
        return new zzgzn(true, zzguf.zzr(eVarArr), null);
    }

    public static zzgzn zzp(Iterable iterable) {
        return new zzgzn(true, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static x7.e zzq(x7.e... eVarArr) {
        return new zzgyx(zzguf.zzr(eVarArr), false);
    }

    public static void zzr(x7.e eVar, zzgzl zzgzlVar, Executor executor) {
        zzgzlVar.getClass();
        eVar.addListener(new zzgzm(eVar, zzgzlVar), executor);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzhap.zza(future);
        }
        throw new IllegalStateException(zzgrt.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhap.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgze(e.getCause());
            }
            throw new zzhao(e.getCause());
        }
    }
}

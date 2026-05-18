package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzcen implements x7.e {
    private final zzhah zza = zzhah.zze();

    private static final boolean zza(boolean z) {
        if (!z) {
            R5.t.l().zzh(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final boolean zzc(Object obj) {
        boolean zza = this.zza.zza(obj);
        zza(zza);
        return zza;
    }

    public final boolean zzd(Throwable th) {
        boolean zzb = this.zza.zzb(th);
        zza(zzb);
        return zzb;
    }

    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j, timeUnit);
    }
}

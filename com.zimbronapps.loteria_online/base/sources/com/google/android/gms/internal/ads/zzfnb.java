package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfnb implements x7.e {
    private final Object zza;
    private final String zzb;
    private final x7.e zzc;

    public zzfnb(Object obj, String str, x7.e eVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = eVar;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.zzc.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.zzc.cancel(z);
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return this.zzc.get();
    }

    public final boolean isCancelled() {
        return this.zzc.isCancelled();
    }

    public final boolean isDone() {
        return this.zzc.isDone();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(identityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    public final Object zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzc.get(j, timeUnit);
    }
}

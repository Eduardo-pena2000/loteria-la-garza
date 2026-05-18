package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgzs implements x7.e {
    static final x7.e zza = new zzgzs(null);
    private static final zzgzw zzb = new zzgzw(zzgzs.class);
    private final Object zzc;

    public zzgzs(Object obj) {
        this.zzc = obj;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        zzgrc.zzk(runnable, "Runnable was null.");
        zzgrc.zzk(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger zza2 = zzb.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            zza2.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), e);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        return this.zzc;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.zzc;
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(obj2).length() + 25 + valueOf.length() + 2);
        sb.append(obj2);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }
}

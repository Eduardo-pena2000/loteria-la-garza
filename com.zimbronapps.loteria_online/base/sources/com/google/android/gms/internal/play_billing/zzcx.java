package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcx implements zzcz {
    private static final zzcy zza = new zzcy(zzcx.class);
    private final Object zzb;

    public zzcx(Object obj) {
        this.zzb = obj;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        return this.zzb;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.zzb;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    public final void zzb(Runnable runnable, Executor executor) {
        zzbg.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzb;
    }
}

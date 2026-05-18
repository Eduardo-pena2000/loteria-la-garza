package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgyk extends AbstractExecutorService implements zzgzy {
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzhan.zze(runnable, obj);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return super.submit(runnable);
    }

    public final x7.e zza(Runnable runnable) {
        return super.submit(runnable);
    }

    public final x7.e zzb(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }

    public final x7.e zzc(Callable callable) {
        return super.submit(callable);
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzhan(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return super.submit(callable);
    }
}

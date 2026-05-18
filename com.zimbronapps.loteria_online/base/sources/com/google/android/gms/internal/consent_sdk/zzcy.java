package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcy implements Executor {
    private final ThreadPoolExecutor zzb;
    private final AtomicInteger zza = new AtomicInteger(1);
    private WeakReference zzc = new WeakReference((Object) null);

    public zzcy(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcx(this, "Google consent worker"));
        this.zzb = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ Thread zza(zzcy zzcyVar, String str, Runnable runnable) {
        Thread thread = new Thread(runnable, "Google consent worker #" + zzcyVar.zza.getAndIncrement());
        zzcyVar.zzc = new WeakReference(thread);
        return thread;
    }

    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.zzc.get()) {
            runnable.run();
        } else {
            this.zzb.execute(runnable);
        }
    }
}

package com.google.android.gms.internal.ads;

import V5.F0;
import V5.p0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzceg implements Executor {
    private final Handler zza = new p0(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.zza.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            R5.t.g();
            F0.r(R5.t.l().zzp(), th);
            throw th;
        }
    }
}

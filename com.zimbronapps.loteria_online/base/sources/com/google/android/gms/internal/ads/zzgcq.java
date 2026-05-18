package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgcq implements zzgcl {
    private final ScheduledExecutorService zza = Executors.newSingleThreadScheduledExecutor();

    public final void zza(Runnable runnable, long j) {
        this.zza.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public final void zzb() {
    }
}

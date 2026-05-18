package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzcu extends zzcw {
    public static zzcz zza(Object obj) {
        return new zzcx(obj);
    }

    public static zzcz zzb(zzcz zzczVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzczVar.isDone() ? zzczVar : zzde.zzs(zzczVar, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void zzc(zzcz zzczVar, zzcs zzcsVar, Executor executor) {
        zzczVar.zzb(new zzct(zzczVar, zzcsVar), executor);
    }
}

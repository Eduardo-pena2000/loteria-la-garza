package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzgzz extends ScheduledExecutorService, zzgzy {
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    zzgzx schedule(Runnable runnable, long j, TimeUnit timeUnit);

    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    zzgzx schedule(Callable callable, long j, TimeUnit timeUnit);

    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    zzgzx scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    zzgzx scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}

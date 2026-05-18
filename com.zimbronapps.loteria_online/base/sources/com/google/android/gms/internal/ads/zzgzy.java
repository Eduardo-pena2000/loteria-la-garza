package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzgzy extends ExecutorService {
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    x7.e submit(Runnable runnable);

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    x7.e submit(Runnable runnable, Object obj);

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    x7.e submit(Callable callable);
}

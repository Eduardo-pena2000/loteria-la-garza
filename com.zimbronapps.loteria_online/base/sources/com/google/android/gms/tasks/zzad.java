package com.google.android.gms.tasks;

import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final /* synthetic */ class zzad implements Runnable {
    private final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzad(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final /* synthetic */ void run() {
        this.zza.trySetException(new TimeoutException());
    }
}

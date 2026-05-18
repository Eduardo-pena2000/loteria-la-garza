package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfvf implements Runnable {
    private final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzfvf(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final /* synthetic */ void run() {
        int i = zzfvh.zza;
        this.zza.setResult(zzfxd.zzc());
    }
}

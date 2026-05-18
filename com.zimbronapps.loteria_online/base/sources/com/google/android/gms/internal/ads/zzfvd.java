package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfvd implements Runnable {
    private final /* synthetic */ Context zza;
    private final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzfvd(Context context, TaskCompletionSource taskCompletionSource) {
        this.zza = context;
        this.zzb = taskCompletionSource;
    }

    public final /* synthetic */ void run() {
        int i = zzfvh.zza;
        this.zzb.setResult(zzfxd.zzb(this.zza, "GLAS", null));
    }
}

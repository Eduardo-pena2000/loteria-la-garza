package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzafr implements Runnable {
    private /* synthetic */ zzafo zza;
    private /* synthetic */ zzafq zzb;
    private /* synthetic */ TaskCompletionSource zzc;

    public /* synthetic */ zzafr(zzafo zzafoVar, zzafq zzafqVar, TaskCompletionSource taskCompletionSource) {
        this.zza = zzafoVar;
        this.zzb = zzafqVar;
        this.zzc = taskCompletionSource;
    }

    public final void run() {
        this.zzb.zza(this.zzc, this.zza.zza);
    }
}

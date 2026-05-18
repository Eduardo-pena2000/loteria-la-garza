package com.google.android.gms.internal.games_v2;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbd implements Runnable {
    public final /* synthetic */ zzgf zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzbd(zzgf zzgfVar, TaskCompletionSource taskCompletionSource) {
        this.zza = zzgfVar;
        this.zzb = taskCompletionSource;
    }

    public final void run() {
        ((Task) this.zza.zza()).addOnCompleteListener(new zzbb(this.zzb));
    }
}

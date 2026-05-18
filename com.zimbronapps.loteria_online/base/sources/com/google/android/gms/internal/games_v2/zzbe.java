package com.google.android.gms.internal.games_v2;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbe implements OnCompleteListener {
    public final /* synthetic */ zzbl zza;
    public final /* synthetic */ TaskCompletionSource zzb;
    public final /* synthetic */ zzq zzc;

    public /* synthetic */ zzbe(zzbl zzblVar, TaskCompletionSource taskCompletionSource, zzq zzqVar) {
        this.zza = zzblVar;
        this.zzb = taskCompletionSource;
        this.zzc = zzqVar;
    }

    public final void onComplete(Task task) {
        this.zza.zzg(this.zzb, this.zzc, task);
    }
}

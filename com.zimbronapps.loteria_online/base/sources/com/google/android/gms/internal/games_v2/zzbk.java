package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbk {
    private final TaskCompletionSource zza;
    private final zzao zzb;

    public zzbk(zzao zzaoVar, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzaoVar;
        this.zza = taskCompletionSource;
    }

    public final void zza(g gVar) {
        this.zzb.zza(gVar).addOnCompleteListener(zzge.zza(), new zzbj(this));
    }

    public final /* synthetic */ void zzb(Task task) {
        if (task.isSuccessful()) {
            this.zza.setResult(task.getResult());
            return;
        }
        TaskCompletionSource taskCompletionSource = this.zza;
        Exception exception = task.getException();
        zzfq.zza(exception);
        taskCompletionSource.setException(exception);
    }

    public final void zzc(Exception exc) {
        this.zza.setException(exc);
    }
}

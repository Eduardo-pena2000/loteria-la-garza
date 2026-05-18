package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbo implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzbo(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(zzbq.zzc(((zzs) task.getResult()).zza()));
            return;
        }
        b exception = task.getException();
        if (exception instanceof b) {
            taskCompletionSource.trySetResult(zzbq.zzb(exception.getStatus()));
        } else {
            zzfq.zza(exception);
            taskCompletionSource.trySetException(exception);
        }
    }
}

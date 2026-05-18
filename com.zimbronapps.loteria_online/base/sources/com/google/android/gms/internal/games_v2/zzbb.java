package com.google.android.gms.internal.games_v2;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbb implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzbb(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return;
        }
        Exception exception = task.getException();
        zzfq.zza(exception);
        taskCompletionSource.trySetException(exception);
    }
}

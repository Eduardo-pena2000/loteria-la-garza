package com.google.android.gms.internal.games_v2;

import T6.c;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbf implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzbf(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (task.isSuccessful() && ((Boolean) task.getResult()).booleanValue()) {
            taskCompletionSource.trySetResult(c.b);
        } else {
            taskCompletionSource.trySetResult(c.c);
        }
    }
}

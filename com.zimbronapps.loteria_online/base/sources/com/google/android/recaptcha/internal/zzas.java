package com.google.android.recaptcha.internal;

import cb.W;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzas {
    public static final Task zza(W w) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        w.invokeOnCompletion(new zzar(taskCompletionSource, w));
        return taskCompletionSource.getTask();
    }
}

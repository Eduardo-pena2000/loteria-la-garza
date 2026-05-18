package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzafo {
    zzaeo zza;
    Executor zzb;

    public final Task zza(zzafq zzafqVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new zzafr(this, zzafqVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}

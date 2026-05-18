package com.google.android.gms.tasks;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final /* synthetic */ class zzac implements OnCompleteListener {
    private final /* synthetic */ com.google.android.gms.internal.tasks.zza zza;
    private final /* synthetic */ TaskCompletionSource zzb;
    private final /* synthetic */ zzb zzc;

    public /* synthetic */ zzac(com.google.android.gms.internal.tasks.zza zzaVar, TaskCompletionSource taskCompletionSource, zzb zzbVar) {
        this.zza = zzaVar;
        this.zzb = taskCompletionSource;
        this.zzc = zzbVar;
    }

    public final /* synthetic */ void onComplete(Task task) {
        this.zza.removeCallbacksAndMessages((Object) null);
        TaskCompletionSource taskCompletionSource = this.zzb;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else {
            if (task.isCanceled()) {
                this.zzc.zza();
                return;
            }
            Exception exception = task.getException();
            Objects.requireNonNull(exception);
            taskCompletionSource.trySetException(exception);
        }
    }
}

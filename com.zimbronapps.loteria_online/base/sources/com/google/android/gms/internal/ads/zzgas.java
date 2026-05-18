package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgas implements OnCompleteListener {
    private final /* synthetic */ zzgar zza;

    public /* synthetic */ zzgas(zzgar zzgarVar) {
        this.zza = zzgarVar;
    }

    public final /* synthetic */ void onComplete(Task task) {
        zzgar zzgarVar = this.zza;
        if (task.isCanceled()) {
            zzgarVar.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            zzgarVar.zza(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            throw new IllegalStateException();
        }
        zzgarVar.zzb(exception);
    }
}

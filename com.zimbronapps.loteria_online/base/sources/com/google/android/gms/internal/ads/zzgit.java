package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgit extends zzfvh {
    private final zzgdh zzb;

    public zzgit(Context context, Executor executor, zzgdh zzgdhVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzgdhVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }

    public final Task zzb(int i, long j) {
        this.zzb.zzb(i, j, null, null);
        return zzh();
    }

    public final Task zzc(int i, long j, Exception exc) {
        this.zzb.zzb(i, j, exc, null);
        return zzh();
    }

    public final Task zze(int i, String str) {
        this.zzb.zzb(i, -1L, null, str);
        return zzh();
    }
}

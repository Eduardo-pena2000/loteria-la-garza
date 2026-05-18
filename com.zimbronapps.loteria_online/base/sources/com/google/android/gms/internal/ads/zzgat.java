package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgat {
    public static x7.e zza(Task task, CancellationTokenSource cancellationTokenSource) {
        zzgar zzgarVar = new zzgar(task, null);
        task.addOnCompleteListener(zzhaf.zza(), new zzgas(zzgarVar));
        return zzgarVar;
    }
}

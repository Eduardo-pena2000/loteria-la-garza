package com.google.android.gms.internal.drive;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final /* synthetic */ class zzcj implements Continuation {
    private final zzg zzfp;

    public zzcj(zzg zzgVar) {
        this.zzfp = zzgVar;
    }

    public final Object then(Task task) {
        return zzch.zza(this.zzfp, task);
    }
}

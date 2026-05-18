package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final /* synthetic */ class zzci implements Continuation {
    private final l zzfo;

    public zzci(l lVar) {
        this.zzfo = lVar;
    }

    public final Object then(Task task) {
        return zzch.zza(this.zzfo, task);
    }
}

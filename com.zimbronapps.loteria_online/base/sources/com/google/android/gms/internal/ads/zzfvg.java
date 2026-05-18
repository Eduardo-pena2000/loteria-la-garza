package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfvg implements Continuation {
    static final /* synthetic */ zzfvg zza = new zzfvg();

    private /* synthetic */ zzfvg() {
    }

    public final /* synthetic */ Object then(Task task) {
        return new Boolean(task.isSuccessful());
    }
}

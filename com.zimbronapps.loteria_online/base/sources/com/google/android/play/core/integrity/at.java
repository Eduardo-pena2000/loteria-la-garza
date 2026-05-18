package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class at {
    private final r7.o a;
    private final r7.o b;

    public at(r7.o oVar, r7.o oVar2) {
        this.a = oVar;
        this.b = oVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, r7.f fVar) {
        Object a = this.a.a();
        a.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        fVar.getClass();
        return new as((Context) a, kVar, activity, taskCompletionSource, fVar);
    }
}

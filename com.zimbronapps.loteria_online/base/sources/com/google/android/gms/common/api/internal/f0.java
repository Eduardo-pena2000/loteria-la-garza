package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f0 extends w {
    public final /* synthetic */ w.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(w.a aVar, v6.d[] dVarArr, boolean z, int i) {
        super(dVarArr, z, i);
        this.a = aVar;
    }

    public final void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) {
        w.a.f(this.a).accept(bVar, taskCompletionSource);
    }
}

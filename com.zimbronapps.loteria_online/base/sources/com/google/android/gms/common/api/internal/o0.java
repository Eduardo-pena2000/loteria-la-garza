package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class o0 extends i0 {
    public final l.a c;

    public o0(l.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.c = aVar;
    }

    public final /* bridge */ /* synthetic */ void d(B b, boolean z) {
    }

    public final boolean f(L l) {
        a0 a0Var = (a0) l.u().get(this.c);
        return a0Var != null && a0Var.a.zab();
    }

    public final v6.d[] g(L l) {
        a0 a0Var = (a0) l.u().get(this.c);
        if (a0Var == null) {
            return null;
        }
        return a0Var.a.getRequiredFeatures();
    }

    public final void h(L l) {
        a0 a0Var = (a0) l.u().remove(this.c);
        if (a0Var == null) {
            this.b.trySetResult(Boolean.FALSE);
            return;
        }
        a0Var.b.unregisterListener(l.s(), this.b);
        a0Var.a.clearListener();
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m0 extends i0 {
    public final a0 c;

    public m0(a0 a0Var, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.c = a0Var;
    }

    public final /* bridge */ /* synthetic */ void d(B b, boolean z) {
    }

    public final boolean f(L l) {
        return this.c.a.zab();
    }

    public final v6.d[] g(L l) {
        return this.c.a.getRequiredFeatures();
    }

    public final void h(L l) {
        this.c.a.registerListener(l.s(), this.b);
        l.a listenerKey = this.c.a.getListenerKey();
        if (listenerKey != null) {
            l.u().put(listenerKey, this.c);
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r0 extends S {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ s0 b;

    public r0(s0 s0Var, Dialog dialog) {
        this.b = s0Var;
        this.a = dialog;
    }

    public final void a() {
        t0.g(this.b.b);
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s0 implements Runnable {
    public final q0 a;
    public final /* synthetic */ t0 b;

    public s0(t0 t0Var, q0 q0Var) {
        this.b = t0Var;
        this.a = q0Var;
    }

    public final void run() {
        if (this.b.a) {
            v6.b b = this.a.b();
            if (b.Q1()) {
                t0 t0Var = this.b;
                t0Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(t0Var.getActivity(), (PendingIntent) com.google.android.gms.common.internal.t.l(b.P1()), this.a.a(), false), 1);
                return;
            }
            t0 t0Var2 = this.b;
            if (t0Var2.d.b(t0Var2.getActivity(), b.N1(), null) != null) {
                t0 t0Var3 = this.b;
                t0Var3.d.x(t0Var3.getActivity(), t0Var3.mLifecycleFragment, b.N1(), 2, this.b);
                return;
            }
            if (b.N1() != 18) {
                t0.f(this.b, b, this.a.a());
                return;
            }
            t0 t0Var4 = this.b;
            Dialog s = t0Var4.d.s(t0Var4.getActivity(), t0Var4);
            t0 t0Var5 = this.b;
            t0Var5.d.t(t0Var5.getActivity().getApplicationContext(), new r0(this, s));
        }
    }
}

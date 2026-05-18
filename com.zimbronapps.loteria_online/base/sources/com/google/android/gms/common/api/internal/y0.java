package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class y0 implements Runnable {
    public final /* synthetic */ j a;
    public final /* synthetic */ String b;
    public final /* synthetic */ z0 c;

    public y0(z0 z0Var, j jVar, String str) {
        this.a = jVar;
        this.b = str;
        Objects.requireNonNull(z0Var);
        this.c = z0Var;
    }

    public final void run() {
        Bundle bundle;
        z0 z0Var = this.c;
        if (z0Var.k() > 0) {
            j jVar = this.a;
            if (z0Var.l() != null) {
                bundle = z0Var.l().getBundle(this.b);
            } else {
                bundle = null;
            }
            jVar.onCreate(bundle);
        }
        if (z0Var.k() >= 2) {
            this.a.onStart();
        }
        if (z0Var.k() >= 3) {
            this.a.onResume();
        }
        if (z0Var.k() >= 4) {
            this.a.onStop();
        }
        if (z0Var.k() >= 5) {
            this.a.onDestroy();
        }
    }
}

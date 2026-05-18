package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l0 extends p0 {
    public final d b;

    public l0(int i, d dVar) {
        super(i);
        this.b = (d) com.google.android.gms.common.internal.t.m(dVar, "Null methods are not runnable.");
    }

    public final void a(Status status) {
        try {
            this.b.setFailedResult(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public final void b(Exception exc) {
        try {
            this.b.setFailedResult(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public final void c(L l) {
        try {
            this.b.run(l.s());
        } catch (RuntimeException e) {
            b(e);
        }
    }

    public final void d(B b, boolean z) {
        b.c(this.b, z);
    }
}

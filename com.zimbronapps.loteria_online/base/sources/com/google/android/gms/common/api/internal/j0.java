package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j0 extends com.google.android.gms.common.api.p implements com.google.android.gms.common.api.n {
    public final WeakReference e;
    public final h0 f;
    public j0 a = null;
    public com.google.android.gms.common.api.i b = null;
    public final Object c = new Object();
    public Status d = null;
    public boolean g = false;

    public j0(WeakReference weakReference) {
        com.google.android.gms.common.internal.t.m(weakReference, "GoogleApiClient reference must not be null");
        this.e = weakReference;
        com.google.android.gms.common.api.h hVar = (com.google.android.gms.common.api.h) weakReference.get();
        this.f = new h0(this, hVar != null ? hVar.f() : Looper.getMainLooper());
    }

    public static /* bridge */ /* synthetic */ j0 b(j0 j0Var) {
        return j0Var.a;
    }

    public static /* bridge */ /* synthetic */ Object c(j0 j0Var) {
        return j0Var.c;
    }

    public static /* bridge */ /* synthetic */ void d(j0 j0Var, Status status) {
        j0Var.f(status);
    }

    public static final void j(com.google.android.gms.common.api.m mVar) {
        if (mVar instanceof com.google.android.gms.common.api.k) {
            try {
                ((com.google.android.gms.common.api.k) mVar).release();
            } catch (RuntimeException e) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(mVar)), e);
            }
        }
    }

    public final com.google.android.gms.common.api.p a(com.google.android.gms.common.api.o oVar) {
        j0 j0Var;
        synchronized (this.c) {
            com.google.android.gms.common.internal.t.p(true, "Cannot call then() twice.");
            com.google.android.gms.common.internal.t.p(true, "Cannot call then() and andFinally() on the same TransformedResult.");
            j0Var = new j0(this.e);
            this.a = j0Var;
            g();
        }
        return j0Var;
    }

    public final void e(com.google.android.gms.common.api.i iVar) {
        synchronized (this.c) {
            this.b = iVar;
            g();
        }
    }

    public final void f(Status status) {
        synchronized (this.c) {
            this.d = status;
            h(status);
        }
    }

    public final void g() {
    }

    public final void h(Status status) {
        synchronized (this.c) {
            try {
                if (i()) {
                    android.support.v4.media.session.b.a(com.google.android.gms.common.internal.t.l(null));
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i() {
        return false;
    }

    public final void onResult(com.google.android.gms.common.api.m mVar) {
        synchronized (this.c) {
            try {
                if (!mVar.getStatus().R1()) {
                    f(mVar.getStatus());
                    j(mVar);
                } else if (i()) {
                    android.support.v4.media.session.b.a(com.google.android.gms.common.internal.t.l(null));
                    throw null;
                }
            } finally {
            }
        }
    }
}

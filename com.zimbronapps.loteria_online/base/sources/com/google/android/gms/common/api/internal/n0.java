package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n0 extends V {
    public final w b;
    public final TaskCompletionSource c;
    public final u d;

    public n0(int i, w wVar, TaskCompletionSource taskCompletionSource, u uVar) {
        super(i);
        this.c = taskCompletionSource;
        this.b = wVar;
        this.d = uVar;
        if (i == 2 && wVar.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.c.trySetException(this.d.a(status));
    }

    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    public final void c(L l) {
        try {
            this.b.doExecute(l.s(), this.c);
        } catch (RuntimeException e) {
            this.c.trySetException(e);
        } catch (RemoteException e2) {
            a(p0.e(e2));
        } catch (DeadObjectException e3) {
            throw e3;
        }
    }

    public final void d(B b, boolean z) {
        b.d(this.c, z);
    }

    public final boolean f(L l) {
        return this.b.shouldAutoResolveMissingFeatures();
    }

    public final v6.d[] g(L l) {
        return this.b.zab();
    }
}

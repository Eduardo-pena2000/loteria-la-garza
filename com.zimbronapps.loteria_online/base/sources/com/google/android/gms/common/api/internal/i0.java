package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class i0 extends V {
    public final TaskCompletionSource b;

    public i0(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    public final void a(Status status) {
        this.b.trySetException(new com.google.android.gms.common.api.b(status));
    }

    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    public final void c(L l) {
        try {
            h(l);
        } catch (RemoteException e) {
            a(p0.e(e));
        } catch (RuntimeException e2) {
            this.b.trySetException(e2);
        } catch (DeadObjectException e3) {
            a(p0.e(e3));
            throw e3;
        }
    }

    public abstract void h(L l);
}

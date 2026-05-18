package com.google.android.gms.internal.auth-api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import l6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zbx extends zbh {
    final /* synthetic */ TaskCompletionSource zba;

    public zbx(zbad zbadVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbadVar);
    }

    public final void zbb(Status status, b bVar) throws RemoteException {
        if (status.R1()) {
            this.zba.setResult(bVar);
        } else {
            this.zba.setException(com.google.android.gms.common.internal.b.a(status));
        }
    }
}

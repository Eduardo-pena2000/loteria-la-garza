package com.google.android.gms.internal.auth-api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import l6.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zbaf extends zbr {
    final /* synthetic */ TaskCompletionSource zba;

    public zbaf(zbaj zbajVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbajVar);
    }

    public final void zbb(Status status, j jVar) throws RemoteException {
        if (status.R1()) {
            this.zba.setResult(jVar);
        } else {
            this.zba.setException(b.a(status));
        }
    }
}

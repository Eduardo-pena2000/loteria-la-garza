package com.google.android.gms.internal.auth-api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zbz extends h.a {
    final /* synthetic */ TaskCompletionSource zba;

    public zbz(zbad zbadVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbadVar);
    }

    public final void onResult(Status status) throws RemoteException {
        if (status.R1()) {
            this.zba.setResult((Object) null);
        } else {
            this.zba.setException(b.a(status));
        }
    }
}

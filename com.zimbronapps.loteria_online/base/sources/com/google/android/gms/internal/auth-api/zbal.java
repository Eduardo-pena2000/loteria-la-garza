package com.google.android.gms.internal.auth-api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import l6.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zbal extends zbk {
    final /* synthetic */ TaskCompletionSource zba;

    public zbal(zbat zbatVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbatVar);
    }

    public final void zbb(Status status, d dVar) throws RemoteException {
        x.b(status, dVar, this.zba);
    }
}

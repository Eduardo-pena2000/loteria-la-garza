package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzhh extends zzl {
    private TaskCompletionSource zziv;

    public zzhh(TaskCompletionSource taskCompletionSource) {
        this.zziv = taskCompletionSource;
    }

    public final void zza(Status status) throws RemoteException {
        this.zziv.setException(new b(status));
    }

    public final TaskCompletionSource zzay() {
        return this.zziv;
    }
}

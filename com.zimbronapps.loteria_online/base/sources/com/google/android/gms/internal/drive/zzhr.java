package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhr extends zzhh {
    public zzhr(TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
    }

    public final void onSuccess() throws RemoteException {
        x.a(Status.f, zzay());
    }
}

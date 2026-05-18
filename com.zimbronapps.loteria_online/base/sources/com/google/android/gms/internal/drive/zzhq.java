package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhq extends zzhh {
    public zzhq(TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
    }

    public final void onSuccess() throws RemoteException {
        zzay().setResult(Boolean.TRUE);
    }
}

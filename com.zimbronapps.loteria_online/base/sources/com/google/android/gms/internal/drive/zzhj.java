package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhj extends zzhh {
    public zzhj(TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
    }

    public final void zza(zzfn zzfnVar) throws RemoteException {
        zzay().setResult(zzfnVar.getDriveId().M1());
    }
}

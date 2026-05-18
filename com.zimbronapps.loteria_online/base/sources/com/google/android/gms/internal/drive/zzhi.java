package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhi extends zzhh {
    public zzhi(TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
    }

    public final void zza(zzfh zzfhVar) throws RemoteException {
        zzay().setResult(new zzbi(zzfhVar.zzar()));
    }
}

package com.google.android.gms.internal.drive;

import H6.p;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzho extends zzhh {
    public zzho(TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
    }

    public final void zza(zzfv zzfvVar) throws RemoteException {
        zzay().setResult(new p(zzfvVar.zzav()));
    }
}

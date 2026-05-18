package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhl extends zzhh {
    public zzhl(TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
    }

    public final void zza(zzfn zzfnVar) throws RemoteException {
        zzay().setResult(zzfnVar.getDriveId());
    }

    public final void zza(zzfy zzfyVar) throws RemoteException {
        zzay().setResult(new zzaa(zzfyVar.zzaw()).getDriveId());
    }
}

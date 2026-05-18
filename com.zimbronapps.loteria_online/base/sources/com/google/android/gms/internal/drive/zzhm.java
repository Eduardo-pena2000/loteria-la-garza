package com.google.android.gms.internal.drive;

import H6.u;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhm extends zzhh {
    public zzhm(TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
    }

    public final void zza(zzfj zzfjVar) throws RemoteException {
        zzay().setResult(new u(zzfjVar.zzas()).a());
    }

    public final void zza(zzga zzgaVar) throws RemoteException {
        zzay().setResult(zzgaVar.zzax());
    }
}

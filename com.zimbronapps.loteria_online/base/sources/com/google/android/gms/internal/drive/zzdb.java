package com.google.android.gms.internal.drive;

import H6.i;
import H6.q;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdb extends w {
    private final /* synthetic */ q zzfd;
    private final /* synthetic */ i zzfz;

    public zzdb(zzch zzchVar, q qVar, i iVar) {
        this.zzfd = qVar;
        this.zzfz = iVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzaw zzawVar = (zzaw) bVar;
        this.zzfd.b().O1(zzawVar.getContext());
        ((zzeo) zzawVar.getService()).zza(new zzy(this.zzfz.getDriveId(), this.zzfd.b()), new zzhk(taskCompletionSource));
    }
}

package com.google.android.gms.internal.drive;

import H6.k;
import H6.q;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdd extends w {
    private final /* synthetic */ q zzfd;
    private final /* synthetic */ k zzfq;

    public zzdd(zzch zzchVar, q qVar, k kVar) {
        this.zzfd = qVar;
        this.zzfq = kVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzaw zzawVar = (zzaw) bVar;
        this.zzfd.b().O1(zzawVar.getContext());
        ((zzeo) zzawVar.getService()).zza(new zzhf(this.zzfq.getDriveId(), this.zzfd.b()), new zzhp(taskCompletionSource));
    }
}

package com.google.android.gms.internal.drive;

import H6.H;
import H6.g;
import H6.q;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcy extends w {
    private final /* synthetic */ q zzew;
    private final /* synthetic */ g zzfx;
    private final /* synthetic */ H zzfy;

    public zzcy(zzch zzchVar, H h, g gVar, q qVar) {
        this.zzfy = h;
        this.zzfx = gVar;
        this.zzew = qVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzaw zzawVar = (zzaw) bVar;
        try {
            this.zzfy.b(zzawVar);
        } catch (IllegalStateException e) {
            taskCompletionSource.setException(e);
        }
        this.zzfx.zzj();
        this.zzew.b().O1(zzawVar.getContext());
        ((zzeo) zzawVar.getService()).zza(new zzm(this.zzfx.getDriveId(), this.zzew.b(), this.zzfx.zzi().Q1(), this.zzfx.zzi().zzb(), this.zzfy), new zzhr(taskCompletionSource));
    }
}

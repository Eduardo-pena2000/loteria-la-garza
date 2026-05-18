package com.google.android.gms.internal.drive;

import L6.c;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcz extends w {
    private final /* synthetic */ c zzdu;

    public zzcz(zzch zzchVar, c cVar) {
        this.zzdu = cVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzgq(this.zzdu), new zzhn(taskCompletionSource));
    }
}

package com.google.android.gms.internal.drive;

import H6.g;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcx extends w {
    private final /* synthetic */ g zzfx;

    public zzcx(zzch zzchVar, g gVar) {
        this.zzfx = gVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzgj(this.zzfx.getDriveId(), 536870912, this.zzfx.zzi().Q1()), new zzhi(taskCompletionSource));
    }
}

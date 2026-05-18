package com.google.android.gms.internal.drive;

import H6.k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzde extends w {
    private final /* synthetic */ k zzfq;

    public zzde(zzch zzchVar, k kVar) {
        this.zzfq = kVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzex(this.zzfq.getDriveId()), new zzho(taskCompletionSource));
    }
}

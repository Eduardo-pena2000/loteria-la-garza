package com.google.android.gms.internal.drive;

import H6.k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcr extends w {
    private final /* synthetic */ k zzfq;

    public zzcr(zzch zzchVar, k kVar) {
        this.zzfq = kVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzaw zzawVar = (zzaw) bVar;
        if (!zzawVar.zzec) {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
        }
        ((zzeo) zzawVar.getService()).zza(new zzj(1, this.zzfq.getDriveId()), (zzes) null, (String) null, new zzhr(taskCompletionSource));
    }
}

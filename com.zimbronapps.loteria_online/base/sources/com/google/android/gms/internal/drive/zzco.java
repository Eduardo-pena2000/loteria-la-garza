package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzco extends w {
    public zzco(zzch zzchVar) {
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzaw zzawVar = (zzaw) bVar;
        if (zzawVar.zzaf() == null) {
            taskCompletionSource.setException(new b(new Status(10, "Drive#SCOPE_APPFOLDER must be requested")));
        } else {
            taskCompletionSource.setResult(new zzbs(zzawVar.zzaf()));
        }
    }
}

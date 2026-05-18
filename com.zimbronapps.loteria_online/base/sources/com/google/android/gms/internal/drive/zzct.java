package com.google.android.gms.internal.drive;

import H6.h;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzct extends w {
    private final /* synthetic */ h zzfs;
    private final /* synthetic */ int zzft;

    public zzct(zzch zzchVar, h hVar, int i) {
        this.zzfs = hVar;
        this.zzft = i;
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzgj(this.zzfs.getDriveId(), this.zzft, 0), new zzhi(taskCompletionSource));
    }
}

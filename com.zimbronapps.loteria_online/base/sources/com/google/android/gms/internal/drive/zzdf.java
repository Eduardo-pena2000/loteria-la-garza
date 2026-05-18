package com.google.android.gms.internal.drive;

import H6.k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdf extends w {
    private final /* synthetic */ k zzfq;
    private final /* synthetic */ List zzgb;

    public zzdf(zzch zzchVar, k kVar, List list) {
        this.zzfq = kVar;
        this.zzgb = list;
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzgw(this.zzfq.getDriveId(), this.zzgb), new zzhr(taskCompletionSource));
    }
}

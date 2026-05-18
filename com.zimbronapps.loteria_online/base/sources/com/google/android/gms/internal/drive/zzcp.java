package com.google.android.gms.internal.drive;

import H6.k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcp extends p {
    private final /* synthetic */ k zzfq;
    private final /* synthetic */ zzdi zzfr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(zzch zzchVar, l lVar, k kVar, zzdi zzdiVar) {
        super(lVar);
        this.zzfq = kVar;
        this.zzfr = zzdiVar;
    }

    public final /* synthetic */ void registerListener(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzj(1, this.zzfq.getDriveId()), zzdi.zza(this.zzfr), (String) null, new zzhr(taskCompletionSource));
    }
}

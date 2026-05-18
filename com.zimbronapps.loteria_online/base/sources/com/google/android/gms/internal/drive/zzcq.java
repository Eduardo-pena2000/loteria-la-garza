package com.google.android.gms.internal.drive;

import H6.k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcq extends y {
    private final /* synthetic */ k zzfq;
    private final /* synthetic */ zzdi zzfr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcq(zzch zzchVar, l.a aVar, k kVar, zzdi zzdiVar) {
        super(aVar);
        this.zzfq = kVar;
        this.zzfr = zzdiVar;
    }

    public final /* synthetic */ void unregisterListener(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzgs(this.zzfq.getDriveId(), 1), zzdi.zza(this.zzfr), (String) null, new zzhq(taskCompletionSource));
    }
}

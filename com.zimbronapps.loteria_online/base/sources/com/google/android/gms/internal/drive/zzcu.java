package com.google.android.gms.internal.drive;

import H6.h;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcu extends p {
    private final /* synthetic */ h zzfs;
    private final /* synthetic */ int zzft;
    private final /* synthetic */ zzg zzfu;
    private final /* synthetic */ l zzfv;
    private final /* synthetic */ zzch zzfw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzch zzchVar, l lVar, h hVar, int i, zzg zzgVar, l lVar2) {
        super(lVar);
        this.zzfw = zzchVar;
        this.zzfs = hVar;
        this.zzft = i;
        this.zzfu = zzgVar;
        this.zzfv = lVar2;
    }

    public final /* synthetic */ void registerListener(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zzfu.setCancelToken(m.a.q1(((zzeo) ((zzaw) bVar).getService()).zza(new zzgj(this.zzfs.getDriveId(), this.zzft, 0), new zzdk(this.zzfw, this.zzfu, this.zzfv)).zzgs));
        taskCompletionSource.setResult(null);
    }
}

package com.google.android.gms.internal.drive;

import H6.h;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbo extends zzam {
    private final /* synthetic */ int zzdv;
    private final /* synthetic */ h.a zzey;
    private final /* synthetic */ zzbn zzez;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbo(zzbn zzbnVar, com.google.android.gms.common.api.h hVar, int i, h.a aVar) {
        super(hVar);
        this.zzez = zzbnVar;
        this.zzdv = i;
        this.zzey = aVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        setCancelToken(m.a.q1(((zzeo) ((zzaw) bVar).getService()).zza(new zzgj(this.zzez.getDriveId(), this.zzdv, 0), new zzgl(this, this.zzey)).zzgs));
    }
}

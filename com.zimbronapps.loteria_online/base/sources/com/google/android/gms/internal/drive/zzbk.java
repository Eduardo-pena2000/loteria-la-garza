package com.google.android.gms.internal.drive;

import H6.H;
import H6.q;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbk extends zzav {
    private final /* synthetic */ zzbi zzev;
    private final /* synthetic */ q zzew;
    private final /* synthetic */ H zzex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(zzbi zzbiVar, h hVar, q qVar, H h) {
        super(hVar);
        this.zzev = zzbiVar;
        this.zzew = qVar;
        this.zzex = h;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        zzaw zzawVar = (zzaw) bVar;
        this.zzew.b().O1(zzawVar.getContext());
        ((zzeo) zzawVar.getService()).zza(new zzm(zzbi.zza(this.zzev).getDriveId(), this.zzew.b(), zzbi.zza(this.zzev).Q1(), zzbi.zza(this.zzev).zzb(), this.zzex), new zzgy(this));
    }
}

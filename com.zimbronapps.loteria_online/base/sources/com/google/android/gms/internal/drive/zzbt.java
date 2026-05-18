package com.google.android.gms.internal.drive;

import H6.m;
import H6.q;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbt extends zzby {
    private final /* synthetic */ q zzfd;
    private final /* synthetic */ int zzfe;
    private final /* synthetic */ int zzff;
    private final /* synthetic */ m zzfg;
    private final /* synthetic */ zzbs zzfh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbt(zzbs zzbsVar, h hVar, q qVar, int i, int i2, m mVar) {
        super(hVar);
        this.zzfh = zzbsVar;
        this.zzfd = qVar;
        this.zzfe = i;
        this.zzff = i2;
        this.zzfg = mVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        zzaw zzawVar = (zzaw) bVar;
        this.zzfd.b().O1(zzawVar.getContext());
        ((zzeo) zzawVar.getService()).zza(new zzw(this.zzfh.getDriveId(), this.zzfd.b(), this.zzfe, this.zzff, this.zzfg), new zzbv(this));
    }
}

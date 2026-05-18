package com.google.android.gms.internal.drive;

import H6.q;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbu extends zzca {
    private final /* synthetic */ q zzfd;
    private final /* synthetic */ zzbs zzfh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbu(zzbs zzbsVar, h hVar, q qVar) {
        super(hVar);
        this.zzfh = zzbsVar;
        this.zzfd = qVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        zzaw zzawVar = (zzaw) bVar;
        this.zzfd.b().O1(zzawVar.getContext());
        ((zzeo) zzawVar.getService()).zza(new zzy(this.zzfh.getDriveId(), this.zzfd.b()), new zzbw(this));
    }
}

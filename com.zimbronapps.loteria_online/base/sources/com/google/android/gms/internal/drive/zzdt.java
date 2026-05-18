package com.google.android.gms.internal.drive;

import H6.q;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdt extends zzea {
    private final /* synthetic */ q zzfd;
    private final /* synthetic */ zzdp zzgq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdt(zzdp zzdpVar, h hVar, q qVar) {
        super(zzdpVar, hVar, null);
        this.zzgq = zzdpVar;
        this.zzfd = qVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        zzaw zzawVar = (zzaw) bVar;
        this.zzfd.b().O1(zzawVar.getContext());
        ((zzeo) zzawVar.getService()).zza(new zzhf(this.zzgq.zzk, this.zzfd.b()), new zzdy(this));
    }
}

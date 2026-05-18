package com.google.android.gms.internal.drive;

import L6.c;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzag extends zzar {
    private final /* synthetic */ c zzdu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzaf zzafVar, h hVar, c cVar) {
        super(hVar);
        this.zzdu = cVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzgq(this.zzdu), new zzas(this));
    }
}

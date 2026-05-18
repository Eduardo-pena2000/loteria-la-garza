package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdr extends zzar {
    private final /* synthetic */ zzdp zzgq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzdp zzdpVar, h hVar) {
        super(hVar);
        this.zzgq = zzdpVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzex(this.zzgq.zzk), new zzdx(this));
    }
}

package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdv extends zzav {
    private final /* synthetic */ zzdp zzgq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzdp zzdpVar, h hVar) {
        super(hVar);
        this.zzgq = zzdpVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzhb(this.zzgq.zzk), new zzgy(this));
    }
}

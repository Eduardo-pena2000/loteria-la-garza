package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcc extends zzcg {
    private final /* synthetic */ zzcb zzfk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcc(zzcb zzcbVar, h hVar) {
        super(zzcbVar, hVar);
        this.zzfk = zzcbVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zzb(new zzce(this.zzfk, this, null));
    }
}

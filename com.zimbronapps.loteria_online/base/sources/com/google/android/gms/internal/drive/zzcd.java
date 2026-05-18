package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcd extends zzav {
    private final /* synthetic */ zzei zzfl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcd(zzcb zzcbVar, h hVar, zzei zzeiVar) {
        super(hVar);
        this.zzfl = zzeiVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzgu(this.zzfl), new zzgy(this));
    }
}

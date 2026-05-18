package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzay extends zzav {
    private final /* synthetic */ zzee zzel;
    private final /* synthetic */ zzgs zzem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(zzaw zzawVar, h hVar, zzgs zzgsVar, zzee zzeeVar) {
        super(hVar);
        this.zzem = zzgsVar;
        this.zzel = zzeeVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(this.zzem, this.zzel, (String) null, new zzgy(this));
    }
}

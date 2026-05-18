package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzax extends zzav {
    private final /* synthetic */ zzj zzek;
    private final /* synthetic */ zzee zzel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzaw zzawVar, h hVar, zzj zzjVar, zzee zzeeVar) {
        super(hVar);
        this.zzek = zzjVar;
        this.zzel = zzeeVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(this.zzek, this.zzel, (String) null, new zzgy(this));
    }
}

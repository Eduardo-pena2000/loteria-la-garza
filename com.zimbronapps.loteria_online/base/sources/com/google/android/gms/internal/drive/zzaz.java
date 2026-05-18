package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaz extends zzav {
    private final /* synthetic */ zzj zzek;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzaw zzawVar, h hVar, zzj zzjVar) {
        super(hVar);
        this.zzek = zzjVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(this.zzek, (zzes) null, (String) null, new zzgy(this));
    }
}

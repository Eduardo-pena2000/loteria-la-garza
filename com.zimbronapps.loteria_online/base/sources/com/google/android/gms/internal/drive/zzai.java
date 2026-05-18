package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.drive.DriveId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzai extends zzap {
    private final /* synthetic */ String zzdw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzai(zzaf zzafVar, h hVar, String str) {
        super(hVar);
        this.zzdw = str;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzek(DriveId.P1(this.zzdw), false), new zzan(this));
    }
}

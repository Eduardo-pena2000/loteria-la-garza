package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbj extends zzam {
    private final /* synthetic */ zzbi zzev;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbi zzbiVar, h hVar) {
        super(hVar);
        this.zzev = zzbiVar;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzgj(this.zzev.getDriveId(), 536870912, zzbi.zza(this.zzev).Q1()), new zzgl(this, null));
    }
}

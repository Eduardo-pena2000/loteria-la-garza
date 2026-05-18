package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzah extends zzam {
    private final /* synthetic */ int zzdv = 536870912;

    public zzah(zzaf zzafVar, h hVar, int i) {
        super(hVar);
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzr(this.zzdv), new zzak(this));
    }
}

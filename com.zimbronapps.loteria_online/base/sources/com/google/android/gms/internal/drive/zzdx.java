package com.google.android.gms.internal.drive;

import H6.p;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdx extends zzl {
    private final e zzdx;

    public zzdx(e eVar) {
        this.zzdx = eVar;
    }

    public final void zza(zzfv zzfvVar) throws RemoteException {
        this.zzdx.setResult(new zzaq(Status.f, new p(zzfvVar.zzij), false));
    }

    public final void zza(Status status) throws RemoteException {
        this.zzdx.setResult(new zzaq(status, null, false));
    }
}

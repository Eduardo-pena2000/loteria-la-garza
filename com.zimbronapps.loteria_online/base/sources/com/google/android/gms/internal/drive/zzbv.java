package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbv extends zzl {
    private final e zzdx;

    public zzbv(e eVar) {
        this.zzdx = eVar;
    }

    public final void zza(zzfn zzfnVar) throws RemoteException {
        this.zzdx.setResult(new zzbx(Status.f, new zzbn(zzfnVar.zzdd)));
    }

    public final void zza(Status status) throws RemoteException {
        this.zzdx.setResult(new zzbx(status, null));
    }
}

package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzan extends zzl {
    private final e zzdx;

    public zzan(e eVar) {
        this.zzdx = eVar;
    }

    public final void zza(zzfy zzfyVar) throws RemoteException {
        this.zzdx.setResult(new zzao(Status.f, new zzaa(zzfyVar.zzdn).getDriveId()));
    }

    public final void zza(zzfn zzfnVar) throws RemoteException {
        this.zzdx.setResult(new zzao(Status.f, zzfnVar.zzdd));
    }

    public final void zza(Status status) throws RemoteException {
        this.zzdx.setResult(new zzao(status, null));
    }
}

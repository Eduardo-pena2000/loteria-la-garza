package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzce extends zzl {
    private final e zzdx;
    private final /* synthetic */ zzcb zzfk;

    private zzce(zzcb zzcbVar, e eVar) {
        this.zzfk = zzcbVar;
        this.zzdx = eVar;
    }

    public final void zza(zzfj zzfjVar) throws RemoteException {
        this.zzdx.setResult(new zzcf(this.zzfk, Status.f, zzfjVar.zzhw, null));
    }

    public /* synthetic */ zzce(zzcb zzcbVar, e eVar, zzcc zzccVar) {
        this(zzcbVar, eVar);
    }

    public final void zza(Status status) throws RemoteException {
        this.zzdx.setResult(new zzcf(this.zzfk, status, null, null));
    }
}

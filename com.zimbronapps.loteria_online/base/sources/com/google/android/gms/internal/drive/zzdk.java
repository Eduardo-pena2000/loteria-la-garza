package com.google.android.gms.internal.drive;

import I6.e;
import I6.g;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdk extends zzl {
    private final /* synthetic */ zzch zzfw;
    private final e zzgj;
    private final l zzgk;

    public zzdk(zzch zzchVar, e eVar, l lVar) {
        this.zzfw = zzchVar;
        this.zzgj = eVar;
        this.zzgk = lVar;
    }

    public final void zza(Status status) throws RemoteException {
        zza(new zzdl(this, status));
    }

    public final void zza(zzfl zzflVar) throws RemoteException {
        zza(new zzdm(zzflVar));
    }

    public final void zza(zzfh zzfhVar) throws RemoteException {
        zza(new zzdn(this, zzfhVar));
    }

    private final void zza(zzdg zzdgVar) {
        this.zzgk.c(new zzdo(this, zzdgVar));
    }

    public final /* synthetic */ void zza(zzfh zzfhVar, g gVar) {
        new zzbi(zzfhVar.zzes);
        throw null;
    }

    public final /* synthetic */ void zza(Status status, g gVar) {
        b.a(status);
        throw null;
    }
}

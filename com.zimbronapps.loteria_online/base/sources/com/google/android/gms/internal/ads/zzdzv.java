package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdzv extends zzcbf {
    final /* synthetic */ zzdzx zza;

    public zzdzv(zzdzx zzdzxVar) {
        Objects.requireNonNull(zzdzxVar);
        this.zza = zzdzxVar;
    }

    public final void zze() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzk(zzdzxVar.zzd());
    }

    public final void zzf(int i) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzl(zzdzxVar.zzd(), i);
    }

    public final void zzg(c1 c1Var) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzl(zzdzxVar.zzd(), c1Var.a);
    }
}

package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdzs extends S5.J {
    final /* synthetic */ zzdzm zza;
    final /* synthetic */ zzdzt zzb;

    public zzdzs(zzdzt zzdztVar, zzdzm zzdzmVar) {
        this.zza = zzdzmVar;
        Objects.requireNonNull(zzdztVar);
        this.zzb = zzdztVar;
    }

    public final void zzb() throws RemoteException {
        this.zza.zzi(this.zzb.zzd());
    }

    public final void zzc(int i) throws RemoteException {
        this.zza.zzf(this.zzb.zzd(), i);
    }

    public final void zzd(c1 c1Var) throws RemoteException {
        this.zza.zzf(this.zzb.zzd(), c1Var.a);
    }

    public final void zze() {
    }

    public final void zzf() throws RemoteException {
        this.zza.zze(this.zzb.zzd());
    }

    public final void zzg() throws RemoteException {
        this.zza.zzg(this.zzb.zzd());
    }

    public final void zzh() throws RemoteException {
        this.zza.zzh(this.zzb.zzd());
    }

    public final void zzi() {
    }

    public final void zzj() {
    }
}

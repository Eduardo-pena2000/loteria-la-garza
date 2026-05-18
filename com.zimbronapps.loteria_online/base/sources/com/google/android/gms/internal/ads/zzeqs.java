package com.google.android.gms.internal.ads;

import S5.l2;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeqs extends S5.P {
    private final zzesa zza;

    public zzeqs(Context context, zzcma zzcmaVar, zzfjj zzfjjVar, zzdor zzdorVar, S5.K k) {
        zzesc zzescVar = new zzesc(zzdorVar, zzcmaVar.zzD());
        zzescVar.zza(k);
        this.zza = new zzesa(new zzesm(zzcmaVar, context, zzescVar, zzfjjVar), zzfjjVar.zzh());
    }

    public final void zze(l2 l2Var) throws RemoteException {
        this.zza.zzb(l2Var, 1);
    }

    public final synchronized String zzf() {
        return this.zza.zzc();
    }

    public final synchronized boolean zzg() throws RemoteException {
        return this.zza.zza();
    }

    public final synchronized String zzh() {
        return this.zza.zzd();
    }

    public final synchronized void zzi(l2 l2Var, int i) throws RemoteException {
        this.zza.zzb(l2Var, i);
    }
}

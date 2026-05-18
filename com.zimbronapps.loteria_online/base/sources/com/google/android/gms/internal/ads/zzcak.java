package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcak extends zzbcs implements zzcam {
    public zzcak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzi(zzcag zzcagVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcagVar);
        zzda(5, zza);
    }

    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    public final void zzk(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(7, zza);
    }

    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }
}

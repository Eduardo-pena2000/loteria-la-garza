package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcba extends zzbcs implements zzcbc {
    public zzcba(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    public final void zzg(zzcaw zzcawVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcawVar);
        zzda(3, zza);
    }

    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(4, zza);
    }

    public final void zzi(c1 c1Var) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, c1Var);
        zzda(5, zza);
    }

    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    public final void zzk() throws RemoteException {
        zzda(7, zza());
    }
}

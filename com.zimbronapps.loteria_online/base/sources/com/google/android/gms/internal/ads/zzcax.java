package com.google.android.gms.internal.ads;

import S5.S0;
import S5.V0;
import S5.b1;
import S5.d1;
import S5.l2;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcax extends zzbcs implements zzcaz {
    public zzcax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public final void zzb(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(5, zza);
    }

    public final void zzc(l2 l2Var, zzcbg zzcbgVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, l2Var);
        zzbcu.zze(zza, zzcbgVar);
        zzda(1, zza);
    }

    public final void zzd(l2 l2Var, zzcbg zzcbgVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, l2Var);
        zzbcu.zze(zza, zzcbgVar);
        zzda(14, zza);
    }

    public final void zze(zzcbc zzcbcVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcbcVar);
        zzda(2, zza);
    }

    public final void zzf(S0 s0) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, s0);
        zzda(8, zza);
    }

    public final Bundle zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        Bundle zzb = zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return zzb;
    }

    public final void zzh(zzcbn zzcbnVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzcbnVar);
        zzda(7, zza);
    }

    public final boolean zzi() throws RemoteException {
        throw null;
    }

    public final String zzj() throws RemoteException {
        throw null;
    }

    public final void zzk(N6.a aVar, boolean z) throws RemoteException {
        throw null;
    }

    public final zzcaw zzl() throws RemoteException {
        zzcaw zzcauVar;
        Parcel zzcZ = zzcZ(11, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcauVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcauVar = queryLocalInterface instanceof zzcaw ? (zzcaw) queryLocalInterface : new zzcau(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcauVar;
    }

    public final d1 zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        d1 zzb = b1.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final String zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(16, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final void zzo(V0 v0) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, v0);
        zzda(13, zza);
    }

    public final void zzp(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbcu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(15, zza);
    }

    public final long zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(17, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    public final void zzr(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzda(18, zza);
    }

    public final void zzs(zzcbh zzcbhVar) throws RemoteException {
        throw null;
    }
}

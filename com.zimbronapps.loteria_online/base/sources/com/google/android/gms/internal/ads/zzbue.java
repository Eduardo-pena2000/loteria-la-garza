package com.google.android.gms.internal.ads;

import N6.a;
import S5.f1;
import S5.g1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbue extends zzbcs implements IInterface {
    public zzbue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final List zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzf = zzbcu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }

    public final String zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final zzbks zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        zzbks zzh = zzbkr.zzh(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzh;
    }

    public final String zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final double zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    public final String zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final void zzm() throws RemoteException {
        zzda(10, zza());
    }

    public final void zzn(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(11, zza);
    }

    public final void zzo(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(12, zza);
    }

    public final boolean zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(14, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel zzcZ = zzcZ(15, zza());
        Bundle zzb = zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return zzb;
    }

    public final void zzs(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(16, zza);
    }

    public final g1 zzt() throws RemoteException {
        Parcel zzcZ = zzcZ(17, zza());
        g1 zzb = f1.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final N6.a zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(18, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final zzbkl zzv() throws RemoteException {
        Parcel zzcZ = zzcZ(19, zza());
        zzbkl zzj = zzbkk.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final N6.a zzw() throws RemoteException {
        Parcel zzcZ = zzcZ(20, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final N6.a zzx() throws RemoteException {
        Parcel zzcZ = zzcZ(21, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final void zzy(N6.a aVar, N6.a aVar2, N6.a aVar3) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        zzbcu.zze(zza, aVar3);
        zzda(22, zza);
    }
}

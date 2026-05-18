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
public final class zzbuf extends zzbcs implements IInterface {
    public zzbuf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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

    public final String zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final void zzk() throws RemoteException {
        zzda(8, zza());
    }

    public final void zzl(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(9, zza);
    }

    public final void zzm(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(10, zza);
    }

    public final boolean zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(11, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final boolean zzo() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final Bundle zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        Bundle zzb = zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return zzb;
    }

    public final void zzq(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(14, zza);
    }

    public final N6.a zzr() throws RemoteException {
        Parcel zzcZ = zzcZ(15, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final g1 zzs() throws RemoteException {
        Parcel zzcZ = zzcZ(16, zza());
        g1 zzb = f1.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzbkl zzt() throws RemoteException {
        Parcel zzcZ = zzcZ(19, zza());
        zzbkl zzj = zzbkk.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final N6.a zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(20, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final N6.a zzv() throws RemoteException {
        Parcel zzcZ = zzcZ(21, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final void zzw(N6.a aVar, N6.a aVar2, N6.a aVar3) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        zzbcu.zze(zza, aVar3);
        zzda(22, zza);
    }
}

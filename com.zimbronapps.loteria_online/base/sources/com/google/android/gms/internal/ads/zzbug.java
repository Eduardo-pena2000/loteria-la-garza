package com.google.android.gms.internal.ads;

import N6.a;
import S5.f1;
import S5.g1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbug extends zzbcs implements zzbui {
    public zzbug(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public final float zzA() throws RemoteException {
        Parcel zzcZ = zzcZ(24, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    public final float zzB() throws RemoteException {
        Parcel zzcZ = zzcZ(25, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    public final void zzC() throws RemoteException {
        zzda(26, zza());
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

    public final double zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    public final String zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(10, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final g1 zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(11, zza());
        g1 zzb = f1.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzbkl zzo() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        zzbkl zzj = zzbkk.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final N6.a zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final N6.a zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(14, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final N6.a zzr() throws RemoteException {
        Parcel zzcZ = zzcZ(15, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final Bundle zzs() throws RemoteException {
        Parcel zzcZ = zzcZ(16, zza());
        Bundle zzb = zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return zzb;
    }

    public final boolean zzt() throws RemoteException {
        Parcel zzcZ = zzcZ(17, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final boolean zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(18, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final void zzv() throws RemoteException {
        zzda(19, zza());
    }

    public final void zzw(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(20, zza);
    }

    public final void zzx(N6.a aVar, N6.a aVar2, N6.a aVar3) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        zzbcu.zze(zza, aVar3);
        zzda(21, zza);
    }

    public final void zzy(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(22, zza);
    }

    public final float zzz() throws RemoteException {
        Parcel zzcZ = zzcZ(23, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }
}

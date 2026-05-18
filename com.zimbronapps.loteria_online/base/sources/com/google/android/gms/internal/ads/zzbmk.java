package com.google.android.gms.internal.ads;

import N6.a;
import S5.H0;
import S5.L0;
import S5.V0;
import S5.b1;
import S5.d1;
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
public final class zzbmk extends zzbcs implements zzbmm {
    public zzbmk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final boolean zzA() throws RemoteException {
        Parcel zzcZ = zzcZ(24, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final void zzB(L0 l0) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, l0);
        zzda(25, zza);
    }

    public final void zzC(H0 h0) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, h0);
        zzda(26, zza);
    }

    public final void zzD() throws RemoteException {
        zzda(27, zza());
    }

    public final void zzE() throws RemoteException {
        zzda(28, zza());
    }

    public final zzbkp zzF() throws RemoteException {
        zzbkp zzbknVar;
        Parcel zzcZ = zzcZ(29, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbknVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbknVar = queryLocalInterface instanceof zzbkp ? (zzbkp) queryLocalInterface : new zzbkn(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbknVar;
    }

    public final boolean zzG() throws RemoteException {
        Parcel zzcZ = zzcZ(30, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final d1 zzH() throws RemoteException {
        Parcel zzcZ = zzcZ(31, zza());
        d1 zzb = b1.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final void zzI(V0 v0) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, v0);
        zzda(32, zza);
    }

    public final void zzJ(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzda(33, zza);
    }

    public final long zzK() throws RemoteException {
        Parcel zzcZ = zzcZ(34, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    public final void zzL(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzda(35, zza);
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
        zzbks zzbkqVar;
        Parcel zzcZ = zzcZ(5, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbkqVar = queryLocalInterface instanceof zzbks ? (zzbks) queryLocalInterface : new zzbkq(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbkqVar;
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

    public final String zzo() throws RemoteException {
        throw null;
    }

    public final void zzp() throws RemoteException {
        zzda(13, zza());
    }

    public final zzbkl zzq() throws RemoteException {
        zzbkl zzbkjVar;
        Parcel zzcZ = zzcZ(14, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbkjVar = queryLocalInterface instanceof zzbkl ? (zzbkl) queryLocalInterface : new zzbkj(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbkjVar;
    }

    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzda(15, zza);
    }

    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        Parcel zzcZ = zzcZ(16, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzda(17, zza);
    }

    public final N6.a zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(18, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final N6.a zzv() throws RemoteException {
        Parcel zzcZ = zzcZ(19, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final Bundle zzw() throws RemoteException {
        Parcel zzcZ = zzcZ(20, zza());
        Bundle zzb = zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return zzb;
    }

    public final void zzx(zzbmj zzbmjVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbmjVar);
        zzda(21, zza);
    }

    public final void zzy() throws RemoteException {
        zzda(22, zza());
    }

    public final List zzz() throws RemoteException {
        Parcel zzcZ = zzcZ(23, zza());
        ArrayList zzf = zzbcu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }
}

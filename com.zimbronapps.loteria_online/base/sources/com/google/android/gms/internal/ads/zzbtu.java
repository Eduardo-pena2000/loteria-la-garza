package com.google.android.gms.internal.ads;

import N6.a;
import S5.f1;
import S5.g1;
import S5.l2;
import S5.q2;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbtu extends zzbcs implements zzbtw {
    public zzbtu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zzA(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbcu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(25, zza);
    }

    public final g1 zzB() throws RemoteException {
        Parcel zzcZ = zzcZ(26, zza());
        g1 zzb = f1.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzbui zzC() throws RemoteException {
        zzbui zzbugVar;
        Parcel zzcZ = zzcZ(27, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbugVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbugVar = queryLocalInterface instanceof zzbui ? (zzbui) queryLocalInterface : new zzbug(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbugVar;
    }

    public final void zzD(N6.a aVar, l2 l2Var, String str, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, l2Var);
        zza.writeString(str);
        zzbcu.zze(zza, zzbtzVar);
        zzda(28, zza);
    }

    public final void zzE(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(30, zza);
    }

    public final void zzF(N6.a aVar, zzbqk zzbqkVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbqkVar);
        zza.writeTypedList(list);
        zzda(31, zza);
    }

    public final void zzG(N6.a aVar, l2 l2Var, String str, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, l2Var);
        zza.writeString(str);
        zzbcu.zze(zza, zzbtzVar);
        zzda(32, zza);
    }

    public final zzbwh zzH() throws RemoteException {
        Parcel zzcZ = zzcZ(33, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    public final zzbwh zzI() throws RemoteException {
        Parcel zzcZ = zzcZ(34, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    public final void zzJ(N6.a aVar, q2 q2Var, l2 l2Var, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, q2Var);
        zzbcu.zzc(zza, l2Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzda(35, zza);
    }

    public final zzbuc zzK() throws RemoteException {
        zzbuc zzbuaVar;
        Parcel zzcZ = zzcZ(36, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbuaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbuaVar = queryLocalInterface instanceof zzbuc ? (zzbuc) queryLocalInterface : new zzbua(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbuaVar;
    }

    public final void zzL(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(37, zza);
    }

    public final void zzM(N6.a aVar, l2 l2Var, String str, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, l2Var);
        zza.writeString(str);
        zzbcu.zze(zza, zzbtzVar);
        zzda(38, zza);
    }

    public final void zzN(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(39, zza);
    }

    public final zzbue zzO() throws RemoteException {
        zzbue zzbueVar;
        Parcel zzcZ = zzcZ(15, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbueVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbueVar = queryLocalInterface instanceof zzbue ? (zzbue) queryLocalInterface : new zzbue(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbueVar;
    }

    public final zzbuf zzP() throws RemoteException {
        zzbuf zzbufVar;
        Parcel zzcZ = zzcZ(16, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbufVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbufVar = queryLocalInterface instanceof zzbuf ? (zzbuf) queryLocalInterface : new zzbuf(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbufVar;
    }

    public final void zze(N6.a aVar, q2 q2Var, l2 l2Var, String str, zzbtz zzbtzVar) throws RemoteException {
        throw null;
    }

    public final N6.a zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final void zzg(N6.a aVar, l2 l2Var, String str, zzbtz zzbtzVar) throws RemoteException {
        throw null;
    }

    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    public final void zzj(N6.a aVar, q2 q2Var, l2 l2Var, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, q2Var);
        zzbcu.zzc(zza, l2Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzda(6, zza);
    }

    public final void zzk(N6.a aVar, l2 l2Var, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, l2Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzda(7, zza);
    }

    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    public final void zzm() throws RemoteException {
        zzda(9, zza());
    }

    public final void zzn(N6.a aVar, l2 l2Var, String str, zzcar zzcarVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, l2Var);
        zza.writeString((String) null);
        zzbcu.zze(zza, zzcarVar);
        zza.writeString(str2);
        zzda(10, zza);
    }

    public final void zzo(l2 l2Var, String str) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, l2Var);
        zza.writeString(str);
        zzda(11, zza);
    }

    public final void zzp() throws RemoteException {
        zzda(12, zza());
    }

    public final boolean zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final void zzr(N6.a aVar, l2 l2Var, String str, String str2, zzbtz zzbtzVar, zzbkh zzbkhVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, l2Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, zzbkhVar);
        zza.writeStringList(list);
        zzda(14, zza);
    }

    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    public final void zzv(l2 l2Var, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzw(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(21, zza);
    }

    public final boolean zzx() throws RemoteException {
        Parcel zzcZ = zzcZ(22, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final void zzy(N6.a aVar, zzcar zzcarVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzcarVar);
        zza.writeStringList(list);
        zzda(23, zza);
    }

    public final zzblm zzz() throws RemoteException {
        throw null;
    }
}

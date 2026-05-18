package com.google.android.gms.internal.ads;

import S5.f1;
import S5.g1;
import S5.l2;
import S5.q2;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbvq extends zzbcs implements zzbvs {
    public zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final void zze(N6.a aVar, String str, Bundle bundle, Bundle bundle2, q2 q2Var, zzbvv zzbvvVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString(str);
        zzbcu.zzc(zza, bundle);
        zzbcu.zzc(zza, bundle2);
        zzbcu.zzc(zza, q2Var);
        zzbcu.zze(zza, zzbvvVar);
        zzda(1, zza);
    }

    public final zzbwh zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    public final zzbwh zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        zzbwh zzbwhVar = (zzbwh) zzbcu.zzb(zzcZ, zzbwh.CREATOR);
        zzcZ.recycle();
        return zzbwhVar;
    }

    public final g1 zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        g1 zzb = f1.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final void zzi(String str, String str2, l2 l2Var, N6.a aVar, zzbvg zzbvgVar, zzbtz zzbtzVar, q2 q2Var) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, l2Var);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvgVar);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, q2Var);
        zzda(13, zza);
    }

    public final void zzj(String str, String str2, l2 l2Var, N6.a aVar, zzbvj zzbvjVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, l2Var);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvjVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(14, zza);
    }

    public final boolean zzk(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        Parcel zzcZ = zzcZ(15, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    public final void zzl(String str, String str2, l2 l2Var, N6.a aVar, zzbvp zzbvpVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, l2Var);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvpVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(16, zza);
    }

    public final boolean zzm(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    public final void zzn(String str, String str2, l2 l2Var, N6.a aVar, zzbvm zzbvmVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, l2Var);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvmVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(18, zza);
    }

    public final void zzo(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(19, zza);
    }

    public final void zzp(String str, String str2, l2 l2Var, N6.a aVar, zzbvp zzbvpVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, l2Var);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvpVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(20, zza);
    }

    public final void zzq(String str, String str2, l2 l2Var, N6.a aVar, zzbvg zzbvgVar, zzbtz zzbtzVar, q2 q2Var) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, l2Var);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvgVar);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, q2Var);
        zzda(21, zza);
    }

    public final void zzr(String str, String str2, l2 l2Var, N6.a aVar, zzbvm zzbvmVar, zzbtz zzbtzVar, zzbkh zzbkhVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, l2Var);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvmVar);
        zzbcu.zze(zza, zzbtzVar);
        zzbcu.zzc(zza, zzbkhVar);
        zzda(22, zza);
    }

    public final void zzs(String str, String str2, l2 l2Var, N6.a aVar, zzbvd zzbvdVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbcu.zzc(zza, l2Var);
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbvdVar);
        zzbcu.zze(zza, zzbtzVar);
        zzda(23, zza);
    }

    public final boolean zzt(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        Parcel zzcZ = zzcZ(24, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }
}

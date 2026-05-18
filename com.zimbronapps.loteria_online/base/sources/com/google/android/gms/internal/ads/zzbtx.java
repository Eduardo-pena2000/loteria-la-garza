package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbtx extends zzbcs implements zzbtz {
    public zzbtx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(3, zza);
    }

    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    public final void zzk() throws RemoteException {
        zzda(8, zza());
    }

    public final void zzl(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzda(9, zza);
    }

    public final void zzm(zzblm zzblmVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzblmVar);
        zza.writeString(str);
        zzda(10, zza);
    }

    public final void zzn() throws RemoteException {
        zzda(11, zza());
    }

    public final void zzo() throws RemoteException {
        zzda(13, zza());
    }

    public final void zzp(zzcas zzcasVar) throws RemoteException {
        throw null;
    }

    public final void zzq() throws RemoteException {
        zzda(15, zza());
    }

    public final void zzr(zzcaw zzcawVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcawVar);
        zzda(16, zza);
    }

    public final void zzs(int i) throws RemoteException {
        throw null;
    }

    public final void zzt() throws RemoteException {
        zzda(18, zza());
    }

    public final void zzu() throws RemoteException {
        zzda(20, zza());
    }

    public final void zzv(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(21, zza);
    }

    public final void zzw(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zzda(22, zza);
    }

    public final void zzx(c1 c1Var) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, c1Var);
        zzda(23, zza);
    }

    public final void zzy(c1 c1Var) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, c1Var);
        zzda(24, zza);
    }

    public final void zzz() throws RemoteException {
        zzda(25, zza());
    }
}

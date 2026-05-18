package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcap extends zzbcs implements zzcar {
    public zzcap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void zze(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(1, zza);
    }

    public final void zzf(N6.a aVar, int i) throws RemoteException {
        throw null;
    }

    public final void zzg(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(3, zza);
    }

    public final void zzh(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(4, zza);
    }

    public final void zzi(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(5, zza);
    }

    public final void zzj(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(6, zza);
    }

    public final void zzk(N6.a aVar, zzcas zzcasVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzcasVar);
        zzda(7, zza);
    }

    public final void zzl(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(8, zza);
    }

    public final void zzm(N6.a aVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeInt(i);
        zzda(9, zza);
    }

    public final void zzn(N6.a aVar) throws RemoteException {
        throw null;
    }

    public final void zzo(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(11, zza);
    }

    public final void zzp(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(13, zza);
    }
}

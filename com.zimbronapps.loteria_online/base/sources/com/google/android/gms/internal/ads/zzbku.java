package com.google.android.gms.internal.ads;

import N6.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbku extends zzbcs implements zzbkw {
    public zzbku(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final void zzb(String str, N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zze(zza, aVar);
        zzda(1, zza);
    }

    public final N6.a zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final void zzd(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(3, zza);
    }

    public final void zzdB(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(9, zza);
    }

    public final void zzdC(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(7, zza);
    }

    public final void zzdD(zzbkp zzbkpVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbkpVar);
        zzda(8, zza);
    }

    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzf(N6.a aVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeInt(i);
        zzda(5, zza);
    }

    public final void zzg(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(6, zza);
    }
}

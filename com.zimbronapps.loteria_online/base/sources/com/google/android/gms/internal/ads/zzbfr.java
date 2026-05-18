package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbfr extends zzbcs implements IInterface {
    public zzbfr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbfm zze(zzbfp zzbfpVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbfpVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzbfm zzbfmVar = (zzbfm) zzbcu.zzb(zzcZ, zzbfm.CREATOR);
        zzcZ.recycle();
        return zzbfmVar;
    }

    public final zzbfm zzf(zzbfp zzbfpVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbfpVar);
        Parcel zzcZ = zzcZ(2, zza);
        zzbfm zzbfmVar = (zzbfm) zzbcu.zzb(zzcZ, zzbfm.CREATOR);
        zzcZ.recycle();
        return zzbfmVar;
    }

    public final long zzg(zzbfp zzbfpVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbfpVar);
        Parcel zzcZ = zzcZ(3, zza);
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }
}

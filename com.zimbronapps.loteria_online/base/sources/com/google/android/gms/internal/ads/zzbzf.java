package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbzf extends zzbcs implements zzbzh {
    public zzbzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void zze(zzbzu zzbzuVar, zzbzl zzbzlVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbzuVar);
        zzbcu.zze(zza, zzbzlVar);
        zzda(4, zza);
    }

    public final void zzf(zzbzu zzbzuVar, zzbzl zzbzlVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbzuVar);
        zzbcu.zze(zza, zzbzlVar);
        zzda(5, zza);
    }

    public final void zzg(zzbzu zzbzuVar, zzbzl zzbzlVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbzuVar);
        zzbcu.zze(zza, zzbzlVar);
        zzda(6, zza);
    }

    public final void zzh(String str, zzbzl zzbzlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zze(zza, zzbzlVar);
        zzda(7, zza);
    }

    public final void zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(9, zza);
    }

    public final void zzj(zzbzd zzbzdVar, zzbzm zzbzmVar) throws RemoteException {
        throw null;
    }
}

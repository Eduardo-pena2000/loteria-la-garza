package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfwo extends zzbcs implements IInterface {
    public zzfwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfwm zze(zzfwk zzfwkVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzfwkVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzfwm zzfwmVar = (zzfwm) zzbcu.zzb(zzcZ, zzfwm.CREATOR);
        zzcZ.recycle();
        return zzfwmVar;
    }

    public final void zzf(zzfwh zzfwhVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzfwhVar);
        zzda(2, zza);
    }

    public final zzfwv zzg(zzfwt zzfwtVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzfwtVar);
        Parcel zzcZ = zzcZ(3, zza);
        zzfwv zzfwvVar = (zzfwv) zzbcu.zzb(zzcZ, zzfwv.CREATOR);
        zzcZ.recycle();
        return zzfwvVar;
    }
}

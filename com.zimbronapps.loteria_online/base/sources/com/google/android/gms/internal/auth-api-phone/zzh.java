package com.google.android.gms.internal.auth-api-phone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzh extends zza implements IInterface {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzeVar);
        zzb(4, zza);
    }

    public final void zzd(String str, zzg zzgVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, zzgVar);
        zzb(5, zza);
    }

    public final void zze(h hVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, hVar);
        zzb(3, zza);
    }

    public final void zzf(h hVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, hVar);
        zzb(6, zza);
    }

    public final void zzg(zzj zzjVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzjVar);
        zzb(1, zza);
    }

    public final void zzh(String str, zzj zzjVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, zzjVar);
        zzb(2, zza);
    }
}

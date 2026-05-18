package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import h6.b;
import h6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    public final Bundle zzd(String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        Parcel zzb = zzb(2, zza);
        Bundle zza2 = zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return zza2;
    }

    public final Bundle zze(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, account);
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        Parcel zzb = zzb(5, zza);
        Bundle zza2 = zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return zza2;
    }

    public final Bundle zzf(Account account) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, account);
        Parcel zzb = zzb(7, zza);
        Bundle zza2 = zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return zza2;
    }

    public final Bundle zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(8, zza);
        Bundle zza2 = zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return zza2;
    }

    public final c zzh(b bVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, bVar);
        Parcel zzb = zzb(3, zza);
        c cVar = (c) zzc.zza(zzb, c.CREATOR);
        zzb.recycle();
        return cVar;
    }
}

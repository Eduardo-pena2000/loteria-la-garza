package com.google.android.gms.internal.fido;

import R6.l;
import R6.m;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzn extends zza implements IInterface {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    public final void zzc(zzg zzgVar, String str) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeStrongBinder(zzgVar);
        zza.writeString(str);
        zzb(4, zza);
    }

    public final void zzd(zzm zzmVar, l lVar) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeStrongBinder(zzmVar);
        zzc.zzd(zza, lVar);
        zzb(1, zza);
    }

    public final void zze(zzm zzmVar, m mVar) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeStrongBinder(zzmVar);
        zzc.zzd(zza, mVar);
        zzb(2, zza);
    }

    public final void zzf(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}

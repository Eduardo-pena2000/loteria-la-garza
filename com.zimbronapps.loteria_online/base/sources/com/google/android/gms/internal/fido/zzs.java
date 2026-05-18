package com.google.android.gms.internal.fido;

import R6.u;
import R6.x;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzs extends zza implements IInterface {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    public final void zzc(zzr zzrVar, u uVar) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, uVar);
        zzb(1, zza);
    }

    public final void zzd(zzr zzrVar, x xVar) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, xVar);
        zzb(2, zza);
    }

    public final void zze(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgoh extends zzbcs implements zzgoj {
    public zzgoh(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    public final void zze(String str, Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zzc(zza, bundle);
        zzbcu.zze(zza, zzgolVar);
        zzdb(1, zza);
    }

    public final void zzf(Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzbcu.zze(zza, zzgolVar);
        zzdb(2, zza);
    }

    public final void zzg(Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzbcu.zze(zza, zzgolVar);
        zzdb(3, zza);
    }
}

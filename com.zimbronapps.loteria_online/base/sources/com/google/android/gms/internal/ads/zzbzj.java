package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbzj extends zzbcs implements zzbzl {
    public zzbzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, parcelFileDescriptor);
        zzda(1, zza);
    }

    public final void zzf(V5.C c) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, c);
        zzda(2, zza);
    }

    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbzu zzbzuVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, parcelFileDescriptor);
        zzbcu.zzc(zza, zzbzuVar);
        zzda(3, zza);
    }
}

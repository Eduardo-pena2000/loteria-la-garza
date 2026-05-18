package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbzk extends zzbct implements zzbzl {
    public zzbzk() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbcu.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbcu.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i == 2) {
            V5.C c = (V5.C) zzbcu.zzb(parcel, V5.C.CREATOR);
            zzbcu.zzh(parcel);
            zzf(c);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzbcu.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbzu zzbzuVar = (zzbzu) zzbcu.zzb(parcel, zzbzu.CREATOR);
            zzbcu.zzh(parcel);
            zzg(parcelFileDescriptor2, zzbzuVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

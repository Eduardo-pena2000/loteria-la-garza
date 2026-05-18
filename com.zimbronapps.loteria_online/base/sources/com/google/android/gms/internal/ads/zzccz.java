package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzccz extends zzbct implements zzcda {
    public zzccz() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzbcu.zzh(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzbcu.zzh(parcel);
            zzb(readString);
        } else {
            if (i != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
            zzbcu.zzh(parcel);
            zzc(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}

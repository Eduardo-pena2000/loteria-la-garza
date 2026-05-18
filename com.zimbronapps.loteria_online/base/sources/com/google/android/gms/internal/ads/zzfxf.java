package com.google.android.gms.internal.ads;

import N6.a;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzfxf extends zzbct implements zzfxg {
    public zzfxf() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                a.a.q1(parcel.readStrongBinder());
                parcel.readString();
                zzbcu.zzh(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzbcu.zzh(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzbcu.zzh(parcel);
                break;
            case 6:
                parcel.readInt();
                zzbcu.zzh(parcel);
                break;
            case 7:
                parcel.readInt();
                zzbcu.zzh(parcel);
                break;
            case 8:
                a.a.q1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzbcu.zzh(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

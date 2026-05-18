package com.google.android.gms.internal.ads;

import N6.a;
import S5.X;
import S5.Y;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbmc extends zzbct implements zzbmd {
    public zzbmc() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbmd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof zzbmd ? (zzbmd) queryLocalInterface : new zzbmb(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Y zzZ = X.zzZ(parcel.readStrongBinder());
        N6.a q1 = a.a.q1(parcel.readStrongBinder());
        zzbcu.zzh(parcel);
        zze(zzZ, q1);
        parcel2.writeNoException();
        return true;
    }
}

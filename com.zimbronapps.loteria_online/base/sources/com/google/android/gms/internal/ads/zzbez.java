package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbez extends zzbct implements zzbfa {
    public zzbez() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbfa zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzbfa ? (zzbfa) queryLocalInterface : new zzbey(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbex zzbevVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbevVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbevVar = queryLocalInterface instanceof zzbex ? (zzbex) queryLocalInterface : new zzbev(readStrongBinder);
            }
            zzbcu.zzh(parcel);
            zzb(zzbevVar);
        } else if (i == 2) {
            parcel.readInt();
            zzbcu.zzh(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            c1 c1Var = (c1) zzbcu.zzb(parcel, c1.CREATOR);
            zzbcu.zzh(parcel);
            zzd(c1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}

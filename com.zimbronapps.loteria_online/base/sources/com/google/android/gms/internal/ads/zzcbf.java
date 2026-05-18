package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzcbf extends zzbct implements zzcbg {
    public zzcbf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            zzbcu.zzh(parcel);
            zzf(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            c1 c1Var = (c1) zzbcu.zzb(parcel, c1.CREATOR);
            zzbcu.zzh(parcel);
            zzg(c1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}

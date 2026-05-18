package com.google.android.gms.internal.ads;

import N6.a;
import S5.c1;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbvf extends zzbct implements zzbvg {
    public zzbvf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            N6.a q1 = a.a.q1(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zze(q1);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzbcu.zzh(parcel);
            zzf(readString);
        } else if (i == 3) {
            c1 c1Var = (c1) zzbcu.zzb(parcel, c1.CREATOR);
            zzbcu.zzh(parcel);
            zzg(c1Var);
        } else {
            if (i != 4) {
                return false;
            }
            zzbuc zzb = zzbub.zzb(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}

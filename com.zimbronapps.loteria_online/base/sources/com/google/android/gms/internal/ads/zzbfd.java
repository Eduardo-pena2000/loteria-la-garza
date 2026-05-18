package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbfd extends zzbct implements zzbfe {
    public zzbfd() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc();
        } else if (i == 2) {
            zzd();
        } else if (i == 3) {
            c1 c1Var = (c1) zzbcu.zzb(parcel, c1.CREATOR);
            zzbcu.zzh(parcel);
            zze(c1Var);
        } else if (i == 4) {
            zzf();
        } else {
            if (i != 5) {
                return false;
            }
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}

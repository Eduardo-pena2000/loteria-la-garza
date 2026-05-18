package com.google.android.gms.internal.ads;

import N6.a;
import S5.g1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbqu extends zzbct implements zzbqv {
    public zzbqu() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbqy zzbqwVar;
        if (i == 3) {
            g1 zzb = zzb();
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zzb);
            return true;
        }
        if (i == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            N6.a q1 = a.a.q1(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbqwVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbqwVar = queryLocalInterface instanceof zzbqy ? (zzbqy) queryLocalInterface : new zzbqw(readStrongBinder);
            }
            zzbcu.zzh(parcel);
            zzd(q1, zzbqwVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            N6.a q12 = a.a.q1(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zze(q12);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        zzbkp zzf = zzf();
        parcel2.writeNoException();
        zzbcu.zze(parcel2, zzf);
        return true;
    }
}

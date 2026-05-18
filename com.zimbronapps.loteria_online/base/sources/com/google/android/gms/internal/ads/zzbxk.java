package com.google.android.gms.internal.ads;

import N6.a;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbxk extends zzbct implements zzbxl {
    public zzbxk() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbxl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbxl ? (zzbxl) queryLocalInterface : new zzbxj(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Intent intent = (Intent) zzbcu.zzb(parcel, Intent.CREATOR);
                zzbcu.zzh(parcel);
                zze(intent);
                break;
            case 2:
                N6.a q1 = a.a.q1(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbcu.zzh(parcel);
                zzf(q1, readString, readString2);
                break;
            case 3:
                zzg();
                break;
            case 4:
                N6.a q12 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzh(q12);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                N6.a q13 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzi(createStringArray, createIntArray, q13);
                break;
            case 6:
                N6.a q14 = a.a.q1(parcel.readStrongBinder());
                T5.a aVar = (T5.a) zzbcu.zzb(parcel, T5.a.CREATOR);
                zzbcu.zzh(parcel);
                zzj(q14, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

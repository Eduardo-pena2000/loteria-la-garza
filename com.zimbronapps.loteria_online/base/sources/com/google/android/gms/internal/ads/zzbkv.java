package com.google.android.gms.internal.ads;

import N6.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbkv extends zzbct implements zzbkw {
    public zzbkv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbkw zzdF(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zzbkw ? (zzbkw) queryLocalInterface : new zzbku(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbkp zzbknVar;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                N6.a q1 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzb(readString, q1);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbcu.zzh(parcel);
                N6.a zzc = zzc(readString2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzc);
                return true;
            case 3:
                N6.a q12 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzd(q12);
                parcel2.writeNoException();
                return true;
            case 4:
                zze();
                parcel2.writeNoException();
                return true;
            case 5:
                a.a.q1(parcel.readStrongBinder());
                parcel.readInt();
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                N6.a q13 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzg(q13);
                parcel2.writeNoException();
                return true;
            case 7:
                N6.a q14 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzdC(q14);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbknVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbknVar = queryLocalInterface instanceof zzbkp ? (zzbkp) queryLocalInterface : new zzbkn(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zzdD(zzbknVar);
                parcel2.writeNoException();
                return true;
            case 9:
                N6.a q15 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzdB(q15);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import N6.a;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzcdc extends zzbct implements zzcdd {
    public zzcdc() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcdd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzcdd ? (zzcdd) queryLocalInterface : new zzcdb(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcda zzcdaVar = null;
        switch (i) {
            case 1:
                N6.a q1 = a.a.q1(parcel.readStrongBinder());
                zzcdh zzcdhVar = (zzcdh) zzbcu.zzb(parcel, zzcdh.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcdaVar = queryLocalInterface instanceof zzcda ? (zzcda) queryLocalInterface : new zzccy(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zze(q1, zzcdhVar, zzcdaVar);
                parcel2.writeNoException();
                return true;
            case 2:
                N6.a q12 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzf(q12);
                parcel2.writeNoException();
                return true;
            case 3:
                a.a.q1(parcel.readStrongBinder());
                a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 4:
                a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                N6.a q13 = a.a.q1(parcel.readStrongBinder());
                zzbyh zzb = zzbyg.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzg(createTypedArrayList, q13, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                N6.a q14 = a.a.q1(parcel.readStrongBinder());
                zzbyh zzb2 = zzbyg.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzh(createTypedArrayList2, q14, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbyk zzbykVar = (zzbyk) zzbcu.zzb(parcel, zzbyk.CREATOR);
                zzbcu.zzh(parcel);
                zzi(zzbykVar);
                parcel2.writeNoException();
                return true;
            case 8:
                N6.a q15 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzj(q15);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                N6.a q16 = a.a.q1(parcel.readStrongBinder());
                zzbyh zzb3 = zzbyg.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzk(createTypedArrayList3, q16, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                N6.a q17 = a.a.q1(parcel.readStrongBinder());
                zzbyh zzb4 = zzbyg.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzl(createTypedArrayList4, q17, zzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                N6.a q18 = a.a.q1(parcel.readStrongBinder());
                N6.a q19 = a.a.q1(parcel.readStrongBinder());
                String readString = parcel.readString();
                N6.a q110 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                N6.a zzm = zzm(q18, q19, readString, q110);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzm);
                return true;
            default:
                return false;
        }
    }
}

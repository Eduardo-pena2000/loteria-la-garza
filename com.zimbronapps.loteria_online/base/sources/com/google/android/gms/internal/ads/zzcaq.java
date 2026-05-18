package com.google.android.gms.internal.ads;

import N6.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzcaq extends zzbct implements zzcar {
    public zzcaq() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzcar zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzcar ? (zzcar) queryLocalInterface : new zzcap(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                N6.a q1 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zze(q1);
                break;
            case 2:
                N6.a q12 = a.a.q1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzbcu.zzh(parcel);
                zzf(q12, readInt);
                break;
            case 3:
                N6.a q13 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzg(q13);
                break;
            case 4:
                N6.a q14 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzh(q14);
                break;
            case 5:
                N6.a q15 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzi(q15);
                break;
            case 6:
                N6.a q16 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzj(q16);
                break;
            case 7:
                N6.a q17 = a.a.q1(parcel.readStrongBinder());
                zzcas zzcasVar = (zzcas) zzbcu.zzb(parcel, zzcas.CREATOR);
                zzbcu.zzh(parcel);
                zzk(q17, zzcasVar);
                break;
            case 8:
                N6.a q18 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzl(q18);
                break;
            case 9:
                N6.a q19 = a.a.q1(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzm(q19, readInt2);
                break;
            case 10:
                N6.a q110 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzn(q110);
                break;
            case 11:
                N6.a q111 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzo(q111);
                break;
            case 12:
                zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                break;
            case 13:
                N6.a q112 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzp(q112);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

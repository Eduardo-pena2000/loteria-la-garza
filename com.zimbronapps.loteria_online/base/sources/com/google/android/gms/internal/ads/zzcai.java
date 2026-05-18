package com.google.android.gms.internal.ads;

import N6.a;
import S5.c0;
import S5.d0;
import S5.d1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzcai extends zzbct implements zzcaj {
    public zzcai() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzcan zzcanVar = (zzcan) zzbcu.zzb(parcel, zzcan.CREATOR);
            zzbcu.zzh(parcel);
            zzb(zzcanVar);
            parcel2.writeNoException();
        } else if (i != 2) {
            zzcam zzcamVar = null;
            zzcah zzcahVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcamVar = queryLocalInterface instanceof zzcam ? (zzcam) queryLocalInterface : new zzcak(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zzd(zzcamVar);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zze = zze();
                        parcel2.writeNoException();
                        int i3 = zzbcu.zza;
                        parcel2.writeInt(zze ? 1 : 0);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        N6.a q1 = a.a.q1(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzi(q1);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        N6.a q12 = a.a.q1(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzj(q12);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        N6.a q13 = a.a.q1(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzk(q13);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(zzl);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zzbcu.zzh(parcel);
                        zzm(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        d0 q14 = c0.q1(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzn(q14);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzo = zzo();
                        parcel2.writeNoException();
                        zzbcu.zzd(parcel2, zzo);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcahVar = queryLocalInterface2 instanceof zzcah ? (zzcah) queryLocalInterface2 : new zzcah(readStrongBinder2);
                        }
                        zzbcu.zzh(parcel);
                        zzu(zzcahVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzbcu.zzh(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        N6.a q15 = a.a.q1(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzp(q15);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zzbcu.zzh(parcel);
                        zzq(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        int i4 = zzbcu.zza;
                        parcel2.writeInt(zzs ? 1 : 0);
                        break;
                    case 21:
                        d1 zzt = zzt();
                        parcel2.writeNoException();
                        zzbcu.zze(parcel2, zzt);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzr(zza);
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}

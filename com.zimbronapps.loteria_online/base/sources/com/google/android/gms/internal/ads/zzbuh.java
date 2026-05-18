package com.google.android.gms.internal.ads;

import N6.a;
import S5.g1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbuh extends zzbct implements zzbui {
    public zzbuh() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbui zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof zzbui ? (zzbui) queryLocalInterface : new zzbug(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 3:
                List zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(zzf);
                return true;
            case 4:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 5:
                zzbks zzh = zzh();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzh);
                return true;
            case 6:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                double zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(zzk);
                return true;
            case 9:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            case 10:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 11:
                g1 zzn = zzn();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzn);
                return true;
            case 12:
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 13:
                N6.a zzp = zzp();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzp);
                return true;
            case 14:
                N6.a zzq = zzq();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzq);
                return true;
            case 15:
                N6.a zzr = zzr();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzr);
                return true;
            case 16:
                Bundle zzs = zzs();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzs);
                return true;
            case 17:
                boolean zzt = zzt();
                parcel2.writeNoException();
                int i3 = zzbcu.zza;
                parcel2.writeInt(zzt ? 1 : 0);
                return true;
            case 18:
                boolean zzu = zzu();
                parcel2.writeNoException();
                int i4 = zzbcu.zza;
                parcel2.writeInt(zzu ? 1 : 0);
                return true;
            case 19:
                zzv();
                parcel2.writeNoException();
                return true;
            case 20:
                N6.a q1 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzw(q1);
                parcel2.writeNoException();
                return true;
            case 21:
                N6.a q12 = a.a.q1(parcel.readStrongBinder());
                N6.a q13 = a.a.q1(parcel.readStrongBinder());
                N6.a q14 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzx(q12, q13, q14);
                parcel2.writeNoException();
                return true;
            case 22:
                N6.a q15 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzy(q15);
                parcel2.writeNoException();
                return true;
            case 23:
                float zzz = zzz();
                parcel2.writeNoException();
                parcel2.writeFloat(zzz);
                return true;
            case 24:
                float zzA = zzA();
                parcel2.writeNoException();
                parcel2.writeFloat(zzA);
                return true;
            case 25:
                float zzB = zzB();
                parcel2.writeNoException();
                parcel2.writeFloat(zzB);
                return true;
            case 26:
                zzC();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

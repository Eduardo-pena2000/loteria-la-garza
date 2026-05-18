package com.google.android.gms.internal.ads;

import N6.a;
import S5.g1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbll extends zzbct implements zzblm {
    public zzbll() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzblm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzblm ? (zzblm) queryLocalInterface : new zzblk(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzbcu.zzh(parcel);
                String zze = zze(readString);
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbcu.zzh(parcel);
                zzbks zzf = zzf(readString2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzf);
                return true;
            case 3:
                List zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(zzg);
                return true;
            case 4:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzbcu.zzh(parcel);
                zzi(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                g1 zzk = zzk();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                N6.a zzm = zzm();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzm);
                return true;
            case 10:
                N6.a q1 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                boolean zzn = zzn(q1);
                parcel2.writeNoException();
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 12:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i3 = zzbcu.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 13:
                boolean zzp = zzp();
                parcel2.writeNoException();
                int i4 = zzbcu.zza;
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 14:
                N6.a q12 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzq(q12);
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbkp zzs = zzs();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzs);
                return true;
            case 17:
                N6.a q13 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                boolean zzt = zzt(q13);
                parcel2.writeNoException();
                parcel2.writeInt(zzt ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}

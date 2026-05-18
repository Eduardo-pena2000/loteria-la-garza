package com.google.android.gms.internal.ads;

import S5.G0;
import S5.H0;
import S5.K0;
import S5.L0;
import S5.U0;
import S5.V0;
import S5.d1;
import S5.g1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbml extends zzbct implements zzbmm {
    public zzbml() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbmj zzbmhVar;
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
                String zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzo);
                return true;
            case 13:
                zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbkl zzq = zzq();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzq);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzr(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                boolean zzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzs ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzt(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                N6.a zzu = zzu();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzu);
                return true;
            case 19:
                N6.a zzv = zzv();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzv);
                return true;
            case 20:
                Bundle zzw = zzw();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzw);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbmhVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbmhVar = queryLocalInterface instanceof zzbmj ? (zzbmj) queryLocalInterface : new zzbmh(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zzx(zzbmhVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzy();
                parcel2.writeNoException();
                return true;
            case 23:
                List zzz = zzz();
                parcel2.writeNoException();
                parcel2.writeList(zzz);
                return true;
            case 24:
                boolean zzA = zzA();
                parcel2.writeNoException();
                int i3 = zzbcu.zza;
                parcel2.writeInt(zzA ? 1 : 0);
                return true;
            case 25:
                L0 q1 = K0.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzB(q1);
                parcel2.writeNoException();
                return true;
            case 26:
                H0 q12 = G0.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzC(q12);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzE();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbkp zzF = zzF();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzF);
                return true;
            case 30:
                boolean zzG = zzG();
                parcel2.writeNoException();
                int i4 = zzbcu.zza;
                parcel2.writeInt(zzG ? 1 : 0);
                return true;
            case 31:
                d1 zzH = zzH();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzH);
                return true;
            case 32:
                V0 q13 = U0.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzI(q13);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzJ(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                long zzK = zzK();
                parcel2.writeNoException();
                parcel2.writeLong(zzK);
                return true;
            case 35:
                long readLong = parcel.readLong();
                zzbcu.zzh(parcel);
                zzL(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

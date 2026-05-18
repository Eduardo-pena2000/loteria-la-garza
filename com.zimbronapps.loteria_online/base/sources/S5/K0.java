package S5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class k0 extends zzbct implements l0 {
    public k0() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        g0 g0Var = null;
        i0 i0Var = null;
        switch (i) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(W1.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    g0Var = queryLocalInterface instanceof g0 ? (g0) queryLocalInterface : new e0(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zze(createTypedArrayList, g0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                zzbcu.zzh(parcel);
                boolean zzf = zzf(readString);
                parcel2.writeNoException();
                parcel2.writeInt(zzf ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                zzbcu.zzh(parcel);
                zzcaz zzg = zzg(readString2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzg);
                return true;
            case 4:
                String readString3 = parcel.readString();
                zzbcu.zzh(parcel);
                boolean zzh = zzh(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zzh ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                zzbcu.zzh(parcel);
                zzbex zzi = zzi(readString4);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzi);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzbcu.zzh(parcel);
                boolean zzj = zzj(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzj ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                zzbcu.zzh(parcel);
                Y zzk = zzk(readString6);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzk);
                return true;
            case 8:
                zzbts.zzf(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString7 = parcel.readString();
                W1 w1 = (W1) zzbcu.zzb(parcel, W1.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    i0Var = queryLocalInterface2 instanceof i0 ? (i0) queryLocalInterface2 : new h0(readStrongBinder2);
                }
                zzbcu.zzh(parcel);
                boolean zzm = zzm(readString7, w1, i0Var);
                parcel2.writeNoException();
                parcel2.writeInt(zzm ? 1 : 0);
                return true;
            case 10:
                int readInt = parcel.readInt();
                String readString8 = parcel.readString();
                zzbcu.zzh(parcel);
                boolean zzn = zzn(readInt, readString8);
                parcel2.writeNoException();
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 11:
                String readString9 = parcel.readString();
                zzbcu.zzh(parcel);
                Y zzo = zzo(readString9);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzo);
                return true;
            case 12:
                String readString10 = parcel.readString();
                zzbcu.zzh(parcel);
                zzbex zzp = zzp(readString10);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzp);
                return true;
            case 13:
                String readString11 = parcel.readString();
                zzbcu.zzh(parcel);
                zzcaz zzq = zzq(readString11);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzq);
                return true;
            case 14:
                int readInt2 = parcel.readInt();
                String readString12 = parcel.readString();
                zzbcu.zzh(parcel);
                W1 zzr = zzr(readInt2, readString12);
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzr);
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                zzbcu.zzh(parcel);
                Bundle zzs = zzs(readInt3);
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzs);
                return true;
            case 16:
                int readInt4 = parcel.readInt();
                String readString13 = parcel.readString();
                zzbcu.zzh(parcel);
                int zzt = zzt(readInt4, readString13);
                parcel2.writeNoException();
                parcel2.writeInt(zzt);
                return true;
            case 17:
                int readInt5 = parcel.readInt();
                String readString14 = parcel.readString();
                zzbcu.zzh(parcel);
                boolean zzu = zzu(readInt5, readString14);
                parcel2.writeNoException();
                parcel2.writeInt(zzu ? 1 : 0);
                return true;
            case 18:
                int readInt6 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzv(readInt6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

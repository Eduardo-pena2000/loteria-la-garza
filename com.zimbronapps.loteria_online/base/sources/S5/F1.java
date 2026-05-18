package S5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class f1 extends zzbct implements g1 {
    public f1() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static g1 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof g1 ? (g1) queryLocalInterface : new e1(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        j1 h1Var;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzg(zza);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzh = zzh();
                parcel2.writeNoException();
                int i3 = zzbcu.zza;
                parcel2.writeInt(zzh ? 1 : 0);
                return true;
            case 5:
                int zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(zzi);
                return true;
            case 6:
                float zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(zzj);
                return true;
            case 7:
                float zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(zzk);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    h1Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    h1Var = queryLocalInterface instanceof j1 ? (j1) queryLocalInterface : new h1(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zzl(h1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                float zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(zzm);
                return true;
            case 10:
                boolean zzn = zzn();
                parcel2.writeNoException();
                int i4 = zzbcu.zza;
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 11:
                j1 zzo = zzo();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzo);
                return true;
            case 12:
                boolean zzp = zzp();
                parcel2.writeNoException();
                int i5 = zzbcu.zza;
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

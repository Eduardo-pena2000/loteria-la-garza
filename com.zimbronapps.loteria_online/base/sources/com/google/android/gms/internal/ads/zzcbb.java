package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzcbb extends zzbct implements zzcbc {
    public zzcbb() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcaw zzcauVar;
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcauVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzcauVar = queryLocalInterface instanceof zzcaw ? (zzcaw) queryLocalInterface : new zzcau(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zzg(zzcauVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                zzbcu.zzh(parcel);
                zzh(readInt);
                break;
            case 5:
                c1 c1Var = (c1) zzbcu.zzb(parcel, c1.CREATOR);
                zzbcu.zzh(parcel);
                zzi(c1Var);
                break;
            case 6:
                zzj();
                break;
            case 7:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

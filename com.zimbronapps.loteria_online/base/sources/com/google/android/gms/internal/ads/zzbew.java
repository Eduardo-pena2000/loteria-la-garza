package com.google.android.gms.internal.ads;

import N6.a;
import S5.U0;
import S5.V0;
import S5.Y;
import S5.d1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbew extends zzbct implements zzbex {
    public zzbew() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbex zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return queryLocalInterface instanceof zzbex ? (zzbex) queryLocalInterface : new zzbev(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbfe zzbfcVar;
        switch (i) {
            case 2:
                Y zze = zze();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    boolean z = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback") instanceof zzbfb;
                }
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                N6.a q1 = a.a.q1(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbfcVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbfcVar = queryLocalInterface instanceof zzbfe ? (zzbfe) queryLocalInterface : new zzbfc(readStrongBinder2);
                }
                zzbcu.zzh(parcel);
                zzf(q1, zzbfcVar);
                parcel2.writeNoException();
                return true;
            case 5:
                d1 zzg = zzg();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzg);
                return true;
            case 6:
                boolean zza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzh(zza);
                parcel2.writeNoException();
                return true;
            case 7:
                V0 q12 = U0.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzi(q12);
                parcel2.writeNoException();
                return true;
            case 8:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 9:
                long zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(zzk);
                return true;
            case 10:
                long readLong = parcel.readLong();
                zzbcu.zzh(parcel);
                zzl(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

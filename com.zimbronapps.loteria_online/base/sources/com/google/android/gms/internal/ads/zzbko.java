package com.google.android.gms.internal.ads;

import N6.a;
import S5.g1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbko extends zzbct implements zzbkp {
    public zzbko() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbma zzbmaVar;
        switch (i) {
            case 2:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                N6.a q1 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzf(q1);
                parcel2.writeNoException();
                return true;
            case 4:
                N6.a zzg = zzg();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzg);
                return true;
            case 5:
                float zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzh);
                return true;
            case 6:
                float zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeFloat(zzi);
                return true;
            case 7:
                g1 zzj = zzj();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzj);
                return true;
            case 8:
                boolean zzk = zzk();
                parcel2.writeNoException();
                int i3 = zzbcu.zza;
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbmaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbmaVar = queryLocalInterface instanceof zzbma ? (zzbma) queryLocalInterface : new zzbma(readStrongBinder);
                }
                zzbcu.zzh(parcel);
                zzm(zzbmaVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i4 = zzbcu.zza;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}

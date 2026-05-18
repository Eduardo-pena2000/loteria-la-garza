package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbty extends zzbct implements zzbtz {
    public zzbty() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbtz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbtz ? (zzbtz) queryLocalInterface : new zzbtx(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzbcu.zzh(parcel);
                zzg(readInt);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    boolean z = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata") instanceof zzbud;
                }
                zzbcu.zzh(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbcu.zzh(parcel);
                zzl(readString, readString2);
                break;
            case 10:
                zzbll.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzbcu.zzh(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzbcu.zzh(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzcas zzcasVar = (zzcas) zzbcu.zzb(parcel, zzcas.CREATOR);
                zzbcu.zzh(parcel);
                zzp(zzcasVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                zzcaw zzb = zzcav.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzr(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzs(readInt2);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzbcu.zzh(parcel);
                zzv(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzbcu.zzh(parcel);
                zzw(readInt3, readString4);
                break;
            case 23:
                c1 c1Var = (c1) zzbcu.zzb(parcel, c1.CREATOR);
                zzbcu.zzh(parcel);
                zzx(c1Var);
                break;
            case 24:
                c1 c1Var2 = (c1) zzbcu.zzb(parcel, c1.CREATOR);
                zzbcu.zzh(parcel);
                zzy(c1Var2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

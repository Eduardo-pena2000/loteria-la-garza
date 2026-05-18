package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbzg extends zzbct implements zzbzh {
    public zzbzg() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbzl zzbzlVar = null;
        zzbzm zzbzmVar = null;
        zzbzl zzbzlVar2 = null;
        zzbzl zzbzlVar3 = null;
        zzbzl zzbzlVar4 = null;
        switch (i) {
            case 1:
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    boolean z = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener") instanceof zzbzi;
                }
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbzu zzbzuVar = (zzbzu) zzbcu.zzb(parcel, zzbzu.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzlVar = queryLocalInterface instanceof zzbzl ? (zzbzl) queryLocalInterface : new zzbzj(readStrongBinder2);
                }
                zzbcu.zzh(parcel);
                zze(zzbzuVar, zzbzlVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbzu zzbzuVar2 = (zzbzu) zzbcu.zzb(parcel, zzbzu.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzlVar4 = queryLocalInterface2 instanceof zzbzl ? (zzbzl) queryLocalInterface2 : new zzbzj(readStrongBinder3);
                }
                zzbcu.zzh(parcel);
                zzf(zzbzuVar2, zzbzlVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbzu zzbzuVar3 = (zzbzu) zzbcu.zzb(parcel, zzbzu.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzlVar3 = queryLocalInterface3 instanceof zzbzl ? (zzbzl) queryLocalInterface3 : new zzbzj(readStrongBinder4);
                }
                zzbcu.zzh(parcel);
                zzg(zzbzuVar3, zzbzlVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzlVar2 = queryLocalInterface4 instanceof zzbzl ? (zzbzl) queryLocalInterface4 : new zzbzj(readStrongBinder5);
                }
                zzbcu.zzh(parcel);
                zzh(readString, zzbzlVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbzd zzbzdVar = (zzbzd) zzbcu.zzb(parcel, zzbzd.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbzmVar = queryLocalInterface5 instanceof zzbzm ? (zzbzm) queryLocalInterface5 : new zzbzm(readStrongBinder6);
                }
                zzbcu.zzh(parcel);
                zzj(zzbzdVar, zzbzmVar);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString2 = parcel.readString();
                zzbcu.zzh(parcel);
                zzi(readString2);
                parcel2.writeNoException();
                return true;
        }
    }
}

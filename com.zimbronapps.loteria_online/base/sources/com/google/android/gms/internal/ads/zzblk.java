package com.google.android.gms.internal.ads;

import N6.a;
import S5.g1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzblk extends zzbcs implements zzblm {
    public zzblk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final String zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(1, zza);
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final zzbks zzf(String str) throws RemoteException {
        zzbks zzbkqVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbkqVar = queryLocalInterface instanceof zzbks ? (zzbks) queryLocalInterface : new zzbkq(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbkqVar;
    }

    public final List zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList createStringArrayList = zzcZ.createStringArrayList();
        zzcZ.recycle();
        return createStringArrayList;
    }

    public final String zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final void zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(5, zza);
    }

    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    public final g1 zzk() throws RemoteException {
        throw null;
    }

    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    public final N6.a zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final boolean zzn(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        Parcel zzcZ = zzcZ(10, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    public final boolean zzo() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final boolean zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final void zzq(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(14, zza);
    }

    public final void zzr() throws RemoteException {
        zzda(15, zza());
    }

    public final zzbkp zzs() throws RemoteException {
        zzbkp zzbknVar;
        Parcel zzcZ = zzcZ(16, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbknVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbknVar = queryLocalInterface instanceof zzbkp ? (zzbkp) queryLocalInterface : new zzbkn(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbknVar;
    }

    public final boolean zzt(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }
}

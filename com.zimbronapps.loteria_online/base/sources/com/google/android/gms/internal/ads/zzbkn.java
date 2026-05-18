package com.google.android.gms.internal.ads;

import N6.a;
import S5.f1;
import S5.g1;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbkn extends zzbcs implements zzbkp {
    public zzbkn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final float zze() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    public final void zzf(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(3, zza);
    }

    public final N6.a zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final float zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    public final float zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    public final g1 zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        g1 zzb = f1.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final boolean zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final boolean zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(10, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final void zzm(zzbma zzbmaVar) throws RemoteException {
        throw null;
    }
}

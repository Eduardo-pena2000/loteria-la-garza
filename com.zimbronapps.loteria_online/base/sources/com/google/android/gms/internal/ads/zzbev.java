package com.google.android.gms.internal.ads;

import S5.V0;
import S5.Y;
import S5.b1;
import S5.d1;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbev extends zzbcs implements zzbex {
    public zzbev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final Y zze() throws RemoteException {
        throw null;
    }

    public final void zzf(N6.a aVar, zzbfe zzbfeVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbfeVar);
        zzda(4, zza);
    }

    public final d1 zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        d1 zzb = b1.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbcu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(6, zza);
    }

    public final void zzi(V0 v0) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, v0);
        zzda(7, zza);
    }

    public final String zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final long zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    public final void zzl(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzda(10, zza);
    }
}

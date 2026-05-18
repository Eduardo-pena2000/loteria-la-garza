package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbxq extends zzbcs implements zzbxs {
    public zzbxq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void zzH(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzda(15, zza);
    }

    public final void zze() throws RemoteException {
        zzda(10, zza());
    }

    public final void zzf() throws RemoteException {
        zzda(14, zza());
    }

    public final boolean zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(11, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final void zzh(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzda(1, zza);
    }

    public final void zzi() throws RemoteException {
        zzda(2, zza());
    }

    public final void zzj() throws RemoteException {
        zzda(3, zza());
    }

    public final void zzk() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzl() throws RemoteException {
        zzda(5, zza());
    }

    public final void zzm(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzbcu.zzc(zza, intent);
        zzda(12, zza);
    }

    public final void zzn(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(13, zza);
    }

    public final void zzo(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        Parcel zzcZ = zzcZ(6, zza);
        if (zzcZ.readInt() != 0) {
            bundle.readFromParcel(zzcZ);
        }
        zzcZ.recycle();
    }

    public final void zzp() throws RemoteException {
        zzda(7, zza());
    }

    public final void zzq() throws RemoteException {
        zzda(8, zza());
    }

    public final void zzs() throws RemoteException {
        zzda(9, zza());
    }
}

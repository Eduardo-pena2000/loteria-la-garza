package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfxe extends zzbcs implements zzfxg {
    public zzfxe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    public final void zze() throws RemoteException {
        zzda(3, zza());
    }

    public final void zzf(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray((int[]) null);
        zzda(4, zza);
    }

    public final void zzg(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzda(5, zza);
    }

    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(6, zza);
    }

    public final void zzi(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(7, zza);
    }

    public final void zzj(N6.a aVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString(str);
        zza.writeString((String) null);
        zzda(8, zza);
    }
}

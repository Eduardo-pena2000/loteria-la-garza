package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbxj extends zzbcs implements zzbxl {
    public zzbxj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, intent);
        zzda(1, zza);
    }

    public final void zzf(N6.a aVar, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    public final void zzh(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(4, zza);
    }

    public final void zzi(String[] strArr, int[] iArr, N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzbcu.zze(zza, aVar);
        zzda(5, zza);
    }

    public final void zzj(N6.a aVar, T5.a aVar2) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, aVar2);
        zzda(6, zza);
    }
}

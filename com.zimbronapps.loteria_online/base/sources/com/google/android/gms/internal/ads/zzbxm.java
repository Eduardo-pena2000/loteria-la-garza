package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbxm extends zzbcs implements zzbxo {
    public zzbxm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    public final zzbxl zze(N6.a aVar, zzbtt zzbttVar, int i) throws RemoteException {
        zzbxl zzbxjVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbxjVar = queryLocalInterface instanceof zzbxl ? (zzbxl) queryLocalInterface : new zzbxj(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbxjVar;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbpl extends zzbcs implements zzbpn {
    public zzbpl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    public final zzbpk zze(N6.a aVar, zzbtt zzbttVar, int i, zzbph zzbphVar) throws RemoteException {
        zzbpk zzbpiVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        zzbcu.zze(zza, zzbphVar);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbpiVar = queryLocalInterface instanceof zzbpk ? (zzbpk) queryLocalInterface : new zzbpi(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbpiVar;
    }
}

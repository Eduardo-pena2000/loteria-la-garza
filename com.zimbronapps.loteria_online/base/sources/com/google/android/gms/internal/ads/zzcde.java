package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcde extends zzbcs implements zzcdg {
    public zzcde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    public final zzcdd zze(N6.a aVar, zzbtt zzbttVar, int i) throws RemoteException {
        zzcdd zzcdbVar;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcdbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcdbVar = queryLocalInterface instanceof zzcdd ? (zzcdd) queryLocalInterface : new zzcdb(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcdbVar;
    }
}

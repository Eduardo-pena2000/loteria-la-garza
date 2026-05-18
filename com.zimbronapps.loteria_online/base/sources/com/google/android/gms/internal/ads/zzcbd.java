package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbd extends zzbcs implements IInterface {
    public zzcbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(N6.a aVar, String str, zzbtt zzbttVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        zzcZ.recycle();
        return readStrongBinder;
    }
}

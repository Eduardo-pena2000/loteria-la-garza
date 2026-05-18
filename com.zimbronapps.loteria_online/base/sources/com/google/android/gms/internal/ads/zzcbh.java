package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbh extends zzbcs implements IInterface {
    public zzcbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcaw zzcawVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcawVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}

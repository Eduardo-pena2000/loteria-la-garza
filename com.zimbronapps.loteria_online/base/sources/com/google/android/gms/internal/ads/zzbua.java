package com.google.android.gms.internal.ads;

import N6.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbua extends zzbcs implements zzbuc {
    public zzbua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public final N6.a zze() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final boolean zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        boolean zza = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }
}

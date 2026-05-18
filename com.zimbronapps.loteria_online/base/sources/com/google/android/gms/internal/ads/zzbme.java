package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbme extends zzbcs implements zzbmg {
    public zzbme(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zze(zzbmm zzbmmVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbmmVar);
        zzda(1, zza);
    }
}

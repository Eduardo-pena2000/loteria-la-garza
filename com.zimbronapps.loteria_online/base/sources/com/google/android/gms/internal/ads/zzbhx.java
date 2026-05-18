package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbhx extends zzbcs implements zzbhz {
    public zzbhx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void zze(zzbhw zzbhwVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbhwVar);
        zzda(1, zza);
    }
}

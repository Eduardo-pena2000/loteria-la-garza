package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzblr extends zzbcs implements zzblt {
    public zzblr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzblj zzbljVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbljVar);
        zzda(1, zza);
    }
}

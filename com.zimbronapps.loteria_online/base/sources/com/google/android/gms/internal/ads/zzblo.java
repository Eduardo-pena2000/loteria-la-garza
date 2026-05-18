package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzblo extends zzbcs implements zzblq {
    public zzblo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zze(zzblh zzblhVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzblhVar);
        zzda(1, zza);
    }
}

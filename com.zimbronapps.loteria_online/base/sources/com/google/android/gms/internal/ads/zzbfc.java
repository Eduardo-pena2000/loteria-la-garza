package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbfc extends zzbcs implements zzbfe {
    public zzbfc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    public final void zzc() throws RemoteException {
        zzda(1, zza());
    }

    public final void zzd() throws RemoteException {
        zzda(2, zza());
    }

    public final void zze(c1 c1Var) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, c1Var);
        zzda(3, zza);
    }

    public final void zzf() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzg() throws RemoteException {
        zzda(5, zza());
    }
}

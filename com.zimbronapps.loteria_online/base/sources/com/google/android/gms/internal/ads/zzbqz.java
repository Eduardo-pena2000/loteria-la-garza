package com.google.android.gms.internal.ads;

import S5.c1;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbqz extends zzbcs implements zzbrb {
    public zzbqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public final void zze(zzbqv zzbqvVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbqvVar);
        zzda(1, zza);
    }

    public final void zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(2, zza);
    }

    public final void zzg(c1 c1Var) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, c1Var);
        zzda(3, zza);
    }
}

package com.google.android.gms.internal.games_v2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzw extends zza implements IInterface {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
    }

    public final void zzd(zzv zzvVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, zzvVar);
        zzc.zzc(zza, zzqVar);
        zzc(2, zza);
    }
}

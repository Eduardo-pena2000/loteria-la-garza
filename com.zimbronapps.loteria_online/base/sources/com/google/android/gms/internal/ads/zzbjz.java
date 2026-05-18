package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbjz extends zzbcs implements IInterface {
    public zzbjz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbyv zzbyvVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbyvVar);
        zzda(1, zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbzm extends zzbcs implements IInterface {
    public zzbzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzbzd zzbzdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zzc(zza, zzbzdVar);
        zzda(1, zza);
    }

    public final void zzf(V5.C c) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, c);
        zzda(2, zza);
    }
}

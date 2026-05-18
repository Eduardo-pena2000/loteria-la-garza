package com.google.android.gms.internal.ads;

import S5.Y;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbmb extends zzbcs implements zzbmd {
    public zzbmb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void zze(Y y, N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, y);
        zzbcu.zze(zza, aVar);
        zzda(1, zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzblu extends zzbcs implements zzblw {
    public zzblu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zze(zzblm zzblmVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzblmVar);
        zza.writeString(str);
        zzda(1, zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzblx extends zzbcs implements zzblz {
    public zzblx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zze(zzblm zzblmVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzblmVar);
        zzda(1, zza);
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbo extends zzbl implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle zze(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        Parcel zzP = zzP(1, zza);
        Bundle zzb = zzbn.zzb(zzP, Bundle.CREATOR);
        zzP.recycle();
        return zzb;
    }
}

package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzew extends zza implements zzeu {
    public zzew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IEventReleaseCallback");
    }

    public final void zza(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzc.writeBoolean(zza, z);
        zzc(1, zza);
    }
}

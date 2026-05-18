package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcau extends zzbcs implements zzcaw {
    public zzcau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public final String zze() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final int zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }
}

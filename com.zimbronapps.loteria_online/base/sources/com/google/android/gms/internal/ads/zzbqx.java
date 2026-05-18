package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbqx extends zzbct implements zzbqy {
    public zzbqx() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            zzbcu.zzh(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}

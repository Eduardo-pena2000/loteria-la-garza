package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgok extends zzbct implements zzgol {
    public zzgok() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
        zzbcu.zzh(parcel);
        zzb(bundle);
        return true;
    }
}

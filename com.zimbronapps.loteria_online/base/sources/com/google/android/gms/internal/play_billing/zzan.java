package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzan extends zzaq implements zzao {
    public zzan() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzar.zza(parcel, Bundle.CREATOR);
        zzar.zzb(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}

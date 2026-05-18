package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzas extends zzap implements zzau {
    public zzas(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    public final void zza(String str, String str2, zzaw zzawVar) throws RemoteException {
        Parcel zzs = zzs();
        zzs.writeString(str);
        zzs.writeString(str2);
        int i = zzar.zza;
        zzs.writeStrongBinder(zzawVar);
        zzv(1, zzs);
    }
}

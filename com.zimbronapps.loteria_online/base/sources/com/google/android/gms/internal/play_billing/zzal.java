package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzal extends zzaq implements zzam {
    public static zzam zzs(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof zzam ? (zzam) queryLocalInterface : new zzak(iBinder);
    }
}

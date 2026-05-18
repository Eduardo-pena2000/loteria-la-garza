package P2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class w {
    public static /* bridge */ /* synthetic */ void a(TelephonyManager telephonyManager, TelephonyCallback telephonyCallback) {
        telephonyManager.unregisterTelephonyCallback(telephonyCallback);
    }
}

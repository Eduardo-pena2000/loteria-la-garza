package P2;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class v {
    public static /* bridge */ /* synthetic */ void a(TelephonyManager telephonyManager, Executor executor, TelephonyCallback telephonyCallback) {
        telephonyManager.registerTelephonyCallback(executor, telephonyCallback);
    }
}

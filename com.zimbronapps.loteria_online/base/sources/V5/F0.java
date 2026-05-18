package V5;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class f0 {
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            W5.p.d("Unexpected exception.", th);
            zzbyp.zza(context).zzh(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}

package E6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class w {
    public static boolean a(Context context, int i) {
        if (!b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return v6.m.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean b(Context context, int i, String str) {
        return G6.e.a(context).h(i, str);
    }
}

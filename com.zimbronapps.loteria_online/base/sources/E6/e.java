package E6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class e {
    public static int a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo b = b(context, str);
        if (b == null || (applicationInfo = b.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    public static PackageInfo b(Context context, String str) {
        try {
            return G6.e.a(context).f(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean c() {
        return false;
    }
}

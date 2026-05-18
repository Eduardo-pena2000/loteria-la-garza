package va;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import va.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class p {
    public static int a(r.e eVar) {
        Long c = eVar.c();
        int b = b();
        return (c == null || c.longValue() >= ((long) b)) ? b : Math.toIntExact(c.longValue());
    }

    public static int b() {
        if (h.f.c()) {
            return h.c.a();
        }
        return Integer.MAX_VALUE;
    }

    public static PackageInfo c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 4096);
    }

    public static boolean d(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return Arrays.asList((Build.VERSION.SDK_INT >= 33 ? com.google.android.recaptcha.internal.d.a(packageManager, context.getPackageName(), com.google.android.recaptcha.internal.c.a(4096L)) : c(packageManager, context.getPackageName())).requestedPermissions).contains(str);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean e(Context context) {
        return d(context, "android.permission.CAMERA");
    }
}

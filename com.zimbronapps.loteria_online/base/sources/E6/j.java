package E6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class j {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;

    public static boolean a(Context context) {
        return k(context.getPackageManager());
    }

    public static boolean b(Context context) {
        if (f == null) {
            boolean z = false;
            if (q.j() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            f = Boolean.valueOf(z);
        }
        return f.booleanValue();
    }

    public static boolean c(Context context) {
        if (c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }

    public static boolean d(Context context) {
        return i(context);
    }

    public static boolean e() {
        int i = v6.l.a;
        return "user".equals(Build.TYPE);
    }

    public static boolean f(Context context) {
        return h(context.getPackageManager());
    }

    public static boolean g(Context context) {
        if (f(context) && !q.f()) {
            return true;
        }
        if (i(context)) {
            return !q.g() || q.j();
        }
        return false;
    }

    public static boolean h(PackageManager packageManager) {
        if (a == null) {
            a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }

    public static boolean i(Context context) {
        if (b == null) {
            b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return b.booleanValue();
    }

    public static boolean j(Context context) {
        if (d == null) {
            d = Boolean.valueOf(q.g() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return d.booleanValue();
    }

    public static boolean k(PackageManager packageManager) {
        if (e == null) {
            boolean z = false;
            if (q.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            e = Boolean.valueOf(z);
        }
        return e.booleanValue();
    }
}

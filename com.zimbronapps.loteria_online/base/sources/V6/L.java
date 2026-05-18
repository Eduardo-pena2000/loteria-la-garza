package v6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class l {
    public static final int a = 12451000;
    public static boolean c = false;
    public static boolean d = false;
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final AtomicBoolean e = new AtomicBoolean();

    public static void a(Context context, int i) {
        int h = h.f().h(context, i);
        if (h != 0) {
            Intent b2 = h.f().b(context, h, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(h);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (b2 != null) {
                throw new j(h, "Google Play Services not available", b2);
            }
            throw new i(h);
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static String c(int i) {
        return b.S1(i);
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        try {
            if (!d) {
                try {
                    PackageInfo f = G6.e.a(context).f("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                    m.a(context);
                    if (f == null || m.d(f, false) || !m.d(f, true)) {
                        c = false;
                    } else {
                        c = true;
                    }
                    d = true;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                    d = true;
                }
            }
            return c || !E6.j.e();
        } catch (Throwable th) {
            d = true;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(android.content.Context r11, int r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.l.g(android.content.Context, int):int");
    }

    public static boolean h(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return l(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean i(Context context) {
        Object systemService = context.getSystemService("user");
        com.google.android.gms.common.internal.t.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean j(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean k(Context context, int i, String str) {
        return E6.w.b(context, i, str);
    }

    public static boolean l(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        try {
            Iterator it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(((PackageInstaller.SessionInfo) it.next()).getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (Exception | PackageManager.NameNotFoundException unused) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !i(context);
    }
}

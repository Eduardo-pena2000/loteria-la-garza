package P1;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public static final a a = new a();
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    public static final class a {
        public static final a a = new a();

        public final int a(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        b = i >= 30 ? a.a.a(30) : 0;
        c = i >= 30 ? a.a.a(31) : 0;
        d = i >= 30 ? a.a.a(33) : 0;
        e = i >= 30 ? a.a.a(1000000) : 0;
    }

    public static final boolean a(String str, String str2) {
        t.g(str, "codename");
        t.g(str2, "buildCodename");
        if (t.c("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        t.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        t.f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                t.f(str, "CODENAME");
                if (a("S", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                t.f(str, "CODENAME");
                if (a("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            if (i >= 33) {
                String str = Build.VERSION.CODENAME;
                t.f(str, "CODENAME");
                if (a("UpsideDownCake", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean e() {
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            if (i >= 34) {
                String str = Build.VERSION.CODENAME;
                t.f(str, "CODENAME");
                if (a("VanillaIceCream", str)) {
                }
            }
            return false;
        }
        return true;
    }
}

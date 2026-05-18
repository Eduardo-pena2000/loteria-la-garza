package W5;

import android.util.Log;
import com.google.android.gms.internal.ads.zzgrr;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class p {
    public static final zzgrr a = zzgrr.zzc(4000);

    public static void a(String str) {
        if (j(3)) {
            if (str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : a.zzd(str)) {
                if (z) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void b(String str, Throwable th) {
        if (j(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void c(String str) {
        if (j(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : a.zzd(str)) {
                if (z) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void d(String str, Throwable th) {
        if (j(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void e(String str) {
        if (j(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : a.zzd(str)) {
                if (z) {
                    Log.i("Ads", str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void f(String str) {
        if (j(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : a.zzd(str)) {
                if (z) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void g(String str, Throwable th) {
        if (j(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void i(String str, Throwable th) {
        if (j(5)) {
            if (th != null) {
                g(h(str), th);
            } else {
                f(h(str));
            }
        }
    }

    public static boolean j(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}

package P2;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o {
    public static int b = 0;
    public static boolean c = true;
    public static final Object a = new Object();
    public static a d = a.a;

    public interface a {
        public static final a a = new a();

        public class a implements a {
            public void a(String str, String str2, Throwable th) {
                Log.d(str, o.a(str2, th));
            }

            public void b(String str, String str2, Throwable th) {
                Log.w(str, o.a(str2, th));
            }

            public void c(String str, String str2, Throwable th) {
                Log.i(str, o.a(str2, th));
            }

            public void e(String str, String str2, Throwable th) {
                Log.e(str, o.a(str2, th));
            }
        }

        void a(String str, String str2, Throwable th);

        void b(String str, String str2, Throwable th);

        void c(String str, String str2, Throwable th);

        void e(String str, String str2, Throwable th);
    }

    public static String a(String str, Throwable th) {
        String e = e(th);
        if (TextUtils.isEmpty(e)) {
            return str;
        }
        return str + "\n  " + e.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (a) {
            try {
                if (b == 0) {
                    d.a(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 3) {
                    d.e(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (a) {
            try {
                if (b <= 3) {
                    d.e(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (a) {
            try {
                if (g(th)) {
                    return "UnknownHostException (no network)";
                }
                if (c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 1) {
                    d.c(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 2) {
                    d.b(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        synchronized (a) {
            try {
                if (b <= 2) {
                    d.b(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

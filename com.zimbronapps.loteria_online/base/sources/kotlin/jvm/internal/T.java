package kotlin.jvm.internal;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class t {

    public static class a {
    }

    public static boolean a(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    public static boolean b(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void d(Object obj) {
        if (obj == null) {
            p();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw m(new NullPointerException(str + " must not be null"));
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            r(str);
        }
    }

    public static int h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int i(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static String j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = t.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void k() {
        s();
    }

    public static void l(int i, String str) {
        s();
    }

    public static Throwable m(Throwable th) {
        return n(th, t.class.getName());
    }

    public static Throwable n(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return th;
    }

    public static String o(String str, Object obj) {
        return str + obj;
    }

    public static void p() {
        throw m(new NullPointerException());
    }

    public static void q(String str) {
        throw m(new NullPointerException(str));
    }

    public static void r(String str) {
        throw m(new NullPointerException(j(str)));
    }

    public static void s() {
        t("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void t(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void u(String str) {
        throw m(new Ca.H(str));
    }

    public static void v(String str) {
        u("lateinit property " + str + " has not been initialized");
    }
}

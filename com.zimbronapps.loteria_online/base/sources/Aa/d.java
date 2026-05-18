package Aa;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d implements AutoCloseable {
    public d(String str) {
        a(str);
    }

    public static void a(String str) {
        p4.a.c(c(str));
    }

    public static void b(String str, int i) {
        p4.a.a(c(str), i);
    }

    public static String c(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void d() {
        p4.a.f();
    }

    public static void f(String str, int i) {
        p4.a.d(c(str), i);
    }

    public static d g(String str) {
        return new d(str);
    }

    public void close() {
        d();
    }
}

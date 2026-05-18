package Wb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface c {
    boolean a();

    void b(String str, Object obj, Object obj2);

    boolean c();

    void d(String str, Object obj, Object obj2);

    void debug(String str);

    void e(String str, Object... objArr);

    void error(String str, Throwable th);

    boolean f();

    void g(String str, Object obj, Object obj2);

    String getName();

    boolean h();

    void i(String str, Object... objArr);

    void info(String str);

    void j(String str, Object... objArr);

    void k(String str, Throwable th);

    default boolean l(Xb.b bVar) {
        int b = bVar.b();
        if (b == 0) {
            return h();
        }
        if (b == 10) {
            return c();
        }
        if (b == 20) {
            return f();
        }
        if (b == 30) {
            return a();
        }
        if (b == 40) {
            return r();
        }
        throw new IllegalArgumentException("Level [" + bVar + "] not recognized.");
    }

    void n(String str, Object obj, Object obj2);

    void o(String str, Object obj);

    void p(String str, Object obj);

    void q(String str, Object obj);

    boolean r();

    void s(String str, Object obj, Object obj2);

    void t(String str, Object obj);

    void u(String str, Object obj);

    void v(String str, Throwable th);

    void w(String str);

    void x(String str);
}

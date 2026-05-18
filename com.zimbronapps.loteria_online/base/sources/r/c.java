package r;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c extends e {
    public static volatile c c;
    public static final Executor d = new a();
    public static final Executor e = new b();
    public e a;
    public final e b;

    public c() {
        d dVar = new d();
        this.b = dVar;
        this.a = dVar;
    }

    public static /* synthetic */ void d(Runnable runnable) {
        h(runnable);
    }

    public static /* synthetic */ void e(Runnable runnable) {
        i(runnable);
    }

    public static Executor f() {
        return e;
    }

    public static c g() {
        if (c != null) {
            return c;
        }
        synchronized (c.class) {
            try {
                if (c == null) {
                    c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static /* synthetic */ void h(Runnable runnable) {
        g().c(runnable);
    }

    public static /* synthetic */ void i(Runnable runnable) {
        g().a(runnable);
    }

    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(Runnable runnable) {
        this.a.c(runnable);
    }
}

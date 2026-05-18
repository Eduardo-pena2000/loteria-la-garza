package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Y0 {
    public static final Y0 a = new Y0();
    public static final ThreadLocal b = hb.L.a(new hb.D("ThreadLocalEventLoop"));

    public final k0 a() {
        return (k0) b.get();
    }

    public final k0 b() {
        ThreadLocal threadLocal = b;
        k0 k0Var = (k0) threadLocal.get();
        if (k0Var != null) {
            return k0Var;
        }
        k0 a2 = n0.a();
        threadLocal.set(a2);
        return a2;
    }

    public final void c() {
        b.set((Object) null);
    }

    public final void d(k0 k0Var) {
        b.set(k0Var);
    }
}

package androidx.datastore.preferences.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h0 {
    public static volatile int a = 100;

    public abstract void a(Object obj, int i, int i2);

    public abstract void b(Object obj, int i, long j);

    public abstract void c(Object obj, int i, Object obj2);

    public abstract void d(Object obj, int i, f fVar);

    public abstract void e(Object obj, int i, long j);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, Z z, int i) {
        while (z.A() != Integer.MAX_VALUE && m(obj, z, i)) {
        }
    }

    public final boolean m(Object obj, Z z, int i) {
        int k = z.k();
        int a2 = m0.a(k);
        int b = m0.b(k);
        if (b == 0) {
            e(obj, a2, z.H());
            return true;
        }
        if (b == 1) {
            b(obj, a2, z.a());
            return true;
        }
        if (b == 2) {
            d(obj, a2, z.o());
            return true;
        }
        if (b != 3) {
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw v.e();
            }
            a(obj, a2, z.u());
            return true;
        }
        Object n = n();
        int c = m0.c(a2, 4);
        int i2 = i + 1;
        if (i2 >= a) {
            throw v.i();
        }
        l(n, z, i2);
        if (c != z.k()) {
            throw v.b();
        }
        c(obj, a2, r(n));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(Z z);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, n0 n0Var);

    public abstract void t(Object obj, n0 n0Var);
}

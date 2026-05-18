package T2;

import M2.G;
import android.util.Pair;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a extends M2.G {
    public final int e;
    public final g3.S f;
    public final boolean g;

    public a(boolean z, g3.S s) {
        this.g = z;
        this.f = s;
        this.e = s.a();
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i);

    public final int B(int i, boolean z) {
        if (z) {
            return this.f.d(i);
        }
        if (i < this.e - 1) {
            return i + 1;
        }
        return -1;
    }

    public final int C(int i, boolean z) {
        if (z) {
            return this.f.c(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    public abstract M2.G D(int i);

    public int a(boolean z) {
        if (this.e == 0) {
            return -1;
        }
        if (this.g) {
            z = false;
        }
        int g = z ? this.f.g() : 0;
        while (D(g).q()) {
            g = B(g, z);
            if (g == -1) {
                return -1;
            }
        }
        return A(g) + D(g).a(z);
    }

    public final int b(Object obj) {
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object w = w(obj);
        Object v = v(obj);
        int s = s(w);
        if (s == -1 || (b = D(s).b(v)) == -1) {
            return -1;
        }
        return z(s) + b;
    }

    public int c(boolean z) {
        int i = this.e;
        if (i == 0) {
            return -1;
        }
        if (this.g) {
            z = false;
        }
        int e = z ? this.f.e() : i - 1;
        while (D(e).q()) {
            e = C(e, z);
            if (e == -1) {
                return -1;
            }
        }
        return A(e) + D(e).c(z);
    }

    public int e(int i, int i2, boolean z) {
        if (this.g) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int u = u(i);
        int A = A(u);
        int e = D(u).e(i - A, i2 != 2 ? i2 : 0, z);
        if (e != -1) {
            return A + e;
        }
        int B = B(u, z);
        while (B != -1 && D(B).q()) {
            B = B(B, z);
        }
        if (B != -1) {
            return A(B) + D(B).a(z);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    public final G.b g(int i, G.b bVar, boolean z) {
        int t = t(i);
        int A = A(t);
        D(t).g(i - z(t), bVar, z);
        bVar.c += A;
        if (z) {
            bVar.b = y(x(t), P2.a.e(bVar.b));
        }
        return bVar;
    }

    public final G.b h(Object obj, G.b bVar) {
        Object w = w(obj);
        Object v = v(obj);
        int s = s(w);
        int A = A(s);
        D(s).h(v, bVar);
        bVar.c += A;
        bVar.b = obj;
        return bVar;
    }

    public int l(int i, int i2, boolean z) {
        if (this.g) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int u = u(i);
        int A = A(u);
        int l = D(u).l(i - A, i2 != 2 ? i2 : 0, z);
        if (l != -1) {
            return A + l;
        }
        int C = C(u, z);
        while (C != -1 && D(C).q()) {
            C = C(C, z);
        }
        if (C != -1) {
            return A(C) + D(C).c(z);
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    public final Object m(int i) {
        int t = t(i);
        return y(x(t), D(t).m(i - z(t)));
    }

    public final G.c o(int i, G.c cVar, long j) {
        int u = u(i);
        int A = A(u);
        int z = z(u);
        D(u).o(i - A, cVar, j);
        Object x = x(u);
        if (!G.c.q.equals(cVar.a)) {
            x = y(x, cVar.a);
        }
        cVar.a = x;
        cVar.n += z;
        cVar.o += z;
        return cVar;
    }

    public abstract int s(Object obj);

    public abstract int t(int i);

    public abstract int u(int i);

    public abstract Object x(int i);

    public abstract int z(int i);
}

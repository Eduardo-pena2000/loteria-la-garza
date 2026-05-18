package b0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class w {
    public static boolean a;
    public static final Object b = new I0("provider");
    public static final Object c = new I0("provider");
    public static final Object d = new I0("compositionLocalMap");
    public static final Object e = new I0("providerValues");
    public static final Object f = new I0("providers");
    public static final Object g = new I0("reference");
    public static final Comparator h = new u();

    public static final k0 A(List list, int i, int i2) {
        int y = y(list, i);
        if (y >= list.size()) {
            return null;
        }
        k0 k0Var = (k0) list.get(y);
        if (k0Var.b() < i2) {
            return k0Var;
        }
        return null;
    }

    public static final boolean B() {
        return a;
    }

    public static final Object C() {
        return d;
    }

    public static final Object D() {
        return b;
    }

    public static final Object E(n0 n0Var) {
        return n0Var.d() != null ? new m0(Integer.valueOf(n0Var.a()), n0Var.d()) : Integer.valueOf(n0Var.a());
    }

    public static final Object F() {
        return c;
    }

    public static final Object G() {
        return f;
    }

    public static final Object H() {
        return g;
    }

    public static final void I(List list, int i, f1 f1Var, Object obj) {
        int z = z(list, i);
        if (z < 0) {
            int i2 = -(z + 1);
            if (!(obj instanceof U)) {
                obj = null;
            }
            list.add(i2, new k0(f1Var, i, obj));
            return;
        }
        k0 k0Var = (k0) list.get(z);
        if (!(obj instanceof U)) {
            k0Var.e(null);
            return;
        }
        Object a2 = k0Var.a();
        if (a2 == null) {
            k0Var.e(obj);
        } else if (a2 instanceof w.Q) {
            ((w.Q) a2).h(obj);
        } else {
            k0Var.e(w.f0.c(a2, obj));
        }
    }

    public static final boolean J(D1 d1) {
        return d1.k() > d1.u() + 1;
    }

    public static final boolean K(H1 h1) {
        return h1.Z() > h1.a0() + 1;
    }

    public static final boolean L() {
        return false;
    }

    public static final w.P M(int i) {
        return d0.b.d(new w.P(i));
    }

    public static final int N(D1 d1, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (d1.Q(i) == i2) {
            return i2;
        }
        if (d1.Q(i2) == i) {
            return i;
        }
        if (d1.Q(i) == d1.Q(i2)) {
            return d1.Q(i);
        }
        int x = x(d1, i, i3);
        int x2 = x(d1, i2, i3);
        int i4 = x - x2;
        for (int i5 = 0; i5 < i4; i5++) {
            i = d1.Q(i);
        }
        int i6 = x2 - x;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = d1.Q(i2);
        }
        while (i != i2) {
            i = d1.Q(i);
            i2 = d1.Q(i2);
        }
        return i;
    }

    public static final void O(H1 h1, u1 u1Var) {
        h1.W(h1.Z(), new v(u1Var));
        h1.J0();
    }

    public static final Ca.I P(u1 u1Var, int i, Object obj) {
        if (obj instanceof i) {
            u1Var.e((i) obj);
        }
        if (obj instanceof w1) {
            u1Var.g((w1) obj);
        }
        if (obj instanceof f1) {
            ((f1) obj).A();
        }
        return Ca.I.a;
    }

    public static final void Q(H1 h1, int i, Object obj) {
        Object H = h1.H(i);
        if (obj == H) {
            return;
        }
        t("Slot table is out of sync (expected " + obj + ", got " + H + ')');
    }

    public static final k0 R(List list, int i) {
        int z = z(list, i);
        if (z >= 0) {
            return (k0) list.remove(z);
        }
        return null;
    }

    public static final void S(List list, int i, int i2) {
        int y = y(list, i);
        while (y < list.size() && ((k0) list.get(y)).b() < i2) {
        }
    }

    public static /* synthetic */ Ca.I a(u1 u1Var, int i, Object obj) {
        return P(u1Var, i, obj);
    }

    public static /* synthetic */ Ca.I b(u1 u1Var, H1 h1, int i, Object obj) {
        return w(u1Var, h1, i, obj);
    }

    public static /* synthetic */ int c(k0 k0Var, k0 k0Var2) {
        return d(k0Var, k0Var2);
    }

    public static final int d(k0 k0Var, k0 k0Var2) {
        return kotlin.jvm.internal.t.h(k0Var.b(), k0Var2.b());
    }

    public static final /* synthetic */ boolean e(int i) {
        return p(i);
    }

    public static final /* synthetic */ int f(boolean z) {
        return q(z);
    }

    public static final /* synthetic */ List g(E1 e1, b bVar) {
        return r(e1, bVar);
    }

    public static final /* synthetic */ k0 h(List list, int i, int i2) {
        return A(list, i, i2);
    }

    public static final /* synthetic */ Comparator i() {
        return h;
    }

    public static final /* synthetic */ Object j(n0 n0Var) {
        return E(n0Var);
    }

    public static final /* synthetic */ void k(List list, int i, f1 f1Var, Object obj) {
        I(list, i, f1Var, obj);
    }

    public static final /* synthetic */ w.P l(int i) {
        return M(i);
    }

    public static final /* synthetic */ int m(D1 d1, int i, int i2, int i3) {
        return N(d1, i, i2, i3);
    }

    public static final /* synthetic */ k0 n(List list, int i) {
        return R(list, i);
    }

    public static final /* synthetic */ void o(List list, int i, int i2) {
        S(list, i, i2);
    }

    public static final boolean p(int i) {
        return i != 0;
    }

    public static final List r(E1 e1, b bVar) {
        ArrayList arrayList = new ArrayList();
        D1 w = e1.w();
        try {
            s(w, arrayList, e1.b(bVar));
            Ca.I i = Ca.I.a;
            return arrayList;
        } finally {
            w.d();
        }
    }

    public static final void s(D1 d1, List list, int i) {
        if (d1.K(i)) {
            list.add(d1.M(i));
            return;
        }
        int i2 = i + 1;
        int F = i + d1.F(i);
        while (i2 < F) {
            s(d1, list, i2);
            i2 += d1.F(i2);
        }
    }

    public static final void t(String str) {
        throw new k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void u(String str) {
        throw new k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void v(H1 h1, u1 u1Var) {
        h1.W(h1.Z(), new t(u1Var, h1));
    }

    public static final Ca.I w(u1 u1Var, H1 h1, int i, Object obj) {
        if (obj instanceof i) {
            u1Var.a((i) obj);
        } else if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            if (!(w1Var.b() instanceof z1)) {
                Q(h1, i, obj);
                u1Var.g(w1Var);
            }
        } else if (obj instanceof f1) {
            Q(h1, i, obj);
            ((f1) obj).A();
        }
        return Ca.I.a;
    }

    public static final int x(D1 d1, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = d1.Q(i);
            i3++;
        }
        return i3;
    }

    public static final int y(List list, int i) {
        int z = z(list, i);
        return z < 0 ? -(z + 1) : z;
    }

    public static final int z(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int h2 = kotlin.jvm.internal.t.h(((k0) list.get(i3)).b(), i);
            if (h2 < 0) {
                i2 = i3 + 1;
            } else {
                if (h2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void T() {
    }

    public static final int q(boolean z) {
        return z ? 1 : 0;
    }

    public static final void U(int i, int i2, int i3, String str) {
    }
}

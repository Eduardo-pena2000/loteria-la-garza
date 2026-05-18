package n0;

import Ca.I;
import b0.D1;
import b0.E1;
import b0.H1;
import b0.s;
import java.util.List;
import kotlin.jvm.internal.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final List a(D1 d1) {
        if (d1.i() || d1.x() == 0) {
            return Da.v.n();
        }
        u uVar = new u(d1);
        int u = d1.u();
        b0.b valueOf = Integer.valueOf(d1.y());
        while (u >= 0) {
            uVar.f(d1.z().A(u), valueOf);
            valueOf = d1.a(u);
            u = d1.Q(u);
        }
        return uVar.i();
    }

    public static final List b(H1 h1, Object obj, int i, Integer num) {
        if (h1.Y() || h1.b0() == 0) {
            return Da.v.n();
        }
        y yVar = new y(h1);
        int intValue = num != null ? num.intValue() : h1.a0() < 0 ? h1.C0(i) : h1.a0();
        if (obj == null) {
            obj = Integer.valueOf(h1.i0(i));
        }
        while (i >= 0) {
            yVar.f(h1.b1(i), obj);
            obj = h1.B(i);
            if (intValue >= 0) {
                int i2 = intValue;
                intValue = h1.C0(intValue);
                i = i2;
            } else {
                i = intValue;
            }
        }
        return yVar.i();
    }

    public static /* synthetic */ List c(H1 h1, Object obj, int i, Integer num, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            i = h1.Z();
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return b(h1, obj, i, num);
    }

    public static final q d(E1 e1, Qa.l lVar) {
        D1 w = e1.w();
        try {
            M m = new M();
            while (m.a < e1.o()) {
                if (w.K(m.a) && ((Boolean) lVar.invoke(w.M(m.a))).booleanValue()) {
                    return new q(m.a, null);
                }
                int V = w.V(m.a);
                for (int i = 0; i < V; i++) {
                    if (((Boolean) lVar.invoke(w.C(m.a, i))).booleanValue()) {
                        return new q(m.a, Integer.valueOf(i));
                    }
                }
                m.a++;
            }
            I i2 = I.a;
            return null;
        } finally {
            w.d();
        }
    }

    public static final Integer e(E1 e1, b0.y yVar) {
        D1 w = e1.w();
        try {
            return f(w, yVar, 0, w.x());
        } finally {
            w.d();
        }
    }

    public static final Integer f(D1 d1, b0.y yVar, int i, int i2) {
        Integer f;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int F = d1.F(i) + i;
            if (d1.G(i) && d1.D(i) == 206 && kotlin.jvm.internal.t.c(d1.E(i), b0.w.H())) {
                Object C = d1.C(i, 0);
                s.a aVar = C instanceof s.a ? (s.a) C : null;
                if (aVar != null && kotlin.jvm.internal.t.c(aVar.a(), yVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (d1.e(i) && (f = f(d1, yVar, i + 1, F)) != null) {
                return Integer.valueOf(f.intValue());
            }
            i = F;
        }
    }

    public static final List g(D1 d1, int i, Object obj) {
        u uVar = new u(d1);
        int Q = d1.Q(i);
        b0.b a = d1.a(i);
        while (i >= 0) {
            uVar.f(d1.z().A(i), obj);
            if (Q >= 0) {
                b0.b bVar = a;
                a = d1.a(Q);
                i = Q;
                Q = d1.Q(Q);
                obj = bVar;
            } else {
                i = Q;
                obj = a;
            }
        }
        return uVar.i();
    }
}

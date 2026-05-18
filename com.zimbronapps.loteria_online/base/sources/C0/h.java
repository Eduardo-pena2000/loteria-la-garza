package c0;

import Da.D;
import Da.u;
import b0.H1;
import b0.w;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {

    public static final class a implements f {
        public final /* synthetic */ f a;
        public final /* synthetic */ H1 b;

        public a(f fVar, H1 h1) {
            this.a = fVar;
            this.b = h1;
        }

        public List e(Integer num) {
            List e = this.a.e(null);
            int a0 = this.b.a0();
            if (a0 < 0) {
                return e;
            }
            H1 h1 = this.b;
            return D.v0(n0.b.b(h1, num, a0, Integer.valueOf(h1.C0(a0))), e);
        }
    }

    public static /* synthetic */ List a(b0.b bVar, H1 h1, f fVar) {
        return g(bVar, h1, fVar);
    }

    public static final /* synthetic */ Throwable b(Throwable th, f fVar, H1 h1, b0.b bVar) {
        return f(th, fVar, h1, bVar);
    }

    public static final /* synthetic */ int c(H1 h1, b0.b bVar, b0.d dVar) {
        return i(h1, bVar, dVar);
    }

    public static final /* synthetic */ void d(H1 h1, b0.d dVar, int i) {
        j(h1, dVar, i);
    }

    public static final /* synthetic */ f e(f fVar, H1 h1) {
        return k(fVar, h1);
    }

    public static final Throwable f(Throwable th, f fVar, H1 h1, b0.b bVar) {
        return fVar == null ? th : n0.d.b(th, new g(bVar, h1, fVar));
    }

    public static final List g(b0.b bVar, H1 h1, f fVar) {
        if (bVar != null) {
            h1.P0(bVar);
        }
        List c = n0.b.c(h1, null, 0, null, 7, null);
        n0.c cVar = (n0.c) D.q0(c);
        Integer c2 = cVar != null ? cVar.c() : null;
        List e = fVar.e(c2);
        if (c2 != null && !e.isEmpty()) {
            e = D.v0(u.e(n0.c.b((n0.c) D.f0(e), null, c2, 1, null)), D.a0(e, 1));
        }
        return D.v0(c, e);
    }

    public static final int h(H1 h1) {
        int Z = h1.Z();
        int a0 = h1.a0();
        while (a0 >= 0 && !h1.p0(a0)) {
            a0 = h1.C0(a0);
        }
        int i = a0 + 1;
        int i2 = 0;
        while (i < Z) {
            if (h1.k0(Z, i)) {
                if (h1.p0(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                i2 += h1.p0(i) ? 1 : h1.A0(i);
                i += h1.h0(i);
            }
        }
        return i2;
    }

    public static final int i(H1 h1, b0.b bVar, b0.d dVar) {
        int C = h1.C(bVar);
        if (!(h1.Z() < C)) {
            w.t("Check failed");
        }
        j(h1, dVar, C);
        int h = h(h1);
        while (h1.Z() < C) {
            if (h1.j0(C)) {
                if (h1.o0()) {
                    dVar.h(h1.y0(h1.Z()));
                    h = 0;
                }
                h1.d1();
            } else {
                h += h1.T0();
            }
        }
        if (!(h1.Z() == C)) {
            w.t("Check failed");
        }
        return h;
    }

    public static final void j(H1 h1, b0.d dVar, int i) {
        while (!h1.l0(i)) {
            h1.U0();
            if (h1.p0(h1.a0())) {
                dVar.k();
            }
            h1.R();
        }
    }

    public static final f k(f fVar, H1 h1) {
        return new a(fVar, h1);
    }
}

package T;

import T.k;
import Z0.T0;
import Z0.W0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ j a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ w d;
        public final /* synthetic */ Ca.l e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, int i, int i2, w wVar, Ca.l lVar) {
            super(0);
            this.a = jVar;
            this.b = i;
            this.c = i2;
            this.d = wVar;
            this.e = lVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k.a invoke() {
            return r.b(this.a, r.d(this.e), this.b, this.c, this.d.a(), this.d.e() == e.CROSSED);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ j a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, int i) {
            super(0);
            this.a = jVar;
            this.b = i;
        }

        public final Integer invoke() {
            return Integer.valueOf(this.a.k().q(this.b));
        }
    }

    public static final /* synthetic */ k a(w wVar, c cVar) {
        return e(wVar, cVar);
    }

    public static final /* synthetic */ k.a b(j jVar, int i, int i2, int i3, boolean z, boolean z2) {
        return k(jVar, i, i2, i3, z, z2);
    }

    public static final /* synthetic */ k.a c(w wVar, j jVar, k.a aVar) {
        return l(wVar, jVar, aVar);
    }

    public static final /* synthetic */ int d(Ca.l lVar) {
        return m(lVar);
    }

    public static final k e(w wVar, c cVar) {
        boolean z = wVar.e() == e.CROSSED;
        return new k(f(wVar.i(), z, true, wVar.j(), cVar), f(wVar.h(), z, false, wVar.d(), cVar), z);
    }

    public static final k.a f(j jVar, boolean z, boolean z2, int i, c cVar) {
        int g = z2 ? jVar.g() : jVar.e();
        if (i != jVar.i()) {
            return jVar.a(g);
        }
        long a2 = cVar.a(jVar, g);
        return jVar.a(z ^ z2 ? W0.n(a2) : W0.i(a2));
    }

    public static final k.a g(k.a aVar, j jVar, int i) {
        return k.a.b(aVar, jVar.k().c(i), i, 0L, 4, null);
    }

    public static final k h(k kVar, w wVar) {
        if (x.d(kVar, wVar)) {
            return (wVar.getSize() > 1 || wVar.g() == null || wVar.b().c().length() == 0) ? kVar : i(kVar, wVar);
        }
        return kVar;
    }

    public static final k i(k kVar, w wVar) {
        j b2 = wVar.b();
        String c = b2.c();
        int g = b2.g();
        int length = c.length();
        if (g == 0) {
            int a2 = N.D.a(c, 0);
            return wVar.a() ? k.b(kVar, g(kVar.e(), b2, a2), null, true, 2, null) : k.b(kVar, null, g(kVar.c(), b2, a2), false, 1, null);
        }
        if (g == length) {
            int b3 = N.D.b(c, length);
            return wVar.a() ? k.b(kVar, g(kVar.e(), b2, b3), null, false, 2, null) : k.b(kVar, null, g(kVar.c(), b2, b3), true, 1, null);
        }
        k g2 = wVar.g();
        boolean z = g2 != null && g2.d();
        int b4 = wVar.a() ^ z ? N.D.b(c, g) : N.D.a(c, g);
        return wVar.a() ? k.b(kVar, g(kVar.e(), b2, b4), null, z, 2, null) : k.b(kVar, null, g(kVar.c(), b2, b4), z, 1, null);
    }

    public static final boolean j(j jVar, int i, boolean z) {
        if (jVar.f() == -1) {
            return true;
        }
        if (i == jVar.f()) {
            return false;
        }
        if (z ^ (jVar.d() == e.CROSSED)) {
            if (i < jVar.f()) {
                return true;
            }
        } else if (i > jVar.f()) {
            return true;
        }
        return false;
    }

    public static final k.a k(j jVar, int i, int i2, int i3, boolean z, boolean z2) {
        long C = jVar.k().C(i2);
        int n = jVar.k().q(W0.n(C)) == i ? W0.n(C) : i >= jVar.k().n() ? jVar.k().u(jVar.k().n() - 1) : jVar.k().u(i);
        int i4 = jVar.k().q(W0.i(C)) == i ? W0.i(C) : i >= jVar.k().n() ? T0.p(jVar.k(), jVar.k().n() - 1, false, 2, null) : T0.p(jVar.k(), i, false, 2, null);
        if (n == i3) {
            return jVar.a(i4);
        }
        if (i4 == i3) {
            return jVar.a(n);
        }
        if (!(z ^ z2) ? i2 >= n : i2 > i4) {
            n = i4;
        }
        return jVar.a(n);
    }

    public static final k.a l(w wVar, j jVar, k.a aVar) {
        int g = wVar.a() ? jVar.g() : jVar.e();
        if ((wVar.a() ? wVar.j() : wVar.d()) != jVar.i()) {
            return jVar.a(g);
        }
        Ca.n nVar = Ca.n.c;
        Ca.l a2 = Ca.m.a(nVar, new b(jVar, g));
        Ca.l a3 = Ca.m.a(nVar, new a(jVar, g, wVar.a() ? jVar.e() : jVar.g(), wVar, a2));
        if (jVar.h() != aVar.d()) {
            return n(a3);
        }
        int f = jVar.f();
        if (g == f) {
            return aVar;
        }
        if (m(a2) != jVar.k().q(f)) {
            return n(a3);
        }
        int c = aVar.c();
        long C = jVar.k().C(c);
        return !j(jVar, g, wVar.a()) ? jVar.a(g) : (c == W0.n(C) || c == W0.i(C)) ? n(a3) : jVar.a(g);
    }

    public static final int m(Ca.l lVar) {
        return ((Number) lVar.getValue()).intValue();
    }

    public static final k.a n(Ca.l lVar) {
        return (k.a) lVar.getValue();
    }
}

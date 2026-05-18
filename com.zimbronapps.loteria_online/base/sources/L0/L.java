package l0;

import b0.V0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l {
    public static final a e = new a(null);
    public static final int f = 8;
    public p a;
    public long b;
    public boolean c;
    public int d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(Qa.l lVar) {
            k(lVar);
        }

        public static /* synthetic */ void b(Qa.p pVar) {
            i(pVar);
        }

        public static final void i(Qa.p pVar) {
            synchronized (v.O()) {
                v.y(Da.D.u0(v.i(), pVar));
                Ca.I i = Ca.I.a;
            }
        }

        public static final void k(Qa.l lVar) {
            synchronized (v.O()) {
                v.z(Da.D.u0(v.l(), lVar));
                Ca.I i = Ca.I.a;
            }
            v.f();
        }

        public final l c() {
            return v.M();
        }

        public final l d() {
            return (l) v.p().a();
        }

        public final l e(l lVar) {
            if (lVar instanceof Y) {
                Y y = (Y) lVar;
                if (y.V() == j0.w.a()) {
                    y.Y(null);
                    return lVar;
                }
            }
            if (lVar instanceof Z) {
                Z z = (Z) lVar;
                if (z.C() == j0.w.a()) {
                    z.F(null);
                    return lVar;
                }
            }
            l J = v.J(lVar, null, false, 6, null);
            J.l();
            return J;
        }

        public final void f() {
            v.M().o();
        }

        public final Object g(Qa.l lVar, Qa.l lVar2, Qa.a aVar) {
            l y;
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            l lVar3 = (l) v.p().a();
            if (lVar3 instanceof Y) {
                Y y2 = (Y) lVar3;
                if (y2.V() == j0.w.a()) {
                    Qa.l g = y2.g();
                    Qa.l k = y2.k();
                    try {
                        ((Y) lVar3).Y(v.Q(lVar, g, false, 4, null));
                        ((Y) lVar3).Z(v.r(lVar2, k));
                        return aVar.invoke();
                    } finally {
                        y2.Y(g);
                        y2.Z(k);
                    }
                }
            }
            if (lVar3 == null || (lVar3 instanceof d)) {
                y = new Y(lVar3 instanceof d ? (d) lVar3 : null, lVar, lVar2, true, false);
            } else {
                if (lVar == null) {
                    return aVar.invoke();
                }
                y = lVar3.x(lVar);
            }
            try {
                l l = y.l();
                try {
                    return aVar.invoke();
                } finally {
                    y.s(l);
                }
            } finally {
                y.d();
            }
        }

        public final g h(Qa.p pVar) {
            v.e(v.j());
            synchronized (v.O()) {
                v.y(Da.D.w0(v.i(), pVar));
                Ca.I i = Ca.I.a;
            }
            return new j(pVar);
        }

        public final g j(Qa.l lVar) {
            synchronized (v.O()) {
                v.z(Da.D.w0(v.l(), lVar));
                Ca.I i = Ca.I.a;
            }
            v.f();
            return new k(lVar);
        }

        public final void l(l lVar, l lVar2, Qa.l lVar3) {
            if (lVar != lVar2) {
                lVar2.s(lVar);
                lVar2.d();
            } else if (lVar instanceof Y) {
                ((Y) lVar).Y(lVar3);
            } else {
                if (lVar instanceof Z) {
                    ((Z) lVar).F(lVar3);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + lVar).toString());
            }
        }

        public final void m() {
            boolean I;
            synchronized (v.O()) {
                I = v.k().I();
            }
            if (I) {
                v.f();
            }
        }

        public final d n(Qa.l lVar, Qa.l lVar2) {
            d R;
            l M = v.M();
            d dVar = M instanceof d ? (d) M : null;
            if (dVar == null || (R = dVar.R(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return R;
        }

        public final l o(Qa.l lVar) {
            return v.M().x(lVar);
        }

        public a() {
        }
    }

    public /* synthetic */ l(long j, p pVar, kotlin.jvm.internal.k kVar) {
        this(j, pVar);
    }

    public static final /* synthetic */ int a(l lVar) {
        return lVar.d;
    }

    public final void b() {
        synchronized (v.O()) {
            c();
            r();
            Ca.I i = Ca.I.a;
        }
    }

    public void c() {
        v.B(v.o().j(i()));
    }

    public void d() {
        this.c = true;
        synchronized (v.O()) {
            q();
            Ca.I i = Ca.I.a;
        }
    }

    public final boolean e() {
        return this.c;
    }

    public p f() {
        return this.a;
    }

    public abstract Qa.l g();

    public abstract boolean h();

    public long i() {
        return this.b;
    }

    public int j() {
        return 0;
    }

    public abstract Qa.l k();

    public l l() {
        l lVar = (l) v.p().a();
        v.p().b(this);
        return lVar;
    }

    public abstract void m(l lVar);

    public abstract void n(l lVar);

    public abstract void o();

    public abstract void p(U u);

    public final void q() {
        int i = this.d;
        if (i >= 0) {
            v.f0(i);
            this.d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(l lVar) {
        v.p().b(lVar);
    }

    public final void t(boolean z) {
        this.c = z;
    }

    public void u(p pVar) {
        this.a = pVar;
    }

    public void v(long j) {
        this.b = j;
    }

    public void w(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract l x(Qa.l lVar);

    public final int y() {
        int i = this.d;
        this.d = -1;
        return i;
    }

    public final void z() {
        if (this.c) {
            V0.a("Cannot use a disposed snapshot");
        }
    }

    public l(long j, p pVar) {
        this.a = pVar;
        this.b = j;
        this.d = j != v.m() ? v.k0(j, f()) : -1;
    }
}

package androidx.compose.ui.layout;

import O0.Z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q implements M0.D {
    public int a;
    public int b;
    public long c;
    public long d = r.c();
    public long e = n1.n.b.b();

    public static abstract class a implements n1.d {
        public boolean a;

        public static /* synthetic */ void A0(a aVar, q qVar, int i, int i2, float f, Qa.l lVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                lVar = r.d();
            }
            aVar.x0(qVar, i, i2, f2, lVar);
        }

        public static /* synthetic */ void D0(a aVar, q qVar, long j, float f, Qa.l lVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                lVar = r.d();
            }
            aVar.B0(qVar, j, f2, lVar);
        }

        public static /* synthetic */ void E0(a aVar, q qVar, long j, y0.c cVar, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            aVar.C0(qVar, j, cVar, f);
        }

        public static /* synthetic */ void P(a aVar, q qVar, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            aVar.K(qVar, i, i2, f);
        }

        public static /* synthetic */ void U(a aVar, q qVar, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            aVar.T(qVar, j, f);
        }

        public static /* synthetic */ void Z(a aVar, q qVar, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            aVar.W(qVar, i, i2, f);
        }

        public static /* synthetic */ void c0(a aVar, q qVar, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            aVar.b0(qVar, j, f);
        }

        public static final /* synthetic */ n1.t g(a aVar) {
            return aVar.z();
        }

        public static final /* synthetic */ int j(a aVar) {
            return aVar.B();
        }

        public static /* synthetic */ void l0(a aVar, q qVar, int i, int i2, float f, Qa.l lVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                lVar = r.d();
            }
            aVar.g0(qVar, i, i2, f2, lVar);
        }

        public static final /* synthetic */ void p(a aVar, q qVar) {
            aVar.J(qVar);
        }

        public static /* synthetic */ void v0(a aVar, q qVar, long j, float f, Qa.l lVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                lVar = r.d();
            }
            aVar.p0(qVar, j, f2, lVar);
        }

        public static /* synthetic */ void w0(a aVar, q qVar, long j, y0.c cVar, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            aVar.q0(qVar, j, cVar, f);
        }

        public abstract int B();

        public final void B0(q qVar, long j, float f, Qa.l lVar) {
            p(this, qVar);
            q.K0(qVar, n1.n.o(j, q.J0(qVar)), f, lVar);
        }

        public final void C0(q qVar, long j, y0.c cVar, float f) {
            p(this, qVar);
            q.L0(qVar, n1.n.o(j, q.J0(qVar)), f, cVar);
        }

        public final void F0(Qa.l lVar) {
            this.a = true;
            lVar.invoke(this);
            this.a = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void J(q qVar) {
            if (qVar instanceof Z) {
                ((Z) qVar).c0(this.a);
            }
        }

        public final void K(q qVar, int i, int i2, float f) {
            long f2 = n1.n.f((i2 & 4294967295L) | (i << 32));
            p(this, qVar);
            q.K0(qVar, n1.n.o(f2, q.J0(qVar)), f, null);
        }

        public final void T(q qVar, long j, float f) {
            p(this, qVar);
            q.K0(qVar, n1.n.o(j, q.J0(qVar)), f, null);
        }

        public final void W(q qVar, int i, int i2, float f) {
            long f2 = n1.n.f((i << 32) | (i2 & 4294967295L));
            if (g(this) == n1.t.a || j(this) == 0) {
                p(this, qVar);
                q.K0(qVar, n1.n.o(f2, q.J0(qVar)), f, null);
            } else {
                long f3 = n1.n.f((((j(this) - qVar.W0()) - n1.n.k(f2)) << 32) | (n1.n.l(f2) & 4294967295L));
                p(this, qVar);
                q.K0(qVar, n1.n.o(f3, q.J0(qVar)), f, null);
            }
        }

        public final void b0(q qVar, long j, float f) {
            if (g(this) == n1.t.a || j(this) == 0) {
                p(this, qVar);
                q.K0(qVar, n1.n.o(j, q.J0(qVar)), f, null);
                return;
            }
            long f2 = n1.n.f((n1.n.l(j) & 4294967295L) | (((j(this) - qVar.W0()) - n1.n.k(j)) << 32));
            p(this, qVar);
            q.K0(qVar, n1.n.o(f2, q.J0(qVar)), f, null);
        }

        public final void g0(q qVar, int i, int i2, float f, Qa.l lVar) {
            long f2 = n1.n.f((i << 32) | (i2 & 4294967295L));
            if (g(this) == n1.t.a || j(this) == 0) {
                p(this, qVar);
                q.K0(qVar, n1.n.o(f2, q.J0(qVar)), f, lVar);
            } else {
                long f3 = n1.n.f((((j(this) - qVar.W0()) - n1.n.k(f2)) << 32) | (n1.n.l(f2) & 4294967295L));
                p(this, qVar);
                q.K0(qVar, n1.n.o(f3, q.J0(qVar)), f, lVar);
            }
        }

        public final void p0(q qVar, long j, float f, Qa.l lVar) {
            if (g(this) == n1.t.a || j(this) == 0) {
                p(this, qVar);
                q.K0(qVar, n1.n.o(j, q.J0(qVar)), f, lVar);
                return;
            }
            long f2 = n1.n.f((n1.n.l(j) & 4294967295L) | (((j(this) - qVar.W0()) - n1.n.k(j)) << 32));
            p(this, qVar);
            q.K0(qVar, n1.n.o(f2, q.J0(qVar)), f, lVar);
        }

        public float q(v vVar, float f) {
            return f;
        }

        public final void q0(q qVar, long j, y0.c cVar, float f) {
            if (g(this) == n1.t.a || j(this) == 0) {
                p(this, qVar);
                q.L0(qVar, n1.n.o(j, q.J0(qVar)), f, cVar);
                return;
            }
            long f2 = n1.n.f((n1.n.l(j) & 4294967295L) | (((j(this) - qVar.W0()) - n1.n.k(j)) << 32));
            p(this, qVar);
            q.L0(qVar, n1.n.o(f2, q.J0(qVar)), f, cVar);
        }

        public final void x0(q qVar, int i, int i2, float f, Qa.l lVar) {
            long f2 = n1.n.f((i2 & 4294967295L) | (i << 32));
            p(this, qVar);
            q.K0(qVar, n1.n.o(f2, q.J0(qVar)), f, lVar);
        }

        public abstract n1.t z();
    }

    public q() {
        long j = 0;
        this.c = n1.r.c((j & 4294967295L) | (j << 32));
    }

    public static final /* synthetic */ long J0(q qVar) {
        return qVar.e;
    }

    public static final /* synthetic */ void K0(q qVar, long j, float f, Qa.l lVar) {
        qVar.Z0(j, f, lVar);
    }

    public static final /* synthetic */ void L0(q qVar, long j, float f, y0.c cVar) {
        qVar.d1(j, f, cVar);
    }

    public final long M0() {
        return this.e;
    }

    public final int P0() {
        return this.b;
    }

    public int R0() {
        return (int) (this.c & 4294967295L);
    }

    public final long T0() {
        return this.c;
    }

    public int U0() {
        return (int) (this.c >> 32);
    }

    public final long V0() {
        return this.d;
    }

    public final int W0() {
        return this.a;
    }

    public final void X0() {
        this.a = Wa.n.m((int) (this.c >> 32), n1.b.n(this.d), n1.b.l(this.d));
        this.b = Wa.n.m((int) (this.c & 4294967295L), n1.b.m(this.d), n1.b.k(this.d));
        int i = this.a;
        long j = this.c;
        this.e = n1.n.f((((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void Z0(long j, float f, Qa.l lVar);

    public void d1(long j, float f, y0.c cVar) {
        Z0(j, f, null);
    }

    public final void g1(long j) {
        if (n1.r.e(this.c, j)) {
            return;
        }
        this.c = j;
        X0();
    }

    public final void n1(long j) {
        if (n1.b.f(this.d, j)) {
            return;
        }
        this.d = j;
        X0();
    }
}

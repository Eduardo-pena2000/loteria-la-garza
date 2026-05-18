package T2;

import T2.X0;
import U2.x1;
import g3.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class n implements W0, X0 {
    public final int b;
    public Y0 d;
    public int e;
    public x1 f;
    public P2.c g;
    public int h;
    public g3.P i;
    public M2.q[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public X0.a q;
    public final Object a = new Object();
    public final u0 c = new u0();
    public long m = Long.MIN_VALUE;
    public M2.G p = M2.G.a;

    public n(int i) {
        this.b = i;
    }

    public final void A(M2.q[] qVarArr, g3.P p, long j, long j2, w.b bVar) {
        P2.a.f(!this.n);
        this.i = p;
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = qVarArr;
        this.k = j2;
        k0(qVarArr, j, j2, bVar);
    }

    public final void E(X0.a aVar) {
        synchronized (this.a) {
            this.q = aVar;
        }
    }

    public final void J(int i, x1 x1Var, P2.c cVar) {
        this.e = i;
        this.f = x1Var;
        this.g = cVar;
        d0();
    }

    public final void L(Y0 y0, M2.q[] qVarArr, g3.P p, long j, boolean z, boolean z2, long j2, long j3, w.b bVar) {
        P2.a.f(this.h == 0);
        this.d = y0;
        this.h = 1;
        c0(z, z2);
        A(qVarArr, p, j2, j3, bVar);
        n0(j2, z);
    }

    public int M() {
        return 0;
    }

    public final long N() {
        return this.m;
    }

    public final void O(long j) {
        n0(j, false);
    }

    public y0 P() {
        return null;
    }

    public final u R(Throwable th, M2.q qVar, int i) {
        return S(th, qVar, false, i);
    }

    public final u S(Throwable th, M2.q qVar, boolean z, int i) {
        int i2;
        if (qVar == null || this.o) {
            i2 = 4;
        } else {
            this.o = true;
            try {
                i2 = X0.Q(a(qVar));
            } catch (u unused) {
            } finally {
                this.o = false;
            }
        }
        return u.b(th, getName(), W(), qVar, i2, z, i);
    }

    public final P2.c T() {
        return (P2.c) P2.a.e(this.g);
    }

    public final Y0 U() {
        return (Y0) P2.a.e(this.d);
    }

    public final u0 V() {
        this.c.a();
        return this.c;
    }

    public final int W() {
        return this.e;
    }

    public final long X() {
        return this.l;
    }

    public final x1 Y() {
        return (x1) P2.a.e(this.f);
    }

    public final M2.q[] Z() {
        return (M2.q[]) P2.a.e(this.j);
    }

    public final boolean a0() {
        return k() ? this.n : ((g3.P) P2.a.e(this.i)).isReady();
    }

    public abstract void b0();

    public abstract void e0(long j, boolean z);

    public final void f() {
        P2.a.f(this.h == 1);
        this.c.a();
        this.h = 0;
        this.i = null;
        this.j = null;
        this.n = false;
        b0();
    }

    public final int g() {
        return this.b;
    }

    public final void g0() {
        X0.a aVar;
        synchronized (this.a) {
            aVar = this.q;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final int getState() {
        return this.h;
    }

    public final g3.P i() {
        return this.i;
    }

    public final void j() {
        synchronized (this.a) {
            this.q = null;
        }
    }

    public final boolean k() {
        return this.m == Long.MIN_VALUE;
    }

    public final int m0(u0 u0Var, S2.f fVar, int i) {
        int e = ((g3.P) P2.a.e(this.i)).e(u0Var, fVar, i);
        if (e == -4) {
            if (fVar.i()) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j = fVar.f + this.k;
            fVar.f = j;
            this.m = Math.max(this.m, j);
        } else if (e == -5) {
            M2.q qVar = (M2.q) P2.a.e(u0Var.b);
            if (qVar.s != Long.MAX_VALUE) {
                u0Var.b = qVar.a().s0(qVar.s + this.k).K();
            }
        }
        return e;
    }

    public final void n(M2.G g) {
        if (P2.K.c(this.p, g)) {
            return;
        }
        this.p = g;
        l0(g);
    }

    public final void n0(long j, boolean z) {
        this.n = false;
        this.l = j;
        this.m = j;
        e0(j, z);
    }

    public final void o() {
        this.n = true;
    }

    public int o0(long j) {
        return ((g3.P) P2.a.e(this.i)).n(j - this.k);
    }

    public final void release() {
        P2.a.f(this.h == 0);
        f0();
    }

    public final void reset() {
        P2.a.f(this.h == 0);
        this.c.a();
        h0();
    }

    public final void start() {
        P2.a.f(this.h == 1);
        this.h = 2;
        i0();
    }

    public final void stop() {
        P2.a.f(this.h == 2);
        this.h = 1;
        j0();
    }

    public final void w() {
        ((g3.P) P2.a.e(this.i)).a();
    }

    public final boolean z() {
        return this.n;
    }

    public final X0 G() {
        return this;
    }

    public void d0() {
    }

    public void f0() {
    }

    public void h0() {
    }

    public void i0() {
    }

    public void j0() {
    }

    public void l0(M2.G g) {
    }

    public void c0(boolean z, boolean z2) {
    }

    public void v(int i, Object obj) {
    }

    public void k0(M2.q[] qVarArr, long j, long j2, w.b bVar) {
    }
}

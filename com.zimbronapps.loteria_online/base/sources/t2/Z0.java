package T2;

import T2.x0;
import g3.w;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z0 {
    public final g3.v a;
    public final Object b;
    public final g3.P[] c;
    public boolean d;
    public boolean e;
    public A0 f;
    public boolean g;
    public final boolean[] h;
    public final X0[] i;
    public final j3.C j;
    public final R0 k;
    public z0 l;
    public g3.Y m;
    public j3.D n;
    public long o;

    public interface a {
        z0 a(A0 a0, long j);
    }

    public z0(X0[] x0Arr, long j, j3.C c, k3.b bVar, R0 r0, A0 a0, j3.D d) {
        this.i = x0Arr;
        this.o = j;
        this.j = c;
        this.k = r0;
        w.b bVar2 = a0.a;
        this.b = bVar2.a;
        this.f = a0;
        this.m = g3.Y.d;
        this.n = d;
        this.c = new g3.P[x0Arr.length];
        this.h = new boolean[x0Arr.length];
        this.a = f(bVar2, r0, bVar, a0.b, a0.d);
    }

    public static g3.v f(w.b bVar, R0 r0, k3.b bVar2, long j, long j2) {
        g3.v h = r0.h(bVar, bVar2, j);
        return j2 != -9223372036854775807L ? new g3.e(h, true, 0L, j2) : h;
    }

    public static void w(R0 r0, g3.v vVar) {
        try {
            if (vVar instanceof g3.e) {
                r0.A(((g3.e) vVar).a);
            } else {
                r0.A(vVar);
            }
        } catch (RuntimeException e) {
            P2.o.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public long A(long j) {
        return j - m();
    }

    public long B(long j) {
        return j + m();
    }

    public void C() {
        g3.v vVar = this.a;
        if (vVar instanceof g3.e) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((g3.e) vVar).w(0L, j);
        }
    }

    public long a(j3.D d, long j, boolean z) {
        return b(d, j, z, new boolean[this.i.length]);
    }

    public long b(j3.D d, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= d.a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !d.b(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        h(this.c);
        g();
        this.n = d;
        i();
        long j2 = this.a.j(d.c, this.h, this.c, zArr, j);
        c(this.c);
        this.e = false;
        int i2 = 0;
        while (true) {
            g3.P[] pArr = this.c;
            if (i2 >= pArr.length) {
                return j2;
            }
            if (pArr[i2] != null) {
                P2.a.f(d.c(i2));
                if (this.i[i2].g() != -2) {
                    this.e = true;
                }
            } else {
                P2.a.f(d.c[i2] == null);
            }
            i2++;
        }
    }

    public final void c(g3.P[] pArr) {
        int i = 0;
        while (true) {
            X0[] x0Arr = this.i;
            if (i >= x0Arr.length) {
                return;
            }
            if (x0Arr[i].g() == -2 && this.n.c(i)) {
                pArr[i] = new g3.o();
            }
            i++;
        }
    }

    public boolean d(A0 a0) {
        if (C0.d(this.f.e, a0.e)) {
            A0 a02 = this.f;
            if (a02.b == a0.b && a02.a.equals(a0.a)) {
                return true;
            }
        }
        return false;
    }

    public void e(long j, float f, long j2) {
        P2.a.f(t());
        this.a.d(new x0.b().f(A(j)).g(f).e(j2).d());
    }

    public final void g() {
        if (!t()) {
            return;
        }
        int i = 0;
        while (true) {
            j3.D d = this.n;
            if (i >= d.a) {
                return;
            }
            boolean c = d.c(i);
            j3.x xVar = this.n.c[i];
            if (c && xVar != null) {
                xVar.f();
            }
            i++;
        }
    }

    public final void h(g3.P[] pArr) {
        int i = 0;
        while (true) {
            X0[] x0Arr = this.i;
            if (i >= x0Arr.length) {
                return;
            }
            if (x0Arr[i].g() == -2) {
                pArr[i] = null;
            }
            i++;
        }
    }

    public final void i() {
        if (!t()) {
            return;
        }
        int i = 0;
        while (true) {
            j3.D d = this.n;
            if (i >= d.a) {
                return;
            }
            boolean c = d.c(i);
            j3.x xVar = this.n.c[i];
            if (c && xVar != null) {
                xVar.m();
            }
            i++;
        }
    }

    public long j() {
        if (!this.d) {
            return this.f.b;
        }
        long f = this.e ? this.a.f() : Long.MIN_VALUE;
        return f == Long.MIN_VALUE ? this.f.e : f;
    }

    public z0 k() {
        return this.l;
    }

    public long l() {
        if (this.d) {
            return this.a.b();
        }
        return 0L;
    }

    public long m() {
        return this.o;
    }

    public long n() {
        return this.f.b + this.o;
    }

    public g3.Y o() {
        return this.m;
    }

    public j3.D p() {
        return this.n;
    }

    public void q(float f, M2.G g) {
        this.d = true;
        this.m = this.a.t();
        j3.D x = x(f, g);
        A0 a0 = this.f;
        long j = a0.b;
        long j2 = a0.e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a2 = a(x, j, false);
        long j3 = this.o;
        A0 a02 = this.f;
        this.o = j3 + (a02.b - a2);
        this.f = a02.b(a2);
    }

    public boolean r() {
        try {
            if (this.d) {
                for (g3.P p : this.c) {
                    if (p != null) {
                        p.a();
                    }
                }
            } else {
                this.a.q();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        return this.d && (!this.e || this.a.f() == Long.MIN_VALUE);
    }

    public final boolean t() {
        return this.l == null;
    }

    public void u(long j) {
        P2.a.f(t());
        if (this.d) {
            this.a.h(A(j));
        }
    }

    public void v() {
        g();
        w(this.k, this.a);
    }

    public j3.D x(float f, M2.G g) {
        j3.D k = this.j.k(this.i, o(), this.f.a, g);
        for (int i = 0; i < k.a; i++) {
            if (k.c(i)) {
                if (k.c[i] == null && this.i[i].g() != -2) {
                    r3 = false;
                }
                P2.a.f(r3);
            } else {
                P2.a.f(k.c[i] == null);
            }
        }
        for (j3.x xVar : k.c) {
            if (xVar != null) {
                xVar.g(f);
            }
        }
        return k;
    }

    public void y(z0 z0Var) {
        if (z0Var == this.l) {
            return;
        }
        g();
        this.l = z0Var;
        i();
    }

    public void z(long j) {
        this.o = j;
    }
}

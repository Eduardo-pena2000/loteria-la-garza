package w3;

import I3.m;
import L3.s;
import M2.q;
import M2.x;
import P2.z;
import o3.I;
import o3.J;
import o3.p;
import o3.q;
import o3.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements p {
    public r b;
    public int c;
    public int d;
    public int e;
    public D3.a g;
    public q h;
    public d i;
    public m j;
    public final z a = new z(6);
    public long f = -1;

    public static D3.a h(String str, long j) {
        c a;
        if (j == -1 || (a = f.a(str)) == null) {
            return null;
        }
        return a.a(j);
    }

    private void m(q qVar) {
        String A;
        if (this.d == 65505) {
            z zVar = new z(this.e);
            qVar.readFully(zVar.e(), 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(zVar.A()) && (A = zVar.A()) != null) {
                D3.a h = h(A, qVar.a());
                this.g = h;
                if (h != null) {
                    this.f = h.d;
                }
            }
        } else {
            qVar.m(this.e);
        }
        this.c = 0;
    }

    public void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ((m) P2.a.e(this.j)).a(j, j2);
        }
    }

    public void b(r rVar) {
        this.b = rVar;
    }

    public final void c(q qVar) {
        this.a.P(2);
        qVar.p(this.a.e(), 0, 2);
        qVar.j(this.a.M() - 2);
    }

    public boolean d(q qVar) {
        if (k(qVar) != 65496) {
            return false;
        }
        int k = k(qVar);
        this.d = k;
        if (k == 65504) {
            c(qVar);
            this.d = k(qVar);
        }
        if (this.d != 65505) {
            return false;
        }
        qVar.j(2);
        this.a.P(6);
        qVar.p(this.a.e(), 0, 6);
        return this.a.I() == 1165519206 && this.a.M() == 0;
    }

    public int e(q qVar, I i) {
        int i2 = this.c;
        if (i2 == 0) {
            l(qVar);
            return 0;
        }
        if (i2 == 1) {
            n(qVar);
            return 0;
        }
        if (i2 == 2) {
            m(qVar);
            return 0;
        }
        if (i2 == 4) {
            long b = qVar.b();
            long j = this.f;
            if (b != j) {
                i.a = j;
                return 1;
            }
            o(qVar);
            return 0;
        }
        if (i2 != 5) {
            if (i2 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.i == null || qVar != this.h) {
            this.h = qVar;
            this.i = new d(qVar, this.f);
        }
        int e = ((m) P2.a.e(this.j)).e(this.i, i);
        if (e == 1) {
            i.a += this.f;
        }
        return e;
    }

    public final void f() {
        ((r) P2.a.e(this.b)).s();
        this.b.n(new J.b(-9223372036854775807L));
        this.c = 6;
    }

    public final void i(D3.a aVar) {
        ((r) P2.a.e(this.b)).e(1024, 4).b(new q.b().Q("image/jpeg").h0(new x(aVar)).K());
    }

    public final int k(o3.q qVar) {
        this.a.P(2);
        qVar.p(this.a.e(), 0, 2);
        return this.a.M();
    }

    public final void l(o3.q qVar) {
        this.a.P(2);
        qVar.readFully(this.a.e(), 0, 2);
        int M = this.a.M();
        this.d = M;
        if (M == 65498) {
            if (this.f != -1) {
                this.c = 4;
                return;
            } else {
                f();
                return;
            }
        }
        if ((M < 65488 || M > 65497) && M != 65281) {
            this.c = 1;
        }
    }

    public final void n(o3.q qVar) {
        this.a.P(2);
        qVar.readFully(this.a.e(), 0, 2);
        this.e = this.a.M() - 2;
        this.c = 2;
    }

    public final void o(o3.q qVar) {
        if (!qVar.d(this.a.e(), 0, 1, true)) {
            f();
            return;
        }
        qVar.f();
        if (this.j == null) {
            this.j = new m(s.a.a, 8);
        }
        d dVar = new d(qVar, this.f);
        this.i = dVar;
        if (!this.j.d(dVar)) {
            f();
        } else {
            this.j.b(new e(this.f, (r) P2.a.e(this.b)));
            p();
        }
    }

    public final void p() {
        i((D3.a) P2.a.e(this.g));
        this.c = 5;
    }

    public void release() {
        m mVar = this.j;
        if (mVar != null) {
            mVar.release();
        }
    }
}

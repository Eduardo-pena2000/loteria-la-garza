package androidx.compose.ui.graphics;

import n1.t;
import u0.l;
import v0.E1;
import v0.a1;
import v0.i1;
import v0.r0;
import v0.t1;
import v0.u1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements g {
    public int a;
    public float e;
    public float f;
    public float g;
    public float j;
    public float k;
    public float l;
    public boolean p;
    public u1 u;
    public d v;
    public i1 x;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public long h = a1.a();
    public long i = a1.a();
    public float m = 8.0f;
    public long n = j.b.a();
    public E1 o = t1.a();
    public int q = e.b.a();
    public long r = l.b.a();
    public n1.d s = n1.f.b(1.0f, 0.0f, 2, null);
    public t t = t.a;
    public int w = c.b.B();

    public int B() {
        return this.q;
    }

    public float C() {
        return this.f;
    }

    public void D(u1 u1Var) {
        if (kotlin.jvm.internal.t.c(this.u, u1Var)) {
            return;
        }
        this.a |= 131072;
        this.u = u1Var;
    }

    public float E() {
        return this.e;
    }

    public float F() {
        return this.j;
    }

    public void G(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public float H() {
        return this.c;
    }

    public final n1.d J() {
        return this.s;
    }

    public final t K() {
        return this.t;
    }

    public final int P() {
        return this.a;
    }

    public final i1 T() {
        return this.x;
    }

    public u1 U() {
        return this.u;
    }

    public void V(int i) {
        if (e.g(this.q, i)) {
            return;
        }
        this.a |= 32768;
        this.q = i;
    }

    public float W() {
        return this.g;
    }

    public E1 Z() {
        return this.o;
    }

    public void b(int i) {
        if (c.G(this.w, i)) {
            return;
        }
        this.a |= 524288;
        this.w = i;
    }

    public long b0() {
        return this.i;
    }

    public void c(d dVar) {
        if (kotlin.jvm.internal.t.c(this.v, dVar)) {
            return;
        }
        this.a |= 262144;
        this.v = dVar;
    }

    public final void c0() {
        l(1.0f);
        y(1.0f);
        d(1.0f);
        G(0.0f);
        f(0.0f);
        v(0.0f);
        k(a1.a());
        o(a1.a());
        s(0.0f);
        t(0.0f);
        w(0.0f);
        r(8.0f);
        t0(j.b.a());
        i1(t1.a());
        n(false);
        D(null);
        c(null);
        b(c.b.B());
        V(e.b.a());
        p0(l.b.a());
        this.x = null;
        this.a = 0;
    }

    public void d(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public long e() {
        return this.r;
    }

    public float e1() {
        return this.s.e1();
    }

    public void f(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    public float g() {
        return this.d;
    }

    public final void g0(n1.d dVar) {
        this.s = dVar;
    }

    public float getDensity() {
        return this.s.getDensity();
    }

    public float h() {
        return this.k;
    }

    public float i() {
        return this.l;
    }

    public void i1(E1 e1) {
        if (kotlin.jvm.internal.t.c(this.o, e1)) {
            return;
        }
        this.a |= 8192;
        this.o = e1;
    }

    public long j() {
        return this.h;
    }

    public void k(long j) {
        if (r0.s(this.h, j)) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    public void l(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void l0(t tVar) {
        this.t = tVar;
    }

    public float m() {
        return this.m;
    }

    public void n(boolean z) {
        if (this.p != z) {
            this.a |= 16384;
            this.p = z;
        }
    }

    public void o(long j) {
        if (r0.s(this.i, j)) {
            return;
        }
        this.a |= 128;
        this.i = j;
    }

    public int p() {
        return this.w;
    }

    public void p0(long j) {
        this.r = j;
    }

    public boolean q() {
        return this.p;
    }

    public final void q0() {
        this.x = Z().createOutline-Pq9zytI(e(), this.t, this.s);
    }

    public void r(float f) {
        if (this.m == f) {
            return;
        }
        this.a |= 2048;
        this.m = f;
    }

    public long r0() {
        return this.n;
    }

    public void s(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= 256;
        this.j = f;
    }

    public void t(float f) {
        if (this.k == f) {
            return;
        }
        this.a |= 512;
        this.k = f;
    }

    public void t0(long j) {
        if (j.e(this.n, j)) {
            return;
        }
        this.a |= 4096;
        this.n = j;
    }

    public float u() {
        return this.b;
    }

    public void v(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    public void w(float f) {
        if (this.l == f) {
            return;
        }
        this.a |= 1024;
        this.l = f;
    }

    public void y(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public d z() {
        return this.v;
    }
}

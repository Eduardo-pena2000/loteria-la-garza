package c0;

import Qa.l;
import Qa.p;
import b0.D1;
import b0.E1;
import b0.f1;
import b0.g2;
import b0.i0;
import b0.s;
import b0.w;
import b0.w1;
import b0.x;
import b0.x0;
import b0.y;
import b0.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final a m = new a(null);
    public static final int n = 8;
    public final s a;
    public c0.a b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final i0 d = new i0();
    public boolean e = true;
    public final ArrayList h = g2.c(null, 1, null);
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public b(s sVar, c0.a aVar) {
        this.a = sVar;
        this.b = aVar;
    }

    public static /* synthetic */ void F(b bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bVar.E(z);
    }

    public static /* synthetic */ void J(b bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bVar.I(z);
    }

    public final void A() {
        H();
        if (g2.f(this.h)) {
            g2.i(this.h);
        } else {
            this.g++;
        }
    }

    public final void B() {
        C();
    }

    public final void C() {
        int i = this.g;
        if (i > 0) {
            this.b.J(i);
            this.g = 0;
        }
        if (g2.f(this.h)) {
            this.b.k(g2.k(this.h));
            g2.a(this.h);
        }
    }

    public final void D() {
        J(this, false, 1, null);
        L();
    }

    public final void E(boolean z) {
        I(z);
    }

    public final void G(int i, int i2, int i3) {
        B();
        this.b.v(i, i2, i3);
    }

    public final void H() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                K(i2, i);
                this.i = -1;
            } else {
                G(this.k, this.j, i);
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void I(boolean z) {
        int u = z ? r().u() : r().k();
        int i = u - this.f;
        if (!(i >= 0)) {
            w.t("Tried to seek backward");
        }
        if (i > 0) {
            this.b.e(i);
            this.f = u;
        }
    }

    public final void K(int i, int i2) {
        B();
        this.b.z(i, i2);
    }

    public final void L() {
        D1 r;
        int u;
        if (r().x() <= 0 || this.d.f(-2) == (u = (r = r()).u())) {
            return;
        }
        m();
        if (u > 0) {
            b0.b a2 = r.a(u);
            this.d.h(u);
            l(a2);
        }
    }

    public final void M() {
        C();
        if (this.c) {
            W();
            k();
        }
    }

    public final void N(w1 w1Var) {
        this.b.w(w1Var);
    }

    public final void O(f1 f1Var) {
        this.b.x(f1Var);
    }

    public final void P() {
        D();
        this.b.y();
        this.f += r().p();
    }

    public final void Q(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                w.t("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            H();
            this.i = i;
            this.l = i2;
        }
    }

    public final void R() {
        this.b.A();
    }

    public final void S() {
        this.c = false;
        this.d.a();
        this.f = 0;
        this.e = true;
        this.g = 0;
        g2.a(this.h);
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = 0;
    }

    public final void T(c0.a aVar) {
        this.b = aVar;
    }

    public final void U(boolean z) {
        this.e = z;
    }

    public final void V(Qa.a aVar) {
        this.b.B(aVar);
    }

    public final void W() {
        this.b.C();
    }

    public final void X(f1 f1Var) {
        this.b.D(f1Var);
    }

    public final void Y(int i) {
        if (i > 0) {
            D();
            this.b.E(i);
        }
    }

    public final void Z(Object obj, b0.b bVar, int i) {
        this.b.F(obj, bVar, i);
    }

    public final void a(b0.b bVar, Object obj) {
        this.b.f(bVar, obj);
    }

    public final void a0(Object obj) {
        F(this, false, 1, null);
        this.b.G(obj);
    }

    public final void b(List list, j0.k kVar) {
        this.b.g(list, kVar);
    }

    public final void b0(Object obj, p pVar) {
        B();
        this.b.H(obj, pVar);
    }

    public final void c(x0 x0Var, y yVar, y0 y0Var, y0 y0Var2) {
        this.b.h(x0Var, yVar, y0Var, y0Var2);
    }

    public final void c0(Object obj, int i) {
        E(true);
        this.b.I(obj, i);
    }

    public final void d() {
        F(this, false, 1, null);
        this.b.i();
    }

    public final void d0(Object obj) {
        B();
        this.b.K(obj);
    }

    public final void e(j0.k kVar, b0.b bVar) {
        C();
        this.b.j(kVar, bVar);
    }

    public final void f(l lVar, x xVar) {
        this.b.l(lVar, xVar);
    }

    public final void g() {
        int u = r().u();
        if (!(this.d.f(-1) <= u)) {
            w.t("Missed recording an endGroup");
        }
        if (this.d.f(-1) == u) {
            F(this, false, 1, null);
            this.d.g();
            this.b.m();
        }
    }

    public final void h() {
        this.b.n();
        this.f = 0;
    }

    public final void i() {
        H();
    }

    public final void j(f1 f1Var) {
        this.b.o(f1Var);
    }

    public final void k() {
        if (this.c) {
            F(this, false, 1, null);
            F(this, false, 1, null);
            this.b.m();
            this.c = false;
        }
    }

    public final void l(b0.b bVar) {
        F(this, false, 1, null);
        this.b.p(bVar);
        this.c = true;
    }

    public final void m() {
        if (this.c || !this.e) {
            return;
        }
        F(this, false, 1, null);
        this.b.q();
        this.c = true;
    }

    public final void n() {
        C();
        if (this.d.b == 0) {
            return;
        }
        w.t("Missed recording an endGroup()");
    }

    public final c0.a o() {
        return this.b;
    }

    public final boolean p() {
        return this.e;
    }

    public final boolean q() {
        return r().u() - this.f < 0;
    }

    public final D1 r() {
        return this.a.M0();
    }

    public final void s(c0.a aVar, j0.k kVar) {
        this.b.r(aVar, kVar);
    }

    public final void t(b0.b bVar, E1 e1) {
        C();
        D();
        H();
        this.b.s(bVar, e1);
    }

    public final void u(b0.b bVar, E1 e1, c cVar) {
        C();
        D();
        H();
        this.b.t(bVar, e1, cVar);
    }

    public final void v(int i) {
        D();
        this.b.u(i);
    }

    public final void w(Object obj) {
        H();
        g2.j(this.h, obj);
    }

    public final void x(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.l;
            if (i4 > 0 && this.j == i - i4 && this.k == i2 - i4) {
                this.l = i4 + i3;
                return;
            }
            H();
            this.j = i;
            this.k = i2;
            this.l = i3;
        }
    }

    public final void y(int i) {
        this.f += i - r().k();
    }

    public final void z(int i) {
        this.f = i;
    }
}

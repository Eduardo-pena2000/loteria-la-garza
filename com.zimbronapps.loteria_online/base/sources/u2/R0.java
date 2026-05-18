package U2;

import M2.C;
import M2.G;
import P2.n;
import U2.b;
import V2.y;
import android.os.Looper;
import android.util.SparseArray;
import g3.w;
import java.io.IOException;
import java.util.List;
import t7.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class r0 implements U2.a {
    public final P2.c a;
    public final G.b b;
    public final G.c c;
    public final a d;
    public final SparseArray e;
    public P2.n f;
    public M2.C g;
    public P2.k h;
    public boolean i;

    public static final class a {
        public final G.b a;
        public t7.r b = t7.r.s();
        public t7.s c = t7.s.o();
        public w.b d;
        public w.b e;
        public w.b f;

        public a(G.b bVar) {
            this.a = bVar;
        }

        public static /* synthetic */ t7.r a(a aVar) {
            return aVar.b;
        }

        public static w.b c(M2.C c, t7.r rVar, w.b bVar, G.b bVar2) {
            M2.G v = c.v();
            int D = c.D();
            Object m = v.q() ? null : v.m(D);
            int d = (c.h() || v.q()) ? -1 : v.f(D, bVar2).d(P2.K.K0(c.getCurrentPosition()) - bVar2.n());
            for (int i = 0; i < rVar.size(); i++) {
                w.b bVar3 = (w.b) rVar.get(i);
                if (i(bVar3, m, c.h(), c.r(), c.F(), d)) {
                    return bVar3;
                }
            }
            if (rVar.isEmpty() && bVar != null) {
                if (i(bVar, m, c.h(), c.r(), c.F(), d)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean i(w.b bVar, Object obj, boolean z, int i, int i2, int i3) {
            if (bVar.a.equals(obj)) {
                return (z && bVar.b == i && bVar.c == i2) || (!z && bVar.b == -1 && bVar.e == i3);
            }
            return false;
        }

        public final void b(s.a aVar, w.b bVar, M2.G g) {
            if (bVar == null) {
                return;
            }
            if (g.b(bVar.a) != -1) {
                aVar.f(bVar, g);
                return;
            }
            M2.G g2 = (M2.G) this.c.get(bVar);
            if (g2 != null) {
                aVar.f(bVar, g2);
            }
        }

        public w.b d() {
            return this.d;
        }

        public w.b e() {
            if (this.b.isEmpty()) {
                return null;
            }
            return (w.b) t7.u.d(this.b);
        }

        public M2.G f(w.b bVar) {
            return (M2.G) this.c.get(bVar);
        }

        public w.b g() {
            return this.e;
        }

        public w.b h() {
            return this.f;
        }

        public void j(M2.C c) {
            this.d = c(c, this.b, this.e, this.a);
        }

        public void k(List list, w.b bVar, M2.C c) {
            this.b = t7.r.n(list);
            if (!list.isEmpty()) {
                this.e = (w.b) list.get(0);
                this.f = (w.b) P2.a.e(bVar);
            }
            if (this.d == null) {
                this.d = c(c, this.b, this.e, this.a);
            }
            m(c.v());
        }

        public void l(M2.C c) {
            this.d = c(c, this.b, this.e, this.a);
            m(c.v());
        }

        public final void m(M2.G g) {
            s.a a = t7.s.a();
            if (this.b.isEmpty()) {
                b(a, this.e, g);
                if (!s7.k.a(this.f, this.e)) {
                    b(a, this.f, g);
                }
                if (!s7.k.a(this.d, this.e) && !s7.k.a(this.d, this.f)) {
                    b(a, this.d, g);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    b(a, (w.b) this.b.get(i), g);
                }
                if (!this.b.contains(this.d)) {
                    b(a, this.d, g);
                }
            }
            this.c = a.c();
        }
    }

    public r0(P2.c cVar) {
        this.a = (P2.c) P2.a.e(cVar);
        this.f = new P2.n(P2.K.U(), cVar, new z());
        G.b bVar = new G.b();
        this.b = bVar;
        this.c = new G.c();
        this.d = new a(bVar);
        this.e = new SparseArray();
    }

    public static /* synthetic */ void A0(b.a aVar, boolean z, b bVar) {
        K2(aVar, z, bVar);
    }

    public static /* synthetic */ void A1(b bVar, M2.p pVar) {
        O1(bVar, pVar);
    }

    public static /* synthetic */ void A2(b.a aVar, M2.B b, b bVar) {
        bVar.R(aVar, b);
    }

    public static /* synthetic */ void B0(b.a aVar, int i, b bVar) {
        C2(aVar, i, bVar);
    }

    public static /* synthetic */ void B1(b.a aVar, g3.r rVar, g3.u uVar, b bVar) {
        s2(aVar, rVar, uVar, bVar);
    }

    public static /* synthetic */ void B2(b.a aVar, int i, b bVar) {
        bVar.l(aVar, i);
    }

    public static /* synthetic */ void C0(b.a aVar, T2.o oVar, b bVar) {
        U2(aVar, oVar, bVar);
    }

    public static /* synthetic */ void C1(b.a aVar, int i, b bVar) {
        I2(aVar, i, bVar);
    }

    public static /* synthetic */ void C2(b.a aVar, int i, b bVar) {
        bVar.k0(aVar, i);
    }

    public static /* synthetic */ void D0(b.a aVar, T2.o oVar, b bVar) {
        T2(aVar, oVar, bVar);
    }

    public static /* synthetic */ void D1(b.a aVar, String str, b bVar) {
        S2(aVar, str, bVar);
    }

    public static /* synthetic */ void D2(b.a aVar, M2.A a2, b bVar) {
        bVar.o0(aVar, a2);
    }

    public static /* synthetic */ void E0(b.a aVar, int i, b bVar) {
        M2(aVar, i, bVar);
    }

    public static /* synthetic */ void E1(b.a aVar, int i, b bVar) {
        B2(aVar, i, bVar);
    }

    public static /* synthetic */ void E2(b.a aVar, M2.A a2, b bVar) {
        bVar.B(aVar, a2);
    }

    public static /* synthetic */ void F0(b.a aVar, M2.q qVar, T2.p pVar, b bVar) {
        W1(aVar, qVar, pVar, bVar);
    }

    public static /* synthetic */ void F1(b.a aVar, Exception exc, b bVar) {
        R1(aVar, exc, bVar);
    }

    public static /* synthetic */ void F2(b.a aVar, boolean z, int i, b bVar) {
        bVar.t0(aVar, z, i);
    }

    public static /* synthetic */ void G0(b.a aVar, g3.r rVar, g3.u uVar, b bVar) {
        t2(aVar, rVar, uVar, bVar);
    }

    public static /* synthetic */ void G2(b.a aVar, int i, C.e eVar, C.e eVar2, b bVar) {
        bVar.y(aVar, i);
        bVar.m0(aVar, eVar, eVar2, i);
    }

    public static /* synthetic */ void H0(b.a aVar, String str, b bVar) {
        T1(aVar, str, bVar);
    }

    public static /* synthetic */ void H2(b.a aVar, Object obj, long j, b bVar) {
        bVar.q(aVar, obj, j);
    }

    public static /* synthetic */ void I0(b.a aVar, M2.I i, b bVar) {
        N2(aVar, i, bVar);
    }

    public static /* synthetic */ void I2(b.a aVar, int i, b bVar) {
        bVar.d(aVar, i);
    }

    public static /* synthetic */ void J0(b.a aVar, g3.r rVar, g3.u uVar, b bVar) {
        v2(aVar, rVar, uVar, bVar);
    }

    public static /* synthetic */ void J2(b.a aVar, boolean z, b bVar) {
        bVar.n(aVar, z);
    }

    public static /* synthetic */ void K0(b.a aVar, Object obj, long j, b bVar) {
        H2(aVar, obj, j, bVar);
    }

    public static /* synthetic */ void K2(b.a aVar, boolean z, b bVar) {
        bVar.z(aVar, z);
    }

    public static /* synthetic */ void L0(b.a aVar, int i, boolean z, b bVar) {
        h2(aVar, i, z, bVar);
    }

    public static /* synthetic */ void L2(b.a aVar, int i, int i2, b bVar) {
        bVar.Y(aVar, i, i2);
    }

    public static /* synthetic */ void M0(b.a aVar, int i, long j, b bVar) {
        p2(aVar, i, j, bVar);
    }

    public static /* synthetic */ void M2(b.a aVar, int i, b bVar) {
        bVar.x(aVar, i);
    }

    public static /* synthetic */ void N0(b.a aVar, T2.o oVar, b bVar) {
        V1(aVar, oVar, bVar);
    }

    public static /* synthetic */ void N2(b.a aVar, M2.I i, b bVar) {
        bVar.G(aVar, i);
    }

    public static /* synthetic */ void O0(b.a aVar, b bVar) {
        k2(aVar, bVar);
    }

    public static /* synthetic */ void O2(b.a aVar, M2.J j, b bVar) {
        bVar.a(aVar, j);
    }

    public static /* synthetic */ void P0(b.a aVar, M2.u uVar, int i, b bVar) {
        w2(aVar, uVar, i, bVar);
    }

    public static /* synthetic */ void P1(b.a aVar, b bVar) {
        bVar.r(aVar);
    }

    public static /* synthetic */ void P2(b.a aVar, g3.u uVar, b bVar) {
        bVar.u(aVar, uVar);
    }

    public static /* synthetic */ void Q0(b.a aVar, O2.b bVar, b bVar2) {
        f2(aVar, bVar, bVar2);
    }

    public static /* synthetic */ void Q1(b.a aVar, M2.b bVar, b bVar2) {
        bVar2.J(aVar, bVar);
    }

    public static /* synthetic */ void Q2(b.a aVar, Exception exc, b bVar) {
        bVar.s(aVar, exc);
    }

    public static /* synthetic */ void R0(b.a aVar, M2.q qVar, T2.p pVar, b bVar) {
        W2(aVar, qVar, pVar, bVar);
    }

    public static /* synthetic */ void R1(b.a aVar, Exception exc, b bVar) {
        bVar.u0(aVar, exc);
    }

    public static /* synthetic */ void R2(b.a aVar, String str, long j, long j2, b bVar) {
        bVar.C(aVar, str, j);
        bVar.p0(aVar, str, j2, j);
    }

    public static /* synthetic */ void S0(b.a aVar, float f, b bVar) {
        Y2(aVar, f, bVar);
    }

    public static /* synthetic */ void S1(b.a aVar, String str, long j, long j2, b bVar) {
        bVar.v0(aVar, str, j);
        bVar.D(aVar, str, j2, j);
    }

    public static /* synthetic */ void S2(b.a aVar, String str, b bVar) {
        bVar.Q(aVar, str);
    }

    public static /* synthetic */ void T0(b.a aVar, boolean z, int i, b bVar) {
        F2(aVar, z, i, bVar);
    }

    public static /* synthetic */ void T1(b.a aVar, String str, b bVar) {
        bVar.g0(aVar, str);
    }

    public static /* synthetic */ void T2(b.a aVar, T2.o oVar, b bVar) {
        bVar.F(aVar, oVar);
    }

    public static /* synthetic */ void U0(r0 r0Var, M2.C c, b bVar, M2.p pVar) {
        r0Var.a3(c, bVar, pVar);
    }

    public static /* synthetic */ void U1(b.a aVar, T2.o oVar, b bVar) {
        bVar.M(aVar, oVar);
    }

    public static /* synthetic */ void U2(b.a aVar, T2.o oVar, b bVar) {
        bVar.V(aVar, oVar);
    }

    public static /* synthetic */ void V0(b.a aVar, b bVar) {
        l2(aVar, bVar);
    }

    public static /* synthetic */ void V1(b.a aVar, T2.o oVar, b bVar) {
        bVar.h(aVar, oVar);
    }

    public static /* synthetic */ void V2(b.a aVar, long j, int i, b bVar) {
        bVar.N(aVar, j, i);
    }

    public static /* synthetic */ void W0(b.a aVar, Exception exc, b bVar) {
        Q2(aVar, exc, bVar);
    }

    public static /* synthetic */ void W1(b.a aVar, M2.q qVar, T2.p pVar, b bVar) {
        bVar.f(aVar, qVar, pVar);
    }

    public static /* synthetic */ void W2(b.a aVar, M2.q qVar, T2.p pVar, b bVar) {
        bVar.m(aVar, qVar, pVar);
    }

    public static /* synthetic */ void X0(b.a aVar, boolean z, b bVar) {
        q2(aVar, z, bVar);
    }

    public static /* synthetic */ void X1(b.a aVar, long j, b bVar) {
        bVar.b0(aVar, j);
    }

    public static /* synthetic */ void X2(b.a aVar, M2.N n, b bVar) {
        bVar.b(aVar, n);
        bVar.g(aVar, n.a, n.b, n.c, n.d);
    }

    public static /* synthetic */ void Y0(b.a aVar, boolean z, b bVar) {
        J2(aVar, z, bVar);
    }

    public static /* synthetic */ void Y1(b.a aVar, Exception exc, b bVar) {
        bVar.a0(aVar, exc);
    }

    public static /* synthetic */ void Y2(b.a aVar, float f, b bVar) {
        bVar.i(aVar, f);
    }

    public static /* synthetic */ void Z0(b.a aVar, Exception exc, b bVar) {
        n2(aVar, exc, bVar);
    }

    public static /* synthetic */ void Z1(b.a aVar, y.a aVar2, b bVar) {
        bVar.c0(aVar, aVar2);
    }

    public static /* synthetic */ void Z2(b.a aVar, b bVar) {
        bVar.e0(aVar);
    }

    public static /* synthetic */ void a1(b.a aVar, y.a aVar2, b bVar) {
        Z1(aVar, aVar2, bVar);
    }

    public static /* synthetic */ void a2(b.a aVar, y.a aVar2, b bVar) {
        bVar.S(aVar, aVar2);
    }

    public static /* synthetic */ void b1(b.a aVar, boolean z, int i, b bVar) {
        z2(aVar, z, i, bVar);
    }

    public static /* synthetic */ void b2(b.a aVar, int i, long j, long j2, b bVar) {
        bVar.W(aVar, i, j, j2);
    }

    public static /* synthetic */ void c1(b.a aVar, int i, long j, long j2, b bVar) {
        d2(aVar, i, j, j2, bVar);
    }

    public static /* synthetic */ void c2(b.a aVar, C.b bVar, b bVar2) {
        bVar2.l0(aVar, bVar);
    }

    public static /* synthetic */ void d1(b.a aVar, long j, int i, b bVar) {
        V2(aVar, j, i, bVar);
    }

    public static /* synthetic */ void d2(b.a aVar, int i, long j, long j2, b bVar) {
        bVar.L(aVar, i, j, j2);
    }

    public static /* synthetic */ void e1(r0 r0Var) {
        r0Var.b3();
    }

    public static /* synthetic */ void e2(b.a aVar, List list, b bVar) {
        bVar.A(aVar, list);
    }

    public static /* synthetic */ void f1(b.a aVar, b bVar) {
        Z2(aVar, bVar);
    }

    public static /* synthetic */ void f2(b.a aVar, O2.b bVar, b bVar2) {
        bVar2.E(aVar, bVar);
    }

    public static /* synthetic */ void g1(b.a aVar, boolean z, b bVar) {
        r2(aVar, z, bVar);
    }

    public static /* synthetic */ void g2(b.a aVar, M2.l lVar, b bVar) {
        bVar.i0(aVar, lVar);
    }

    public static /* synthetic */ void h1(b.a aVar, g3.r rVar, g3.u uVar, IOException iOException, boolean z, b bVar) {
        u2(aVar, rVar, uVar, iOException, z, bVar);
    }

    public static /* synthetic */ void h2(b.a aVar, int i, boolean z, b bVar) {
        bVar.h0(aVar, i, z);
    }

    public static /* synthetic */ void i1(b.a aVar, M2.B b, b bVar) {
        A2(aVar, b, bVar);
    }

    public static /* synthetic */ void i2(b.a aVar, g3.u uVar, b bVar) {
        bVar.d0(aVar, uVar);
    }

    public static /* synthetic */ void j1(b.a aVar, g3.u uVar, b bVar) {
        i2(aVar, uVar, bVar);
    }

    public static /* synthetic */ void j2(b.a aVar, b bVar) {
        bVar.p(aVar);
    }

    public static /* synthetic */ void k1(b.a aVar, y.a aVar2, b bVar) {
        a2(aVar, aVar2, bVar);
    }

    public static /* synthetic */ void k2(b.a aVar, b bVar) {
        bVar.v(aVar);
    }

    public static /* synthetic */ void l1(b.a aVar, T2.o oVar, b bVar) {
        U1(aVar, oVar, bVar);
    }

    public static /* synthetic */ void l2(b.a aVar, b bVar) {
        bVar.T(aVar);
    }

    public static /* synthetic */ void m1(b.a aVar, List list, b bVar) {
        e2(aVar, list, bVar);
    }

    public static /* synthetic */ void m2(b.a aVar, int i, b bVar) {
        bVar.Z(aVar);
        bVar.H(aVar, i);
    }

    public static /* synthetic */ void n1(b.a aVar, String str, long j, long j2, b bVar) {
        S1(aVar, str, j, j2, bVar);
    }

    public static /* synthetic */ void n2(b.a aVar, Exception exc, b bVar) {
        bVar.O(aVar, exc);
    }

    public static /* synthetic */ void o1(b.a aVar, int i, int i2, b bVar) {
        L2(aVar, i, i2, bVar);
    }

    public static /* synthetic */ void o2(b.a aVar, b bVar) {
        bVar.k(aVar);
    }

    public static /* synthetic */ void p1(b.a aVar, M2.l lVar, b bVar) {
        g2(aVar, lVar, bVar);
    }

    public static /* synthetic */ void p2(b.a aVar, int i, long j, b bVar) {
        bVar.r0(aVar, i, j);
    }

    public static /* synthetic */ void q1(b.a aVar, int i, long j, long j2, b bVar) {
        b2(aVar, i, j, j2, bVar);
    }

    public static /* synthetic */ void q2(b.a aVar, boolean z, b bVar) {
        bVar.n0(aVar, z);
        bVar.q0(aVar, z);
    }

    public static /* synthetic */ void r1(b.a aVar, M2.x xVar, b bVar) {
        y2(aVar, xVar, bVar);
    }

    public static /* synthetic */ void r2(b.a aVar, boolean z, b bVar) {
        bVar.j0(aVar, z);
    }

    public static /* synthetic */ void s0(b.a aVar, b bVar) {
        j2(aVar, bVar);
    }

    public static /* synthetic */ void s1(b.a aVar, M2.w wVar, b bVar) {
        x2(aVar, wVar, bVar);
    }

    public static /* synthetic */ void s2(b.a aVar, g3.r rVar, g3.u uVar, b bVar) {
        bVar.K(aVar, rVar, uVar);
    }

    public static /* synthetic */ void t0(b.a aVar, g3.u uVar, b bVar) {
        P2(aVar, uVar, bVar);
    }

    public static /* synthetic */ void t1(b.a aVar, long j, b bVar) {
        X1(aVar, j, bVar);
    }

    public static /* synthetic */ void t2(b.a aVar, g3.r rVar, g3.u uVar, b bVar) {
        bVar.I(aVar, rVar, uVar);
    }

    public static /* synthetic */ void u0(b.a aVar, Exception exc, b bVar) {
        Y1(aVar, exc, bVar);
    }

    public static /* synthetic */ void u1(b.a aVar, M2.J j, b bVar) {
        O2(aVar, j, bVar);
    }

    public static /* synthetic */ void u2(b.a aVar, g3.r rVar, g3.u uVar, IOException iOException, boolean z, b bVar) {
        bVar.X(aVar, rVar, uVar, iOException, z);
    }

    public static /* synthetic */ void v0(b.a aVar, b bVar) {
        P1(aVar, bVar);
    }

    public static /* synthetic */ void v1(b.a aVar, b bVar) {
        o2(aVar, bVar);
    }

    public static /* synthetic */ void v2(b.a aVar, g3.r rVar, g3.u uVar, b bVar) {
        bVar.f0(aVar, rVar, uVar);
    }

    public static /* synthetic */ void w0(b.a aVar, M2.N n, b bVar) {
        X2(aVar, n, bVar);
    }

    public static /* synthetic */ void w1(b.a aVar, C.b bVar, b bVar2) {
        c2(aVar, bVar, bVar2);
    }

    public static /* synthetic */ void w2(b.a aVar, M2.u uVar, int i, b bVar) {
        bVar.w(aVar, uVar, i);
    }

    public static /* synthetic */ void x0(b.a aVar, String str, long j, long j2, b bVar) {
        R2(aVar, str, j, j2, bVar);
    }

    public static /* synthetic */ void x1(b.a aVar, M2.A a2, b bVar) {
        D2(aVar, a2, bVar);
    }

    public static /* synthetic */ void x2(b.a aVar, M2.w wVar, b bVar) {
        bVar.P(aVar, wVar);
    }

    public static /* synthetic */ void y0(b.a aVar, int i, C.e eVar, C.e eVar2, b bVar) {
        G2(aVar, i, eVar, eVar2, bVar);
    }

    public static /* synthetic */ void y1(b.a aVar, M2.b bVar, b bVar2) {
        Q1(aVar, bVar, bVar2);
    }

    public static /* synthetic */ void y2(b.a aVar, M2.x xVar, b bVar) {
        bVar.o(aVar, xVar);
    }

    public static /* synthetic */ void z0(b.a aVar, M2.A a2, b bVar) {
        E2(aVar, a2, bVar);
    }

    public static /* synthetic */ void z1(b.a aVar, int i, b bVar) {
        m2(aVar, i, bVar);
    }

    public static /* synthetic */ void z2(b.a aVar, boolean z, int i, b bVar) {
        bVar.s0(aVar, z, i);
    }

    public final void A(int i) {
        b.a G1 = G1();
        c3(G1, 6, new r(G1, i));
    }

    public final void C(C.e eVar, C.e eVar2, int i) {
        if (i == 1) {
            this.i = false;
        }
        this.d.j((M2.C) P2.a.e(this.g));
        b.a G1 = G1();
        c3(G1, 11, new I(G1, i, eVar, eVar2));
    }

    public final void D(int i) {
        b.a G1 = G1();
        c3(G1, 4, new D(G1, i));
    }

    public final void E(int i, long j, long j2) {
        b.a J1 = J1();
        c3(J1, 1006, new a0(J1, i, j, j2));
    }

    public final void F(M2.G g, int i) {
        this.d.l((M2.C) P2.a.e(this.g));
        b.a G1 = G1();
        c3(G1, 0, new e(G1, i));
    }

    public final void G() {
        if (this.i) {
            return;
        }
        b.a G1 = G1();
        this.i = true;
        c3(G1, -1, new G(G1));
    }

    public final b.a G1() {
        return I1(this.d.d());
    }

    public final void H(boolean z) {
        b.a G1 = G1();
        c3(G1, 9, new Q(G1, z));
    }

    public final b.a H1(M2.G g, int i, w.b bVar) {
        w.b bVar2 = g.q() ? null : bVar;
        long b = this.a.b();
        boolean z = g.equals(this.g.v()) && i == this.g.L();
        long j = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z) {
                j = this.g.G();
            } else if (!g.q()) {
                j = g.n(i, this.c).b();
            }
        } else if (z && this.g.r() == bVar2.b && this.g.F() == bVar2.c) {
            j = this.g.getCurrentPosition();
        }
        return new b.a(b, g, i, bVar2, j, this.g.v(), this.g.L(), this.d.d(), this.g.getCurrentPosition(), this.g.i());
    }

    public final void I(int i, w.b bVar, g3.r rVar, g3.u uVar) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1001, new f0(K1, rVar, uVar));
    }

    public final b.a I1(w.b bVar) {
        P2.a.e(this.g);
        M2.G f = bVar == null ? null : this.d.f(bVar);
        if (bVar != null && f != null) {
            return H1(f, f.h(bVar.a, this.b).c, bVar);
        }
        int L = this.g.L();
        M2.G v = this.g.v();
        if (L >= v.p()) {
            v = M2.G.a;
        }
        return H1(v, L, null);
    }

    public void J(M2.I i) {
        b.a G1 = G1();
        c3(G1, 19, new g0(G1, i));
    }

    public final b.a J1() {
        return I1(this.d.e());
    }

    public final void K(M2.u uVar, int i) {
        b.a G1 = G1();
        c3(G1, 1, new f(G1, uVar, i));
    }

    public final b.a K1(int i, w.b bVar) {
        P2.a.e(this.g);
        if (bVar != null) {
            return this.d.f(bVar) != null ? I1(bVar) : H1(M2.G.a, i, bVar);
        }
        M2.G v = this.g.v();
        if (i >= v.p()) {
            v = M2.G.a;
        }
        return H1(v, i, null);
    }

    public void L(C.b bVar) {
        b.a G1 = G1();
        c3(G1, 13, new d(G1, bVar));
    }

    public final b.a L1() {
        return I1(this.d.g());
    }

    public void M(M2.l lVar) {
        b.a G1 = G1();
        c3(G1, 29, new E(G1, lVar));
    }

    public final b.a M1() {
        return I1(this.d.h());
    }

    public void N(int i, boolean z) {
        b.a G1 = G1();
        c3(G1, 30, new v(G1, i, z));
    }

    public final b.a N1(M2.A a2) {
        w.b bVar;
        return (!(a2 instanceof T2.u) || (bVar = ((T2.u) a2).o) == null) ? G1() : I1(bVar);
    }

    public void O(M2.w wVar) {
        b.a G1 = G1();
        c3(G1, 14, new V(G1, wVar));
    }

    public final void P(int i, w.b bVar, g3.u uVar) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1004, new T(K1, uVar));
    }

    public final void Q(int i, w.b bVar, g3.r rVar, g3.u uVar) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1002, new c0(K1, rVar, uVar));
    }

    public void S(M2.A a2) {
        b.a N1 = N1(a2);
        c3(N1, 10, new u(N1, a2));
    }

    public void T(M2.C c, Looper looper) {
        P2.a.f(this.g == null || a.a(this.d).isEmpty());
        this.g = (M2.C) P2.a.e(c);
        this.h = this.a.d(looper, null);
        this.f = this.f.e(looper, new j(this, c));
    }

    public void U(M2.J j) {
        b.a G1 = G1();
        c3(G1, 2, new n(G1, j));
    }

    public void V(b bVar) {
        P2.a.e(bVar);
        this.f.c(bVar);
    }

    public final void W(int i, int i2) {
        b.a M1 = M1();
        c3(M1, 24, new S(M1, i, i2));
    }

    public final void X(int i, w.b bVar, int i2) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1022, new d0(K1, i2));
    }

    public final void Y(int i, w.b bVar, Exception exc) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1024, new e0(K1, exc));
    }

    public final void a(boolean z) {
        b.a M1 = M1();
        c3(M1, 23, new g(M1, z));
    }

    public final void a0(int i, w.b bVar, g3.r rVar, g3.u uVar, IOException iOException, boolean z) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1003, new b0(K1, rVar, uVar, iOException, z));
    }

    public final /* synthetic */ void a3(M2.C c, b bVar, M2.p pVar) {
        bVar.t(c, new b.b(pVar, this.e));
    }

    public final void b(Exception exc) {
        b.a M1 = M1();
        c3(M1, 1014, new P(M1, exc));
    }

    public final void b0(boolean z) {
        b.a G1 = G1();
        c3(G1, 3, new o0(G1, z));
    }

    public final void b3() {
        b.a G1 = G1();
        c3(G1, 1028, new U(G1));
        this.f.j();
    }

    public final void c(M2.N n) {
        b.a M1 = M1();
        c3(M1, 25, new X(M1, n));
    }

    public final void c0(float f) {
        b.a M1 = M1();
        c3(M1, 22, new h(M1, f));
    }

    public final void c3(b.a aVar, int i, n.a aVar2) {
        this.e.put(i, aVar);
        this.f.k(i, aVar2);
    }

    public void d(y.a aVar) {
        b.a M1 = M1();
        c3(M1, 1032, new i0(M1, aVar));
    }

    public void e(y.a aVar) {
        b.a M1 = M1();
        c3(M1, 1031, new h0(M1, aVar));
    }

    public final void e0(int i, w.b bVar, g3.r rVar, g3.u uVar) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1000, new q0(K1, rVar, uVar));
    }

    public final void f(String str) {
        b.a M1 = M1();
        c3(M1, 1019, new s(M1, str));
    }

    public final void f0(int i, w.b bVar) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1027, new j0(K1));
    }

    public final void g(String str, long j, long j2) {
        b.a M1 = M1();
        c3(M1, 1016, new O(M1, str, j2, j));
    }

    public final void g0(boolean z, int i) {
        b.a G1 = G1();
        c3(G1, -1, new k(G1, z, i));
    }

    public final void h(M2.x xVar) {
        b.a G1 = G1();
        c3(G1, 28, new m(G1, xVar));
    }

    public final void h0(int i, w.b bVar, g3.u uVar) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1005, new Z(K1, uVar));
    }

    public void i(O2.b bVar) {
        b.a G1 = G1();
        c3(G1, 27, new J(G1, bVar));
    }

    public final void j(String str) {
        b.a M1 = M1();
        c3(M1, 1012, new p0(M1, str));
    }

    public final void j0(int i) {
        b.a G1 = G1();
        c3(G1, 8, new M(G1, i));
    }

    public final void k(M2.q qVar, T2.p pVar) {
        b.a M1 = M1();
        c3(M1, 1009, new H(M1, qVar, pVar));
    }

    public final void k0(M2.A a2) {
        b.a N1 = N1(a2);
        c3(N1, 10, new B(N1, a2));
    }

    public final void l(String str, long j, long j2) {
        b.a M1 = M1();
        c3(M1, 1008, new q(M1, str, j2, j));
    }

    public final void l0(int i, w.b bVar) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1025, new l0(K1));
    }

    public final void m(M2.B b) {
        b.a G1 = G1();
        c3(G1, 12, new c(G1, b));
    }

    public final void m0(int i, w.b bVar) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1026, new k0(K1));
    }

    public final void n(T2.o oVar) {
        b.a M1 = M1();
        c3(M1, 1015, new K(M1, oVar));
    }

    public final void n0(boolean z, int i) {
        b.a G1 = G1();
        c3(G1, 5, new w(G1, z, i));
    }

    public void o(List list) {
        b.a G1 = G1();
        c3(G1, 27, new x(G1, list));
    }

    public final void o0(List list, w.b bVar) {
        this.d.k(list, bVar, (M2.C) P2.a.e(this.g));
    }

    public final void p(long j) {
        b.a M1 = M1();
        c3(M1, 1010, new o(M1, j));
    }

    public final void p0(int i, w.b bVar) {
        b.a K1 = K1(i, bVar);
        c3(K1, 1023, new m0(K1));
    }

    public final void q(M2.q qVar, T2.p pVar) {
        b.a M1 = M1();
        c3(M1, 1017, new F(M1, qVar, pVar));
    }

    public final void q0(M2.b bVar) {
        b.a M1 = M1();
        c3(M1, 20, new l(M1, bVar));
    }

    public final void r(Exception exc) {
        b.a M1 = M1();
        c3(M1, 1030, new i(M1, exc));
    }

    public void r0(boolean z) {
        b.a G1 = G1();
        c3(G1, 7, new p(G1, z));
    }

    public void release() {
        ((P2.k) P2.a.h(this.h)).i(new L(this));
    }

    public final void s(T2.o oVar) {
        b.a L1 = L1();
        c3(L1, 1013, new C(L1, oVar));
    }

    public final void t(T2.o oVar) {
        b.a M1 = M1();
        c3(M1, 1007, new n0(M1, oVar));
    }

    public final void u(int i, long j) {
        b.a L1 = L1();
        c3(L1, 1018, new t(L1, i, j));
    }

    public final void v(Object obj, long j) {
        b.a M1 = M1();
        c3(M1, 26, new Y(M1, obj, j));
    }

    public final void w(T2.o oVar) {
        b.a L1 = L1();
        c3(L1, 1020, new y(L1, oVar));
    }

    public final void x(Exception exc) {
        b.a M1 = M1();
        c3(M1, 1029, new N(M1, exc));
    }

    public final void y(int i, long j, long j2) {
        b.a M1 = M1();
        c3(M1, 1011, new W(M1, i, j, j2));
    }

    public final void z(long j, int i) {
        b.a L1 = L1();
        c3(L1, 1021, new A(L1, j, i));
    }

    public void R() {
    }

    public void B(boolean z) {
    }

    public void Z(int i) {
    }

    public static /* synthetic */ void O1(b bVar, M2.p pVar) {
    }

    public void d0(M2.C c, C.c cVar) {
    }
}

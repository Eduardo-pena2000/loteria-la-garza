package x0;

import Ca.o;
import n1.t;
import u0.l;
import v0.G1;
import v0.H1;
import v0.Q;
import v0.X0;
import v0.b1;
import v0.h0;
import v0.j0;
import v0.k1;
import v0.l1;
import v0.m1;
import v0.n1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements f {
    public final a a = new a(null, null, null, 0, 15, null);
    public final d b = new b();
    public k1 c;
    public k1 d;

    public static final class a {
        public n1.d a;
        public t b;
        public j0 c;
        public long d;

        public /* synthetic */ a(n1.d dVar, t tVar, j0 j0Var, long j, kotlin.jvm.internal.k kVar) {
            this(dVar, tVar, j0Var, j);
        }

        public final n1.d a() {
            return this.a;
        }

        public final t b() {
            return this.b;
        }

        public final j0 c() {
            return this.c;
        }

        public final long d() {
            return this.d;
        }

        public final j0 e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.t.c(this.a, aVar.a) && this.b == aVar.b && kotlin.jvm.internal.t.c(this.c, aVar.c) && l.f(this.d, aVar.d);
        }

        public final n1.d f() {
            return this.a;
        }

        public final t g() {
            return this.b;
        }

        public final long h() {
            return this.d;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + l.j(this.d);
        }

        public final void i(j0 j0Var) {
            this.c = j0Var;
        }

        public final void j(n1.d dVar) {
            this.a = dVar;
        }

        public final void k(t tVar) {
            this.b = tVar;
        }

        public final void l(long j) {
            this.d = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + l.l(this.d) + ')';
        }

        public a(n1.d dVar, t tVar, j0 j0Var, long j) {
            this.a = dVar;
            this.b = tVar;
            this.c = j0Var;
            this.d = j;
        }

        public /* synthetic */ a(n1.d dVar, t tVar, j0 j0Var, long j, int i, kotlin.jvm.internal.k kVar) {
            this((i & 1) != 0 ? e.a() : dVar, (i & 2) != 0 ? t.a : tVar, (i & 4) != 0 ? i.a : j0Var, (i & 8) != 0 ? l.b.b() : j, null);
        }
    }

    public static final class b implements d {
        public final h a = x0.b.a(this);
        public y0.c b;

        public b() {
        }

        public void a(t tVar) {
            a.this.P().k(tVar);
        }

        public void b(n1.d dVar) {
            a.this.P().j(dVar);
        }

        public void c(j0 j0Var) {
            a.this.P().i(j0Var);
        }

        public h d() {
            return this.a;
        }

        public long e() {
            return a.this.P().h();
        }

        public j0 f() {
            return a.this.P().e();
        }

        public void g(long j) {
            a.this.P().l(j);
        }

        public n1.d getDensity() {
            return a.this.P().f();
        }

        public t getLayoutDirection() {
            return a.this.P().g();
        }

        public y0.c h() {
            return this.b;
        }

        public void i(y0.c cVar) {
            this.b = cVar;
        }
    }

    public static /* synthetic */ k1 B(a aVar, long j, float f, float f2, int i, int i2, n1 n1Var, float f3, androidx.compose.ui.graphics.d dVar, int i3, int i4, int i5, Object obj) {
        return aVar.z(j, f, f2, i, i2, n1Var, f3, dVar, i3, (i5 & 512) != 0 ? f.a9.b() : i4);
    }

    public static /* synthetic */ k1 K(a aVar, h0 h0Var, float f, float f2, int i, int i2, n1 n1Var, float f3, androidx.compose.ui.graphics.d dVar, int i3, int i4, int i5, Object obj) {
        return aVar.J(h0Var, f, f2, i, i2, n1Var, f3, dVar, i3, (i5 & 512) != 0 ? f.a9.b() : i4);
    }

    public static /* synthetic */ k1 j(a aVar, long j, g gVar, float f, androidx.compose.ui.graphics.d dVar, int i, int i2, int i3, Object obj) {
        return aVar.g(j, gVar, f, dVar, i, (i3 & 32) != 0 ? f.a9.b() : i2);
    }

    public static /* synthetic */ k1 q(a aVar, h0 h0Var, g gVar, float f, androidx.compose.ui.graphics.d dVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = f.a9.b();
        }
        return aVar.p(h0Var, gVar, f, dVar, i, i2);
    }

    public void D1(m1 m1Var, long j, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i) {
        this.a.e().v(m1Var, j(this, j, gVar, f, dVar, i, 0, 32, null));
    }

    public final k1 J(h0 h0Var, float f, float f2, int i, int i2, n1 n1Var, float f3, androidx.compose.ui.graphics.d dVar, int i3, int i4) {
        k1 W = W();
        if (h0Var != null) {
            h0Var.applyTo-Pq9zytI(e(), W, f3);
        } else if (W.a() != f3) {
            W.d(f3);
        }
        if (!kotlin.jvm.internal.t.c(W.g(), dVar)) {
            W.c(dVar);
        }
        if (!androidx.compose.ui.graphics.c.G(W.j(), i3)) {
            W.b(i3);
        }
        if (W.B() != f) {
            W.A(f);
        }
        if (W.s() != f2) {
            W.w(f2);
        }
        if (!G1.e(W.n(), i)) {
            W.l(i);
        }
        if (!H1.e(W.r(), i2)) {
            W.o(i2);
        }
        W.q();
        if (!kotlin.jvm.internal.t.c((Object) null, n1Var)) {
            W.y(n1Var);
        }
        if (!X0.d(W.x(), i4)) {
            W.m(i4);
        }
        return W;
    }

    public final a P() {
        return this.a;
    }

    public final long T(long j, float f) {
        return f == 1.0f ? j : r0.q(j, r0.t(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final k1 U() {
        k1 k1Var = this.c;
        if (k1Var != null) {
            return k1Var;
        }
        k1 a2 = Q.a();
        a2.z(l1.a.a());
        this.c = a2;
        return a2;
    }

    public final k1 W() {
        k1 k1Var = this.d;
        if (k1Var != null) {
            return k1Var;
        }
        k1 a2 = Q.a();
        a2.z(l1.a.b());
        this.d = a2;
        return a2;
    }

    public void Y0(h0 h0Var, long j, long j2, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.e().q(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j2 & 4294967295L)), q(this, h0Var, gVar, f, dVar, i, 0, 32, null));
    }

    public final k1 Z(g gVar) {
        if (kotlin.jvm.internal.t.c(gVar, j.a)) {
            return U();
        }
        if (!(gVar instanceof k)) {
            throw new o();
        }
        k1 W = W();
        k kVar = (k) gVar;
        if (W.B() != kVar.f()) {
            W.A(kVar.f());
        }
        if (!G1.e(W.n(), kVar.b())) {
            W.l(kVar.b());
        }
        if (W.s() != kVar.d()) {
            W.w(kVar.d());
        }
        if (!H1.e(W.r(), kVar.c())) {
            W.o(kVar.c());
        }
        W.q();
        kVar.e();
        if (!kotlin.jvm.internal.t.c((Object) null, (Object) null)) {
            kVar.e();
            W.y(null);
        }
        return W;
    }

    public void b1(long j, float f, float f2, boolean z, long j2, long j3, float f3, g gVar, androidx.compose.ui.graphics.d dVar, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.e().j(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & 4294967295L)), f, f2, z, j(this, j, gVar, f3, dVar, i, 0, 32, null));
    }

    public void e0(long j, float f, long j2, float f2, g gVar, androidx.compose.ui.graphics.d dVar, int i) {
        this.a.e().h(j2, f, j(this, j, gVar, f2, dVar, i, 0, 32, null));
    }

    public float e1() {
        return this.a.f().e1();
    }

    public void f1(b1 b1Var, long j, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i) {
        this.a.e().m(b1Var, j, q(this, null, gVar, f, dVar, i, 0, 32, null));
    }

    public final k1 g(long j, g gVar, float f, androidx.compose.ui.graphics.d dVar, int i, int i2) {
        k1 Z = Z(gVar);
        long T = T(j, f);
        if (!r0.s(Z.e(), T)) {
            Z.p(T);
        }
        if (Z.v() != null) {
            Z.u(null);
        }
        if (!kotlin.jvm.internal.t.c(Z.g(), dVar)) {
            Z.c(dVar);
        }
        if (!androidx.compose.ui.graphics.c.G(Z.j(), i)) {
            Z.b(i);
        }
        if (!X0.d(Z.x(), i2)) {
            Z.m(i2);
        }
        return Z;
    }

    public float getDensity() {
        return this.a.f().getDensity();
    }

    public t getLayoutDirection() {
        return this.a.g();
    }

    public void i0(long j, long j2, long j3, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.e().q(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & 4294967295L)), j(this, j, gVar, f, dVar, i, 0, 32, null));
    }

    public void k0(h0 h0Var, long j, long j2, long j3, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.e().f(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), q(this, h0Var, gVar, f, dVar, i, 0, 32, null));
    }

    public void l1(h0 h0Var, long j, long j2, float f, int i, n1 n1Var, float f2, androidx.compose.ui.graphics.d dVar, int i2) {
        this.a.e().g(j, j2, K(this, h0Var, f, 4.0f, i, H1.a.b(), n1Var, f2, dVar, i2, 0, 512, null));
    }

    public d m1() {
        return this.b;
    }

    public void o1(m1 m1Var, h0 h0Var, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i) {
        this.a.e().v(m1Var, q(this, h0Var, gVar, f, dVar, i, 0, 32, null));
    }

    public final k1 p(h0 h0Var, g gVar, float f, androidx.compose.ui.graphics.d dVar, int i, int i2) {
        k1 Z = Z(gVar);
        if (h0Var != null) {
            h0Var.applyTo-Pq9zytI(e(), Z, f);
        } else {
            if (Z.v() != null) {
                Z.u(null);
            }
            long e = Z.e();
            r0.a aVar = r0.b;
            if (!r0.s(e, aVar.a())) {
                Z.p(aVar.a());
            }
            if (Z.a() != f) {
                Z.d(f);
            }
        }
        if (!kotlin.jvm.internal.t.c(Z.g(), dVar)) {
            Z.c(dVar);
        }
        if (!androidx.compose.ui.graphics.c.G(Z.j(), i)) {
            Z.b(i);
        }
        if (!X0.d(Z.x(), i2)) {
            Z.m(i2);
        }
        return Z;
    }

    public void p1(long j, long j2, long j3, float f, int i, n1 n1Var, float f2, androidx.compose.ui.graphics.d dVar, int i2) {
        this.a.e().g(j2, j3, B(this, j, f, 4.0f, i, H1.a.b(), n1Var, f2, dVar, i2, 0, 512, null));
    }

    public void r1(long j, long j2, long j3, long j4, g gVar, float f, androidx.compose.ui.graphics.d dVar, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.e().f(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), j(this, j, gVar, f, dVar, i, 0, 32, null));
    }

    public final k1 z(long j, float f, float f2, int i, int i2, n1 n1Var, float f3, androidx.compose.ui.graphics.d dVar, int i3, int i4) {
        k1 W = W();
        long T = T(j, f3);
        if (!r0.s(W.e(), T)) {
            W.p(T);
        }
        if (W.v() != null) {
            W.u(null);
        }
        if (!kotlin.jvm.internal.t.c(W.g(), dVar)) {
            W.c(dVar);
        }
        if (!androidx.compose.ui.graphics.c.G(W.j(), i3)) {
            W.b(i3);
        }
        if (W.B() != f) {
            W.A(f);
        }
        if (W.s() != f2) {
            W.w(f2);
        }
        if (!G1.e(W.n(), i)) {
            W.l(i);
        }
        if (!H1.e(W.r(), i2)) {
            W.o(i2);
        }
        W.q();
        if (!kotlin.jvm.internal.t.c((Object) null, n1Var)) {
            W.y(n1Var);
        }
        if (!X0.d(W.x(), i4)) {
            W.m(i4);
        }
        return W;
    }

    public void z1(b1 b1Var, long j, long j2, long j3, long j4, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2) {
        this.a.e().n(b1Var, j, j2, j3, j4, p(null, gVar, f, dVar, i, i2));
    }
}

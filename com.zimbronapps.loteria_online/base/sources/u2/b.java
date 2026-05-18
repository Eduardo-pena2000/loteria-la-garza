package U2;

import M2.C;
import V2.y;
import android.util.SparseArray;
import g3.w;
import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface b {

    public static final class a {
        public final long a;
        public final M2.G b;
        public final int c;
        public final w.b d;
        public final long e;
        public final M2.G f;
        public final int g;
        public final w.b h;
        public final long i;
        public final long j;

        public a(long j, M2.G g, int i, w.b bVar, long j2, M2.G g2, int i2, w.b bVar2, long j3, long j4) {
            this.a = j;
            this.b = g;
            this.c = i;
            this.d = bVar;
            this.e = j2;
            this.f = g2;
            this.g = i2;
            this.h = bVar2;
            this.i = j3;
            this.j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && s7.k.a(this.b, aVar.b) && s7.k.a(this.d, aVar.d) && s7.k.a(this.f, aVar.f) && s7.k.a(this.h, aVar.h);
        }

        public int hashCode() {
            return s7.k.b(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
        }
    }

    public static final class b {
        public final M2.p a;
        public final SparseArray b;

        public b(M2.p pVar, SparseArray sparseArray) {
            this.a = pVar;
            SparseArray sparseArray2 = new SparseArray(pVar.c());
            for (int i = 0; i < pVar.c(); i++) {
                int b = pVar.b(i);
                sparseArray2.append(b, (a) P2.a.e((a) sparseArray.get(b)));
            }
            this.b = sparseArray2;
        }

        public boolean a(int i) {
            return this.a.a(i);
        }

        public int b(int i) {
            return this.a.b(i);
        }

        public a c(int i) {
            return (a) P2.a.e((a) this.b.get(i));
        }

        public int d() {
            return this.a.c();
        }
    }

    void F(a aVar, T2.o oVar);

    void L(a aVar, int i, long j, long j2);

    void X(a aVar, g3.r rVar, g3.u uVar, IOException iOException, boolean z);

    void b(a aVar, M2.N n);

    void d0(a aVar, g3.u uVar);

    void m0(a aVar, C.e eVar, C.e eVar2, int i);

    void o0(a aVar, M2.A a2);

    void t(M2.C c, b bVar);

    default void T(a aVar) {
    }

    default void Z(a aVar) {
    }

    default void e0(a aVar) {
    }

    default void k(a aVar) {
    }

    default void p(a aVar) {
    }

    default void r(a aVar) {
    }

    default void v(a aVar) {
    }

    default void A(a aVar, List list) {
    }

    default void B(a aVar, M2.A a2) {
    }

    default void E(a aVar, O2.b bVar) {
    }

    default void G(a aVar, M2.I i) {
    }

    default void H(a aVar, int i) {
    }

    default void J(a aVar, M2.b bVar) {
    }

    default void M(a aVar, T2.o oVar) {
    }

    default void O(a aVar, Exception exc) {
    }

    default void P(a aVar, M2.w wVar) {
    }

    default void Q(a aVar, String str) {
    }

    default void R(a aVar, M2.B b2) {
    }

    default void S(a aVar, y.a aVar2) {
    }

    default void V(a aVar, T2.o oVar) {
    }

    default void a(a aVar, M2.J j) {
    }

    default void a0(a aVar, Exception exc) {
    }

    default void b0(a aVar, long j) {
    }

    default void c0(a aVar, y.a aVar2) {
    }

    default void d(a aVar, int i) {
    }

    default void g0(a aVar, String str) {
    }

    default void h(a aVar, T2.o oVar) {
    }

    default void i(a aVar, float f) {
    }

    default void i0(a aVar, M2.l lVar) {
    }

    default void j0(a aVar, boolean z) {
    }

    default void k0(a aVar, int i) {
    }

    default void l(a aVar, int i) {
    }

    default void l0(a aVar, C.b bVar) {
    }

    default void n(a aVar, boolean z) {
    }

    default void n0(a aVar, boolean z) {
    }

    default void o(a aVar, M2.x xVar) {
    }

    default void q0(a aVar, boolean z) {
    }

    default void s(a aVar, Exception exc) {
    }

    default void u(a aVar, g3.u uVar) {
    }

    default void u0(a aVar, Exception exc) {
    }

    default void x(a aVar, int i) {
    }

    default void y(a aVar, int i) {
    }

    default void z(a aVar, boolean z) {
    }

    default void C(a aVar, String str, long j) {
    }

    default void I(a aVar, g3.r rVar, g3.u uVar) {
    }

    default void K(a aVar, g3.r rVar, g3.u uVar) {
    }

    default void N(a aVar, long j, int i) {
    }

    default void Y(a aVar, int i, int i2) {
    }

    default void f(a aVar, M2.q qVar, T2.p pVar) {
    }

    default void f0(a aVar, g3.r rVar, g3.u uVar) {
    }

    default void h0(a aVar, int i, boolean z) {
    }

    default void m(a aVar, M2.q qVar, T2.p pVar) {
    }

    default void q(a aVar, Object obj, long j) {
    }

    default void r0(a aVar, int i, long j) {
    }

    default void s0(a aVar, boolean z, int i) {
    }

    default void t0(a aVar, boolean z, int i) {
    }

    default void v0(a aVar, String str, long j) {
    }

    default void w(a aVar, M2.u uVar, int i) {
    }

    default void D(a aVar, String str, long j, long j2) {
    }

    default void W(a aVar, int i, long j, long j2) {
    }

    default void p0(a aVar, String str, long j, long j2) {
    }

    default void g(a aVar, int i, int i2, int i3, float f) {
    }
}

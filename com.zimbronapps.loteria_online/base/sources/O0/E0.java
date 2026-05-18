package O0;

import I0.Q;
import androidx.compose.ui.e;
import l0.l;
import v0.g1;
import v0.k1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e0 extends T implements M0.A, M0.p, q0 {
    public static final e O = new e(null);
    public static final Qa.l P = d.a;
    public static final Qa.l Q = c.a;
    public static final androidx.compose.ui.graphics.h R = new androidx.compose.ui.graphics.h();
    public static final C S = new C();
    public static final float[] T = g1.c(null, 1, null);
    public static final f U = new a();
    public static final f V = new b();
    public M0.C B;
    public w.K C;
    public float E;
    public u0.d F;
    public C G;
    public y0.c H;
    public v0.j0 I;
    public Qa.p J;
    public boolean L;
    public o0 M;
    public y0.c N;
    public final J q;
    public boolean r;
    public boolean s;
    public e0 t;
    public e0 u;
    public boolean v;
    public boolean w;
    public Qa.l x;
    public n1.d y = L1().R();
    public n1.t z = L1().getLayoutDirection();
    public float A = 0.8f;
    public long D = n1.n.b.b();
    public final Qa.a K = new i();

    public static final class a implements f {
        public int a() {
            return g0.a(16);
        }

        public boolean b(J j) {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [d0.c] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [d0.c] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        public boolean c(e.c cVar) {
            int a = g0.a(16);
            ?? r3 = 0;
            while (cVar != 0) {
                if (cVar instanceof v0) {
                    if (((v0) cVar).Z()) {
                        return true;
                    }
                } else if ((cVar.getKindSet$ui_release() & a) != 0 && (cVar instanceof m)) {
                    e.c F1 = cVar.F1();
                    int i = 0;
                    r3 = r3;
                    cVar = cVar;
                    while (F1 != null) {
                        if ((F1.getKindSet$ui_release() & a) != 0) {
                            i++;
                            r3 = r3;
                            if (i == 1) {
                                cVar = F1;
                            } else {
                                if (r3 == 0) {
                                    r3 = new d0.c(new e.c[16], 0);
                                }
                                if (cVar != 0) {
                                    r3.b(cVar);
                                    cVar = 0;
                                }
                                r3.b(F1);
                            }
                        }
                        F1 = F1.getChild$ui_release();
                        r3 = r3;
                        cVar = cVar;
                    }
                    if (i == 1) {
                    }
                }
                cVar = O0.k.b(r3);
            }
            return false;
        }

        public void d(J j, long j2, w wVar, int i, boolean z) {
            j.I0(j2, wVar, i, z);
        }
    }

    public static final class b implements f {
        public int a() {
            return g0.a(8);
        }

        public boolean b(J j) {
            W0.m c = j.c();
            boolean z = false;
            if (c != null && c.o()) {
                z = true;
            }
            return !z;
        }

        public boolean c(e.c cVar) {
            return false;
        }

        public void d(J j, long j2, w wVar, int i, boolean z) {
            j.K0(j2, wVar, i, z);
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(e0 e0Var) {
            o0 H2 = e0Var.H2();
            if (H2 != null) {
                H2.invalidate();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e0) obj);
            return Ca.I.a;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(e0 e0Var) {
            if (e0Var.N0() && e0.I3(e0Var, false, 1, null)) {
                J L1 = e0Var.L1();
                O d0 = L1.d0();
                if (d0.c() > 0) {
                    if (d0.e() || d0.f()) {
                        J.F1(L1, false, 1, null);
                    }
                    d0.v().d2();
                }
                L1.R0();
                p0 b = N.b(L1);
                b.getRectManager().j(L1);
                if (L1.U() > 0) {
                    b.t(L1);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e0) obj);
            return Ca.I.a;
        }
    }

    public static final class e {
        public /* synthetic */ e(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final f a() {
            return e0.h2();
        }

        public final f b() {
            return e0.i2();
        }

        public e() {
        }
    }

    public interface f {
        int a();

        boolean b(J j);

        boolean c(e.c cVar);

        void d(J j, long j2, w wVar, int i, boolean z);
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Qa.a aVar) {
            super(2);
            this.b = aVar;
        }

        public final void a(v0.j0 j0Var, y0.c cVar) {
            if (!e0.this.L1().p()) {
                e0.o2(e0.this, true);
                return;
            }
            e0.m2(e0.this, j0Var);
            e0.n2(e0.this, cVar);
            e0.j2(e0.this).i(e0.this, e0.g2(), this.b);
            e0.o2(e0.this, false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((v0.j0) obj, (y0.c) obj2);
            return Ca.I.a;
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.a {
        public h() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            e0 e0Var = e0.this;
            v0.j0 d2 = e0.d2(e0Var);
            kotlin.jvm.internal.t.d(d2);
            e0.c2(e0Var, d2, e0.e2(e0.this));
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.a {
        public i() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            e0 P2 = e0.this.P2();
            if (P2 != null) {
                P2.Y2();
            }
        }
    }

    public static final class j extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ e.c b;
        public final /* synthetic */ f c;
        public final /* synthetic */ long d;
        public final /* synthetic */ w e;
        public final /* synthetic */ int f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ float h;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e.c cVar, f fVar, long j, w wVar, int i, boolean z, float f, boolean z2) {
            super(0);
            this.b = cVar;
            this.c = fVar;
            this.d = j;
            this.e = wVar;
            this.f = i;
            this.g = z;
            this.h = f;
            this.i = z2;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            e0.l2(e0.this, f0.b(this.b, this.c.a(), g0.a(2)), this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }

    public static final class k extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ e.c b;
        public final /* synthetic */ f c;
        public final /* synthetic */ long d;
        public final /* synthetic */ w e;
        public final /* synthetic */ int f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ float h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e.c cVar, f fVar, long j, w wVar, int i, boolean z, float f) {
            super(0);
            this.b = cVar;
            this.c = fVar;
            this.d = j;
            this.e = wVar;
            this.f = i;
            this.g = z;
            this.h = f;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            e0.l2(e0.this, f0.b(this.b, this.c.a(), g0.a(2)), this.c, this.d, this.e, this.f, this.g, this.h, false);
        }
    }

    public static final class l extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Qa.l lVar) {
            super(0);
            this.a = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            this.a.invoke(e0.f2());
            e0.f2().q0();
        }
    }

    public e0(J j2) {
        this.q = j2;
    }

    public static /* synthetic */ long A2(e0 e0Var, long j2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        return e0Var.z2(j2, z);
    }

    public static /* synthetic */ long B3(e0 e0Var, long j2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        return e0Var.A3(j2, z);
    }

    public static /* synthetic */ void G3(e0 e0Var, Qa.l lVar, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        e0Var.F3(lVar, z);
    }

    public static /* synthetic */ boolean I3(e0 e0Var, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i2 & 1) != 0) {
            z = true;
        }
        return e0Var.H3(z);
    }

    private final r0 M2() {
        return N.b(L1()).getSnapshotObserver();
    }

    public static final /* synthetic */ void c2(e0 e0Var, v0.j0 j0Var, y0.c cVar) {
        e0Var.w2(j0Var, cVar);
    }

    public static final /* synthetic */ v0.j0 d2(e0 e0Var) {
        return e0Var.I;
    }

    public static final /* synthetic */ y0.c e2(e0 e0Var) {
        return e0Var.H;
    }

    public static final /* synthetic */ androidx.compose.ui.graphics.h f2() {
        return R;
    }

    public static final /* synthetic */ Qa.l g2() {
        return Q;
    }

    public static final /* synthetic */ f h2() {
        return U;
    }

    public static final /* synthetic */ f i2() {
        return V;
    }

    public static final /* synthetic */ r0 j2(e0 e0Var) {
        return e0Var.M2();
    }

    public static final /* synthetic */ e.c k2(e0 e0Var, boolean z) {
        return e0Var.T2(z);
    }

    public static final /* synthetic */ void l2(e0 e0Var, e.c cVar, f fVar, long j2, w wVar, int i2, boolean z, float f2, boolean z2) {
        e0Var.l3(cVar, fVar, j2, wVar, i2, z, f2, z2);
    }

    public static final /* synthetic */ void m2(e0 e0Var, v0.j0 j0Var) {
        e0Var.I = j0Var;
    }

    public static final /* synthetic */ void n2(e0 e0Var, y0.c cVar) {
        e0Var.H = cVar;
    }

    public static final /* synthetic */ void o2(e0 e0Var, boolean z) {
        e0Var.L = z;
    }

    public static final /* synthetic */ void p2(e0 e0Var, long j2) {
        e0Var.n1(j2);
    }

    public static /* synthetic */ void q3(e0 e0Var, u0.d dVar, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        e0Var.p3(dVar, z, z2);
    }

    public long A3(long j2, boolean z) {
        o0 o0Var = this.M;
        if (o0Var != null) {
            j2 = o0Var.c(j2, false);
        }
        return (z || !T1()) ? n1.o.c(j2, P1()) : j2;
    }

    public long B(long j2) {
        if (!g()) {
            L0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return N.b(L1()).B(E0(j2));
    }

    public final void B2(u0.d dVar, boolean z) {
        float k2 = n1.n.k(P1());
        dVar.i(dVar.b() - k2);
        dVar.j(dVar.c() - k2);
        float l2 = n1.n.l(P1());
        dVar.k(dVar.d() - l2);
        dVar.h(dVar.a() - l2);
        o0 o0Var = this.M;
        if (o0Var != null) {
            o0Var.e(dVar, true);
            if (this.w && z) {
                dVar.e(0.0f, 0.0f, (int) (a() >> 32), (int) (a() & 4294967295L));
                dVar.f();
            }
        }
    }

    public O0.b C2() {
        return L1().d0().b();
    }

    public final u0.h C3() {
        if (!g()) {
            return u0.h.e.a();
        }
        M0.p d2 = M0.q.d(this);
        u0.d L2 = L2();
        long s2 = s2(J2());
        int i2 = (int) (s2 >> 32);
        L2.i(-Float.intBitsToFloat(i2));
        int i3 = (int) (s2 & 4294967295L);
        L2.k(-Float.intBitsToFloat(i3));
        L2.j(U0() + Float.intBitsToFloat(i2));
        L2.h(R0() + Float.intBitsToFloat(i3));
        e0 e0Var = this;
        while (e0Var != d2) {
            e0Var.p3(L2, false, true);
            if (L2.f()) {
                return u0.h.e.a();
            }
            e0Var = e0Var.u;
            kotlin.jvm.internal.t.d(e0Var);
        }
        return u0.e.a(L2);
    }

    public final M0.p D0() {
        if (!g()) {
            L0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d3();
        return L1().v0().u;
    }

    public final Qa.p D2() {
        Qa.p pVar = this.J;
        if (pVar != null) {
            return pVar;
        }
        g gVar = new g(new h());
        this.J = gVar;
        return gVar;
    }

    public final void D3(e0 e0Var, float[] fArr) {
        if (kotlin.jvm.internal.t.c(e0Var, this)) {
            return;
        }
        e0 e0Var2 = this.u;
        kotlin.jvm.internal.t.d(e0Var2);
        e0Var2.D3(e0Var, fArr);
        if (!n1.n.j(P1(), n1.n.b.b())) {
            float[] fArr2 = T;
            g1.h(fArr2);
            g1.o(fArr2, -n1.n.k(P1()), -n1.n.l(P1()), 0.0f, 4, null);
            g1.l(fArr, fArr2);
        }
        o0 o0Var = this.M;
        if (o0Var != null) {
            o0Var.i(fArr);
        }
    }

    public long E0(long j2) {
        if (!g()) {
            L0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d3();
        long j3 = j2;
        for (e0 e0Var = this; e0Var != null; e0Var = e0Var.u) {
            j3 = B3(e0Var, j3, false, 2, null);
        }
        return j3;
    }

    public final boolean E2() {
        return this.s;
    }

    public final void E3(e0 e0Var, float[] fArr) {
        e0 e0Var2 = this;
        while (!kotlin.jvm.internal.t.c(e0Var2, e0Var)) {
            o0 o0Var = e0Var2.M;
            if (o0Var != null) {
                o0Var.a(fArr);
            }
            if (!n1.n.j(e0Var2.P1(), n1.n.b.b())) {
                float[] fArr2 = T;
                g1.h(fArr2);
                g1.o(fArr2, n1.n.k(r1), n1.n.l(r1), 0.0f, 4, null);
                g1.l(fArr, fArr2);
            }
            e0Var2 = e0Var2.u;
            kotlin.jvm.internal.t.d(e0Var2);
        }
    }

    public long F0(M0.p pVar, long j2, boolean z) {
        if (pVar instanceof M0.y) {
            M0.y yVar = (M0.y) pVar;
            yVar.b().d3();
            return u0.f.e(yVar.F0(this, u0.f.e(j2 ^ (-9223372034707292160L)), z) ^ (-9223372034707292160L));
        }
        e0 z3 = z3(pVar);
        z3.d3();
        e0 y2 = y2(z3);
        while (z3 != y2) {
            j2 = z3.A3(j2, z);
            z3 = z3.u;
            kotlin.jvm.internal.t.d(z3);
        }
        return r2(y2, j2, z);
    }

    public final boolean F2() {
        return this.L;
    }

    public final void F3(Qa.l lVar, boolean z) {
        p0 y0;
        if (!(lVar == null || this.N == null)) {
            L0.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        J L1 = L1();
        boolean z2 = (!z && this.x == lVar && kotlin.jvm.internal.t.c(this.y, L1.R()) && this.z == L1.getLayoutDirection()) ? false : true;
        this.y = L1.R();
        this.z = L1.getLayoutDirection();
        if (!L1.g() || lVar == null) {
            this.x = null;
            o0 o0Var = this.M;
            if (o0Var != null) {
                o0Var.destroy();
                L1.O1(true);
                this.K.invoke();
                if (g() && L1.p() && (y0 = L1.y0()) != null) {
                    y0.w(L1);
                }
            }
            this.M = null;
            this.L = false;
            return;
        }
        this.x = lVar;
        if (this.M != null) {
            if (z2 && I3(this, false, 1, null)) {
                N.b(L1).getRectManager().j(L1);
                return;
            }
            return;
        }
        o0 l2 = p0.l(N.b(L1), D2(), this.K, null, 4, null);
        l2.d(T0());
        l2.j(P1());
        this.M = l2;
        I3(this, false, 1, null);
        L1.O1(true);
        this.K.invoke();
    }

    public final long G2() {
        return V0();
    }

    public final o0 H2() {
        return this.M;
    }

    public final boolean H3(boolean z) {
        p0 y0;
        if (this.N != null) {
            return false;
        }
        o0 o0Var = this.M;
        if (o0Var == null) {
            if (!(this.x == null)) {
                L0.a.b("null layer with a non-null layerBlock");
            }
            return false;
        }
        Qa.l lVar = this.x;
        if (lVar == null) {
            L0.a.c("updateLayerParameters requires a non-null layerBlock");
            throw new Ca.i();
        }
        androidx.compose.ui.graphics.h hVar = R;
        hVar.c0();
        hVar.g0(L1().R());
        hVar.l0(L1().getLayoutDirection());
        hVar.p0(n1.s.d(a()));
        M2().i(this, P, new l(lVar));
        C c2 = this.G;
        if (c2 == null) {
            c2 = new C();
            this.G = c2;
        }
        C c3 = S;
        c3.a(c2);
        c2.b(hVar);
        o0Var.h(hVar);
        boolean z2 = this.w;
        this.w = hVar.q();
        this.A = hVar.g();
        boolean c4 = c3.c(c2);
        boolean z3 = !c4;
        if (z && ((!c4 || z2 != this.w) && (y0 = L1().y0()) != null)) {
            y0.w(L1());
        }
        return z3;
    }

    public abstract U I2();

    public T J1() {
        return this.t;
    }

    public final long J2() {
        return this.y.w1(L1().D0().e());
    }

    public final boolean J3(long j2) {
        if ((((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        o0 o0Var = this.M;
        return o0Var == null || !this.w || o0Var.g(j2);
    }

    public boolean K1() {
        return this.B != null;
    }

    public final M0.p K2() {
        if (!g()) {
            L0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d3();
        return this.u;
    }

    public J L1() {
        return this.q;
    }

    public final u0.d L2() {
        u0.d dVar = this.F;
        if (dVar != null) {
            return dVar;
        }
        u0.d dVar2 = new u0.d(0.0f, 0.0f, 0.0f, 0.0f);
        this.F = dVar2;
        return dVar2;
    }

    public M0.C M1() {
        M0.C c2 = this.B;
        if (c2 != null) {
            return c2;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public boolean N0() {
        return (this.M == null || this.v || !L1().g()) ? false : true;
    }

    public T N1() {
        return this.u;
    }

    public abstract e.c N2();

    public final e0 O2() {
        return this.t;
    }

    public long P(M0.p pVar, long j2) {
        return F0(pVar, j2, true);
    }

    public long P1() {
        return this.D;
    }

    public final e0 P2() {
        return this.u;
    }

    public final float Q2() {
        return this.E;
    }

    public final boolean R2(int i2) {
        e.c T2 = T2(h0.i(i2));
        return T2 != null && O0.k.f(T2, i2);
    }

    public final e.c S2(int i2) {
        boolean i3 = h0.i(i2);
        e.c N2 = N2();
        if (!i3 && (N2 = N2.getParent$ui_release()) == null) {
            return null;
        }
        for (e.c k2 = k2(this, i3); k2 != null && (k2.getAggregateChildKindSet$ui_release() & i2) != 0; k2 = k2.getChild$ui_release()) {
            if ((k2.getKindSet$ui_release() & i2) != 0) {
                return k2;
            }
            if (k2 == N2) {
                return null;
            }
        }
        return null;
    }

    public final e.c T2(boolean z) {
        e.c N2;
        if (L1().v0() == this) {
            return L1().s0().k();
        }
        if (z) {
            e0 e0Var = this.u;
            if (e0Var != null && (N2 = e0Var.N2()) != null) {
                return N2.getChild$ui_release();
            }
        } else {
            e0 e0Var2 = this.u;
            if (e0Var2 != null) {
                return e0Var2.N2();
            }
        }
        return null;
    }

    public final void U2(e.c cVar, f fVar, long j2, w wVar, int i2, boolean z) {
        if (cVar == null) {
            X2(fVar, j2, wVar, i2, z);
            return;
        }
        int e2 = w.e(wVar);
        w.g(wVar, w.e(wVar) + 1, wVar.size());
        w.h(wVar, w.e(wVar) + 1);
        w.f(wVar).k(cVar);
        w.b(wVar).d(x.c(-1.0f, z, false));
        U2(f0.b(cVar, fVar.a(), g0.a(2)), fVar, j2, wVar, i2, z);
        w.h(wVar, e2);
    }

    public final void V2(e.c cVar, f fVar, long j2, w wVar, int i2, boolean z, float f2) {
        if (cVar == null) {
            X2(fVar, j2, wVar, i2, z);
            return;
        }
        int e2 = w.e(wVar);
        w.g(wVar, w.e(wVar) + 1, wVar.size());
        w.h(wVar, w.e(wVar) + 1);
        w.f(wVar).k(cVar);
        w.b(wVar).d(x.c(f2, z, false));
        l3(f0.b(cVar, fVar.a(), g0.a(2)), fVar, j2, wVar, i2, z, f2, true);
        w.h(wVar, e2);
    }

    public final void W2(f fVar, long j2, w wVar, int i2, boolean z) {
        e.c S2 = S2(fVar.a());
        if (!J3(j2)) {
            if (I0.Q.g(i2, I0.Q.a.d())) {
                float t2 = t2(j2, J2());
                if ((Float.floatToRawIntBits(t2) & Integer.MAX_VALUE) >= 2139095040 || !wVar.r(t2, false)) {
                    return;
                }
                V2(S2, fVar, j2, wVar, i2, false, t2);
                return;
            }
            return;
        }
        if (S2 == null) {
            X2(fVar, j2, wVar, i2, z);
        } else if (a3(j2)) {
            U2(S2, fVar, j2, wVar, i2, z);
        } else {
            float t22 = !I0.Q.g(i2, I0.Q.a.d()) ? Float.POSITIVE_INFINITY : t2(j2, J2());
            l3(S2, fVar, j2, wVar, i2, z, t22, (Float.floatToRawIntBits(t22) & Integer.MAX_VALUE) < 2139095040 && wVar.r(t22, z));
        }
    }

    public void X2(f fVar, long j2, w wVar, int i2, boolean z) {
        e0 e0Var = this.t;
        if (e0Var != null) {
            e0Var.W2(fVar, A2(e0Var, j2, false, 2, null), wVar, i2, z);
        }
    }

    public void Y1() {
        y0.c cVar = this.N;
        if (cVar != null) {
            d1(P1(), this.E, cVar);
        } else {
            Z0(P1(), this.E, this.x);
        }
    }

    public void Y2() {
        o0 o0Var = this.M;
        if (o0Var != null) {
            o0Var.invalidate();
            return;
        }
        e0 e0Var = this.u;
        if (e0Var != null) {
            e0Var.Y2();
        }
    }

    public long Z(long j2) {
        if (!g()) {
            L0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        M0.p d2 = M0.q.d(this);
        return P(d2, u0.f.p(N.b(L1()).y(j2), M0.q.e(d2)));
    }

    public void Z0(long j2, float f2, Qa.l lVar) {
        if (!this.r) {
            n3(j2, f2, lVar, null);
            return;
        }
        U I2 = I2();
        kotlin.jvm.internal.t.d(I2);
        n3(I2.P1(), f2, lVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    public final boolean Z2(e.c cVar, long j2, int i2) {
        if (cVar == 0) {
            return false;
        }
        Q.a aVar = I0.Q.a;
        if (!I0.Q.g(i2, aVar.c()) && !I0.Q.g(i2, aVar.a())) {
            return false;
        }
        int a2 = g0.a(16);
        ?? r3 = 0;
        while (cVar != 0) {
            if (cVar instanceof v0) {
                long I0 = ((v0) cVar).I0();
                int i3 = (int) (j2 >> 32);
                if (Float.intBitsToFloat(i3) < (-F0.b(I0, getLayoutDirection())) || Float.intBitsToFloat(i3) >= U0() + F0.c(I0, getLayoutDirection())) {
                    return false;
                }
                int i4 = (int) (j2 & 4294967295L);
                return Float.intBitsToFloat(i4) >= ((float) (-F0.h(I0))) && Float.intBitsToFloat(i4) < ((float) (R0() + F0.e(I0)));
            }
            if ((cVar.getKindSet$ui_release() & a2) == 0 || !(cVar instanceof m)) {
                cVar = O0.k.b(r3);
            } else {
                e.c F1 = cVar.F1();
                int i5 = 0;
                r3 = r3;
                cVar = cVar;
                while (F1 != null) {
                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                        i5++;
                        r3 = r3;
                        if (i5 == 1) {
                            cVar = F1;
                        } else {
                            if (r3 == 0) {
                                r3 = new d0.c(new e.c[16], 0);
                            }
                            if (cVar != 0) {
                                r3.b(cVar);
                                cVar = 0;
                            }
                            r3.b(F1);
                        }
                    }
                    F1 = F1.getChild$ui_release();
                    r3 = r3;
                    cVar = cVar;
                }
                if (i5 != 1) {
                    cVar = O0.k.b(r3);
                }
            }
        }
        return false;
    }

    public final long a() {
        return T0();
    }

    public final boolean a3(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < ((float) U0()) && intBitsToFloat2 < ((float) R0());
    }

    public u0.h b0(M0.p pVar, boolean z) {
        if (!g()) {
            L0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!pVar.g()) {
            L0.a.b("LayoutCoordinates " + pVar + " is not attached!");
        }
        e0 z3 = z3(pVar);
        z3.d3();
        e0 y2 = y2(z3);
        u0.d L2 = L2();
        L2.i(0.0f);
        L2.k(0.0f);
        L2.j((int) (pVar.a() >> 32));
        L2.h((int) (pVar.a() & 4294967295L));
        while (z3 != y2) {
            q3(z3, L2, z, false, 4, null);
            if (L2.f()) {
                return u0.h.e.a();
            }
            z3 = z3.u;
            kotlin.jvm.internal.t.d(z3);
        }
        q2(y2, L2, z);
        return u0.e.a(L2);
    }

    public final boolean b3() {
        if (this.M != null && this.A <= 0.0f) {
            return true;
        }
        e0 e0Var = this.u;
        if (e0Var != null) {
            return e0Var.b3();
        }
        return false;
    }

    public final long c3(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float max = Math.max(0.0f, intBitsToFloat < 0.0f ? -intBitsToFloat : intBitsToFloat - U0());
        return u0.f.e((Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) < 0.0f ? -r6 : r6 - R0())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32));
    }

    public void d1(long j2, float f2, y0.c cVar) {
        if (!this.r) {
            n3(j2, f2, null, cVar);
            return;
        }
        U I2 = I2();
        kotlin.jvm.internal.t.d(I2);
        n3(I2.P1(), f2, null, cVar);
    }

    public final void d3() {
        L1().d0().H();
    }

    public float e1() {
        return L1().R().e1();
    }

    public void e3() {
        o0 o0Var = this.M;
        if (o0Var != null) {
            o0Var.invalidate();
        }
    }

    public final void f3() {
        r3();
    }

    public boolean g() {
        return N2().isAttached();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [d0.c] */
    public void g3(int i2, int i3) {
        e0 e0Var;
        o0 o0Var = this.M;
        if (o0Var != null) {
            o0Var.d(n1.r.c((i2 << 32) | (i3 & 4294967295L)));
        } else if (L1().p() && (e0Var = this.u) != null) {
            e0Var.Y2();
        }
        g1(n1.r.c((i3 & 4294967295L) | (i2 << 32)));
        if (this.x != null) {
            H3(false);
        }
        int a2 = g0.a(4);
        boolean i4 = h0.i(a2);
        e.c N2 = N2();
        if (i4 || (N2 = N2.getParent$ui_release()) != null) {
            for (e.c k2 = k2(this, i4); k2 != null && (k2.getAggregateChildKindSet$ui_release() & a2) != 0; k2 = k2.getChild$ui_release()) {
                if ((k2.getKindSet$ui_release() & a2) != 0) {
                    m mVar = k2;
                    ?? r4 = 0;
                    while (mVar != 0) {
                        if (mVar instanceof t) {
                            ((t) mVar).onMeasureResultChanged();
                        } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof m)) {
                            e.c F1 = mVar.F1();
                            int i5 = 0;
                            mVar = mVar;
                            r4 = r4;
                            while (F1 != null) {
                                if ((F1.getKindSet$ui_release() & a2) != 0) {
                                    i5++;
                                    r4 = r4;
                                    if (i5 == 1) {
                                        mVar = F1;
                                    } else {
                                        if (r4 == 0) {
                                            r4 = new d0.c(new e.c[16], 0);
                                        }
                                        if (mVar != 0) {
                                            r4.b(mVar);
                                            mVar = 0;
                                        }
                                        r4.b(F1);
                                    }
                                }
                                F1 = F1.getChild$ui_release();
                                mVar = mVar;
                                r4 = r4;
                            }
                            if (i5 == 1) {
                            }
                        }
                        mVar = O0.k.b(r4);
                    }
                }
                if (k2 == N2) {
                    break;
                }
            }
        }
        p0 y0 = L1().y0();
        if (y0 != null) {
            y0.w(L1());
        }
    }

    public float getDensity() {
        return L1().R().getDensity();
    }

    public n1.t getLayoutDirection() {
        return L1().getLayoutDirection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    public final void h3() {
        e.c parent$ui_release;
        if (R2(g0.a(128))) {
            l.a aVar = l0.l.e;
            l0.l d2 = aVar.d();
            Qa.l g2 = d2 != null ? d2.g() : null;
            l0.l e2 = aVar.e(d2);
            try {
                int a2 = g0.a(128);
                boolean i2 = h0.i(a2);
                if (!i2) {
                    parent$ui_release = N2().getParent$ui_release();
                    if (parent$ui_release == null) {
                    }
                    Ca.I i3 = Ca.I.a;
                    aVar.l(d2, e2, g2);
                }
                parent$ui_release = N2();
                for (e.c k2 = k2(this, i2); k2 != null && (k2.getAggregateChildKindSet$ui_release() & a2) != 0; k2 = k2.getChild$ui_release()) {
                    if ((k2.getKindSet$ui_release() & a2) != 0) {
                        ?? r10 = 0;
                        m mVar = k2;
                        while (mVar != 0) {
                            if (mVar instanceof D) {
                                ((D) mVar).J(T0());
                            } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof m)) {
                                e.c F1 = mVar.F1();
                                int i4 = 0;
                                mVar = mVar;
                                r10 = r10;
                                while (F1 != null) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                                        i4++;
                                        r10 = r10;
                                        if (i4 == 1) {
                                            mVar = F1;
                                        } else {
                                            if (r10 == 0) {
                                                r10 = new d0.c(new e.c[16], 0);
                                            }
                                            if (mVar != 0) {
                                                r10.b(mVar);
                                                mVar = 0;
                                            }
                                            r10.b(F1);
                                        }
                                    }
                                    F1 = F1.getChild$ui_release();
                                    mVar = mVar;
                                    r10 = r10;
                                }
                                if (i4 == 1) {
                                }
                            }
                            mVar = O0.k.b(r10);
                        }
                    }
                    if (k2 == parent$ui_release) {
                        break;
                    }
                }
                Ca.I i32 = Ca.I.a;
                aVar.l(d2, e2, g2);
            } catch (Throwable th) {
                aVar.l(d2, e2, g2);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void i3() {
        int a2 = g0.a(128);
        boolean i2 = h0.i(a2);
        e.c N2 = N2();
        if (!i2 && (N2 = N2.getParent$ui_release()) == null) {
            return;
        }
        for (e.c k2 = k2(this, i2); k2 != null && (k2.getAggregateChildKindSet$ui_release() & a2) != 0; k2 = k2.getChild$ui_release()) {
            if ((k2.getKindSet$ui_release() & a2) != 0) {
                m mVar = k2;
                ?? r5 = 0;
                while (mVar != 0) {
                    if (mVar instanceof D) {
                        ((D) mVar).l0(this);
                    } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof m)) {
                        e.c F1 = mVar.F1();
                        int i3 = 0;
                        mVar = mVar;
                        r5 = r5;
                        while (F1 != null) {
                            if ((F1.getKindSet$ui_release() & a2) != 0) {
                                i3++;
                                r5 = r5;
                                if (i3 == 1) {
                                    mVar = F1;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new d0.c(new e.c[16], 0);
                                    }
                                    if (mVar != 0) {
                                        r5.b(mVar);
                                        mVar = 0;
                                    }
                                    r5.b(F1);
                                }
                            }
                            F1 = F1.getChild$ui_release();
                            mVar = mVar;
                            r5 = r5;
                        }
                        if (i3 == 1) {
                        }
                    }
                    mVar = O0.k.b(r5);
                }
            }
            if (k2 == N2) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public Object j() {
        if (!L1().s0().p(g0.a(64))) {
            return null;
        }
        N2();
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        for (e.c o2 = L1().s0().o(); o2 != null; o2 = o2.getParent$ui_release()) {
            if ((g0.a(64) & o2.getKindSet$ui_release()) != 0) {
                int a2 = g0.a(64);
                ?? r6 = 0;
                m mVar = o2;
                while (mVar != 0) {
                    if (mVar instanceof s0) {
                        o.a = ((s0) mVar).p(L1().R(), o.a);
                    } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof m)) {
                        e.c F1 = mVar.F1();
                        int i2 = 0;
                        mVar = mVar;
                        r6 = r6;
                        while (F1 != null) {
                            if ((F1.getKindSet$ui_release() & a2) != 0) {
                                i2++;
                                r6 = r6;
                                if (i2 == 1) {
                                    mVar = F1;
                                } else {
                                    if (r6 == 0) {
                                        r6 = new d0.c(new e.c[16], 0);
                                    }
                                    if (mVar != 0) {
                                        r6.b(mVar);
                                        mVar = 0;
                                    }
                                    r6.b(F1);
                                }
                            }
                            F1 = F1.getChild$ui_release();
                            mVar = mVar;
                            r6 = r6;
                        }
                        if (i2 == 1) {
                        }
                    }
                    mVar = O0.k.b(r6);
                }
            }
        }
        return o.a;
    }

    public final void j3() {
        this.v = true;
        this.K.invoke();
        r3();
    }

    public final void k3() {
        if (R2(g0.a(1048576))) {
            int a2 = g0.a(1048576);
            boolean i2 = h0.i(a2);
            e.c N2 = N2();
            if (!i2 && (N2 = N2.getParent$ui_release()) == null) {
                return;
            }
            for (e.c k2 = k2(this, i2); k2 != null && (k2.getAggregateChildKindSet$ui_release() & a2) != 0; k2 = k2.getChild$ui_release()) {
                if ((k2.getKindSet$ui_release() & a2) != 0) {
                    e.c cVar = k2;
                    d0.c cVar2 = null;
                    while (cVar != null) {
                        if ((cVar.getKindSet$ui_release() & a2) == 0 || !(cVar instanceof m)) {
                            cVar = O0.k.b(cVar2);
                        } else {
                            int i3 = 0;
                            for (e.c F1 = ((m) cVar).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                if ((F1.getKindSet$ui_release() & a2) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        cVar = F1;
                                    } else {
                                        if (cVar2 == null) {
                                            cVar2 = new d0.c(new e.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            cVar2.b(cVar);
                                            cVar = null;
                                        }
                                        cVar2.b(F1);
                                    }
                                }
                            }
                            if (i3 != 1) {
                                cVar = O0.k.b(cVar2);
                            }
                        }
                    }
                }
                if (k2 == N2) {
                    return;
                }
            }
        }
    }

    public void l0(M0.p pVar, float[] fArr) {
        e0 z3 = z3(pVar);
        z3.d3();
        e0 y2 = y2(z3);
        g1.h(fArr);
        z3.E3(y2, fArr);
        D3(y2, fArr);
    }

    public final void l3(e.c cVar, f fVar, long j2, w wVar, int i2, boolean z, float f2, boolean z2) {
        if (cVar == null) {
            X2(fVar, j2, wVar, i2, z);
            return;
        }
        if (Z2(cVar, j2, i2)) {
            wVar.p(cVar, z, new j(cVar, fVar, j2, wVar, i2, z, f2, z2));
        } else if (z2) {
            V2(cVar, fVar, j2, wVar, i2, z, f2);
        } else {
            y3(cVar, fVar, j2, wVar, i2, z, f2);
        }
    }

    public abstract void m3(v0.j0 j0Var, y0.c cVar);

    public final void n3(long j2, float f2, Qa.l lVar, y0.c cVar) {
        if (cVar != null) {
            if (!(lVar == null)) {
                L0.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.N != cVar) {
                this.N = null;
                G3(this, null, false, 2, null);
                this.N = cVar;
            }
            if (this.M == null) {
                o0 o = N.b(L1()).o(D2(), this.K, cVar);
                o.d(T0());
                o.j(j2);
                this.M = o;
                L1().O1(true);
                this.K.invoke();
            }
        } else {
            if (this.N != null) {
                this.N = null;
                G3(this, null, false, 2, null);
            }
            G3(this, lVar, false, 2, null);
        }
        if (!n1.n.j(P1(), j2)) {
            N.b(L1()).A(o0.i.a.a());
            u3(j2);
            L1().d0().v().d2();
            o0 o0Var = this.M;
            if (o0Var != null) {
                o0Var.j(j2);
            } else {
                e0 e0Var = this.u;
                if (e0Var != null) {
                    e0Var.Y2();
                }
            }
            d0.c H0 = L1().H0();
            Object[] objArr = H0.a;
            int m = H0.m();
            for (int i2 = 0; i2 < m; i2++) {
                ((J) objArr[i2]).R0();
            }
            R1(this);
            p0 y0 = L1().y0();
            if (y0 != null) {
                y0.w(L1());
            }
        }
        this.E = f2;
        if (!U1()) {
            G1(M1());
        }
        if (this == L1().v0()) {
            N.b(L1()).getRectManager().k(L1(), !L1().l0().T1());
        }
    }

    public final void o3(long j2, float f2, Qa.l lVar, y0.c cVar) {
        n3(n1.n.o(j2, M0()), f2, lVar, cVar);
    }

    public final void p3(u0.d dVar, boolean z, boolean z2) {
        o0 o0Var = this.M;
        if (o0Var != null) {
            if (this.w) {
                if (z2) {
                    long J2 = J2();
                    float intBitsToFloat = Float.intBitsToFloat((int) (J2 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (J2 & 4294967295L)) / 2.0f;
                    dVar.e(-intBitsToFloat, -intBitsToFloat2, ((int) (a() >> 32)) + intBitsToFloat, ((int) (4294967295L & a())) + intBitsToFloat2);
                } else if (z) {
                    dVar.e(0.0f, 0.0f, (int) (a() >> 32), (int) (4294967295L & a()));
                }
                if (dVar.f()) {
                    return;
                }
            }
            o0Var.e(dVar, false);
        }
        float k2 = n1.n.k(P1());
        dVar.i(dVar.b() + k2);
        dVar.j(dVar.c() + k2);
        float l2 = n1.n.l(P1());
        dVar.k(dVar.d() + l2);
        dVar.h(dVar.a() + l2);
    }

    public long q(long j2) {
        if (!g()) {
            L0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return P(M0.q.d(this), N.b(L1()).q(j2));
    }

    public final void q2(e0 e0Var, u0.d dVar, boolean z) {
        if (e0Var == this) {
            return;
        }
        e0 e0Var2 = this.u;
        if (e0Var2 != null) {
            e0Var2.q2(e0Var, dVar, z);
        }
        B2(dVar, z);
    }

    public final long r2(e0 e0Var, long j2, boolean z) {
        if (e0Var == this) {
            return j2;
        }
        e0 e0Var2 = this.u;
        return (e0Var2 == null || kotlin.jvm.internal.t.c(e0Var, e0Var2)) ? z2(j2, z) : z2(e0Var2.r2(e0Var, j2, z), z);
    }

    public final void r3() {
        if (this.M != null) {
            if (this.N != null) {
                this.N = null;
            }
            G3(this, null, false, 2, null);
            J.F1(L1(), false, 1, null);
        }
    }

    public final long s2(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - U0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - R0();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return u0.l.d((Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32));
    }

    public final void s3(boolean z) {
        this.r = z;
    }

    public final float t2(long j2, long j3) {
        if (U0() >= Float.intBitsToFloat((int) (j3 >> 32)) && R0() >= Float.intBitsToFloat((int) (j3 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long s2 = s2(j3);
        float intBitsToFloat = Float.intBitsToFloat((int) (s2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (s2 & 4294967295L));
        long c3 = c3(j2);
        if ((intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (c3 >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int) (c3 & 4294967295L)) <= intBitsToFloat2) {
            return u0.f.l(c3);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t3(M0.C r4) {
        /*
            r3 = this;
            M0.C r0 = r3.B
            if (r4 == r0) goto L8c
            r3.B = r4
            if (r0 == 0) goto L1c
            int r1 = r4.getWidth()
            int r2 = r0.getWidth()
            if (r1 != r2) goto L1c
            int r1 = r4.getHeight()
            int r0 = r0.getHeight()
            if (r1 == r0) goto L27
        L1c:
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            r3.g3(r0, r1)
        L27:
            w.K r0 = r3.C
            if (r0 == 0) goto L34
            kotlin.jvm.internal.t.d(r0)
            boolean r0 = r0.h()
            if (r0 != 0) goto L3e
        L34:
            java.util.Map r0 = r4.z()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8c
        L3e:
            w.K r0 = r3.C
            java.util.Map r1 = r4.z()
            boolean r0 = O0.f0.a(r0, r1)
            if (r0 != 0) goto L8c
            O0.b r0 = r3.C2()
            O0.a r0 = r0.z()
            r0.m()
            w.K r0 = r3.C
            if (r0 != 0) goto L5f
            w.K r0 = w.U.b()
            r3.C = r0
        L5f:
            r0.j()
            java.util.Map r4 = r4.z()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L6e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.u(r2, r1)
            goto L6e
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.e0.t3(M0.C):void");
    }

    public final void u2(v0.j0 j0Var, y0.c cVar) {
        o0 o0Var = this.M;
        if (o0Var != null) {
            o0Var.l(j0Var, cVar);
            return;
        }
        float k2 = n1.n.k(P1());
        float l2 = n1.n.l(P1());
        j0Var.d(k2, l2);
        w2(j0Var, cVar);
        j0Var.d(-k2, -l2);
    }

    public void u3(long j2) {
        this.D = j2;
    }

    public long v0(long j2) {
        return N.b(L1()).g(E0(j2));
    }

    public final void v2(v0.j0 j0Var, k1 k1Var) {
        j0Var.q(0.5f, 0.5f, ((int) (T0() >> 32)) - 0.5f, ((int) (T0() & 4294967295L)) - 0.5f, k1Var);
    }

    public final void v3(e0 e0Var) {
        this.t = e0Var;
    }

    public final void w2(v0.j0 j0Var, y0.c cVar) {
        e.c S2 = S2(g0.a(4));
        if (S2 == null) {
            m3(j0Var, cVar);
        } else {
            L1().k0().g(j0Var, n1.s.d(a()), this, S2, cVar);
        }
    }

    public final void w3(e0 e0Var) {
        this.u = e0Var;
    }

    public void x0(float[] fArr) {
        p0 b2 = N.b(L1());
        e0 z3 = z3(M0.q.d(this));
        E3(z3, fArr);
        if (b2 instanceof I0.h) {
            ((I0.h) b2).n(fArr);
            return;
        }
        long g2 = M0.q.g(z3);
        if ((9223372034707292159L & g2) != 9205357640488583168L) {
            g1.n(fArr, Float.intBitsToFloat((int) (g2 >> 32)), Float.intBitsToFloat((int) (g2 & 4294967295L)), 0.0f);
        }
    }

    public abstract void x2();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final boolean x3() {
        e.c T2 = T2(h0.i(g0.a(16)));
        if (T2 != null && T2.isAttached()) {
            int a2 = g0.a(16);
            if (!T2.getNode().isAttached()) {
                L0.a.b("visitLocalDescendants called on an unattached node");
            }
            e.c node = T2.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & a2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & a2) != 0) {
                        m mVar = node;
                        ?? r6 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof v0) {
                                if (((v0) mVar).v1()) {
                                    return true;
                                }
                            } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof m)) {
                                e.c F1 = mVar.F1();
                                int i2 = 0;
                                mVar = mVar;
                                r6 = r6;
                                while (F1 != null) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            mVar = F1;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new d0.c(new e.c[16], 0);
                                            }
                                            if (mVar != 0) {
                                                r6.b(mVar);
                                                mVar = 0;
                                            }
                                            r6.b(F1);
                                        }
                                    }
                                    F1 = F1.getChild$ui_release();
                                    mVar = mVar;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            mVar = O0.k.b(r6);
                        }
                    }
                    node = node.getChild$ui_release();
                }
            }
        }
        return false;
    }

    public final e0 y2(e0 e0Var) {
        J L1 = e0Var.L1();
        J L12 = L1();
        if (L1 == L12) {
            e.c N2 = e0Var.N2();
            e.c N22 = N2();
            int a2 = g0.a(2);
            if (!N22.getNode().isAttached()) {
                L0.a.b("visitLocalAncestors called on an unattached node");
            }
            for (e.c parent$ui_release = N22.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & a2) != 0 && parent$ui_release == N2) {
                    return e0Var;
                }
            }
            return this;
        }
        while (L1.S() > L12.S()) {
            L1 = L1.z0();
            kotlin.jvm.internal.t.d(L1);
        }
        while (L12.S() > L1.S()) {
            L12 = L12.z0();
            kotlin.jvm.internal.t.d(L12);
        }
        while (L1 != L12) {
            L1 = L1.z0();
            L12 = L12.z0();
            if (L1 == null || L12 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return L12 == L1() ? this : L1 == e0Var.L1() ? e0Var : L1.X();
    }

    public final void y3(e.c cVar, f fVar, long j2, w wVar, int i2, boolean z, float f2) {
        if (cVar == null) {
            X2(fVar, j2, wVar, i2, z);
        } else if (fVar.c(cVar)) {
            wVar.v(cVar, f2, z, new k(cVar, fVar, j2, wVar, i2, z, f2));
        } else {
            l3(f0.b(cVar, fVar.a(), g0.a(2)), fVar, j2, wVar, i2, z, f2, false);
        }
    }

    public long z2(long j2, boolean z) {
        if (z || !T1()) {
            j2 = n1.o.b(j2, P1());
        }
        o0 o0Var = this.M;
        return o0Var != null ? o0Var.c(j2, true) : j2;
    }

    public final e0 z3(M0.p pVar) {
        e0 b2;
        M0.y yVar = pVar instanceof M0.y ? (M0.y) pVar : null;
        if (yVar != null && (b2 = yVar.b()) != null) {
            return b2;
        }
        kotlin.jvm.internal.t.e(pVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (e0) pVar;
    }

    public M0.p x() {
        return this;
    }
}

package androidx.compose.ui.layout;

import Ca.I;
import M0.S;
import O0.J;
import O0.J0;
import O0.N;
import O0.U;
import O0.V;
import O0.X;
import O0.c0;
import O0.n0;
import P0.h1;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.z;
import b0.C0;
import b0.N0;
import b0.Q0;
import b0.U1;
import b0.y1;
import java.util.List;
import java.util.Map;
import l0.l;
import w.G;
import w.P;
import w.d0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j implements b0.i {
    public final J a;
    public b0.y b;
    public A c;
    public int d;
    public int e;
    public int n;
    public int o;
    public final P f = d0.b();
    public final P g = d0.b();
    public final c h = new c();
    public final a i = new a();
    public final P j = d0.b();
    public final A.a k = new A.a(null, 1, null);
    public final P l = d0.b();
    public final d0.c m = new d0.c(new Object[16], 0);
    public final String p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public final class a implements S, l {
        public final /* synthetic */ c a;

        public a() {
            this.a = j.k(j.this);
        }

        public float A(int i) {
            return this.a.A(i);
        }

        public long M(float f) {
            return this.a.M(f);
        }

        public long N(long j) {
            return this.a.N(j);
        }

        public float S(long j) {
            return this.a.S(j);
        }

        public long X(float f) {
            return this.a.X(f);
        }

        public List Y(Object obj, Qa.p pVar) {
            J j = (J) j.m(j.this).e(obj);
            return (j == null || j.j(j.this).T().indexOf(j) >= j.g(j.this)) ? j.b(j.this, obj, pVar) : j.O();
        }

        public float a1(float f) {
            return this.a.a1(f);
        }

        public float e1() {
            return this.a.e1();
        }

        public M0.C f0(int i, int i2, Map map, Qa.l lVar) {
            return this.a.f0(i, i2, map, lVar);
        }

        public float getDensity() {
            return this.a.getDensity();
        }

        public n1.t getLayoutDirection() {
            return this.a.getLayoutDirection();
        }

        public boolean h0() {
            return this.a.h0();
        }

        public M0.C h1(int i, int i2, Map map, Qa.l lVar, Qa.l lVar2) {
            return this.a.h1(i, i2, map, lVar, lVar2);
        }

        public float j1(float f) {
            return this.a.j1(f);
        }

        public int s0(float f) {
            return this.a.s0(f);
        }

        public long w1(long j) {
            return this.a.w1(j);
        }

        public float y0(long j) {
            return this.a.y0(j);
        }
    }

    public final class c implements S {
        public n1.t a = n1.t.b;
        public float b;
        public float c;

        public static final class a implements M0.C {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ Map c;
            public final /* synthetic */ Qa.l d;
            public final /* synthetic */ c e;
            public final /* synthetic */ j f;
            public final /* synthetic */ Qa.l g;

            public a(int i, int i2, Map map, Qa.l lVar, c cVar, j jVar, Qa.l lVar2) {
                this.a = i;
                this.b = i2;
                this.c = map;
                this.d = lVar;
                this.e = cVar;
                this.f = jVar;
                this.g = lVar2;
            }

            public void A() {
                U I2;
                if (!this.e.h0() || (I2 = j.j(this.f).X().I2()) == null) {
                    this.g.invoke(j.j(this.f).X().O1());
                } else {
                    this.g.invoke(I2.O1());
                }
            }

            public Qa.l B() {
                return this.d;
            }

            public int getHeight() {
                return this.b;
            }

            public int getWidth() {
                return this.a;
            }

            public Map z() {
                return this.c;
            }
        }

        public c() {
        }

        public List Y(Object obj, Qa.p pVar) {
            return j.this.P(obj, pVar);
        }

        public float e1() {
            return this.c;
        }

        public void g(float f) {
            this.b = f;
        }

        public float getDensity() {
            return this.b;
        }

        public n1.t getLayoutDirection() {
            return this.a;
        }

        public boolean h0() {
            return j.j(j.this).f0() == J.e.d || j.j(j.this).f0() == J.e.b;
        }

        public M0.C h1(int i, int i2, Map map, Qa.l lVar, Qa.l lVar2) {
            if (!((i & (-16777216)) == 0 && ((-16777216) & i2) == 0)) {
                L0.a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i, i2, map, lVar, this, j.this, lVar2);
        }

        public void j(float f) {
            this.c = f;
        }

        public void p(n1.t tVar) {
            this.a = tVar;
        }
    }

    public static final class d extends J.f {
        public final /* synthetic */ Qa.p c;

        public static final class a implements M0.C {
            public final /* synthetic */ M0.C a;
            public final /* synthetic */ j b;
            public final /* synthetic */ int c;
            public final /* synthetic */ M0.C d;

            public a(M0.C c, j jVar, int i, M0.C c2) {
                this.b = jVar;
                this.c = i;
                this.d = c2;
                this.a = c;
            }

            public void A() {
                j.n(this.b, this.c);
                this.d.A();
                j.d(this.b);
            }

            public Qa.l B() {
                return this.a.B();
            }

            public int getHeight() {
                return this.a.getHeight();
            }

            public int getWidth() {
                return this.a.getWidth();
            }

            public Map z() {
                return this.a.z();
            }
        }

        public static final class b implements M0.C {
            public final /* synthetic */ M0.C a;
            public final /* synthetic */ j b;
            public final /* synthetic */ int c;
            public final /* synthetic */ M0.C d;

            public b(M0.C c, j jVar, int i, M0.C c2) {
                this.b = jVar;
                this.c = i;
                this.d = c2;
                this.a = c;
            }

            public void A() {
                j.o(this.b, this.c);
                this.d.A();
                j jVar = this.b;
                jVar.y(j.g(jVar));
            }

            public Qa.l B() {
                return this.a.B();
            }

            public int getHeight() {
                return this.a.getHeight();
            }

            public int getWidth() {
                return this.a.getWidth();
            }

            public Map z() {
                return this.a.z();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Qa.p pVar, String str) {
            super(str);
            this.c = pVar;
        }

        public M0.C measure-3p2s80s(l lVar, List list, long j) {
            j.k(j.this).p(lVar.getLayoutDirection());
            j.k(j.this).g(lVar.getDensity());
            j.k(j.this).j(lVar.e1());
            if (lVar.h0() || j.j(j.this).j0() == null) {
                j.o(j.this, 0);
                M0.C c = (M0.C) this.c.invoke(j.k(j.this), n1.b.a(j));
                return new b(c, j.this, j.g(j.this), c);
            }
            j.n(j.this, 0);
            M0.C c2 = (M0.C) this.c.invoke(j.e(j.this), n1.b.a(j));
            return new a(c2, j.this, j.f(j.this), c2);
        }
    }

    public static final class e implements z.a {
        public void dispose() {
        }
    }

    public static final class f implements z.a {
        public final G a = w.r.b();
        public final /* synthetic */ Object c;

        public f(Object obj) {
            this.c = obj;
        }

        public void a(int i, long j) {
            J j2 = (J) j.i(j.this).e(this.c);
            if (j2 == null || !j2.g()) {
                return;
            }
            int size = j2.P().size();
            if (i < 0 || i >= size) {
                L0.a.d("Index (" + i + ") is out of bound of [0, " + size + ')');
            }
            if (j2.p()) {
                L0.a.a("Pre-measure called on node that is not placed");
            }
            J j3 = j.j(j.this);
            J.v(j3, true);
            N.b(j2).I((J) j2.P().get(i), j);
            I i2 = I.a;
            J.v(j3, false);
            this.a.g(i);
        }

        public void b(Object obj, Qa.l lVar) {
            c0 s0;
            e.c k;
            J j = (J) j.i(j.this).e(this.c);
            if (j == null || (s0 = j.s0()) == null || (k = s0.k()) == null) {
                return;
            }
            J0.e(k, obj, lVar);
        }

        public int c() {
            List P;
            J j = (J) j.i(j.this).e(this.c);
            if (j == null || (P = j.P()) == null) {
                return 0;
            }
            return P.size();
        }

        public void dispose() {
            j.c(j.this, this.c);
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar) {
            super(0);
            this.a = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            y1 c;
            if (this.a.a() || (c = this.a.c()) == null) {
                return;
            }
            c.s();
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ b a;
        public final /* synthetic */ Qa.p b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, Qa.p pVar) {
            super(2);
            this.a = bVar;
            this.b = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if (!mVar.o((i & 3) != 2, i & 1)) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(1524156494, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:683)");
            }
            boolean a = this.a.a();
            Qa.p pVar = this.b;
            mVar.K(207, Boolean.valueOf(a));
            boolean a2 = mVar.a(a);
            if (a) {
                pVar.invoke(mVar, 0);
            } else {
                mVar.h(a2);
            }
            mVar.A();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public j(J j, A a2) {
        this.a = j;
        this.c = a2;
    }

    private final n0 C() {
        if (o0.h.h) {
            return N.b(this.a).getOutOfFrameExecutor();
        }
        return null;
    }

    public static /* synthetic */ void H(j jVar, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        jVar.G(i, i2, i3);
    }

    public static /* synthetic */ boolean a() {
        return q();
    }

    public static final /* synthetic */ List b(j jVar, Object obj, Qa.p pVar) {
        return jVar.r(obj, pVar);
    }

    public static final /* synthetic */ void c(j jVar, Object obj) {
        jVar.z(obj);
    }

    public static final /* synthetic */ void d(j jVar) {
        jVar.A();
    }

    public static final /* synthetic */ a e(j jVar) {
        return jVar.i;
    }

    public static final /* synthetic */ int f(j jVar) {
        return jVar.e;
    }

    public static final /* synthetic */ int g(j jVar) {
        return jVar.d;
    }

    public static final /* synthetic */ P i(j jVar) {
        return jVar.j;
    }

    public static final /* synthetic */ J j(j jVar) {
        return jVar.a;
    }

    public static final /* synthetic */ c k(j jVar) {
        return jVar.h;
    }

    public static final /* synthetic */ P m(j jVar) {
        return jVar.g;
    }

    public static final /* synthetic */ void n(j jVar, int i) {
        jVar.e = i;
    }

    public static final /* synthetic */ void o(j jVar, int i) {
        jVar.d = i;
    }

    public static final boolean q() {
        return false;
    }

    public final void A() {
        P p = this.l;
        long[] jArr = p.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = p.b[i4];
                        z.a aVar = (z.a) p.c[i4];
                        int n = this.m.n(obj);
                        if (n < 0 || n >= this.e) {
                            aVar.dispose();
                            p.v(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B() {
        /*
            r14 = this;
            O0.J r0 = r14.a
            java.util.List r0 = r0.T()
            int r0 = r0.size()
            int r1 = r14.n
            if (r1 == r0) goto L83
            w.P r0 = r14.f
            java.lang.Object[] r1 = r0.c
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L56
            r3 = 0
            r4 = r3
        L1b:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L35:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.layout.j$b r10 = (androidx.compose.ui.layout.j.b) r10
            r11 = 1
            r10.n(r11)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r2) goto L56
            int r4 = r4 + 1
            goto L1b
        L56:
            O0.J r0 = r14.a
            O0.J r0 = r0.j0()
            if (r0 == 0) goto L71
            O0.J r0 = r14.a
            boolean r0 = r0.h0()
            if (r0 != 0) goto L83
            O0.J r1 = r14.a
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            O0.J.D1(r1, r2, r3, r4, r5, r6)
            goto L83
        L71:
            O0.J r0 = r14.a
            boolean r0 = r0.m0()
            if (r0 != 0) goto L83
            O0.J r1 = r14.a
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            O0.J.H1(r1, r2, r3, r4, r5, r6)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.j.B():void");
    }

    public final Object D(List list, int i) {
        Object e2 = this.f.e((J) list.get(i));
        kotlin.jvm.internal.t.d(e2);
        return ((b) e2).h();
    }

    public final void E() {
        int size = this.a.T().size();
        if (!(this.f.g() == size)) {
            L0.a.a("Inconsistency between the count of nodes tracked by the state (" + this.f.g() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.n) - this.o >= 0)) {
            L0.a.a("Incorrect state. Total children " + size + ". Reusable children " + this.n + ". Precomposed children " + this.o);
        }
        if (this.j.g() == this.o) {
            return;
        }
        L0.a.a("Incorrect state. Precomposed children " + this.o + ". Map size " + this.j.g());
    }

    public final void F(boolean z) {
        this.o = 0;
        this.j.k();
        List T = this.a.T();
        int size = T.size();
        if (this.n != size) {
            this.n = size;
            l.a aVar = l0.l.e;
            l0.l d2 = aVar.d();
            Qa.l g2 = d2 != null ? d2.g() : null;
            l0.l e2 = aVar.e(d2);
            for (int i = 0; i < size; i++) {
                try {
                    J j = (J) T.get(i);
                    b bVar = (b) this.f.e(j);
                    if (bVar != null && bVar.a()) {
                        L(j);
                        M(bVar, z);
                        bVar.q(y.c());
                    }
                } catch (Throwable th) {
                    aVar.l(d2, e2, g2);
                    throw th;
                }
            }
            I i2 = I.a;
            aVar.l(d2, e2, g2);
            this.g.k();
        }
        E();
    }

    public final void G(int i, int i2, int i3) {
        J j = j(this);
        J.v(j, true);
        this.a.o1(i, i2, i3);
        I i4 = I.a;
        J.v(j, false);
    }

    public void I() {
        F(false);
    }

    public final z.a J(Object obj, Qa.p pVar) {
        K(obj, pVar, false);
        return v(obj);
    }

    public final void K(Object obj, Qa.p pVar, boolean z) {
        if (this.a.g()) {
            E();
            if (this.g.c(obj)) {
                return;
            }
            this.l.u(obj);
            P p = this.j;
            Object e2 = p.e(obj);
            if (e2 == null) {
                e2 = S(obj);
                if (e2 != null) {
                    G(this.a.T().indexOf(e2), this.a.T().size(), 1);
                    this.o++;
                } else {
                    e2 = u(this.a.T().size());
                    this.o++;
                }
                p.x(obj, e2);
            }
            R((J) e2, obj, z, pVar);
        }
    }

    public final void L(J j) {
        X l0 = j.l0();
        J.g gVar = J.g.c;
        l0.p2(gVar);
        V i0 = j.i0();
        if (i0 != null) {
            i0.n2(gVar);
        }
    }

    public final void M(b bVar, boolean z) {
        y1 c2;
        if (z || !bVar.b()) {
            bVar.j(U1.i(Boolean.FALSE, null, 2, null));
        } else {
            bVar.i(false);
        }
        if (bVar.g() != null) {
            s(bVar);
            return;
        }
        if (z) {
            y1 c3 = bVar.c();
            if (c3 != null) {
                c3.s();
                return;
            }
            return;
        }
        n0 C = C();
        if (C != null) {
            w(bVar, C);
        } else {
            if (bVar.b() || (c2 = bVar.c()) == null) {
                return;
            }
            c2.s();
        }
    }

    public final void N(b0.y yVar) {
        this.b = yVar;
    }

    public final void O(A a2) {
        if (this.c != a2) {
            this.c = a2;
            F(false);
            J.H1(this.a, false, false, false, 7, null);
        }
    }

    public final List P(Object obj, Qa.p pVar) {
        E();
        J.e f0 = this.a.f0();
        J.e eVar = J.e.a;
        if (!(f0 == eVar || f0 == J.e.c || f0 == J.e.b || f0 == J.e.d)) {
            L0.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        P p = this.g;
        Object e2 = p.e(obj);
        if (e2 == null) {
            e2 = (J) this.j.u(obj);
            if (e2 != null) {
                if (!(this.o > 0)) {
                    L0.a.b("Check failed.");
                }
                this.o--;
            } else {
                e2 = S(obj);
                if (e2 == null) {
                    e2 = u(this.d);
                }
            }
            p.x(obj, e2);
        }
        J j = (J) e2;
        if (Da.D.i0(this.a.T(), this.d) != j) {
            int indexOf = this.a.T().indexOf(j);
            if (!(indexOf >= this.d)) {
                L0.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i = this.d;
            if (i != indexOf) {
                H(this, indexOf, i, 0, 4, null);
            }
        }
        this.d++;
        R(j, obj, false, pVar);
        return (f0 == eVar || f0 == J.e.c) ? j.O() : j.N();
    }

    public final void Q(J j, b bVar, boolean z) {
        if (!(bVar.g() == null)) {
            L0.a.a("new subcompose call while paused composition is still active");
        }
        l.a aVar = l0.l.e;
        l0.l d2 = aVar.d();
        Qa.l g2 = d2 != null ? d2.g() : null;
        l0.l e2 = aVar.e(d2);
        try {
            J j2 = j(this);
            J.v(j2, true);
            y1 c2 = bVar.c();
            b0.y yVar = this.b;
            if (yVar == null) {
                L0.a.c("parent composition reference not set");
                throw new Ca.i();
            }
            if (c2 == null || c2.e()) {
                c2 = z ? h1.a(j, yVar) : h1.b(j, yVar);
            }
            bVar.l(c2);
            Qa.p d3 = bVar.d();
            if (C() != null) {
                bVar.k(false);
            } else {
                bVar.k(true);
                d3 = j0.i.b(1524156494, true, new h(bVar, d3));
            }
            if (z) {
                kotlin.jvm.internal.t.e(c2, "null cannot be cast to non-null type androidx.compose.runtime.PausableComposition");
                if (bVar.f()) {
                    bVar.p(((N0) c2).g(d3));
                } else {
                    bVar.p(((N0) c2).c(d3));
                }
            } else if (bVar.f()) {
                c2.l(d3);
            } else {
                c2.y(d3);
            }
            bVar.o(false);
            I i = I.a;
            J.v(j2, false);
            aVar.l(d2, e2, g2);
        } catch (Throwable th) {
            aVar.l(d2, e2, g2);
            throw th;
        }
    }

    public final void R(J j, Object obj, boolean z, Qa.p pVar) {
        P p = this.f;
        Object e2 = p.e(j);
        if (e2 == null) {
            e2 = new b(obj, M0.e.a.a(), null, 4, null);
            p.x(j, e2);
        }
        b bVar = (b) e2;
        boolean z2 = bVar.d() != pVar;
        if (bVar.g() != null) {
            if (z2) {
                s(bVar);
            } else if (z) {
                return;
            } else {
                p(bVar, true);
            }
        }
        y1 c2 = bVar.c();
        boolean t = c2 != null ? c2.t() : true;
        if (z2 || t || bVar.e()) {
            bVar.m(pVar);
            Q(j, bVar, z);
            bVar.n(false);
        }
    }

    public final J S(Object obj) {
        int i;
        if (this.n == 0) {
            return null;
        }
        List T = this.a.T();
        int size = T.size() - this.o;
        int i2 = size - this.n;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.t.c(D(T, i4), obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                Object e2 = this.f.e((J) T.get(i3));
                kotlin.jvm.internal.t.d(e2);
                b bVar = (b) e2;
                if (bVar.h() == y.c() || this.c.b(obj, bVar.h())) {
                    bVar.q(obj);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            G(i4, i2, 1);
        }
        this.n--;
        J j = (J) T.get(i2);
        Object e3 = this.f.e(j);
        kotlin.jvm.internal.t.d(e3);
        b bVar2 = (b) e3;
        bVar2.j(U1.i(Boolean.TRUE, null, 2, null));
        bVar2.o(true);
        bVar2.n(true);
        return j;
    }

    public void h() {
        F(true);
    }

    public void l() {
        x();
    }

    public final void p(b bVar, boolean z) {
        Q0 g2 = bVar.g();
        if (g2 != null) {
            l.a aVar = l0.l.e;
            l0.l d2 = aVar.d();
            Qa.l g3 = d2 != null ? d2.g() : null;
            l0.l e2 = aVar.e(d2);
            try {
                J j = j(this);
                J.v(j, true);
                if (z) {
                    while (!g2.b()) {
                        g2.a(new M0.x());
                    }
                }
                g2.apply();
                bVar.p(null);
                I i = I.a;
                J.v(j, false);
                aVar.l(d2, e2, g3);
            } catch (Throwable th) {
                aVar.l(d2, e2, g3);
                throw th;
            }
        }
    }

    public final List r(Object obj, Qa.p pVar) {
        if (!(this.m.m() >= this.e)) {
            L0.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int m = this.m.m();
        int i = this.e;
        if (m == i) {
            this.m.b(obj);
        } else {
            this.m.y(i, obj);
        }
        this.e++;
        if (this.j.b(obj)) {
            J j = (J) this.j.e(obj);
            b bVar = j != null ? (b) this.f.e(j) : null;
            if (bVar != null && bVar.e()) {
                R(j, obj, false, pVar);
            }
        } else {
            this.l.x(obj, J(obj, pVar));
            if (this.a.f0() == J.e.c) {
                this.a.A1(true);
            } else {
                J.D1(this.a, true, false, false, 6, null);
            }
        }
        J j2 = (J) this.j.e(obj);
        if (j2 != null) {
            List I1 = j2.l0().I1();
            int size = I1.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((X) I1.get(i2)).Y1();
            }
            if (I1 != null) {
                return I1;
            }
        }
        return Da.v.n();
    }

    public final void s(b bVar) {
        Q0 g2 = bVar.g();
        if (g2 != null) {
            g2.cancel();
            bVar.p(null);
            y1 c2 = bVar.c();
            if (c2 != null) {
                c2.dispose();
            }
            bVar.l(null);
        }
    }

    public final M0.B t(Qa.p pVar) {
        return new d(pVar, this.p);
    }

    public final J u(int i) {
        J j = new J(true, 0, 2, null);
        J j2 = j(this);
        J.v(j2, true);
        this.a.M0(i, j);
        I i2 = I.a;
        J.v(j2, false);
        return j;
    }

    public final z.a v(Object obj) {
        return !this.a.g() ? new e() : new f(obj);
    }

    public final void w(b bVar, n0 n0Var) {
        n0Var.u(new g(bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            r17 = this;
            r0 = r17
            O0.J r1 = r0.a
            r2 = 1
            O0.J.v(r1, r2)
            w.P r3 = r0.f
            java.lang.Object[] r4 = r3.c
            long[] r3 = r3.a
            int r5 = r3.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L53
            r7 = r6
        L15:
            r8 = r3[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2f:
            if (r12 >= r10) goto L4d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4a
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            androidx.compose.ui.layout.j$b r13 = (androidx.compose.ui.layout.j.b) r13
            b0.y1 r13 = r13.c()
            if (r13 == 0) goto L4a
            r13.dispose()
        L4a:
            long r8 = r8 >> r11
            int r12 = r12 + r2
            goto L2f
        L4d:
            if (r10 != r11) goto L53
        L4f:
            if (r7 == r5) goto L53
            int r7 = r7 + r2
            goto L15
        L53:
            O0.J r2 = r0.a
            r2.x1()
            Ca.I r2 = Ca.I.a
            O0.J.v(r1, r6)
            w.P r1 = r0.f
            r1.k()
            w.P r1 = r0.g
            r1.k()
            r0.o = r6
            r0.n = r6
            w.P r1 = r0.j
            r1.k()
            r17.E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.j.x():void");
    }

    public final void y(int i) {
        boolean z = false;
        this.n = 0;
        List T = this.a.T();
        int size = (T.size() - this.o) - 1;
        if (i <= size) {
            this.k.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.k.add(D(T, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(this.k);
            l.a aVar = l0.l.e;
            l0.l d2 = aVar.d();
            Qa.l g2 = d2 != null ? d2.g() : null;
            l0.l e2 = aVar.e(d2);
            boolean z2 = false;
            while (size >= i) {
                try {
                    J j = (J) T.get(size);
                    Object e3 = this.f.e(j);
                    kotlin.jvm.internal.t.d(e3);
                    b bVar = (b) e3;
                    Object h2 = bVar.h();
                    if (this.k.contains(h2)) {
                        this.n++;
                        if (bVar.a()) {
                            L(j);
                            M(bVar, false);
                            if (bVar.b()) {
                                z2 = true;
                            }
                        }
                    } else {
                        J j2 = j(this);
                        J.v(j2, true);
                        this.f.u(j);
                        y1 c2 = bVar.c();
                        if (c2 != null) {
                            c2.dispose();
                        }
                        this.a.y1(size, 1);
                        I i3 = I.a;
                        J.v(j2, false);
                    }
                    this.g.u(h2);
                    size--;
                } catch (Throwable th) {
                    aVar.l(d2, e2, g2);
                    throw th;
                }
            }
            I i4 = I.a;
            aVar.l(d2, e2, g2);
            z = z2;
        }
        if (z) {
            l0.l.e.m();
        }
        E();
    }

    public final void z(Object obj) {
        E();
        J j = (J) this.j.u(obj);
        if (j != null) {
            if (!(this.o > 0)) {
                L0.a.b("No pre-composed items to dispose");
            }
            int indexOf = this.a.T().indexOf(j);
            if (!(indexOf >= this.a.T().size() - this.o)) {
                L0.a.b("Item is not in pre-composed item range");
            }
            this.n++;
            this.o--;
            b bVar = (b) this.f.e(j);
            if (bVar != null) {
                s(bVar);
            }
            int size = (this.a.T().size() - this.o) - this.n;
            G(indexOf, size, 1);
            y(size);
        }
    }

    public static final class b {
        public Object a;
        public Qa.p b;
        public y1 c;
        public boolean d;
        public boolean e;
        public Q0 f;
        public C0 g;
        public boolean h;

        public b(Object obj, Qa.p pVar, y1 y1Var) {
            this.a = obj;
            this.b = pVar;
            this.c = y1Var;
            this.g = U1.i(Boolean.TRUE, null, 2, null);
        }

        public final boolean a() {
            return ((Boolean) this.g.getValue()).booleanValue();
        }

        public final boolean b() {
            return this.h;
        }

        public final y1 c() {
            return this.c;
        }

        public final Qa.p d() {
            return this.b;
        }

        public final boolean e() {
            return this.d;
        }

        public final boolean f() {
            return this.e;
        }

        public final Q0 g() {
            return this.f;
        }

        public final Object h() {
            return this.a;
        }

        public final void i(boolean z) {
            this.g.setValue(Boolean.valueOf(z));
        }

        public final void j(C0 c0) {
            this.g = c0;
        }

        public final void k(boolean z) {
            this.h = z;
        }

        public final void l(y1 y1Var) {
            this.c = y1Var;
        }

        public final void m(Qa.p pVar) {
            this.b = pVar;
        }

        public final void n(boolean z) {
            this.d = z;
        }

        public final void o(boolean z) {
            this.e = z;
        }

        public final void p(Q0 q0) {
            this.f = q0;
        }

        public final void q(Object obj) {
            this.a = obj;
        }

        public /* synthetic */ b(Object obj, Qa.p pVar, y1 y1Var, int i, kotlin.jvm.internal.k kVar) {
            this(obj, pVar, (i & 4) != 0 ? null : y1Var);
        }
    }
}

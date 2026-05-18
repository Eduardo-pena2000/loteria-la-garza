package b0;

import b0.U0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s implements m {
    public boolean A;
    public int C;
    public int D;
    public boolean E;
    public final c F;
    public final ArrayList G;
    public boolean H;
    public boolean I;
    public D1 J;
    public E1 K;
    public H1 L;
    public boolean M;
    public U0 N;
    public c0.a O;
    public final c0.b P;
    public b0.b Q;
    public c0.c R;
    public C1 S;
    public final n0.h T;
    public final Ga.i U;
    public boolean V;
    public long W;
    public n0.e X;
    public final b0.d b;
    public final y c;
    public final E1 d;
    public final Set e;
    public c0.a f;
    public c0.a g;
    public final K h;
    public final B i;
    public T0 k;
    public int l;
    public int m;
    public int n;
    public int[] p;
    public w.D q;
    public boolean r;
    public boolean s;
    public boolean t;
    public w.F x;
    public boolean y;
    public final ArrayList j = g2.c(null, 1, null);
    public final i0 o = new i0();
    public final List u = new ArrayList();
    public final i0 v = new i0();
    public U0 w = j0.n.a();
    public final i0 z = new i0();
    public int B = -1;

    public final class b extends y {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final K d;
        public Set e;
        public final Set f = new LinkedHashSet();
        public final C0 g = U1.h(j0.n.a(), U1.n());

        public b(long j, boolean z, boolean z2, K k) {
            this.a = j;
            this.b = z;
            this.c = z2;
            this.d = k;
        }

        public final void A(U0 u0) {
            z(u0);
        }

        public void a(Q q, Qa.p pVar) {
            s.d0(s.this).a(q, pVar);
        }

        public w.e0 b(Q q, C1 c1, Qa.p pVar) {
            return s.d0(s.this).b(q, c1, pVar);
        }

        public void c() {
            s.f0(s.this, s.c0(s.this) - 1);
        }

        public boolean d() {
            return s.d0(s.this).d();
        }

        public boolean e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }

        public long g() {
            return this.a;
        }

        public x h() {
            return s.this.H0();
        }

        public U0 i() {
            return y();
        }

        public Ga.i j() {
            return s.d0(s.this).j();
        }

        public K k() {
            return this.d;
        }

        public void l(y0 y0Var) {
            s.d0(s.this).l(y0Var);
        }

        public void m(Q q) {
            s.d0(s.this).m(s.this.H0());
            s.d0(s.this).m(q);
        }

        public x0 n(y0 y0Var) {
            return s.d0(s.this).n(y0Var);
        }

        public w.e0 o(Q q, C1 c1, w.e0 e0Var) {
            return s.d0(s.this).o(q, c1, e0Var);
        }

        public void p(Set set) {
            HashSet hashSet = this.e;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.e = hashSet;
            }
            hashSet.add(set);
        }

        public void q(m mVar) {
            kotlin.jvm.internal.t.e(mVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.q((s) mVar);
            this.f.add(mVar);
        }

        public void r(f1 f1Var) {
            s.d0(s.this).r(f1Var);
        }

        public void s(Q q) {
            s.d0(s.this).s(q);
        }

        public void t() {
            s.f0(s.this, s.c0(s.this) + 1);
        }

        public void u(m mVar) {
            Iterable<Set> iterable = this.e;
            if (iterable != null) {
                for (Set set : iterable) {
                    kotlin.jvm.internal.t.e(mVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set.remove(s.e0((s) mVar));
                }
            }
            kotlin.jvm.internal.V.a(this.f).remove(mVar);
        }

        public void v(Q q) {
            s.d0(s.this).v(q);
        }

        public final void w() {
            if (this.f.isEmpty()) {
                return;
            }
            Set set = this.e;
            if (set != null) {
                for (s sVar : this.f) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(s.e0(sVar));
                    }
                }
            }
            this.f.clear();
        }

        public final Set x() {
            return this.f;
        }

        public final U0 y() {
            return (U0) this.g.getValue();
        }

        public final void z(U0 u0) {
            this.g.setValue(u0);
        }
    }

    public static final class c implements V {
        public c() {
        }

        public void a(U u) {
            s.f0(s.this, s.c0(s.this) - 1);
        }

        public void b(U u) {
            s.f0(s.this, s.c0(s.this) + 1);
        }
    }

    public static final class d implements Qa.p {
        public final /* synthetic */ Object a;

        public d(w0 w0Var, Object obj) {
            this.a = obj;
        }

        public final void a(m mVar, int i) {
            if (!mVar.o((i & 3) != 2, i & 1)) {
                mVar.M();
            } else {
                if (w.L()) {
                    w.U(316014703, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3477)");
                }
                throw null;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }
    }

    public s(b0.d dVar, y yVar, E1 e1, Set set, c0.a aVar, c0.a aVar2, K k, B b2) {
        this.b = dVar;
        this.c = yVar;
        this.d = e1;
        this.e = set;
        this.f = aVar;
        this.g = aVar2;
        this.h = k;
        this.i = b2;
        this.E = yVar.f() || yVar.d();
        this.F = new c();
        this.G = g2.c(null, 1, null);
        D1 w = e1.w();
        w.d();
        this.J = w;
        E1 e12 = new E1();
        if (yVar.f()) {
            e12.h();
        }
        if (yVar.d()) {
            e12.g();
        }
        this.K = e12;
        H1 x = e12.x();
        x.J(true);
        this.L = x;
        this.P = new c0.b(this, this.f);
        D1 w2 = this.K.w();
        try {
            b0.b a2 = w2.a(0);
            w2.d();
            this.Q = a2;
            this.R = new c0.c();
            this.T = new n0.h(this);
            Ga.i j = yVar.j();
            Ga.j K0 = K0();
            this.U = j.plus(K0 == null ? Ga.j.a : K0);
        } catch (Throwable th) {
            w2.d();
            throw th;
        }
    }

    public static final Ca.I P0(s sVar, c0.a aVar, D1 d1, y0 y0Var) {
        c0.b bVar = sVar.P;
        c0.a o = bVar.o();
        try {
            bVar.T(aVar);
            D1 d12 = sVar.J;
            int[] iArr = sVar.p;
            w.F f = sVar.x;
            sVar.p = null;
            sVar.x = null;
            try {
                sVar.J = d1;
                c0.b bVar2 = sVar.P;
                boolean p = bVar2.p();
                try {
                    bVar2.U(false);
                    y0Var.c();
                    sVar.T0(null, y0Var.e(), y0Var.f(), true);
                    bVar2.U(p);
                    Ca.I i = Ca.I.a;
                    bVar.T(o);
                    return Ca.I.a;
                } catch (Throwable th) {
                    bVar2.U(p);
                    throw th;
                }
            } finally {
                sVar.J = d12;
                sVar.p = iArr;
                sVar.x = f;
            }
        } catch (Throwable th2) {
            bVar.T(o);
            throw th2;
        }
    }

    public static final Ca.I Q0(s sVar, y0 y0Var) {
        y0Var.c();
        sVar.T0(null, y0Var.e(), y0Var.f(), true);
        return Ca.I.a;
    }

    public static final List U0(s sVar) {
        return sVar.p0();
    }

    public static /* synthetic */ Ca.I W(s sVar, y0 y0Var) {
        return Q0(sVar, y0Var);
    }

    public static /* synthetic */ List X(s sVar) {
        return t0(sVar);
    }

    public static /* synthetic */ boolean Y(Object obj, Object obj2) {
        return t1(obj, obj2);
    }

    public static /* synthetic */ List Z(s sVar) {
        return U0(sVar);
    }

    public static /* synthetic */ Ca.I a0(s sVar, c0.a aVar, D1 d1, y0 y0Var) {
        return P0(sVar, aVar, d1, y0Var);
    }

    public static final /* synthetic */ int c0(s sVar) {
        return sVar.C;
    }

    public static final /* synthetic */ y d0(s sVar) {
        return sVar.c;
    }

    public static final /* synthetic */ E1 e0(s sVar) {
        return sVar.d;
    }

    public static final /* synthetic */ void f0(s sVar, int i) {
        sVar.C = i;
    }

    public static /* synthetic */ Object f1(s sVar, Q q, Q q2, Integer num, List list, Qa.a aVar, int i, Object obj) {
        Q q3 = (i & 1) != 0 ? null : q;
        Q q4 = (i & 2) != 0 ? null : q2;
        Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            list = Da.v.n();
        }
        return sVar.e1(q3, q4, num2, list, aVar);
    }

    public static final int o1(s sVar, int i, int i2, boolean z, int i3) {
        D1 d1 = sVar.J;
        if (d1.G(i2)) {
            int D = d1.D(i2);
            Object E = d1.E(i2);
            if (D != 206 || !kotlin.jvm.internal.t.c(E, w.H())) {
                if (d1.K(i2)) {
                    return 1;
                }
                return d1.O(i2);
            }
            Object C = d1.C(i2, 0);
            a aVar = C instanceof a ? (a) C : null;
            if (aVar != null) {
                for (s sVar2 : aVar.a().x()) {
                    sVar2.m1();
                    sVar.c.s(sVar2.H0());
                }
            }
            return d1.O(i2);
        }
        if (!d1.e(i2)) {
            if (d1.K(i2)) {
                return 1;
            }
            return d1.O(i2);
        }
        int F = d1.F(i2) + i2;
        int i4 = 0;
        for (int i5 = i2 + 1; i5 < F; i5 += d1.F(i5)) {
            boolean K = d1.K(i5);
            if (K) {
                sVar.P.i();
                sVar.P.w(d1.M(i5));
            }
            i4 += o1(sVar, i, i5, K || z, K ? 0 : i3 + i4);
            if (K) {
                sVar.P.i();
                sVar.P.A();
            }
        }
        if (d1.K(i2)) {
            return 1;
        }
        return i4;
    }

    public static final List t0(s sVar) {
        return sVar.p0();
    }

    public static final boolean t1(Object obj, Object obj2) {
        if (obj2 != obj) {
            w1 w1Var = obj2 instanceof w1 ? (w1) obj2 : null;
            if ((w1Var != null ? w1Var.b() : null) != obj) {
                return false;
            }
        }
        return true;
    }

    public void A() {
        if (this.A && this.J.u() == this.B) {
            this.B = -1;
            this.A = false;
        }
        v0(false);
    }

    public final void A0(boolean z, T0 t0) {
        g2.j(this.j, this.k);
        this.k = t0;
        this.o.h(this.m);
        this.o.h(this.n);
        this.o.h(this.l);
        if (z) {
            this.l = 0;
        }
        this.m = 0;
        this.n = 0;
    }

    public final void A1() {
        this.n = 0;
        this.J = this.d.w();
        w1(100);
        this.c.t();
        U0 i = this.c.i();
        this.z.h(w.f(this.y));
        this.y = U(i);
        this.N = null;
        if (!this.r) {
            this.r = this.c.e();
        }
        if (!this.E) {
            this.E = this.c.f();
        }
        if (this.E) {
            D c2 = n0.j.c();
            kotlin.jvm.internal.t.e(c2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            i = i.i(c2, new j2(K0()));
        }
        this.w = i;
        Set set = (Set) J.b(i, n0.o.c());
        if (set != null) {
            set.add(D());
            this.c.p(set);
        }
        w1(Long.hashCode(this.c.g()));
    }

    public void B(int i) {
        v1(i, null, g0.a.a(), null);
    }

    public final void B0(f1 f1Var) {
        f1Var.P(this.D);
        this.h.a();
    }

    public final boolean B1(f1 f1Var, Object obj) {
        b0.b h = f1Var.h();
        if (h == null) {
            return false;
        }
        int d2 = h.d(this.J.z());
        if (!this.H || d2 < this.J.k()) {
            return false;
        }
        w.k(this.u, d2, f1Var, obj);
        return true;
    }

    public Object C() {
        return X0();
    }

    public final void C0(int i, boolean z) {
        T0 t0 = (T0) g2.i(this.j);
        if (t0 != null && !z) {
            t0.l(t0.a() + 1);
        }
        this.k = t0;
        this.l = this.o.g() + i;
        this.n = this.o.g();
        this.m = this.o.g() + i;
    }

    public final void C1(Object obj) {
        if (obj instanceof v1) {
            w1 w1Var = new w1((v1) obj, l1());
            if (f()) {
                this.P.N(w1Var);
            }
            this.e.add(obj);
            obj = w1Var;
        }
        I1(obj);
    }

    public n0.e D() {
        n0.e eVar = this.X;
        if (eVar != null) {
            return eVar;
        }
        A a2 = new A(H0());
        this.X = a2;
        return a2;
    }

    public final Qa.l D0(f1 f1Var) {
        this.h.a();
        return f1Var.f(this.D);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D1(w.P r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.List r2 = r0.u
            int r2 = Da.v.p(r2)
        La:
            r3 = -1
            if (r3 >= r2) goto L3f
            java.util.List r3 = r0.u
            java.lang.Object r3 = r3.get(r2)
            b0.k0 r3 = (b0.k0) r3
            b0.f1 r4 = r3.c()
            b0.b r4 = r4.h()
            if (r4 == 0) goto L37
            boolean r5 = r4.b()
            if (r5 == 0) goto L37
            int r5 = r3.b()
            int r6 = r4.a()
            if (r5 == r6) goto L3c
            int r4 = r4.a()
            r3.f(r4)
            goto L3c
        L37:
            java.util.List r3 = r0.u
            r3.remove(r2)
        L3c:
            int r2 = r2 + (-1)
            goto La
        L3f:
            java.lang.Object[] r2 = r1.b
            java.lang.Object[] r3 = r1.c
            long[] r1 = r1.a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto La2
            r6 = 0
        L4b:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L9d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L65:
            if (r11 >= r9) goto L9b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L97
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            java.lang.String r14 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.t.e(r13, r14)
            b0.f1 r13 = (b0.f1) r13
            b0.b r14 = r13.h()
            if (r14 == 0) goto L97
            int r14 = r14.a()
            java.util.List r15 = r0.u
            b0.A1 r5 = b0.A1.a
            if (r12 != r5) goto L8f
            r12 = 0
        L8f:
            b0.k0 r5 = new b0.k0
            r5.<init>(r13, r14, r12)
            r15.add(r5)
        L97:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L65
        L9b:
            if (r9 != r10) goto La2
        L9d:
            if (r6 == r4) goto La2
            int r6 = r6 + 1
            goto L4b
        La2:
            java.util.List r1 = r0.u
            java.util.Comparator r2 = b0.w.i()
            Da.z.C(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.s.D1(w.P):void");
    }

    public boolean E(Object obj) {
        if (W0() == obj) {
            return false;
        }
        I1(obj);
        return true;
    }

    public final void E0() {
        this.P.n();
        if (!g2.e(this.j)) {
            w.t("Start/end imbalance");
        }
        i0();
    }

    public final void E1(int i, int i2) {
        if (J1(i) != i2) {
            if (i < 0) {
                w.D d2 = this.q;
                if (d2 == null) {
                    d2 = new w.D(0, 1, null);
                    this.q = d2;
                }
                d2.r(i, i2);
                return;
            }
            int[] iArr = this.p;
            if (iArr == null) {
                iArr = new int[this.J.x()];
                Da.p.v(iArr, -1, 0, 0, 6, (Object) null);
                this.p = iArr;
            }
            iArr[i] = i2;
        }
    }

    public void F(c1[] c1VarArr) {
        U0 G1;
        U0 n0 = n0();
        x1(201, w.F());
        boolean z = true;
        boolean z2 = false;
        if (f()) {
            G1 = G1(n0, J.d(c1VarArr, n0, null, 4, null));
            this.M = true;
        } else {
            Object B = this.J.B(0);
            kotlin.jvm.internal.t.e(B, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            U0 u0 = (U0) B;
            Object B2 = this.J.B(1);
            kotlin.jvm.internal.t.e(B2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            U0 u02 = (U0) B2;
            U0 c2 = J.c(c1VarArr, n0, u02);
            if (j() && !this.A && kotlin.jvm.internal.t.c(u02, c2)) {
                q1();
                G1 = u0;
            } else {
                G1 = G1(n0, c2);
                if (!this.A && kotlin.jvm.internal.t.c(G1, u0)) {
                    z = false;
                }
                z2 = z;
            }
        }
        if (z2 && !f()) {
            j1(G1);
        }
        this.z.h(w.f(this.y));
        this.y = z2;
        this.N = G1;
        v1(202, w.C(), g0.a.a(), G1);
    }

    public final void F0() {
        E1 e1 = new E1();
        if (this.E) {
            e1.h();
        }
        if (this.c.d()) {
            e1.g();
        }
        this.K = e1;
        H1 x = e1.x();
        x.J(true);
        this.L = x;
    }

    public final void F1(int i, int i2) {
        int J1 = J1(i);
        if (J1 != i2) {
            int i3 = i2 - J1;
            int d2 = g2.d(this.j) - 1;
            while (i != -1) {
                int J12 = J1(i) + i3;
                E1(i, J12);
                int i4 = d2;
                while (true) {
                    if (-1 < i4) {
                        T0 t0 = (T0) g2.h(this.j, i4);
                        if (t0 != null && t0.n(i, J12)) {
                            d2 = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.J.u();
                } else if (this.J.K(i)) {
                    return;
                } else {
                    i = this.J.Q(i);
                }
            }
        }
    }

    public void G() {
        v1(-127, null, g0.a.a(), null);
    }

    public final boolean G0() {
        return this.C > 0;
    }

    public final U0 G1(U0 u0, U0 u02) {
        U0.a d2 = u0.d();
        d2.putAll(u02);
        U0 build = d2.build();
        x1(204, w.G());
        H1(build);
        H1(u02);
        w0();
        return build;
    }

    public void H(int i, Object obj) {
        v1(i, obj, g0.a.a(), null);
    }

    public B H0() {
        return this.i;
    }

    public final void H1(Object obj) {
        W0();
        I1(obj);
    }

    public void I() {
        v1(125, null, g0.a.c(), null);
        this.t = true;
    }

    public final f1 I0() {
        ArrayList arrayList = this.G;
        if (this.C == 0 && g2.f(arrayList)) {
            return (f1) g2.g(arrayList);
        }
        return null;
    }

    public final void I1(Object obj) {
        if (f()) {
            this.L.j1(obj);
            return;
        }
        if (!this.J.r()) {
            c0.b bVar = this.P;
            D1 d1 = this.J;
            bVar.a(d1.a(d1.u()), obj);
            return;
        }
        int q = this.J.q() - 1;
        if (!this.P.q()) {
            this.P.c0(obj, q);
            return;
        }
        c0.b bVar2 = this.P;
        D1 d12 = this.J;
        bVar2.Z(obj, d12.a(d12.u()), q);
    }

    public void J(Object obj, Qa.p pVar) {
        if (f()) {
            this.R.f(obj, pVar);
        } else {
            this.P.b0(obj, pVar);
        }
    }

    public final c0.a J0() {
        return this.O;
    }

    public final int J1(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.p;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.J.O(i) : i2;
        }
        w.D d2 = this.q;
        if (d2 == null || !d2.a(i)) {
            return 0;
        }
        return d2.c(i);
    }

    public void K(int i, Object obj) {
        if (!f() && this.J.n() == i && !kotlin.jvm.internal.t.c(this.J.l(), obj) && this.B < 0) {
            this.B = this.J.k();
            this.A = true;
        }
        v1(i, null, g0.a.a(), obj);
    }

    public final n0.h K0() {
        if (this.E) {
            return this.T;
        }
        return null;
    }

    public final void K1() {
        if (!this.t) {
            w.t("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.t = false;
    }

    public void L(d1 d1Var) {
        f1 f1Var = d1Var instanceof f1 ? (f1) d1Var : null;
        if (f1Var != null) {
            f1Var.O(true);
        }
    }

    public final Object L0(D1 d1) {
        return d1.M(d1.u());
    }

    public final void L1() {
        if (this.t) {
            w.t("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    public void M() {
        if (!(this.m == 0)) {
            w.t("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (f()) {
            return;
        }
        f1 I0 = I0();
        if (I0 != null) {
            I0.C();
        }
        if (this.u.isEmpty()) {
            r1();
        } else {
            g1();
        }
    }

    public final D1 M0() {
        return this.J;
    }

    public void N() {
        w0();
        w0();
        this.y = w.e(this.z.g());
        this.N = null;
    }

    public final int N0(D1 d1, int i) {
        Object A;
        if (d1.H(i)) {
            Object E = d1.E(i);
            if (E != null) {
                return E instanceof Enum ? ((Enum) E).ordinal() : E.hashCode();
            }
            return 0;
        }
        int D = d1.D(i);
        if (D == 207 && (A = d1.A(i)) != null && !kotlin.jvm.internal.t.c(A, m.a.a())) {
            D = A.hashCode();
        }
        return D;
    }

    public boolean O() {
        if (!j() || this.y) {
            return true;
        }
        f1 I0 = I0();
        return I0 != null && I0.k();
    }

    public final void O0(List list) {
        c0.b bVar;
        c0.a aVar;
        c0.b bVar2;
        c0.a aVar2;
        D1 d1;
        int[] iArr;
        w.F f;
        c0.a aVar3;
        c0.b bVar3;
        int i;
        int i2;
        D1 d12;
        int i3 = 1;
        c0.b bVar4 = this.P;
        c0.a aVar4 = this.g;
        c0.a o = bVar4.o();
        try {
            bVar4.T(aVar4);
            this.P.R();
            int size = list.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                try {
                    Ca.q qVar = (Ca.q) list.get(i5);
                    y0 y0Var = (y0) qVar.a();
                    y0 y0Var2 = (y0) qVar.b();
                    b0.b a2 = y0Var.a();
                    int b2 = y0Var.g().b(a2);
                    j0.k kVar = new j0.k(i4, i3, null);
                    this.P.e(kVar, a2);
                    if (y0Var2 == null) {
                        if (kotlin.jvm.internal.t.c(y0Var.g(), this.K)) {
                            m0();
                        }
                        D1 w = y0Var.g().w();
                        try {
                            w.R(b2);
                            this.P.z(b2);
                            c0.a aVar5 = new c0.a();
                            d12 = w;
                            try {
                                f1(this, null, null, null, null, new n(this, aVar5, w, y0Var), 15, null);
                                this.P.s(aVar5, kVar);
                                Ca.I i6 = Ca.I.a;
                                d12.d();
                                bVar2 = bVar4;
                                aVar2 = o;
                                i = size;
                                i2 = i5;
                            } catch (Throwable th) {
                                th = th;
                                d12.d();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            d12 = w;
                        }
                    } else {
                        x0 n = this.c.n(y0Var2);
                        E1 g = y0Var2.g();
                        b0.b a3 = y0Var2.a();
                        List g2 = w.g(g, a3);
                        if (!g2.isEmpty()) {
                            this.P.b(g2, kVar);
                            if (kotlin.jvm.internal.t.c(y0Var.g(), this.d)) {
                                int b3 = this.d.b(a2);
                                E1(b3, J1(b3) + g2.size());
                            }
                        }
                        this.P.c(n, this.c, y0Var2, y0Var);
                        D1 w2 = g.w();
                        try {
                            D1 d13 = this.J;
                            int[] iArr2 = this.p;
                            w.F f2 = this.x;
                            this.p = null;
                            this.x = null;
                            try {
                                this.J = w2;
                                int b4 = g.b(a3);
                                w2.R(b4);
                                this.P.z(b4);
                                c0.a aVar6 = new c0.a();
                                c0.b bVar5 = this.P;
                                c0.a o2 = bVar5.o();
                                try {
                                    bVar5.T(aVar6);
                                    i = size;
                                    c0.b bVar6 = this.P;
                                    boolean p = bVar6.p();
                                    try {
                                        bVar6.U(false);
                                        y0Var2.h();
                                        Q b5 = y0Var2.b();
                                        Q b6 = y0Var.b();
                                        Integer valueOf = Integer.valueOf(w2.k());
                                        bVar2 = bVar4;
                                        f = f2;
                                        aVar2 = o;
                                        aVar3 = o2;
                                        i2 = i5;
                                        iArr = iArr2;
                                        d1 = w2;
                                        bVar3 = bVar5;
                                        try {
                                            e1(b5, b6, valueOf, y0Var2.d(), new o(this, y0Var));
                                            try {
                                                bVar6.U(p);
                                                try {
                                                    bVar3.T(aVar3);
                                                    this.P.s(aVar6, kVar);
                                                    Ca.I i7 = Ca.I.a;
                                                    try {
                                                        this.J = d13;
                                                        this.p = iArr;
                                                        this.x = f;
                                                        try {
                                                            d1.d();
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            aVar = aVar2;
                                                            bVar = bVar2;
                                                            bVar.T(aVar);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        d1.d();
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    this.J = d13;
                                                    this.p = iArr;
                                                    this.x = f;
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                bVar3.T(aVar3);
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            bVar6.U(p);
                                            throw th;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        iArr = iArr2;
                                        d1 = w2;
                                        f = f2;
                                        bVar3 = bVar5;
                                        aVar3 = o2;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    iArr = iArr2;
                                    d1 = w2;
                                    f = f2;
                                    aVar3 = o2;
                                    bVar3 = bVar5;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                iArr = iArr2;
                                d1 = w2;
                                f = f2;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            d1 = w2;
                        }
                    }
                    this.P.W();
                    i3 = 1;
                    i5 = i2 + 1;
                    size = i;
                    o = aVar2;
                    bVar4 = bVar2;
                    i4 = 0;
                } catch (Throwable th12) {
                    th = th12;
                    bVar2 = bVar4;
                    aVar2 = o;
                }
            }
            c0.b bVar7 = bVar4;
            c0.a aVar7 = o;
            this.P.h();
            this.P.z(0);
            bVar7.T(aVar7);
        } catch (Throwable th13) {
            th = th13;
            bVar = bVar4;
            aVar = o;
        }
    }

    public void P() {
        w0();
    }

    public y R() {
        x1(206, w.H());
        if (f()) {
            H1.r0(this.L, 0, 1, null);
        }
        Object W0 = W0();
        a aVar = W0 instanceof a ? (a) W0 : null;
        if (aVar == null) {
            long n = n();
            boolean z = this.r;
            boolean z2 = this.E;
            B H0 = H0();
            if (H0 == null) {
                H0 = null;
            }
            aVar = new a(new b(n, z, z2, H0 != null ? H0.P() : null));
            I1(aVar);
        }
        aVar.a().A(n0());
        w0();
        return aVar.a();
    }

    public void R0(List list) {
        try {
            O0(list);
            i0();
        } catch (Throwable th) {
            b0();
            throw th;
        }
    }

    public void S() {
        w0();
    }

    public final int S0(int i) {
        return (-2) - i;
    }

    public void T() {
        w0();
    }

    public final void T0(w0 w0Var, U0 u0, Object obj, boolean z) {
        H(126665345, w0Var);
        H1(obj);
        long n = n();
        try {
            this.W = 126665345;
            boolean z2 = false;
            if (f()) {
                H1.r0(this.L, 0, 1, null);
            }
            if (!f() && !kotlin.jvm.internal.t.c(this.J.l(), u0)) {
                z2 = true;
            }
            if (z2) {
                j1(u0);
            }
            v1(202, w.C(), g0.a.a(), u0);
            this.N = null;
            if (!f() || z) {
                boolean z3 = this.y;
                this.y = z2;
                j0.j.a(this, j0.i.b(316014703, true, new d(w0Var, obj)));
                this.y = z3;
            } else {
                this.M = true;
                H1 h1 = this.L;
                this.c.l(new y0(w0Var, obj, H0(), this.K, h1.B(h1.C0(h1.a0())), Da.v.n(), n0(), null));
            }
        } catch (Throwable th) {
            try {
                throw n0.d.b(th, new r(this));
            } finally {
                w0();
                this.N = null;
                this.W = n;
                S();
            }
        }
    }

    public boolean U(Object obj) {
        if (kotlin.jvm.internal.t.c(W0(), obj)) {
            return false;
        }
        I1(obj);
        return true;
    }

    public void V(int i) {
        if (this.k != null) {
            v1(i, null, g0.a.a(), null);
            return;
        }
        L1();
        this.W = Long.rotateLeft(Long.rotateLeft(n(), 3) ^ i, 3) ^ this.n;
        this.n++;
        D1 d1 = this.J;
        if (f()) {
            d1.c();
            this.L.e1(i, m.a.a());
            A0(false, null);
            return;
        }
        if (d1.n() == i && !d1.s()) {
            d1.W();
            A0(false, null);
            return;
        }
        if (!d1.I()) {
            int i2 = this.l;
            int k = d1.k();
            h1();
            this.P.Q(i2, d1.T());
            w.o(this.u, k, d1.k());
        }
        d1.c();
        this.V = true;
        this.N = null;
        z0();
        H1 h1 = this.L;
        h1.F();
        int Z = h1.Z();
        h1.e1(i, m.a.a());
        this.Q = h1.B(Z);
        A0(false, null);
    }

    public final boolean V0() {
        return this.H;
    }

    public final Object W0() {
        if (f()) {
            L1();
            return m.a.a();
        }
        Object L = this.J.L();
        return (!this.A || (L instanceof z1)) ? L : m.a.a();
    }

    public final Object X0() {
        if (f()) {
            L1();
            return m.a.a();
        }
        Object L = this.J.L();
        return (!this.A || (L instanceof z1)) ? L instanceof w1 ? ((w1) L).b() : L : m.a.a();
    }

    public final Object Y0(D1 d1, int i) {
        return d1.M(i);
    }

    public final int Z0(int i, int i2, int i3, int i4) {
        int Q = this.J.Q(i2);
        while (Q != i3 && !this.J.K(Q)) {
            Q = this.J.Q(Q);
        }
        if (this.J.K(Q)) {
            i4 = 0;
        }
        if (Q == i2) {
            return i4;
        }
        int J1 = (J1(Q) - this.J.O(i2)) + i4;
        loop1: while (i4 < J1 && Q != i) {
            Q++;
            while (Q < i) {
                int F = this.J.F(Q) + Q;
                if (i >= F) {
                    i4 += this.J.K(Q) ? 1 : J1(Q);
                    Q = F;
                }
            }
            break loop1;
        }
        return i4;
    }

    public boolean a(boolean z) {
        Object W0 = W0();
        if ((W0 instanceof Boolean) && z == ((Boolean) W0).booleanValue()) {
            return false;
        }
        I1(Boolean.valueOf(z));
        return true;
    }

    public final List a1() {
        x h = this.c.h();
        B b2 = h instanceof B ? (B) h : null;
        if (b2 == null) {
            return Da.v.n();
        }
        Integer e = n0.b.e(b2.Q(), this.c);
        if (e == null) {
            return Da.v.n();
        }
        D1 w = b2.Q().w();
        try {
            return n0.b.g(w, e.intValue(), 0);
        } finally {
            w.d();
        }
    }

    public void b(c1 c1Var) {
        n2 n2Var;
        U0 n0 = n0();
        x1(201, w.F());
        Object C = C();
        if (kotlin.jvm.internal.t.c(C, m.a.a())) {
            n2Var = null;
        } else {
            kotlin.jvm.internal.t.e(C, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            n2Var = (n2) C;
        }
        D b2 = c1Var.b();
        kotlin.jvm.internal.t.e(b2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        kotlin.jvm.internal.t.e(c1Var, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        n2 b3 = b2.b(c1Var, n2Var);
        boolean c2 = kotlin.jvm.internal.t.c(b3, n2Var);
        if (!c2) {
            t(b3);
        }
        boolean z = true;
        boolean z2 = false;
        if (f()) {
            if (c1Var.a() || !J.a(n0, b2)) {
                n0 = n0.i(b2, b3);
            }
            this.M = true;
        } else {
            D1 d1 = this.J;
            Object A = d1.A(d1.k());
            kotlin.jvm.internal.t.e(A, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            U0 u0 = (U0) A;
            if (!(j() && c2) && (c1Var.a() || !J.a(n0, b2))) {
                n0 = n0.i(b2, b3);
            } else if ((c2 && !this.y) || !this.y) {
                n0 = u0;
            }
            if (!this.A && u0 == n0) {
                z = false;
            }
            z2 = z;
        }
        if (z2 && !f()) {
            j1(n0);
        }
        this.z.h(w.f(this.y));
        this.y = z2;
        this.N = n0;
        v1(202, w.C(), g0.a.a(), n0);
    }

    public final void b0() {
        i0();
        g2.a(this.j);
        this.o.a();
        this.v.a();
        this.z.a();
        this.x = null;
        this.R.a();
        this.W = 0;
        this.C = 0;
        this.t = false;
        this.V = false;
        this.A = false;
        this.H = false;
        this.s = false;
        this.B = -1;
        if (!this.J.i()) {
            this.J.d();
        }
        if (this.L.Y()) {
            return;
        }
        F0();
    }

    public final void b1(Qa.a aVar) {
        if (this.H) {
            w.t("Preparing a composition while composing is not supported");
        }
        this.H = true;
        try {
            aVar.invoke();
        } finally {
            this.H = false;
        }
    }

    public boolean c(float f) {
        Object W0 = W0();
        if ((W0 instanceof Float) && f == ((Number) W0).floatValue()) {
            return false;
        }
        I1(Float.valueOf(f));
        return true;
    }

    public final int c1(int i) {
        int Q = this.J.Q(i) + 1;
        int i2 = 0;
        while (Q < i) {
            if (!this.J.H(Q)) {
                i2++;
            }
            Q += this.J.F(Q);
        }
        return i2;
    }

    public boolean d(int i) {
        Object W0 = W0();
        if ((W0 instanceof Integer) && i == ((Number) W0).intValue()) {
            return false;
        }
        I1(Integer.valueOf(i));
        return true;
    }

    public final boolean d1(w.P p, C1 c1) {
        if (!this.f.c()) {
            w.t("Expected applyChanges() to have been called");
        }
        if (d0.g.f(p) <= 0 && this.u.isEmpty() && !this.s) {
            return false;
        }
        this.S = c1;
        try {
            s0(p, null);
            this.S = null;
            return this.f.d();
        } catch (Throwable th) {
            this.S = null;
            throw th;
        }
    }

    public boolean e(long j) {
        Object W0 = W0();
        if ((W0 instanceof Long) && j == ((Number) W0).longValue()) {
            return false;
        }
        I1(Long.valueOf(j));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:9:0x002c, B:10:0x0028, B:15:0x0033, B:16:0x0039, B:22:0x003f), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e1(b0.Q r7, b0.Q r8, java.lang.Integer r9, java.util.List r10, Qa.a r11) {
        /*
            r6 = this;
            boolean r0 = r6.H
            int r1 = r6.l
            r2 = 1
            r6.H = r2     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r6.l = r2     // Catch: java.lang.Throwable -> L26
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L26
        Le:
            if (r2 >= r3) goto L2f
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L26
            Ca.q r4 = (Ca.q) r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r4.a()     // Catch: java.lang.Throwable -> L26
            b0.f1 r5 = (b0.f1) r5     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L28
            r6.B1(r5, r4)     // Catch: java.lang.Throwable -> L26
            goto L2c
        L26:
            r7 = move-exception
            goto L48
        L28:
            r4 = 0
            r6.B1(r5, r4)     // Catch: java.lang.Throwable -> L26
        L2c:
            int r2 = r2 + 1
            goto Le
        L2f:
            if (r7 == 0) goto L3f
            if (r9 == 0) goto L38
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L26
            goto L39
        L38:
            r9 = -1
        L39:
            java.lang.Object r7 = r7.q(r8, r9, r11)     // Catch: java.lang.Throwable -> L26
            if (r7 != 0) goto L43
        L3f:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L26
        L43:
            r6.H = r0
            r6.l = r1
            return r7
        L48:
            r6.H = r0
            r6.l = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.s.e1(b0.Q, b0.Q, java.lang.Integer, java.util.List, Qa.a):java.lang.Object");
    }

    public boolean f() {
        return this.V;
    }

    public void g(Qa.a aVar) {
        this.P.V(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0() {
        /*
            r4 = this;
            boolean r0 = r4.f()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L21
            b0.f1 r0 = new b0.f1
            b0.B r2 = r4.H0()
            kotlin.jvm.internal.t.e(r2, r1)
            r0.<init>(r2)
            java.util.ArrayList r1 = r4.G
            b0.g2.j(r1, r0)
            r4.I1(r0)
            r4.B0(r0)
            goto L94
        L21:
            java.util.List r0 = r4.u
            b0.D1 r2 = r4.J
            int r2 = r2.u()
            b0.k0 r0 = b0.w.n(r0, r2)
            b0.D1 r2 = r4.J
            java.lang.Object r2 = r2.L()
            b0.m$a r3 = b0.m.a
            java.lang.Object r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.t.c(r2, r3)
            if (r3 == 0) goto L4f
            b0.f1 r2 = new b0.f1
            b0.B r3 = r4.H0()
            kotlin.jvm.internal.t.e(r3, r1)
            r2.<init>(r3)
            r4.I1(r2)
            goto L56
        L4f:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.t.e(r2, r1)
            b0.f1 r2 = (b0.f1) r2
        L56:
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L68
            boolean r0 = r2.l()
            if (r0 == 0) goto L63
            r2.G(r1)
        L63:
            if (r0 == 0) goto L66
            goto L68
        L66:
            r0 = r1
            goto L69
        L68:
            r0 = r3
        L69:
            r2.I(r0)
            java.util.ArrayList r0 = r4.G
            b0.g2.j(r0, r2)
            r4.B0(r2)
            boolean r0 = r2.m()
            if (r0 == 0) goto L94
            r2.H(r1)
            r2.L(r3)
            c0.b r0 = r4.P
            r0.X(r2)
            boolean r0 = r4.A
            if (r0 != 0) goto L94
            boolean r0 = r2.r()
            if (r0 == 0) goto L94
            r4.A = r3
            r2.K(r3)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.s.g0():void");
    }

    public final void g1() {
        boolean z = this.H;
        this.H = true;
        int u = this.J.u();
        int F = this.J.F(u) + u;
        int i = this.l;
        long n = n();
        int i2 = this.m;
        int i3 = this.n;
        k0 h = w.h(this.u, this.J.k(), F);
        boolean z2 = false;
        int i4 = u;
        while (h != null) {
            int b2 = h.b();
            f1 c2 = h.c();
            w.n(this.u, b2);
            if (h.d()) {
                this.J.R(b2);
                int k = this.J.k();
                k1(i4, k, u);
                this.l = Z0(b2, k, u, i);
                this.n = c1(k);
                this.W = l0(this.J.Q(k), u, n);
                this.N = null;
                c2.e(this);
                this.N = null;
                this.J.S(u);
                z2 = true;
                i4 = k;
            } else {
                g2.j(this.G, c2);
                this.h.a();
                c2.B();
                g2.i(this.G);
            }
            h = w.h(this.u, this.J.k(), F);
        }
        if (z2) {
            k1(i4, u, u);
            this.J.U();
            int J1 = J1(u);
            this.l = i + J1;
            this.m = i2 + J1;
            this.n = i3;
        } else {
            r1();
        }
        this.W = n;
        this.H = z;
    }

    public void h(boolean z) {
        if (!(this.m == 0)) {
            w.t("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (f()) {
            return;
        }
        if (!z) {
            r1();
            return;
        }
        int k = this.J.k();
        int j = this.J.j();
        this.P.d();
        w.o(this.u, k, j);
        this.J.U();
    }

    public final void h0() {
        this.x = null;
    }

    public final void h1() {
        n1(this.J.k());
        this.P.P();
    }

    public m i(int i) {
        V(i);
        g0();
        return this;
    }

    public final void i0() {
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.W = 0L;
        this.t = false;
        this.P.S();
        g2.a(this.G);
        j0();
    }

    public final void i1(b0.b bVar) {
        if (this.R.e()) {
            this.P.t(bVar, this.K);
        } else {
            this.P.u(bVar, this.K, this.R);
            this.R = new c0.c();
        }
    }

    public boolean j() {
        f1 I0;
        return (f() || this.A || this.y || (I0 = I0()) == null || I0.n() || this.s) ? false : true;
    }

    public final void j0() {
        this.p = null;
        this.q = null;
    }

    public final void j1(U0 u0) {
        w.F f = this.x;
        if (f == null) {
            f = new w.F(0, 1, null);
            this.x = f;
        }
        f.s(this.J.k(), u0);
    }

    public b0.d k() {
        return this.b;
    }

    public final void k0(w.P p, Qa.p pVar, C1 c1) {
        if (!this.f.c()) {
            w.t("Expected applyChanges() to have been called");
        }
        this.S = c1;
        try {
            s0(p, pVar);
        } finally {
            this.S = null;
        }
    }

    public final void k1(int i, int i2, int i3) {
        D1 d1 = this.J;
        int m = w.m(d1, i, i2, i3);
        while (i > 0 && i != m) {
            if (d1.K(i)) {
                this.P.A();
            }
            i = d1.Q(i);
        }
        u0(i2, m);
    }

    public B1 l() {
        b0.b a2;
        f1 f1Var = null;
        f1 f1Var2 = g2.f(this.G) ? (f1) g2.i(this.G) : null;
        if (f1Var2 != null) {
            f1Var2.I(false);
            Qa.l D0 = D0(f1Var2);
            if (D0 != null) {
                this.P.f(D0, H0());
            }
            if (f1Var2.q()) {
                f1Var2.L(false);
                this.P.j(f1Var2);
                f1Var2.M(false);
                if (f1Var2.p()) {
                    f1Var2.K(false);
                    this.A = false;
                }
            }
        }
        if (f1Var2 != null && !f1Var2.s() && (f1Var2.t() || this.r)) {
            if (f1Var2.h() == null) {
                if (f()) {
                    H1 h1 = this.L;
                    a2 = h1.B(h1.a0());
                } else {
                    D1 d1 = this.J;
                    a2 = d1.a(d1.u());
                }
                f1Var2.D(a2);
            }
            f1Var2.F(false);
            f1Var = f1Var2;
        }
        v0(false);
        return f1Var;
    }

    public final long l0(int i, int i2, long j) {
        long rotateLeft;
        long j2 = 0;
        int i3 = 3;
        int i4 = 0;
        while (i >= 0) {
            if (i == i2) {
                rotateLeft = Long.rotateLeft(j, i4);
            } else {
                int N0 = N0(this.J, i);
                if (N0 == 126665345) {
                    rotateLeft = Long.rotateLeft(N0, i4);
                } else {
                    j2 = (j2 ^ Long.rotateLeft(N0, i3)) ^ Long.rotateLeft(this.J.H(i) ? 0 : c1(i), i4);
                    i3 = (i3 + 6) % 64;
                    i4 = (i4 + 6) % 64;
                    i = this.J.Q(i);
                }
            }
            return rotateLeft ^ j2;
        }
        return j2;
    }

    public final b0.b l1() {
        int i;
        int i2;
        if (f()) {
            if (!w.K(this.L)) {
                return null;
            }
            int Z = this.L.Z() - 1;
            int C0 = this.L.C0(Z);
            while (true) {
                int i3 = C0;
                i2 = Z;
                Z = i3;
                if (Z == this.L.a0() || Z < 0) {
                    break;
                }
                C0 = this.L.C0(Z);
            }
            return this.L.B(i2);
        }
        if (!w.J(this.J)) {
            return null;
        }
        int k = this.J.k() - 1;
        int Q = this.J.Q(k);
        while (true) {
            int i4 = Q;
            i = k;
            k = i4;
            if (k == this.J.u() || k < 0) {
                break;
            }
            Q = this.J.Q(k);
        }
        return this.J.a(i);
    }

    public void m() {
        v1(125, null, g0.a.b(), null);
        this.t = true;
    }

    public final void m0() {
        if (!this.L.Y()) {
            w.t("Check failed");
        }
        F0();
    }

    public final void m1() {
        if (this.d.j()) {
            H0().Z();
            c0.a aVar = new c0.a();
            this.O = aVar;
            D1 w = this.d.w();
            try {
                this.J = w;
                c0.b bVar = this.P;
                c0.a o = bVar.o();
                try {
                    bVar.T(aVar);
                    n1(0);
                    this.P.M();
                    bVar.T(o);
                    Ca.I i = Ca.I.a;
                } catch (Throwable th) {
                    bVar.T(o);
                    throw th;
                }
            } finally {
                w.d();
            }
        }
    }

    public long n() {
        return this.W;
    }

    public final U0 n0() {
        U0 u0 = this.N;
        return u0 != null ? u0 : o0(this.J.u());
    }

    public final void n1(int i) {
        boolean K = this.J.K(i);
        if (K) {
            this.P.i();
            this.P.w(this.J.M(i));
        }
        o1(this, i, i, K, 0);
        this.P.i();
        if (K) {
            this.P.A();
        }
    }

    public boolean o(boolean z, int i) {
        f1 I0;
        if ((i & 1) != 0 || (!f() && !this.A)) {
            return z || !j();
        }
        C1 c1 = this.S;
        if (c1 == null || (I0 = I0()) == null || !c1.a()) {
            return true;
        }
        I0.O(true);
        I0.M(this.A);
        I0.H(true);
        this.P.O(I0);
        this.c.r(I0);
        return false;
    }

    public final U0 o0(int i) {
        U0 u0;
        if (f() && this.M) {
            int a0 = this.L.a0();
            while (a0 > 0) {
                if (this.L.f0(a0) == 202 && kotlin.jvm.internal.t.c(this.L.g0(a0), w.C())) {
                    Object d0 = this.L.d0(a0);
                    kotlin.jvm.internal.t.e(d0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    U0 u02 = (U0) d0;
                    this.N = u02;
                    return u02;
                }
                a0 = this.L.C0(a0);
            }
        }
        if (this.J.x() > 0) {
            while (i > 0) {
                if (this.J.D(i) == 202 && kotlin.jvm.internal.t.c(this.J.E(i), w.C())) {
                    w.F f = this.x;
                    if (f == null || (u0 = (U0) f.c(i)) == null) {
                        Object A = this.J.A(i);
                        kotlin.jvm.internal.t.e(A, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        u0 = (U0) A;
                    }
                    this.N = u0;
                    return u0;
                }
                i = this.J.Q(i);
            }
        }
        U0 u03 = this.w;
        this.N = u03;
        return u03;
    }

    public void p(Qa.a aVar) {
        K1();
        if (!f()) {
            w.t("createNode() can only be called when inserting");
        }
        int c2 = this.o.c();
        H1 h1 = this.L;
        b0.b B = h1.B(h1.a0());
        this.m++;
        this.R.b(aVar, c2, B);
    }

    public final List p0() {
        if (!this.E) {
            return Da.v.n();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(n0.b.c(this.L, null, 0, null, 7, null));
        arrayList.addAll(n0.b.a(this.J));
        arrayList.addAll(a1());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p1() {
        /*
            r13 = this;
            java.util.List r0 = r13.u
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            r13.q1()
            goto Le7
        Ld:
            b0.D1 r0 = r13.J
            int r1 = r0.n()
            java.lang.Object r2 = r0.o()
            java.lang.Object r3 = r0.l()
            int r4 = r13.n
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 0
            r7 = 3
            if (r2 != 0) goto L5e
            if (r3 == 0) goto L4b
            if (r1 != r5) goto L4b
            b0.m$a r8 = b0.m.a
            java.lang.Object r8 = r8.a()
            boolean r8 = kotlin.jvm.internal.t.c(r3, r8)
            if (r8 != 0) goto L4b
            int r8 = r3.hashCode()
            long r9 = r13.n()
            long r9 = java.lang.Long.rotateLeft(r9, r7)
            long r11 = (long) r8
            long r8 = r9 ^ r11
            long r8 = java.lang.Long.rotateLeft(r8, r7)
            long r10 = (long) r4
            long r8 = r8 ^ r10
            r13.W = r8
            goto L7f
        L4b:
            long r8 = r13.n()
            long r8 = java.lang.Long.rotateLeft(r8, r7)
            long r10 = (long) r1
            long r8 = r8 ^ r10
            long r8 = java.lang.Long.rotateLeft(r8, r7)
            long r10 = (long) r4
        L5a:
            long r8 = r8 ^ r10
            r13.W = r8
            goto L7f
        L5e:
            boolean r8 = r2 instanceof java.lang.Enum
            if (r8 == 0) goto L7a
            r8 = r2
            java.lang.Enum r8 = (java.lang.Enum) r8
            int r8 = r8.ordinal()
        L69:
            long r9 = r13.n()
            long r9 = java.lang.Long.rotateLeft(r9, r7)
            long r11 = (long) r8
            long r8 = r9 ^ r11
            long r8 = java.lang.Long.rotateLeft(r8, r7)
            long r10 = (long) r6
            goto L5a
        L7a:
            int r8 = r2.hashCode()
            goto L69
        L7f:
            boolean r8 = r0.J()
            r9 = 0
            r13.y1(r8, r9)
            r13.g1()
            r0.g()
            if (r2 != 0) goto Lca
            if (r3 == 0) goto Lb7
            if (r1 != r5) goto Lb7
            b0.m$a r0 = b0.m.a
            java.lang.Object r0 = r0.a()
            boolean r0 = kotlin.jvm.internal.t.c(r3, r0)
            if (r0 != 0) goto Lb7
            int r0 = r3.hashCode()
            long r1 = r13.n()
            long r3 = (long) r4
            long r1 = r1 ^ r3
            long r1 = java.lang.Long.rotateRight(r1, r7)
            long r3 = (long) r0
            long r0 = r1 ^ r3
            long r0 = java.lang.Long.rotateRight(r0, r7)
            r13.W = r0
            goto Le7
        Lb7:
            long r2 = r13.n()
            long r4 = (long) r4
            long r2 = r2 ^ r4
            long r2 = java.lang.Long.rotateRight(r2, r7)
            long r0 = (long) r1
            long r0 = r0 ^ r2
        Lc3:
            long r0 = java.lang.Long.rotateRight(r0, r7)
            r13.W = r0
            goto Le7
        Lca:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Le2
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        Ld4:
            long r1 = r13.n()
            long r3 = (long) r6
            long r1 = r1 ^ r3
            long r1 = java.lang.Long.rotateRight(r1, r7)
            long r3 = (long) r0
            long r0 = r1 ^ r3
            goto Lc3
        Le2:
            int r0 = r2.hashCode()
            goto Ld4
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.s.p1():void");
    }

    public Ga.i q() {
        return this.U;
    }

    public final void q0() {
        g2.a(this.G);
        this.u.clear();
        this.f.a();
        this.x = null;
    }

    public final void q1() {
        this.m += this.J.T();
    }

    public I r() {
        return n0();
    }

    public final void r0() {
        j0.x xVar = j0.x.a;
        Object a2 = xVar.a("Compose:Composer.dispose");
        try {
            this.c.u(this);
            q0();
            k().clear();
            this.I = true;
            Ca.I i = Ca.I.a;
            xVar.b(a2);
        } catch (Throwable th) {
            j0.x.a.b(a2);
            throw th;
        }
    }

    public final void r1() {
        this.m = this.J.v();
        this.J.U();
    }

    public void s() {
        K1();
        if (f()) {
            w.t("useNode() called while inserting");
        }
        Object L0 = L0(this.J);
        this.P.w(L0);
        if (this.A && (L0 instanceof i)) {
            this.P.d0(L0);
        }
    }

    public final void s0(w.P p, Qa.p pVar) {
        if (this.H) {
            w.t("Reentrant composition is not supported");
        }
        this.h.a();
        j0.x xVar = j0.x.a;
        Object a2 = xVar.a("Compose:recompose");
        try {
            this.D = Long.hashCode(l0.v.M().i());
            this.x = null;
            D1(p);
            this.l = 0;
            this.H = true;
            try {
                A1();
                Object W0 = W0();
                if (W0 != pVar && pVar != null) {
                    I1(pVar);
                }
                c cVar = this.F;
                d0.c b2 = U1.b();
                try {
                    b2.b(cVar);
                    if (pVar != null) {
                        x1(200, w.D());
                        j0.j.a(this, pVar);
                        w0();
                    } else if ((!this.s && !this.y) || W0 == null || kotlin.jvm.internal.t.c(W0, m.a.a())) {
                        p1();
                    } else {
                        x1(200, w.D());
                        j0.j.a(this, (Qa.p) kotlin.jvm.internal.V.e(W0, 2));
                        w0();
                    }
                    b2.u(b2.m() - 1);
                    y0();
                    this.H = false;
                    this.u.clear();
                    m0();
                    Ca.I i = Ca.I.a;
                    xVar.b(a2);
                } catch (Throwable th) {
                    b2.u(b2.m() - 1);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            j0.x.a.b(a2);
            throw th2;
        }
    }

    public final List s1(int i, Integer num) {
        if (!this.E) {
            return Da.v.n();
        }
        D1 w = this.d.w();
        try {
            return n0.b.g(w, i, num);
        } finally {
            w.d();
        }
    }

    public void t(Object obj) {
        C1(obj);
    }

    public void u() {
        w0();
        w0();
        this.y = w.e(this.z.g());
        this.N = null;
    }

    public final void u0(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        u0(this.J.Q(i), i2);
        if (this.J.K(i)) {
            this.P.w(Y0(this.J, i));
        }
    }

    public final List u1(Object obj) {
        List v0;
        if (!this.E) {
            return Da.v.n();
        }
        n0.q d2 = n0.b.d(this.d, new q(obj));
        return (d2 == null || (v0 = Da.D.v0(s1(d2.a(), d2.b()), a1())) == null) ? Da.v.n() : v0;
    }

    public void v() {
        v0(true);
    }

    public final void v0(boolean z) {
        long rotateRight;
        long j;
        int w;
        Set set;
        List list;
        long rotateRight2;
        long j2;
        int e = this.o.e() - 1;
        if (f()) {
            int a0 = this.L.a0();
            int f0 = this.L.f0(a0);
            Object g0 = this.L.g0(a0);
            Object d0 = this.L.d0(a0);
            if (g0 != null) {
                int ordinal = g0 instanceof Enum ? ((Enum) g0).ordinal() : g0.hashCode();
                rotateRight2 = Long.rotateRight(n() ^ 0, 3);
                j2 = ordinal;
            } else if (d0 == null || f0 != 207 || kotlin.jvm.internal.t.c(d0, m.a.a())) {
                rotateRight2 = Long.rotateRight(n() ^ e, 3);
                j2 = f0;
            } else {
                this.W = Long.rotateRight(d0.hashCode() ^ Long.rotateRight(n() ^ e, 3), 3);
            }
            this.W = Long.rotateRight(rotateRight2 ^ j2, 3);
        } else {
            int u = this.J.u();
            int D = this.J.D(u);
            Object E = this.J.E(u);
            Object A = this.J.A(u);
            if (E != null) {
                int ordinal2 = E instanceof Enum ? ((Enum) E).ordinal() : E.hashCode();
                rotateRight = Long.rotateRight(n() ^ 0, 3);
                j = ordinal2;
            } else if (A == null || D != 207 || kotlin.jvm.internal.t.c(A, m.a.a())) {
                rotateRight = Long.rotateRight(n() ^ e, 3);
                j = D;
            } else {
                this.W = Long.rotateRight(A.hashCode() ^ Long.rotateRight(n() ^ e, 3), 3);
            }
            this.W = Long.rotateRight(rotateRight ^ j, 3);
        }
        int i = this.m;
        T0 t0 = this.k;
        if (t0 != null && t0.b().size() > 0) {
            List b2 = t0.b();
            List f = t0.f();
            Set e2 = l0.c.e(f);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f.size();
            int size2 = b2.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < size2) {
                n0 n0Var = (n0) b2.get(i2);
                if (e2.contains(n0Var)) {
                    set = e2;
                    if (!linkedHashSet.contains(n0Var)) {
                        if (i3 < size) {
                            n0 n0Var2 = (n0) f.get(i3);
                            if (n0Var2 != n0Var) {
                                int g = t0.g(n0Var2);
                                linkedHashSet.add(n0Var2);
                                if (g != i4) {
                                    int o = t0.o(n0Var2);
                                    list = f;
                                    this.P.x(t0.e() + g, i4 + t0.e(), o);
                                    t0.j(g, i4, o);
                                } else {
                                    list = f;
                                }
                            } else {
                                list = f;
                                i2++;
                            }
                            i3++;
                            i4 += t0.o(n0Var2);
                            e2 = set;
                            f = list;
                        }
                    }
                    e2 = set;
                } else {
                    this.P.Q(t0.g(n0Var) + t0.e(), n0Var.c());
                    t0.n(n0Var.b(), 0);
                    this.P.y(n0Var.b());
                    this.J.R(n0Var.b());
                    h1();
                    this.J.T();
                    set = e2;
                    w.o(this.u, n0Var.b(), n0Var.b() + this.J.F(n0Var.b()));
                }
                i2++;
                e2 = set;
            }
            this.P.i();
            if (b2.size() > 0) {
                this.P.y(this.J.m());
                this.J.U();
            }
        }
        boolean f2 = f();
        if (!f2 && (w = this.J.w()) > 0) {
            this.P.Y(w);
        }
        int i5 = this.l;
        while (!this.J.I()) {
            int k = this.J.k();
            h1();
            this.P.Q(i5, this.J.T());
            w.o(this.u, k, this.J.k());
        }
        if (f2) {
            if (z) {
                this.R.c();
                i = 1;
            }
            this.J.f();
            int a02 = this.L.a0();
            this.L.R();
            if (!this.J.t()) {
                int S0 = S0(a02);
                this.L.S();
                this.L.J(true);
                i1(this.Q);
                this.V = false;
                if (!this.d.isEmpty()) {
                    E1(S0, 0);
                    F1(S0, i);
                }
            }
        } else {
            if (z) {
                this.P.A();
            }
            this.P.g();
            int u2 = this.J.u();
            if (i != J1(u2)) {
                F1(u2, i);
            }
            if (z) {
                i = 1;
            }
            this.J.g();
            this.P.i();
        }
        C0(i, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v1(int r14, java.lang.Object r15, int r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.s.v1(int, java.lang.Object, int, java.lang.Object):void");
    }

    public void w() {
        w0();
        f1 I0 = I0();
        if (I0 == null || !I0.t()) {
            return;
        }
        I0.E(true);
    }

    public final void w0() {
        v0(false);
    }

    public final void w1(int i) {
        v1(i, null, g0.a.a(), null);
    }

    public Object x(D d2) {
        return J.b(n0(), d2);
    }

    public final void x0() {
        if (!(!this.H && this.B == 100)) {
            V0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.B = -1;
        this.A = false;
    }

    public final void x1(int i, Object obj) {
        v1(i, obj, g0.a.a(), null);
    }

    public void y() {
        this.r = true;
        this.E = true;
        this.d.h();
        this.K.h();
        this.L.s1();
    }

    public final void y0() {
        w0();
        this.c.c();
        w0();
        this.P.k();
        E0();
        this.J.d();
        this.s = false;
        this.y = w.e(this.z.g());
    }

    public final void y1(boolean z, Object obj) {
        if (z) {
            this.J.X();
            return;
        }
        if (obj != null && this.J.l() != obj) {
            this.P.a0(obj);
        }
        this.J.W();
    }

    public d1 z() {
        return I0();
    }

    public final void z0() {
        if (this.L.Y()) {
            H1 x = this.K.x();
            this.L = x;
            x.U0();
            this.M = false;
            this.N = null;
        }
    }

    public final void z1() {
        this.B = 100;
        this.A = true;
    }

    public static final class a implements z1 {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        public void e() {
            this.a.w();
        }

        public void g() {
            this.a.w();
        }

        public void c() {
        }
    }
}

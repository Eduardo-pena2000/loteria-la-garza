package N;

import P0.m1;
import P0.p0;
import Z0.I0;
import Z0.S0;
import Z0.T0;
import Z0.U0;
import Z0.e;
import Z0.j;
import b0.B1;
import b0.C0;
import b0.U1;
import b0.g1;
import b0.h2;
import b0.m;
import java.util.Arrays;
import java.util.List;
import v0.E1;
import v0.i1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c0 {
    public final Z0.e a;
    public final C0 b = U1.i(null, null, 2, null);
    public Z0.e c;
    public final l0.E d;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ e.d b;
        public final /* synthetic */ m1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e.d dVar, m1 m1Var) {
            super(0);
            this.b = dVar;
            this.c = m1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            c0.l(c0.this, (Z0.j) this.b.g(), this.c);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ e.d b;
        public final /* synthetic */ h2 c;
        public final /* synthetic */ h2 d;
        public final /* synthetic */ h2 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e.d dVar, h2 h2Var, h2 h2Var2, h2 h2Var3) {
            super(1);
            this.b = dVar;
            this.c = h2Var;
            this.d = h2Var2;
            this.e = h2Var3;
        }

        public final void a(F f) {
            U0 b;
            U0 b2;
            U0 b3;
            c0 c0Var = c0.this;
            U0 b4 = ((Z0.j) this.b.g()).b();
            I0 i0 = null;
            I0 m = c0.m(c0Var, c0.m(c0Var, b4 != null ? b4.d() : null, (!c0.g(this.c) || (b3 = ((Z0.j) this.b.g()).b()) == null) ? null : b3.a()), (!c0.i(this.d) || (b2 = ((Z0.j) this.b.g()).b()) == null) ? null : b2.b());
            if (c0.h(this.e) && (b = ((Z0.j) this.b.g()).b()) != null) {
                i0 = b.c();
            }
            I0 m2 = c0.m(c0Var, m, i0);
            if (m2 != null) {
                e.d dVar = this.b;
                f.a(m2, dVar.h(), dVar.f());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((F) obj);
            return Ca.I.a;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(2);
            this.b = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            c0.this.b(mVar, g1.a(this.b | 1));
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.l b;

        public static final class a implements b0.X {
            public final /* synthetic */ c0 a;
            public final /* synthetic */ Qa.l b;

            public a(c0 c0Var, Qa.l lVar) {
                this.a = c0Var;
                this.b = lVar;
            }

            public void dispose() {
                c0.k(this.a).remove(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Qa.l lVar) {
            super(1);
            this.b = lVar;
        }

        public final b0.X invoke(b0.Y y) {
            c0.k(c0.this).add(this.b);
            return new a(c0.this, this.b);
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ Qa.l c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object[] objArr, Qa.l lVar, int i) {
            super(2);
            this.b = objArr;
            this.c = lVar;
            this.d = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            c0 c0Var = c0.this;
            Object[] objArr = this.b;
            c0.j(c0Var, Arrays.copyOf(objArr, objArr.length), this.c, mVar, g1.a(this.d | 1));
        }
    }

    public static final class f implements E1 {
        public final /* synthetic */ v0.m1 a;

        public f(v0.m1 m1Var) {
            this.a = m1Var;
        }

        public i1 createOutline-Pq9zytI(long j, n1.t tVar, n1.d dVar) {
            return new i1.a(this.a);
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.a {
        public g() {
            super(0);
        }

        public final Boolean invoke() {
            S0 l;
            Z0.e p = c0.this.p();
            T0 q = c0.this.q();
            return Boolean.valueOf(kotlin.jvm.internal.t.c(p, (q == null || (l = q.l()) == null) ? null : l.j()));
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ n1.p a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(n1.p pVar) {
            super(0);
            this.a = pVar;
        }

        public final long a() {
            return this.a.i();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n1.n.c(a());
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.a {
        public static final i a = new i();

        public i() {
            super(0);
        }

        public final long a() {
            return n1.n.b.b();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n1.n.c(a());
        }
    }

    public c0(Z0.e eVar) {
        I0 d2;
        this.a = eVar;
        e.b bVar = new e.b(eVar);
        List d3 = eVar.d(0, eVar.length());
        int size = d3.size();
        for (int i2 = 0; i2 < size; i2++) {
            e.d dVar = (e.d) d3.get(i2);
            U0 b2 = ((Z0.j) dVar.g()).b();
            if (b2 != null && (d2 = b2.d()) != null) {
                bVar.a(d2, dVar.h(), dVar.f());
            }
        }
        this.c = bVar.l();
        this.d = U1.e();
    }

    public static /* synthetic */ f0 a(c0 c0Var, int i2, int i3, g0 g0Var) {
        return x(c0Var, i2, i3, g0Var);
    }

    public static final boolean c(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    public static final boolean d(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    public static final boolean e(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    public static final /* synthetic */ boolean g(h2 h2Var) {
        return c(h2Var);
    }

    public static final /* synthetic */ boolean h(h2 h2Var) {
        return d(h2Var);
    }

    public static final /* synthetic */ boolean i(h2 h2Var) {
        return e(h2Var);
    }

    public static final /* synthetic */ void j(c0 c0Var, Object[] objArr, Qa.l lVar, b0.m mVar, int i2) {
        c0Var.f(objArr, lVar, mVar, i2);
    }

    public static final /* synthetic */ l0.E k(c0 c0Var) {
        return c0Var.d;
    }

    public static final /* synthetic */ void l(c0 c0Var, Z0.j jVar, m1 m1Var) {
        c0Var.r(jVar, m1Var);
    }

    public static final /* synthetic */ I0 m(c0 c0Var, I0 i0, I0 i02) {
        return c0Var.s(i0, i02);
    }

    public static final f0 x(c0 c0Var, int i2, int i3, g0 g0Var) {
        T0 q = c0Var.q();
        if (q == null) {
            return g0Var.a(0, 0, i.a);
        }
        n1.p b2 = n1.q.b(q.z(i2, i3).a());
        return g0Var.a(b2.j(), b2.e(), new h(b2));
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public final void b(b0.m mVar, int i2) {
        int i3;
        androidx.compose.ui.e eVar;
        b0.m i4 = mVar.i(1154651354);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (i4.E(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && i4.j()) {
            i4.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(1154651354, i3, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:152)");
            }
            m1 m1Var = (m1) i4.x(p0.q());
            Z0.e eVar2 = this.c;
            ?? r12 = 0;
            List d2 = eVar2.d(0, eVar2.length());
            int size = d2.size();
            int i6 = 0;
            while (i6 < size) {
                e.d dVar = (e.d) d2.get(i6);
                E1 v = v(dVar);
                if (v == null || (eVar = s0.h.a(androidx.compose.ui.e.a, v)) == null) {
                    eVar = androidx.compose.ui.e.a;
                }
                Object C = i4.C();
                m.a aVar = b0.m.a;
                if (C == aVar.a()) {
                    C = E.l.a();
                    i4.t(C);
                }
                E.m mVar2 = (E.m) C;
                androidx.compose.ui.e b2 = I0.y.b(androidx.compose.foundation.c.b(w(eVar, dVar.h(), dVar.f()), mVar2, r12, i5, null), I0.x.a.b(), r12, i5, null);
                boolean E = i4.E(this) | i4.U(dVar) | i4.E(m1Var);
                Object C2 = i4.C();
                if (E || C2 == aVar.a()) {
                    C2 = new a(dVar, m1Var);
                    i4.t(C2);
                }
                F.f.a(androidx.compose.foundation.b.f(b2, mVar2, null, false, null, null, null, null, null, (Qa.a) C2, 252, null), i4, r12);
                h2 a2 = E.i.a(mVar2, i4, 6);
                h2 a3 = E.f.a(mVar2, i4, 6);
                h2 a4 = E.p.a(mVar2, i4, 6);
                Boolean valueOf = Boolean.valueOf(e(a2));
                Boolean valueOf2 = Boolean.valueOf(c(a3));
                Boolean valueOf3 = Boolean.valueOf(d(a4));
                U0 b3 = ((Z0.j) dVar.g()).b();
                I0 d3 = b3 != null ? b3.d() : null;
                U0 b4 = ((Z0.j) dVar.g()).b();
                I0 a5 = b4 != null ? b4.a() : null;
                U0 b5 = ((Z0.j) dVar.g()).b();
                I0 b6 = b5 != null ? b5.b() : null;
                U0 b7 = ((Z0.j) dVar.g()).b();
                Object[] objArr = {valueOf, valueOf2, valueOf3, d3, a5, b6, b7 != null ? b7.c() : null};
                boolean E2 = i4.E(this) | i4.U(dVar) | i4.U(a3) | i4.U(a2) | i4.U(a4);
                Object C3 = i4.C();
                if (E2 || C3 == aVar.a()) {
                    Object bVar = new b(dVar, a3, a2, a4);
                    i4.t(bVar);
                    C3 = bVar;
                }
                f(objArr, (Qa.l) C3, i4, (i3 << 6) & 896);
                i6++;
                i5 = 2;
                r12 = 0;
            }
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new c(i2));
        }
    }

    public final void f(Object[] objArr, Qa.l lVar, b0.m mVar, int i2) {
        b0.m i3 = mVar.i(-2083052099);
        int i4 = (i2 & 48) == 0 ? (i3.E(lVar) ? 32 : 16) | i2 : i2;
        if ((i2 & 384) == 0) {
            i4 |= i3.E(this) ? 256 : 128;
        }
        i3.H(-416717687, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i4 |= i3.E(obj) ? 4 : 0;
        }
        i3.S();
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if ((i4 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-2083052099, i4, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:237)");
            }
            kotlin.jvm.internal.T t = new kotlin.jvm.internal.T(2);
            t.a(lVar);
            t.b(objArr);
            Object[] d2 = t.d(new Object[t.c()]);
            boolean E = ((i4 & 112) == 32) | i3.E(this);
            Object C = i3.C();
            if (E || C == b0.m.a.a()) {
                C = new d(lVar);
                i3.t(C);
            }
            b0.b0.c(d2, (Qa.l) C, i3, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new e(objArr, lVar, i2));
        }
    }

    public final Z0.e n() {
        Z0.e l;
        if (this.d.isEmpty()) {
            l = this.c;
        } else {
            e.b bVar = new e.b(0, 1, null);
            bVar.e(this.a);
            F f2 = new F(bVar);
            l0.E e2 = this.d;
            int size = e2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Qa.l) e2.get(i2)).invoke(f2);
            }
            l = bVar.l();
        }
        this.c = l;
        return l;
    }

    public final Qa.a o() {
        return new g();
    }

    public final Z0.e p() {
        return this.c;
    }

    public final T0 q() {
        return (T0) this.b.getValue();
    }

    public final void r(Z0.j jVar, m1 m1Var) {
        if (jVar instanceof j.b) {
            jVar.a();
            try {
                m1Var.a(((j.b) jVar).c());
            } catch (IllegalArgumentException unused) {
            }
        } else if (jVar instanceof j.a) {
            jVar.a();
        }
    }

    public final I0 s(I0 i0, I0 i02) {
        I0 x;
        return (i0 == null || (x = i0.x(i02)) == null) ? i02 : x;
    }

    public final v0.m1 t(e.d dVar) {
        T0 q;
        if (!((Boolean) o().invoke()).booleanValue() || (q = q()) == null) {
            return null;
        }
        v0.m1 z = q.z(dVar.h(), dVar.f());
        u0.h d2 = q.d(dVar.h());
        z.o(u0.f.t(u0.g.a(q.q(dVar.h()) == q.q(dVar.f()) ? Math.min(q.d(dVar.f() - 1).i(), d2.i()) : 0.0f, d2.l())));
        return z;
    }

    public final void u(T0 t0) {
        this.b.setValue(t0);
    }

    public final E1 v(e.d dVar) {
        v0.m1 t = t(dVar);
        if (t != null) {
            return new f(t);
        }
        return null;
    }

    public final androidx.compose.ui.e w(androidx.compose.ui.e eVar, int i2, int i3) {
        return eVar.then(new h0(new b0(this, i2, i3)));
    }
}

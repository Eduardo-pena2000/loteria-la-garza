package y;

import Ca.I;
import androidx.compose.ui.layout.q;
import b0.h2;
import z.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o extends v {
    public o0 a;
    public o0.a b;
    public o0.a c;
    public o0.a d;
    public androidx.compose.animation.f e;
    public androidx.compose.animation.g f;
    public Qa.a g;
    public u h;
    public boolean i;
    public o0.e l;
    public long j = y.h.a();
    public long k = n1.c.b(0, 0, 0, 0, 15, null);
    public final Qa.l m = new i();
    public final Qa.l n = new j();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.layout.q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.layout.q qVar) {
            super(1);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.P(aVar, this.a, 0, 0, 0.0f, 4, null);
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.layout.q a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ Qa.l d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.ui.layout.q qVar, long j, long j2, Qa.l lVar) {
            super(1);
            this.a = qVar;
            this.b = j;
            this.c = j2;
            this.d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            aVar.x0(this.a, n1.n.k(this.c) + n1.n.k(this.b), n1.n.l(this.c) + n1.n.l(this.b), 0.0f, this.d);
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.layout.q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.layout.q qVar) {
            super(1);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.P(aVar, this.a, 0, 0, 0.0f, 4, null);
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j) {
            super(1);
            this.b = j;
        }

        public final long a(m mVar) {
            return o.this.Q1(mVar, this.b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.r.b(a((m) obj));
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.l {
        public static final f a = new f();

        public f() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z.G invoke(o0.b bVar) {
            return androidx.compose.animation.e.c();
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(1);
            this.b = j;
        }

        public final long a(m mVar) {
            return o.this.S1(mVar, this.b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.n.c(a((m) obj));
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j) {
            super(1);
            this.b = j;
        }

        public final long a(m mVar) {
            return o.this.R1(mVar, this.b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.n.c(a((m) obj));
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.l {
        public i() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z.G invoke(o0.b bVar) {
            m mVar = m.PreEnter;
            m mVar2 = m.Visible;
            z.G g = null;
            if (bVar.c(mVar, mVar2)) {
                y.i a = o.this.F1().b().a();
                if (a != null) {
                    g = a.b();
                }
            } else if (bVar.c(mVar2, m.PostExit)) {
                y.i a2 = o.this.G1().b().a();
                if (a2 != null) {
                    g = a2.b();
                }
            } else {
                g = androidx.compose.animation.e.d();
            }
            return g == null ? androidx.compose.animation.e.d() : g;
        }
    }

    public static final class j extends kotlin.jvm.internal.u implements Qa.l {
        public j() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z.G invoke(o0.b bVar) {
            z.G a;
            z.G a2;
            m mVar = m.PreEnter;
            m mVar2 = m.Visible;
            if (bVar.c(mVar, mVar2)) {
                C f = o.this.F1().b().f();
                return (f == null || (a2 = f.a()) == null) ? androidx.compose.animation.e.c() : a2;
            }
            if (!bVar.c(mVar2, m.PostExit)) {
                return androidx.compose.animation.e.c();
            }
            C f2 = o.this.G1().b().f();
            return (f2 == null || (a = f2.a()) == null) ? androidx.compose.animation.e.c() : a;
        }
    }

    public o(o0 o0Var, o0.a aVar, o0.a aVar2, o0.a aVar3, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, Qa.a aVar4, u uVar) {
        this.a = o0Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = fVar;
        this.f = gVar;
        this.g = aVar4;
        this.h = uVar;
    }

    public final o0.e E1() {
        o0.e a2;
        if (this.a.m().c(m.PreEnter, m.Visible)) {
            y.i a3 = this.e.b().a();
            if (a3 == null || (a2 = a3.a()) == null) {
                y.i a4 = this.f.b().a();
                if (a4 != null) {
                    return a4.a();
                }
                return null;
            }
        } else {
            y.i a5 = this.f.b().a();
            if (a5 == null || (a2 = a5.a()) == null) {
                y.i a6 = this.e.b().a();
                if (a6 != null) {
                    return a6.a();
                }
                return null;
            }
        }
        return a2;
    }

    public final androidx.compose.animation.f F1() {
        return this.e;
    }

    public final androidx.compose.animation.g G1() {
        return this.f;
    }

    public final void H1(Qa.a aVar) {
        this.g = aVar;
    }

    public final void I1(androidx.compose.animation.f fVar) {
        this.e = fVar;
    }

    public final void J1(androidx.compose.animation.g gVar) {
        this.f = gVar;
    }

    public final void K1(u uVar) {
        this.h = uVar;
    }

    public final void L1(long j2) {
        this.i = true;
        this.k = j2;
    }

    public final void M1(o0.a aVar) {
        this.c = aVar;
    }

    public final void N1(o0.a aVar) {
        this.b = aVar;
    }

    public final void O1(o0.a aVar) {
        this.d = aVar;
    }

    public final void P1(o0 o0Var) {
        this.a = o0Var;
    }

    public final long Q1(m mVar, long j2) {
        Qa.l d2;
        Qa.l d3;
        int i2 = a.a[mVar.ordinal()];
        if (i2 == 1) {
            return j2;
        }
        if (i2 == 2) {
            y.i a2 = this.e.b().a();
            return (a2 == null || (d2 = a2.d()) == null) ? j2 : ((n1.r) d2.invoke(n1.r.b(j2))).j();
        }
        if (i2 != 3) {
            throw new Ca.o();
        }
        y.i a3 = this.f.b().a();
        return (a3 == null || (d3 = a3.d()) == null) ? j2 : ((n1.r) d3.invoke(n1.r.b(j2))).j();
    }

    public final long R1(m mVar, long j2) {
        Qa.l b2;
        Qa.l b3;
        C f2 = this.e.b().f();
        long b4 = (f2 == null || (b3 = f2.b()) == null) ? n1.n.b.b() : ((n1.n) b3.invoke(n1.r.b(j2))).q();
        C f3 = this.f.b().f();
        long b5 = (f3 == null || (b2 = f3.b()) == null) ? n1.n.b.b() : ((n1.n) b2.invoke(n1.r.b(j2))).q();
        int i2 = a.a[mVar.ordinal()];
        if (i2 == 1) {
            return n1.n.b.b();
        }
        if (i2 == 2) {
            return b4;
        }
        if (i2 == 3) {
            return b5;
        }
        throw new Ca.o();
    }

    public final long S1(m mVar, long j2) {
        if (this.l == null) {
            return n1.n.b.b();
        }
        if (E1() == null) {
            return n1.n.b.b();
        }
        if (kotlin.jvm.internal.t.c(this.l, E1())) {
            return n1.n.b.b();
        }
        int i2 = a.a[mVar.ordinal()];
        if (i2 == 1) {
            return n1.n.b.b();
        }
        if (i2 == 2) {
            return n1.n.b.b();
        }
        if (i2 != 3) {
            throw new Ca.o();
        }
        y.i a2 = this.f.b().a();
        if (a2 == null) {
            return n1.n.b.b();
        }
        long j3 = ((n1.r) a2.d().invoke(n1.r.b(j2))).j();
        o0.e E1 = E1();
        kotlin.jvm.internal.t.d(E1);
        n1.t tVar = n1.t.a;
        long a3 = E1.a(j2, j3, tVar);
        o0.e eVar = this.l;
        kotlin.jvm.internal.t.d(eVar);
        return n1.n.n(a3, eVar.a(j2, j3, tVar));
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j2) {
        h2 a3;
        h2 a4;
        if (this.a.h() == this.a.o()) {
            this.l = null;
        } else if (this.l == null) {
            o0.e E1 = E1();
            if (E1 == null) {
                E1 = o0.e.a.o();
            }
            this.l = E1;
        }
        if (lVar.h0()) {
            androidx.compose.ui.layout.q C0 = a2.C0(j2);
            long a5 = n1.s.a(C0.W0(), C0.P0());
            this.j = a5;
            L1(j2);
            return androidx.compose.ui.layout.l.O0(lVar, n1.r.g(a5), n1.r.f(a5), null, new b(C0), 4, null);
        }
        if (!((Boolean) this.g.invoke()).booleanValue()) {
            androidx.compose.ui.layout.q C02 = a2.C0(j2);
            return androidx.compose.ui.layout.l.O0(lVar, C02.W0(), C02.P0(), null, new d(C02), 4, null);
        }
        Qa.l a6 = this.h.a();
        androidx.compose.ui.layout.q C03 = a2.C0(j2);
        long a7 = n1.s.a(C03.W0(), C03.P0());
        long j3 = y.h.b(this.j) ? this.j : a7;
        o0.a aVar = this.b;
        h2 a8 = aVar != null ? aVar.a(this.m, new e(j3)) : null;
        if (a8 != null) {
            a7 = ((n1.r) a8.getValue()).j();
        }
        long d2 = n1.c.d(j2, a7);
        o0.a aVar2 = this.c;
        long b2 = (aVar2 == null || (a4 = aVar2.a(f.a, new g(j3))) == null) ? n1.n.b.b() : ((n1.n) a4.getValue()).q();
        o0.a aVar3 = this.d;
        long b3 = (aVar3 == null || (a3 = aVar3.a(this.n, new h(j3))) == null) ? n1.n.b.b() : ((n1.n) a3.getValue()).q();
        o0.e eVar = this.l;
        return androidx.compose.ui.layout.l.O0(lVar, n1.r.g(d2), n1.r.f(d2), null, new c(C03, n1.n.o(eVar != null ? eVar.a(j3, d2, n1.t.a) : n1.n.b.b(), b3), b2, a6), 4, null);
    }

    public void onAttach() {
        super.onAttach();
        this.i = false;
        this.j = y.h.a();
    }
}

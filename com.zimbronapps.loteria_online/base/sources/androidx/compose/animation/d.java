package androidx.compose.animation;

import Ca.I;
import M0.C;
import Qa.l;
import androidx.compose.ui.layout.q;
import b0.C0;
import b0.U1;
import b0.h2;
import b0.m;
import kotlin.jvm.internal.u;
import n1.r;
import n1.s;
import n1.t;
import s0.h;
import w.P;
import w.d0;
import y.A;
import y.k;
import y.w;
import z.G;
import z.j;
import z.o0;
import z.p0;
import z.u0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements c {
    public final o0 a;
    public o0.e b;
    public t c;
    public final C0 d = U1.i(r.b(r.b.a()), null, 2, null);
    public final P e = d0.b();
    public h2 f;

    public final class b extends w {
        public final o0.a b;
        public final h2 c;

        public static final class a extends u implements l {
            public final /* synthetic */ d a;
            public final /* synthetic */ q b;
            public final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, q qVar, long j) {
                super(1);
                this.a = dVar;
                this.b = qVar;
                this.c = j;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((q.a) obj);
                return I.a;
            }

            public final void invoke(q.a aVar) {
                q.a.U(aVar, this.b, this.a.g().a(s.a(this.b.W0(), this.b.P0()), this.c, t.a), 0.0f, 2, null);
            }
        }

        public static final class b extends u implements l {
            public final /* synthetic */ d a;
            public final /* synthetic */ b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, b bVar) {
                super(1);
                this.a = dVar;
                this.b = bVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(o0.b bVar) {
                G a;
                h2 h2Var = (h2) this.a.h().e(bVar.b());
                long j = h2Var != null ? ((r) h2Var.getValue()).j() : r.b.a();
                h2 h2Var2 = (h2) this.a.h().e(bVar.a());
                long j2 = h2Var2 != null ? ((r) h2Var2.getValue()).j() : r.b.a();
                A a2 = (A) this.b.b().getValue();
                return (a2 == null || (a = a2.a(j, j2)) == null) ? j.h(0.0f, 0.0f, null, 7, null) : a;
            }
        }

        public static final class c extends u implements l {
            public final /* synthetic */ d a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d dVar) {
                super(1);
                this.a = dVar;
            }

            public final long a(Object obj) {
                h2 h2Var = (h2) this.a.h().e(obj);
                return h2Var != null ? ((r) h2Var.getValue()).j() : r.b.a();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return r.b(a(obj));
            }
        }

        public b(o0.a aVar, h2 h2Var) {
            this.b = aVar;
            this.c = h2Var;
        }

        public final h2 b() {
            return this.c;
        }

        public C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
            q C0 = a2.C0(j);
            h2 a3 = this.b.a(new b(d.this, this), new c(d.this));
            d.this.i(a3);
            long a4 = lVar.h0() ? s.a(C0.W0(), C0.P0()) : ((r) a3.getValue()).j();
            return androidx.compose.ui.layout.l.O0(lVar, r.g(a4), r.f(a4), null, new a(d.this, C0, a4), 4, null);
        }
    }

    public d(o0 o0Var, o0.e eVar, t tVar) {
        this.a = o0Var;
        this.b = eVar;
        this.c = tVar;
    }

    public static final boolean e(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    public static final void f(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    public Object a() {
        return this.a.m().a();
    }

    public Object b() {
        return this.a.m().b();
    }

    public final androidx.compose.ui.e d(k kVar, m mVar, int i) {
        androidx.compose.ui.e eVar;
        if (b0.w.L()) {
            b0.w.U(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)");
        }
        boolean U = mVar.U(this);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = U1.i(Boolean.FALSE, null, 2, null);
            mVar.t(C);
        }
        C0 c0 = (C0) C;
        h2 o = U1.o(kVar.b(), mVar, 0);
        if (kotlin.jvm.internal.t.c(this.a.h(), this.a.o())) {
            f(c0, false);
        } else if (o.getValue() != null) {
            f(c0, true);
        }
        if (e(c0)) {
            mVar.V(249037309);
            o0.a b2 = p0.b(this.a, u0.g(r.b), null, mVar, 0, 2);
            boolean U2 = mVar.U(b2);
            Object C2 = mVar.C();
            if (U2 || C2 == m.a.a()) {
                A a2 = (A) o.getValue();
                C2 = ((a2 == null || a2.b()) ? h.b(androidx.compose.ui.e.a) : androidx.compose.ui.e.a).then(new b(b2, o));
                mVar.t(C2);
            }
            eVar = (androidx.compose.ui.e) C2;
            mVar.P();
        } else {
            mVar.V(249353726);
            mVar.P();
            this.f = null;
            eVar = androidx.compose.ui.e.a;
        }
        if (b0.w.L()) {
            b0.w.T();
        }
        return eVar;
    }

    public o0.e g() {
        return this.b;
    }

    public final P h() {
        return this.e;
    }

    public final void i(h2 h2Var) {
        this.f = h2Var;
    }

    public void j(o0.e eVar) {
        this.b = eVar;
    }

    public final void k(t tVar) {
        this.c = tVar;
    }

    public final void l(long j) {
        this.d.setValue(r.b(j));
    }

    public static final class a implements M0.I {
        public final C0 b;

        public a(boolean z) {
            this.b = U1.i(Boolean.valueOf(z), null, 2, null);
        }

        public final boolean b() {
            return ((Boolean) this.b.getValue()).booleanValue();
        }

        public final void f(boolean z) {
            this.b.setValue(Boolean.valueOf(z));
        }

        public Object p(n1.d dVar, Object obj) {
            return this;
        }
    }
}

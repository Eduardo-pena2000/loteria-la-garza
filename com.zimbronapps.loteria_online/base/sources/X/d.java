package X;

import F.c;
import O0.g;
import Z0.Y0;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import b0.B1;
import b0.c1;
import b0.g1;
import b0.h2;
import b0.m2;
import java.util.List;
import java.util.NoSuchElementException;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final z.x e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.p a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ Qa.q d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ F.e0 g;
        public final /* synthetic */ n0 h;
        public final /* synthetic */ p0 i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qa.p pVar, androidx.compose.ui.e eVar, Qa.p pVar2, Qa.q qVar, float f, float f2, F.e0 e0Var, n0 n0Var, p0 p0Var, int i, int i2) {
            super(2);
            this.a = pVar;
            this.b = eVar;
            this.c = pVar2;
            this.d = qVar;
            this.e = f;
            this.f = f2;
            this.g = e0Var;
            this.h = n0Var;
            this.i = p0Var;
            this.j = i;
            this.k = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            d.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, mVar, g1.a(this.j | 1), this.k);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ p0 a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p0 p0Var, float f) {
            super(0);
            this.a = p0Var;
            this.b = f;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            q0 state;
            p0 p0Var = this.a;
            if (kotlin.jvm.internal.t.b((p0Var == null || (state = p0Var.getState()) == null) ? null : Float.valueOf(state.e()), -this.b)) {
                return;
            }
            p0 p0Var2 = this.a;
            q0 state2 = p0Var2 != null ? p0Var2.getState() : null;
            if (state2 == null) {
                return;
            }
            state2.i(-this.b);
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ F.e0 a;
        public final /* synthetic */ float b;
        public final /* synthetic */ p0 c;
        public final /* synthetic */ n0 d;
        public final /* synthetic */ Qa.p e;
        public final /* synthetic */ Y0 f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ Qa.p h;
        public final /* synthetic */ Qa.p i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(F.e0 e0Var, float f, p0 p0Var, n0 n0Var, Qa.p pVar, Y0 y0, boolean z, Qa.p pVar2, Qa.p pVar3) {
            super(2);
            this.a = e0Var;
            this.b = f;
            this.c = p0Var;
            this.d = n0Var;
            this.e = pVar;
            this.f = y0;
            this.g = z;
            this.h = pVar2;
            this.i = pVar3;
        }

        public static /* synthetic */ float a(p0 p0Var) {
            return b(p0Var);
        }

        public static final float b(p0 p0Var) {
            q0 state;
            if (p0Var == null || (state = p0Var.getState()) == null) {
                return 0.0f;
            }
            return state.d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-1943739546, i, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)");
            }
            androidx.compose.ui.e k = androidx.compose.foundation.layout.g.k(s0.h.b(F.h0.c(androidx.compose.ui.e.a, this.a)), 0.0f, this.b, 1, null);
            boolean U = mVar.U(this.c);
            p0 p0Var = this.c;
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = new X.e(p0Var);
                mVar.t(C);
            }
            V v = (V) C;
            long d = this.d.d();
            long e = this.d.e();
            long c = this.d.c();
            Qa.p pVar = this.e;
            Y0 y0 = this.f;
            F.c cVar = F.c.a;
            d.i(k, v, d, e, c, pVar, y0, 1.0f, cVar.b(), this.g ? cVar.b() : cVar.g(), 0, false, this.h, this.i, mVar, 113246208, 3126);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Y0 c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Qa.p e;
        public final /* synthetic */ Qa.q f;
        public final /* synthetic */ float g;
        public final /* synthetic */ F.e0 h;
        public final /* synthetic */ n0 i;
        public final /* synthetic */ p0 j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.e eVar, Qa.p pVar, Y0 y0, boolean z, Qa.p pVar2, Qa.q qVar, float f, F.e0 e0Var, n0 n0Var, p0 p0Var, int i, int i2) {
            super(2);
            this.a = eVar;
            this.b = pVar;
            this.c = y0;
            this.d = z;
            this.e = pVar2;
            this.f = qVar;
            this.g = f;
            this.h = e0Var;
            this.i = n0Var;
            this.j = p0Var;
            this.k = i;
            this.l = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            d.h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, mVar, g1.a(this.k | 1), this.l);
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Qa.q qVar) {
            super(2);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(1370231018, i, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)");
            }
            c.e c = F.c.a.c();
            e.c i2 = o0.e.a.i();
            Qa.q qVar = this.a;
            e.a aVar = androidx.compose.ui.e.a;
            M0.B b = F.T.b(c, i2, mVar, 54);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, aVar);
            g.a aVar2 = O0.g.E8;
            Qa.a a2 = aVar2.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            b0.m b2 = m2.b(mVar);
            m2.e(b2, b, aVar2.e());
            m2.e(b2, r, aVar2.g());
            Qa.p b3 = aVar2.b();
            if (b2.f() || !kotlin.jvm.internal.t.c(b2.C(), Integer.valueOf(a))) {
                b2.t(Integer.valueOf(a));
                b2.J(Integer.valueOf(a), b3);
            }
            m2.e(b2, f, aVar2.f());
            qVar.invoke(F.W.a, mVar, 6);
            mVar.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ p0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p0 p0Var) {
            super(1);
            this.a = p0Var;
        }

        public final void a(float f) {
            q0 state = this.a.getState();
            state.h(state.d() + f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return Ca.I.a;
        }
    }

    public static final class g extends Ia.l implements Qa.q {
        public int a;
        public /* synthetic */ float b;
        public final /* synthetic */ p0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p0 p0Var, Ga.e eVar) {
            super(3, eVar);
            this.c = p0Var;
        }

        public final Object a(cb.O o, float f, Ga.e eVar) {
            g gVar = new g(this.c, eVar);
            gVar.b = f;
            return gVar.invokeSuspend(Ca.I.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((cb.O) obj, ((Number) obj2).floatValue(), (Ga.e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                float f2 = this.b;
                q0 state = this.c.getState();
                z.z c = this.c.c();
                z.i d = this.c.d();
                this.a = 1;
                if (d.l(state, f2, c, d, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return Ca.I.a;
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ p0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p0 p0Var) {
            super(0);
            this.a = p0Var;
        }

        public final Float invoke() {
            q0 state;
            p0 p0Var = this.a;
            return Float.valueOf(((p0Var == null || (state = p0Var.getState()) == null) ? 0.0f : state.f()) > 0.01f ? 1.0f : 0.0f);
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.p a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ Qa.q d;
        public final /* synthetic */ float e;
        public final /* synthetic */ F.e0 f;
        public final /* synthetic */ n0 g;
        public final /* synthetic */ p0 h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Qa.p pVar, androidx.compose.ui.e eVar, Qa.p pVar2, Qa.q qVar, float f, F.e0 e0Var, n0 n0Var, p0 p0Var, int i, int i2) {
            super(2);
            this.a = pVar;
            this.b = eVar;
            this.c = pVar2;
            this.d = qVar;
            this.e = f;
            this.f = e0Var;
            this.g = n0Var;
            this.h = p0Var;
            this.i = i;
            this.j = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            d.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, mVar, g1.a(this.i | 1), this.j);
        }
    }

    public static final class j extends kotlin.jvm.internal.u implements Qa.l {
        public static final j a = new j();

        public j() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((W0.D) obj);
            return Ca.I.a;
        }

        public final void invoke(W0.D d) {
        }
    }

    public static final class k implements M0.B {
        public final /* synthetic */ V a;
        public final /* synthetic */ c.e b;
        public final /* synthetic */ c.m c;
        public final /* synthetic */ int d;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ androidx.compose.ui.layout.q a;
            public final /* synthetic */ int b;
            public final /* synthetic */ androidx.compose.ui.layout.q c;
            public final /* synthetic */ c.e d;
            public final /* synthetic */ long e;
            public final /* synthetic */ androidx.compose.ui.layout.q f;
            public final /* synthetic */ androidx.compose.ui.layout.l g;
            public final /* synthetic */ c.m h;
            public final /* synthetic */ int i;
            public final /* synthetic */ int j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.ui.layout.q qVar, int i, androidx.compose.ui.layout.q qVar2, c.e eVar, long j, androidx.compose.ui.layout.q qVar3, androidx.compose.ui.layout.l lVar, c.m mVar, int i2, int i3) {
                super(1);
                this.a = qVar;
                this.b = i;
                this.c = qVar2;
                this.d = eVar;
                this.e = j;
                this.f = qVar3;
                this.g = lVar;
                this.h = mVar;
                this.i = i2;
                this.j = i3;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((q.a) obj);
                return Ca.I.a;
            }

            public final void invoke(q.a aVar) {
                int l;
                int i;
                int P0;
                int l2;
                androidx.compose.ui.layout.q qVar = this.a;
                q.a.Z(aVar, qVar, 0, (this.b - qVar.P0()) / 2, 0.0f, 4, null);
                androidx.compose.ui.layout.q qVar2 = this.c;
                c.e eVar = this.d;
                F.c cVar = F.c.a;
                if (kotlin.jvm.internal.t.c(eVar, cVar.b())) {
                    l = (n1.b.l(this.e) - this.c.W0()) / 2;
                    if (l < this.a.W0()) {
                        l2 = this.a.W0() - l;
                    } else if (this.c.W0() + l > n1.b.l(this.e) - this.f.W0()) {
                        l2 = (n1.b.l(this.e) - this.f.W0()) - (this.c.W0() + l);
                    }
                    l += l2;
                } else {
                    l = kotlin.jvm.internal.t.c(eVar, cVar.c()) ? (n1.b.l(this.e) - this.c.W0()) - this.f.W0() : Math.max(this.g.s0(d.k()), this.a.W0());
                }
                int i2 = l;
                c.m mVar = this.h;
                if (!kotlin.jvm.internal.t.c(mVar, cVar.b())) {
                    if (kotlin.jvm.internal.t.c(mVar, cVar.a())) {
                        int i3 = this.i;
                        if (i3 == 0) {
                            P0 = this.b - this.c.P0();
                        } else {
                            int P02 = i3 - (this.c.P0() - this.j);
                            int P03 = this.c.P0() + P02;
                            if (P03 > n1.b.k(this.e)) {
                                P02 -= P03 - n1.b.k(this.e);
                            }
                            i = (this.b - this.c.P0()) - Math.max(0, P02);
                        }
                    } else {
                        i = 0;
                    }
                    q.a.Z(aVar, qVar2, i2, i, 0.0f, 4, null);
                    q.a.Z(aVar, this.f, n1.b.l(this.e) - this.f.W0(), (this.b - this.f.P0()) / 2, 0.0f, 4, null);
                }
                P0 = (this.b - this.c.P0()) / 2;
                i = P0;
                q.a.Z(aVar, qVar2, i2, i, 0.0f, 4, null);
                q.a.Z(aVar, this.f, n1.b.l(this.e) - this.f.W0(), (this.b - this.f.P0()) / 2, 0.0f, 4, null);
            }
        }

        public k(V v, c.e eVar, c.m mVar, int i) {
            this.a = v;
            this.b = eVar;
            this.c = mVar;
            this.d = i;
        }

        public final M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                M0.A a2 = (M0.A) list.get(i);
                if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a(a2), "navigationIcon")) {
                    androidx.compose.ui.layout.q C0 = a2.C0(n1.b.d(j, 0, 0, 0, 0, 14, null));
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        M0.A a3 = (M0.A) list.get(i2);
                        if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a(a3), "actionIcons")) {
                            androidx.compose.ui.layout.q C02 = a3.C0(n1.b.d(j, 0, 0, 0, 0, 14, null));
                            int l = n1.b.l(j) == Integer.MAX_VALUE ? n1.b.l(j) : Wa.n.e((n1.b.l(j) - C0.W0()) - C02.W0(), 0);
                            int size3 = list.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                M0.A a4 = (M0.A) list.get(i3);
                                if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a(a4), "title")) {
                                    androidx.compose.ui.layout.q C03 = a4.C0(n1.b.d(j, 0, l, 0, 0, 12, null));
                                    int W = C03.W(M0.b.b()) != Integer.MIN_VALUE ? C03.W(M0.b.b()) : 0;
                                    float a5 = this.a.a();
                                    int k = n1.b.k(j) == Integer.MAX_VALUE ? n1.b.k(j) : n1.b.k(j) + (Float.isNaN(a5) ? 0 : Sa.c.d(a5));
                                    return androidx.compose.ui.layout.l.O0(lVar, n1.b.l(j), k, null, new a(C0, k, C03, this.b, j, C02, lVar, this.c, this.d, W), 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public static final class l extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ V b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;
        public final /* synthetic */ Qa.p f;
        public final /* synthetic */ Y0 g;
        public final /* synthetic */ float h;
        public final /* synthetic */ c.m i;
        public final /* synthetic */ c.e j;
        public final /* synthetic */ int k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ Qa.p m;
        public final /* synthetic */ Qa.p n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(androidx.compose.ui.e eVar, V v, long j, long j2, long j3, Qa.p pVar, Y0 y0, float f, c.m mVar, c.e eVar2, int i, boolean z, Qa.p pVar2, Qa.p pVar3, int i2, int i3) {
            super(2);
            this.a = eVar;
            this.b = v;
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = pVar;
            this.g = y0;
            this.h = f;
            this.i = mVar;
            this.j = eVar2;
            this.k = i;
            this.l = z;
            this.m = pVar2;
            this.n = pVar3;
            this.o = i2;
            this.p = i3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            d.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, mVar, g1.a(this.o | 1), g1.a(this.p));
        }
    }

    public static final class m extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ p0 a;
        public final /* synthetic */ kotlin.jvm.internal.L b;
        public final /* synthetic */ kotlin.jvm.internal.L c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(p0 p0Var, kotlin.jvm.internal.L l, kotlin.jvm.internal.L l2) {
            super(0);
            this.a = p0Var;
            this.b = l;
            this.c = l2;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            q0 state;
            p0 p0Var = this.a;
            if (kotlin.jvm.internal.t.b((p0Var == null || (state = p0Var.getState()) == null) ? null : Float.valueOf(state.e()), this.b.a - this.c.a)) {
                return;
            }
            p0 p0Var2 = this.a;
            q0 state2 = p0Var2 != null ? p0Var2.getState() : null;
            if (state2 == null) {
                return;
            }
            state2.i(this.b.a - this.c.a);
        }
    }

    public static final class n extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ F.e0 a;
        public final /* synthetic */ float b;
        public final /* synthetic */ n0 c;
        public final /* synthetic */ Qa.p d;
        public final /* synthetic */ Y0 e;
        public final /* synthetic */ float f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ Qa.p h;
        public final /* synthetic */ Qa.p i;
        public final /* synthetic */ float j;
        public final /* synthetic */ p0 k;
        public final /* synthetic */ Qa.p l;
        public final /* synthetic */ Y0 m;
        public final /* synthetic */ float n;
        public final /* synthetic */ kotlin.jvm.internal.M o;
        public final /* synthetic */ boolean p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(F.e0 e0Var, float f, n0 n0Var, Qa.p pVar, Y0 y0, float f2, boolean z, Qa.p pVar2, Qa.p pVar3, float f3, p0 p0Var, Qa.p pVar4, Y0 y02, float f4, kotlin.jvm.internal.M m, boolean z2) {
            super(2);
            this.a = e0Var;
            this.b = f;
            this.c = n0Var;
            this.d = pVar;
            this.e = y0;
            this.f = f2;
            this.g = z;
            this.h = pVar2;
            this.i = pVar3;
            this.j = f3;
            this.k = p0Var;
            this.l = pVar4;
            this.m = y02;
            this.n = f4;
            this.o = m;
            this.p = z2;
        }

        public static /* synthetic */ float a(p0 p0Var) {
            return e(p0Var);
        }

        public static /* synthetic */ float b() {
            return c();
        }

        public static final float c() {
            return 0.0f;
        }

        public static final float e(p0 p0Var) {
            q0 state;
            if (p0Var == null || (state = p0Var.getState()) == null) {
                return 0.0f;
            }
            return state.d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-1350062619, i, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2043)");
            }
            F.e0 e0Var = this.a;
            float f = this.b;
            n0 n0Var = this.c;
            Qa.p pVar = this.d;
            Y0 y0 = this.e;
            float f2 = this.f;
            boolean z = this.g;
            Qa.p pVar2 = this.h;
            Qa.p pVar3 = this.i;
            float f3 = this.j;
            p0 p0Var = this.k;
            Qa.p pVar4 = this.l;
            Y0 y02 = this.m;
            float f4 = this.n;
            kotlin.jvm.internal.M m = this.o;
            boolean z2 = this.p;
            e.a aVar = androidx.compose.ui.e.a;
            F.c cVar = F.c.a;
            M0.B a = F.l.a(cVar.h(), o0.e.a.k(), mVar, 0);
            int a2 = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f5 = androidx.compose.ui.c.f(mVar, aVar);
            g.a aVar2 = O0.g.E8;
            Qa.a a3 = aVar2.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a3);
            } else {
                mVar.s();
            }
            b0.m b = m2.b(mVar);
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            Qa.p b2 = aVar2.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f5, aVar2.f());
            F.o oVar = F.o.a;
            d.i(androidx.compose.foundation.layout.g.k(s0.h.b(F.h0.c(aVar, e0Var)), 0.0f, f, 1, null), new X.f(), n0Var.d(), n0Var.e(), n0Var.c(), pVar, y0, f2, cVar.b(), cVar.g(), 0, z, pVar2, pVar3, mVar, 905969712, 3078);
            androidx.compose.ui.e k = androidx.compose.foundation.layout.g.k(s0.h.b(F.h0.c(aVar, F.g0.e(e0Var, F.j0.a.f()))), 0.0f, n1.h.g(f3 - f), 1, null);
            boolean U = mVar.U(p0Var);
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = new X.g(p0Var);
                mVar.t(C);
            }
            long d = n0Var.d();
            long e = n0Var.e();
            long c = n0Var.c();
            c.m a4 = cVar.a();
            c.e g = cVar.g();
            int i2 = m.a;
            X.o oVar2 = X.o.a;
            d.i(k, (V) C, d, e, c, pVar4, y02, f4, a4, g, i2, z2, oVar2.c(), oVar2.d(), mVar, 905969664, 3456);
            mVar.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class o extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Y0 c;
        public final /* synthetic */ float d;
        public final /* synthetic */ Qa.p e;
        public final /* synthetic */ Y0 f;
        public final /* synthetic */ Qa.p g;
        public final /* synthetic */ Qa.q h;
        public final /* synthetic */ float i;
        public final /* synthetic */ float j;
        public final /* synthetic */ F.e0 k;
        public final /* synthetic */ n0 l;
        public final /* synthetic */ p0 m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(androidx.compose.ui.e eVar, Qa.p pVar, Y0 y0, float f, Qa.p pVar2, Y0 y02, Qa.p pVar3, Qa.q qVar, float f2, float f3, F.e0 e0Var, n0 n0Var, p0 p0Var, int i, int i2, int i3) {
            super(2);
            this.a = eVar;
            this.b = pVar;
            this.c = y0;
            this.d = f;
            this.e = pVar2;
            this.f = y02;
            this.g = pVar3;
            this.h = qVar;
            this.i = f2;
            this.j = f3;
            this.k = e0Var;
            this.l = n0Var;
            this.m = p0Var;
            this.n = i;
            this.o = i2;
            this.p = i3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            d.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, mVar, g1.a(this.n | 1), g1.a(this.o), this.p);
        }
    }

    public static final class p extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Qa.q qVar) {
            super(2);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-89435287, i, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2009)");
            }
            c.e c = F.c.a.c();
            e.c i2 = o0.e.a.i();
            Qa.q qVar = this.a;
            e.a aVar = androidx.compose.ui.e.a;
            M0.B b = F.T.b(c, i2, mVar, 54);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, aVar);
            g.a aVar2 = O0.g.E8;
            Qa.a a2 = aVar2.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            b0.m b2 = m2.b(mVar);
            m2.e(b2, b, aVar2.e());
            m2.e(b2, r, aVar2.g());
            Qa.p b3 = aVar2.b();
            if (b2.f() || !kotlin.jvm.internal.t.c(b2.C(), Integer.valueOf(a))) {
                b2.t(Integer.valueOf(a));
                b2.J(Integer.valueOf(a), b3);
            }
            m2.e(b2, f, aVar2.f());
            qVar.invoke(F.W.a, mVar, 6);
            mVar.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class q extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ p0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(p0 p0Var) {
            super(1);
            this.a = p0Var;
        }

        public final void a(float f) {
            q0 state = this.a.getState();
            state.h(state.d() + f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return Ca.I.a;
        }
    }

    public static final class r extends Ia.l implements Qa.q {
        public int a;
        public /* synthetic */ float b;
        public final /* synthetic */ p0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(p0 p0Var, Ga.e eVar) {
            super(3, eVar);
            this.c = p0Var;
        }

        public final Object a(cb.O o, float f, Ga.e eVar) {
            r rVar = new r(this.c, eVar);
            rVar.b = f;
            return rVar.invokeSuspend(Ca.I.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((cb.O) obj, ((Number) obj2).floatValue(), (Ga.e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                float f2 = this.b;
                q0 state = this.c.getState();
                z.z c = this.c.c();
                z.i d = this.c.d();
                this.a = 1;
                if (d.l(state, f2, c, d, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return Ca.I.a;
        }
    }

    public static final class s extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(float f, float f2, float f3) {
            super(0);
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 invoke() {
            return new q0(this.a, this.b, this.c);
        }
    }

    public static final class t extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public t(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return d.l(null, 0.0f, null, null, this);
        }
    }

    public static final class u extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ kotlin.jvm.internal.L a;
        public final /* synthetic */ q0 b;
        public final /* synthetic */ kotlin.jvm.internal.L c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(kotlin.jvm.internal.L l, q0 q0Var, kotlin.jvm.internal.L l2) {
            super(1);
            this.a = l;
            this.b = q0Var;
            this.c = l2;
        }

        public final void a(z.h hVar) {
            float floatValue = ((Number) hVar.e()).floatValue() - this.a.a;
            float d = this.b.d();
            this.b.h(d + floatValue);
            float abs = Math.abs(d - this.b.d());
            this.a.a = ((Number) hVar.e()).floatValue();
            this.c.a = ((Number) hVar.f()).floatValue();
            if (Math.abs(floatValue - abs) > 0.5f) {
                hVar.a();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z.h) obj);
            return Ca.I.a;
        }
    }

    public static final class v extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ q0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(q0 q0Var) {
            super(1);
            this.a = q0Var;
        }

        public final void a(z.h hVar) {
            this.a.h(((Number) hVar.e()).floatValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z.h) obj);
            return Ca.I.a;
        }
    }

    static {
        float f2 = 16;
        float f3 = 12;
        float g2 = n1.h.g(n1.h.g(f2) - n1.h.g(f3));
        a = g2;
        float g3 = n1.h.g(n1.h.g(f2) - n1.h.g(f3));
        b = g3;
        c = n1.h.g(n1.h.g(f2) - g2);
        d = n1.h.g(n1.h.g(f3) - g3);
        e = new z.x(0.8f, 0.0f, 0.8f, 0.15f);
        f = n1.h.g(24);
        g = n1.h.g(28);
        float g4 = n1.h.g(4);
        h = g4;
        i = n1.h.g(n1.h.g(f2) - g4);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(Qa.p r30, androidx.compose.ui.e r31, Qa.p r32, Qa.q r33, float r34, float r35, F.e0 r36, X.n0 r37, X.p0 r38, b0.m r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.d.a(Qa.p, androidx.compose.ui.e, Qa.p, Qa.q, float, float, F.e0, X.n0, X.p0, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.e r33, Qa.p r34, Z0.Y0 r35, boolean r36, Qa.p r37, Qa.q r38, float r39, F.e0 r40, X.n0 r41, X.p0 r42, b0.m r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.d.b(androidx.compose.ui.e, Qa.p, Z0.Y0, boolean, Qa.p, Qa.q, float, F.e0, X.n0, X.p0, b0.m, int, int):void");
    }

    public static final long c(h2 h2Var) {
        return ((v0.r0) h2Var.getValue()).A();
    }

    public static final float d(h2 h2Var) {
        return ((Number) h2Var.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(Qa.p r24, androidx.compose.ui.e r25, Qa.p r26, Qa.q r27, float r28, F.e0 r29, X.n0 r30, X.p0 r31, b0.m r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.d.e(Qa.p, androidx.compose.ui.e, Qa.p, Qa.q, float, F.e0, X.n0, X.p0, b0.m, int, int):void");
    }

    public static final void f(androidx.compose.ui.e eVar, V v2, long j2, long j3, long j4, Qa.p pVar, Y0 y0, float f2, c.m mVar, c.e eVar2, int i2, boolean z, Qa.p pVar2, Qa.p pVar3, b0.m mVar2, int i3, int i4) {
        int i5;
        int i6;
        b0.m i7 = mVar2.i(-742442296);
        if ((i3 & 6) == 0) {
            i5 = (i7.U(eVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= (i3 & 64) == 0 ? i7.U(v2) : i7.E(v2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= i7.e(j2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= i7.e(j3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= i7.e(j4) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= i7.E(pVar) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= i7.U(y0) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= i7.c(f2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= i7.U(mVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i5 |= i7.U(eVar2) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = (i7.d(i2) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= i7.a(z) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= i7.E(pVar2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= i7.E(pVar3) ? 2048 : 1024;
        }
        if ((306783379 & i5) == 306783378 && (i6 & 1171) == 1170 && i7.j()) {
            i7.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-742442296, i5, i6, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            boolean z2 = ((i5 & 112) == 32 || ((i5 & 64) != 0 && i7.E(v2))) | ((1879048192 & i5) == 536870912) | ((234881024 & i5) == 67108864) | ((i6 & 14) == 4);
            Object C = i7.C();
            if (z2 || C == b0.m.a.a()) {
                C = new k(v2, eVar2, mVar, i2);
                i7.t(C);
            }
            M0.B b2 = (M0.B) C;
            int a2 = b0.h.a(i7, 0);
            b0.I r2 = i7.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i7, eVar);
            g.a aVar = O0.g.E8;
            Qa.a a3 = aVar.a();
            if (i7.k() == null) {
                b0.h.d();
            }
            i7.I();
            if (i7.f()) {
                i7.p(a3);
            } else {
                i7.s();
            }
            b0.m b3 = m2.b(i7);
            m2.e(b3, b2, aVar.e());
            m2.e(b3, r2, aVar.g());
            Qa.p b4 = aVar.b();
            if (b3.f() || !kotlin.jvm.internal.t.c(b3.C(), Integer.valueOf(a2))) {
                b3.t(Integer.valueOf(a2));
                b3.J(Integer.valueOf(a2), b4);
            }
            m2.e(b3, f3, aVar.f());
            e.a aVar2 = androidx.compose.ui.e.a;
            androidx.compose.ui.e b5 = androidx.compose.ui.layout.h.b(aVar2, "navigationIcon");
            float f4 = h;
            androidx.compose.ui.e m2 = androidx.compose.foundation.layout.f.m(b5, f4, 0.0f, 0.0f, 0.0f, 14, null);
            e.a aVar3 = o0.e.a;
            M0.B h2 = F.f.h(aVar3.o(), false);
            int a4 = b0.h.a(i7, 0);
            b0.I r3 = i7.r();
            androidx.compose.ui.e f5 = androidx.compose.ui.c.f(i7, m2);
            Qa.a a5 = aVar.a();
            if (i7.k() == null) {
                b0.h.d();
            }
            i7.I();
            if (i7.f()) {
                i7.p(a5);
            } else {
                i7.s();
            }
            b0.m b6 = m2.b(i7);
            m2.e(b6, h2, aVar.e());
            m2.e(b6, r3, aVar.g());
            Qa.p b7 = aVar.b();
            if (b6.f() || !kotlin.jvm.internal.t.c(b6.C(), Integer.valueOf(a4))) {
                b6.t(Integer.valueOf(a4));
                b6.J(Integer.valueOf(a4), b7);
            }
            m2.e(b6, f5, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            c1 d2 = X.s.a().d(v0.r0.m(j2));
            int i8 = c1.i;
            b0.H.c(d2, pVar2, i7, ((i6 >> 3) & 112) | i8);
            i7.v();
            androidx.compose.ui.e c2 = androidx.compose.ui.graphics.f.c(androidx.compose.foundation.layout.f.k(androidx.compose.ui.layout.h.b(aVar2, "title"), f4, 0.0f, 2, null).then(z ? W0.s.c(aVar2, j.a) : aVar2), 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            M0.B h3 = F.f.h(aVar3.o(), false);
            int a6 = b0.h.a(i7, 0);
            b0.I r4 = i7.r();
            androidx.compose.ui.e f6 = androidx.compose.ui.c.f(i7, c2);
            Qa.a a7 = aVar.a();
            if (i7.k() == null) {
                b0.h.d();
            }
            i7.I();
            if (i7.f()) {
                i7.p(a7);
            } else {
                i7.s();
            }
            b0.m b8 = m2.b(i7);
            m2.e(b8, h3, aVar.e());
            m2.e(b8, r4, aVar.g());
            Qa.p b9 = aVar.b();
            if (b8.f() || !kotlin.jvm.internal.t.c(b8.C(), Integer.valueOf(a6))) {
                b8.t(Integer.valueOf(a6));
                b8.J(Integer.valueOf(a6), b9);
            }
            m2.e(b8, f6, aVar.f());
            int i9 = i5 >> 9;
            Z.f.a(j3, y0, pVar, i7, ((i5 >> 15) & 112) | (i9 & 14) | (i9 & 896));
            i7.v();
            androidx.compose.ui.e m3 = androidx.compose.foundation.layout.f.m(androidx.compose.ui.layout.h.b(aVar2, "actionIcons"), 0.0f, 0.0f, f4, 0.0f, 11, null);
            M0.B h4 = F.f.h(aVar3.o(), false);
            int a8 = b0.h.a(i7, 0);
            b0.I r5 = i7.r();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(i7, m3);
            Qa.a a9 = aVar.a();
            if (i7.k() == null) {
                b0.h.d();
            }
            i7.I();
            if (i7.f()) {
                i7.p(a9);
            } else {
                i7.s();
            }
            b0.m b10 = m2.b(i7);
            m2.e(b10, h4, aVar.e());
            m2.e(b10, r5, aVar.g());
            Qa.p b11 = aVar.b();
            if (b10.f() || !kotlin.jvm.internal.t.c(b10.C(), Integer.valueOf(a8))) {
                b10.t(Integer.valueOf(a8));
                b10.J(Integer.valueOf(a8), b11);
            }
            m2.e(b10, f7, aVar.f());
            b0.H.c(X.s.a().d(v0.r0.m(j4)), pVar3, i7, ((i6 >> 6) & 112) | i8);
            i7.v();
            i7.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l2 = i7.l();
        if (l2 != null) {
            l2.a(new l(eVar, v2, j2, j3, j4, pVar, y0, f2, mVar, eVar2, i2, z, pVar2, pVar3, i3, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113 A[PHI: r9
      0x0113: PHI (r9v39 int) = (r9v8 int), (r9v11 int), (r9v12 int) binds: [B:32:0x0111, B:168:0x0121, B:167:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(androidx.compose.ui.e r41, Qa.p r42, Z0.Y0 r43, float r44, Qa.p r45, Z0.Y0 r46, Qa.p r47, Qa.q r48, float r49, float r50, F.e0 r51, X.n0 r52, X.p0 r53, b0.m r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.d.g(androidx.compose.ui.e, Qa.p, Z0.Y0, float, Qa.p, Z0.Y0, Qa.p, Qa.q, float, float, F.e0, X.n0, X.p0, b0.m, int, int, int):void");
    }

    public static final /* synthetic */ void h(androidx.compose.ui.e eVar, Qa.p pVar, Y0 y0, boolean z, Qa.p pVar2, Qa.q qVar, float f2, F.e0 e0Var, n0 n0Var, p0 p0Var, b0.m mVar, int i2, int i3) {
        b(eVar, pVar, y0, z, pVar2, qVar, f2, e0Var, n0Var, p0Var, mVar, i2, i3);
    }

    public static final /* synthetic */ void i(androidx.compose.ui.e eVar, V v2, long j2, long j3, long j4, Qa.p pVar, Y0 y0, float f2, c.m mVar, c.e eVar2, int i2, boolean z, Qa.p pVar2, Qa.p pVar3, b0.m mVar2, int i3, int i4) {
        f(eVar, v2, j2, j3, j4, pVar, y0, f2, mVar, eVar2, i2, z, pVar2, pVar3, mVar2, i3, i4);
    }

    public static final /* synthetic */ void j(androidx.compose.ui.e eVar, Qa.p pVar, Y0 y0, float f2, Qa.p pVar2, Y0 y02, Qa.p pVar3, Qa.q qVar, float f3, float f4, F.e0 e0Var, n0 n0Var, p0 p0Var, b0.m mVar, int i2, int i3, int i4) {
        g(eVar, pVar, y0, f2, pVar2, y02, pVar3, qVar, f3, f4, e0Var, n0Var, p0Var, mVar, i2, i3, i4);
    }

    public static final /* synthetic */ float k() {
        return i;
    }

    public static final /* synthetic */ Object l(q0 q0Var, float f2, z.z zVar, z.i iVar, Ga.e eVar) {
        return n(q0Var, f2, zVar, iVar, eVar);
    }

    public static final q0 m(float f2, float f3, float f4, b0.m mVar, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = -3.4028235E38f;
        }
        if ((i3 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i3 & 4) != 0) {
            f4 = 0.0f;
        }
        if (b0.w.L()) {
            b0.w.U(1801969826, i2, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
        }
        Object[] objArr = new Object[0];
        k0.v a2 = q0.d.a();
        boolean z = ((((i2 & 14) ^ 6) > 4 && mVar.c(f2)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && mVar.c(f3)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && mVar.c(f4)) || (i2 & 384) == 256);
        Object C = mVar.C();
        if (z || C == b0.m.a.a()) {
            C = new s(f2, f3, f4);
            mVar.t(C);
        }
        q0 q0Var = (q0) k0.d.f(objArr, a2, null, (Qa.a) C, mVar, 0, 4);
        if (b0.w.L()) {
            b0.w.T();
        }
        return q0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(X.q0 r22, float r23, z.z r24, z.i r25, Ga.e r26) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.d.n(X.q0, float, z.z, z.i, Ga.e):java.lang.Object");
    }
}

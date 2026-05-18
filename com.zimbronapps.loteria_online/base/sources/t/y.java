package T;

import b0.U1;
import b0.b0;
import b0.h2;
import b0.m;
import cb.O;
import cb.Q;
import z.h0;
import z.s0;
import z.u0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class y {
    public static final z.n a = new z.n(Float.NaN, Float.NaN);
    public static final s0 b = u0.a(a.a, b.a);
    public static final long c;
    public static final h0 d;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final z.n a(long j) {
            return u0.g.b(j) ? new z.n(u0.f.m(j), u0.f.n(j)) : y.a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((u0.f) obj).u());
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final long a(z.n nVar) {
            return u0.g.a(nVar.f(), nVar.g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return u0.f.d(a((z.n) obj));
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.q {
        public final /* synthetic */ Qa.a a;
        public final /* synthetic */ Qa.l b;

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ h2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h2 h2Var) {
                super(0);
                this.a = h2Var;
            }

            public final long a() {
                return c.a(this.a);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return u0.f.d(a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Qa.a aVar, Qa.l lVar) {
            super(3);
            this.a = aVar;
            this.b = lVar;
        }

        public static final /* synthetic */ long a(h2 h2Var) {
            return c(h2Var);
        }

        public static final long c(h2 h2Var) {
            return ((u0.f) h2Var.getValue()).u();
        }

        public final androidx.compose.ui.e b(androidx.compose.ui.e eVar, b0.m mVar, int i) {
            mVar.V(759876635);
            if (b0.w.L()) {
                b0.w.U(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            h2 b = y.b(this.a, mVar, 0);
            Qa.l lVar = this.b;
            boolean U = mVar.U(b);
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = new a(b);
                mVar.t(C);
            }
            androidx.compose.ui.e eVar2 = (androidx.compose.ui.e) lVar.invoke((Qa.a) C);
            if (b0.w.L()) {
                b0.w.T();
            }
            mVar.P();
            return eVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((androidx.compose.ui.e) obj, (b0.m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class d extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ h2 c;
        public final /* synthetic */ z.a d;

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ h2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h2 h2Var) {
                super(0);
                this.a = h2Var;
            }

            public final long a() {
                return y.c(this.a);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return u0.f.d(a());
            }
        }

        public static final class b implements fb.f {
            public final /* synthetic */ z.a a;
            public final /* synthetic */ O b;

            public static final class a extends Ia.l implements Qa.p {
                public int a;
                public final /* synthetic */ z.a b;
                public final /* synthetic */ long c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(z.a aVar, long j, Ga.e eVar) {
                    super(2, eVar);
                    this.b = aVar;
                    this.c = j;
                }

                public final Ga.e create(Object obj, Ga.e eVar) {
                    return new a(this.b, this.c, eVar);
                }

                public final Object invoke(O o, Ga.e eVar) {
                    return create(o, eVar).invokeSuspend(Ca.I.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f = Ha.c.f();
                    int i = this.a;
                    if (i == 0) {
                        Ca.t.b(obj);
                        z.a aVar = this.b;
                        u0.f d = u0.f.d(this.c);
                        h0 e = y.e();
                        this.a = 1;
                        if (z.a.f(aVar, d, e, null, null, this, 12, null) == f) {
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

            public b(z.a aVar, O o) {
                this.a = aVar;
                this.b = o;
            }

            public final Object a(long j, Ga.e eVar) {
                if (u0.g.b(((u0.f) this.a.m()).u()) && u0.g.b(j) && u0.f.n(((u0.f) this.a.m()).u()) != u0.f.n(j)) {
                    cb.i.d(this.b, (Ga.i) null, (Q) null, new a(this.a, j, null), 3, (Object) null);
                    return Ca.I.a;
                }
                Object s = this.a.s(u0.f.d(j), eVar);
                return s == Ha.c.f() ? s : Ca.I.a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, Ga.e eVar) {
                return a(((u0.f) obj).u(), eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h2 h2Var, z.a aVar, Ga.e eVar) {
            super(2, eVar);
            this.c = h2Var;
            this.d = aVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            d dVar = new d(this.c, this.d, eVar);
            dVar.b = obj;
            return dVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                O o = (O) this.b;
                fb.e p = U1.p(new a(this.c));
                b bVar = new b(this.d, o);
                this.a = 1;
                if (p.collect(bVar, this) == f) {
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

    static {
        long a2 = u0.g.a(0.01f, 0.01f);
        c = a2;
        d = new h0(0.0f, 0.0f, u0.f.d(a2), 3, null);
    }

    public static final /* synthetic */ z.n a() {
        return a;
    }

    public static final /* synthetic */ h2 b(Qa.a aVar, b0.m mVar, int i) {
        return f(aVar, mVar, i);
    }

    public static final /* synthetic */ long c(h2 h2Var) {
        return g(h2Var);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, Qa.a aVar, Qa.l lVar) {
        return androidx.compose.ui.c.c(eVar, null, new c(aVar, lVar), 1, null);
    }

    public static final h0 e() {
        return d;
    }

    public static final h2 f(Qa.a aVar, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-1589795249, i, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        Object C = mVar.C();
        m.a aVar2 = b0.m.a;
        if (C == aVar2.a()) {
            C = U1.c(aVar);
            mVar.t(C);
        }
        h2 h2Var = (h2) C;
        Object C2 = mVar.C();
        if (C2 == aVar2.a()) {
            C2 = new z.a(u0.f.d(g(h2Var)), b, u0.f.d(c), null, 8, null);
            mVar.t(C2);
        }
        z.a aVar3 = (z.a) C2;
        Ca.I i2 = Ca.I.a;
        boolean E = mVar.E(aVar3);
        Object C3 = mVar.C();
        if (E || C3 == aVar2.a()) {
            C3 = new d(h2Var, aVar3, null);
            mVar.t(C3);
        }
        b0.d(i2, (Qa.p) C3, mVar, 6);
        h2 g = aVar3.g();
        if (b0.w.L()) {
            b0.w.T();
        }
        return g;
    }

    public static final long g(h2 h2Var) {
        return ((u0.f) h2Var.getValue()).u();
    }
}

package N;

import O0.g;
import P0.p0;
import P0.u1;
import Q.q0;
import Z0.T0;
import Z0.W0;
import Z0.X0;
import Z0.Y0;
import android.view.KeyEvent;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import b0.B1;
import b0.U1;
import b0.g1;
import b0.h2;
import b0.m2;
import f1.z;
import java.util.List;
import l0.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T0) obj);
            return Ca.I.a;
        }

        public final void invoke(T0 t0) {
        }
    }

    public static final class b extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ y b;
        public final /* synthetic */ h2 c;
        public final /* synthetic */ f1.W d;
        public final /* synthetic */ T.F e;
        public final /* synthetic */ f1.t f;

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ h2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h2 h2Var) {
                super(0);
                this.a = h2Var;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(i.f(this.a));
            }
        }

        public static final class b implements fb.f {
            public final /* synthetic */ y a;
            public final /* synthetic */ f1.W b;
            public final /* synthetic */ T.F c;
            public final /* synthetic */ f1.t d;

            public b(y yVar, f1.W w, T.F f, f1.t tVar) {
                this.a = yVar;
                this.b = w;
                this.c = f;
                this.d = tVar;
            }

            public final Object a(boolean z, Ga.e eVar) {
                if (z && this.a.e()) {
                    i.k(this.b, this.a, this.c.O(), this.d, this.c.J());
                } else {
                    i.i(this.a);
                }
                return Ca.I.a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, Ga.e eVar) {
                return a(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar, h2 h2Var, f1.W w, T.F f, f1.t tVar, Ga.e eVar) {
            super(2, eVar);
            this.b = yVar;
            this.c = h2Var;
            this.d = w;
            this.e = f;
            this.f = tVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new b(this.b, this.c, this.d, this.e, this.f, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            try {
                if (i == 0) {
                    Ca.t.b(obj);
                    fb.e p = U1.p(new a(this.c));
                    b bVar = new b(this.b, this.d, this.e, this.f);
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
                i.i(this.b);
                return Ca.I.a;
            } catch (Throwable th) {
                i.i(this.b);
                throw th;
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ T.F a;

        public static final class a implements b0.X {
            public final /* synthetic */ T.F a;

            public a(T.F f) {
                this.a = f;
            }

            public void dispose() {
                this.a.R();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(T.F f) {
            super(1);
            this.a = f;
        }

        public final b0.X invoke(b0.Y y) {
            return new a(this.a);
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ y a;
        public final /* synthetic */ f1.W b;
        public final /* synthetic */ f1.U c;
        public final /* synthetic */ f1.t d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(y yVar, f1.W w, f1.U u, f1.t tVar) {
            super(1);
            this.a = yVar;
            this.b = w;
            this.c = u;
            this.d = tVar;
        }

        public final b0.X invoke(b0.Y y) {
            if (this.a.e()) {
                y yVar = this.a;
                yVar.E(L.a.i(this.b, this.c, yVar.n(), this.d, this.a.m(), this.a.l()));
            }
            return new a();
        }

        public static final class a implements b0.X {
            public void dispose() {
            }
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.q a;
        public final /* synthetic */ y b;
        public final /* synthetic */ Y0 c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ V f;
        public final /* synthetic */ f1.U g;
        public final /* synthetic */ f1.f0 h;
        public final /* synthetic */ androidx.compose.ui.e i;
        public final /* synthetic */ androidx.compose.ui.e j;
        public final /* synthetic */ androidx.compose.ui.e k;
        public final /* synthetic */ androidx.compose.ui.e l;
        public final /* synthetic */ K.b m;
        public final /* synthetic */ T.F n;
        public final /* synthetic */ boolean o;
        public final /* synthetic */ boolean p;
        public final /* synthetic */ Qa.l q;
        public final /* synthetic */ f1.J r;
        public final /* synthetic */ n1.d s;

        public static final class a extends kotlin.jvm.internal.u implements Qa.p {
            public final /* synthetic */ y a;
            public final /* synthetic */ Y0 b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;
            public final /* synthetic */ V e;
            public final /* synthetic */ f1.U f;
            public final /* synthetic */ f1.f0 g;
            public final /* synthetic */ androidx.compose.ui.e h;
            public final /* synthetic */ androidx.compose.ui.e i;
            public final /* synthetic */ androidx.compose.ui.e j;
            public final /* synthetic */ androidx.compose.ui.e k;
            public final /* synthetic */ K.b l;
            public final /* synthetic */ T.F m;
            public final /* synthetic */ boolean n;
            public final /* synthetic */ boolean o;
            public final /* synthetic */ Qa.l p;
            public final /* synthetic */ f1.J q;
            public final /* synthetic */ n1.d r;

            public static final class a extends kotlin.jvm.internal.u implements Qa.p {
                public final /* synthetic */ T.F a;
                public final /* synthetic */ y b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Qa.l e;
                public final /* synthetic */ f1.U f;
                public final /* synthetic */ f1.J g;
                public final /* synthetic */ n1.d h;
                public final /* synthetic */ int i;

                public static final class a implements M0.B {
                    public final /* synthetic */ y a;
                    public final /* synthetic */ Qa.l b;
                    public final /* synthetic */ f1.U c;
                    public final /* synthetic */ f1.J d;
                    public final /* synthetic */ n1.d e;
                    public final /* synthetic */ int f;

                    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
                        public static final a a = new a();

                        public a() {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((q.a) obj);
                            return Ca.I.a;
                        }

                        public final void invoke(q.a aVar) {
                        }
                    }

                    public a(y yVar, Qa.l lVar, f1.U u, f1.J j, n1.d dVar, int i) {
                        this.a = yVar;
                        this.b = lVar;
                        this.c = u;
                        this.d = j;
                        this.e = dVar;
                        this.f = i;
                    }

                    public int maxIntrinsicWidth(M0.m mVar, List list, int i) {
                        this.a.v().m(mVar.getLayoutDirection());
                        return this.a.v().c();
                    }

                    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
                        l.a aVar = l0.l.e;
                        y yVar = this.a;
                        l0.l d = aVar.d();
                        Qa.l g = d != null ? d.g() : null;
                        l0.l e = aVar.e(d);
                        try {
                            Z j2 = yVar.j();
                            T0 f = j2 != null ? j2.f() : null;
                            Ca.w d2 = L.a.d(this.a.v(), j, lVar.getLayoutDirection(), f);
                            int intValue = ((Number) d2.a()).intValue();
                            int intValue2 = ((Number) d2.b()).intValue();
                            T0 t0 = (T0) d2.c();
                            if (!kotlin.jvm.internal.t.c(f, t0)) {
                                this.a.G(new Z(t0, null, j2 != null ? j2.b() : null, 2, null));
                                this.b.invoke(t0);
                                i.j(this.a, this.c, this.d);
                            }
                            this.a.H(this.e.A(this.f == 1 ? I.a(t0.m(0)) : 0));
                            return lVar.f0(intValue, intValue2, Da.S.l(new Ca.q[]{Ca.x.a(M0.b.a(), Integer.valueOf(Math.round(t0.h()))), Ca.x.a(M0.b.b(), Integer.valueOf(Math.round(t0.k())))}), a.a);
                        } finally {
                            aVar.l(d, e, g);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(T.F f, y yVar, boolean z, boolean z2, Qa.l lVar, f1.U u, f1.J j, n1.d dVar, int i) {
                    super(2);
                    this.a = f;
                    this.b = yVar;
                    this.c = z;
                    this.d = z2;
                    this.e = lVar;
                    this.f = u;
                    this.g = j;
                    this.h = dVar;
                    this.i = i;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((b0.m) obj, ((Number) obj2).intValue());
                    return Ca.I.a;
                }

                /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke(b0.m r11, int r12) {
                    /*
                        r10 = this;
                        r0 = r12 & 3
                        r1 = 2
                        if (r0 != r1) goto L11
                        boolean r0 = r11.j()
                        if (r0 != 0) goto Lc
                        goto L11
                    Lc:
                        r11.M()
                        goto L102
                    L11:
                        boolean r0 = b0.w.L()
                        if (r0 == 0) goto L20
                        r0 = -1
                        java.lang.String r1 = "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)"
                        r2 = -363167407(0xffffffffea5a8151, float:-6.6039127E25)
                        b0.w.U(r2, r12, r0, r1)
                    L20:
                        N.i$e$a$a$a r12 = new N.i$e$a$a$a
                        N.y r4 = r10.b
                        Qa.l r5 = r10.e
                        f1.U r6 = r10.f
                        f1.J r7 = r10.g
                        n1.d r8 = r10.h
                        int r9 = r10.i
                        r3 = r12
                        r3.<init>(r4, r5, r6, r7, r8, r9)
                        androidx.compose.ui.e$a r0 = androidx.compose.ui.e.a
                        r1 = 0
                        int r2 = b0.h.a(r11, r1)
                        b0.I r3 = r11.r()
                        androidx.compose.ui.e r0 = androidx.compose.ui.c.f(r11, r0)
                        O0.g$a r4 = O0.g.E8
                        Qa.a r5 = r4.a()
                        b0.d r6 = r11.k()
                        if (r6 != 0) goto L50
                        b0.h.d()
                    L50:
                        r11.I()
                        boolean r6 = r11.f()
                        if (r6 == 0) goto L5d
                        r11.p(r5)
                        goto L60
                    L5d:
                        r11.s()
                    L60:
                        b0.m r5 = b0.m2.b(r11)
                        Qa.p r6 = r4.e()
                        b0.m2.e(r5, r12, r6)
                        Qa.p r12 = r4.g()
                        b0.m2.e(r5, r3, r12)
                        Qa.p r12 = r4.b()
                        boolean r3 = r5.f()
                        if (r3 != 0) goto L8a
                        java.lang.Object r3 = r5.C()
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                        boolean r3 = kotlin.jvm.internal.t.c(r3, r6)
                        if (r3 != 0) goto L98
                    L8a:
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                        r5.t(r3)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        r5.J(r2, r12)
                    L98:
                        Qa.p r12 = r4.f()
                        b0.m2.e(r5, r0, r12)
                        r11.v()
                        T.F r12 = r10.a
                        N.y r0 = r10.b
                        N.m r0 = r0.d()
                        N.m r2 = N.m.a
                        if (r0 == r2) goto Lcb
                        N.y r0 = r10.b
                        M0.p r0 = r0.i()
                        if (r0 == 0) goto Lcb
                        N.y r0 = r10.b
                        M0.p r0 = r0.i()
                        kotlin.jvm.internal.t.d(r0)
                        boolean r0 = r0.g()
                        if (r0 == 0) goto Lcb
                        boolean r0 = r10.c
                        if (r0 == 0) goto Lcb
                        r0 = 1
                        goto Lcc
                    Lcb:
                        r0 = r1
                    Lcc:
                        N.i.h(r12, r0, r11, r1)
                        N.y r12 = r10.b
                        N.m r12 = r12.d()
                        N.m r0 = N.m.c
                        if (r12 != r0) goto Lf0
                        boolean r12 = r10.d
                        if (r12 != 0) goto Lf0
                        boolean r12 = r10.c
                        if (r12 == 0) goto Lf0
                        r12 = -2032274(0xffffffffffe0fd6e, float:NaN)
                        r11.V(r12)
                        T.F r12 = r10.a
                        N.i.e(r12, r11, r1)
                        r11.P()
                        goto Lf9
                    Lf0:
                        r12 = -1955394(0xffffffffffe229be, float:NaN)
                        r11.V(r12)
                        r11.P()
                    Lf9:
                        boolean r11 = b0.w.L()
                        if (r11 == 0) goto L102
                        b0.w.T()
                    L102:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: N.i.e.a.a.invoke(b0.m, int):void");
                }
            }

            public static final class b extends kotlin.jvm.internal.u implements Qa.a {
                public final /* synthetic */ y a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(y yVar) {
                    super(0);
                    this.a = yVar;
                }

                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Z invoke() {
                    return this.a.j();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y yVar, Y0 y0, int i, int i2, V v, f1.U u, f1.f0 f0Var, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, androidx.compose.ui.e eVar3, androidx.compose.ui.e eVar4, K.b bVar, T.F f, boolean z, boolean z2, Qa.l lVar, f1.J j, n1.d dVar) {
                super(2);
                this.a = yVar;
                this.b = y0;
                this.c = i;
                this.d = i2;
                this.e = v;
                this.f = u;
                this.g = f0Var;
                this.h = eVar;
                this.i = eVar2;
                this.j = eVar3;
                this.k = eVar4;
                this.l = bVar;
                this.m = f;
                this.n = z;
                this.o = z2;
                this.p = lVar;
                this.q = j;
                this.r = dVar;
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
                    b0.w.U(2032502107, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                }
                androidx.compose.ui.e a2 = N.n.a(androidx.compose.foundation.layout.g.k(androidx.compose.ui.e.a, this.a.k(), 0.0f, 2, null), this.b, this.c, this.d);
                V v = this.e;
                f1.U u = this.f;
                f1.f0 f0Var = this.g;
                boolean E = mVar.E(this.a);
                y yVar = this.a;
                Object C = mVar.C();
                if (E || C == b0.m.a.a()) {
                    C = new b(yVar);
                    mVar.t(C);
                }
                T.C.a(K.d.b(X.a(U.c(a2, v, u, f0Var, (Qa.a) C).then(this.h).then(this.i), this.b).then(this.j).then(this.k), this.l), j0.i.d(-363167407, true, new a(this.m, this.a, this.n, this.o, this.p, this.f, this.q, this.r, this.d), mVar, 54), mVar, 48, 0);
                if (b0.w.L()) {
                    b0.w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Qa.q qVar, y yVar, Y0 y0, int i, int i2, V v, f1.U u, f1.f0 f0Var, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, androidx.compose.ui.e eVar3, androidx.compose.ui.e eVar4, K.b bVar, T.F f, boolean z, boolean z2, Qa.l lVar, f1.J j, n1.d dVar) {
            super(2);
            this.a = qVar;
            this.b = yVar;
            this.c = y0;
            this.d = i;
            this.e = i2;
            this.f = v;
            this.g = u;
            this.h = f0Var;
            this.i = eVar;
            this.j = eVar2;
            this.k = eVar3;
            this.l = eVar4;
            this.m = bVar;
            this.n = f;
            this.o = z;
            this.p = z2;
            this.q = lVar;
            this.r = j;
            this.s = dVar;
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
                b0.w.U(-374338080, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
            }
            this.a.invoke(j0.i.d(2032502107, true, new a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s), mVar, 54), mVar, 6);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ f1.U a;
        public final /* synthetic */ Qa.l b;
        public final /* synthetic */ androidx.compose.ui.e c;
        public final /* synthetic */ Y0 d;
        public final /* synthetic */ f1.f0 e;
        public final /* synthetic */ Qa.l f;
        public final /* synthetic */ E.m g;
        public final /* synthetic */ v0.h0 h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;
        public final /* synthetic */ f1.t l;
        public final /* synthetic */ w m;
        public final /* synthetic */ boolean n;
        public final /* synthetic */ boolean o;
        public final /* synthetic */ Qa.q p;
        public final /* synthetic */ int q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f1.U u, Qa.l lVar, androidx.compose.ui.e eVar, Y0 y0, f1.f0 f0Var, Qa.l lVar2, E.m mVar, v0.h0 h0Var, boolean z, int i, int i2, f1.t tVar, w wVar, boolean z2, boolean z3, Qa.q qVar, int i3, int i4, int i5) {
            super(2);
            this.a = u;
            this.b = lVar;
            this.c = eVar;
            this.d = y0;
            this.e = f0Var;
            this.f = lVar2;
            this.g = mVar;
            this.h = h0Var;
            this.i = z;
            this.j = i;
            this.k = i2;
            this.l = tVar;
            this.m = wVar;
            this.n = z2;
            this.o = z3;
            this.p = qVar;
            this.q = i3;
            this.r = i4;
            this.s = i5;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            i.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, mVar, g1.a(this.q | 1), g1.a(this.r), this.s);
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ y a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(y yVar) {
            super(1);
            this.a = yVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((M0.p) obj);
            return Ca.I.a;
        }

        public final void invoke(M0.p pVar) {
            Z j = this.a.j();
            if (j == null) {
                return;
            }
            j.h(pVar);
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ y a;
        public final /* synthetic */ f1.U b;
        public final /* synthetic */ f1.J c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(y yVar, f1.U u, f1.J j) {
            super(1);
            this.a = yVar;
            this.b = u;
            this.c = j;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.f) obj);
            return Ca.I.a;
        }

        public final void invoke(x0.f fVar) {
            Z j = this.a.j();
            if (j != null) {
                f1.U u = this.b;
                y yVar = this.a;
                f1.J j2 = this.c;
                L.a.b(fVar.m1().f(), u, yVar.q(), yVar.c(), j2, j.f(), yVar.f(), yVar.p());
            }
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ y a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ f1.W d;
        public final /* synthetic */ f1.U e;
        public final /* synthetic */ f1.t f;
        public final /* synthetic */ f1.J g;
        public final /* synthetic */ T.F h;
        public final /* synthetic */ cb.O i;
        public final /* synthetic */ K.b j;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ K.b b;
            public final /* synthetic */ f1.U c;
            public final /* synthetic */ y d;
            public final /* synthetic */ Z e;
            public final /* synthetic */ f1.J f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(K.b bVar, f1.U u, y yVar, Z z, f1.J j, Ga.e eVar) {
                super(2, eVar);
                this.b = bVar;
                this.c = u;
                this.d = yVar;
                this.e = z;
                this.f = j;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, this.c, this.d, this.e, this.f, eVar);
            }

            public final Object invoke(cb.O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    K.b bVar = this.b;
                    f1.U u = this.c;
                    H v = this.d.v();
                    T0 f2 = this.e.f();
                    f1.J j = this.f;
                    this.a = 1;
                    if (i.m(bVar, u, v, f2, j, this) == f) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(y yVar, boolean z, boolean z2, f1.W w, f1.U u, f1.t tVar, f1.J j, T.F f, cb.O o, K.b bVar) {
            super(1);
            this.a = yVar;
            this.b = z;
            this.c = z2;
            this.d = w;
            this.e = u;
            this.f = tVar;
            this.g = j;
            this.h = f;
            this.i = o;
            this.j = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((t0.p) obj);
            return Ca.I.a;
        }

        public final void invoke(t0.p pVar) {
            Z j;
            if (this.a.e() == pVar.a()) {
                return;
            }
            this.a.C(pVar.a());
            if (this.a.e() && this.b && !this.c) {
                i.k(this.d, this.a, this.e, this.f, this.g);
            } else {
                i.i(this.a);
            }
            if (pVar.a() && (j = this.a.j()) != null) {
                cb.i.d(this.i, (Ga.i) null, (cb.Q) null, new a(this.j, this.e, this.a, j, this.g, null), 3, (Object) null);
            }
            if (pVar.a()) {
                return;
            }
            T.F.u(this.h, null, 1, null);
        }
    }

    public static final class j extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ y a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ u1 c;
        public final /* synthetic */ T.F d;
        public final /* synthetic */ f1.U e;
        public final /* synthetic */ f1.J f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(y yVar, boolean z, u1 u1Var, T.F f, f1.U u, f1.J j) {
            super(1);
            this.a = yVar;
            this.b = z;
            this.c = u1Var;
            this.d = f;
            this.e = u;
            this.f = j;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((M0.p) obj);
            return Ca.I.a;
        }

        public final void invoke(M0.p pVar) {
            this.a.F(pVar);
            Z j = this.a.j();
            if (j != null) {
                j.i(pVar);
            }
            if (this.b) {
                if (this.a.d() == N.m.b) {
                    if (this.a.s() && this.c.a()) {
                        this.d.l0();
                    } else {
                        this.d.R();
                    }
                    this.a.M(T.G.c(this.d, true));
                    this.a.L(T.G.c(this.d, false));
                    this.a.J(W0.h(this.e.k()));
                } else if (this.a.d() == N.m.c) {
                    this.a.J(T.G.c(this.d, true));
                }
                i.j(this.a, this.e, this.f);
                Z j2 = this.a.j();
                if (j2 != null) {
                    y yVar = this.a;
                    f1.U u = this.e;
                    f1.J j3 = this.f;
                    f1.c0 g = yVar.g();
                    if (g == null || !yVar.e()) {
                        return;
                    }
                    L.a.k(g, u, j3, j2);
                }
            }
        }
    }

    public static final class k extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ y a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(y yVar) {
            super(1);
            this.a = yVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Ca.I.a;
        }

        public final void invoke(boolean z) {
            this.a.D(z);
        }
    }

    public static final class l extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ y a;
        public final /* synthetic */ androidx.compose.ui.focus.j b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ T.F e;
        public final /* synthetic */ f1.J f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(y yVar, androidx.compose.ui.focus.j jVar, boolean z, boolean z2, T.F f, f1.J j) {
            super(1);
            this.a = yVar;
            this.b = jVar;
            this.c = z;
            this.d = z2;
            this.e = f;
            this.f = j;
        }

        public final void a(long j) {
            i.l(this.a, this.b, !this.c);
            if (this.a.e() && this.d) {
                if (this.a.d() == N.m.b) {
                    this.e.t(u0.f.d(j));
                    return;
                }
                Z j2 = this.a.j();
                if (j2 != null) {
                    y yVar = this.a;
                    L.a.j(j, j2, yVar.n(), this.f, yVar.m());
                    if (yVar.v().k().length() > 0) {
                        yVar.B(N.m.c);
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((u0.f) obj).u());
            return Ca.I.a;
        }
    }

    public static final class m extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ C.q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C.q qVar) {
            super(0);
            this.a = qVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V invoke() {
            return new V(this.a, 0.0f, 2, null);
        }
    }

    public static final class n extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ f1.d0 a;
        public final /* synthetic */ f1.U b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ f1.t f;
        public final /* synthetic */ y g;
        public final /* synthetic */ f1.J h;
        public final /* synthetic */ T.F i;
        public final /* synthetic */ androidx.compose.ui.focus.j j;

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ T.F a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(T.F f) {
                super(0);
                this.a = f;
            }

            public final Boolean invoke() {
                this.a.T();
                return Boolean.TRUE;
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ y a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(y yVar) {
                super(1);
                this.a = yVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                boolean z;
                if (this.a.j() != null) {
                    Z j = this.a.j();
                    kotlin.jvm.internal.t.d(j);
                    list.add(j.f());
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public static final class c extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ y a;
            public final /* synthetic */ W0.D b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(y yVar, W0.D d) {
                super(1);
                this.a = yVar;
                this.b = d;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Z0.e eVar) {
                Ca.I i;
                f1.c0 g = this.a.g();
                if (g != null) {
                    y yVar = this.a;
                    L.a.g(Da.v.q(new f1.i[]{new f1.f(), new f1.a(eVar, 1)}), yVar.n(), yVar.m(), g);
                    i = Ca.I.a;
                } else {
                    i = null;
                }
                if (i == null) {
                    this.a.m().invoke(new f1.U(eVar.j(), X0.a(eVar.j().length()), (W0) null, 4, (kotlin.jvm.internal.k) null));
                }
                return Boolean.TRUE;
            }
        }

        public static final class d extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ y c;
            public final /* synthetic */ W0.D d;
            public final /* synthetic */ f1.U e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(boolean z, boolean z2, y yVar, W0.D d, f1.U u) {
                super(1);
                this.a = z;
                this.b = z2;
                this.c = yVar;
                this.d = d;
                this.e = u;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Z0.e eVar) {
                Ca.I i;
                if (this.a || !this.b) {
                    return Boolean.FALSE;
                }
                f1.c0 g = this.c.g();
                if (g != null) {
                    y yVar = this.c;
                    L.a.g(Da.v.q(new f1.i[]{new f1.o(), new f1.a(eVar, 1)}), yVar.n(), yVar.m(), g);
                    i = Ca.I.a;
                } else {
                    i = null;
                }
                if (i == null) {
                    f1.U u = this.e;
                    this.c.m().invoke(new f1.U(Za.E.F0(u.l(), W0.n(u.k()), W0.i(u.k()), eVar).toString(), X0.a(W0.n(u.k()) + eVar.length()), (W0) null, 4, (kotlin.jvm.internal.k) null));
                }
                return Boolean.TRUE;
            }
        }

        public static final class e extends kotlin.jvm.internal.u implements Qa.q {
            public final /* synthetic */ f1.J a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ f1.U c;
            public final /* synthetic */ T.F d;
            public final /* synthetic */ y e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(f1.J j, boolean z, f1.U u, T.F f, y yVar) {
                super(3);
                this.a = j;
                this.b = z;
                this.c = u;
                this.d = f;
                this.e = yVar;
            }

            public final Boolean a(int i, int i2, boolean z) {
                if (!z) {
                    i = this.a.a(i);
                }
                if (!z) {
                    i2 = this.a.a(i2);
                }
                boolean z2 = false;
                if (this.b && (i != W0.n(this.c.k()) || i2 != W0.i(this.c.k()))) {
                    if (Math.min(i, i2) < 0 || Math.max(i, i2) > this.c.i().length()) {
                        this.d.x();
                    } else {
                        if (z || i == i2) {
                            this.d.x();
                        } else {
                            T.F.w(this.d, false, 1, null);
                        }
                        this.e.m().invoke(new f1.U(this.c.i(), X0.b(i, i2), (W0) null, 4, (kotlin.jvm.internal.k) null));
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        }

        public static final class f extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ y a;
            public final /* synthetic */ f1.t b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(y yVar, f1.t tVar) {
                super(0);
                this.a = yVar;
                this.b = tVar;
            }

            public final Boolean invoke() {
                this.a.l().invoke(f1.s.j(this.b.e()));
                return Boolean.TRUE;
            }
        }

        public static final class g extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ y a;
            public final /* synthetic */ androidx.compose.ui.focus.j b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(y yVar, androidx.compose.ui.focus.j jVar, boolean z) {
                super(0);
                this.a = yVar;
                this.b = jVar;
                this.c = z;
            }

            public final Boolean invoke() {
                i.l(this.a, this.b, !this.c);
                return Boolean.TRUE;
            }
        }

        public static final class h extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ T.F a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(T.F f) {
                super(0);
                this.a = f;
            }

            public final Boolean invoke() {
                T.F.w(this.a, false, 1, null);
                return Boolean.TRUE;
            }
        }

        public static final class i extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ T.F a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(T.F f) {
                super(0);
                this.a = f;
            }

            public final Boolean invoke() {
                T.F.p(this.a, false, 1, null);
                return Boolean.TRUE;
            }
        }

        public static final class j extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ T.F a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(T.F f) {
                super(0);
                this.a = f;
            }

            public final Boolean invoke() {
                this.a.s();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(f1.d0 d0Var, f1.U u, boolean z, boolean z2, boolean z3, f1.t tVar, y yVar, f1.J j2, T.F f2, androidx.compose.ui.focus.j jVar) {
            super(1);
            this.a = d0Var;
            this.b = u;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = tVar;
            this.g = yVar;
            this.h = j2;
            this.i = f2;
            this.j = jVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((W0.D) obj);
            return Ca.I.a;
        }

        public final void invoke(W0.D d2) {
            W0.B.W(d2, this.a.b());
            W0.B.l0(d2, this.b.k());
            if (!this.c) {
                W0.B.h(d2);
            }
            if (this.d) {
                W0.B.G(d2);
            }
            boolean z = this.c && !this.e;
            W0.B.V(d2, z);
            W0.B.o(d2, null, new b(this.g), 1, null);
            if (z) {
                W0.B.k0(d2, null, new c(this.g, d2), 1, null);
                W0.B.r(d2, null, new d(this.e, this.c, this.g, d2, this.b), 1, null);
            }
            W0.B.f0(d2, null, new e(this.h, this.c, this.b, this.i, this.g), 1, null);
            W0.B.v(d2, this.f.e(), null, new f(this.g, this.f), 2, null);
            W0.B.t(d2, null, new g(this.g, this.j, this.e), 1, null);
            W0.B.x(d2, null, new h(this.i), 1, null);
            if (!W0.h(this.b.k()) && !this.d) {
                W0.B.d(d2, null, new i(this.i), 1, null);
                if (this.c && !this.e) {
                    W0.B.f(d2, null, new j(this.i), 1, null);
                }
            }
            if (!this.c || this.e) {
                return;
            }
            W0.B.I(d2, null, new a(this.i), 1, null);
        }
    }

    public static final class o extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ y a;
        public final /* synthetic */ androidx.compose.ui.focus.j b;
        public final /* synthetic */ f1.t c;
        public final /* synthetic */ q0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(y yVar, androidx.compose.ui.focus.j jVar, f1.t tVar, q0 q0Var) {
            super(0);
            this.a = yVar;
            this.b = jVar;
            this.c = tVar;
            this.d = q0Var;
        }

        public final Boolean invoke() {
            if (!this.a.e()) {
                this.b.f();
            }
            int f = this.c.f();
            z.a aVar = f1.z.b;
            if (!f1.z.n(f, aVar.f()) && !f1.z.n(this.c.f(), aVar.e())) {
                this.d.k();
            }
            return Boolean.TRUE;
        }
    }

    public static final class p extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ T.F b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(androidx.compose.ui.e eVar, T.F f, Qa.p pVar, int i) {
            super(2);
            this.a = eVar;
            this.b = f;
            this.c = pVar;
            this.d = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            i.g(this.a, this.b, this.c, mVar, g1.a(this.d | 1));
        }
    }

    public static final class q extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ T.F a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(T.F f, boolean z, int i) {
            super(2);
            this.a = f;
            this.b = z;
            this.c = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            i.h(this.a, this.b, mVar, g1.a(this.c | 1));
        }
    }

    public static final class r implements T.i {
        public final /* synthetic */ long a;

        public r(long j) {
            this.a = j;
        }

        public final long a() {
            return this.a;
        }
    }

    public static final class s extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ J c;
        public final /* synthetic */ T.F d;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ I0.L c;
            public final /* synthetic */ J d;
            public final /* synthetic */ T.F e;

            public static final class a extends Ia.l implements Qa.p {
                public int a;
                public final /* synthetic */ I0.L b;
                public final /* synthetic */ J c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(I0.L l, J j, Ga.e eVar) {
                    super(2, eVar);
                    this.b = l;
                    this.c = j;
                }

                public final Ga.e create(Object obj, Ga.e eVar) {
                    return new a(this.b, this.c, eVar);
                }

                public final Object invoke(cb.O o, Ga.e eVar) {
                    return create(o, eVar).invokeSuspend(Ca.I.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f = Ha.c.f();
                    int i = this.a;
                    if (i == 0) {
                        Ca.t.b(obj);
                        I0.L l = this.b;
                        J j = this.c;
                        this.a = 1;
                        if (A.c(l, j, this) == f) {
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

            public static final class b extends Ia.l implements Qa.p {
                public int a;
                public final /* synthetic */ I0.L b;
                public final /* synthetic */ T.F c;

                public static final class a extends kotlin.jvm.internal.u implements Qa.l {
                    public final /* synthetic */ T.F a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(T.F f) {
                        super(1);
                        this.a = f;
                    }

                    public final void a(long j) {
                        this.a.l0();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((u0.f) obj).u());
                        return Ca.I.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(I0.L l, T.F f, Ga.e eVar) {
                    super(2, eVar);
                    this.b = l;
                    this.c = f;
                }

                public final Ga.e create(Object obj, Ga.e eVar) {
                    return new b(this.b, this.c, eVar);
                }

                public final Object invoke(cb.O o, Ga.e eVar) {
                    return create(o, eVar).invokeSuspend(Ca.I.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f = Ha.c.f();
                    int i = this.a;
                    if (i == 0) {
                        Ca.t.b(obj);
                        I0.L l = this.b;
                        a aVar = new a(this.c);
                        this.a = 1;
                        if (C.B.j(l, null, null, null, aVar, this, 7, null) == f) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(I0.L l, J j, T.F f, Ga.e eVar) {
                super(2, eVar);
                this.c = l;
                this.d = j;
                this.e = f;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, this.d, this.e, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invoke(cb.O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Ha.c.f();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
                cb.O o = (cb.O) this.b;
                cb.Q q = cb.Q.d;
                cb.i.d(o, (Ga.i) null, q, new a(this.c, this.d, null), 1, (Object) null);
                cb.i.d(o, (Ga.i) null, q, new b(this.c, this.e, null), 1, (Object) null);
                return Ca.I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(J j, T.F f, Ga.e eVar) {
            super(2, eVar);
            this.c = j;
            this.d = f;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            s sVar = new s(this.c, this.d, eVar);
            sVar.b = obj;
            return sVar;
        }

        public final Object invoke(I0.L l, Ga.e eVar) {
            return create(l, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                a aVar = new a((I0.L) this.b, this.c, this.d, null);
                this.a = 1;
                if (cb.P.e(aVar, this) == f) {
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

    public static final class t extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(long j) {
            super(1);
            this.a = j;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((W0.D) obj);
            return Ca.I.a;
        }

        public final void invoke(W0.D d) {
            d.a(T.v.d(), new T.u(N.l.a, this.a, T.t.Middle, true, null));
        }
    }

    public static final class u extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ T.F a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(T.F f, int i) {
            super(2);
            this.a = f;
            this.b = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            i.e(this.a, mVar, g1.a(this.b | 1));
        }
    }

    public static final class v extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ y a;
        public final /* synthetic */ T.F b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(y yVar, T.F f) {
            super(1);
            this.a = yVar;
            this.b = f;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z;
            if (this.a.d() == N.m.b && N.q.a(keyEvent)) {
                z = true;
                T.F.u(this.b, null, 1, null);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((G0.b) obj).f());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05bd A[PHI: r13 r36 r42
      0x05bd: PHI (r13v16 f1.t) = (r13v11 f1.t), (r13v17 f1.t) binds: [B:303:0x05bb, B:144:0x05ac] A[DONT_GENERATE, DONT_INLINE]
      0x05bd: PHI (r36v10 int) = (r36v7 int), (r36v12 int) binds: [B:303:0x05bb, B:144:0x05ac] A[DONT_GENERATE, DONT_INLINE]
      0x05bd: PHI (r42v3 int) = (r42v1 int), (r42v4 int) binds: [B:303:0x05bb, B:144:0x05ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033e  */
    /* JADX WARN: Type inference failed for: r0v42, types: [androidx.compose.ui.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(f1.U r54, Qa.l r55, androidx.compose.ui.e r56, Z0.Y0 r57, f1.f0 r58, Qa.l r59, E.m r60, v0.h0 r61, boolean r62, int r63, int r64, f1.t r65, N.w r66, boolean r67, boolean r68, Qa.q r69, b0.m r70, int r71, int r72, int r73) {
        /*
            Method dump skipped, instructions count: 2540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.i.a(f1.U, Qa.l, androidx.compose.ui.e, Z0.Y0, f1.f0, Qa.l, E.m, v0.h0, boolean, int, int, f1.t, N.w, boolean, boolean, Qa.q, b0.m, int, int, int):void");
    }

    public static final boolean b(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    public static final void c(androidx.compose.ui.e eVar, T.F f2, Qa.p pVar, b0.m mVar, int i2) {
        int i3;
        b0.m i4 = mVar.i(-20551815);
        if ((i2 & 6) == 0) {
            i3 = (i4.U(eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= i4.E(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= i4.E(pVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && i4.j()) {
            i4.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-20551815, i3, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            M0.B h2 = F.f.h(o0.e.a.o(), true);
            int a2 = b0.h.a(i4, 0);
            b0.I r2 = i4.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i4, eVar);
            g.a aVar = O0.g.E8;
            Qa.a a3 = aVar.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a3);
            } else {
                i4.s();
            }
            b0.m b2 = m2.b(i4);
            m2.e(b2, h2, aVar.e());
            m2.e(b2, r2, aVar.g());
            Qa.p b3 = aVar.b();
            if (b2.f() || !kotlin.jvm.internal.t.c(b2.C(), Integer.valueOf(a2))) {
                b2.t(Integer.valueOf(a2));
                b2.J(Integer.valueOf(a2), b3);
            }
            m2.e(b2, f3, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            N.g.a(f2, pVar, i4, (i3 >> 3) & 126);
            i4.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l2 = i4.l();
        if (l2 != null) {
            l2.a(new p(eVar, f2, pVar, i2));
        }
    }

    public static final void d(T.F f2, boolean z, b0.m mVar, int i2) {
        int i3;
        Z j2;
        T0 f3;
        b0.m i4 = mVar.i(626339208);
        if ((i2 & 6) == 0) {
            i3 = (i4.E(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= i4.a(z) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && i4.j()) {
            i4.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(626339208, i3, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z) {
                i4.V(-1286242594);
                y L = f2.L();
                T0 t0 = null;
                if (L != null && (j2 = L.j()) != null && (f3 = j2.f()) != null) {
                    y L2 = f2.L();
                    if (!(L2 != null ? L2.z() : true)) {
                        t0 = f3;
                    }
                }
                if (t0 == null) {
                    i4.V(-1285984396);
                } else {
                    i4.V(-1285984395);
                    if (W0.h(f2.O().k())) {
                        i4.V(-1679637798);
                        i4.P();
                    } else {
                        i4.V(-1680616096);
                        int b2 = f2.J().b(W0.n(f2.O().k()));
                        int b3 = f2.J().b(W0.i(f2.O().k()));
                        l1.i c2 = t0.c(b2);
                        l1.i c3 = t0.c(Math.max(b3 - 1, 0));
                        y L3 = f2.L();
                        if (L3 == null || !L3.u()) {
                            i4.V(-1679975078);
                            i4.P();
                        } else {
                            i4.V(-1680216289);
                            T.G.a(true, c2, f2, i4, ((i3 << 6) & 896) | 6);
                            i4.P();
                        }
                        y L4 = f2.L();
                        if (L4 == null || !L4.t()) {
                            i4.V(-1679655654);
                            i4.P();
                        } else {
                            i4.V(-1679895904);
                            T.G.a(false, c3, f2, i4, ((i3 << 6) & 896) | 6);
                            i4.P();
                        }
                        i4.P();
                    }
                    y L5 = f2.L();
                    if (L5 != null) {
                        if (f2.S()) {
                            L5.K(false);
                        }
                        if (L5.e()) {
                            if (L5.s()) {
                                f2.l0();
                            } else {
                                f2.R();
                            }
                        }
                        Ca.I i5 = Ca.I.a;
                    }
                }
                i4.P();
                i4.P();
            } else {
                i4.V(651305535);
                i4.P();
                f2.R();
            }
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l2 = i4.l();
        if (l2 != null) {
            l2.a(new q(f2, z, i2));
        }
    }

    public static final void e(T.F f2, b0.m mVar, int i2) {
        int i3;
        Z0.e N;
        b0.m i4 = mVar.i(-1436003720);
        if ((i2 & 6) == 0) {
            i3 = (i4.E(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && i4.j()) {
            i4.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-1436003720, i3, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)");
            }
            y L = f2.L();
            if (L == null || !L.r() || (N = f2.N()) == null || N.length() <= 0) {
                i4.V(-284257090);
                i4.P();
            } else {
                i4.V(-285446808);
                boolean U = i4.U(f2);
                Object C = i4.C();
                if (U || C == b0.m.a.a()) {
                    C = f2.r();
                    i4.t(C);
                }
                J j2 = (J) C;
                long B = f2.B((n1.d) i4.x(p0.e()));
                boolean e2 = i4.e(B);
                Object C2 = i4.C();
                if (e2 || C2 == b0.m.a.a()) {
                    C2 = new r(B);
                    i4.t(C2);
                }
                T.i iVar = (T.i) C2;
                e.a aVar = androidx.compose.ui.e.a;
                boolean E = i4.E(j2) | i4.E(f2);
                Object C3 = i4.C();
                if (E || C3 == b0.m.a.a()) {
                    C3 = new s(j2, f2, null);
                    i4.t(C3);
                }
                androidx.compose.ui.e c2 = I0.V.c(aVar, j2, (Qa.p) C3);
                boolean e3 = i4.e(B);
                Object C4 = i4.C();
                if (e3 || C4 == b0.m.a.a()) {
                    C4 = new t(B);
                    i4.t(C4);
                }
                N.a.a(iVar, W0.s.f(c2, false, (Qa.l) C4, 1, null), 0L, i4, 0, 4);
                i4.P();
            }
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l2 = i4.l();
        if (l2 != null) {
            l2.a(new u(f2, i2));
        }
    }

    public static final /* synthetic */ boolean f(h2 h2Var) {
        return b(h2Var);
    }

    public static final /* synthetic */ void g(androidx.compose.ui.e eVar, T.F f2, Qa.p pVar, b0.m mVar, int i2) {
        c(eVar, f2, pVar, mVar, i2);
    }

    public static final /* synthetic */ void h(T.F f2, boolean z, b0.m mVar, int i2) {
        d(f2, z, mVar, i2);
    }

    public static final /* synthetic */ void i(y yVar) {
        n(yVar);
    }

    public static final /* synthetic */ void j(y yVar, f1.U u2, f1.J j2) {
        o(yVar, u2, j2);
    }

    public static final /* synthetic */ void k(f1.W w, y yVar, f1.U u2, f1.t tVar, f1.J j2) {
        q(w, yVar, u2, tVar, j2);
    }

    public static final /* synthetic */ void l(y yVar, androidx.compose.ui.focus.j jVar, boolean z) {
        r(yVar, jVar, z);
    }

    public static final Object m(K.b bVar, f1.U u2, H h2, T0 t0, f1.J j2, Ga.e eVar) {
        int b2 = j2.b(W0.k(u2.k()));
        Object a2 = bVar.a(b2 < t0.l().j().length() ? t0.d(b2) : b2 != 0 ? t0.d(b2 - 1) : new u0.h(0.0f, 0.0f, 1.0f, n1.r.f(M.b(h2.j(), h2.a(), h2.b(), null, 0, 24, null))), eVar);
        return a2 == Ha.c.f() ? a2 : Ca.I.a;
    }

    public static final void n(y yVar) {
        f1.c0 g2 = yVar.g();
        if (g2 != null) {
            L.a.f(g2, yVar.n(), yVar.m());
        }
        yVar.E(null);
    }

    public static final void o(y yVar, f1.U u2, f1.J j2) {
        l.a aVar = l0.l.e;
        l0.l d2 = aVar.d();
        Qa.l g2 = d2 != null ? d2.g() : null;
        l0.l e2 = aVar.e(d2);
        try {
            Z j3 = yVar.j();
            if (j3 == null) {
                return;
            }
            f1.c0 g3 = yVar.g();
            if (g3 == null) {
                return;
            }
            M0.p i2 = yVar.i();
            if (i2 == null) {
                return;
            }
            L.a.e(u2, yVar.v(), j3.f(), i2, g3, yVar.e(), j2);
            Ca.I i3 = Ca.I.a;
        } finally {
            aVar.l(d2, e2, g2);
        }
    }

    public static final androidx.compose.ui.e p(androidx.compose.ui.e eVar, y yVar, T.F f2) {
        return androidx.compose.ui.input.key.a.b(eVar, new v(yVar, f2));
    }

    public static final void q(f1.W w, y yVar, f1.U u2, f1.t tVar, f1.J j2) {
        yVar.E(L.a.h(w, u2, yVar.n(), tVar, yVar.m(), yVar.l()));
        o(yVar, u2, j2);
    }

    public static final void r(y yVar, androidx.compose.ui.focus.j jVar, boolean z) {
        P0.g1 h2;
        if (!yVar.e()) {
            jVar.f();
        } else {
            if (!z || (h2 = yVar.h()) == null) {
                return;
            }
            h2.show();
        }
    }
}

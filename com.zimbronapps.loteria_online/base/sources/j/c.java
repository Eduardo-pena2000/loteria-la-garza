package J;

import Ca.I;
import F.L;
import I.K;
import I0.V;
import b0.U1;
import b0.g1;
import b0.h2;
import cb.O;
import cb.P;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ C b;
        public final /* synthetic */ L c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ C.q e;
        public final /* synthetic */ C.C f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ int h;
        public final /* synthetic */ float i;
        public final /* synthetic */ J.g j;
        public final /* synthetic */ H0.a k;
        public final /* synthetic */ Qa.l l;
        public final /* synthetic */ e.b m;
        public final /* synthetic */ e.c n;
        public final /* synthetic */ D.k o;
        public final /* synthetic */ Qa.r p;
        public final /* synthetic */ int q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.e eVar, C c, L l, boolean z, C.q qVar, C.C c2, boolean z2, int i, float f, J.g gVar, H0.a aVar, Qa.l lVar, e.b bVar, e.c cVar, D.k kVar, Qa.r rVar, int i2, int i3, int i4) {
            super(2);
            this.a = eVar;
            this.b = c;
            this.c = l;
            this.d = z;
            this.e = qVar;
            this.f = c2;
            this.g = z2;
            this.h = i;
            this.i = f;
            this.j = gVar;
            this.k = aVar;
            this.l = lVar;
            this.m = bVar;
            this.n = cVar;
            this.o = kVar;
            this.p = rVar;
            this.q = i2;
            this.r = i3;
            this.s = i4;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            c.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, mVar, g1.a(this.q | 1), g1.a(this.r), this.s);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ C a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C c) {
            super(0);
            this.a = c;
        }

        public final Integer invoke() {
            return Integer.valueOf(this.a.F());
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ C a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C c) {
            super(0);
            this.a = c;
        }

        public final Integer invoke() {
            return Integer.valueOf(this.a.F());
        }
    }

    public static final class d extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ C c;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ I0.L b;
            public final /* synthetic */ C c;

            public static final class a extends Ia.k implements Qa.p {
                public Object a;
                public Object b;
                public int c;
                public /* synthetic */ Object d;
                public final /* synthetic */ C e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(C c, Ga.e eVar) {
                    super(2, eVar);
                    this.e = c;
                }

                public final Ga.e create(Object obj, Ga.e eVar) {
                    a aVar = new a(this.e, eVar);
                    aVar.d = obj;
                    return aVar;
                }

                public final Object invoke(I0.b bVar, Ga.e eVar) {
                    return create(bVar, eVar).invokeSuspend(I.a);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0065 -> B:6:0x0068). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = Ha.c.f()
                        int r1 = r10.c
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r4) goto L27
                        if (r1 != r2) goto L1f
                        java.lang.Object r1 = r10.b
                        I0.C r1 = (I0.C) r1
                        java.lang.Object r4 = r10.a
                        I0.C r4 = (I0.C) r4
                        java.lang.Object r5 = r10.d
                        I0.b r5 = (I0.b) r5
                        Ca.t.b(r11)
                        goto L68
                    L1f:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L27:
                        java.lang.Object r1 = r10.d
                        I0.b r1 = (I0.b) r1
                        Ca.t.b(r11)
                        goto L44
                    L2f:
                        Ca.t.b(r11)
                        java.lang.Object r11 = r10.d
                        r1 = r11
                        I0.b r1 = (I0.b) r1
                        I0.s r11 = I0.s.a
                        r10.d = r1
                        r10.c = r4
                        java.lang.Object r11 = C.B.d(r1, r3, r11, r10)
                        if (r11 != r0) goto L44
                        return r0
                    L44:
                        I0.C r11 = (I0.C) r11
                        J.C r4 = r10.e
                        u0.f$a r5 = u0.f.b
                        long r5 = r5.c()
                        r4.h0(r5)
                        r4 = 0
                        r5 = r1
                        r1 = r4
                        r4 = r11
                    L55:
                        if (r1 != 0) goto L91
                        I0.s r11 = I0.s.a
                        r10.d = r5
                        r10.a = r4
                        r10.b = r1
                        r10.c = r2
                        java.lang.Object r11 = r5.n0(r11, r10)
                        if (r11 != r0) goto L68
                        return r0
                    L68:
                        I0.q r11 = (I0.q) r11
                        java.util.List r6 = r11.c()
                        int r7 = r6.size()
                        r8 = r3
                    L73:
                        if (r8 >= r7) goto L85
                        java.lang.Object r9 = r6.get(r8)
                        I0.C r9 = (I0.C) r9
                        boolean r9 = I0.r.c(r9)
                        if (r9 != 0) goto L82
                        goto L55
                    L82:
                        int r8 = r8 + 1
                        goto L73
                    L85:
                        java.util.List r11 = r11.c()
                        java.lang.Object r11 = r11.get(r3)
                        r1 = r11
                        I0.C r1 = (I0.C) r1
                        goto L55
                    L91:
                        J.C r11 = r10.e
                        long r0 = r1.h()
                        long r2 = r4.h()
                        long r0 = u0.f.p(r0, r2)
                        r11.h0(r0)
                        Ca.I r11 = Ca.I.a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: J.c.d.a.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(I0.L l, C c, Ga.e eVar) {
                super(2, eVar);
                this.b = l;
                this.c = c;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, this.c, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    I0.L l = this.b;
                    a aVar = new a(this.c, null);
                    this.a = 1;
                    if (C.o.c(l, aVar, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C c, Ga.e eVar) {
            super(2, eVar);
            this.c = c;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            d dVar = new d(this.c, eVar);
            dVar.b = obj;
            return dVar;
        }

        public final Object invoke(I0.L l, Ga.e eVar) {
            return create(l, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                a aVar = new a((I0.L) this.b, this.c, null);
                this.a = 1;
                if (P.e(aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return I.a;
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.D {
        public e(Object obj) {
            super(obj, h2.class, "value", "getValue()Ljava/lang/Object;", 0);
        }

        public Object get() {
            return ((h2) ((kotlin.jvm.internal.f) this).receiver).getValue();
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ h2 a;
        public final /* synthetic */ h2 b;
        public final /* synthetic */ Qa.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h2 h2Var, h2 h2Var2, Qa.a aVar) {
            super(0);
            this.a = h2Var;
            this.b = h2Var2;
            this.c = aVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            return new p((Qa.r) this.a.getValue(), (Qa.l) this.b.getValue(), ((Number) this.c.invoke()).intValue());
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ h2 a;
        public final /* synthetic */ C b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h2 h2Var, C c) {
            super(0);
            this.a = h2Var;
            this.b = c;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            p pVar = (p) this.a.getValue();
            return new r(this.b, pVar, new K(this.b.E(), pVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r35, J.C r36, F.L r37, boolean r38, C.q r39, C.C r40, boolean r41, int r42, float r43, J.g r44, H0.a r45, Qa.l r46, o0.e.b r47, o0.e.c r48, D.k r49, Qa.r r50, b0.m r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J.c.a(androidx.compose.ui.e, J.C, F.L, boolean, C.q, C.C, boolean, int, float, J.g, H0.a, Qa.l, o0.e$b, o0.e$c, D.k, Qa.r, b0.m, int, int, int):void");
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, C c2) {
        return eVar.then(V.c(androidx.compose.ui.e.a, c2, new d(c2, null)));
    }

    public static final Qa.a c(C c2, Qa.r rVar, Qa.l lVar, Qa.a aVar, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-1372505274, i, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:258)");
        }
        h2 o = U1.o(rVar, mVar, (i >> 3) & 14);
        h2 o2 = U1.o(lVar, mVar, (i >> 6) & 14);
        boolean U = ((((i & 14) ^ 6) > 4 && mVar.U(c2)) || (i & 6) == 4) | mVar.U(o) | mVar.U(o2) | ((((i & 7168) ^ 3072) > 2048 && mVar.U(aVar)) || (i & 3072) == 2048);
        Object C = mVar.C();
        if (U || C == b0.m.a.a()) {
            C = new e(U1.d(U1.n(), new g(U1.d(U1.n(), new f(o, o2, aVar)), c2)));
            mVar.t(C);
        }
        Xa.k kVar = (Xa.k) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return kVar;
    }
}

package y;

import Ca.I;
import O0.g;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import b0.B1;
import b0.C0;
import b0.U1;
import b0.Z0;
import b0.g1;
import b0.h2;
import b0.m2;
import z.o0;
import z.p0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {

    public static final class a extends kotlin.jvm.internal.u implements Qa.q {

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ androidx.compose.ui.layout.q a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.ui.layout.q qVar) {
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

        public a(x xVar) {
            super(3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke-3p2s80s((androidx.compose.ui.layout.l) obj, (M0.A) obj2, ((n1.b) obj3).r());
        }

        public final M0.C invoke-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
            androidx.compose.ui.layout.q C0 = a2.C0(j);
            if (!lVar.h0()) {
                return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new a(C0), 4, null);
            }
            n1.s.a(C0.W0(), C0.P0());
            throw null;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ o0 a;
        public final /* synthetic */ Qa.l b;
        public final /* synthetic */ androidx.compose.ui.e c;
        public final /* synthetic */ androidx.compose.animation.f d;
        public final /* synthetic */ androidx.compose.animation.g e;
        public final /* synthetic */ Qa.p f;
        public final /* synthetic */ Qa.q g;
        public final /* synthetic */ int h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o0 o0Var, Qa.l lVar, androidx.compose.ui.e eVar, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, Qa.p pVar, x xVar, Qa.q qVar, int i, int i2) {
            super(2);
            this.a = o0Var;
            this.b = lVar;
            this.c = eVar;
            this.d = fVar;
            this.e = gVar;
            this.f = pVar;
            this.g = qVar;
            this.h = i;
            this.i = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            e.a(this.a, this.b, this.c, this.d, this.e, this.f, null, this.g, mVar, g1.a(this.h | 1), this.i);
        }
    }

    public static final class c extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ o0 c;
        public final /* synthetic */ h2 d;

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ o0 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o0 o0Var) {
                super(0);
                this.a = o0Var;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(e.h(this.a));
            }
        }

        public static final class b implements fb.f {
            public final /* synthetic */ Z0 a;
            public final /* synthetic */ o0 b;
            public final /* synthetic */ h2 c;

            public b(Z0 z0, o0 o0Var, h2 h2Var) {
                this.a = z0;
                this.b = o0Var;
                this.c = h2Var;
            }

            public final Object a(boolean z, Ga.e eVar) {
                this.a.setValue(Ia.b.a(z ? ((Boolean) e.g(this.c).invoke(this.b.h(), this.b.o())).booleanValue() : false));
                return I.a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, Ga.e eVar) {
                return a(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o0 o0Var, h2 h2Var, Ga.e eVar) {
            super(2, eVar);
            this.c = o0Var;
            this.d = h2Var;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Z0 z0, Ga.e eVar) {
            return create(z0, eVar).invokeSuspend(I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            c cVar = new c(this.c, this.d, eVar);
            cVar.b = obj;
            return cVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                Z0 z0 = (Z0) this.b;
                fb.e p = U1.p(new a(this.c));
                b bVar = new b(z0, this.c, this.d);
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
            return I.a;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final Boolean a(boolean z) {
            return Boolean.valueOf(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ androidx.compose.animation.f c;
        public final /* synthetic */ androidx.compose.animation.g d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Qa.q f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, androidx.compose.ui.e eVar, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, String str, Qa.q qVar, int i, int i2) {
            super(2);
            this.a = z;
            this.b = eVar;
            this.c = fVar;
            this.d = gVar;
            this.e = str;
            this.f = qVar;
            this.g = i;
            this.h = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            e.e(this.a, this.b, this.c, this.d, this.e, this.f, mVar, g1.a(this.g | 1), this.h);
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.l {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final Boolean a(boolean z) {
            return Boolean.valueOf(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ F.n a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ androidx.compose.ui.e c;
        public final /* synthetic */ androidx.compose.animation.f d;
        public final /* synthetic */ androidx.compose.animation.g e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Qa.q g;
        public final /* synthetic */ int h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(F.n nVar, boolean z, androidx.compose.ui.e eVar, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, String str, Qa.q qVar, int i, int i2) {
            super(2);
            this.a = nVar;
            this.b = z;
            this.c = eVar;
            this.d = fVar;
            this.e = gVar;
            this.f = str;
            this.g = qVar;
            this.h = i;
            this.i = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            e.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, mVar, g1.a(this.h | 1), this.i);
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.q {
        public final /* synthetic */ Qa.l a;
        public final /* synthetic */ o0 b;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ androidx.compose.ui.layout.q a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.ui.layout.q qVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Qa.l lVar, o0 o0Var) {
            super(3);
            this.a = lVar;
            this.b = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke-3p2s80s((androidx.compose.ui.layout.l) obj, (M0.A) obj2, ((n1.b) obj3).r());
        }

        public final M0.C invoke-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
            androidx.compose.ui.layout.q C0 = a2.C0(j);
            long a3 = (!lVar.h0() || ((Boolean) this.a.invoke(this.b.o())).booleanValue()) ? n1.s.a(C0.W0(), C0.P0()) : n1.r.b.a();
            return androidx.compose.ui.layout.l.O0(lVar, n1.r.g(a3), n1.r.f(a3), null, new a(C0), 4, null);
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.p {
        public static final i a = new i();

        public i() {
            super(2);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(m mVar, m mVar2) {
            return Boolean.valueOf(mVar == mVar2 && mVar2 == m.c);
        }
    }

    public static final class j extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ o0 a;
        public final /* synthetic */ Qa.l b;
        public final /* synthetic */ androidx.compose.ui.e c;
        public final /* synthetic */ androidx.compose.animation.f d;
        public final /* synthetic */ androidx.compose.animation.g e;
        public final /* synthetic */ Qa.q f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(o0 o0Var, Qa.l lVar, androidx.compose.ui.e eVar, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, Qa.q qVar, int i) {
            super(2);
            this.a = o0Var;
            this.b = lVar;
            this.c = eVar;
            this.d = fVar;
            this.e = gVar;
            this.f = qVar;
            this.g = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            e.f(this.a, this.b, this.c, this.d, this.e, this.f, mVar, g1.a(this.g | 1));
        }
    }

    public static final void a(o0 o0Var, Qa.l lVar, androidx.compose.ui.e eVar, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, Qa.p pVar, x xVar, Qa.q qVar, b0.m mVar, int i2, int i3) {
        int i4;
        int i5;
        x xVar2;
        int i6;
        x xVar3;
        b0.m mVar2;
        androidx.compose.ui.e eVar2;
        x xVar4;
        b0.m i7 = mVar.i(-891967166);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (i7.U(o0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= i7.E(lVar) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= i7.U(eVar) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= i7.U(fVar) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= i7.U(gVar) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= i7.E(pVar) ? 131072 : 65536;
        }
        int i8 = i3 & 64;
        int i9 = 1572864;
        if (i8 != 0) {
            i4 |= i9;
        } else if ((i2 & 1572864) == 0) {
            i9 = (i2 & 2097152) == 0 ? i7.U(xVar) : i7.E(xVar) ? 1048576 : 524288;
            i4 |= i9;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= i7.E(qVar) ? 8388608 : 4194304;
        }
        int i10 = i4;
        if ((4793491 & i10) == 4793490 && i7.j()) {
            i7.M();
            xVar4 = xVar;
            mVar2 = i7;
        } else {
            x xVar5 = i8 != 0 ? null : xVar;
            if (b0.w.L()) {
                b0.w.U(-891967166, i10, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)");
            }
            if (((Boolean) lVar.invoke(o0Var.o())).booleanValue() || ((Boolean) lVar.invoke(o0Var.h())).booleanValue() || o0Var.s() || o0Var.i()) {
                i7.V(1787977937);
                int i11 = i10 & 14;
                int i12 = i11 | 48;
                int i13 = i12 & 14;
                boolean z = true;
                boolean z2 = ((i13 ^ 6) > 4 && i7.U(o0Var)) || (i12 & 6) == 4;
                Object C = i7.C();
                if (z2 || C == b0.m.a.a()) {
                    C = o0Var.h();
                    i7.t(C);
                }
                if (o0Var.s()) {
                    C = o0Var.h();
                }
                i7.V(-466616829);
                if (b0.w.L()) {
                    i5 = i11;
                    xVar2 = xVar5;
                    b0.w.U(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                } else {
                    i5 = i11;
                    xVar2 = xVar5;
                }
                int i14 = i10 & 126;
                m j2 = j(o0Var, lVar, C, i7, i14);
                if (b0.w.L()) {
                    b0.w.T();
                }
                i7.P();
                Object o = o0Var.o();
                i7.V(-466616829);
                if (b0.w.L()) {
                    i6 = i10;
                    b0.w.U(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                } else {
                    i6 = i10;
                }
                m j3 = j(o0Var, lVar, o, i7, i14);
                if (b0.w.L()) {
                    b0.w.T();
                }
                i7.P();
                int i15 = i13 | 3072;
                int i16 = i5;
                x xVar6 = xVar2;
                int i17 = i6;
                o0 a2 = p0.a(o0Var, j2, j3, "EnterExitTransition", i7, i15);
                h2 o2 = U1.o(pVar, i7, (i17 >> 15) & 14);
                Object invoke = pVar.invoke(a2.h(), a2.o());
                boolean U = i7.U(a2) | i7.U(o2);
                Object C2 = i7.C();
                if (U || C2 == b0.m.a.a()) {
                    C2 = new c(a2, o2, null);
                    i7.t(C2);
                }
                h2 k = U1.k(invoke, (Qa.p) C2, i7, 0);
                if (i(a2) && c(k)) {
                    i7.V(1790256282);
                    i7.P();
                    xVar3 = xVar6;
                    mVar2 = i7;
                } else {
                    i7.V(1788869559);
                    boolean z3 = i16 == 4;
                    Object C3 = i7.C();
                    if (z3 || C3 == b0.m.a.a()) {
                        C3 = new y.g(a2);
                        i7.t(C3);
                    }
                    y.g gVar2 = (y.g) C3;
                    int i18 = i17 >> 6;
                    int i19 = (i18 & 112) | 24576 | (i18 & 896);
                    xVar3 = xVar6;
                    mVar2 = i7;
                    androidx.compose.ui.e g2 = androidx.compose.animation.e.g(a2, fVar, gVar, null, "Built-in", mVar2, i19, 4);
                    if (xVar3 != null) {
                        mVar2.V(1789227361);
                        e.a aVar = androidx.compose.ui.e.a;
                        if ((i17 & 3670016) != 1048576 && ((i17 & 2097152) == 0 || !mVar2.E(xVar3))) {
                            z = false;
                        }
                        Object C4 = mVar2.C();
                        if (z || C4 == b0.m.a.a()) {
                            C4 = new a(xVar3);
                            mVar2.t(C4);
                        }
                        eVar2 = androidx.compose.ui.layout.i.a(aVar, (Qa.q) C4);
                        mVar2.P();
                    } else {
                        mVar2.V(1581766416);
                        mVar2.P();
                        eVar2 = androidx.compose.ui.e.a;
                    }
                    androidx.compose.ui.e then = eVar.then(g2.then(eVar2));
                    Object C5 = mVar2.C();
                    if (C5 == b0.m.a.a()) {
                        C5 = new y.d(gVar2);
                        mVar2.t(C5);
                    }
                    y.d dVar = (y.d) C5;
                    int a3 = b0.h.a(mVar2, 0);
                    b0.I r = mVar2.r();
                    androidx.compose.ui.e f2 = androidx.compose.ui.c.f(mVar2, then);
                    g.a aVar2 = O0.g.E8;
                    Qa.a a4 = aVar2.a();
                    if (mVar2.k() == null) {
                        b0.h.d();
                    }
                    mVar2.I();
                    if (mVar2.f()) {
                        mVar2.p(a4);
                    } else {
                        mVar2.s();
                    }
                    b0.m b2 = m2.b(mVar2);
                    m2.e(b2, dVar, aVar2.e());
                    m2.e(b2, r, aVar2.g());
                    Qa.p b3 = aVar2.b();
                    if (b2.f() || !kotlin.jvm.internal.t.c(b2.C(), Integer.valueOf(a3))) {
                        b2.t(Integer.valueOf(a3));
                        b2.J(Integer.valueOf(a3), b3);
                    }
                    m2.e(b2, f2, aVar2.f());
                    qVar.invoke(gVar2, mVar2, Integer.valueOf((i17 >> 18) & 112));
                    mVar2.v();
                    mVar2.P();
                }
                mVar2.P();
            } else {
                i7.V(1790262234);
                i7.P();
                xVar3 = xVar5;
                mVar2 = i7;
            }
            if (b0.w.L()) {
                b0.w.T();
            }
            xVar4 = xVar3;
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new b(o0Var, lVar, eVar, fVar, gVar, pVar, xVar4, qVar, i2, i3));
        }
    }

    public static final Qa.p b(h2 h2Var) {
        return (Qa.p) h2Var.getValue();
    }

    public static final boolean c(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(F.n r22, boolean r23, androidx.compose.ui.e r24, androidx.compose.animation.f r25, androidx.compose.animation.g r26, java.lang.String r27, Qa.q r28, b0.m r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.e.d(F.n, boolean, androidx.compose.ui.e, androidx.compose.animation.f, androidx.compose.animation.g, java.lang.String, Qa.q, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(boolean r22, androidx.compose.ui.e r23, androidx.compose.animation.f r24, androidx.compose.animation.g r25, java.lang.String r26, Qa.q r27, b0.m r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.e.e(boolean, androidx.compose.ui.e, androidx.compose.animation.f, androidx.compose.animation.g, java.lang.String, Qa.q, b0.m, int, int):void");
    }

    public static final void f(o0 o0Var, Qa.l lVar, androidx.compose.ui.e eVar, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, Qa.q qVar, b0.m mVar, int i2) {
        int i3;
        b0.m i4 = mVar.i(429978603);
        if ((i2 & 6) == 0) {
            i3 = (i4.U(o0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= i4.E(lVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= i4.U(eVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= i4.U(fVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= i4.U(gVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= i4.E(qVar) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && i4.j()) {
            i4.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(429978603, i3, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            int i5 = i3 & 112;
            int i6 = i3 & 14;
            boolean z = (i5 == 32) | (i6 == 4);
            Object C = i4.C();
            if (z || C == b0.m.a.a()) {
                C = new h(lVar, o0Var);
                i4.t(C);
            }
            a(o0Var, lVar, androidx.compose.ui.layout.i.a(eVar, (Qa.q) C), fVar, gVar, i.a, null, qVar, i4, i5 | 196608 | i6 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128), 64);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new j(o0Var, lVar, eVar, fVar, gVar, qVar, i2));
        }
    }

    public static final /* synthetic */ Qa.p g(h2 h2Var) {
        return b(h2Var);
    }

    public static final /* synthetic */ boolean h(o0 o0Var) {
        return i(o0Var);
    }

    public static final boolean i(o0 o0Var) {
        Object h2 = o0Var.h();
        m mVar = m.c;
        return h2 == mVar && o0Var.o() == mVar;
    }

    public static final m j(o0 o0Var, Qa.l lVar, Object obj, b0.m mVar, int i2) {
        m mVar2;
        if (b0.w.L()) {
            b0.w.U(361571134, i2, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        mVar.H(-902048200, o0Var);
        if (o0Var.s()) {
            mVar.V(2101296683);
            mVar.P();
            mVar2 = ((Boolean) lVar.invoke(obj)).booleanValue() ? m.b : ((Boolean) lVar.invoke(o0Var.h())).booleanValue() ? m.c : m.a;
        } else {
            mVar.V(2101530516);
            Object C = mVar.C();
            if (C == b0.m.a.a()) {
                C = U1.i(Boolean.FALSE, null, 2, null);
                mVar.t(C);
            }
            C0 c0 = (C0) C;
            if (((Boolean) lVar.invoke(o0Var.h())).booleanValue()) {
                c0.setValue(Boolean.TRUE);
            }
            mVar2 = ((Boolean) lVar.invoke(obj)).booleanValue() ? m.b : ((Boolean) c0.getValue()).booleanValue() ? m.c : m.a;
            mVar.P();
        }
        mVar.S();
        if (b0.w.L()) {
            b0.w.T();
        }
        return mVar2;
    }
}

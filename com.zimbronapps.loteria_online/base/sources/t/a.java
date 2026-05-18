package T;

import F.T;
import F.W;
import F.Y;
import F.c;
import O0.g;
import P0.p0;
import P0.r1;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.d;
import b0.B1;
import b0.c1;
import b0.g1;
import b0.m2;
import v0.b1;
import v0.d1;
import v0.j0;
import v0.l0;
import v0.r0;
import v0.s0;
import x0.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ i a;
        public final /* synthetic */ o0.e b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, o0.e eVar, Qa.p pVar, int i) {
            super(2);
            this.a = iVar;
            this.b = eVar;
            this.c = pVar;
            this.d = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            a.a(this.a, this.b, this.c, mVar, g1.a(this.d | 1));
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ r1 a;
        public final /* synthetic */ long b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ androidx.compose.ui.e d;
        public final /* synthetic */ i e;

        public static final class a extends kotlin.jvm.internal.u implements Qa.p {
            public final /* synthetic */ long a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ androidx.compose.ui.e c;
            public final /* synthetic */ i d;

            public static final class a extends kotlin.jvm.internal.u implements Qa.a {
                public final /* synthetic */ i a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(i iVar) {
                    super(0);
                    this.a = iVar;
                }

                public final Boolean invoke() {
                    return Boolean.valueOf(u0.g.b(this.a.a()));
                }
            }

            public static final class b extends kotlin.jvm.internal.u implements Qa.a {
                public final /* synthetic */ i a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(i iVar) {
                    super(0);
                    this.a = iVar;
                }

                public final Boolean invoke() {
                    return Boolean.valueOf(u0.g.b(this.a.a()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, boolean z, androidx.compose.ui.e eVar, i iVar) {
                super(2);
                this.a = j;
                this.b = z;
                this.c = eVar;
                this.d = iVar;
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
                    b0.w.U(-1426434671, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)");
                }
                if (this.a != 9205357640488583168L) {
                    mVar.V(-837727128);
                    c.e b2 = this.b ? c.a.a.b() : c.a.a.a();
                    androidx.compose.ui.e p = androidx.compose.foundation.layout.g.p(this.c, n1.k.h(this.a), n1.k.g(this.a), 0.0f, 0.0f, 12, null);
                    i iVar = this.d;
                    boolean z = this.b;
                    M0.B b3 = T.b(b2, o0.e.a.l(), mVar, 0);
                    int a2 = b0.h.a(mVar, 0);
                    b0.I r = mVar.r();
                    androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, p);
                    g.a aVar = O0.g.E8;
                    Qa.a a3 = aVar.a();
                    if (mVar.k() == null) {
                        b0.h.d();
                    }
                    mVar.I();
                    if (mVar.f()) {
                        mVar.p(a3);
                    } else {
                        mVar.s();
                    }
                    b0.m b4 = m2.b(mVar);
                    m2.e(b4, b3, aVar.e());
                    m2.e(b4, r, aVar.g());
                    Qa.p b5 = aVar.b();
                    if (b4.f() || !kotlin.jvm.internal.t.c(b4.C(), Integer.valueOf(a2))) {
                        b4.t(Integer.valueOf(a2));
                        b4.J(Integer.valueOf(a2), b5);
                    }
                    m2.e(b4, f, aVar.f());
                    W w = W.a;
                    e.a aVar2 = androidx.compose.ui.e.a;
                    boolean E = mVar.E(iVar);
                    Object C = mVar.C();
                    if (E || C == b0.m.a.a()) {
                        C = new a(iVar);
                        mVar.t(C);
                    }
                    a.c(aVar2, (Qa.a) C, z, mVar, 6);
                    mVar.v();
                    mVar.P();
                } else {
                    mVar.V(-836867312);
                    androidx.compose.ui.e eVar = this.c;
                    boolean E2 = mVar.E(this.d);
                    i iVar2 = this.d;
                    Object C2 = mVar.C();
                    if (E2 || C2 == b0.m.a.a()) {
                        C2 = new b(iVar2);
                        mVar.t(C2);
                    }
                    a.c(eVar, (Qa.a) C2, this.b, mVar, 0);
                    mVar.P();
                }
                if (b0.w.L()) {
                    b0.w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r1 r1Var, long j, boolean z, androidx.compose.ui.e eVar, i iVar) {
            super(2);
            this.a = r1Var;
            this.b = j;
            this.c = z;
            this.d = eVar;
            this.e = iVar;
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
                b0.w.U(280174801, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)");
            }
            b0.H.c(p0.r().d(this.a), j0.i.d(-1426434671, true, new a(this.b, this.c, this.d, this.e), mVar, 54), mVar, c1.i | 48);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ i a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ l1.i c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ long e;
        public final /* synthetic */ androidx.compose.ui.e f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, boolean z, l1.i iVar2, boolean z2, long j, androidx.compose.ui.e eVar, int i, int i2) {
            super(2);
            this.a = iVar;
            this.b = z;
            this.c = iVar2;
            this.d = z2;
            this.e = j;
            this.f = eVar;
            this.g = i;
            this.h = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            a.b(this.a, this.b, this.c, this.d, this.e, this.f, mVar, g1.a(this.g | 1), this.h);
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ i a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, boolean z, boolean z2) {
            super(1);
            this.a = iVar;
            this.b = z;
            this.c = z2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((W0.D) obj);
            return Ca.I.a;
        }

        public final void invoke(W0.D d) {
            long a = this.a.a();
            d.a(v.d(), new u(this.b ? N.l.b : N.l.c, a, this.c ? t.a : t.c, u0.g.b(a), null));
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ Qa.a b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.compose.ui.e eVar, Qa.a aVar, boolean z, int i) {
            super(2);
            this.a = eVar;
            this.b = aVar;
            this.c = z;
            this.d = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            a.c(this.a, this.b, this.c, mVar, g1.a(this.d | 1));
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.q {
        public final /* synthetic */ Qa.a a;
        public final /* synthetic */ boolean b;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ long a;
            public final /* synthetic */ Qa.a b;
            public final /* synthetic */ boolean c;

            public static final class a extends kotlin.jvm.internal.u implements Qa.l {
                public final /* synthetic */ Qa.a a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ b1 c;
                public final /* synthetic */ androidx.compose.ui.graphics.d d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Qa.a aVar, boolean z, b1 b1Var, androidx.compose.ui.graphics.d dVar) {
                    super(1);
                    this.a = aVar;
                    this.b = z;
                    this.c = b1Var;
                    this.d = dVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((x0.c) obj);
                    return Ca.I.a;
                }

                public final void invoke(x0.c cVar) {
                    cVar.B1();
                    if (((Boolean) this.a.invoke()).booleanValue()) {
                        if (!this.b) {
                            x0.f.Q(cVar, this.c, 0L, 0.0f, null, this.d, 0, 46, null);
                            return;
                        }
                        b1 b1Var = this.c;
                        androidx.compose.ui.graphics.d dVar = this.d;
                        long u1 = cVar.u1();
                        x0.d m1 = cVar.m1();
                        long e = m1.e();
                        m1.f().s();
                        try {
                            m1.d().f(-1.0f, 1.0f, u1);
                            x0.f.Q(cVar, b1Var, 0L, 0.0f, null, dVar, 0, 46, null);
                        } finally {
                            m1.f().k();
                            m1.g(e);
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, Qa.a aVar, boolean z) {
                super(1);
                this.a = j;
                this.b = aVar;
                this.c = z;
            }

            public final s0.k invoke(s0.g gVar) {
                return gVar.p(new a(this.b, this.c, a.d(gVar, u0.l.i(gVar.e()) / 2.0f), d.a.b(androidx.compose.ui.graphics.d.b, this.a, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Qa.a aVar, boolean z) {
            super(3);
            this.a = aVar;
            this.b = z;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, b0.m mVar, int i) {
            mVar.V(-196777734);
            if (b0.w.L()) {
                b0.w.U(-196777734, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:134)");
            }
            long b = ((J) mVar.x(K.b())).b();
            boolean e = mVar.e(b) | mVar.U(this.a) | mVar.a(this.b);
            Qa.a aVar = this.a;
            boolean z = this.b;
            Object C = mVar.C();
            if (e || C == b0.m.a.a()) {
                C = new a(b, aVar, z);
                mVar.t(C);
            }
            androidx.compose.ui.e c = androidx.compose.ui.draw.a.c(eVar, (Qa.l) C);
            if (b0.w.L()) {
                b0.w.T();
            }
            mVar.P();
            return c;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (b0.m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final void a(i iVar, o0.e eVar, Qa.p pVar, b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(476043083);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? i3.U(iVar) : i3.E(iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.E(pVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(476043083, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:247)");
            }
            boolean z = false;
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && i3.U(iVar))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object C = i3.C();
            if (z3 || C == b0.m.a.a()) {
                C = new g(eVar, iVar);
                i3.t(C);
            }
            r1.b.a((g) C, null, new r1.t(false, false, false, null, true, false, 15, null), pVar, i3, ((i2 << 3) & 7168) | 384, 2);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new a(iVar, eVar, pVar, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(T.i r18, boolean r19, l1.i r20, boolean r21, long r22, androidx.compose.ui.e r24, b0.m r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.a.b(T.i, boolean, l1.i, boolean, long, androidx.compose.ui.e, b0.m, int, int):void");
    }

    public static final void c(androidx.compose.ui.e eVar, Qa.a aVar, boolean z, b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(2111672474);
        if ((i & 6) == 0) {
            i2 = (i3.U(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.a(z) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(2111672474, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:122)");
            }
            Y.a(e(androidx.compose.foundation.layout.g.s(eVar, v.c(), v.b()), aVar, z), i3, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new e(eVar, aVar, z, i));
        }
    }

    public static final b1 d(s0.g gVar, float f2) {
        int ceil = ((int) Math.ceil(f2)) * 2;
        T.f fVar = T.f.a;
        b1 c2 = fVar.c();
        j0 a2 = fVar.a();
        x0.a b2 = fVar.b();
        if (c2 == null || a2 == null || ceil > c2.getWidth() || ceil > c2.getHeight()) {
            c2 = d1.b(ceil, ceil, v0.c1.b.a(), false, null, 24, null);
            fVar.f(c2);
            a2 = l0.a(c2);
            fVar.d(a2);
        }
        b1 b1Var = c2;
        j0 j0Var = a2;
        if (b2 == null) {
            b2 = new x0.a();
            fVar.e(b2);
        }
        x0.a aVar = b2;
        n1.t layoutDirection = gVar.getLayoutDirection();
        long a3 = u0.m.a(b1Var.getWidth(), b1Var.getHeight());
        a.a P = aVar.P();
        n1.d a4 = P.a();
        n1.t b3 = P.b();
        j0 c3 = P.c();
        long d2 = P.d();
        a.a P2 = aVar.P();
        P2.j(gVar);
        P2.k(layoutDirection);
        P2.i(j0Var);
        P2.l(a3);
        j0Var.s();
        x0.f.s1(aVar, r0.b.a(), 0L, aVar.e(), 0.0f, null, null, androidx.compose.ui.graphics.c.b.a(), 58, null);
        x0.f.s1(aVar, s0.d(4278190080L), u0.f.b.c(), u0.m.a(f2, f2), 0.0f, null, null, 0, 120, null);
        x0.f.I(aVar, s0.d(4278190080L), f2, u0.g.a(f2, f2), 0.0f, null, null, 0, 120, null);
        j0Var.k();
        a.a P3 = aVar.P();
        P3.j(a4);
        P3.k(b3);
        P3.i(c3);
        P3.l(d2);
        return b1Var;
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, Qa.a aVar, boolean z) {
        return androidx.compose.ui.c.c(eVar, null, new f(aVar, z), 1, null);
    }
}

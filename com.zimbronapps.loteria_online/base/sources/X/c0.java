package X;

import O0.g;
import b0.B1;
import b0.d1;
import b0.g1;
import b0.h2;
import b0.m;
import b0.m2;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c0 {

    public static final class a extends kotlin.jvm.internal.u implements Qa.q {
        public final /* synthetic */ Z a;
        public final /* synthetic */ Z b;
        public final /* synthetic */ List c;
        public final /* synthetic */ y d;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ Z a;

            public static final class a extends kotlin.jvm.internal.u implements Qa.a {
                public final /* synthetic */ Z a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Z z) {
                    super(0);
                    this.a = z;
                }

                public final Boolean invoke() {
                    this.a.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Z z) {
                super(1);
                this.a = z;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W0.D) obj);
                return Ca.I.a;
            }

            public final void invoke(W0.D d) {
                W0.B.Z(d, W0.e.b.b());
                W0.B.j(d, null, new a(this.a), 1, null);
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ Z a;
            public final /* synthetic */ y b;

            public static final class a extends kotlin.jvm.internal.u implements Qa.l {
                public final /* synthetic */ Z a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Z z) {
                    super(1);
                    this.a = z;
                }

                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(x xVar) {
                    return Boolean.valueOf(kotlin.jvm.internal.t.c(xVar.c(), this.a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Z z, y yVar) {
                super(0);
                this.a = z;
                this.b = yVar;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Ca.I.a;
            }

            public final void invoke() {
                if (kotlin.jvm.internal.t.c(this.a, this.b.a())) {
                    return;
                }
                Da.A.J(this.b.b(), new a(this.a));
                d1 c = this.b.c();
                if (c != null) {
                    c.invalidate();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z z, Z z2, List list, y yVar) {
            super(3);
            this.a = z;
            this.b = z2;
            this.c = list;
            this.d = yVar;
        }

        public final void a(Qa.p pVar, b0.m mVar, int i) {
            int i2;
            if ((i & 6) == 0) {
                i2 = i | (mVar.E(pVar) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-1654683077, i2, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
            }
            boolean c = kotlin.jvm.internal.t.c(this.a, this.b);
            int i3 = c ? 150 : 75;
            int i4 = (!c || p1.a.b(this.c).size() == 1) ? 0 : 75;
            z.r0 i5 = z.j.i(i3, i4, z.F.e());
            boolean U = mVar.U(this.a) | mVar.E(this.d);
            Z z = this.a;
            y yVar = this.d;
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = new b(z, yVar);
                mVar.t(C);
            }
            h2 d = c0.d(i5, c, (Qa.a) C, mVar, 0, 0);
            h2 e = c0.e(z.j.i(i3, i4, z.F.d()), c, mVar, 0);
            androidx.compose.ui.e c2 = androidx.compose.ui.graphics.f.c(androidx.compose.ui.e.a, ((Number) e.getValue()).floatValue(), ((Number) e.getValue()).floatValue(), ((Number) d.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            boolean U2 = mVar.U(this.a);
            Z z2 = this.a;
            Object C2 = mVar.C();
            if (U2 || C2 == b0.m.a.a()) {
                C2 = new a(z2);
                mVar.t(C2);
            }
            androidx.compose.ui.e f = W0.s.f(c2, false, (Qa.l) C2, 1, null);
            M0.B h = F.f.h(o0.e.a.o(), false);
            int a2 = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(mVar, f);
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
            b0.m b2 = m2.b(mVar);
            m2.e(b2, h, aVar.e());
            m2.e(b2, r, aVar.g());
            Qa.p b3 = aVar.b();
            if (b2.f() || !kotlin.jvm.internal.t.c(b2.C(), Integer.valueOf(a2))) {
                b2.t(Integer.valueOf(a2));
                b2.J(Integer.valueOf(a2), b3);
            }
            m2.e(b2, f2, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            pVar.invoke(mVar, Integer.valueOf(i2 & 14));
            mVar.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((Qa.p) obj, (b0.m) obj2, ((Number) obj3).intValue());
            return Ca.I.a;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.q a;
        public final /* synthetic */ Z b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Qa.q qVar, Z z) {
            super(2);
            this.a = qVar;
            this.b = z;
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
                b0.w.U(-1135367807, i, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:395)");
            }
            Qa.q qVar = this.a;
            Z z = this.b;
            kotlin.jvm.internal.t.d(z);
            qVar.invoke(z, mVar, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Z a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ Qa.q c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Z z, androidx.compose.ui.e eVar, Qa.q qVar, int i, int i2) {
            super(2);
            this.a = z;
            this.b = eVar;
            this.c = qVar;
            this.d = i;
            this.e = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            c0.c(this.a, this.b, this.c, mVar, g1.a(this.d | 1), this.e);
        }
    }

    public static final class d extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ Z b;
        public final /* synthetic */ P0.c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Z z, P0.c cVar, Ga.e eVar) {
            super(2, eVar);
            this.b = z;
            this.c = cVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new d(this.b, this.c, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                Z z = this.b;
                if (z != null) {
                    long h = c0.h(z.a().getDuration(), this.b.a().a() != null, this.c);
                    this.a = 1;
                    if (cb.Z.a(h, this) == f) {
                        return f;
                    }
                }
                return Ca.I.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            this.b.dismiss();
            return Ca.I.a;
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ d0 a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ Qa.q c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d0 d0Var, androidx.compose.ui.e eVar, Qa.q qVar, int i, int i2) {
            super(2);
            this.a = d0Var;
            this.b = eVar;
            this.c = qVar;
            this.d = i;
            this.e = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            c0.b(this.a, this.b, this.c, mVar, g1.a(this.d | 1), this.e);
        }
    }

    public /* synthetic */ class f {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b0.values().length];
            try {
                iArr[b0.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.a {
        public static final g a = new g();

        public g() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
        }
    }

    public static final class h extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ z.a b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ z.i d;
        public final /* synthetic */ Qa.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(z.a aVar, boolean z, z.i iVar, Qa.a aVar2, Ga.e eVar) {
            super(2, eVar);
            this.b = aVar;
            this.c = z;
            this.d = iVar;
            this.e = aVar2;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new h(this.b, this.c, this.d, this.e, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                z.a aVar = this.b;
                Float c = Ia.b.c(this.c ? 1.0f : 0.0f);
                z.i iVar = this.d;
                this.a = 1;
                if (z.a.f(aVar, c, iVar, null, null, this, 12, null) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            this.e.invoke();
            return Ca.I.a;
        }
    }

    public static final class i extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ z.a b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ z.i d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(z.a aVar, boolean z, z.i iVar, Ga.e eVar) {
            super(2, eVar);
            this.b = aVar;
            this.c = z;
            this.d = iVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new i(this.b, this.c, this.d, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                z.a aVar = this.b;
                Float c = Ia.b.c(this.c ? 1.0f : 0.8f);
                z.i iVar = this.d;
                this.a = 1;
                if (z.a.f(aVar, c, iVar, null, null, this, 12, null) == f) {
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5 A[LOOP:2: B:55:0x01a3->B:56:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(X.Z r16, androidx.compose.ui.e r17, Qa.q r18, b0.m r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.c0.a(X.Z, androidx.compose.ui.e, Qa.q, b0.m, int, int):void");
    }

    public static final void b(d0 d0Var, androidx.compose.ui.e eVar, Qa.q qVar, b0.m mVar, int i2, int i3) {
        int i4;
        b0.m i5 = mVar.i(464178177);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (i5.U(d0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= i5.U(eVar) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= i5.E(qVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && i5.j()) {
            i5.M();
        } else {
            if (i6 != 0) {
                eVar = androidx.compose.ui.e.a;
            }
            if (i7 != 0) {
                qVar = q.a.a();
            }
            if (b0.w.L()) {
                b0.w.U(464178177, i4, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:221)");
            }
            Z b2 = d0Var.b();
            P0.c cVar = (P0.c) i5.x(P0.p0.c());
            boolean U = i5.U(b2) | i5.E(cVar);
            Object C = i5.C();
            if (U || C == b0.m.a.a()) {
                C = new d(b2, cVar, null);
                i5.t(C);
            }
            b0.b0.d(b2, (Qa.p) C, i5, 0);
            a(d0Var.b(), eVar, qVar, i5, i4 & 1008, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        Qa.q qVar2 = qVar;
        B1 l = i5.l();
        if (l != null) {
            l.a(new e(d0Var, eVar2, qVar2, i2, i3));
        }
    }

    public static final /* synthetic */ void c(Z z, androidx.compose.ui.e eVar, Qa.q qVar, b0.m mVar, int i2, int i3) {
        a(z, eVar, qVar, mVar, i2, i3);
    }

    public static final /* synthetic */ h2 d(z.i iVar, boolean z, Qa.a aVar, b0.m mVar, int i2, int i3) {
        return f(iVar, z, aVar, mVar, i2, i3);
    }

    public static final /* synthetic */ h2 e(z.i iVar, boolean z, b0.m mVar, int i2) {
        return g(iVar, z, mVar, i2);
    }

    public static final h2 f(z.i iVar, boolean z, Qa.a aVar, b0.m mVar, int i2, int i3) {
        if ((i3 & 4) != 0) {
            aVar = g.a;
        }
        Qa.a aVar2 = aVar;
        if (b0.w.L()) {
            b0.w.U(1431889134, i2, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:418)");
        }
        Object C = mVar.C();
        m.a aVar3 = b0.m.a;
        if (C == aVar3.a()) {
            C = z.b.b(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            mVar.t(C);
        }
        z.a aVar4 = (z.a) C;
        Boolean valueOf = Boolean.valueOf(z);
        boolean E = mVar.E(aVar4) | ((((i2 & 112) ^ 48) > 32 && mVar.a(z)) || (i2 & 48) == 32) | mVar.E(iVar) | ((((i2 & 896) ^ 384) > 256 && mVar.U(aVar2)) || (i2 & 384) == 256);
        Object C2 = mVar.C();
        if (E || C2 == aVar3.a()) {
            Object hVar = new h(aVar4, z, iVar, aVar2, null);
            mVar.t(hVar);
            C2 = hVar;
        }
        b0.b0.d(valueOf, (Qa.p) C2, mVar, (i2 >> 3) & 14);
        h2 g2 = aVar4.g();
        if (b0.w.L()) {
            b0.w.T();
        }
        return g2;
    }

    public static final h2 g(z.i iVar, boolean z, b0.m mVar, int i2) {
        if (b0.w.L()) {
            b0.w.U(1966809761, i2, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:428)");
        }
        Object C = mVar.C();
        m.a aVar = b0.m.a;
        if (C == aVar.a()) {
            C = z.b.b(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            mVar.t(C);
        }
        z.a aVar2 = (z.a) C;
        Boolean valueOf = Boolean.valueOf(z);
        boolean E = mVar.E(aVar2) | ((((i2 & 112) ^ 48) > 32 && mVar.a(z)) || (i2 & 48) == 32) | mVar.E(iVar);
        Object C2 = mVar.C();
        if (E || C2 == aVar.a()) {
            C2 = new i(aVar2, z, iVar, null);
            mVar.t(C2);
        }
        b0.b0.d(valueOf, (Qa.p) C2, mVar, (i2 >> 3) & 14);
        h2 g2 = aVar2.g();
        if (b0.w.L()) {
            b0.w.T();
        }
        return g2;
    }

    public static final long h(b0 b0Var, boolean z, P0.c cVar) {
        long j;
        int i2 = f.a[b0Var.ordinal()];
        if (i2 == 1) {
            j = Long.MAX_VALUE;
        } else if (i2 == 2) {
            j = 10000;
        } else {
            if (i2 != 3) {
                throw new Ca.o();
            }
            j = 4000;
        }
        long j2 = j;
        return cVar == null ? j2 : cVar.a(j2, true, true, z);
    }
}

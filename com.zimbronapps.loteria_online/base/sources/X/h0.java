package X;

import O0.g;
import b0.b1;
import b0.c1;
import b0.m2;
import v0.E1;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h0 {
    public static final b1 a = b0.H.h(null, a.a, 1, null);

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n1.h.d(invoke-D9Ej5fM());
        }

        public final float invoke-D9Ej5fM() {
            return n1.h.g(0);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ E1 b;
        public final /* synthetic */ long c;
        public final /* synthetic */ float d;
        public final /* synthetic */ A.i e;
        public final /* synthetic */ float f;
        public final /* synthetic */ Qa.p g;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W0.D) obj);
                return Ca.I.a;
            }

            public final void invoke(W0.D d) {
                W0.B.T(d, true);
            }
        }

        public static final class b extends Ia.l implements Qa.p {
            public int a;

            public b(Ga.e eVar) {
                super(2, eVar);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new b(eVar);
            }

            public final Object invoke(I0.L l, Ga.e eVar) {
                return create(l, eVar).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Ha.c.f();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
                return Ca.I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.e eVar, E1 e1, long j, float f, A.i iVar, float f2, Qa.p pVar) {
            super(2);
            this.a = eVar;
            this.b = e1;
            this.c = j;
            this.d = f;
            this.e = iVar;
            this.f = f2;
            this.g = pVar;
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
                b0.w.U(-70914509, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
            }
            androidx.compose.ui.e c = I0.V.c(W0.s.e(h0.c(this.a, this.b, h0.d(this.c, this.d, mVar, 0), this.e, ((n1.d) mVar.x(P0.p0.e())).j1(this.f)), false, a.a), Ca.I.a, new b(null));
            Qa.p pVar = this.g;
            M0.B h = F.f.h(o0.e.a.o(), true);
            int a2 = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, c);
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
            m2.e(b2, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            pVar.invoke(mVar, 0);
            mVar.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ E1 b;
        public final /* synthetic */ long c;
        public final /* synthetic */ float d;
        public final /* synthetic */ A.i e;
        public final /* synthetic */ E.m f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ Qa.a h;
        public final /* synthetic */ float i;
        public final /* synthetic */ Qa.p j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.ui.e eVar, E1 e1, long j, float f, A.i iVar, E.m mVar, boolean z, Qa.a aVar, float f2, Qa.p pVar) {
            super(2);
            this.a = eVar;
            this.b = e1;
            this.c = j;
            this.d = f;
            this.e = iVar;
            this.f = mVar;
            this.g = z;
            this.h = aVar;
            this.i = f2;
            this.j = pVar;
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
                b0.w.U(1279702876, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
            }
            androidx.compose.ui.e b = androidx.compose.foundation.b.b(h0.c(D.b(this.a), this.b, h0.d(this.c, this.d, mVar, 0), this.e, ((n1.d) mVar.x(P0.p0.e())).j1(this.i)), this.f, P.d(false, 0.0f, 0L, mVar, 0, 7), this.g, null, null, this.h, 24, null);
            Qa.p pVar = this.j;
            M0.B h = F.f.h(o0.e.a.o(), true);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, b);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
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
            m2.e(b2, h, aVar.e());
            m2.e(b2, r, aVar.g());
            Qa.p b3 = aVar.b();
            if (b2.f() || !kotlin.jvm.internal.t.c(b2.C(), Integer.valueOf(a))) {
                b2.t(Integer.valueOf(a));
                b2.J(Integer.valueOf(a), b3);
            }
            m2.e(b2, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            pVar.invoke(mVar, 0);
            mVar.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final void a(androidx.compose.ui.e eVar, E1 e1, long j, long j2, float f, float f2, A.i iVar, Qa.p pVar, b0.m mVar, int i, int i2) {
        androidx.compose.ui.e eVar2 = (i2 & 1) != 0 ? androidx.compose.ui.e.a : eVar;
        E1 a2 = (i2 & 2) != 0 ? t1.a() : e1;
        long H = (i2 & 4) != 0 ? E.a.a(mVar, 6).H() : j;
        long c2 = (i2 & 8) != 0 ? m.c(H, mVar, (i >> 6) & 14) : j2;
        float g = (i2 & 16) != 0 ? n1.h.g(0) : f;
        float g2 = (i2 & 32) != 0 ? n1.h.g(0) : f2;
        A.i iVar2 = (i2 & 64) != 0 ? null : iVar;
        if (b0.w.L()) {
            b0.w.U(-513881741, i, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        b1 b1Var = a;
        float g3 = n1.h.g(((n1.h) mVar.x(b1Var)).m() + g);
        b0.H.d(new c1[]{s.a().d(v0.r0.m(c2)), b1Var.d(n1.h.d(g3))}, j0.i.d(-70914509, true, new b(eVar2, a2, H, g3, iVar2, g2, pVar), mVar, 54), mVar, c1.i | 48);
        if (b0.w.L()) {
            b0.w.T();
        }
    }

    public static final void b(Qa.a aVar, androidx.compose.ui.e eVar, boolean z, E1 e1, long j, long j2, float f, float f2, A.i iVar, E.m mVar, Qa.p pVar, b0.m mVar2, int i, int i2, int i3) {
        androidx.compose.ui.e eVar2 = (i3 & 2) != 0 ? androidx.compose.ui.e.a : eVar;
        boolean z2 = (i3 & 4) != 0 ? true : z;
        E1 a2 = (i3 & 8) != 0 ? t1.a() : e1;
        long H = (i3 & 16) != 0 ? E.a.a(mVar2, 6).H() : j;
        long c2 = (i3 & 32) != 0 ? m.c(H, mVar2, (i >> 12) & 14) : j2;
        float g = (i3 & 64) != 0 ? n1.h.g(0) : f;
        float g2 = (i3 & 128) != 0 ? n1.h.g(0) : f2;
        A.i iVar2 = (i3 & 256) != 0 ? null : iVar;
        E.m mVar3 = (i3 & 512) == 0 ? mVar : null;
        if (b0.w.L()) {
            b0.w.U(-789752804, i, i2, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        b1 b1Var = a;
        float g3 = n1.h.g(((n1.h) mVar2.x(b1Var)).m() + g);
        b0.H.d(new c1[]{s.a().d(v0.r0.m(c2)), b1Var.d(n1.h.d(g3))}, j0.i.d(1279702876, true, new c(eVar2, a2, H, g3, iVar2, mVar3, z2, aVar, g2, pVar), mVar2, 54), mVar2, c1.i | 48);
        if (b0.w.L()) {
            b0.w.T();
        }
    }

    public static final /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, E1 e1, long j, A.i iVar, float f) {
        return e(eVar, e1, j, iVar, f);
    }

    public static final /* synthetic */ long d(long j, float f, b0.m mVar, int i) {
        return f(j, f, mVar, i);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, E1 e1, long j, A.i iVar, float f) {
        E1 e12;
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.e then = eVar.then(f > 0.0f ? androidx.compose.ui.graphics.f.c(androidx.compose.ui.e.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, e1, false, null, 0L, 0L, 0, 124895, null) : androidx.compose.ui.e.a);
        if (iVar != null) {
            e12 = e1;
            eVar2 = A.g.e(androidx.compose.ui.e.a, iVar, e12);
        } else {
            e12 = e1;
            eVar2 = androidx.compose.ui.e.a;
        }
        return s0.h.a(androidx.compose.foundation.a.c(then.then(eVar2), j, e12), e12);
    }

    public static final long f(long j, float f, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long a2 = m.a(E.a.a(mVar, 6), j, f, mVar, (i << 3) & 1008);
        if (b0.w.L()) {
            b0.w.T();
        }
        return a2;
    }
}

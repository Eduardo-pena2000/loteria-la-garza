package androidx.compose.animation;

import Ca.I;
import androidx.compose.ui.e;
import b0.C0;
import b0.U1;
import b0.h2;
import o0.e;
import v0.L1;
import y.C;
import z.G;
import z.I0;
import z.h0;
import z.o0;
import z.p0;
import z.s0;
import z.u0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {
    public static final s0 a = u0.a(a.a, b.a);
    public static final h0 b = z.j.h(0.0f, 400.0f, null, 5, null);
    public static final h0 c = z.j.h(0.0f, 400.0f, n1.n.c(I0.c(n1.n.b)), 1, null);
    public static final h0 d = z.j.h(0.0f, 400.0f, n1.r.b(I0.d(n1.r.b)), 1, null);

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final z.n a(long j) {
            return new z.n(androidx.compose.ui.graphics.j.f(j), androidx.compose.ui.graphics.j.g(j));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((androidx.compose.ui.graphics.j) obj).j());
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final long a(z.n nVar) {
            return L1.a(nVar.f(), nVar.g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.j.b(a((z.n) obj));
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.animation.f a;
        public final /* synthetic */ androidx.compose.animation.g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar) {
            super(1);
            this.a = fVar;
            this.b = gVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke(o0.b bVar) {
            G b;
            G b2;
            y.m mVar = y.m.PreEnter;
            y.m mVar2 = y.m.Visible;
            if (bVar.c(mVar, mVar2)) {
                y.r c = this.a.b().c();
                return (c == null || (b2 = c.b()) == null) ? e.b() : b2;
            }
            if (!bVar.c(mVar2, y.m.PostExit)) {
                return e.b();
            }
            y.r c2 = this.b.b().c();
            return (c2 == null || (b = c2.b()) == null) ? e.b() : b;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.animation.f a;
        public final /* synthetic */ androidx.compose.animation.g b;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[y.m.values().length];
                try {
                    iArr[y.m.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y.m.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[y.m.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar) {
            super(1);
            this.a = fVar;
            this.b = gVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(y.m mVar) {
            int i = a.a[mVar.ordinal()];
            float f = 1.0f;
            if (i != 1) {
                if (i == 2) {
                    y.r c = this.a.b().c();
                    if (c != null) {
                        f = c.a();
                    }
                } else {
                    if (i != 3) {
                        throw new Ca.o();
                    }
                    y.r c2 = this.b.b().c();
                    if (c2 != null) {
                        f = c2.a();
                    }
                }
            }
            return Float.valueOf(f);
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ h2 a;
        public final /* synthetic */ h2 b;
        public final /* synthetic */ h2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h2 h2Var, h2 h2Var2, h2 h2Var3) {
            super(1);
            this.a = h2Var;
            this.b = h2Var2;
            this.c = h2Var3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((androidx.compose.ui.graphics.g) obj);
            return I.a;
        }

        public final void invoke(androidx.compose.ui.graphics.g gVar) {
            h2 h2Var = this.a;
            gVar.d(h2Var != null ? ((Number) h2Var.getValue()).floatValue() : 1.0f);
            h2 h2Var2 = this.b;
            gVar.l(h2Var2 != null ? ((Number) h2Var2.getValue()).floatValue() : 1.0f);
            h2 h2Var3 = this.b;
            gVar.y(h2Var3 != null ? ((Number) h2Var3.getValue()).floatValue() : 1.0f);
            h2 h2Var4 = this.c;
            gVar.t0(h2Var4 != null ? ((androidx.compose.ui.graphics.j) h2Var4.getValue()).j() : androidx.compose.ui.graphics.j.b.a());
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.animation.f a;
        public final /* synthetic */ androidx.compose.animation.g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar) {
            super(1);
            this.a = fVar;
            this.b = gVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke(o0.b bVar) {
            G a;
            G a2;
            y.m mVar = y.m.PreEnter;
            y.m mVar2 = y.m.Visible;
            if (bVar.c(mVar, mVar2)) {
                y.y e = this.a.b().e();
                return (e == null || (a2 = e.a()) == null) ? e.b() : a2;
            }
            if (!bVar.c(mVar2, y.m.PostExit)) {
                return e.b();
            }
            y.y e2 = this.b.b().e();
            return (e2 == null || (a = e2.a()) == null) ? e.b() : a;
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.animation.f a;
        public final /* synthetic */ androidx.compose.animation.g b;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[y.m.values().length];
                try {
                    iArr[y.m.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y.m.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[y.m.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar) {
            super(1);
            this.a = fVar;
            this.b = gVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(y.m mVar) {
            int i = a.a[mVar.ordinal()];
            float f = 1.0f;
            if (i != 1) {
                if (i == 2) {
                    y.y e = this.a.b().e();
                    if (e != null) {
                        f = e.b();
                    }
                } else {
                    if (i != 3) {
                        throw new Ca.o();
                    }
                    y.y e2 = this.b.b().e();
                    if (e2 != null) {
                        f = e2.b();
                    }
                }
            }
            return Float.valueOf(f);
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.l {
        public static final h a = new h();

        public h() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke(o0.b bVar) {
            return z.j.h(0.0f, 0.0f, null, 7, null);
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.graphics.j a;
        public final /* synthetic */ androidx.compose.animation.f b;
        public final /* synthetic */ androidx.compose.animation.g c;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[y.m.values().length];
                try {
                    iArr[y.m.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y.m.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[y.m.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(androidx.compose.ui.graphics.j jVar, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar) {
            super(1);
            this.a = jVar;
            this.b = fVar;
            this.c = gVar;
        }

        public final long a(y.m mVar) {
            androidx.compose.ui.graphics.j jVar;
            int i = a.a[mVar.ordinal()];
            if (i != 1) {
                jVar = null;
                if (i == 2) {
                    y.y e = this.b.b().e();
                    if (e != null || (e = this.c.b().e()) != null) {
                        jVar = androidx.compose.ui.graphics.j.b(e.c());
                    }
                } else {
                    if (i != 3) {
                        throw new Ca.o();
                    }
                    y.y e2 = this.c.b().e();
                    if (e2 != null || (e2 = this.b.b().e()) != null) {
                        jVar = androidx.compose.ui.graphics.j.b(e2.c());
                    }
                }
            } else {
                jVar = this.a;
            }
            return jVar != null ? jVar.j() : androidx.compose.ui.graphics.j.b.a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.j.b(a((y.m) obj));
        }
    }

    public static final class j extends kotlin.jvm.internal.u implements Qa.a {
        public static final j a = new j();

        public j() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class k extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Qa.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z, Qa.a aVar) {
            super(1);
            this.a = z;
            this.b = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((androidx.compose.ui.graphics.g) obj);
            return I.a;
        }

        public final void invoke(androidx.compose.ui.graphics.g gVar) {
            gVar.n(!this.a && ((Boolean) this.b.invoke()).booleanValue());
        }
    }

    public static final class l extends kotlin.jvm.internal.u implements Qa.l {
        public static final l a = new l();

        public l() {
            super(1);
        }

        public final long a(long j) {
            return n1.s.a(0, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.r.b(a(((n1.r) obj).j()));
        }
    }

    public static final class m extends kotlin.jvm.internal.u implements Qa.l {
        public static final m a = new m();

        public m() {
            super(1);
        }

        public final Integer invoke(int i) {
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static final class n extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Qa.l lVar) {
            super(1);
            this.a = lVar;
        }

        public final long a(long j) {
            return n1.s.a(n1.r.g(j), ((Number) this.a.invoke(Integer.valueOf(n1.r.f(j)))).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.r.b(a(((n1.r) obj).j()));
        }
    }

    public static final class o extends kotlin.jvm.internal.u implements Qa.l {
        public static final o a = new o();

        public o() {
            super(1);
        }

        public final long a(long j) {
            return n1.s.a(0, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.r.b(a(((n1.r) obj).j()));
        }
    }

    public static final class p extends kotlin.jvm.internal.u implements Qa.l {
        public static final p a = new p();

        public p() {
            super(1);
        }

        public final Integer invoke(int i) {
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static final class q extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Qa.l lVar) {
            super(1);
            this.a = lVar;
        }

        public final long a(long j) {
            return n1.s.a(n1.r.g(j), ((Number) this.a.invoke(Integer.valueOf(n1.r.f(j)))).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.r.b(a(((n1.r) obj).j()));
        }
    }

    public static final class r extends kotlin.jvm.internal.u implements Qa.l {
        public static final r a = new r();

        public r() {
            super(1);
        }

        public final Integer invoke(int i) {
            return Integer.valueOf((-i) / 2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static final class s extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Qa.l lVar) {
            super(1);
            this.a = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.n.c(invoke-mHKZG7I(((n1.r) obj).j()));
        }

        public final long invoke-mHKZG7I(long j) {
            return n1.o.a(((Number) this.a.invoke(Integer.valueOf(n1.r.g(j)))).intValue(), 0);
        }
    }

    public static final class t extends kotlin.jvm.internal.u implements Qa.l {
        public static final t a = new t();

        public t() {
            super(1);
        }

        public final Integer invoke(int i) {
            return Integer.valueOf((-i) / 2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static final class u extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Qa.l lVar) {
            super(1);
            this.a = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.n.c(invoke-mHKZG7I(((n1.r) obj).j()));
        }

        public final long invoke-mHKZG7I(long j) {
            return n1.o.a(0, ((Number) this.a.invoke(Integer.valueOf(n1.r.f(j)))).intValue());
        }
    }

    public static final class v extends kotlin.jvm.internal.u implements Qa.l {
        public static final v a = new v();

        public v() {
            super(1);
        }

        public final Integer invoke(int i) {
            return Integer.valueOf((-i) / 2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static final class w extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Qa.l lVar) {
            super(1);
            this.a = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.n.c(invoke-mHKZG7I(((n1.r) obj).j()));
        }

        public final long invoke-mHKZG7I(long j) {
            return n1.o.a(((Number) this.a.invoke(Integer.valueOf(n1.r.g(j)))).intValue(), 0);
        }
    }

    public static final class x extends kotlin.jvm.internal.u implements Qa.l {
        public static final x a = new x();

        public x() {
            super(1);
        }

        public final Integer invoke(int i) {
            return Integer.valueOf((-i) / 2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static final class y extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Qa.l lVar) {
            super(1);
            this.a = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n1.n.c(invoke-mHKZG7I(((n1.r) obj).j()));
        }

        public final long invoke-mHKZG7I(long j) {
            return n1.o.a(0, ((Number) this.a.invoke(Integer.valueOf(n1.r.f(j)))).intValue());
        }
    }

    public static final androidx.compose.animation.g A(G g2, Qa.l lVar) {
        return new y.q(new y.G(null, new C(lVar, g2), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.g B(G g2, Qa.l lVar) {
        return A(g2, new w(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.g C(G g2, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, n1.n.c(I0.c(n1.n.b)), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = v.a;
        }
        return B(g2, lVar);
    }

    public static final androidx.compose.animation.g D(G g2, Qa.l lVar) {
        return A(g2, new y(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.g E(G g2, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, n1.n.c(I0.c(n1.n.b)), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = x.a;
        }
        return D(g2, lVar);
    }

    public static final o0.e F(e.c cVar) {
        e.a aVar = o0.e.a;
        return kotlin.jvm.internal.t.c(cVar, aVar.l()) ? aVar.m() : kotlin.jvm.internal.t.c(cVar, aVar.a()) ? aVar.b() : aVar.e();
    }

    public static final androidx.compose.animation.f G(o0 o0Var, androidx.compose.animation.f fVar, b0.m mVar, int i2) {
        if (b0.w.L()) {
            b0.w.U(21614502, i2, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)");
        }
        boolean z = (((i2 & 14) ^ 6) > 4 && mVar.U(o0Var)) || (i2 & 6) == 4;
        Object C = mVar.C();
        if (z || C == b0.m.a.a()) {
            C = U1.i(fVar, null, 2, null);
            mVar.t(C);
        }
        C0 c0 = (C0) C;
        if (o0Var.h() == o0Var.o() && o0Var.h() == y.m.Visible) {
            if (o0Var.s()) {
                I(c0, fVar);
            } else {
                I(c0, androidx.compose.animation.f.a.a());
            }
        } else if (o0Var.o() == y.m.Visible) {
            I(c0, H(c0).c(fVar));
        }
        androidx.compose.animation.f H = H(c0);
        if (b0.w.L()) {
            b0.w.T();
        }
        return H;
    }

    public static final androidx.compose.animation.f H(C0 c0) {
        return (androidx.compose.animation.f) c0.getValue();
    }

    public static final void I(C0 c0, androidx.compose.animation.f fVar) {
        c0.setValue(fVar);
    }

    public static final androidx.compose.animation.g J(o0 o0Var, androidx.compose.animation.g gVar, b0.m mVar, int i2) {
        if (b0.w.L()) {
            b0.w.U(-1363864804, i2, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)");
        }
        boolean z = (((i2 & 14) ^ 6) > 4 && mVar.U(o0Var)) || (i2 & 6) == 4;
        Object C = mVar.C();
        if (z || C == b0.m.a.a()) {
            C = U1.i(gVar, null, 2, null);
            mVar.t(C);
        }
        C0 c0 = (C0) C;
        if (o0Var.h() == o0Var.o() && o0Var.h() == y.m.Visible) {
            if (o0Var.s()) {
                L(c0, gVar);
            } else {
                L(c0, androidx.compose.animation.g.a.a());
            }
        } else if (o0Var.o() != y.m.Visible) {
            L(c0, K(c0).c(gVar));
        }
        androidx.compose.animation.g K = K(c0);
        if (b0.w.L()) {
            b0.w.T();
        }
        return K;
    }

    public static final androidx.compose.animation.g K(C0 c0) {
        return (androidx.compose.animation.g) c0.getValue();
    }

    public static final void L(C0 c0, androidx.compose.animation.g gVar) {
        c0.setValue(gVar);
    }

    public static /* synthetic */ Qa.l a(o0.a aVar, o0.a aVar2, o0 o0Var, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, o0.a aVar3) {
        return f(aVar, aVar2, o0Var, fVar, gVar, aVar3);
    }

    public static final /* synthetic */ h0 b() {
        return b;
    }

    public static final /* synthetic */ h0 c() {
        return c;
    }

    public static final /* synthetic */ h0 d() {
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final y.u e(z.o0 r20, androidx.compose.animation.f r21, androidx.compose.animation.g r22, java.lang.String r23, b0.m r24, int r25) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.e.e(z.o0, androidx.compose.animation.f, androidx.compose.animation.g, java.lang.String, b0.m, int):y.u");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Qa.l f(z.o0.a r3, z.o0.a r4, z.o0 r5, androidx.compose.animation.f r6, androidx.compose.animation.g r7, z.o0.a r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L12
            androidx.compose.animation.e$c r1 = new androidx.compose.animation.e$c
            r1.<init>(r6, r7)
            androidx.compose.animation.e$d r2 = new androidx.compose.animation.e$d
            r2.<init>(r6, r7)
            b0.h2 r3 = r3.a(r1, r2)
            goto L13
        L12:
            r3 = r0
        L13:
            if (r4 == 0) goto L24
            androidx.compose.animation.e$f r1 = new androidx.compose.animation.e$f
            r1.<init>(r6, r7)
            androidx.compose.animation.e$g r2 = new androidx.compose.animation.e$g
            r2.<init>(r6, r7)
            b0.h2 r4 = r4.a(r1, r2)
            goto L25
        L24:
            r4 = r0
        L25:
            java.lang.Object r5 = r5.h()
            y.m r1 = y.m.PreEnter
            if (r5 != r1) goto L4d
            y.G r5 = r6.b()
            y.y r5 = r5.e()
            if (r5 == 0) goto L40
        L37:
            long r1 = r5.c()
            androidx.compose.ui.graphics.j r5 = androidx.compose.ui.graphics.j.b(r1)
            goto L6b
        L40:
            y.G r5 = r7.b()
            y.y r5 = r5.e()
            if (r5 == 0) goto L4b
            goto L37
        L4b:
            r5 = r0
            goto L6b
        L4d:
            y.G r5 = r7.b()
            y.y r5 = r5.e()
            if (r5 == 0) goto L60
        L57:
            long r1 = r5.c()
            androidx.compose.ui.graphics.j r5 = androidx.compose.ui.graphics.j.b(r1)
            goto L6b
        L60:
            y.G r5 = r6.b()
            y.y r5 = r5.e()
            if (r5 == 0) goto L4b
            goto L57
        L6b:
            if (r8 == 0) goto L78
            androidx.compose.animation.e$h r0 = androidx.compose.animation.e.h.a
            androidx.compose.animation.e$i r1 = new androidx.compose.animation.e$i
            r1.<init>(r5, r6, r7)
            b0.h2 r0 = r8.a(r0, r1)
        L78:
            androidx.compose.animation.e$e r5 = new androidx.compose.animation.e$e
            r5.<init>(r3, r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.e.f(z.o0$a, z.o0$a, z.o0, androidx.compose.animation.f, androidx.compose.animation.g, z.o0$a):Qa.l");
    }

    public static final androidx.compose.ui.e g(o0 o0Var, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, Qa.a aVar, String str, b0.m mVar, int i2, int i3) {
        o0.a aVar2;
        o0.a aVar3;
        y.i a2;
        Qa.a aVar4 = (i3 & 4) != 0 ? j.a : aVar;
        if (b0.w.L()) {
            b0.w.U(28261782, i2, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)");
        }
        int i4 = i2 & 14;
        androidx.compose.animation.f G = G(o0Var, fVar, mVar, i2 & 126);
        int i5 = i2 >> 3;
        androidx.compose.animation.g J = J(o0Var, gVar, mVar, (i5 & 112) | i4);
        boolean z = true;
        boolean z2 = (G.b().f() == null && J.b().f() == null) ? false : true;
        boolean z3 = (G.b().a() == null && J.b().a() == null) ? false : true;
        o0.a aVar5 = null;
        if (z2) {
            mVar.V(-821375963);
            s0 f2 = u0.f(n1.n.b);
            Object C = mVar.C();
            if (C == b0.m.a.a()) {
                C = str + " slide";
                mVar.t(C);
            }
            o0.a b2 = p0.b(o0Var, f2, (String) C, mVar, i4 | 384, 0);
            mVar.P();
            aVar2 = b2;
        } else {
            mVar.V(-821278096);
            mVar.P();
            aVar2 = null;
        }
        if (z3) {
            mVar.V(-821202177);
            s0 g2 = u0.g(n1.r.b);
            Object C2 = mVar.C();
            if (C2 == b0.m.a.a()) {
                C2 = str + " shrink/expand";
                mVar.t(C2);
            }
            o0.a b3 = p0.b(o0Var, g2, (String) C2, mVar, i4 | 384, 0);
            mVar.P();
            aVar3 = b3;
        } else {
            mVar.V(-821099041);
            mVar.P();
            aVar3 = null;
        }
        if (z3) {
            mVar.V(-821034002);
            s0 f3 = u0.f(n1.n.b);
            Object C3 = mVar.C();
            if (C3 == b0.m.a.a()) {
                C3 = str + " InterruptionHandlingOffset";
                mVar.t(C3);
            }
            o0.a b4 = p0.b(o0Var, f3, (String) C3, mVar, i4 | 384, 0);
            mVar.P();
            aVar5 = b4;
        } else {
            mVar.V(-820883777);
            mVar.P();
        }
        y.i a3 = G.b().a();
        boolean z4 = ((a3 == null || a3.c()) && ((a2 = J.b().a()) == null || a2.c()) && z3) ? false : true;
        y.u e2 = e(o0Var, G, J, str, mVar, i4 | (i5 & 7168));
        e.a aVar6 = androidx.compose.ui.e.a;
        boolean a4 = mVar.a(z4);
        if ((((i2 & 7168) ^ 3072) <= 2048 || !mVar.U(aVar4)) && (i2 & 3072) != 2048) {
            z = false;
        }
        boolean z5 = a4 | z;
        Object C4 = mVar.C();
        if (z5 || C4 == b0.m.a.a()) {
            C4 = new k(z4, aVar4);
            mVar.t(C4);
        }
        androidx.compose.ui.e then = androidx.compose.ui.graphics.f.a(aVar6, (Qa.l) C4).then(new EnterExitTransitionElement(o0Var, aVar3, aVar5, aVar2, G, J, aVar4, e2));
        if (b0.w.L()) {
            b0.w.T();
        }
        return then;
    }

    public static final androidx.compose.animation.f h(G g2, o0.e eVar, boolean z, Qa.l lVar) {
        return new y.p(new y.G(null, null, new y.i(eVar, lVar, g2, z), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.f i(G g2, o0.e eVar, boolean z, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, n1.r.b(I0.d(n1.r.b)), 1, null);
        }
        if ((i2 & 2) != 0) {
            eVar = o0.e.a.c();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            lVar = l.a;
        }
        return h(g2, eVar, z, lVar);
    }

    public static final androidx.compose.animation.f j(G g2, e.c cVar, boolean z, Qa.l lVar) {
        return h(g2, F(cVar), z, new n(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.f k(G g2, e.c cVar, boolean z, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, n1.r.b(I0.d(n1.r.b)), 1, null);
        }
        if ((i2 & 2) != 0) {
            cVar = o0.e.a.a();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            lVar = m.a;
        }
        return j(g2, cVar, z, lVar);
    }

    public static final androidx.compose.animation.f l(G g2, float f2) {
        return new y.p(new y.G(new y.r(f2, g2), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.f m(G g2, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return l(g2, f2);
    }

    public static final androidx.compose.animation.g n(G g2, float f2) {
        return new y.q(new y.G(new y.r(f2, g2), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.g o(G g2, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return n(g2, f2);
    }

    public static final androidx.compose.animation.f p(G g2, float f2, long j2) {
        return new y.p(new y.G(null, null, null, new y.y(f2, j2, g2, null), false, null, 55, null));
    }

    public static /* synthetic */ androidx.compose.animation.f q(G g2, float f2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j2 = androidx.compose.ui.graphics.j.b.a();
        }
        return p(g2, f2, j2);
    }

    public static final androidx.compose.animation.g r(G g2, o0.e eVar, boolean z, Qa.l lVar) {
        return new y.q(new y.G(null, null, new y.i(eVar, lVar, g2, z), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.g s(G g2, o0.e eVar, boolean z, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, n1.r.b(I0.d(n1.r.b)), 1, null);
        }
        if ((i2 & 2) != 0) {
            eVar = o0.e.a.c();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            lVar = o.a;
        }
        return r(g2, eVar, z, lVar);
    }

    public static final androidx.compose.animation.g t(G g2, e.c cVar, boolean z, Qa.l lVar) {
        return r(g2, F(cVar), z, new q(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.g u(G g2, e.c cVar, boolean z, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, n1.r.b(I0.d(n1.r.b)), 1, null);
        }
        if ((i2 & 2) != 0) {
            cVar = o0.e.a.a();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            lVar = p.a;
        }
        return t(g2, cVar, z, lVar);
    }

    public static final androidx.compose.animation.f v(G g2, Qa.l lVar) {
        return new y.p(new y.G(null, new C(lVar, g2), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.f w(G g2, Qa.l lVar) {
        return v(g2, new s(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.f x(G g2, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, n1.n.c(I0.c(n1.n.b)), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = r.a;
        }
        return w(g2, lVar);
    }

    public static final androidx.compose.animation.f y(G g2, Qa.l lVar) {
        return v(g2, new u(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.f z(G g2, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            g2 = z.j.h(0.0f, 400.0f, n1.n.c(I0.c(n1.n.b)), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = t.a;
        }
        return y(g2, lVar);
    }
}

package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import Ca.I;
import Da.v;
import F.o;
import M.i;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import X.E;
import X.m0;
import android.graphics.BlurMaskFilter;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import d1.H;
import d1.L;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import n1.d;
import n1.h;
import u0.g;
import v0.E1;
import v0.Q;
import v0.V;
import v0.i1;
import v0.j0;
import v0.j1;
import v0.k1;
import v0.m1;
import v0.q0;
import v0.r0;
import v0.s0;
import v0.t1;
import x0.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ShadowKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ShadowKt.access$Shadow_Preview_Circle(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ShadowKt.access$Shadow_Preview_CircleAlpha(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ShadowKt.access$Shadow_Preview_Gradient_CustomShape(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ShadowKt.access$Shadow_Preview_Margin(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ShadowKt.access$Shadow_Preview_Square(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ShadowKt.access$Shadow_Preview_SquareAlpha(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ ShadowStyle $shadow;
        final /* synthetic */ E1 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ShadowStyle shadowStyle, E1 e1) {
            super(1);
            this.$shadow = shadowStyle;
            this.$shape = e1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((f) obj);
            return I.a;
        }

        public final void invoke(f drawBehind) {
            t.g(drawBehind, "$this$drawBehind");
            m1 m1Var = ShadowKt.access$toPath-Xbl9iGQ(this.$shape, drawBehind.e(), drawBehind.getLayoutDirection(), drawBehind, u0.f.d(g.a(drawBehind.j1(this.$shadow.getX-D9Ej5fM()), drawBehind.j1(this.$shadow.getY-D9Ej5fM()))));
            k1 a = Q.a();
            ShadowStyle shadowStyle = this.$shadow;
            ColorStyle color = shadowStyle.getColor();
            if (color instanceof ColorStyle.Solid) {
                a.p(((ColorStyle.Solid) shadowStyle.getColor()).unbox-impl());
            } else if (color instanceof ColorStyle.Gradient) {
                ((ColorStyle.Gradient) shadowStyle.getColor()).unbox-impl().applyTo-Pq9zytI(drawBehind.e(), a, 1.0f);
            }
            if (!h.i(shadowStyle.getRadius-D9Ej5fM(), h.g(0))) {
                a.t().setMaskFilter(new BlurMaskFilter(drawBehind.j1(shadowStyle.getRadius-D9Ej5fM()), BlurMaskFilter.Blur.NORMAL));
            }
            E1 e1 = this.$shape;
            j0 f = drawBehind.m1().f();
            f.s();
            f.b(ShadowKt.toPath-Xbl9iGQ$default(e1, drawBehind.e(), drawBehind.getLayoutDirection(), drawBehind, null, 8, null), q0.a.a());
            f.v(m1Var, a);
            f.k();
        }
    }

    private static final void Shadow_Preview_Circle(m mVar, int i) {
        m i2 = mVar.i(1888265500);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1888265500, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Circle (Shadow.kt:96)");
            }
            M.h g = i.g();
            e.a aVar = e.a;
            e m = androidx.compose.foundation.layout.g.m(aVar, h.g(200));
            B h = F.f.h(o0.e.a.e(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = c.f(i2, m);
            g.a aVar2 = O0.g.E8;
            a a2 = aVar2.a();
            if (i2.k() == null) {
                b0.h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a2);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            e m2 = androidx.compose.foundation.layout.g.m(aVar, h.g(100));
            r0.a aVar3 = r0.b;
            long j = ColorStyle.Solid.constructor-impl(aVar3.a());
            float f2 = 5;
            F.f.a(androidx.compose.foundation.a.c(shadow(m2, new ShadowStyle(ColorStyle.Solid.box-impl(j), h.g(0), h.g(f2), h.g(f2), null), g), aVar3.h(), g), i2, 0);
            i2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Shadow_Preview_CircleAlpha(m mVar, int i) {
        m i2 = mVar.i(524710378);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(524710378, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_CircleAlpha (Shadow.kt:149)");
            }
            M.h g = i.g();
            e.a aVar = e.a;
            e m = androidx.compose.foundation.layout.g.m(aVar, h.g(200));
            B h = F.f.h(o0.e.a.e(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = c.f(i2, m);
            g.a aVar2 = O0.g.E8;
            a a2 = aVar2.a();
            if (i2.k() == null) {
                b0.h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a2);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            e m2 = androidx.compose.foundation.layout.g.m(aVar, h.g(100));
            r0.a aVar3 = r0.b;
            long j = ColorStyle.Solid.constructor-impl(aVar3.a());
            float f2 = 5;
            F.f.a(androidx.compose.foundation.a.c(shadow(m2, new ShadowStyle(ColorStyle.Solid.box-impl(j), h.g(0), h.g(f2), h.g(f2), null), g), r0.q(aVar3.h(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), g), i2, 0);
            i2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Shadow_Preview_Gradient_CustomShape(m mVar, int i) {
        m mVar2;
        m i2 = mVar.i(2006972301);
        if (i == 0 && i2.j()) {
            i2.M();
            mVar2 = i2;
        } else {
            if (w.L()) {
                w.U(2006972301, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Gradient_CustomShape (Shadow.kt:203)");
            }
            M.h a = i.a(50);
            e.a aVar = e.a;
            e m = androidx.compose.foundation.layout.g.m(aVar, h.g(200));
            B h = F.f.h(o0.e.a.e(), false);
            int a2 = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = c.f(i2, m);
            g.a aVar2 = O0.g.E8;
            a a3 = aVar2.a();
            if (i2.k() == null) {
                b0.h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a3);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            r0.a aVar3 = r0.b;
            mVar2 = i2;
            m0.b("GET UNLIMITED RGB", androidx.compose.foundation.layout.f.j(androidx.compose.foundation.a.c(shadow(aVar, new ShadowStyle(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(90.0f, v.q(new ColorInfo.Gradient.Point(s0.k(aVar3.h()), 10.0f), new ColorInfo.Gradient.Point(s0.k(aVar3.f()), 50.0f), new ColorInfo.Gradient.Point(s0.k(aVar3.b()), 90.0f)))), h.g((float) 9.5d), h.g(0), h.g(6), null), a), aVar3.a(), a), h.g(24), h.g(16)), aVar3.k(), 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, E.a.c(i2, E.b).p(), mVar2, 390, 0, 65528);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Shadow_Preview_Margin(m mVar, int i) {
        m i2 = mVar.i(-1769512070);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1769512070, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Margin (Shadow.kt:249)");
            }
            float f = 16;
            F.L d = androidx.compose.foundation.layout.f.d(h.g(8), h.g(f), h.g(4), h.g(24));
            E1 a = t1.a();
            e.a aVar = e.a;
            e n = androidx.compose.foundation.layout.g.n(aVar, h.g(100), h.g(200));
            B a2 = F.l.a(F.c.a.b(), o0.e.a.g(), i2, 54);
            int a3 = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f2 = c.f(i2, n);
            g.a aVar2 = O0.g.E8;
            a a4 = aVar2.a();
            if (i2.k() == null) {
                b0.h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a4);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, a2, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a3))) {
                b.t(Integer.valueOf(a3));
                b.J(Integer.valueOf(a3), b2);
            }
            m2.e(b, f2, aVar2.f());
            o oVar = o.a;
            float f3 = 50;
            e n2 = androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.h(aVar, d), h.g(f3), h.g(f3));
            r0.a aVar3 = r0.b;
            long j = ColorStyle.Solid.constructor-impl(aVar3.a());
            float f4 = 0;
            float f5 = 5;
            float f6 = 20;
            float f7 = 2;
            F.f.a(androidx.compose.foundation.layout.f.i(A.g.f(androidx.compose.foundation.a.c(shadow(n2, new ShadowStyle(ColorStyle.Solid.box-impl(j), h.g(f6), h.g(f4), h.g(f5), null), a), aVar3.h(), a), h.g(f7), aVar3.b(), a), h.g(f)), i2, 0);
            e n3 = androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.h(aVar, d), h.g(f3), h.g(f3));
            long j2 = ColorStyle.Solid.constructor-impl(aVar3.a());
            F.f.a(androidx.compose.foundation.layout.f.i(A.g.f(androidx.compose.foundation.a.c(shadow(n3, new ShadowStyle(ColorStyle.Solid.box-impl(j2), h.g(f6), h.g(f4), h.g(f5), null), a), aVar3.h(), a), h.g(f7), aVar3.b(), a), h.g(f)), i2, 0);
            i2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Shadow_Preview_Square(m mVar, int i) {
        m i2 = mVar.i(-1204850263);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1204850263, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Square (Shadow.kt:123)");
            }
            E1 a = t1.a();
            e.a aVar = e.a;
            e m = androidx.compose.foundation.layout.g.m(aVar, h.g(200));
            B h = F.f.h(o0.e.a.e(), false);
            int a2 = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = c.f(i2, m);
            g.a aVar2 = O0.g.E8;
            a a3 = aVar2.a();
            if (i2.k() == null) {
                b0.h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a3);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            e m2 = androidx.compose.foundation.layout.g.m(aVar, h.g(100));
            r0.a aVar3 = r0.b;
            long j = ColorStyle.Solid.constructor-impl(aVar3.a());
            F.f.a(androidx.compose.foundation.a.c(shadow(m2, new ShadowStyle(ColorStyle.Solid.box-impl(j), h.g(20), h.g(10), h.g(5), null), a), aVar3.h(), a), i2, 0);
            i2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Shadow_Preview_SquareAlpha(m mVar, int i) {
        m i2 = mVar.i(1511945597);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1511945597, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_SquareAlpha (Shadow.kt:176)");
            }
            E1 a = t1.a();
            e.a aVar = e.a;
            e m = androidx.compose.foundation.layout.g.m(aVar, h.g(200));
            B h = F.f.h(o0.e.a.e(), false);
            int a2 = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = c.f(i2, m);
            g.a aVar2 = O0.g.E8;
            a a3 = aVar2.a();
            if (i2.k() == null) {
                b0.h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a3);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            e m2 = androidx.compose.foundation.layout.g.m(aVar, h.g(100));
            r0.a aVar3 = r0.b;
            long j = ColorStyle.Solid.constructor-impl(aVar3.a());
            F.f.a(androidx.compose.foundation.a.c(shadow(m2, new ShadowStyle(ColorStyle.Solid.box-impl(j), h.g(20), h.g(10), h.g(5), null), a), r0.q(aVar3.h(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), a), i2, 0);
            i2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$Shadow_Preview_Circle(m mVar, int i) {
        Shadow_Preview_Circle(mVar, i);
    }

    public static final /* synthetic */ void access$Shadow_Preview_CircleAlpha(m mVar, int i) {
        Shadow_Preview_CircleAlpha(mVar, i);
    }

    public static final /* synthetic */ void access$Shadow_Preview_Gradient_CustomShape(m mVar, int i) {
        Shadow_Preview_Gradient_CustomShape(mVar, i);
    }

    public static final /* synthetic */ void access$Shadow_Preview_Margin(m mVar, int i) {
        Shadow_Preview_Margin(mVar, i);
    }

    public static final /* synthetic */ void access$Shadow_Preview_Square(m mVar, int i) {
        Shadow_Preview_Square(mVar, i);
    }

    public static final /* synthetic */ void access$Shadow_Preview_SquareAlpha(m mVar, int i) {
        Shadow_Preview_SquareAlpha(mVar, i);
    }

    public static final /* synthetic */ m1 access$toPath-Xbl9iGQ(E1 e1, long j, n1.t tVar, d dVar, u0.f fVar) {
        return toPath-Xbl9iGQ(e1, j, tVar, dVar, fVar);
    }

    private static final void addOutline-0AR0LA0(m1 m1Var, i1 i1Var, long j) {
        if (i1Var instanceof i1.b) {
            m1.u(m1Var, ((i1.b) i1Var).b().t(j), (m1.b) null, 2, (Object) null);
        } else if (i1Var instanceof i1.c) {
            m1.h(m1Var, u0.k.f(((i1.c) i1Var).b(), j), (m1.b) null, 2, (Object) null);
        } else if (i1Var instanceof i1.a) {
            m1Var.m(((i1.a) i1Var).b(), j);
        }
    }

    public static final /* synthetic */ e shadow(e eVar, ShadowStyle shadow, E1 shape) {
        t.g(eVar, "<this>");
        t.g(shadow, "shadow");
        t.g(shape, "shape");
        return androidx.compose.ui.draw.a.b(eVar, new 1(shadow, shape));
    }

    private static final m1 toPath-Xbl9iGQ(E1 e1, long j, n1.t tVar, d dVar, u0.f fVar) {
        i1 i1Var = e1.createOutline-Pq9zytI(j, tVar, dVar);
        if (fVar == null) {
            m1 a = V.a();
            j1.a(a, i1Var);
            return a;
        }
        m1 a2 = V.a();
        addOutline-0AR0LA0(a2, i1Var, fVar.u());
        return a2;
    }

    public static /* synthetic */ m1 toPath-Xbl9iGQ$default(E1 e1, long j, n1.t tVar, d dVar, u0.f fVar, int i, Object obj) {
        if ((i & 8) != 0) {
            fVar = null;
        }
        return toPath-Xbl9iGQ(e1, j, tVar, dVar, fVar);
    }
}

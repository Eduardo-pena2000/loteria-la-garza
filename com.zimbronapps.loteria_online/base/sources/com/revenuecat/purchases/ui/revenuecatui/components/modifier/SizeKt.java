package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import Ca.A;
import Ca.I;
import Ca.o;
import F.f;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import d1.H;
import d1.L;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import n1.h;
import o0.e;
import v0.E1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class SizeKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Size $size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Size size, int i) {
            super(2);
            this.$size = size;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SizeKt.access$Size_Preview(this.$size, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SizeKt.access$Size_Preview_FillFill(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SizeKt.access$Size_Preview_FillFit(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SizeKt.access$Size_Preview_FitFill(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SizeKt.access$Size_Preview_FitFit(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SizeKt.access$Size_Preview_FixedFixed(mVar, g1.a(this.$$changed | 1));
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
            SizeKt.access$Size_Preview_HorizontalAlignment(mVar, g1.a(this.$$changed | 1));
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
            SizeKt.access$Size_Preview_VerticalAlignment(mVar, g1.a(this.$$changed | 1));
        }
    }

    private static final void Size_Preview(Size size, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(229743802);
        if ((i & 6) == 0) {
            i2 = (i3.U(size) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(229743802, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview (Size.kt:59)");
            }
            e.a aVar = e.a;
            e m = g.m(aVar, h.g(200));
            e.a aVar2 = o0.e.a;
            B h = f.h(aVar2.e(), false);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = c.f(i3, m);
            g.a aVar3 = O0.g.E8;
            a a2 = aVar3.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, h, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar3.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            androidx.compose.ui.e size$default = size$default(androidx.compose.foundation.a.d(aVar, r0.b.h(), (E1) null, 2, (Object) null), size, null, null, 6, null);
            B h2 = f.h(aVar2.e(), false);
            int a3 = b0.h.a(i3, 0);
            b0.I r2 = i3.r();
            androidx.compose.ui.e f2 = c.f(i3, size$default);
            a a4 = aVar3.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a4);
            } else {
                i3.s();
            }
            m b3 = m2.b(i3);
            m2.e(b3, h2, aVar3.e());
            m2.e(b3, r2, aVar3.g());
            p b4 = aVar3.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a3))) {
                b3.t(Integer.valueOf(a3));
                b3.J(Integer.valueOf(a3), b4);
            }
            m2.e(b3, f2, aVar3.f());
            mVar2 = i3;
            m0.b("Hello world!", (androidx.compose.ui.e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar2, 6, 0, 131070);
            mVar2.v();
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(size, i));
        }
    }

    private static final void Size_Preview_FillFill(m mVar, int i) {
        m i2 = mVar.i(-1104053776);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1104053776, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FillFill (Size.kt:85)");
            }
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            Size_Preview(new Size(fill, fill), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void Size_Preview_FillFit(m mVar, int i) {
        m i2 = mVar.i(1057098538);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1057098538, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FillFit (Size.kt:91)");
            }
            Size_Preview(new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void Size_Preview_FitFill(m mVar, int i) {
        m i2 = mVar.i(464684496);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(464684496, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FitFill (Size.kt:97)");
            }
            Size_Preview(new Size(SizeConstraint.Fit.INSTANCE, SizeConstraint.Fill.INSTANCE), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void Size_Preview_FitFit(m mVar, int i) {
        m i2 = mVar.i(692061002);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(692061002, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FitFit (Size.kt:79)");
            }
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size_Preview(new Size(fit, fit), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void Size_Preview_FixedFixed(m mVar, int i) {
        m i2 = mVar.i(-729326102);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-729326102, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FixedFixed (Size.kt:103)");
            }
            Size_Preview(new Size(new SizeConstraint.Fixed(A.b(50), (kotlin.jvm.internal.k) null), new SizeConstraint.Fixed(A.b(50), (kotlin.jvm.internal.k) null)), i2, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void Size_Preview_HorizontalAlignment(m mVar, int i) {
        m mVar2;
        m i2 = mVar.i(-1277946437);
        if (i == 0 && i2.j()) {
            i2.M();
            mVar2 = i2;
        } else {
            if (w.L()) {
                w.U(-1277946437, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_HorizontalAlignment (Size.kt:109)");
            }
            e.a aVar = androidx.compose.ui.e.a;
            androidx.compose.ui.e m = androidx.compose.foundation.layout.g.m(aVar, h.g(200));
            e.a aVar2 = o0.e.a;
            B h = f.h(aVar2.e(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            androidx.compose.ui.e f = c.f(i2, m);
            g.a aVar3 = O0.g.E8;
            a a2 = aVar3.a();
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
            m2.e(b, h, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar3.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            androidx.compose.ui.e q = androidx.compose.foundation.layout.g.q(androidx.compose.foundation.a.d(aVar, r0.b.h(), (E1) null, 2, (Object) null), h.g(150));
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            androidx.compose.ui.e size$default = size$default(q, new Size(fit, fit), aVar2.j(), null, 4, null);
            B h2 = f.h(aVar2.e(), false);
            int a3 = b0.h.a(i2, 0);
            b0.I r2 = i2.r();
            androidx.compose.ui.e f2 = c.f(i2, size$default);
            a a4 = aVar3.a();
            if (i2.k() == null) {
                b0.h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a4);
            } else {
                i2.s();
            }
            m b3 = m2.b(i2);
            m2.e(b3, h2, aVar3.e());
            m2.e(b3, r2, aVar3.g());
            p b4 = aVar3.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a3))) {
                b3.t(Integer.valueOf(a3));
                b3.J(Integer.valueOf(a3), b4);
            }
            m2.e(b3, f2, aVar3.f());
            mVar2 = i2;
            m0.b("Hello world!", (androidx.compose.ui.e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar2, 6, 0, 131070);
            mVar2.v();
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

    private static final void Size_Preview_VerticalAlignment(m mVar, int i) {
        m mVar2;
        m i2 = mVar.i(450739689);
        if (i == 0 && i2.j()) {
            i2.M();
            mVar2 = i2;
        } else {
            if (w.L()) {
                w.U(450739689, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_VerticalAlignment (Size.kt:132)");
            }
            e.a aVar = androidx.compose.ui.e.a;
            androidx.compose.ui.e m = androidx.compose.foundation.layout.g.m(aVar, h.g(200));
            e.a aVar2 = o0.e.a;
            B h = f.h(aVar2.e(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            androidx.compose.ui.e f = c.f(i2, m);
            g.a aVar3 = O0.g.E8;
            a a2 = aVar3.a();
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
            m2.e(b, h, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar3.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            androidx.compose.ui.e l = androidx.compose.foundation.layout.g.l(androidx.compose.foundation.a.d(aVar, r0.b.h(), (E1) null, 2, (Object) null), h.g(150));
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            androidx.compose.ui.e size$default = size$default(l, new Size(fit, fit), null, aVar2.a(), 2, null);
            B h2 = f.h(aVar2.e(), false);
            int a3 = b0.h.a(i2, 0);
            b0.I r2 = i2.r();
            androidx.compose.ui.e f2 = c.f(i2, size$default);
            a a4 = aVar3.a();
            if (i2.k() == null) {
                b0.h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a4);
            } else {
                i2.s();
            }
            m b3 = m2.b(i2);
            m2.e(b3, h2, aVar3.e());
            m2.e(b3, r2, aVar3.g());
            p b4 = aVar3.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a3))) {
                b3.t(Integer.valueOf(a3));
                b3.J(Integer.valueOf(a3), b4);
            }
            m2.e(b3, f2, aVar3.f());
            mVar2 = i2;
            m0.b("Hello world!", (androidx.compose.ui.e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar2, 6, 0, 131070);
            mVar2.v();
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = mVar2.l();
        if (l2 != null) {
            l2.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$Size_Preview(Size size, m mVar, int i) {
        Size_Preview(size, mVar, i);
    }

    public static final /* synthetic */ void access$Size_Preview_FillFill(m mVar, int i) {
        Size_Preview_FillFill(mVar, i);
    }

    public static final /* synthetic */ void access$Size_Preview_FillFit(m mVar, int i) {
        Size_Preview_FillFit(mVar, i);
    }

    public static final /* synthetic */ void access$Size_Preview_FitFill(m mVar, int i) {
        Size_Preview_FitFill(mVar, i);
    }

    public static final /* synthetic */ void access$Size_Preview_FitFit(m mVar, int i) {
        Size_Preview_FitFit(mVar, i);
    }

    public static final /* synthetic */ void access$Size_Preview_FixedFixed(m mVar, int i) {
        Size_Preview_FixedFixed(mVar, i);
    }

    public static final /* synthetic */ void access$Size_Preview_HorizontalAlignment(m mVar, int i) {
        Size_Preview_HorizontalAlignment(mVar, i);
    }

    public static final /* synthetic */ void access$Size_Preview_VerticalAlignment(m mVar, int i) {
        Size_Preview_VerticalAlignment(mVar, i);
    }

    public static final /* synthetic */ androidx.compose.ui.e size(androidx.compose.ui.e eVar, Size size, e.b bVar, e.c cVar) {
        androidx.compose.ui.e v;
        androidx.compose.ui.e i;
        t.g(eVar, "<this>");
        t.g(size, "size");
        SizeConstraint.Fixed width = size.getWidth();
        if (width instanceof SizeConstraint.Fit) {
            e.a aVar = androidx.compose.ui.e.a;
            if (bVar == null) {
                bVar = o0.e.a.g();
            }
            v = androidx.compose.foundation.layout.g.D(aVar, bVar, false, 2, (Object) null);
        } else if (width instanceof SizeConstraint.Fill) {
            v = androidx.compose.foundation.layout.g.h(androidx.compose.ui.e.a, 0.0f, 1, (Object) null);
        } else {
            if (!(width instanceof SizeConstraint.Fixed)) {
                throw new o();
            }
            v = androidx.compose.foundation.layout.g.v(androidx.compose.ui.e.a, h.g(width.getValue-pVg5ArA()));
        }
        SizeConstraint.Fixed height = size.getHeight();
        if (height instanceof SizeConstraint.Fit) {
            e.a aVar2 = androidx.compose.ui.e.a;
            if (cVar == null) {
                cVar = o0.e.a.i();
            }
            i = androidx.compose.foundation.layout.g.z(aVar2, cVar, false, 2, (Object) null);
        } else if (height instanceof SizeConstraint.Fill) {
            i = androidx.compose.foundation.layout.g.d(androidx.compose.ui.e.a, 0.0f, 1, (Object) null);
        } else {
            if (!(height instanceof SizeConstraint.Fixed)) {
                throw new o();
            }
            i = androidx.compose.foundation.layout.g.i(androidx.compose.ui.e.a, h.g(height.getValue-pVg5ArA()));
        }
        return eVar.then(v).then(i);
    }

    public static /* synthetic */ androidx.compose.ui.e size$default(androidx.compose.ui.e eVar, Size size, e.b bVar, e.c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            cVar = null;
        }
        return size(eVar, size, bVar, cVar);
    }
}

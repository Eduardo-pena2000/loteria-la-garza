package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Ca.I;
import Da.v;
import F.L;
import F.f;
import F.n;
import J.C;
import M0.B;
import O0.g;
import Qa.l;
import Qa.p;
import androidx.compose.foundation.a;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.U1;
import b0.b0;
import b0.g1;
import b0.h;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o0.e;
import v0.E1;
import v0.r0;
import v0.s0;
import z.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class CarouselComponentViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ CarouselComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CarouselComponentStyle carouselComponentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, int i, int i2) {
            super(2);
            this.$style = carouselComponentStyle;
            this.$state = components;
            this.$clickHandler = pVar;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CarouselComponentViewKt.CarouselComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 7 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ CarouselComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 7(CarouselComponentStyle carouselComponentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, int i, int i2) {
            super(2);
            this.$style = carouselComponentStyle;
            this.$state = components;
            this.$clickHandler = pVar;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CarouselComponentViewKt.CarouselComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
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
            CarouselComponentViewKt.access$CarouselComponentView_Loop_Preview(mVar, g1.a(this.$$changed | 1));
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
            CarouselComponentViewKt.access$CarouselComponentView_Preview(mVar, g1.a(this.$$changed | 1));
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
            CarouselComponentViewKt.access$CarouselComponentView_Top_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CarouselComponent.AutoAdvancePages $autoAdvance;
        final /* synthetic */ int $pageCount;
        final /* synthetic */ C $pagerState;
        final /* synthetic */ boolean $shouldLoop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CarouselComponent.AutoAdvancePages autoAdvancePages, C c, boolean z, int i, int i2) {
            super(2);
            this.$autoAdvance = autoAdvancePages;
            this.$pagerState = c;
            this.$shouldLoop = z;
            this.$pageCount = i;
            this.$$changed = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CarouselComponentViewKt.access$EnableAutoAdvance(this.$autoAdvance, this.$pagerState, this.$shouldLoop, this.$pageCount, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CarouselComponentStyle.PageControlStyles $pageControl;
        final /* synthetic */ int $pageCount;
        final /* synthetic */ int $pageIndex;
        final /* synthetic */ C $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(C c, int i, int i2, CarouselComponentStyle.PageControlStyles pageControlStyles, int i3) {
            super(2);
            this.$pagerState = c;
            this.$pageIndex = i;
            this.$pageCount = i2;
            this.$pageControl = pageControlStyles;
            this.$$changed = i3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CarouselComponentViewKt.access$Indicator(this.$pagerState, this.$pageIndex, this.$pageCount, this.$pageControl, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 5 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ CarouselComponentStyle.PageControlStyles $pageControl;
        final /* synthetic */ int $pageCount;
        final /* synthetic */ C $pagerState;
        final /* synthetic */ n $this_PagerIndicator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(n nVar, CarouselComponentStyle.PageControlStyles pageControlStyles, int i, C c, e eVar, int i2, int i3) {
            super(2);
            this.$this_PagerIndicator = nVar;
            this.$pageControl = pageControlStyles;
            this.$pageCount = i;
            this.$pagerState = c;
            this.$modifier = eVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CarouselComponentViewKt.access$PagerIndicator(this.$this_PagerIndicator, this.$pageControl, this.$pageCount, this.$pagerState, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void CarouselComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle r25, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r26, Qa.p r27, androidx.compose.ui.e r28, b0.m r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt.CarouselComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, Qa.p, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void CarouselComponentView_Loop_Preview(m mVar, int i) {
        m i2 = mVar.i(-172536871);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-172536871, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentView_Loop_Preview (CarouselComponentView.kt:354)");
            }
            e d = a.d(e.a, r0.b.k(), (E1) null, 2, (Object) null);
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(i2, 0);
            b0.I r = i2.r();
            e f = c.f(i2, d);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
            if (i2.k() == null) {
                h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a2);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            CarouselComponentView(previewCarouselComponentStyle-2XaYeUA$default(null, 0, null, false, null, 0.0f, 0.0f, 0L, null, null, null, null, null, null, true, new CarouselComponent.AutoAdvancePages(1000, 500, CarouselComponent.AutoAdvancePages.TransitionType.FADE), 16383, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new CarouselComponentViewKt$CarouselComponentView_Loop_Preview$1$1(null), null, i2, 384, 8);
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

    private static final void CarouselComponentView_Preview(m mVar, int i) {
        m i2 = mVar.i(697064564);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(697064564, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentView_Preview (CarouselComponentView.kt:328)");
            }
            e d = a.d(e.a, r0.b.k(), (E1) null, 2, (Object) null);
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(i2, 0);
            b0.I r = i2.r();
            e f = c.f(i2, d);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
            if (i2.k() == null) {
                h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a2);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            CarouselComponentView(previewCarouselComponentStyle-2XaYeUA$default(null, 0, null, false, null, 0.0f, 0.0f, 0L, null, null, null, null, null, null, false, null, 65535, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new CarouselComponentViewKt$CarouselComponentView_Preview$1$1(null), null, i2, 384, 8);
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

    private static final void CarouselComponentView_Top_Preview(m mVar, int i) {
        m i2 = mVar.i(897820094);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(897820094, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentView_Top_Preview (CarouselComponentView.kt:340)");
            }
            e d = a.d(e.a, r0.b.k(), (E1) null, 2, (Object) null);
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(i2, 0);
            b0.I r = i2.r();
            e f = c.f(i2, d);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
            if (i2.k() == null) {
                h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a2);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            CarouselComponentView(previewCarouselComponentStyle-2XaYeUA$default(null, 0, null, false, null, 0.0f, 0.0f, 0L, null, null, null, null, null, previewPageControl(CarouselComponent.PageControl.Position.TOP), false, null, 57343, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new CarouselComponentViewKt$CarouselComponentView_Top_Preview$1$1(null), null, i2, 384, 8);
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

    private static final void EnableAutoAdvance(CarouselComponent.AutoAdvancePages autoAdvancePages, C c, boolean z, int i, m mVar, int i2) {
        int i3;
        m i4 = mVar.i(-845596149);
        if ((i2 & 6) == 0) {
            i3 = (i4.E(autoAdvancePages) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= i4.U(c) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= i4.a(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= i4.d(i) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && i4.j()) {
            i4.M();
        } else {
            if (w.L()) {
                w.U(-845596149, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.EnableAutoAdvance (CarouselComponentView.kt:289)");
            }
            I i5 = I.a;
            i4.V(906902516);
            boolean E = i4.E(autoAdvancePages) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object C = i4.C();
            if (E || C == m.a.a()) {
                C = new CarouselComponentViewKt$EnableAutoAdvance$1$1(autoAdvancePages, c, z, i, null);
                i4.t(C);
            }
            i4.P();
            b0.d(i5, (p) C, i4, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new 2(autoAdvancePages, c, z, i, i2));
        }
    }

    private static final void Indicator(C c, int i, int i2, CarouselComponentStyle.PageControlStyles pageControlStyles, m mVar, int i3) {
        int i4;
        m i5 = mVar.i(-532758904);
        if ((i3 & 6) == 0) {
            i4 = (i5.U(c) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= i5.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= i5.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= i5.U(pageControlStyles) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && i5.j()) {
            i5.M();
        } else {
            if (w.L()) {
                w.U(-532758904, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.Indicator (CarouselComponentView.kt:193)");
            }
            i5.V(-106660265);
            Object C = i5.C();
            m.a aVar = m.a;
            if (C == aVar.a()) {
                C = U1.c(new CarouselComponentViewKt$Indicator$progress$2$1(c, i2, i));
                i5.t(C);
            }
            h2 h2Var = (h2) C;
            i5.P();
            i5.V(-106632266);
            Object C2 = i5.C();
            if (C2 == aVar.a()) {
                C2 = U1.c(new CarouselComponentViewKt$Indicator$targetWidth$2$1(pageControlStyles, h2Var));
                i5.t(C2);
            }
            h2 h2Var2 = (h2) C2;
            i5.P();
            i5.V(-106625128);
            Object C3 = i5.C();
            if (C3 == aVar.a()) {
                C3 = U1.c(new CarouselComponentViewKt$Indicator$targetHeight$2$1(pageControlStyles, h2Var));
                i5.t(C3);
            }
            h2 h2Var3 = (h2) C3;
            i5.P();
            i5.V(-106617710);
            Object C4 = i5.C();
            if (C4 == aVar.a()) {
                C4 = U1.c(new CarouselComponentViewKt$Indicator$targetStrokeWidth$2$1(pageControlStyles, h2Var));
                i5.t(C4);
            }
            h2 h2Var4 = (h2) C4;
            i5.P();
            h2 c2 = z.c.c(Indicator$lambda$21(h2Var2), (i) null, (String) null, (l) null, i5, 0, 14);
            h2 c3 = z.c.c(Indicator$lambda$23(h2Var3), (i) null, (String) null, (l) null, i5, 0, 14);
            ColorStyle forCurrentTheme = ColorStyleKt.getForCurrentTheme(pageControlStyles.getDefault().getColor(), i5, 0);
            ColorStyle.Solid solid = forCurrentTheme instanceof ColorStyle.Solid ? (ColorStyle.Solid) forCurrentTheme : null;
            long j = solid != null ? solid.unbox-impl() : r0.b.i();
            ColorStyle forCurrentTheme2 = ColorStyleKt.getForCurrentTheme(pageControlStyles.getActive().getColor(), i5, 0);
            ColorStyle.Solid solid2 = forCurrentTheme2 instanceof ColorStyle.Solid ? (ColorStyle.Solid) forCurrentTheme2 : null;
            long i6 = s0.i(j, solid2 != null ? solid2.unbox-impl() : r0.b.i(), Indicator$lambda$19(h2Var));
            boolean z = ((pageControlStyles.getDefault().getStrokeColor() == null && pageControlStyles.getActive().getStrokeColor() == null) || (pageControlStyles.getDefault().getStrokeWidth-lTKBWiU() == null && pageControlStyles.getActive().getStrokeWidth-lTKBWiU() == null)) ? false : true;
            ColorStyles strokeColor = pageControlStyles.getDefault().getStrokeColor();
            i5.V(-106588769);
            ColorStyle forCurrentTheme3 = strokeColor == null ? null : ColorStyleKt.getForCurrentTheme(strokeColor, i5, 0);
            i5.P();
            ColorStyle.Solid solid3 = forCurrentTheme3 instanceof ColorStyle.Solid ? (ColorStyle.Solid) forCurrentTheme3 : null;
            long j2 = solid3 != null ? solid3.unbox-impl() : r0.b.i();
            ColorStyles strokeColor2 = pageControlStyles.getActive().getStrokeColor();
            i5.V(-106585313);
            ColorStyle forCurrentTheme4 = strokeColor2 == null ? null : ColorStyleKt.getForCurrentTheme(strokeColor2, i5, 0);
            i5.P();
            ColorStyle.Solid solid4 = forCurrentTheme4 instanceof ColorStyle.Solid ? (ColorStyle.Solid) forCurrentTheme4 : null;
            long i7 = s0.i(j2, solid4 != null ? solid4.unbox-impl() : r0.b.i(), Indicator$lambda$19(h2Var));
            boolean z2 = z;
            h2 c4 = z.c.c(Indicator$lambda$25(h2Var4), (i) null, (String) null, (l) null, i5, 0, 14);
            e s = androidx.compose.foundation.layout.g.s(a.d(s0.h.a(androidx.compose.foundation.layout.f.k(e.a, n1.h.g(pageControlStyles.getSpacing-D9Ej5fM() / 2), 0.0f, 2, (Object) null), ShapeKt.toShape((Shape) Shape.Pill.INSTANCE)), i6, (E1) null, 2, (Object) null), Indicator$lambda$26(c2), Indicator$lambda$27(c3));
            i5.V(-106571074);
            boolean U = i5.U(c4) | i5.e(i7);
            Object C5 = i5.C();
            if (U || C5 == aVar.a()) {
                C5 = new CarouselComponentViewKt$Indicator$1$1(i7, c4);
                i5.t(C5);
            }
            i5.P();
            f.a(ModifierExtensionsKt.conditional(s, z2, (l) C5), i5, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i5.l();
        if (l != null) {
            l.a(new 2(c, i, i2, pageControlStyles, i3));
        }
    }

    private static final float Indicator$lambda$19(h2 h2Var) {
        return ((Number) h2Var.getValue()).floatValue();
    }

    private static final float Indicator$lambda$21(h2 h2Var) {
        return ((n1.h) h2Var.getValue()).m();
    }

    private static final float Indicator$lambda$23(h2 h2Var) {
        return ((n1.h) h2Var.getValue()).m();
    }

    private static final float Indicator$lambda$25(h2 h2Var) {
        return ((n1.h) h2Var.getValue()).m();
    }

    private static final float Indicator$lambda$26(h2 h2Var) {
        return ((n1.h) h2Var.getValue()).m();
    }

    private static final float Indicator$lambda$27(h2 h2Var) {
        return ((n1.h) h2Var.getValue()).m();
    }

    private static final float Indicator$lambda$28(h2 h2Var) {
        return ((n1.h) h2Var.getValue()).m();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023f A[LOOP:0: B:70:0x023d->B:71:0x023f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void PagerIndicator(F.n r16, com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle.PageControlStyles r17, int r18, J.C r19, androidx.compose.ui.e r20, b0.m r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt.PagerIndicator(F.n, com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle$PageControlStyles, int, J.C, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final E1 PagerIndicator$lambda$12(h2 h2Var) {
        return (E1) h2Var.getValue();
    }

    public static final /* synthetic */ void access$CarouselComponentView_Loop_Preview(m mVar, int i) {
        CarouselComponentView_Loop_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$CarouselComponentView_Preview(m mVar, int i) {
        CarouselComponentView_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$CarouselComponentView_Top_Preview(m mVar, int i) {
        CarouselComponentView_Top_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$EnableAutoAdvance(CarouselComponent.AutoAdvancePages autoAdvancePages, C c, boolean z, int i, m mVar, int i2) {
        EnableAutoAdvance(autoAdvancePages, c, z, i, mVar, i2);
    }

    public static final /* synthetic */ void access$Indicator(C c, int i, int i2, CarouselComponentStyle.PageControlStyles pageControlStyles, m mVar, int i3) {
        Indicator(c, i, i2, pageControlStyles, mVar, i3);
    }

    public static final /* synthetic */ float access$Indicator$lambda$19(h2 h2Var) {
        return Indicator$lambda$19(h2Var);
    }

    public static final /* synthetic */ float access$Indicator$lambda$28(h2 h2Var) {
        return Indicator$lambda$28(h2Var);
    }

    public static final /* synthetic */ void access$PagerIndicator(n nVar, CarouselComponentStyle.PageControlStyles pageControlStyles, int i, C c, e eVar, m mVar, int i2, int i3) {
        PagerIndicator(nVar, pageControlStyles, i, c, eVar, mVar, i2, i3);
    }

    public static final /* synthetic */ E1 access$PagerIndicator$lambda$12(h2 h2Var) {
        return PagerIndicator$lambda$12(h2Var);
    }

    private static final int getInitialPage(CarouselComponentState carouselComponentState) {
        if (!carouselComponentState.getLoop()) {
            return carouselComponentState.getInitialPageIndex();
        }
        int i = 1073741823;
        while (i % carouselComponentState.getPages().size() != carouselComponentState.getInitialPageIndex()) {
            i++;
        }
        return i;
    }

    private static final CarouselComponentStyle previewCarouselComponentStyle-2XaYeUA(List list, int i, e.c cVar, boolean z, Size size, float f, float f2, long j, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, CarouselComponentStyle.PageControlStyles pageControlStyles, boolean z2, CarouselComponent.AutoAdvancePages autoAdvancePages) {
        return new CarouselComponentStyle(list, i, cVar, z, size, f, f2, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(j)), null, 2, null))), l, l2, shape, borderStyles, shadowStyles, pageControlStyles, z2, autoAdvancePages, null, null, null, null, v.n(), 655360, null);
    }

    public static /* synthetic */ CarouselComponentStyle previewCarouselComponentStyle-2XaYeUA$default(List list, int i, e.c cVar, boolean z, Size size, float f, float f2, long j, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, CarouselComponentStyle.PageControlStyles pageControlStyles, boolean z2, CarouselComponent.AutoAdvancePages autoAdvancePages, int i2, Object obj) {
        Size size2;
        L l3;
        L l4;
        Shape shape2;
        BorderStyles borderStyles2;
        CarouselComponent.AutoAdvancePages autoAdvancePages2;
        CarouselComponentStyle.PageControlStyles pageControlStyles2;
        List previewPages = (i2 & 1) != 0 ? previewPages() : list;
        int i3 = (i2 & 2) != 0 ? 0 : i;
        e.c i4 = (i2 & 4) != 0 ? o0.e.a.i() : cVar;
        boolean z3 = (i2 & 8) != 0 ? true : z;
        if ((i2 & 16) != 0) {
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            size2 = new Size(fit, fit);
        } else {
            size2 = size;
        }
        float g = (i2 & 32) != 0 ? n1.h.g(20) : f;
        float g2 = (i2 & 64) != 0 ? n1.h.g(8) : f2;
        long g3 = (i2 & 128) != 0 ? r0.b.g() : j;
        L a = (i2 & 256) != 0 ? androidx.compose.foundation.layout.f.a(n1.h.g(0)) : l;
        L c = (i2 & 512) != 0 ? androidx.compose.foundation.layout.f.c(0.0f, n1.h.g(16), 1, (Object) null) : l2;
        Shape rectangle = (i2 & 1024) != 0 ? new Shape.Rectangle((CornerRadiuses) null, 1, (k) null) : shape;
        if ((i2 & 2048) != 0) {
            shape2 = rectangle;
            l3 = a;
            l4 = c;
            borderStyles2 = new BorderStyles(n1.h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.b())), null, 2, null), null);
        } else {
            l3 = a;
            l4 = c;
            shape2 = rectangle;
            borderStyles2 = borderStyles;
        }
        ShadowStyles shadowStyles2 = (i2 & 4096) != 0 ? new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null), n1.h.g(5), n1.h.g(0), n1.h.g(3), null) : shadowStyles;
        if ((i2 & 8192) != 0) {
            autoAdvancePages2 = null;
            pageControlStyles2 = previewPageControl$default(null, 1, null);
        } else {
            autoAdvancePages2 = null;
            pageControlStyles2 = pageControlStyles;
        }
        boolean z4 = (i2 & 16384) != 0 ? false : z2;
        if ((i2 & 32768) == 0) {
            autoAdvancePages2 = autoAdvancePages;
        }
        return previewCarouselComponentStyle-2XaYeUA(previewPages, i3, i4, z3, size2, g, g2, g3, l3, l4, shape2, borderStyles2, shadowStyles2, pageControlStyles2, z4, autoAdvancePages2);
    }

    private static final StackComponentStyle previewPage-ecKwGiE(String str, long j, int i) {
        return new StackComponentStyle(Da.u.e(PreviewHelpersKt.previewTextComponentStyle$default(str, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, 65534, null)), new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.CENTER), true, new Size(SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fixed(i, (k) null)), n1.h.g(8), BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(j)), null, 2, null))), androidx.compose.foundation.layout.f.c(0.0f, n1.h.g(16), 1, (Object) null), androidx.compose.foundation.layout.f.a(n1.h.g(0)), new Shape.Rectangle((CornerRadiuses) null, 1, (k) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null);
    }

    private static final CarouselComponentStyle.PageControlStyles previewPageControl(CarouselComponent.PageControl.Position position) {
        float f = 4;
        float g = n1.h.g(f);
        float f2 = 8;
        L a = androidx.compose.foundation.layout.f.a(n1.h.g(f2));
        L a2 = androidx.compose.foundation.layout.f.a(n1.h.g(f2));
        r0.a aVar = r0.b;
        return new CarouselComponentStyle.PageControlStyles(position, g, a, a2, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.f())), null, 2, null), Shape.Pill.INSTANCE, new BorderStyles(n1.h.g(f), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.a())), null, 2, null), n1.h.g(20), n1.h.g(f2), n1.h.g(f2), null), new CarouselComponentStyle.IndicatorStyles(n1.h.g(14), n1.h.g(10), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), null, 2, null), n1.h.d(n1.h.g(2)), null), new CarouselComponentStyle.IndicatorStyles(n1.h.g(f2), n1.h.g(f2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.e())), null, 2, null), null, null, null), null);
    }

    public static /* synthetic */ CarouselComponentStyle.PageControlStyles previewPageControl$default(CarouselComponent.PageControl.Position position, int i, Object obj) {
        if ((i & 1) != 0) {
            position = CarouselComponent.PageControl.Position.BOTTOM;
        }
        return previewPageControl(position);
    }

    private static final List previewPages() {
        r0.a aVar = r0.b;
        return v.q(previewPage-ecKwGiE("Page 1", aVar.h(), 200), previewPage-ecKwGiE("Page 2", aVar.f(), 100), previewPage-ecKwGiE("Page 3", aVar.b(), 300), previewPage-ecKwGiE("Page 4", aVar.l(), 200));
    }
}

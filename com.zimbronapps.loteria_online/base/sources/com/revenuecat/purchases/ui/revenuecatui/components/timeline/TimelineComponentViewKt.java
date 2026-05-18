package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.I;
import Da.v;
import F.f;
import M.i;
import M0.B;
import O0.g;
import Qa.l;
import Qa.p;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.a;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ImagePreviewsKt;
import d1.H;
import d1.L;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import o0.e;
import v0.E1;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class TimelineComponentViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TimelineComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(TimelineComponentStyle timelineComponentStyle, PaywallState.Loaded.Components components, e eVar, int i, int i2) {
            super(2);
            this.$style = timelineComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TimelineComponentViewKt.TimelineComponentView(this.$style, this.$state, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TimelineComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(TimelineComponentStyle timelineComponentStyle, PaywallState.Loaded.Components components, e eVar, int i, int i2) {
            super(2);
            this.$style = timelineComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TimelineComponentViewKt.TimelineComponentView(this.$style, this.$state, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
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
            TimelineComponentViewKt.access$TimelineComponentView_Align_TitleAndDescription_Preview(mVar, g1.a(this.$$changed | 1));
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
            TimelineComponentViewKt.access$TimelineComponentView_Align_Title_Preview(mVar, g1.a(this.$$changed | 1));
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
            TimelineComponentViewKt.access$TimelineComponentView_Connector_Margin_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ Size $size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Size size) {
            super(2);
            this.$size = size;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-111498279, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_Size_Preview.<anonymous> (TimelineComponentView.kt:272)");
            }
            e.a aVar = e.a;
            r0.a aVar2 = r0.b;
            e d = a.d(aVar, aVar2.k(), (E1) null, 2, (Object) null);
            Size size = this.$size;
            e.a aVar3 = o0.e.a;
            B h = f.h(aVar3.o(), false);
            int a = h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = c.f(mVar, d);
            g.a aVar4 = g.E8;
            Qa.a a2 = aVar4.a();
            if (mVar.k() == null) {
                h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar4.e());
            m2.e(b, r, aVar4.g());
            p b2 = aVar4.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar4.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            TimelineComponentViewKt.TimelineComponentView(TimelineComponentViewKt.access$previewStyle(0, 0, 0, null, false, size, null, null, null, mVar, 0, 479), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            float f2 = 16;
            m0.b("timeline = w:" + size.getWidth().getClass().getSimpleName() + " x h:" + size.getHeight().getClass().getSimpleName(), androidx.compose.foundation.layout.f.i(A.g.f(a.c(s0.p.b(cVar.a(aVar, aVar3.e()), n1.h.g(f2), i.a(50), false, 0L, 0L, 28, (Object) null), aVar2.k(), i.a(50)), n1.h.g(2), aVar2.a(), i.a(50)), n1.h.g(f2)), 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131068);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

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
            TimelineComponentViewKt.access$TimelineComponentView_Size_Preview(this.$size, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ SizeConstraint $textWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(SizeConstraint sizeConstraint) {
            super(2);
            this.$textWidth = sizeConstraint;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-408857751, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_TextSize_Preview.<anonymous> (TimelineComponentView.kt:307)");
            }
            e.a aVar = androidx.compose.ui.e.a;
            r0.a aVar2 = r0.b;
            androidx.compose.ui.e d = a.d(aVar, aVar2.k(), (E1) null, 2, (Object) null);
            SizeConstraint sizeConstraint = this.$textWidth;
            e.a aVar3 = o0.e.a;
            B h = f.h(aVar3.o(), false);
            int a = h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = c.f(mVar, d);
            g.a aVar4 = g.E8;
            Qa.a a2 = aVar4.a();
            if (mVar.k() == null) {
                h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar4.e());
            m2.e(b, r, aVar4.g());
            p b2 = aVar4.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar4.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit, fit);
            float f2 = 8;
            IconComponentStyle iconComponentStyle = TimelineComponentViewKt.access$previewIcon-6xbWgXg(0L, 0L, new Size(new SizeConstraint.Fixed(39, (kotlin.jvm.internal.k) null), new SizeConstraint.Fixed(39, (kotlin.jvm.internal.k) null)), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), mVar, 3456, 3);
            FontWeight fontWeight = FontWeight.MEDIUM;
            HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
            TimelineComponentViewKt.TimelineComponentView(TimelineComponentViewKt.access$previewStyle(0, 0, 0, null, false, size, null, null, v.q(TimelineComponentViewKt.access$previewItem(PreviewHelpersKt.previewTextComponentStyle$default("Today", null, 0, fontWeight, null, horizontalAlignment, horizontalAlignment, null, false, new Size(sizeConstraint, fit), null, null, null, null, null, null, 64918, null), PreviewHelpersKt.previewTextComponentStyle$default("Description of what you get today if you subscribe with multiple lines to check wrapping", null, 0, null, null, horizontalAlignment, horizontalAlignment, null, false, new Size(sizeConstraint, fit), null, null, null, null, null, null, 64926, null), iconComponentStyle, null, mVar, 0, 8), TimelineComponentViewKt.access$previewItem(PreviewHelpersKt.previewTextComponentStyle$default("Day X", null, 0, fontWeight, null, horizontalAlignment, horizontalAlignment, null, false, new Size(sizeConstraint, fit), null, null, null, null, null, null, 64918, null), PreviewHelpersKt.previewTextComponentStyle$default("We'll remind you that your trial is ending soon", null, 0, null, null, horizontalAlignment, horizontalAlignment, null, false, new Size(sizeConstraint, fit), null, null, null, null, null, null, 64926, null), TimelineComponentViewKt.access$previewIcon-6xbWgXg(0L, 0L, new Size(new SizeConstraint.Fixed(39, (kotlin.jvm.internal.k) null), new SizeConstraint.Fixed(39, (kotlin.jvm.internal.k) null)), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), mVar, 3456, 3), null, mVar, 0, 8), TimelineComponentViewKt.access$previewItem(PreviewHelpersKt.previewTextComponentStyle$default("Day Y", null, 0, fontWeight, null, horizontalAlignment, horizontalAlignment, null, false, new Size(sizeConstraint, fit), null, null, null, null, null, null, 64918, null), PreviewHelpersKt.previewTextComponentStyle$default("You'll be charged. You can cancel anytime before.", null, 0, null, null, horizontalAlignment, horizontalAlignment, null, false, new Size(sizeConstraint, fit), null, null, null, null, null, null, 64926, null), TimelineComponentViewKt.access$previewIcon-6xbWgXg(0L, 0L, new Size(new SizeConstraint.Fixed(39, (kotlin.jvm.internal.k) null), new SizeConstraint.Fixed(39, (kotlin.jvm.internal.k) null)), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), mVar, 3456, 3), null, mVar, 3072, 0)), mVar, 196608, 223), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            float f3 = 16;
            m0.b("text = w:" + sizeConstraint.getClass().getSimpleName() + " x h:Fit", androidx.compose.foundation.layout.f.i(A.g.f(a.c(s0.p.b(cVar.a(aVar, aVar3.e()), n1.h.g(f3), i.a(50), false, 0L, 0L, 28, (Object) null), aVar2.k(), i.a(50)), n1.h.g(2), aVar2.a(), i.a(50)), n1.h.g(f3)), 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131068);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ SizeConstraint $textWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(SizeConstraint sizeConstraint, int i) {
            super(2);
            this.$textWidth = sizeConstraint;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TimelineComponentViewKt.access$TimelineComponentView_TextSize_Preview(this.$textWidth, mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007d  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TimelineComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle r20, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r21, androidx.compose.ui.e r22, b0.m r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt.TimelineComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final n1.h TimelineComponentView$lambda$13$lambda$1(h2 h2Var) {
        return (n1.h) h2Var.getValue();
    }

    private static final void TimelineComponentView_Align_TitleAndDescription_Preview(m mVar, int i) {
        m i2 = mVar.i(1930279475);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1930279475, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_Align_TitleAndDescription_Preview (TimelineComponentView.kt:227)");
            }
            ImagePreviewsKt.ProvidePreviewImageLoader(PreviewHelpersKt.previewImageLoader(0, i2, 0, 1), ComposableSingletons$TimelineComponentViewKt.INSTANCE.getLambda-2$revenuecatui_defaultsBc8Release(), i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TimelineComponentView_Align_Title_Preview(m mVar, int i) {
        m i2 = mVar.i(747423832);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(747423832, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_Align_Title_Preview (TimelineComponentView.kt:214)");
            }
            ImagePreviewsKt.ProvidePreviewImageLoader(PreviewHelpersKt.previewImageLoader(0, i2, 0, 1), ComposableSingletons$TimelineComponentViewKt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TimelineComponentView_Connector_Margin_Preview(m mVar, int i) {
        m i2 = mVar.i(475255038);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(475255038, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_Connector_Margin_Preview (TimelineComponentView.kt:240)");
            }
            ImagePreviewsKt.ProvidePreviewImageLoader(PreviewHelpersKt.previewImageLoader(0, i2, 0, 1), ComposableSingletons$TimelineComponentViewKt.INSTANCE.getLambda-3$revenuecatui_defaultsBc8Release(), i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TimelineComponentView_Size_Preview(Size size, m mVar, int i) {
        int i2;
        m i3 = mVar.i(74978622);
        if ((i & 6) == 0) {
            i2 = (i3.U(size) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(74978622, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_Size_Preview (TimelineComponentView.kt:270)");
            }
            ImagePreviewsKt.ProvidePreviewImageLoader(PreviewHelpersKt.previewImageLoader(0, i3, 0, 1), j0.i.d(-111498279, true, new 1(size), i3, 54), i3, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(size, i));
        }
    }

    private static final void TimelineComponentView_TextSize_Preview(SizeConstraint sizeConstraint, m mVar, int i) {
        int i2;
        m i3 = mVar.i(774105102);
        if ((i & 6) == 0) {
            i2 = (i3.U(sizeConstraint) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(774105102, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentView_TextSize_Preview (TimelineComponentView.kt:305)");
            }
            ImagePreviewsKt.ProvidePreviewImageLoader(PreviewHelpersKt.previewImageLoader(0, i3, 0, 1), j0.i.d(-408857751, true, new 1(sizeConstraint), i3, 54), i3, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(sizeConstraint, i));
        }
    }

    public static final /* synthetic */ n1.h access$TimelineComponentView$lambda$13$lambda$1(h2 h2Var) {
        return TimelineComponentView$lambda$13$lambda$1(h2Var);
    }

    public static final /* synthetic */ void access$TimelineComponentView_Align_TitleAndDescription_Preview(m mVar, int i) {
        TimelineComponentView_Align_TitleAndDescription_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$TimelineComponentView_Align_Title_Preview(m mVar, int i) {
        TimelineComponentView_Align_Title_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$TimelineComponentView_Connector_Margin_Preview(m mVar, int i) {
        TimelineComponentView_Connector_Margin_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$TimelineComponentView_Size_Preview(Size size, m mVar, int i) {
        TimelineComponentView_Size_Preview(size, mVar, i);
    }

    public static final /* synthetic */ void access$TimelineComponentView_TextSize_Preview(SizeConstraint sizeConstraint, m mVar, int i) {
        TimelineComponentView_TextSize_Preview(sizeConstraint, mVar, i);
    }

    public static final /* synthetic */ IconComponentStyle access$previewIcon-6xbWgXg(long j, long j2, Size size, F.L l, m mVar, int i, int i2) {
        return previewIcon-6xbWgXg(j, j2, size, l, mVar, i, i2);
    }

    public static final /* synthetic */ TimelineComponentStyle.ItemStyle access$previewItem(TextComponentStyle textComponentStyle, TextComponentStyle textComponentStyle2, IconComponentStyle iconComponentStyle, TimelineComponentStyle.ConnectorStyle connectorStyle, m mVar, int i, int i2) {
        return previewItem(textComponentStyle, textComponentStyle2, iconComponentStyle, connectorStyle, mVar, i, i2);
    }

    public static final /* synthetic */ List access$previewItems(F.L l, m mVar, int i, int i2) {
        return previewItems(l, mVar, i, i2);
    }

    public static final /* synthetic */ TimelineComponentStyle access$previewStyle(int i, int i2, int i3, TimelineComponent.IconAlignment iconAlignment, boolean z, Size size, F.L l, F.L l2, List list, m mVar, int i4, int i5) {
        return previewStyle(i, i2, i3, iconAlignment, z, size, l, l2, list, mVar, i4, i5);
    }

    private static final TimelineComponentStyle.ConnectorStyle previewConnectorStyle(int i, F.L l, ColorStyle colorStyle) {
        return new TimelineComponentStyle.ConnectorStyle(i, l, new ColorStyles(colorStyle, null, 2, null));
    }

    public static /* synthetic */ TimelineComponentStyle.ConnectorStyle previewConnectorStyle$default(int i, F.L l, ColorStyle colorStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        if ((i2 & 2) != 0) {
            l = androidx.compose.foundation.layout.f.a(n1.h.g(0));
        }
        if ((i2 & 4) != 0) {
            colorStyle = ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(s0.d(4290561265L)));
        }
        return previewConnectorStyle(i, l, colorStyle);
    }

    private static final IconComponentStyle previewIcon-6xbWgXg(long j, long j2, Size size, F.L l, m mVar, int i, int i2) {
        mVar.V(-254474895);
        long k = (i2 & 1) != 0 ? r0.b.k() : j;
        long d = (i2 & 2) != 0 ? s0.d(4283919579L) : j2;
        Size size2 = (i2 & 4) != 0 ? new Size(new SizeConstraint.Fixed(20, (kotlin.jvm.internal.k) null), new SizeConstraint.Fixed(20, (kotlin.jvm.internal.k) null)) : size;
        F.L a = (i2 & 8) != 0 ? androidx.compose.foundation.layout.f.a(n1.h.g(4)) : l;
        if (w.L()) {
            w.U(-254474895, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.previewIcon (TimelineComponentView.kt:502)");
        }
        IconComponentStyle previewIconComponentStyle = PreviewHelpersKt.previewIconComponentStyle(size2, false, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(k)), null, 2, null), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(d)), null, 2, null), a, androidx.compose.foundation.layout.f.a(n1.h.g(0)), null, null, null, mVar, ((i >> 6) & 14) | 14352384 | ((i << 3) & 57344), 258);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return previewIconComponentStyle;
    }

    private static final TimelineComponentStyle.ItemStyle previewItem(TextComponentStyle textComponentStyle, TextComponentStyle textComponentStyle2, IconComponentStyle iconComponentStyle, TimelineComponentStyle.ConnectorStyle connectorStyle, m mVar, int i, int i2) {
        mVar.V(-1551417669);
        IconComponentStyle iconComponentStyle2 = (i2 & 4) != 0 ? previewIcon-6xbWgXg(0L, 0L, null, null, mVar, 0, 15) : iconComponentStyle;
        TimelineComponentStyle.ConnectorStyle previewConnectorStyle$default = (i2 & 8) != 0 ? previewConnectorStyle$default(0, null, null, 7, null) : connectorStyle;
        if (w.L()) {
            w.U(-1551417669, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.previewItem (TimelineComponentView.kt:459)");
        }
        TimelineComponentStyle.ItemStyle itemStyle = new TimelineComponentStyle.ItemStyle(textComponentStyle, true, textComponentStyle2, iconComponentStyle2, previewConnectorStyle$default, null, null, null, null, v.n(), 320, null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return itemStyle;
    }

    private static final List previewItems(F.L l, m mVar, int i, int i2) {
        mVar.V(-2140988222);
        F.L a = (i2 & 1) != 0 ? androidx.compose.foundation.layout.f.a(n1.h.g(0)) : l;
        if (w.L()) {
            w.U(-2140988222, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.previewItems (TimelineComponentView.kt:422)");
        }
        List q = v.q(previewItem("Today", "Description of what you get today if you subscribe with multiple lines to check wrapping", (IconComponentStyle) null, previewConnectorStyle$default(0, a, null, 5, null), mVar, 54, 4), previewItem("Day X", "We'll remind you that your trial is ending soon", previewIcon-6xbWgXg(0L, 0L, new Size(new SizeConstraint.Fixed(30, (kotlin.jvm.internal.k) null), new SizeConstraint.Fixed(30, (kotlin.jvm.internal.k) null)), null, mVar, 384, 11), previewConnectorStyle$default(0, a, null, 5, null), mVar, 54, 0), previewItem("Day Y", "You'll be charged. You can cancel anytime before.", previewIcon-6xbWgXg(r0.b.a(), s0.d(4279227523L), null, null, mVar, 54, 12), previewConnectorStyle$default(0, a, ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(0.0f, v.q(new ColorInfo.Gradient.Point(s0.k(s0.b(1037443)), 0.0f), new ColorInfo.Gradient.Point(s0.k(s0.d(4279227523L)), 100.0f)))), 1, null), mVar, 54, 0));
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return q;
    }

    private static final TimelineComponentStyle previewStyle(int i, int i2, int i3, TimelineComponent.IconAlignment iconAlignment, boolean z, Size size, F.L l, F.L l2, List list, m mVar, int i4, int i5) {
        mVar.V(-1453577113);
        int i6 = (i5 & 1) != 0 ? 24 : i;
        int i7 = (i5 & 2) != 0 ? 4 : i2;
        int i8 = (i5 & 4) != 0 ? 8 : i3;
        TimelineComponent.IconAlignment iconAlignment2 = (i5 & 8) != 0 ? TimelineComponent.IconAlignment.TitleAndDescription : iconAlignment;
        boolean z2 = (i5 & 16) != 0 ? true : z;
        Size size2 = (i5 & 32) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size;
        F.L a = (i5 & 64) != 0 ? androidx.compose.foundation.layout.f.a(n1.h.g(5)) : l;
        F.L a2 = (i5 & 128) != 0 ? androidx.compose.foundation.layout.f.a(n1.h.g(5)) : l2;
        List previewItems = (i5 & 256) != 0 ? previewItems(null, mVar, 0, 1) : list;
        if (w.L()) {
            w.U(-1453577113, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.previewStyle (TimelineComponentView.kt:401)");
        }
        TimelineComponentStyle timelineComponentStyle = new TimelineComponentStyle(i6, i7, i8, iconAlignment2, z2, size2, a, a2, previewItems, null, null, null, null, v.n(), 5120, null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return timelineComponentStyle;
    }

    private static final TimelineComponentStyle.ItemStyle previewItem(String str, String str2, IconComponentStyle iconComponentStyle, TimelineComponentStyle.ConnectorStyle connectorStyle, m mVar, int i, int i2) {
        mVar.V(66138427);
        IconComponentStyle iconComponentStyle2 = (i2 & 4) != 0 ? previewIcon-6xbWgXg(0L, 0L, null, null, mVar, 0, 15) : iconComponentStyle;
        TimelineComponentStyle.ConnectorStyle previewConnectorStyle$default = (i2 & 8) != 0 ? previewConnectorStyle$default(0, null, null, 7, null) : connectorStyle;
        if (w.L()) {
            w.U(66138427, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.previewItem (TimelineComponentView.kt:476)");
        }
        HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
        TimelineComponentStyle.ItemStyle itemStyle = new TimelineComponentStyle.ItemStyle(PreviewHelpersKt.previewTextComponentStyle$default(str, null, 0, FontWeight.BOLD, null, horizontalAlignment, horizontalAlignment, null, false, null, null, null, null, null, null, null, 65430, null), true, PreviewHelpersKt.previewTextComponentStyle$default(str2, null, 0, null, null, horizontalAlignment, horizontalAlignment, null, false, null, null, null, null, null, null, null, 65438, null), iconComponentStyle2, previewConnectorStyle$default, null, null, null, null, v.n(), 320, null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return itemStyle;
    }
}

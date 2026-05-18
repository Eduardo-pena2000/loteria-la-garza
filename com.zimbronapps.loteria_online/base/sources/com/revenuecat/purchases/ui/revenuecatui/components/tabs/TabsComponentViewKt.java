package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.S;
import Da.v;
import F.L;
import Ia.f;
import Qa.l;
import Qa.p;
import Qa.r;
import Wa.i;
import Wa.n;
import androidx.compose.animation.a;
import androidx.compose.animation.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedOverride;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import v0.r0;
import y.b;
import y.k;
import z.D;
import z.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class TabsComponentViewKt {
    private static final int DURATION_MS_CROSS_FADE = 220;

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TabsComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(TabsComponentStyle tabsComponentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, int i, int i2) {
            super(2);
            this.$style = tabsComponentStyle;
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
            TabsComponentViewKt.TabsComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 5 extends u implements l {
        public static final 5 INSTANCE = new 5();

        public 5() {
            super(1);
        }

        public final k invoke(c AnimatedContent) {
            t.g(AnimatedContent, "$this$AnimatedContent");
            return a.e(androidx.compose.animation.e.m(j.j(220, 0, (D) null, 4, (Object) null), 0.0f, 2, (Object) null), androidx.compose.animation.e.o(j.j(220, 0, (D) null, 6, (Object) null), 0.0f, 2, (Object) null));
        }
    }

    public static final class 6 extends u implements r {
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TabsComponentState $tabsState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 6(TabsComponentState tabsComponentState, PaywallState.Loaded.Components components, p pVar) {
            super(4);
            this.$tabsState = tabsComponentState;
            this.$state = components;
            this.$clickHandler = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
            return I.a;
        }

        public final void invoke(b AnimatedContent, int i, m mVar, int i2) {
            t.g(AnimatedContent, "$this$AnimatedContent");
            if (w.L()) {
                w.U(1188428519, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentView.<anonymous> (TabsComponentView.kt:100)");
            }
            StackComponentViewKt.StackComponentView(((TabsComponentStyle.Tab) this.$tabsState.getTabs().get(n.n(i, new i(0, v.p(this.$tabsState.getTabs()))))).getStack(), this.$state, this.$clickHandler, null, 0.0f, mVar, 0, 24);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 7 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TabsComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 7(TabsComponentStyle tabsComponentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, int i, int i2) {
            super(2);
            this.$style = tabsComponentStyle;
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
            TabsComponentViewKt.TabsComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt$TabsComponentView_Preview$1", f = "TabsComponentView.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        int label;

        public 1(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new 1(eVar);
        }

        public final Object invoke(PaywallAction paywallAction, Ga.e eVar) {
            return ((1) create(paywallAction, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            return I.a;
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
            TabsComponentViewKt.access$TabsComponentView_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TabsComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle r17, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r18, Qa.p r19, androidx.compose.ui.e r20, b0.m r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt.TabsComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, Qa.p, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void TabsComponentView_Preview(m mVar, int i) {
        m i2 = mVar.i(1844948686);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1844948686, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentView_Preview (TabsComponentView.kt:113)");
            }
            PresentedOverride presentedOverride = new PresentedOverride(Da.u.e(ComponentOverride.Condition.Selected.INSTANCE), (PresentedPartial) ResultKt.getOrThrow(LocalizedTextPartial.Companion.invoke(new PartialTextComponent((Boolean) null, (String) null, (ColorScheme) null, (ColorScheme) null, (String) null, FontWeight.EXTRA_BOLD, (Integer) null, (Integer) null, (HorizontalAlignment) null, (Size) null, (Padding) null, (Padding) null, 4063, (kotlin.jvm.internal.k) null), NonEmptyMapKt.nonEmptyMapOf(x.a(LocaleId.box-impl(LocaleId.constructor-impl("en_US")), NonEmptyMapKt.nonEmptyMapOf(x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("dummy")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("dummy"))), new q[0])), new q[0]), S.h(), S.h())));
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            float f = 8;
            StackComponentStyle stackComponentStyle = previewStackComponentStyle-gNPyAyM$default(v.q(new TabControlButtonComponentStyle(0, previewStackComponentStyle-gNPyAyM$default(Da.u.e(PreviewHelpersKt.previewTextComponentStyle$default("Tab 1", null, 0, null, null, null, null, null, false, new Size(fit, fit), null, null, 0, null, null, Da.u.e(presentedOverride), 28158, null)), null, false, new Size(fit, fit), 0.0f, null, null, null, null, null, null, null, 4086, null)), new TabControlButtonComponentStyle(1, previewStackComponentStyle-gNPyAyM$default(Da.u.e(PreviewHelpersKt.previewTextComponentStyle$default("Tab 2", null, 0, null, null, null, null, null, false, new Size(fit, fit), null, null, 1, null, null, Da.u.e(presentedOverride), 28158, null)), null, false, new Size(fit, fit), 0.0f, null, null, null, null, null, null, null, 4086, null)), new TabControlButtonComponentStyle(2, previewStackComponentStyle-gNPyAyM$default(Da.u.e(PreviewHelpersKt.previewTextComponentStyle$default("Tab 3", null, 0, null, null, null, null, null, false, new Size(fit, fit), null, null, 2, null, null, Da.u.e(presentedOverride), 28158, null)), null, false, new Size(fit, fit), 0.0f, null, null, null, null, null, null, null, 4086, null))), new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.CENTER), false, new Size(fit, fit), h.g(f), null, null, null, null, null, null, null, 4068, null);
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            Size size = new Size(fill, fill);
            float f2 = 16;
            L a = androidx.compose.foundation.layout.f.a(h.g(f2));
            L a2 = androidx.compose.foundation.layout.f.a(h.g(f2));
            r0.a aVar = r0.b;
            i2 = i2;
            TabsComponentView(new TabsComponentStyle(true, size, a, a2, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.g())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.d()))))), new Shape.Rectangle(new CornerRadiuses.Dp(16.0d)), new BorderStyles(h.g(f), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b()))), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h()))), h.g(6), h.g(0), h.g(10), null), new TabControlStyle.Buttons(previewStackComponentStyle-gNPyAyM$default(v.n(), null, false, null, 0.0f, null, null, null, null, null, null, null, 4094, null)), NonEmptyListKt.nonEmptyListOf(new TabsComponentStyle.Tab(previewStackComponentStyle-gNPyAyM$default(v.q(stackComponentStyle, PreviewHelpersKt.previewTextComponentStyle$default("Tab 1 content", null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, 65534, null)), null, false, null, 0.0f, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b()))))), null, null, null, null, null, null, 4062, null)), new TabsComponentStyle.Tab(previewStackComponentStyle-gNPyAyM$default(v.q(stackComponentStyle, PreviewHelpersKt.previewTextComponentStyle$default("Tab 2 content", null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, 65534, null)), null, false, null, 0.0f, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.f()))))), null, null, null, null, null, null, 4062, null)), new TabsComponentStyle.Tab(previewStackComponentStyle-gNPyAyM$default(v.q(stackComponentStyle, PreviewHelpersKt.previewTextComponentStyle$default("Tab 3 content", null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, 65534, null)), null, false, null, 0.0f, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h()))))), null, null, null, null, null, null, 4062, null))), v.n()), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new 1(null), null, i2, 384, 8);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$TabsComponentView_Preview(m mVar, int i) {
        TabsComponentView_Preview(mVar, i);
    }

    private static final StackComponentStyle previewStackComponentStyle-gNPyAyM(List list, Dimension dimension, boolean z, Size size, float f, BackgroundStyles backgroundStyles, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, Integer num) {
        return new StackComponentStyle(list, dimension, z, size, f, backgroundStyles, l, l2, shape, borderStyles, shadowStyles, null, null, null, null, num, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null);
    }

    public static /* synthetic */ StackComponentStyle previewStackComponentStyle-gNPyAyM$default(List list, Dimension dimension, boolean z, Size size, float f, BackgroundStyles backgroundStyles, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, Integer num, int i, Object obj) {
        Size size2;
        Dimension vertical = (i & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.CENTER) : dimension;
        boolean z2 = (i & 4) != 0 ? true : z;
        if ((i & 8) != 0) {
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            size2 = new Size(fill, fill);
        } else {
            size2 = size;
        }
        return previewStackComponentStyle-gNPyAyM(list, vertical, z2, size2, (i & 16) != 0 ? h.g(0) : f, (i & 32) != 0 ? BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.i())), null, 2, null))) : backgroundStyles, (i & 64) != 0 ? androidx.compose.foundation.layout.f.a(h.g(0)) : l, (i & 128) != 0 ? androidx.compose.foundation.layout.f.a(h.g(0)) : l2, (i & 256) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(0.0d)) : shape, (i & 512) != 0 ? null : borderStyles, (i & 1024) != 0 ? null : shadowStyles, (i & 2048) == 0 ? num : null);
    }
}

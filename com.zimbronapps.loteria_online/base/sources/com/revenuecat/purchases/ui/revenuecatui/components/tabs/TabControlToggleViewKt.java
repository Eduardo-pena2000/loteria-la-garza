package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Ca.I;
import Da.v;
import Qa.p;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h2;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlToggleComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.List;
import kotlin.jvm.internal.u;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class TabControlToggleViewKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TabControlToggleComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(TabControlToggleComponentStyle tabControlToggleComponentStyle, PaywallState.Loaded.Components components, e eVar, int i, int i2) {
            super(2);
            this.$style = tabControlToggleComponentStyle;
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
            TabControlToggleViewKt.TabControlToggleView(this.$style, this.$state, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
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
            TabControlToggleViewKt.access$TabControlToggleView_Gradient_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $checked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(boolean z, int i) {
            super(2);
            this.$checked = z;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TabControlToggleViewKt.access$TabControlToggleView_Preview(this.$checked, mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TabControlToggleView(com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlToggleComponentStyle r33, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r34, androidx.compose.ui.e r35, b0.m r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleViewKt.TabControlToggleView(com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlToggleComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final boolean TabControlToggleView$lambda$1(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    private static final void TabControlToggleView_Gradient_Preview(m mVar, int i) {
        m i2 = mVar.i(-813499163);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-813499163, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleView_Gradient_Preview (TabControlToggleView.kt:86)");
            }
            r0.a aVar = r0.b;
            List q = v.q(new ColorInfo.Gradient.Point(s0.k(aVar.h()), 0.0f), new ColorInfo.Gradient.Point(s0.k(aVar.f()), 35.0f), new ColorInfo.Gradient.Point(s0.k(aVar.b()), 100.0f));
            TabControlToggleView(new TabControlToggleComponentStyle(new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(q)), null, 2, null), new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(q)), null, 2, null), new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(90.0f, q)), null, 2, null), new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(90.0f, q)), null, 2, null)), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), null, i2, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TabControlToggleView_Preview(boolean z, m mVar, int i) {
        int i2;
        m i3 = mVar.i(259221708);
        if ((i & 6) == 0) {
            i2 = (i3.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(259221708, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleView_Preview (TabControlToggleView.kt:59)");
            }
            r0.a aVar = r0.b;
            TabControlToggleView(new TabControlToggleComponentStyle(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b()))), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h()))), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.f()))), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.f())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l())))), PreviewHelpersKt.previewEmptyState(Integer.valueOf(z ? 1 : 0), i3, 0, 0), null, i3, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(z, i));
        }
    }

    public static final /* synthetic */ void access$TabControlToggleView_Gradient_Preview(m mVar, int i) {
        TabControlToggleView_Gradient_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$TabControlToggleView_Preview(boolean z, m mVar, int i) {
        TabControlToggleView_Preview(z, mVar, i);
    }
}

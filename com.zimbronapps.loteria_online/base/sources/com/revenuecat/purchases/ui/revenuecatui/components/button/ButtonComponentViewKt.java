package com.revenuecat.purchases.ui.revenuecatui.components.button;

import A.q;
import Ca.I;
import Ca.o;
import Da.D;
import Da.v;
import Ga.j;
import M0.B;
import O0.g;
import P0.p0;
import Qa.a;
import Qa.l;
import Qa.p;
import Wa.n;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b0.B1;
import b0.C0;
import b0.L;
import b0.T1;
import b0.U1;
import b0.b0;
import b0.g1;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import cb.O;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;
import n1.d;
import n1.h;
import n1.t;
import v0.r0;
import z.c;
import z.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ButtonComponentViewKt {
    private static final float ALPHA_DISABLED = 0.6f;
    private static final float BRIGHTNESS_CUTOFF = 0.6f;
    private static final float COEFFICIENT_LUMINANCE_BLUE = 0.114f;
    private static final float COEFFICIENT_LUMINANCE_GREEN = 0.587f;
    private static final float COEFFICIENT_LUMINANCE_RED = 0.299f;

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ p $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ButtonComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ButtonComponentStyle buttonComponentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, int i, int i2) {
            super(2);
            this.$style = buttonComponentStyle;
            this.$state = components;
            this.$onClick = pVar;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ButtonComponentViewKt.ButtonComponentView(this.$style, this.$state, this.$onClick, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ e $modifier;
        final /* synthetic */ p $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ButtonComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(ButtonComponentStyle buttonComponentStyle, PaywallState.Loaded.Components components, e eVar, p pVar) {
            super(2);
            this.$style = buttonComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$onClick = pVar;
        }

        public static final /* synthetic */ boolean access$invoke$lambda$0(PaywallState.Loaded.Components components) {
            return invoke$lambda$0(components);
        }

        public static final /* synthetic */ boolean access$invoke$lambda$2(C0 c0) {
            return invoke$lambda$2(c0);
        }

        public static final /* synthetic */ void access$invoke$lambda$3(C0 c0, boolean z) {
            invoke$lambda$3(c0, z);
        }

        private static final boolean invoke$lambda$0(PaywallState.Loaded.Components components) {
            return components.getActionInProgress();
        }

        private static final boolean invoke$lambda$2(C0 c0) {
            return ((Boolean) c0.getValue()).booleanValue();
        }

        private static final void invoke$lambda$3(C0 c0, boolean z) {
            c0.setValue(Boolean.valueOf(z));
        }

        private static final float invoke$lambda$5(h2 h2Var) {
            return ((Number) h2Var.getValue()).floatValue();
        }

        private static final float invoke$lambda$7(h2 h2Var) {
            return ((Number) h2Var.getValue()).floatValue();
        }

        private static final float invoke$lambda$8(h2 h2Var) {
            return ((Number) h2Var.getValue()).floatValue();
        }

        private static final float invoke$lambda$9(h2 h2Var) {
            return ((Number) h2Var.getValue()).floatValue();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Ga.e eVar;
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-17542715, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentView.<anonymous> (ButtonComponentView.kt:85)");
            }
            ButtonComponentState rememberButtonComponentState = ButtonComponentStateKt.rememberButtonComponentState(this.$style, this.$state, mVar, 0);
            Object C = mVar.C();
            m.a aVar = m.a;
            if (C == aVar.a()) {
                L l = new L(b0.i(j.a, mVar));
                mVar.t(l);
                C = l;
            }
            O a = ((L) C).a();
            PaywallState.Loaded.Components components = this.$state;
            mVar.V(-1790179292);
            Object C2 = mVar.C();
            if (C2 == aVar.a()) {
                C2 = U1.i(Boolean.FALSE, (T1) null, 2, (Object) null);
                mVar.t(C2);
            }
            C0 c0 = (C0) C2;
            mVar.P();
            mVar.V(-1790177179);
            Object C3 = mVar.C();
            if (C3 == aVar.a()) {
                C3 = U1.c(new ButtonComponentViewKt$ButtonComponentView$2$contentAlpha$2$1(c0, components));
                mVar.t(C3);
            }
            h2 h2Var = (h2) C3;
            mVar.P();
            mVar.V(-1790172092);
            Object C4 = mVar.C();
            if (C4 == aVar.a()) {
                C4 = U1.c(new ButtonComponentViewKt$ButtonComponentView$2$progressAlpha$2$1(c0));
                mVar.t(C4);
            }
            mVar.P();
            h2 d = c.d(invoke$lambda$5(h2Var), (i) null, 0.0f, (String) null, (l) null, mVar, 0, 30);
            h2 d2 = c.d(invoke$lambda$7((h2) C4), (i) null, 0.0f, (String) null, (l) null, mVar, 0, 30);
            t tVar = (t) mVar.x(p0.k());
            F.L margin = this.$style.getStackComponentStyle().getMargin();
            mVar.V(-1790161765);
            boolean U = mVar.U(margin);
            ButtonComponentStyle buttonComponentStyle = this.$style;
            Object C5 = mVar.C();
            if (U || C5 == aVar.a()) {
                C5 = h.d(buttonComponentStyle.getStackComponentStyle().getMargin().d());
                mVar.t(C5);
            }
            float m = ((h) C5).m();
            mVar.P();
            F.L margin2 = this.$style.getStackComponentStyle().getMargin();
            mVar.V(-1790156994);
            boolean U2 = mVar.U(margin2);
            ButtonComponentStyle buttonComponentStyle2 = this.$style;
            Object C6 = mVar.C();
            if (U2 || C6 == aVar.a()) {
                C6 = h.d(buttonComponentStyle2.getStackComponentStyle().getMargin().a());
                mVar.t(C6);
            }
            float m2 = ((h) C6).m();
            mVar.P();
            F.L margin3 = this.$style.getStackComponentStyle().getMargin();
            mVar.V(-1790152131);
            boolean U3 = mVar.U(margin3) | mVar.U(tVar);
            ButtonComponentStyle buttonComponentStyle3 = this.$style;
            Object C7 = mVar.C();
            if (U3 || C7 == aVar.a()) {
                C7 = h.d(f.g(buttonComponentStyle3.getStackComponentStyle().getMargin(), tVar));
                mVar.t(C7);
            }
            float m3 = ((h) C7).m();
            mVar.P();
            F.L margin4 = this.$style.getStackComponentStyle().getMargin();
            mVar.V(-1790146373);
            boolean U4 = mVar.U(margin4) | mVar.U(tVar);
            ButtonComponentStyle buttonComponentStyle4 = this.$style;
            Object C8 = mVar.C();
            if (U4 || C8 == aVar.a()) {
                C8 = h.d(f.f(buttonComponentStyle4.getStackComponentStyle().getMargin(), tVar));
                mVar.t(C8);
            }
            float m4 = ((h) C8).m();
            mVar.P();
            ButtonComponentStyle buttonComponentStyle5 = this.$style;
            PaywallState.Loaded.Components components2 = this.$state;
            e eVar2 = this.$modifier;
            boolean z = !invoke$lambda$0(components);
            mVar.V(-1790105339);
            boolean U5 = mVar.U(this.$state) | mVar.E(a) | mVar.E(this.$onClick) | mVar.U(rememberButtonComponentState);
            PaywallState.Loaded.Components components3 = this.$state;
            p pVar = this.$onClick;
            Object C9 = mVar.C();
            if (U5 || C9 == aVar.a()) {
                eVar = null;
                ButtonComponentViewKt$ButtonComponentView$2$2$1 buttonComponentViewKt$ButtonComponentView$2$2$1 = new ButtonComponentViewKt$ButtonComponentView$2$2$1(components3, a, c0, pVar, rememberButtonComponentState);
                mVar.t(buttonComponentViewKt$ButtonComponentView$2$2$1);
                C9 = buttonComponentViewKt$ButtonComponentView$2$2$1;
            } else {
                eVar = null;
            }
            mVar.P();
            e d3 = b.d(eVar2, z, (String) null, (W0.h) null, (a) C9, 6, (Object) null);
            mVar.V(-1790092426);
            boolean c = mVar.c(m3) | mVar.c(m4) | mVar.c(m) | mVar.c(m2);
            Object C10 = mVar.C();
            if (c || C10 == aVar.a()) {
                C10 = new ButtonComponentViewKt$ButtonComponentView$2$3$1(m3, m4, m, m2);
                mVar.t(C10);
            }
            B b = (B) C10;
            mVar.P();
            int a2 = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = androidx.compose.ui.c.f(mVar, d3);
            g.a aVar2 = g.E8;
            a a3 = aVar2.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a3);
            } else {
                mVar.s();
            }
            m b2 = m2.b(mVar);
            m2.e(b2, b, aVar2.e());
            m2.e(b2, r, aVar2.g());
            p b3 = aVar2.b();
            if (b2.f() || !kotlin.jvm.internal.t.c(b2.C(), Integer.valueOf(a2))) {
                b2.t(Integer.valueOf(a2));
                b2.J(Integer.valueOf(a2), b3);
            }
            m2.e(b2, f, aVar2.f());
            StackComponentViewKt.StackComponentView(buttonComponentStyle5.getStackComponentStyle(), components2, new ButtonComponentViewKt$ButtonComponentView$2$1$1(eVar), null, invoke$lambda$8(d), mVar, 384, 8);
            X.L.a(s0.a.a(e.a, invoke$lambda$9(d2)), ButtonComponentViewKt.access$progressColorFor(buttonComponentStyle5.getStackComponentStyle().getBackground(), mVar, 0), 0.0f, 0L, 0, mVar, 0, 28);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ p $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ButtonComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(ButtonComponentStyle buttonComponentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, int i, int i2) {
            super(2);
            this.$style = buttonComponentStyle;
            this.$state = components;
            this.$onClick = pVar;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ButtonComponentViewKt.ButtonComponentView(this.$style, this.$state, this.$onClick, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    @Ia.f(c = "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView_Preview_Default$1", f = "ButtonComponentView.kt", l = {}, m = "invokeSuspend")
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
            ButtonComponentViewKt.access$ButtonComponentView_Preview_Default(mVar, g1.a(this.$$changed | 1));
        }
    }

    @Ia.f(c = "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView_Preview_Narrow$1", f = "ButtonComponentView.kt", l = {}, m = "invokeSuspend")
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
            ButtonComponentViewKt.access$ButtonComponentView_Preview_Narrow(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ButtonComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle r11, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r12, Qa.p r13, androidx.compose.ui.e r14, b0.m r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt.ButtonComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, Qa.p, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void ButtonComponentView_Preview_Default(m mVar, int i) {
        m i2 = mVar.i(-291258808);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-291258808, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentView_Preview_Default (ButtonComponentView.kt:240)");
            }
            ButtonComponentView(previewButtonComponentStyle(null, null, i2, 0, 3), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new 1(null), null, i2, 384, 8);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void ButtonComponentView_Preview_Narrow(m mVar, int i) {
        m i2 = mVar.i(1236087174);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1236087174, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentView_Preview_Narrow (ButtonComponentView.kt:246)");
            }
            ButtonComponentView(previewButtonComponentStyle(PreviewHelpersKt.previewStackComponentStyle-7SJ-wSw$default(Da.u.e(PreviewHelpersKt.previewTextComponentStyle$default("Restore purchases", null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.l())), null, 2, null), false, null, null, null, null, null, null, null, 65406, null)), null, false, null, 0.0f, null, null, null, null, null, null, null, null, null, null, 32766, null), null, i2, 0, 2), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new 1(null), null, i2, 384, 8);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$ButtonComponentView_Preview_Default(m mVar, int i) {
        ButtonComponentView_Preview_Default(mVar, i);
    }

    public static final /* synthetic */ void access$ButtonComponentView_Preview_Narrow(m mVar, int i) {
        ButtonComponentView_Preview_Narrow(mVar, i);
    }

    public static final /* synthetic */ long access$progressColorFor(BackgroundStyles backgroundStyles, m mVar, int i) {
        return progressColorFor(backgroundStyles, mVar, i);
    }

    public static final /* synthetic */ int access$progressSize(d dVar, int i, int i2, float f, float f2, float f3, float f4) {
        return progressSize(dVar, i, i2, f, f2, f3, f4);
    }

    private static final float getBrightness-8_81llA(long j) {
        return (r0.x(j) * 0.299f) + (r0.w(j) * 0.587f) + (r0.u(j) * 0.114f);
    }

    private static final ButtonComponentStyle previewButtonComponentStyle(StackComponentStyle stackComponentStyle, ButtonComponentStyle.Action action, m mVar, int i, int i2) {
        StackComponentStyle stackComponentStyle2;
        mVar.V(-1733277159);
        if ((i2 & 1) != 0) {
            r0.a aVar = r0.b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            float f = 16;
            stackComponentStyle2 = new StackComponentStyle(Da.u.e(PreviewHelpersKt.previewTextComponentStyle$default("Restore purchases", null, 0, null, null, null, null, colorStyles, false, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), new Padding(0.0d, 24.0d, 0.0d, 24.0d), null, null, null, null, 61822, null)), new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START), true, new Size(fit, fit), h.g(f), BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), null, 2, null))), f.a(h.g(f)), f.a(h.g(f)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.a())), null, 2, null), h.g(10), h.g(0), h.g(3), null), null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null);
        } else {
            stackComponentStyle2 = stackComponentStyle;
        }
        ButtonComponentStyle.Action action2 = (i2 & 2) != 0 ? ButtonComponentStyle.Action.RestorePurchases.INSTANCE : action;
        if (w.L()) {
            w.U(-1733277159, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.previewButtonComponentStyle (ButtonComponentView.kt:299)");
        }
        ButtonComponentStyle buttonComponentStyle = new ButtonComponentStyle(stackComponentStyle2, action2, null, 4, null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return buttonComponentStyle;
    }

    private static final long progressColorFor(BackgroundStyles backgroundStyles, m mVar, int i) {
        long k;
        mVar.V(-1216934903);
        if (w.L()) {
            w.U(-1216934903, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.progressColorFor (ButtonComponentView.kt:214)");
        }
        mVar.V(-1003117124);
        if (backgroundStyles == null) {
            long k2 = q.a(mVar, 0) ? r0.b.k() : r0.b.a();
            mVar.P();
            if (w.L()) {
                w.T();
            }
            mVar.P();
            return k2;
        }
        mVar.P();
        if (backgroundStyles instanceof BackgroundStyles.Color) {
            k = progressColorFor(ColorStyleKt.getForCurrentTheme(((BackgroundStyles.Color) backgroundStyles).unbox-impl(), mVar, 0));
        } else if (backgroundStyles instanceof BackgroundStyles.Image) {
            k = r0.b.k();
        } else {
            if (!(backgroundStyles instanceof BackgroundStyles.Video)) {
                throw new o();
            }
            k = r0.b.k();
        }
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return k;
    }

    private static final int progressSize(d dVar, int i, int i2, float f, float f2, float f3, float f4) {
        float g;
        float a1 = dVar.a1(Math.min((i - f) - f2, (i2 - f3) - f4));
        if (h.f(a1, h.g(32)) >= 0) {
            g = h.g(16);
        } else if (h.f(a1, h.g(24)) >= 0) {
            g = h.g(a1 - h.g(16));
        } else if (h.f(a1, h.g(16)) >= 0) {
            g = h.g(8);
        } else {
            float f5 = 8;
            g = h.f(a1, h.g(f5)) >= 0 ? h.g(a1 - h.g(f5)) : h.g(0);
        }
        return dVar.s0(h.g(n.l(h.g(a1 - g), h.g(0), h.g(38))));
    }

    private static final long progressColorFor(ColorStyle colorStyle) {
        if (colorStyle instanceof ColorStyle.Solid) {
            return getBrightness-8_81llA(((ColorStyle.Solid) colorStyle).unbox-impl()) > 0.6f ? r0.b.a() : r0.b.k();
        }
        if (!(colorStyle instanceof ColorStyle.Gradient)) {
            throw new o();
        }
        List colors$revenuecatui_defaultsBc8Release = ((ColorStyle.Gradient) colorStyle).unbox-impl().getColors$revenuecatui_defaultsBc8Release();
        ArrayList arrayList = new ArrayList(Da.w.y(colors$revenuecatui_defaultsBc8Release, 10));
        Iterator it = colors$revenuecatui_defaultsBc8Release.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(getBrightness-8_81llA(((r0) it.next()).A())));
        }
        return D.X(arrayList) > 0.6000000238418579d ? r0.b.a() : r0.b.k();
    }
}

package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Ca.x;
import Da.Q;
import Da.S;
import Da.v;
import F.c;
import F.l;
import F.n;
import F.o;
import Ia.f;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TextComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.ComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.ExitOffers;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.composables.SimpleSheetState;
import com.revenuecat.purchases.ui.revenuecatui.data.MockPurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import j0.i;
import java.net.URL;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class LoadedPaywallComponentsKt {
    private static final long MILLIS_2025_01_25 = 1737763200000L;

    public static final class 1 extends u implements p {
        final /* synthetic */ BackgroundStyle $background;
        final /* synthetic */ ComponentStyle $footerComponentStyle;
        final /* synthetic */ p $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ComponentStyle $style;

        public static final class 1 extends u implements p {
            final /* synthetic */ ComponentStyle $footerComponentStyle;
            final /* synthetic */ p $onClick;
            final /* synthetic */ PaywallState.Loaded.Components $state;
            final /* synthetic */ ComponentStyle $style;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(ComponentStyle componentStyle, PaywallState.Loaded.Components components, p pVar, ComponentStyle componentStyle2) {
                super(2);
                this.$style = componentStyle;
                this.$state = components;
                this.$onClick = pVar;
                this.$footerComponentStyle = componentStyle2;
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
                    w.U(1882576877, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents.<anonymous>.<anonymous> (LoadedPaywallComponents.kt:83)");
                }
                ComponentStyle componentStyle = this.$style;
                PaywallState.Loaded.Components components = this.$state;
                p pVar = this.$onClick;
                ComponentStyle componentStyle2 = this.$footerComponentStyle;
                e.a aVar = e.a;
                B a = l.a(c.a.h(), o0.e.a.k(), mVar, 0);
                int a2 = h.a(mVar, 0);
                b0.I r = mVar.r();
                e f = androidx.compose.ui.c.f(mVar, aVar);
                g.a aVar2 = g.E8;
                a a3 = aVar2.a();
                if (mVar.k() == null) {
                    h.d();
                }
                mVar.I();
                if (mVar.f()) {
                    mVar.p(a3);
                } else {
                    mVar.s();
                }
                m b = m2.b(mVar);
                m2.e(b, a, aVar2.e());
                m2.e(b, r, aVar2.g());
                p b2 = aVar2.b();
                if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                    b.t(Integer.valueOf(a2));
                    b.J(Integer.valueOf(a2), b2);
                }
                m2.e(b, f, aVar2.f());
                ComponentViewKt.ComponentView(componentStyle, components, pVar, androidx.compose.foundation.e.f(n.b(o.a, androidx.compose.foundation.layout.g.h(aVar, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), androidx.compose.foundation.e.c(0, mVar, 0, 1), false, (C.n) null, false, 14, (Object) null), mVar, 0, 0);
                mVar.V(1628615184);
                if (componentStyle2 != null) {
                    ComponentViewKt.ComponentView(componentStyle2, components, pVar, androidx.compose.foundation.layout.g.h(aVar, 0.0f, 1, (Object) null), mVar, 3072, 0);
                }
                mVar.P();
                mVar.v();
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallState.Loaded.Components components, BackgroundStyle backgroundStyle, ComponentStyle componentStyle, p pVar, ComponentStyle componentStyle2) {
            super(2);
            this.$state = components;
            this.$background = backgroundStyle;
            this.$style = componentStyle;
            this.$onClick = pVar;
            this.$footerComponentStyle = componentStyle2;
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
                w.U(-1179256774, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents.<anonymous> (LoadedPaywallComponents.kt:82)");
            }
            PaywallState.Loaded.Components components = this.$state;
            WithOptionalBackgroundOverlayKt.WithOptionalBackgroundOverlay(components, this.$background, null, null, i.d(1882576877, true, new 1(this.$style, components, this.$onClick, this.$footerComponentStyle), mVar, 54), mVar, 24576, 12);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallState.Loaded.Components components, p pVar, e eVar, int i, int i2) {
            super(2);
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
            LoadedPaywallComponentsKt.LoadedPaywallComponents(this.$state, this.$clickHandler, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_FitSize_Preview$1", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
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

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_FitSize_Preview$2", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends Ia.l implements p {
        int label;

        public 2(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new 2(eVar);
        }

        public final Object invoke(PaywallAction.External external, Ga.e eVar) {
            return ((2) create(external, eVar)).invokeSuspend(I.a);
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

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            LoadedPaywallComponentsKt.access$LoadedPaywallComponents_BottomSheet_FitSize_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_NullSize_Preview$1", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
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

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_BottomSheet_NullSize_Preview$2", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends Ia.l implements p {
        int label;

        public 2(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new 2(eVar);
        }

        public final Object invoke(PaywallAction.External external, Ga.e eVar) {
            return ((2) create(external, eVar)).invokeSuspend(I.a);
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

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            LoadedPaywallComponentsKt.access$LoadedPaywallComponents_BottomSheet_NullSize_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview$1", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        int label;

        public 1(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new 1(eVar);
        }

        public final Object invoke(PaywallAction.External external, Ga.e eVar) {
            return ((1) create(external, eVar)).invokeSuspend(I.a);
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
            LoadedPaywallComponentsKt.access$LoadedPaywallComponents_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview_Bless$1", f = "LoadedPaywallComponents.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        int label;

        public 1(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new 1(eVar);
        }

        public final Object invoke(PaywallAction.External external, Ga.e eVar) {
            return ((1) create(external, eVar)).invokeSuspend(I.a);
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
            LoadedPaywallComponentsKt.access$LoadedPaywallComponents_Preview_Bless(mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt$handleClick$2", f = "LoadedPaywallComponents.kt", l = {119}, m = "invokeSuspend")
    public static final class 2 extends Ia.l implements p {
        final /* synthetic */ p $externalClickHandler;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallState.Loaded.Components components, p pVar, Ga.e eVar) {
            super(2, eVar);
            this.$state = components;
            this.$externalClickHandler = pVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            2 r0 = new 2(this.$state, this.$externalClickHandler, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(PaywallAction paywallAction, Ga.e eVar) {
            return ((2) create(paywallAction, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.label;
            if (i == 0) {
                Ca.t.b(obj);
                PaywallAction paywallAction = (PaywallAction) this.L$0;
                PaywallState.Loaded.Components components = this.$state;
                p pVar = this.$externalClickHandler;
                this.label = 1;
                if (LoadedPaywallComponentsKt.access$handleClick(paywallAction, components, pVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return I.a;
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final Date invoke() {
            return new Date(1737763200000L);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ p $onClick;
        final /* synthetic */ ButtonComponentStyle.Action.NavigateTo.Destination.Sheet $sheet;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ SimpleSheetState $this_show;

        public static final class 2 extends u implements p {
            public static final 2 INSTANCE = new 2();

            public 2() {
                super(2);
            }

            public final e invoke(e applyIfNotNull, Size it) {
                t.g(applyIfNotNull, "$this$applyIfNotNull");
                t.g(it, "it");
                return SizeKt.size$default(applyIfNotNull, it, null, null, 6, null);
            }
        }

        public static final class 3 extends u implements Qa.l {
            public static final 3 INSTANCE = new 3();

            public 3() {
                super(1);
            }

            public final e invoke(e conditional) {
                t.g(conditional, "$this$conditional");
                return androidx.compose.foundation.layout.g.h(conditional, 0.0f, 1, (Object) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ButtonComponentStyle.Action.NavigateTo.Destination.Sheet sheet, PaywallState.Loaded.Components components, SimpleSheetState simpleSheetState, p pVar) {
            super(2);
            this.$sheet = sheet;
            this.$state = components;
            this.$this_show = simpleSheetState;
            this.$onClick = pVar;
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
                w.U(1290168816, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.show.<anonymous> (LoadedPaywallComponents.kt:140)");
            }
            ComponentStyle stack = this.$sheet.getStack();
            PaywallState.Loaded.Components components = this.$state;
            mVar.V(1730748123);
            boolean U = mVar.U(this.$this_show) | mVar.E(this.$onClick);
            SimpleSheetState simpleSheetState = this.$this_show;
            p pVar = this.$onClick;
            Object C = mVar.C();
            if (U || C == m.a.a()) {
                C = new LoadedPaywallComponentsKt$show$1$1$1(simpleSheetState, pVar, null);
                mVar.t(C);
            }
            p pVar2 = (p) C;
            mVar.P();
            ComponentViewKt.ComponentView(stack, components, pVar2, ModifierExtensionsKt.conditional(ModifierExtensionsKt.applyIfNotNull(e.a, this.$sheet.getSize(), 2.INSTANCE), this.$sheet.getSize() == null, 3.INSTANCE), mVar, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements a {
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallState.Loaded.Components components) {
            super(0);
            this.$state = components;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.$state.resetToDefaultPackage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LoadedPaywallComponents(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r16, Qa.p r17, androidx.compose.ui.e r18, b0.m r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt.LoadedPaywallComponents(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, Qa.p, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void LoadedPaywallComponents_BottomSheet_FitSize_Preview(m mVar, int i) {
        m i2 = mVar.i(561912880);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(561912880, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents_BottomSheet_FitSize_Preview (LoadedPaywallComponents.kt:195)");
            }
            PaywallState.Loaded.Components previewHelloWorldPaywallState = previewHelloWorldPaywallState(i2, 0);
            SimpleSheetState sheet = previewHelloWorldPaywallState.getSheet();
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            show(sheet, previewBottomSheet(new Size(fit, fit)), previewHelloWorldPaywallState, new 1(null));
            LoadedPaywallComponents(previewHelloWorldPaywallState, new 2(null), androidx.compose.foundation.layout.g.f(e.a, 0.0f, 1, (Object) null), i2, 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 3(i));
        }
    }

    private static final void LoadedPaywallComponents_BottomSheet_NullSize_Preview(m mVar, int i) {
        m i2 = mVar.i(-398756048);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-398756048, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents_BottomSheet_NullSize_Preview (LoadedPaywallComponents.kt:176)");
            }
            PaywallState.Loaded.Components previewHelloWorldPaywallState = previewHelloWorldPaywallState(i2, 0);
            show(previewHelloWorldPaywallState.getSheet(), previewBottomSheet(null), previewHelloWorldPaywallState, new 1(null));
            LoadedPaywallComponents(previewHelloWorldPaywallState, new 2(null), androidx.compose.foundation.layout.g.f(e.a, 0.0f, 1, (Object) null), i2, 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 3(i));
        }
    }

    private static final void LoadedPaywallComponents_Preview(m mVar, int i) {
        m i2 = mVar.i(-1173704376);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1173704376, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents_Preview (LoadedPaywallComponents.kt:164)");
            }
            LoadedPaywallComponents(previewHelloWorldPaywallState(i2, 0), new 1(null), androidx.compose.foundation.layout.g.f(e.a, 0.0f, 1, (Object) null), i2, 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void LoadedPaywallComponents_Preview_Bless(m mVar, int i) {
        m i2 = mVar.i(-485118556);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-485118556, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponents_Preview_Bless (LoadedPaywallComponents.kt:215)");
            }
            r0.a aVar = r0.b;
            ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(s0.k(aVar.a())), new ColorInfo.Hex(s0.k(aVar.k())));
            ColorScheme colorScheme2 = new ColorScheme(new ColorInfo.Hex(s0.k(aVar.k())), new ColorInfo.Hex(s0.k(aVar.a())));
            URL url = new URL("https://assets.pawwalls.com");
            List e = Da.u.e(TestData.Components.INSTANCE.getMonthlyPackageComponent());
            TwoDimensionalAlignment twoDimensionalAlignment = TwoDimensionalAlignment.CENTER;
            Dimension.ZLayer zLayer = new Dimension.ZLayer(twoDimensionalAlignment);
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            StackComponent stackComponent = new StackComponent(e, (Boolean) null, zLayer, new Size(fill, fill), (Float) null, new ColorScheme(new ColorInfo.Gradient.Linear(60.0f, v.q(new ColorInfo.Gradient.Point(s0.k(s0.c(255, 255, 255, 255)), 40.0f), new ColorInfo.Gradient.Point(s0.k(s0.f(5, 124, 91, 0, 8, (Object) null)), 100.0f))), (ColorInfo) null, 2, (k) null), (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 32722, (k) null);
            String str = LocalizationKey.constructor-impl("title");
            FontWeight fontWeight = FontWeight.SEMI_BOLD;
            HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Offering offering = new Offering("id", "description", S.h(), Da.u.e(TestData.Packages.INSTANCE.getMonthly()), (PaywallData) null, new Offering.PaywallComponents(PreviewHelpersKt.previewUiConfig$default(null, null, null, 7, null), new PaywallComponentsData("preview_paywall_id", "template", url, new ComponentsConfig(new PaywallComponentsConfig(new StackComponent(v.q(stackComponent, new StackComponent(v.q(new TextComponent(str, colorScheme, (Boolean) null, (ColorScheme) null, (String) null, fontWeight, (Integer) null, 28, horizontalAlignment, new Size(fill, fit), (Padding) null, new Padding(0.0d, 40.0d, 0.0d, 0.0d), (List) null, 5212, (k) null), new TextComponent(LocalizationKey.constructor-impl("feature-1"), colorScheme, (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, horizontalAlignment, new Size(fill, fit), (Padding) null, new Padding(8.0d, 8.0d, 0.0d, 0.0d), (List) null, 5372, (k) null), new TextComponent(LocalizationKey.constructor-impl("feature-2"), colorScheme, (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, horizontalAlignment, new Size(fill, fit), (Padding) null, new Padding(8.0d, 8.0d, 0.0d, 0.0d), (List) null, 5372, (k) null), new TextComponent(LocalizationKey.constructor-impl("feature-3"), colorScheme, (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, horizontalAlignment, new Size(fill, fit), (Padding) null, new Padding(8.0d, 8.0d, 0.0d, 0.0d), (List) null, 5372, (k) null), new TextComponent(LocalizationKey.constructor-impl("feature-4"), colorScheme, (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, horizontalAlignment, new Size(fill, fit), (Padding) null, new Padding(8.0d, 8.0d, 0.0d, 0.0d), (List) null, 5372, (k) null), new TextComponent(LocalizationKey.constructor-impl("feature-5"), colorScheme, (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, horizontalAlignment, new Size(fill, fit), (Padding) null, new Padding(8.0d, 8.0d, 0.0d, 0.0d), (List) null, 5372, (k) null), new TextComponent(LocalizationKey.constructor-impl("feature-6"), colorScheme, (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, horizontalAlignment, new Size(fill, fit), (Padding) null, new Padding(8.0d, 8.0d, 0.0d, 0.0d), (List) null, 5372, (k) null), new TextComponent(LocalizationKey.constructor-impl("offer"), colorScheme, (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, horizontalAlignment, new Size(fill, fit), (Padding) null, new Padding(48.0d, 8.0d, 0.0d, 0.0d), (List) null, 5372, (k) null), new StackComponent(Da.u.e(new TextComponent(LocalizationKey.constructor-impl("cta"), new ColorScheme(new ColorInfo.Hex(s0.k(aVar.k())), (ColorInfo) null, 2, (k) null), (Boolean) null, (ColorScheme) null, (String) null, FontWeight.BOLD, (Integer) null, 0, (HorizontalAlignment) null, (Size) null, (Padding) null, (Padding) null, (List) null, 8156, (k) null)), (Boolean) null, new Dimension.ZLayer(twoDimensionalAlignment), new Size(fit, fit), (Float) null, new ColorScheme(new ColorInfo.Hex(s0.k(s0.f(5, 124, 91, 0, 8, (Object) null))), (ColorInfo) null, 2, (k) null), (Background) null, new Padding(8.0d, 8.0d, 32.0d, 32.0d), new Padding(8.0d, 8.0d, 0.0d, 0.0d), Shape.Pill.INSTANCE, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 31826, (k) null), new TextComponent(LocalizationKey.constructor-impl("terms"), colorScheme, (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, (HorizontalAlignment) null, (Size) null, (Padding) null, (Padding) null, (List) null, 8188, (k) null)), (Boolean) null, new Dimension.Vertical(horizontalAlignment, FlexDistribution.END), new Size(fill, fill), (Float) null, (ColorScheme) null, (Background) null, new Padding(16.0d, 16.0d, 32.0d, 32.0d), (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 32626, (k) null)), (Boolean) null, new Dimension.ZLayer(TwoDimensionalAlignment.BOTTOM), new Size(fill, fill), (Float) null, colorScheme2, (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 32722, (k) null), new Background.Color(colorScheme2), (StickyFooterComponent) null)), Q.f(x.a(LocaleId.box-impl(LocaleId.constructor-impl("en_US")), S.l(x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("title")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("Unlock bless."))), x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("feature-1")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("✓ Enjoy a 7 day trial"))), x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("feature-2")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("✓ Change currencies"))), x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("feature-3")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("✓ Access more trend charts"))), x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("feature-4")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("✓ Create custom categories"))), x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("feature-5")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("✓ Get a special premium icon"))), x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("feature-6")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("✓ Receive our love and gratitude for your support"))), x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("offer")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("Try 7 days free, then $19.98/year. Cancel anytime."))), x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("cta")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("Continue"))), x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("terms")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("Privacy & Terms")))))), LocaleId.constructor-impl("en_US"), 0, (List) null, (ExitOffers) null, (ProductChangeConfig) null, 960, (k) null)), (URL) null, 80, (k) null);
            i2 = i2;
            Result validatePaywallComponentsDataOrNullForPreviews = PreviewHelpersKt.validatePaywallComponentsDataOrNullForPreviews(offering, i2, 0);
            PaywallValidationResult.Components components = validatePaywallComponentsDataOrNullForPreviews != null ? (PaywallValidationResult.Components) ResultKt.getOrThrow(validatePaywallComponentsDataOrNullForPreviews) : null;
            t.d(components);
            LoadedPaywallComponents(OfferingToStateMapperKt.toComponentsPaywallState$default(offering, components, null, LoadedPaywallComponentsKt$LoadedPaywallComponents_Preview_Bless$state$1.INSTANCE, new MockPurchasesType(null, null, null, null, 15, null), null, null, 48, null), new 1(null), androidx.compose.foundation.layout.g.f(e.a, 0.0f, 1, (Object) null), i2, 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$LoadedPaywallComponents_BottomSheet_FitSize_Preview(m mVar, int i) {
        LoadedPaywallComponents_BottomSheet_FitSize_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$LoadedPaywallComponents_BottomSheet_NullSize_Preview(m mVar, int i) {
        LoadedPaywallComponents_BottomSheet_NullSize_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$LoadedPaywallComponents_Preview(m mVar, int i) {
        LoadedPaywallComponents_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$LoadedPaywallComponents_Preview_Bless(m mVar, int i) {
        LoadedPaywallComponents_Preview_Bless(mVar, i);
    }

    public static final /* synthetic */ Object access$handleClick(PaywallAction paywallAction, PaywallState.Loaded.Components components, p pVar, Ga.e eVar) {
        return handleClick(paywallAction, components, pVar, eVar);
    }

    private static final Object handleClick(PaywallAction paywallAction, PaywallState.Loaded.Components components, p pVar, Ga.e eVar) {
        if (paywallAction instanceof PaywallAction.External) {
            Object invoke = pVar.invoke(paywallAction, eVar);
            return invoke == Ha.c.f() ? invoke : I.a;
        }
        if ((paywallAction instanceof PaywallAction.Internal) && (((PaywallAction.Internal) paywallAction) instanceof PaywallAction.Internal.NavigateTo)) {
            PaywallAction.Internal.NavigateTo navigateTo = (PaywallAction.Internal.NavigateTo) paywallAction;
            if (navigateTo.getDestination() instanceof PaywallAction.Internal.NavigateTo.Destination.Sheet) {
                show(components.getSheet(), ((PaywallAction.Internal.NavigateTo.Destination.Sheet) navigateTo.getDestination()).getSheet(), components, new 2(components, pVar, null));
            }
        }
        return I.a;
    }

    private static final ButtonComponentStyle.Action.NavigateTo.Destination.Sheet previewBottomSheet(Size size) {
        List q = v.q(PreviewHelpersKt.previewTextComponentStyle$default("This is a bottom sheet.", null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, 65534, null), PreviewHelpersKt.previewTextComponentStyle$default("This is a bottom sheet.", null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, 65534, null), PreviewHelpersKt.previewTextComponentStyle$default("This is a bottom sheet.", null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, 65534, null));
        ColorStyles colorStyles = BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.k())), null, 2, null));
        return new ButtonComponentStyle.Action.NavigateTo.Destination.Sheet("", "", PreviewHelpersKt.previewStackComponentStyle-7SJ-wSw$default(q, null, false, null, 0.0f, BackgroundStyles.Color.box-impl(colorStyles), null, null, new Shape.Rectangle(new CornerRadiuses.Dp(16.0d, 16.0d, 0.0d, 0.0d)), null, null, null, null, null, null, 31966, null), true, size);
    }

    public static /* synthetic */ ButtonComponentStyle.Action.NavigateTo.Destination.Sheet previewBottomSheet$default(Size size, int i, Object obj) {
        if ((i & 1) != 0) {
            size = null;
        }
        return previewBottomSheet(size);
    }

    private static final PaywallState.Loaded.Components previewHelloWorldPaywallState(m mVar, int i) {
        mVar.V(-1486758699);
        if (w.L()) {
            w.U(-1486758699, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.previewHelloWorldPaywallState (LoadedPaywallComponents.kt:395)");
        }
        URL url = new URL("https://assets.pawwalls.com");
        String str = LocalizationKey.constructor-impl("hello-world");
        r0.a aVar = r0.b;
        List q = v.q(new TextComponent(str, new ColorScheme(new ColorInfo.Hex(s0.k(aVar.a())), (ColorInfo) null, 2, (k) null), (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, (HorizontalAlignment) null, (Size) null, (Padding) null, (Padding) null, (List) null, 8188, (k) null), TestData.Components.INSTANCE.getMonthlyPackageComponent());
        HorizontalAlignment horizontalAlignment = HorizontalAlignment.CENTER;
        FlexDistribution flexDistribution = FlexDistribution.START;
        Offering offering = new Offering("id", "description", S.h(), Da.u.e(TestData.Packages.INSTANCE.getMonthly()), (PaywallData) null, new Offering.PaywallComponents(PreviewHelpersKt.previewUiConfig$default(null, null, null, 7, null), new PaywallComponentsData("preview_paywall_id", "template", url, new ComponentsConfig(new PaywallComponentsConfig(new StackComponent(q, (Boolean) null, new Dimension.Vertical(horizontalAlignment, flexDistribution), (Size) null, (Float) null, new ColorScheme(new ColorInfo.Hex(s0.k(aVar.c())), (ColorInfo) null, 2, (k) null), (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 32730, (k) null), new Background.Color(new ColorScheme(new ColorInfo.Hex(s0.k(aVar.b())), new ColorInfo.Hex(s0.k(aVar.h())))), new StickyFooterComponent(new StackComponent(Da.u.e(new TextComponent(LocalizationKey.constructor-impl("sticky-footer"), new ColorScheme(new ColorInfo.Hex(s0.k(aVar.a())), (ColorInfo) null, 2, (k) null), (Boolean) null, (ColorScheme) null, (String) null, (FontWeight) null, (Integer) null, 0, (HorizontalAlignment) null, (Size) null, (Padding) null, (Padding) null, (List) null, 8188, (k) null)), (Boolean) null, new Dimension.Vertical(horizontalAlignment, flexDistribution), (Size) null, (Float) null, new ColorScheme(new ColorInfo.Hex(s0.k(aVar.k())), (ColorInfo) null, 2, (k) null), (Background) null, (Padding) null, (Padding) null, new Shape.Rectangle(new CornerRadiuses.Dp(10.0d, 10.0d, 0.0d, 0.0d)), (Border) null, new Shadow(new ColorScheme(new ColorInfo.Hex(s0.k(aVar.a())), new ColorInfo.Hex(s0.k(aVar.l()))), 10.0d, 0.0d, -5.0d), (Badge) null, (StackComponent.Overflow) null, (List) null, 30170, (k) null)))), Q.f(x.a(LocaleId.box-impl(LocaleId.constructor-impl("en_US")), S.l(x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("hello-world")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("Hello, world!"))), x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("sticky-footer")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("Sticky Footer")))))), LocaleId.constructor-impl("en_US"), 0, (List) null, (ExitOffers) null, (ProductChangeConfig) null, 960, (k) null)), (URL) null, 80, (k) null);
        Result validatePaywallComponentsDataOrNullForPreviews = PreviewHelpersKt.validatePaywallComponentsDataOrNullForPreviews(offering, mVar, 0);
        PaywallValidationResult.Components components = validatePaywallComponentsDataOrNullForPreviews != null ? (PaywallValidationResult.Components) ResultKt.getOrThrow(validatePaywallComponentsDataOrNullForPreviews) : null;
        t.d(components);
        PaywallState.Loaded.Components componentsPaywallState$default = OfferingToStateMapperKt.toComponentsPaywallState$default(offering, components, null, 1.INSTANCE, new MockPurchasesType(null, null, null, null, 15, null), null, null, 48, null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return componentsPaywallState$default;
    }

    private static final void show(SimpleSheetState simpleSheetState, ButtonComponentStyle.Action.NavigateTo.Destination.Sheet sheet, PaywallState.Loaded.Components components, p pVar) {
        simpleSheetState.show(sheet.getBackgroundBlur(), i.b(1290168816, true, new 1(sheet, components, simpleSheetState, pVar)), new 2(components));
    }
}

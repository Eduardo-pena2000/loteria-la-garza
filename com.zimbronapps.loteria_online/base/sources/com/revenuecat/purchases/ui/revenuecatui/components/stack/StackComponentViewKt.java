package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Ca.o;
import Ca.t;
import Da.M;
import Da.v;
import F.T;
import F.V;
import F.W;
import F.c;
import F.e0;
import F.h;
import Ha.c;
import Ia.f;
import M.b;
import M0.B;
import O0.g;
import Qa.l;
import Qa.p;
import Qa.q;
import Wa.i;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.y;
import b0.B1;
import b0.U1;
import b0.g1;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import d1.H;
import d1.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import l1.j;
import n1.d;
import v0.E1;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class StackComponentViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ e $innerShapeModifier;
        final /* synthetic */ e0 $safeDrawingInsets;
        final /* synthetic */ q $stack;
        final /* synthetic */ StackComponentState $stackState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(q qVar, e eVar, StackComponentState stackComponentState, e0 e0Var) {
            super(2);
            this.$stack = qVar;
            this.$innerShapeModifier = eVar;
            this.$stackState = stackComponentState;
            this.$safeDrawingInsets = e0Var;
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
                w.U(-2041007063, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.MainStackComponent.<anonymous> (StackComponentView.kt:633)");
            }
            q qVar = this.$stack;
            e then = e.a.then(this.$innerShapeModifier);
            boolean applyBottomWindowInsets = this.$stackState.getApplyBottomWindowInsets();
            mVar.V(-957923809);
            boolean U = mVar.U(this.$safeDrawingInsets);
            e0 e0Var = this.$safeDrawingInsets;
            Object C = mVar.C();
            if (U || C == m.a.a()) {
                C = new StackComponentViewKt$MainStackComponent$1$1$1(e0Var);
                mVar.t(C);
            }
            mVar.P();
            e conditional = ModifierExtensionsKt.conditional(then, applyBottomWindowInsets, (l) C);
            boolean applyHorizontalWindowInsets = this.$stackState.getApplyHorizontalWindowInsets();
            mVar.V(-957917309);
            boolean U2 = mVar.U(this.$safeDrawingInsets);
            e0 e0Var2 = this.$safeDrawingInsets;
            Object C2 = mVar.C();
            if (U2 || C2 == m.a.a()) {
                C2 = new StackComponentViewKt$MainStackComponent$1$2$1(e0Var2);
                mVar.t(C2);
            }
            mVar.P();
            qVar.invoke(ModifierExtensionsKt.conditional(conditional, applyHorizontalWindowInsets, (l) C2), mVar, 48);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 6 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ BadgeStyle $nestedBadge;
        final /* synthetic */ q $overlay;
        final /* synthetic */ boolean $shouldApplyShadow;
        final /* synthetic */ StackComponentState $stackState;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 6(StackComponentState stackComponentState, PaywallState.Loaded.Components components, p pVar, float f, e eVar, BadgeStyle badgeStyle, boolean z, q qVar, int i, int i2) {
            super(2);
            this.$stackState = stackComponentState;
            this.$state = components;
            this.$clickHandler = pVar;
            this.$contentAlpha = f;
            this.$modifier = eVar;
            this.$nestedBadge = badgeStyle;
            this.$shouldApplyShadow = z;
            this.$overlay = qVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$MainStackComponent(this.$stackState, this.$state, this.$clickHandler, this.$contentAlpha, this.$modifier, this.$nestedBadge, this.$shouldApplyShadow, this.$overlay, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$OverlaidBadge$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
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
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return I.a;
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TwoDimensionalAlignment $alignment;
        final /* synthetic */ StackComponentStyle $badgeStack;
        final /* synthetic */ Float $mainStackBorderWidthPx;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ h $this_OverlaidBadge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(h hVar, StackComponentStyle stackComponentStyle, PaywallState.Loaded.Components components, TwoDimensionalAlignment twoDimensionalAlignment, Float f, e eVar, int i, int i2) {
            super(2);
            this.$this_OverlaidBadge = hVar;
            this.$badgeStack = stackComponentStyle;
            this.$state = components;
            this.$alignment = twoDimensionalAlignment;
            this.$mainStackBorderWidthPx = f;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$OverlaidBadge(this.$this_OverlaidBadge, this.$badgeStack, this.$state, this.$alignment, this.$mainStackBorderWidthPx, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ StackComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(StackComponentStyle stackComponentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, float f, int i, int i2) {
            super(2);
            this.$style = stackComponentStyle;
            this.$state = components;
            this.$clickHandler = pVar;
            this.$modifier = eVar;
            this.$contentAlpha = f;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.StackComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, this.$contentAlpha, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ StackComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(StackComponentStyle stackComponentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, float f, int i, int i2) {
            super(2);
            this.$style = stackComponentStyle;
            this.$state = components;
            this.$clickHandler = pVar;
            this.$modifier = eVar;
            this.$contentAlpha = f;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.StackComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, this.$contentAlpha, mVar, g1.a(this.$$changed | 1), this.$$default);
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
            StackComponentViewKt.access$StackComponentView_Preview_Children_Extend_Over_Parent(mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_ContentAlpha$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
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
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
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
            StackComponentViewKt.access$StackComponentView_Preview_ContentAlpha(mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
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
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
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
            StackComponentViewKt.access$StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children(mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_With_Spacing$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
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
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return I.a;
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Dimension $dimension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Dimension dimension, int i) {
            super(2);
            this.$dimension = dimension;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$StackComponentView_Preview_Distribution_With_Spacing(this.$dimension, mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_Without_Spacing$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
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
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return I.a;
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Dimension $dimension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Dimension dimension, int i) {
            super(2);
            this.$dimension = dimension;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$StackComponentView_Preview_Distribution_Without_Spacing(this.$dimension, mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
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
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return I.a;
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Dimension $dimension;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Dimension dimension, int i) {
            super(2);
            this.$dimension = dimension;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size(this.$dimension, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TwoDimensionalAlignment $alignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(TwoDimensionalAlignment twoDimensionalAlignment, int i) {
            super(2);
            this.$alignment = twoDimensionalAlignment;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$StackComponentView_Preview_EdgeToEdge_Badge(this.$alignment, mVar, g1.a(this.$$changed | 1));
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
            StackComponentViewKt.access$StackComponentView_Preview_Horizontal(mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_HorizontalChildrenFillWidth$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
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
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
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
            StackComponentViewKt.access$StackComponentView_Preview_HorizontalChildrenFillWidth(mVar, g1.a(this.$$changed | 1));
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
            StackComponentViewKt.access$StackComponentView_Preview_HorizontalDivider(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TwoDimensionalAlignment $alignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(TwoDimensionalAlignment twoDimensionalAlignment, int i) {
            super(2);
            this.$alignment = twoDimensionalAlignment;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$StackComponentView_Preview_Nested_Badge(this.$alignment, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TwoDimensionalAlignment $alignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(TwoDimensionalAlignment twoDimensionalAlignment, int i) {
            super(2);
            this.$alignment = twoDimensionalAlignment;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$StackComponentView_Preview_Overlay_Badge(this.$alignment, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TwoDimensionalAlignment $alignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(TwoDimensionalAlignment twoDimensionalAlignment, int i) {
            super(2);
            this.$alignment = twoDimensionalAlignment;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$StackComponentView_Preview_Pill_EdgeToEdge_Badge(this.$alignment, mVar, g1.a(this.$$changed | 1));
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
            StackComponentViewKt.access$StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll(mVar, g1.a(this.$$changed | 1));
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
            StackComponentViewKt.access$StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll(mVar, g1.a(this.$$changed | 1));
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
            StackComponentViewKt.access$StackComponentView_Preview_Vertical(mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$StackComponentView_Preview_VerticalChildrenFillHeight$1", f = "StackComponentView.kt", l = {}, m = "invokeSuspend")
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
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
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
            StackComponentViewKt.access$StackComponentView_Preview_VerticalChildrenFillHeight(mVar, g1.a(this.$$changed | 1));
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
            StackComponentViewKt.access$StackComponentView_Preview_VerticalDivider(mVar, g1.a(this.$$changed | 1));
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
            StackComponentViewKt.access$StackComponentView_Preview_ZLayer(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ StackComponentStyle $badgeStack;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ StackComponentState $stackState;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ boolean $topBadge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(StackComponentState stackComponentState, PaywallState.Loaded.Components components, StackComponentStyle stackComponentStyle, boolean z, p pVar, float f, e eVar, int i, int i2) {
            super(2);
            this.$stackState = stackComponentState;
            this.$state = components;
            this.$badgeStack = stackComponentStyle;
            this.$topBadge = z;
            this.$clickHandler = pVar;
            this.$contentAlpha = f;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$StackWithLongEdgeToEdgeBadge(this.$stackState, this.$state, this.$badgeStack, this.$topBadge, this.$clickHandler, this.$contentAlpha, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TwoDimensionalAlignment $alignment;
        final /* synthetic */ StackComponentStyle $badgeStack;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ StackComponentState $stackState;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(StackComponentState stackComponentState, PaywallState.Loaded.Components components, StackComponentStyle stackComponentStyle, TwoDimensionalAlignment twoDimensionalAlignment, p pVar, float f, e eVar, int i, int i2) {
            super(2);
            this.$stackState = stackComponentState;
            this.$state = components;
            this.$badgeStack = stackComponentStyle;
            this.$alignment = twoDimensionalAlignment;
            this.$clickHandler = pVar;
            this.$contentAlpha = f;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$StackWithOverlaidBadge(this.$stackState, this.$state, this.$badgeStack, this.$alignment, this.$clickHandler, this.$contentAlpha, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements q {
        final /* synthetic */ CornerRadiuses $adjustedCornerRadiuses;
        final /* synthetic */ TwoDimensionalAlignment $alignment;
        final /* synthetic */ StackComponentStyle $badgeStack;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(StackComponentStyle stackComponentStyle, CornerRadiuses cornerRadiuses, PaywallState.Loaded.Components components, p pVar, TwoDimensionalAlignment twoDimensionalAlignment) {
            super(3);
            this.$badgeStack = stackComponentStyle;
            this.$adjustedCornerRadiuses = cornerRadiuses;
            this.$state = components;
            this.$clickHandler = pVar;
            this.$alignment = twoDimensionalAlignment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(h MainStackComponent, m mVar, int i) {
            int i2;
            kotlin.jvm.internal.t.g(MainStackComponent, "$this$MainStackComponent");
            if ((i & 6) == 0) {
                i2 = i | (mVar.U(MainStackComponent) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-1023039340, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackWithShortEdgeToEdgeBadge.<anonymous> (StackComponentView.kt:440)");
            }
            StackComponentViewKt.StackComponentView(StackComponentStyle.copy-KMZiVUk$default(this.$badgeStack, null, null, false, null, 0.0f, null, null, null, new Shape.Rectangle(this.$adjustedCornerRadiuses), null, null, null, null, null, null, null, null, null, null, null, false, false, false, 8388351, null), this.$state, this.$clickHandler, MainStackComponent.a(e.a, AlignmentKt.toAlignment(this.$alignment)), 0.0f, mVar, 0, 16);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TwoDimensionalAlignment $alignment;
        final /* synthetic */ StackComponentStyle $badgeStack;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e $modifier;
        final /* synthetic */ StackComponentState $stackState;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(StackComponentState stackComponentState, PaywallState.Loaded.Components components, StackComponentStyle stackComponentStyle, TwoDimensionalAlignment twoDimensionalAlignment, p pVar, float f, e eVar, int i, int i2) {
            super(2);
            this.$stackState = stackComponentState;
            this.$state = components;
            this.$badgeStack = stackComponentStyle;
            this.$alignment = twoDimensionalAlignment;
            this.$clickHandler = pVar;
            this.$contentAlpha = f;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StackComponentViewKt.access$StackWithShortEdgeToEdgeBadge(this.$stackState, this.$state, this.$badgeStack, this.$alignment, this.$clickHandler, this.$contentAlpha, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[TwoDimensionalAlignment.values().length];
            try {
                iArr[TwoDimensionalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TwoDimensionalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TwoDimensionalAlignment.TOP_LEADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TwoDimensionalAlignment.TOP_TRAILING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TwoDimensionalAlignment.BOTTOM_LEADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TwoDimensionalAlignment.BOTTOM_TRAILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TwoDimensionalAlignment.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TwoDimensionalAlignment.LEADING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TwoDimensionalAlignment.TRAILING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Badge.Style.values().length];
            try {
                iArr2[Badge.Style.Overlay.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Badge.Style.EdgeToEdge.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Badge.Style.Nested.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FlexDistribution.values().length];
            try {
                iArr3[FlexDistribution.SPACE_AROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[FlexDistribution.SPACE_BETWEEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[FlexDistribution.SPACE_EVENLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[FlexDistribution.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[FlexDistribution.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[FlexDistribution.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x050e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void MainStackComponent(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState r27, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r28, Qa.p r29, float r30, androidx.compose.ui.e r31, com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle r32, boolean r33, Qa.q r34, b0.m r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.MainStackComponent(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, Qa.p, float, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle, boolean, Qa.q, b0.m, int, int):void");
    }

    private static final E1 MainStackComponent$lambda$10(h2 h2Var) {
        return (E1) h2Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void OverlaidBadge(F.h r17, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle r18, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r19, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment r20, java.lang.Float r21, androidx.compose.ui.e r22, b0.m r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.OverlaidBadge(F.h, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment, java.lang.Float, androidx.compose.ui.e, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void StackComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle r19, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r20, Qa.p r21, androidx.compose.ui.e r22, float r23, b0.m r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.StackComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, Qa.p, androidx.compose.ui.e, float, b0.m, int, int):void");
    }

    private static final void StackComponentView_Preview_Children_Extend_Over_Parent(m mVar, int i) {
        m i2 = mVar.i(-1849301685);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1849301685, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Children_Extend_Over_Parent (StackComponentView.kt:1122)");
            }
            e i3 = androidx.compose.foundation.layout.f.i(e.a, n1.h.g(32));
            r0.a aVar = r0.b;
            e d = a.d(i3, aVar.e(), (E1) null, 2, (Object) null);
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = androidx.compose.ui.c.f(i2, d);
            g.a aVar2 = g.E8;
            Qa.a a2 = aVar2.a();
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
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            float f2 = 0;
            List e = Da.u.e(PreviewHelpersKt.previewStackComponentStyle-7SJ-wSw$default(previewChildren(i2, 0), null, false, null, 0.0f, null, null, null, null, null, new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.a())), null, 2, null), n1.h.g(10), n1.h.g(f2), n1.h.g(3), null), previewBadge$default(Badge.Style.Overlay, TwoDimensionalAlignment.TOP_TRAILING, new Shape.Rectangle((CornerRadiuses) null, 1, (k) null), null, null, 24, null), null, null, null, 29694, null));
            Dimension.Horizontal horizontal = new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            float f3 = 16;
            StackComponentView(new StackComponentStyle(e, horizontal, true, new Size(fit, fit), n1.h.g(f3), BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l()))))), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), androidx.compose.foundation.layout.f.a(n1.h.g(f3)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Children_Extend_Over_Parent$1$1(null), null, 0.0f, i2, 384, 24);
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

    private static final void StackComponentView_Preview_ContentAlpha(m mVar, int i) {
        m i2 = mVar.i(-1355314342);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1355314342, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_ContentAlpha (StackComponentView.kt:1674)");
            }
            StackComponentView(PreviewHelpersKt.previewStackComponentStyle-7SJ-wSw$default(previewChildren(i2, 0), null, false, null, 0.0f, null, null, null, null, null, null, null, null, null, null, 32766, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new 1(null), null, 0.6f, i2, 24960, 8);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children(m mVar, int i) {
        m i2 = mVar.i(-2040912590);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-2040912590, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children (StackComponentView.kt:1506)");
            }
            r0.a aVar = r0.b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l())), null, 2, null);
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            StackComponentView(new StackComponentStyle(v.q(PreviewHelpersKt.previewTextComponentStyle$default("Hello", null, 0, null, null, null, null, colorStyles, false, new Size(fill, fit), null, null, null, null, null, null, 64894, null), PreviewHelpersKt.previewTextComponentStyle$default("SPACE_AROUND", null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.f())), null, 2, null), false, new Size(fit, fit), null, null, null, null, null, null, 64894, null), PreviewHelpersKt.previewTextComponentStyle$default("World", null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null), false, new Size(fit, fit), null, null, null, null, null, null, 64894, null)), new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.SPACE_AROUND), true, new Size(new SizeConstraint.Fixed(300, (k) null), new SizeConstraint.Fixed(300, (k) null)), n1.h.g(8), BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), null, 2, null))), androidx.compose.foundation.layout.f.a(n1.h.g(0)), androidx.compose.foundation.layout.f.a(n1.h.g(16)), new Shape.Rectangle((CornerRadiuses) null, 1, (k) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new 1(null), null, 0.0f, i2, 384, 24);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void StackComponentView_Preview_Distribution_With_Spacing(Dimension dimension, m mVar, int i) {
        int i2;
        FlexDistribution flexDistribution;
        String str;
        m mVar2;
        m i3 = mVar.i(-2060177158);
        if ((i & 6) == 0) {
            i2 = (i3.U(dimension) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(-2060177158, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Distribution_With_Spacing (StackComponentView.kt:1557)");
            }
            if (dimension instanceof Dimension.Horizontal) {
                flexDistribution = ((Dimension.Horizontal) dimension).getDistribution();
            } else if (dimension instanceof Dimension.Vertical) {
                flexDistribution = ((Dimension.Vertical) dimension).getDistribution();
            } else {
                if (!(dimension instanceof Dimension.ZLayer)) {
                    throw new o();
                }
                flexDistribution = null;
            }
            r0.a aVar = r0.b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentStyle previewTextComponentStyle$default = PreviewHelpersKt.previewTextComponentStyle$default("Hello", null, 0, null, null, null, null, colorStyles, false, new Size(fit, fit), null, null, null, null, null, null, 64894, null);
            if (flexDistribution == null || (str = flexDistribution.name()) == null) {
                str = "null";
            }
            float f = 16;
            mVar2 = i3;
            StackComponentView(new StackComponentStyle(v.q(previewTextComponentStyle$default, PreviewHelpersKt.previewTextComponentStyle$default(str, null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.f())), null, 2, null), false, new Size(fit, fit), null, null, null, null, null, null, 64894, null), PreviewHelpersKt.previewTextComponentStyle$default("World", null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null), false, new Size(fit, fit), null, null, null, null, null, null, 64894, null)), dimension, true, new Size(new SizeConstraint.Fixed(300, (k) null), new SizeConstraint.Fixed(300, (k) null)), n1.h.g(f), BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), null, 2, null))), androidx.compose.foundation.layout.f.a(n1.h.g(0)), androidx.compose.foundation.layout.f.a(n1.h.g(f)), new Shape.Rectangle((CornerRadiuses) null, 1, (k) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, mVar2, 0, 1), new 1(null), null, 0.0f, mVar2, 384, 24);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(dimension, i));
        }
    }

    private static final void StackComponentView_Preview_Distribution_Without_Spacing(Dimension dimension, m mVar, int i) {
        int i2;
        FlexDistribution flexDistribution;
        String str;
        m mVar2;
        m i3 = mVar.i(-1146712254);
        if ((i & 6) == 0) {
            i2 = (i3.U(dimension) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(-1146712254, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Distribution_Without_Spacing (StackComponentView.kt:1455)");
            }
            if (dimension instanceof Dimension.Horizontal) {
                flexDistribution = ((Dimension.Horizontal) dimension).getDistribution();
            } else if (dimension instanceof Dimension.Vertical) {
                flexDistribution = ((Dimension.Vertical) dimension).getDistribution();
            } else {
                if (!(dimension instanceof Dimension.ZLayer)) {
                    throw new o();
                }
                flexDistribution = null;
            }
            r0.a aVar = r0.b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentStyle previewTextComponentStyle$default = PreviewHelpersKt.previewTextComponentStyle$default("Hello", null, 0, null, null, null, null, colorStyles, false, new Size(fit, fit), null, null, null, null, null, null, 64894, null);
            if (flexDistribution == null || (str = flexDistribution.name()) == null) {
                str = "null";
            }
            float f = 0;
            mVar2 = i3;
            StackComponentView(new StackComponentStyle(v.q(previewTextComponentStyle$default, PreviewHelpersKt.previewTextComponentStyle$default(str, null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.f())), null, 2, null), false, new Size(fit, fit), null, null, null, null, null, null, 64894, null), PreviewHelpersKt.previewTextComponentStyle$default("World", null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null), false, new Size(fit, fit), null, null, null, null, null, null, 64894, null)), dimension, true, new Size(new SizeConstraint.Fixed(300, (k) null), new SizeConstraint.Fixed(300, (k) null)), n1.h.g(f), BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), null, 2, null))), androidx.compose.foundation.layout.f.a(n1.h.g(f)), androidx.compose.foundation.layout.f.a(n1.h.g(16)), new Shape.Rectangle((CornerRadiuses) null, 1, (k) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, mVar2, 0, 1), new 1(null), null, 0.0f, mVar2, 384, 24);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(dimension, i));
        }
    }

    private static final void StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size(Dimension dimension, m mVar, int i) {
        int i2;
        FlexDistribution flexDistribution;
        String str;
        m mVar2;
        m i3 = mVar.i(585047730);
        if ((i & 6) == 0) {
            i2 = (i3.U(dimension) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(585047730, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size (StackComponentView.kt:1402)");
            }
            if (dimension instanceof Dimension.Horizontal) {
                flexDistribution = ((Dimension.Horizontal) dimension).getDistribution();
            } else if (dimension instanceof Dimension.Vertical) {
                flexDistribution = ((Dimension.Vertical) dimension).getDistribution();
            } else {
                if (!(dimension instanceof Dimension.ZLayer)) {
                    throw new o();
                }
                flexDistribution = null;
            }
            r0.a aVar = r0.b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentStyle previewTextComponentStyle$default = PreviewHelpersKt.previewTextComponentStyle$default("Hello", null, 0, null, null, null, null, colorStyles, false, new Size(fit, fit), null, null, null, null, null, null, 64894, null);
            if (flexDistribution == null || (str = flexDistribution.name()) == null) {
                str = "null";
            }
            float f = 0;
            mVar2 = i3;
            StackComponentView(new StackComponentStyle(v.q(previewTextComponentStyle$default, PreviewHelpersKt.previewTextComponentStyle$default(str, null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.f())), null, 2, null), false, new Size(fit, fit), null, null, null, null, null, null, 64894, null), PreviewHelpersKt.previewTextComponentStyle$default("World", null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null), false, new Size(fit, fit), null, null, null, null, null, null, 64894, null)), dimension, true, new Size(fit, fit), n1.h.g(f), BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), null, 2, null))), androidx.compose.foundation.layout.f.a(n1.h.g(f)), androidx.compose.foundation.layout.f.a(n1.h.g(16)), new Shape.Rectangle((CornerRadiuses) null, 1, (k) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, mVar2, 0, 1), new 1(null), null, 0.0f, mVar2, 384, 24);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(dimension, i));
        }
    }

    private static final void StackComponentView_Preview_EdgeToEdge_Badge(TwoDimensionalAlignment twoDimensionalAlignment, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1687690690);
        if ((i & 6) == 0) {
            i2 = (i3.U(twoDimensionalAlignment) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1687690690, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_EdgeToEdge_Badge (StackComponentView.kt:947)");
            }
            e i4 = androidx.compose.foundation.layout.f.i(e.a, n1.h.g(32));
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            e f = androidx.compose.ui.c.f(i3, i4);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
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
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            mVar2 = i3;
            StackComponentView(PreviewHelpersKt.previewStackComponentStyle-7SJ-wSw$default(previewChildren(i3, 0), null, false, null, 0.0f, null, null, null, null, null, new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null), n1.h.g(20), n1.h.g(0), n1.h.g(5), null), previewBadge$default(Badge.Style.EdgeToEdge, twoDimensionalAlignment, new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), null, null, 24, null), null, null, null, 29694, null), PreviewHelpersKt.previewEmptyState(null, i3, 0, 1), new StackComponentViewKt$StackComponentView_Preview_EdgeToEdge_Badge$1$1(null), null, 0.0f, i3, 384, 24);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(twoDimensionalAlignment, i));
        }
    }

    private static final void StackComponentView_Preview_Horizontal(m mVar, int i) {
        m i2 = mVar.i(537558075);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(537558075, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Horizontal (StackComponentView.kt:1076)");
            }
            e i3 = androidx.compose.foundation.layout.f.i(e.a, n1.h.g(32));
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = androidx.compose.ui.c.f(i2, i3);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
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
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            List previewChildren = previewChildren(i2, 0);
            Dimension.Horizontal horizontal = new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit, fit);
            float f2 = 16;
            float g = n1.h.g(f2);
            r0.a aVar2 = r0.b;
            StackComponentView(new StackComponentStyle(previewChildren, horizontal, true, size, g, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.h())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.l()))))), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(n1.h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.a())), null, 2, null), n1.h.g(30), n1.h.g(0), n1.h.g(5), null), null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Horizontal$1$1(null), null, 0.0f, i2, 384, 24);
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

    private static final void StackComponentView_Preview_HorizontalChildrenFillWidth(m mVar, int i) {
        m i2 = mVar.i(94466939);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(94466939, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_HorizontalChildrenFillWidth (StackComponentView.kt:1302)");
            }
            r0.a aVar = r0.b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l())), null, 2, null);
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            List q = v.q(PreviewHelpersKt.previewTextComponentStyle$default("Hello", null, 0, null, null, null, null, colorStyles, false, new Size(fill, fit), null, null, null, null, null, null, 64894, null), PreviewHelpersKt.previewTextComponentStyle$default("World", null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null), false, new Size(fill, fit), null, null, null, null, null, null, 64894, null));
            Dimension.Horizontal horizontal = new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.START);
            Size size = new Size(new SizeConstraint.Fixed(200, (k) null), fit);
            float f = 16;
            float g = n1.h.g(f);
            ColorStyles colorStyles2 = BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), null, 2, null));
            StackComponentView(new StackComponentStyle(q, horizontal, true, size, g, BackgroundStyles.Color.box-impl(colorStyles2), androidx.compose.foundation.layout.f.a(n1.h.g(f)), androidx.compose.foundation.layout.f.a(n1.h.g(f)), new Shape.Rectangle((CornerRadiuses) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new 1(null), null, 0.0f, i2, 384, 24);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void StackComponentView_Preview_HorizontalDivider(m mVar, int i) {
        m mVar2;
        m i2 = mVar.i(1466582790);
        if (i == 0 && i2.j()) {
            i2.M();
            mVar2 = i2;
        } else {
            if (w.L()) {
                w.U(1466582790, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_HorizontalDivider (StackComponentView.kt:1608)");
            }
            c.f f = F.c.a.f();
            e.a aVar = e.a;
            B a = F.l.a(f, o0.e.a.k(), i2, 6);
            int a2 = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f2 = androidx.compose.ui.c.f(i2, aVar);
            g.a aVar2 = g.E8;
            Qa.a a3 = aVar2.a();
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
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f2, aVar2.f());
            F.o oVar = F.o.a;
            m0.b("There should be a divider below this text.", (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (l1.k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, i2, 6, 0, 131070);
            StackComponentView(PreviewHelpersKt.previewStackComponentStyle-7SJ-wSw$default(v.n(), new Dimension.Vertical(HorizontalAlignment.LEADING, FlexDistribution.SPACE_BETWEEN), true, new Size(SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fixed(1, (k) null)), n1.h.g(0), BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(s0.f(200, 200, 200, 0, 8, (Object) null))), null, 2, null))), null, androidx.compose.foundation.layout.f.c(0.0f, n1.h.g(40), 1, (Object) null), null, null, null, null, null, null, null, 32064, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new StackComponentViewKt$StackComponentView_Preview_HorizontalDivider$1$1(null), null, 0.0f, i2, 384, 24);
            mVar2 = i2;
            m0.b("There should be a divider above this text.", (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (l1.k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar2, 6, 0, 131070);
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

    private static final void StackComponentView_Preview_Nested_Badge(TwoDimensionalAlignment twoDimensionalAlignment, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(-1890270268);
        if ((i & 6) == 0) {
            i2 = (i3.U(twoDimensionalAlignment) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(-1890270268, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Nested_Badge (StackComponentView.kt:1022)");
            }
            e i4 = androidx.compose.foundation.layout.f.i(e.a, n1.h.g(32));
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            e f = androidx.compose.ui.c.f(i3, i4);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
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
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            Shape.Rectangle rectangle = new Shape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d));
            List previewChildren = previewChildren(i3, 0);
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            Size size = new Size(new SizeConstraint.Fixed(200, (k) null), SizeConstraint.Fit.INSTANCE);
            float g = n1.h.g(16);
            r0.a aVar2 = r0.b;
            BackgroundStyles.Color color = BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.h())), null, 2, null)));
            float f2 = 20;
            F.L a3 = androidx.compose.foundation.layout.f.a(n1.h.g(f2));
            float f3 = 0;
            mVar2 = i3;
            StackComponentView(new StackComponentStyle(previewChildren, vertical, true, size, g, color, a3, androidx.compose.foundation.layout.f.a(n1.h.g(f3)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(n1.h.g(10), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.l())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.a())), null, 2, null), n1.h.g(f2), n1.h.g(f3), n1.h.g(5), null), previewBadge$default(Badge.Style.Nested, twoDimensionalAlignment, rectangle, null, null, 24, null), null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i3, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Nested_Badge$1$1(null), null, 0.0f, i3, 384, 24);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(twoDimensionalAlignment, i));
        }
    }

    private static final void StackComponentView_Preview_Overlay_Badge(TwoDimensionalAlignment twoDimensionalAlignment, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1927454081);
        if ((i & 6) == 0) {
            i2 = (i3.U(twoDimensionalAlignment) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1927454081, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Overlay_Badge (StackComponentView.kt:887)");
            }
            e i4 = androidx.compose.foundation.layout.f.i(e.a, n1.h.g(32));
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            e f = androidx.compose.ui.c.f(i3, i4);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
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
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            Shape.Rectangle rectangle = new Shape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d));
            List previewChildren = previewChildren(i3, 0);
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            Size size = new Size(new SizeConstraint.Fixed(200, (k) null), SizeConstraint.Fit.INSTANCE);
            float g = n1.h.g(16);
            r0.a aVar2 = r0.b;
            float f2 = 12;
            mVar2 = i3;
            StackComponentView(new StackComponentStyle(previewChildren, vertical, true, size, g, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.h())), null, 2, null))), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(n1.h.g(10), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.a())), null, 2, null), n1.h.g(20), n1.h.g(0), n1.h.g(5), null), previewBadge$default(Badge.Style.Overlay, twoDimensionalAlignment, rectangle, null, androidx.compose.foundation.layout.f.c(n1.h.g(8), 0.0f, 2, (Object) null), 8, null), null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i3, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Overlay_Badge$1$1(null), null, 0.0f, i3, 384, 24);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(twoDimensionalAlignment, i));
        }
    }

    private static final void StackComponentView_Preview_Pill_EdgeToEdge_Badge(TwoDimensionalAlignment twoDimensionalAlignment, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1484368524);
        if ((i & 6) == 0) {
            i2 = (i3.U(twoDimensionalAlignment) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1484368524, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Pill_EdgeToEdge_Badge (StackComponentView.kt:975)");
            }
            e i4 = androidx.compose.foundation.layout.f.i(e.a, n1.h.g(32));
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            e f = androidx.compose.ui.c.f(i3, i4);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
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
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            List previewChildren = previewChildren(i3, 0);
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            Size size = new Size(new SizeConstraint.Fixed(200, (k) null), SizeConstraint.Fit.INSTANCE);
            float g = n1.h.g(16);
            r0.a aVar2 = r0.b;
            BackgroundStyles.Color color = BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.h())), null, 2, null)));
            float f2 = 0;
            F.L a3 = androidx.compose.foundation.layout.f.a(n1.h.g(f2));
            F.L a4 = androidx.compose.foundation.layout.f.a(n1.h.g(f2));
            Shape.Pill pill = Shape.Pill.INSTANCE;
            mVar2 = i3;
            StackComponentView(new StackComponentStyle(previewChildren, vertical, true, size, g, color, a3, a4, pill, new BorderStyles(n1.h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.a())), null, 2, null), n1.h.g(20), n1.h.g(f2), n1.h.g(5), null), previewBadge$default(Badge.Style.EdgeToEdge, twoDimensionalAlignment, pill, null, null, 24, null), null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i3, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Pill_EdgeToEdge_Badge$1$1(null), null, 0.0f, i3, 384, 24);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(twoDimensionalAlignment, i));
        }
    }

    private static final void StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll(m mVar, int i) {
        m i2 = mVar.i(-889520099);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-889520099, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll (StackComponentView.kt:1181)");
            }
            i iVar = new i(0, 10);
            ArrayList arrayList = new ArrayList(Da.w.y(iVar, 10));
            Iterator it = iVar.iterator();
            while (it.hasNext()) {
                String str = "Hello " + ((M) it).a();
                ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.b())), null, 2, null);
                SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
                arrayList.add(PreviewHelpersKt.previewTextComponentStyle$default(str, null, 0, null, null, null, null, colorStyles, true, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), null, null, null, null, null, 63614, null));
            }
            e i3 = androidx.compose.foundation.layout.f.i(e.a, n1.h.g(32));
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = androidx.compose.ui.c.f(i2, i3);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
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
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            Dimension.Horizontal horizontal = new Dimension.Horizontal(VerticalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit2 = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit2, fit2);
            float f2 = 16;
            float g = n1.h.g(f2);
            r0.a aVar2 = r0.b;
            StackComponentView(new StackComponentStyle(arrayList, horizontal, true, size, g, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.h())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.l()))))), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(n1.h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.a())), null, 2, null), n1.h.g(10), n1.h.g(0), n1.h.g(5), null), null, C.q.b, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll$1$1(null), null, 0.0f, i2, 384, 24);
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

    private static final void StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll(m mVar, int i) {
        m i2 = mVar.i(-99980615);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-99980615, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll (StackComponentView.kt:817)");
            }
            i iVar = new i(0, 30);
            ArrayList arrayList = new ArrayList(Da.w.y(iVar, 10));
            Iterator it = iVar.iterator();
            while (it.hasNext()) {
                String str = "Hello " + ((M) it).a();
                ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.b())), null, 2, null);
                SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
                arrayList.add(PreviewHelpersKt.previewTextComponentStyle$default(str, null, 0, null, null, null, null, colorStyles, true, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), null, null, null, null, null, 63614, null));
            }
            e i3 = androidx.compose.foundation.layout.f.i(e.a, n1.h.g(32));
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = androidx.compose.ui.c.f(i2, i3);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
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
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit2 = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit2, fit2);
            float f2 = 16;
            float g = n1.h.g(f2);
            r0.a aVar2 = r0.b;
            StackComponentView(new StackComponentStyle(arrayList, vertical, true, size, g, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.h())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.l()))))), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(n1.h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.a())), null, 2, null), n1.h.g(10), n1.h.g(0), n1.h.g(3), null), null, C.q.a, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll$1$1(null), null, 0.0f, i2, 384, 24);
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

    private static final void StackComponentView_Preview_Vertical(m mVar, int i) {
        m i2 = mVar.i(1372631849);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1372631849, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_Vertical (StackComponentView.kt:770)");
            }
            e i3 = androidx.compose.foundation.layout.f.i(e.a, n1.h.g(32));
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = androidx.compose.ui.c.f(i2, i3);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
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
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            List previewChildren = previewChildren(i2, 0);
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size size = new Size(fit, fit);
            float f2 = 16;
            float g = n1.h.g(f2);
            r0.a aVar2 = r0.b;
            StackComponentView(new StackComponentStyle(previewChildren, vertical, true, size, g, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.h())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.l()))))), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(n1.h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.a())), null, 2, null), n1.h.g(10), n1.h.g(0), n1.h.g(3), null), null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new StackComponentViewKt$StackComponentView_Preview_Vertical$1$1(null), null, 0.0f, i2, 384, 24);
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

    private static final void StackComponentView_Preview_VerticalChildrenFillHeight(m mVar, int i) {
        m i2 = mVar.i(89883392);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(89883392, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_VerticalChildrenFillHeight (StackComponentView.kt:1345)");
            }
            r0.a aVar = r0.b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.l())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            List q = v.q(PreviewHelpersKt.previewTextComponentStyle$default("Hello", null, 0, null, null, null, null, colorStyles, false, new Size(fit, fill), null, null, null, null, null, null, 64894, null), PreviewHelpersKt.previewTextComponentStyle$default("World", null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null), false, new Size(fit, fill), null, null, null, null, null, null, 64894, null));
            Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
            Size size = new Size(fit, new SizeConstraint.Fixed(200, (k) null));
            float f = 16;
            float g = n1.h.g(f);
            ColorStyles colorStyles2 = BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.h())), null, 2, null));
            StackComponentView(new StackComponentStyle(q, vertical, true, size, g, BackgroundStyles.Color.box-impl(colorStyles2), androidx.compose.foundation.layout.f.a(n1.h.g(f)), androidx.compose.foundation.layout.f.a(n1.h.g(f)), new Shape.Rectangle((CornerRadiuses) null, 1, (k) null), null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new 1(null), null, 0.0f, i2, 384, 24);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void StackComponentView_Preview_VerticalDivider(m mVar, int i) {
        m mVar2;
        m i2 = mVar.i(-843904936);
        if (i == 0 && i2.j()) {
            i2.M();
            mVar2 = i2;
        } else {
            if (w.L()) {
                w.U(-843904936, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_VerticalDivider (StackComponentView.kt:1639)");
            }
            e.a aVar = e.a;
            e i3 = androidx.compose.foundation.layout.g.i(aVar, n1.h.g(100));
            B b = T.b(F.c.a.f(), o0.e.a.l(), i2, 6);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = androidx.compose.ui.c.f(i2, i3);
            g.a aVar2 = g.E8;
            Qa.a a2 = aVar2.a();
            if (i2.k() == null) {
                b0.h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a2);
            } else {
                i2.s();
            }
            m b2 = m2.b(i2);
            m2.e(b2, b, aVar2.e());
            m2.e(b2, r, aVar2.g());
            p b3 = aVar2.b();
            if (b2.f() || !kotlin.jvm.internal.t.c(b2.C(), Integer.valueOf(a))) {
                b2.t(Integer.valueOf(a));
                b2.J(Integer.valueOf(a), b3);
            }
            m2.e(b2, f, aVar2.f());
            W w = W.a;
            m0.b("There should be a divider to the right of this text.", V.c(w, aVar, 1.0f, false, 2, (Object) null), 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (l1.k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, i2, 6, 0, 131068);
            StackComponentView(PreviewHelpersKt.previewStackComponentStyle-7SJ-wSw$default(v.n(), new Dimension.Horizontal(VerticalAlignment.TOP, FlexDistribution.SPACE_BETWEEN), true, new Size(new SizeConstraint.Fixed(1, (k) null), SizeConstraint.Fill.INSTANCE), n1.h.g(0), BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(s0.f(200, 200, 200, 0, 8, (Object) null))), null, 2, null))), null, androidx.compose.foundation.layout.f.c(n1.h.g(40), 0.0f, 2, (Object) null), null, null, null, null, null, null, null, 32064, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new StackComponentViewKt$StackComponentView_Preview_VerticalDivider$1$1(null), null, 0.0f, i2, 384, 24);
            e c = V.c(w, aVar, 1.0f, false, 2, (Object) null);
            mVar2 = i2;
            m0.b("There should be a divider to the left of this text.", c, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (l1.k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar2, 6, 0, 131068);
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

    private static final void StackComponentView_Preview_ZLayer(m mVar, int i) {
        m i2 = mVar.i(665263624);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(665263624, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentView_Preview_ZLayer (StackComponentView.kt:1240)");
            }
            e i3 = androidx.compose.foundation.layout.f.i(e.a, n1.h.g(32));
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = androidx.compose.ui.c.f(i2, i3);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
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
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            r0.a aVar2 = r0.b;
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.l())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.h())));
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            float f2 = 16;
            float f3 = 5;
            StackComponentView(new StackComponentStyle(v.q(PreviewHelpersKt.previewTextComponentStyle$default("Hello", null, 0, null, null, null, null, colorStyles, false, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), new Padding(0.0d, 24.0d, 0.0d, 24.0d), null, null, null, null, 61822, null), PreviewHelpersKt.previewTextComponentStyle$default("World", null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.b())), null, 2, null), false, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), null, null, null, null, null, 63870, null)), new Dimension.ZLayer(TwoDimensionalAlignment.BOTTOM_TRAILING), true, new Size(fit, fit), n1.h.g(f2), BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.h())), ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.l()))))), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), androidx.compose.foundation.layout.f.a(n1.h.g(f2)), new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)), new BorderStyles(n1.h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.b())), null, 2, null), null), new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.a())), null, 2, null), n1.h.g(20), n1.h.g(f3), n1.h.g(f3), null), null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new StackComponentViewKt$StackComponentView_Preview_ZLayer$1$1(null), null, 0.0f, i2, 384, 24);
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

    private static final void StackWithLongEdgeToEdgeBadge(StackComponentState stackComponentState, PaywallState.Loaded.Components components, StackComponentStyle stackComponentStyle, boolean z, p pVar, float f, e eVar, m mVar, int i, int i2) {
        int i3;
        e eVar2;
        e eVar3;
        int i4;
        e eVar4;
        m i5 = mVar.i(770835511);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i5.U(stackComponentState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i5.U(components) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i5.U(stackComponentStyle) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= i5.a(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= i5.E(pVar) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= i5.c(f) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            if ((i & 1572864) == 0) {
                i3 |= i5.U(eVar2) ? 1048576 : 524288;
            }
        }
        if ((i3 & 599187) == 599186 && i5.j()) {
            i5.M();
            eVar4 = eVar2;
        } else {
            e eVar5 = i6 != 0 ? e.a : eVar2;
            if (w.L()) {
                w.U(770835511, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackWithLongEdgeToEdgeBadge (StackComponentView.kt:205)");
            }
            ShadowStyles shadow = stackComponentState.getShadow();
            i5.V(-2045177503);
            ShadowStyle rememberShadowStyle = shadow == null ? null : ShadowStyleKt.rememberShadowStyle(shadow, i5, 0);
            i5.P();
            Shape shape = stackComponentState.getShape();
            i5.V(-2045175387);
            boolean U = i5.U(shape);
            Object C = i5.C();
            if (U || C == m.a.a()) {
                C = U1.c(new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$composeShape$2$1(stackComponentState));
                i5.t(C);
            }
            h2 h2Var = (h2) C;
            i5.P();
            i5.V(-2045170027);
            boolean U2 = i5.U(h2Var);
            Object C2 = i5.C();
            if (U2 || C2 == m.a.a()) {
                C2 = new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$1$1(h2Var);
                i5.t(C2);
            }
            i5.P();
            e applyIfNotNull = ModifierExtensionsKt.applyIfNotNull(eVar5, rememberShadowStyle, (p) C2);
            i5.V(-2045161629);
            boolean E = ((i3 & 14) == 4) | ((i3 & 112) == 32) | i5.E(pVar) | ((458752 & i3) == 131072) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object C3 = i5.C();
            if (E || C3 == m.a.a()) {
                eVar3 = applyIfNotNull;
                i4 = 0;
                StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1 stackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1 = new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1(stackComponentState, components, pVar, f, stackComponentStyle, z);
                i5.t(stackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1);
                C3 = stackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1;
            } else {
                eVar3 = applyIfNotNull;
                i4 = 0;
            }
            i5.P();
            y.a(eVar3, (p) C3, i5, i4, i4);
            if (w.L()) {
                w.T();
            }
            eVar4 = eVar5;
        }
        B1 l = i5.l();
        if (l != null) {
            l.a(new 3(stackComponentState, components, stackComponentStyle, z, pVar, f, eVar4, i, i2));
        }
    }

    private static final E1 StackWithLongEdgeToEdgeBadge$lambda$4(h2 h2Var) {
        return (E1) h2Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void StackWithOverlaidBadge(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState r21, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r22, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle r23, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment r24, Qa.p r25, float r26, androidx.compose.ui.e r27, b0.m r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.StackWithOverlaidBadge(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment, Qa.p, float, androidx.compose.ui.e, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void StackWithShortEdgeToEdgeBadge(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState r39, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r40, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle r41, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment r42, Qa.p r43, float r44, androidx.compose.ui.e r45, b0.m r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt.StackWithShortEdgeToEdgeBadge(com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentState, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment, Qa.p, float, androidx.compose.ui.e, b0.m, int, int):void");
    }

    public static final /* synthetic */ void access$MainStackComponent(StackComponentState stackComponentState, PaywallState.Loaded.Components components, p pVar, float f, e eVar, BadgeStyle badgeStyle, boolean z, q qVar, m mVar, int i, int i2) {
        MainStackComponent(stackComponentState, components, pVar, f, eVar, badgeStyle, z, qVar, mVar, i, i2);
    }

    public static final /* synthetic */ E1 access$MainStackComponent$lambda$10(h2 h2Var) {
        return MainStackComponent$lambda$10(h2Var);
    }

    public static final /* synthetic */ void access$OverlaidBadge(h hVar, StackComponentStyle stackComponentStyle, PaywallState.Loaded.Components components, TwoDimensionalAlignment twoDimensionalAlignment, Float f, e eVar, m mVar, int i, int i2) {
        OverlaidBadge(hVar, stackComponentStyle, components, twoDimensionalAlignment, f, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Children_Extend_Over_Parent(m mVar, int i) {
        StackComponentView_Preview_Children_Extend_Over_Parent(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_ContentAlpha(m mVar, int i) {
        StackComponentView_Preview_ContentAlpha(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children(m mVar, int i) {
        StackComponentView_Preview_Distribution_SpaceAround_With_Fill_Children(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Distribution_With_Spacing(Dimension dimension, m mVar, int i) {
        StackComponentView_Preview_Distribution_With_Spacing(dimension, mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Distribution_Without_Spacing(Dimension dimension, m mVar, int i) {
        StackComponentView_Preview_Distribution_Without_Spacing(dimension, mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size(Dimension dimension, m mVar, int i) {
        StackComponentView_Preview_Distribution_Without_Spacing_Fit_Size(dimension, mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_EdgeToEdge_Badge(TwoDimensionalAlignment twoDimensionalAlignment, m mVar, int i) {
        StackComponentView_Preview_EdgeToEdge_Badge(twoDimensionalAlignment, mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Horizontal(m mVar, int i) {
        StackComponentView_Preview_Horizontal(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_HorizontalChildrenFillWidth(m mVar, int i) {
        StackComponentView_Preview_HorizontalChildrenFillWidth(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_HorizontalDivider(m mVar, int i) {
        StackComponentView_Preview_HorizontalDivider(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Nested_Badge(TwoDimensionalAlignment twoDimensionalAlignment, m mVar, int i) {
        StackComponentView_Preview_Nested_Badge(twoDimensionalAlignment, mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Overlay_Badge(TwoDimensionalAlignment twoDimensionalAlignment, m mVar, int i) {
        StackComponentView_Preview_Overlay_Badge(twoDimensionalAlignment, mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Pill_EdgeToEdge_Badge(TwoDimensionalAlignment twoDimensionalAlignment, m mVar, int i) {
        StackComponentView_Preview_Pill_EdgeToEdge_Badge(twoDimensionalAlignment, mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll(m mVar, int i) {
        StackComponentView_Preview_Scroll_HorizontalStack_HorizontalScroll(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll(m mVar, int i) {
        StackComponentView_Preview_Scroll_VerticalStack_VerticalScroll(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_Vertical(m mVar, int i) {
        StackComponentView_Preview_Vertical(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_VerticalChildrenFillHeight(m mVar, int i) {
        StackComponentView_Preview_VerticalChildrenFillHeight(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_VerticalDivider(m mVar, int i) {
        StackComponentView_Preview_VerticalDivider(mVar, i);
    }

    public static final /* synthetic */ void access$StackComponentView_Preview_ZLayer(m mVar, int i) {
        StackComponentView_Preview_ZLayer(mVar, i);
    }

    public static final /* synthetic */ void access$StackWithLongEdgeToEdgeBadge(StackComponentState stackComponentState, PaywallState.Loaded.Components components, StackComponentStyle stackComponentStyle, boolean z, p pVar, float f, e eVar, m mVar, int i, int i2) {
        StackWithLongEdgeToEdgeBadge(stackComponentState, components, stackComponentStyle, z, pVar, f, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ E1 access$StackWithLongEdgeToEdgeBadge$lambda$4(h2 h2Var) {
        return StackWithLongEdgeToEdgeBadge$lambda$4(h2Var);
    }

    public static final /* synthetic */ void access$StackWithOverlaidBadge(StackComponentState stackComponentState, PaywallState.Loaded.Components components, StackComponentStyle stackComponentStyle, TwoDimensionalAlignment twoDimensionalAlignment, p pVar, float f, e eVar, m mVar, int i, int i2) {
        StackWithOverlaidBadge(stackComponentState, components, stackComponentStyle, twoDimensionalAlignment, pVar, f, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$StackWithShortEdgeToEdgeBadge(StackComponentState stackComponentState, PaywallState.Loaded.Components components, StackComponentStyle stackComponentStyle, TwoDimensionalAlignment twoDimensionalAlignment, p pVar, float f, e eVar, m mVar, int i, int i2) {
        StackWithShortEdgeToEdgeBadge(stackComponentState, components, stackComponentStyle, twoDimensionalAlignment, pVar, f, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ int access$getOverlaidBadgeOffsetY(int i, TwoDimensionalAlignment twoDimensionalAlignment, float f) {
        return getOverlaidBadgeOffsetY(i, twoDimensionalAlignment, f);
    }

    public static final /* synthetic */ boolean access$getShouldIgnoreTopWindowInsets(ComponentStyle componentStyle) {
        return getShouldIgnoreTopWindowInsets(componentStyle);
    }

    public static final /* synthetic */ b access$makeAbsolute(b bVar, androidx.compose.ui.layout.q qVar, d dVar) {
        return makeAbsolute(bVar, qVar, dVar);
    }

    private static final int getOverlaidBadgeOffsetY(int i, TwoDimensionalAlignment twoDimensionalAlignment, float f) {
        switch (WhenMappings.$EnumSwitchMapping$0[twoDimensionalAlignment.ordinal()]) {
            case 1:
            case 3:
            case 4:
                return Sa.c.d(-((i - f) / 2));
            case 2:
            case 5:
            case 6:
                return Sa.c.d((i - f) / 2);
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                throw new o();
        }
    }

    public static /* synthetic */ int getOverlaidBadgeOffsetY$default(int i, TwoDimensionalAlignment twoDimensionalAlignment, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        return getOverlaidBadgeOffsetY(i, twoDimensionalAlignment, f);
    }

    private static final boolean getShouldIgnoreTopWindowInsets(ComponentStyle componentStyle) {
        if (componentStyle instanceof ImageComponentStyle) {
            return ((ImageComponentStyle) componentStyle).getIgnoreTopWindowInsets();
        }
        if (componentStyle instanceof VideoComponentStyle) {
            return ((VideoComponentStyle) componentStyle).getIgnoreTopWindowInsets();
        }
        return false;
    }

    public static final boolean getUsesAllAvailableSpace(FlexDistribution flexDistribution) {
        kotlin.jvm.internal.t.g(flexDistribution, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[flexDistribution.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new o();
        }
    }

    private static final boolean isTop(TwoDimensionalAlignment twoDimensionalAlignment) {
        switch (WhenMappings.$EnumSwitchMapping$0[twoDimensionalAlignment.ordinal()]) {
            case 1:
            case 3:
            case 4:
                return true;
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new o();
        }
    }

    private static final b makeAbsolute(b bVar, androidx.compose.ui.layout.q qVar, d dVar) {
        return makeAbsolute-12SF9DM(bVar, u0.m.a(qVar.W0(), qVar.P0()), dVar);
    }

    private static final b makeAbsolute-12SF9DM(b bVar, long j, d dVar) {
        return M.c.a(bVar.a(j, dVar));
    }

    private static final BadgeStyle previewBadge(Badge.Style style, TwoDimensionalAlignment twoDimensionalAlignment, Shape shape, F.L l, F.L l2) {
        SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
        List e = Da.u.e(PreviewHelpersKt.previewTextComponentStyle$default("Badge", null, 0, null, null, null, null, null, false, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), null, null, null, null, null, 63998, null));
        Dimension.Vertical vertical = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.CENTER);
        Size size = new Size(fit, fit);
        float g = n1.h.g(0);
        r0.a aVar = r0.b;
        return new BadgeStyle(new StackComponentStyle(e, vertical, true, size, g, BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(45.0f, v.q(new ColorInfo.Gradient.Point(s0.k(aVar.f()), 0.0f), new ColorInfo.Gradient.Point(s0.k(aVar.l()), 80.0f)))), null, 2, null))), l, l2, shape, null, null, null, null, null, null, null, null, null, CountdownComponent.CountFrom.DAYS, v.n(), false, false, false, 7421952, null), style, twoDimensionalAlignment);
    }

    public static /* synthetic */ BadgeStyle previewBadge$default(Badge.Style style, TwoDimensionalAlignment twoDimensionalAlignment, Shape shape, F.L l, F.L l2, int i, Object obj) {
        if ((i & 8) != 0) {
            l = androidx.compose.foundation.layout.f.a(n1.h.g(0));
        }
        if ((i & 16) != 0) {
            l2 = androidx.compose.foundation.layout.f.a(n1.h.g(0));
        }
        return previewBadge(style, twoDimensionalAlignment, shape, l, l2);
    }

    private static final List previewChildren(m mVar, int i) {
        mVar.V(-407337990);
        if (w.L()) {
            w.U(-407337990, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.previewChildren (StackComponentView.kt:1686)");
        }
        r0.a aVar = r0.b;
        ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null);
        SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
        List q = v.q(PreviewHelpersKt.previewTextComponentStyle$default("Hello", null, 0, null, null, null, null, colorStyles, false, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), null, null, null, null, null, 63870, null), PreviewHelpersKt.previewTextComponentStyle$default("World", null, 0, null, null, null, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.b())), null, 2, null), false, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), null, null, null, null, null, 63870, null));
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return q;
    }
}

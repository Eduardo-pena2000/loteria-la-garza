package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import F.e0;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import Qa.q;
import androidx.compose.foundation.f;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.ScrollableKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$MainStackComponent$stack$1 extends u implements q {
    final /* synthetic */ p $clickHandler;
    final /* synthetic */ float $contentAlpha;
    final /* synthetic */ e $modifier;
    final /* synthetic */ e0 $safeDrawingInsets;
    final /* synthetic */ StackComponentState $stackState;
    final /* synthetic */ PaywallState.Loaded.Components $state;

    public static final class 1 extends u implements q {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(3);
        }

        public final e invoke(e applyIfNotNull, f state, C.q orientation) {
            t.g(applyIfNotNull, "$this$applyIfNotNull");
            t.g(state, "state");
            t.g(orientation, "orientation");
            return ScrollableKt.scrollable(applyIfNotNull, state, orientation);
        }
    }

    public static final class 3 extends u implements q {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(3);
        }

        public final e invoke(e applyIfNotNull, f state, C.q orientation) {
            t.g(applyIfNotNull, "$this$applyIfNotNull");
            t.g(state, "state");
            t.g(orientation, "orientation");
            return ScrollableKt.scrollable(applyIfNotNull, state, orientation);
        }
    }

    public static final class 5 extends u implements q {
        public static final 5 INSTANCE = new 5();

        public 5() {
            super(3);
        }

        public final e invoke(e applyIfNotNull, f state, C.q orientation) {
            t.g(applyIfNotNull, "$this$applyIfNotNull");
            t.g(state, "state");
            t.g(orientation, "orientation");
            return ScrollableKt.scrollable(applyIfNotNull, state, orientation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$MainStackComponent$stack$1(StackComponentState stackComponentState, e eVar, PaywallState.Loaded.Components components, p pVar, e0 e0Var, float f) {
        super(3);
        this.$stackState = stackComponentState;
        this.$modifier = eVar;
        this.$state = components;
        this.$clickHandler = pVar;
        this.$safeDrawingInsets = e0Var;
        this.$contentAlpha = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((e) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(e rootModifier, m mVar, int i) {
        t.g(rootModifier, "rootModifier");
        int i2 = (i & 6) == 0 ? i | (mVar.U(rootModifier) ? 4 : 2) : i;
        if ((i2 & 19) == 18 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-586909421, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.MainStackComponent.<anonymous> (StackComponentView.kt:491)");
        }
        C.q scrollOrientation = this.$stackState.getScrollOrientation();
        mVar.V(-958142529);
        f c = scrollOrientation == null ? null : androidx.compose.foundation.e.c(0, mVar, 0, 1);
        mVar.P();
        if (this.$stackState.getChildren().isEmpty()) {
            mVar.V(362640510);
            F.f.a(SizeKt.size$default(this.$modifier, this.$stackState.getSize(), null, null, 6, null).then(rootModifier), mVar, 0);
            mVar.P();
        } else {
            mVar.V(362943752);
            Dimension.Horizontal dimension = this.$stackState.getDimension();
            if (dimension instanceof Dimension.Horizontal) {
                mVar.V(-958123426);
                Size size = this.$stackState.getSize();
                Dimension.Horizontal horizontal = dimension;
                float f = this.$stackState.getSpacing-D9Ej5fM();
                e then = ModifierExtensionsKt.applyIfNotNull(SizeKt.size$default(this.$modifier, this.$stackState.getSize(), null, AlignmentKt.toAlignment(horizontal.getAlignment()), 2, null), c, this.$stackState.getScrollOrientation(), 1.INSTANCE).then(rootModifier);
                mVar.V(-958106345);
                boolean U = mVar.U(this.$stackState) | mVar.U(this.$state) | mVar.E(this.$clickHandler) | mVar.U(this.$safeDrawingInsets) | mVar.c(this.$contentAlpha);
                StackComponentState stackComponentState = this.$stackState;
                PaywallState.Loaded.Components components = this.$state;
                p pVar = this.$clickHandler;
                e0 e0Var = this.$safeDrawingInsets;
                float f2 = this.$contentAlpha;
                Object C = mVar.C();
                if (U || C == m.a.a()) {
                    C = new StackComponentViewKt$MainStackComponent$stack$1$2$1(stackComponentState, components, pVar, e0Var, f2);
                    mVar.t(C);
                }
                mVar.P();
                HorizontalStackKt.HorizontalStack-TN_CM5M(size, horizontal, f, then, (l) C, mVar, 0, 0);
                mVar.P();
            } else if (dimension instanceof Dimension.Vertical) {
                mVar.V(-958079794);
                Size size2 = this.$stackState.getSize();
                Dimension.Vertical vertical = (Dimension.Vertical) dimension;
                float f3 = this.$stackState.getSpacing-D9Ej5fM();
                e then2 = ModifierExtensionsKt.applyIfNotNull(SizeKt.size$default(this.$modifier, this.$stackState.getSize(), AlignmentKt.toAlignment(vertical.getAlignment()), null, 4, null), c, this.$stackState.getScrollOrientation(), 3.INSTANCE).then(rootModifier);
                mVar.V(-958062713);
                boolean U2 = mVar.U(this.$stackState) | mVar.U(this.$state) | mVar.E(this.$clickHandler) | mVar.U(this.$safeDrawingInsets) | mVar.c(this.$contentAlpha);
                StackComponentState stackComponentState2 = this.$stackState;
                PaywallState.Loaded.Components components2 = this.$state;
                p pVar2 = this.$clickHandler;
                e0 e0Var2 = this.$safeDrawingInsets;
                float f4 = this.$contentAlpha;
                Object C2 = mVar.C();
                if (U2 || C2 == m.a.a()) {
                    C2 = new StackComponentViewKt$MainStackComponent$stack$1$4$1(stackComponentState2, components2, pVar2, e0Var2, f4);
                    mVar.t(C2);
                }
                mVar.P();
                VerticalStackKt.VerticalStack-TN_CM5M(size2, vertical, f3, then2, (l) C2, mVar, 0, 0);
                mVar.P();
            } else if (dimension instanceof Dimension.ZLayer) {
                mVar.V(-958024193);
                Dimension.ZLayer zLayer = (Dimension.ZLayer) dimension;
                e then3 = ModifierExtensionsKt.applyIfNotNull(SizeKt.size(this.$modifier, this.$stackState.getSize(), AlignmentKt.toHorizontalAlignmentOrNull(zLayer.getAlignment()), AlignmentKt.toVerticalAlignmentOrNull(zLayer.getAlignment())), c, this.$stackState.getScrollOrientation(), 5.INSTANCE).then(rootModifier);
                o0.e alignment = AlignmentKt.toAlignment(zLayer.getAlignment());
                StackComponentState stackComponentState3 = this.$stackState;
                PaywallState.Loaded.Components components3 = this.$state;
                p pVar3 = this.$clickHandler;
                e0 e0Var3 = this.$safeDrawingInsets;
                float f5 = this.$contentAlpha;
                B h = F.f.h(alignment, false);
                int a = h.a(mVar, 0);
                b0.I r = mVar.r();
                e f6 = c.f(mVar, then3);
                g.a aVar = g.E8;
                a a2 = aVar.a();
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
                m2.e(b, h, aVar.e());
                m2.e(b, r, aVar.g());
                p b2 = aVar.b();
                if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                    b.t(Integer.valueOf(a));
                    b.J(Integer.valueOf(a), b2);
                }
                m2.e(b, f6, aVar.f());
                androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
                mVar.V(1797954681);
                for (ComponentStyle componentStyle : stackComponentState3.getChildren()) {
                    e.a aVar2 = e.a;
                    boolean z = stackComponentState3.getApplyTopWindowInsets() && !StackComponentViewKt.access$getShouldIgnoreTopWindowInsets(componentStyle);
                    mVar.V(193843242);
                    boolean U3 = mVar.U(e0Var3);
                    Object C3 = mVar.C();
                    if (U3 || C3 == m.a.a()) {
                        C3 = new StackComponentViewKt$MainStackComponent$stack$1$6$1$1$1(e0Var3);
                        mVar.t(C3);
                    }
                    mVar.P();
                    ComponentViewKt.ComponentView(componentStyle, components3, pVar3, s0.a.a(ModifierExtensionsKt.conditional(aVar2, z, (l) C3), f5), mVar, 0, 0);
                }
                mVar.P();
                mVar.v();
                mVar.P();
            } else {
                mVar.V(367323680);
                mVar.P();
            }
            mVar.P();
        }
        if (w.L()) {
            w.T();
        }
    }
}

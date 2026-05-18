package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import F.e0;
import F.n;
import Qa.l;
import Qa.p;
import Qa.s;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import j0.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import s0.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$MainStackComponent$stack$1$4$1 extends u implements l {
    final /* synthetic */ p $clickHandler;
    final /* synthetic */ float $contentAlpha;
    final /* synthetic */ e0 $safeDrawingInsets;
    final /* synthetic */ StackComponentState $stackState;
    final /* synthetic */ PaywallState.Loaded.Components $state;

    public static final class 1 extends u implements s {
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ e0 $safeDrawingInsets;
        final /* synthetic */ StackComponentState $stackState;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallState.Loaded.Components components, p pVar, StackComponentState stackComponentState, e0 e0Var, float f) {
            super(5);
            this.$state = components;
            this.$clickHandler = pVar;
            this.$stackState = stackComponentState;
            this.$safeDrawingInsets = e0Var;
            this.$contentAlpha = f;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            invoke((n) obj, ((Number) obj2).intValue(), (ComponentStyle) obj3, (m) obj4, ((Number) obj5).intValue());
            return I.a;
        }

        public final void invoke(n items, int i, ComponentStyle child, m mVar, int i2) {
            int i3;
            t.g(items, "$this$items");
            t.g(child, "child");
            if ((i2 & 6) == 0) {
                i3 = (mVar.U(items) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= mVar.d(i) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= mVar.U(child) ? 256 : 128;
            }
            if ((i3 & 1171) == 1170 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1477849382, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.MainStackComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StackComponentView.kt:541)");
            }
            PaywallState.Loaded.Components components = this.$state;
            p pVar = this.$clickHandler;
            e.a aVar = e.a;
            boolean c = t.c(child.getSize().getHeight(), SizeConstraint.Fill.INSTANCE);
            mVar.V(-1700519402);
            boolean z = false;
            boolean z2 = (i3 & 14) == 4;
            Object C = mVar.C();
            if (z2 || C == m.a.a()) {
                C = new StackComponentViewKt$MainStackComponent$stack$1$4$1$1$1$1(items);
                mVar.t(C);
            }
            mVar.P();
            e conditional = ModifierExtensionsKt.conditional(aVar, c, (l) C);
            if (this.$stackState.getApplyTopWindowInsets() && i == 0 && !StackComponentViewKt.access$getShouldIgnoreTopWindowInsets(child)) {
                z = true;
            }
            mVar.V(-1700502167);
            boolean U = mVar.U(this.$safeDrawingInsets);
            e0 e0Var = this.$safeDrawingInsets;
            Object C2 = mVar.C();
            if (U || C2 == m.a.a()) {
                C2 = new StackComponentViewKt$MainStackComponent$stack$1$4$1$1$2$1(e0Var);
                mVar.t(C2);
            }
            mVar.P();
            ComponentViewKt.ComponentView(child, components, pVar, a.a(ModifierExtensionsKt.conditional(conditional, z, (l) C2), this.$contentAlpha), mVar, (i3 >> 6) & 14, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$MainStackComponent$stack$1$4$1(StackComponentState stackComponentState, PaywallState.Loaded.Components components, p pVar, e0 e0Var, float f) {
        super(1);
        this.$stackState = stackComponentState;
        this.$state = components;
        this.$clickHandler = pVar;
        this.$safeDrawingInsets = e0Var;
        this.$contentAlpha = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VerticalStackScope) obj);
        return I.a;
    }

    public final void invoke(VerticalStackScope VerticalStack) {
        t.g(VerticalStack, "$this$VerticalStack");
        VerticalStack.items(this.$stackState.getChildren(), i.b(1477849382, true, new 1(this.$state, this.$clickHandler, this.$stackState, this.$safeDrawingInsets, this.$contentAlpha)));
    }
}

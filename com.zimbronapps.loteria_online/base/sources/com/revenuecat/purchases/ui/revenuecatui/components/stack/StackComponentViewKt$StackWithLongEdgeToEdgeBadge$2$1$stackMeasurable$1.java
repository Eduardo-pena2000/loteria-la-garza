package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Qa.p;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$stackMeasurable$1 extends u implements p {
    final /* synthetic */ p $clickHandler;
    final /* synthetic */ float $contentAlpha;
    final /* synthetic */ StackComponentState $stackState;
    final /* synthetic */ PaywallState.Loaded.Components $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$stackMeasurable$1(StackComponentState stackComponentState, PaywallState.Loaded.Components components, p pVar, float f) {
        super(2);
        this.$stackState = stackComponentState;
        this.$state = components;
        this.$clickHandler = pVar;
        this.$contentAlpha = f;
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
            w.U(-1349600991, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackWithLongEdgeToEdgeBadge.<anonymous>.<anonymous>.<anonymous> (StackComponentView.kt:215)");
        }
        StackComponentViewKt.access$MainStackComponent(this.$stackState, this.$state, this.$clickHandler, this.$contentAlpha, null, null, false, null, mVar, 1572864, 176);
        if (w.L()) {
            w.T();
        }
    }
}

package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Qa.p;
import androidx.compose.foundation.layout.f;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$badgeMeasurable$1 extends u implements p {
    final /* synthetic */ StackComponentStyle $badgeStack;
    final /* synthetic */ p $clickHandler;
    final /* synthetic */ PaywallState.Loaded.Components $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$badgeMeasurable$1(StackComponentStyle stackComponentStyle, PaywallState.Loaded.Components components, p pVar) {
        super(2);
        this.$badgeStack = stackComponentStyle;
        this.$state = components;
        this.$clickHandler = pVar;
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
            w.U(1484438374, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackWithLongEdgeToEdgeBadge.<anonymous>.<anonymous>.<anonymous> (StackComponentView.kt:227)");
        }
        StackComponentViewKt.StackComponentView(StackComponentStyle.copy-KMZiVUk$default(this.$badgeStack, null, null, false, new Size(SizeConstraint.Fill.INSTANCE, this.$badgeStack.getSize().getHeight()), 0.0f, null, null, f.a(h.g(0)), null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 8387927, null), this.$state, this.$clickHandler, null, 0.0f, mVar, 0, 24);
        if (w.L()) {
            w.T();
        }
    }
}

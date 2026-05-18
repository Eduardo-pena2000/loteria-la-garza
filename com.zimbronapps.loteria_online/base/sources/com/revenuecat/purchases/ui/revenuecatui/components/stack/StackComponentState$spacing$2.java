package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import kotlin.jvm.internal.u;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentState$spacing$2 extends u implements a {
    final /* synthetic */ StackComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentState$spacing$2(StackComponentState stackComponentState) {
        super(0);
        this.this$0 = stackComponentState;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return h.d(invoke-D9Ej5fM());
    }

    public final float invoke-D9Ej5fM() {
        PartialStackComponent partial;
        Float spacing;
        PresentedStackPartial access$getPresentedPartial = StackComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (spacing = partial.getSpacing()) == null) ? StackComponentState.access$getStyle$p(this.this$0).getSpacing-D9Ej5fM() : h.g(spacing.floatValue());
    }
}

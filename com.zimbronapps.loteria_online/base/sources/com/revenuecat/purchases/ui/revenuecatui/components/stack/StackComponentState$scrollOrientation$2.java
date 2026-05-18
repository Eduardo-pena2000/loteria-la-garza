package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.q;
import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import com.revenuecat.purchases.ui.revenuecatui.extensions.OverflowExtensionsKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentState$scrollOrientation$2 extends u implements a {
    final /* synthetic */ StackComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentState$scrollOrientation$2(StackComponentState stackComponentState) {
        super(0);
        this.this$0 = stackComponentState;
    }

    public final q invoke() {
        PartialStackComponent partial;
        StackComponent.Overflow overflow;
        q orientation;
        PresentedStackPartial access$getPresentedPartial = StackComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (overflow = partial.getOverflow()) == null || (orientation = OverflowExtensionsKt.toOrientation(overflow, this.this$0.getDimension())) == null) ? StackComponentState.access$getStyle$p(this.this$0).getScrollOrientation() : orientation;
    }
}

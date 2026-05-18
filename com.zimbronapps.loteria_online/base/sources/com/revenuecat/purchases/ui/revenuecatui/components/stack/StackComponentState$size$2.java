package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentState$size$2 extends u implements a {
    final /* synthetic */ StackComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentState$size$2(StackComponentState stackComponentState) {
        super(0);
        this.this$0 = stackComponentState;
    }

    public final Size invoke() {
        Size size;
        PartialStackComponent partial;
        StackComponentState stackComponentState = this.this$0;
        PresentedStackPartial access$getPresentedPartial = StackComponentState.access$getPresentedPartial(stackComponentState);
        if (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (size = partial.getSize()) == null) {
            size = StackComponentState.access$getStyle$p(this.this$0).getSize();
        }
        return StackComponentState.access$adjustForMargin(stackComponentState, size, this.this$0.getMargin(), StackComponentState.access$getLayoutDirection(this.this$0));
    }
}

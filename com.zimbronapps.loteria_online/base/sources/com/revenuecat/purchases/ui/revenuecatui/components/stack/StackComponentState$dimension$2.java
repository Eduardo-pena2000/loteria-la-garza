package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentState$dimension$2 extends u implements a {
    final /* synthetic */ StackComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentState$dimension$2(StackComponentState stackComponentState) {
        super(0);
        this.this$0 = stackComponentState;
    }

    public final Dimension invoke() {
        PartialStackComponent partial;
        Dimension dimension;
        PresentedStackPartial access$getPresentedPartial = StackComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (dimension = partial.getDimension()) == null) ? StackComponentState.access$getStyle$p(this.this$0).getDimension() : dimension;
    }
}

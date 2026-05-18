package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentState$background$2 extends u implements a {
    final /* synthetic */ StackComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentState$background$2(StackComponentState stackComponentState) {
        super(0);
        this.this$0 = stackComponentState;
    }

    public final BackgroundStyles invoke() {
        BackgroundStyles backgroundStyles;
        PresentedStackPartial access$getPresentedPartial = StackComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (backgroundStyles = access$getPresentedPartial.getBackgroundStyles()) == null) ? StackComponentState.access$getStyle$p(this.this$0).getBackground() : backgroundStyles;
    }
}

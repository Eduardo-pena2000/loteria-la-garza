package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import F.L;
import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialTimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelinePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentState$padding$2 extends u implements a {
    final /* synthetic */ TimelineComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentState$padding$2(TimelineComponentState timelineComponentState) {
        super(0);
        this.this$0 = timelineComponentState;
    }

    public final L invoke() {
        PartialTimelineComponent partial;
        Padding padding;
        L paddingValues;
        PresentedTimelinePartial access$getPresentedPartial = TimelineComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (padding = partial.getPadding()) == null || (paddingValues = PaddingKt.toPaddingValues(padding)) == null) ? TimelineComponentState.access$getStyle$p(this.this$0).getPadding() : paddingValues;
    }
}

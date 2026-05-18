package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialTimelineComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelinePartial;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentState$textSpacing$2 extends u implements a {
    final /* synthetic */ TimelineComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentState$textSpacing$2(TimelineComponentState timelineComponentState) {
        super(0);
        this.this$0 = timelineComponentState;
    }

    public final Integer invoke() {
        PartialTimelineComponent partial;
        Integer textSpacing;
        PresentedTimelinePartial access$getPresentedPartial = TimelineComponentState.access$getPresentedPartial(this.this$0);
        return Integer.valueOf((access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (textSpacing = partial.getTextSpacing()) == null) ? TimelineComponentState.access$getStyle$p(this.this$0).getTextSpacing() : textSpacing.intValue());
    }
}

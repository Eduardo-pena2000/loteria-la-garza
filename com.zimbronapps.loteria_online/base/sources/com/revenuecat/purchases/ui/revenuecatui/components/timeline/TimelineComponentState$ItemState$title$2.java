package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentState$ItemState$title$2 extends u implements a {
    final /* synthetic */ TimelineComponentState.ItemState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentState$ItemState$title$2(TimelineComponentState.ItemState itemState) {
        super(0);
        this.this$0 = itemState;
    }

    public final TextComponentStyle invoke() {
        return TimelineComponentState.ItemState.access$getStyle$p(this.this$0).getTitle();
    }
}

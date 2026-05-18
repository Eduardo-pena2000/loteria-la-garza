package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Da.w;
import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentState$items$2 extends u implements a {
    final /* synthetic */ TimelineComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentState$items$2(TimelineComponentState timelineComponentState) {
        super(0);
        this.this$0 = timelineComponentState;
    }

    public final List invoke() {
        List items = TimelineComponentState.access$getStyle$p(this.this$0).getItems();
        TimelineComponentState timelineComponentState = this.this$0;
        ArrayList arrayList = new ArrayList(w.y(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new TimelineComponentState.ItemState(TimelineComponentState.access$getWindowSize(timelineComponentState), (TimelineComponentStyle.ItemStyle) it.next(), TimelineComponentState.access$getSelectedPackageInfoProvider$p(timelineComponentState), TimelineComponentState.access$getSelectedTabIndexProvider$p(timelineComponentState), TimelineComponentState.access$getSelectedOfferEligibilityProvider$p(timelineComponentState), TimelineComponentState.access$getCustomVariablesProvider$p(timelineComponentState)));
        }
        return arrayList;
    }
}

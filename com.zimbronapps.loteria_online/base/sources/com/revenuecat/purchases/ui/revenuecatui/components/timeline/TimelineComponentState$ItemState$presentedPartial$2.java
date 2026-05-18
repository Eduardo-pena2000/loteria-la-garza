package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Qa.a;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewState;
import com.revenuecat.purchases.ui.revenuecatui.components.ConditionContext;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartialKt;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelineItemPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ScreenCondition;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentState$ItemState$presentedPartial$2 extends u implements a {
    final /* synthetic */ TimelineComponentState.ItemState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentState$ItemState$presentedPartial$2(TimelineComponentState.ItemState itemState) {
        super(0);
        this.this$0 = itemState;
    }

    public final PresentedTimelineItemPartial invoke() {
        Package rcPackage;
        ScreenCondition from = ScreenCondition.Companion.from(TimelineComponentState.ItemState.access$getWindowSize(this.this$0));
        ComponentViewState componentViewState = TimelineComponentState.ItemState.access$getPackageAwareDelegate$p(this.this$0).isSelected() ? ComponentViewState.SELECTED : ComponentViewState.DEFAULT;
        List overrides = TimelineComponentState.ItemState.access$getStyle$p(this.this$0).getOverrides();
        OfferEligibility offerEligibility = TimelineComponentState.ItemState.access$getPackageAwareDelegate$p(this.this$0).getOfferEligibility();
        PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = (PaywallState.Loaded.Components.SelectedPackageInfo) TimelineComponentState.ItemState.access$getSelectedPackageInfoProvider$p(this.this$0).invoke();
        return (PresentedTimelineItemPartial) PresentedPartialKt.buildPresentedPartial(overrides, from, offerEligibility, componentViewState, new ConditionContext((selectedPackageInfo == null || (rcPackage = selectedPackageInfo.getRcPackage()) == null) ? null : rcPackage.getIdentifier(), (Map) TimelineComponentState.ItemState.access$getCustomVariablesProvider$p(this.this$0).invoke()));
    }
}

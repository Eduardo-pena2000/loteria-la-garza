package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewState;
import com.revenuecat.purchases.ui.revenuecatui.components.ConditionContext;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartialKt;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ScreenCondition;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$presentedPartial$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$presentedPartial$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final PresentedVideoPartial invoke() {
        Package rcPackage;
        ScreenCondition from = ScreenCondition.Companion.from(VideoComponentState.access$getWindowSize(this.this$0));
        ComponentViewState componentViewState = VideoComponentState.access$getPackageAwareDelegate$p(this.this$0).isSelected() ? ComponentViewState.SELECTED : ComponentViewState.DEFAULT;
        List overrides = VideoComponentState.access$getStyle$p(this.this$0).getOverrides();
        OfferEligibility offerEligibility = VideoComponentState.access$getPackageAwareDelegate$p(this.this$0).getOfferEligibility();
        PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = (PaywallState.Loaded.Components.SelectedPackageInfo) VideoComponentState.access$getSelectedPackageInfoProvider$p(this.this$0).invoke();
        return (PresentedVideoPartial) PresentedPartialKt.buildPresentedPartial(overrides, from, offerEligibility, componentViewState, new ConditionContext((selectedPackageInfo == null || (rcPackage = selectedPackageInfo.getRcPackage()) == null) ? null : rcPackage.getIdentifier(), (Map) VideoComponentState.access$getCustomVariablesProvider$p(this.this$0).invoke()));
    }
}

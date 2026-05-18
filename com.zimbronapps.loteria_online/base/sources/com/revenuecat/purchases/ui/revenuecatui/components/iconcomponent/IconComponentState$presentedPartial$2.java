package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import Qa.a;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewState;
import com.revenuecat.purchases.ui.revenuecatui.components.ConditionContext;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedIconPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartialKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ScreenCondition;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentState$presentedPartial$2 extends u implements a {
    final /* synthetic */ IconComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconComponentState$presentedPartial$2(IconComponentState iconComponentState) {
        super(0);
        this.this$0 = iconComponentState;
    }

    public final PresentedIconPartial invoke() {
        Package rcPackage;
        ScreenCondition from = ScreenCondition.Companion.from(IconComponentState.access$getWindowSize(this.this$0));
        ComponentViewState componentViewState = IconComponentState.access$getPackageAwareDelegate$p(this.this$0).isSelected() ? ComponentViewState.SELECTED : ComponentViewState.DEFAULT;
        List overrides = IconComponentState.access$getStyle$p(this.this$0).getOverrides();
        OfferEligibility offerEligibility = IconComponentState.access$getPackageAwareDelegate$p(this.this$0).getOfferEligibility();
        PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = (PaywallState.Loaded.Components.SelectedPackageInfo) IconComponentState.access$getSelectedPackageInfoProvider$p(this.this$0).invoke();
        return (PresentedIconPartial) PresentedPartialKt.buildPresentedPartial(overrides, from, offerEligibility, componentViewState, new ConditionContext((selectedPackageInfo == null || (rcPackage = selectedPackageInfo.getRcPackage()) == null) ? null : rcPackage.getIdentifier(), (Map) IconComponentState.access$getCustomVariablesProvider$p(this.this$0).invoke()));
    }
}

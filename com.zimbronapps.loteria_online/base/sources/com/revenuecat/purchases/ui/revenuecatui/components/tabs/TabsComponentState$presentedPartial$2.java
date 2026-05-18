package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Qa.a;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewState;
import com.revenuecat.purchases.ui.revenuecatui.components.ConditionContext;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartialKt;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ScreenCondition;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabsComponentState$presentedPartial$2 extends u implements a {
    final /* synthetic */ TabsComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsComponentState$presentedPartial$2(TabsComponentState tabsComponentState) {
        super(0);
        this.this$0 = tabsComponentState;
    }

    public final PresentedTabsPartial invoke() {
        Package rcPackage;
        ScreenCondition from = ScreenCondition.Companion.from(TabsComponentState.access$getWindowSize(this.this$0));
        ComponentViewState componentViewState = ComponentViewState.DEFAULT;
        List overrides = TabsComponentState.access$getStyle$p(this.this$0).getOverrides();
        OfferEligibility access$getOfferEligibility = TabsComponentState.access$getOfferEligibility(this.this$0);
        PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = (PaywallState.Loaded.Components.SelectedPackageInfo) TabsComponentState.access$getSelectedPackageInfoProvider$p(this.this$0).invoke();
        return (PresentedTabsPartial) PresentedPartialKt.buildPresentedPartial(overrides, from, access$getOfferEligibility, componentViewState, new ConditionContext((selectedPackageInfo == null || (rcPackage = selectedPackageInfo.getRcPackage()) == null) ? null : rcPackage.getIdentifier(), (Map) TabsComponentState.access$getCustomVariablesProvider$p(this.this$0).invoke()));
    }
}

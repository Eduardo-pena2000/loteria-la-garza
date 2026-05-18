package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabsComponentState$offerEligibility$2 extends u implements a {
    final /* synthetic */ TabsComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsComponentState$offerEligibility$2(TabsComponentState tabsComponentState) {
        super(0);
        this.this$0 = tabsComponentState;
    }

    public final OfferEligibility invoke() {
        OfferEligibility calculateOfferEligibility;
        PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = (PaywallState.Loaded.Components.SelectedPackageInfo) TabsComponentState.access$getSelectedPackageInfoProvider$p(this.this$0).invoke();
        return (selectedPackageInfo == null || (calculateOfferEligibility = PackageExtensionsKt.calculateOfferEligibility(selectedPackageInfo.getResolvedOffer(), selectedPackageInfo.getRcPackage())) == null) ? OfferEligibility.Ineligible.INSTANCE : calculateOfferEligibility;
    }
}

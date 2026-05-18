package com.revenuecat.purchases.ui.revenuecatui.data;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallState$Loaded$Components$selectedOfferEligibility$2 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallState$Loaded$Components$selectedOfferEligibility$2(PaywallState.Loaded.Components components) {
        super(0);
        this.this$0 = components;
    }

    public final OfferEligibility invoke() {
        OfferEligibility offerEligibility;
        PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = this.this$0.getSelectedPackageInfo();
        return (selectedPackageInfo == null || (offerEligibility = selectedPackageInfo.getOfferEligibility()) == null) ? OfferEligibility.Ineligible.INSTANCE : offerEligibility;
    }
}

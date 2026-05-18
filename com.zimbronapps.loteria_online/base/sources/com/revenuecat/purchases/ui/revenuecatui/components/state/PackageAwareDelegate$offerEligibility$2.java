package com.revenuecat.purchases.ui.revenuecatui.components.state;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PackageAwareDelegate$offerEligibility$2 extends u implements a {
    final /* synthetic */ PackageAwareDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageAwareDelegate$offerEligibility$2(PackageAwareDelegate packageAwareDelegate) {
        super(0);
        this.this$0 = packageAwareDelegate;
    }

    public final OfferEligibility invoke() {
        return PackageAwareDelegate.access$getStyle$p(this.this$0).resolveOfferEligibility((OfferEligibility) PackageAwareDelegate.access$getSelectedOfferEligibilityProvider$p(this.this$0).invoke());
    }
}

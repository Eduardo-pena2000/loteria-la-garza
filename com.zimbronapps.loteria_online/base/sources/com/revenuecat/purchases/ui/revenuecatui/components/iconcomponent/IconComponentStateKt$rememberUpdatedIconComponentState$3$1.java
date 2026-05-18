package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentStateKt$rememberUpdatedIconComponentState$3$1 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components $paywallState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconComponentStateKt$rememberUpdatedIconComponentState$3$1(PaywallState.Loaded.Components components) {
        super(0);
        this.$paywallState = components;
    }

    public final OfferEligibility invoke() {
        return this.$paywallState.getSelectedOfferEligibility();
    }
}

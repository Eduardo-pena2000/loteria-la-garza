package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState$subscriptionOption$2 extends u implements a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentState$subscriptionOption$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    public final SubscriptionOption invoke() {
        ResolvedOffer resolvedOffer;
        SubscriptionOption subscriptionOption;
        ResolvedOffer resolvedOffer2 = TextComponentState.access$getStyle$p(this.this$0).getResolvedOffer();
        if (resolvedOffer2 != null && (subscriptionOption = resolvedOffer2.getSubscriptionOption()) != null) {
            return subscriptionOption;
        }
        PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = (PaywallState.Loaded.Components.SelectedPackageInfo) TextComponentState.access$getSelectedPackageInfoProvider$p(this.this$0).invoke();
        if (selectedPackageInfo == null || (resolvedOffer = selectedPackageInfo.getResolvedOffer()) == null) {
            return null;
        }
        return resolvedOffer.getSubscriptionOption();
    }
}

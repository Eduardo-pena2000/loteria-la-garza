package com.revenuecat.purchases.hybridcommon.ui;

import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallDisplayCallback;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallFragment$launchPaywallIfNeeded$paywallDisplayCallback$1 implements PaywallDisplayCallback {
    final /* synthetic */ PaywallFragment this$0;

    public PaywallFragment$launchPaywallIfNeeded$paywallDisplayCallback$1(PaywallFragment paywallFragment) {
        this.this$0 = paywallFragment;
    }

    public void onPaywallDisplayResult(boolean z) {
        if (z) {
            return;
        }
        PaywallFragment.access$setFragmentResult(this.this$0, "NOT_PRESENTED");
        PaywallFragment.access$removeFragment(this.this$0);
    }
}

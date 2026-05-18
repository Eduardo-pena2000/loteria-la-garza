package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalPaywallKt$LoadedPaywall$1$3$1 extends u implements a {
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPaywallKt$LoadedPaywall$1$3$1(PaywallViewModel paywallViewModel) {
        super(0);
        this.$viewModel = paywallViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$viewModel.restorePurchases();
    }
}

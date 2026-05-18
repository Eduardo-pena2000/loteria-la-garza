package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.a;
import X.l;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalPaywallKt$InternalPaywall$2$1 extends u implements a {
    final /* synthetic */ l $colorScheme;
    final /* synthetic */ boolean $isDark;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPaywallKt$InternalPaywall$2$1(PaywallViewModel paywallViewModel, l lVar, boolean z) {
        super(0);
        this.$viewModel = paywallViewModel;
        this.$colorScheme = lVar;
        this.$isDark = z;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$viewModel.refreshStateIfLocaleChanged();
        this.$viewModel.refreshStateIfColorsChanged(this.$colorScheme, this.$isDark);
    }
}

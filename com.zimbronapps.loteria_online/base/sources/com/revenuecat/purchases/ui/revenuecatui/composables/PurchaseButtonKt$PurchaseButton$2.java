package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseButtonKt$PurchaseButton$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseButtonKt$PurchaseButton$2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, e eVar, float f, TemplateConfiguration.Colors colors, int i, int i2) {
        super(2);
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
        this.$childModifier = eVar;
        this.$horizontalPadding = f;
        this.$colors = colors;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        PurchaseButtonKt.PurchaseButton-hGBTI10(this.$state, this.$viewModel, this.$childModifier, this.$horizontalPadding, this.$colors, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}

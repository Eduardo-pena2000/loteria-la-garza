package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseButtonKt$PurchaseButton$1 extends u implements p {
    final /* synthetic */ e $childModifier;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseButtonKt$PurchaseButton$1(TemplateConfiguration.Colors colors, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, float f, e eVar) {
        super(2);
        this.$colors = colors;
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
        this.$horizontalPadding = f;
        this.$childModifier = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        if ((i & 3) == 2 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(22366153, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButton.<anonymous> (PurchaseButton.kt:56)");
        }
        PurchaseButtonKt.access$PurchaseButton-WH-ejsw(this.$colors, this.$state.getTemplateConfiguration().getPackages(), this.$state.getSelectedPackage(), this.$viewModel, this.$horizontalPadding, this.$childModifier, mVar, 0, 0);
        if (w.L()) {
            w.T();
        }
    }
}

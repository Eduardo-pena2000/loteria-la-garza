package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import androidx.compose.ui.e;
import b0.C0;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseButtonKt$PurchaseButton$4 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ TemplateConfiguration.PackageConfiguration $packages;
    final /* synthetic */ C0 $selectedPackage;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseButtonKt$PurchaseButton$4(TemplateConfiguration.Colors colors, TemplateConfiguration.PackageConfiguration packageConfiguration, C0 c0, PaywallViewModel paywallViewModel, float f, e eVar, int i, int i2) {
        super(2);
        this.$colors = colors;
        this.$packages = packageConfiguration;
        this.$selectedPackage = c0;
        this.$viewModel = paywallViewModel;
        this.$horizontalPadding = f;
        this.$childModifier = eVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        PurchaseButtonKt.access$PurchaseButton-WH-ejsw(this.$colors, this.$packages, this.$selectedPackage, this.$viewModel, this.$horizontalPadding, this.$childModifier, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}

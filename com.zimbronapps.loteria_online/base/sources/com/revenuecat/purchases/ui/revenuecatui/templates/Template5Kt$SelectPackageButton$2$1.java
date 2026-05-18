package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template5Kt$SelectPackageButton$2$1 extends u implements a {
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template5Kt$SelectPackageButton$2$1(PaywallViewModel paywallViewModel, TemplateConfiguration.PackageInfo packageInfo) {
        super(0);
        this.$viewModel = paywallViewModel;
        this.$packageInfo = packageInfo;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$viewModel.selectPackage(this.$packageInfo);
    }
}

package com.revenuecat.purchases.ui.revenuecatui.data;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallState$Loaded$Components$selectedPackageInfo$2 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallState$Loaded$Components$selectedPackageInfo$2(PaywallState.Loaded.Components components) {
        super(0);
        this.this$0 = components;
    }

    public final PaywallState.Loaded.Components.SelectedPackageInfo invoke() {
        PaywallState.Loaded.Components.AvailablePackages.Info access$findPackageInfoByUniqueId;
        String access$getSelectedPackageUniqueId = PaywallState.Loaded.Components.access$getSelectedPackageUniqueId(this.this$0);
        if (access$getSelectedPackageUniqueId == null || (access$findPackageInfoByUniqueId = PaywallState.Loaded.Components.access$findPackageInfoByUniqueId(this.this$0, access$getSelectedPackageUniqueId)) == null) {
            return null;
        }
        return new PaywallState.Loaded.Components.SelectedPackageInfo(access$findPackageInfoByUniqueId.getPkg(), access$findPackageInfoByUniqueId.getResolvedOffer(), access$getSelectedPackageUniqueId, PackageExtensionsKt.calculateOfferEligibility(access$findPackageInfoByUniqueId.getResolvedOffer(), access$findPackageInfoByUniqueId.getPkg()));
    }
}

package com.revenuecat.purchases.ui.revenuecatui.data;

import Da.D;
import Da.v;
import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.List;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$2 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$2(PaywallState.Loaded.Components components) {
        super(0);
        this.this$0 = components;
    }

    public final Long invoke() {
        PaywallState.Loaded.Components components = this.this$0;
        List packagesOutsideTabs = PaywallState.Loaded.Components.access$getPackages$p(components).getPackagesOutsideTabs();
        List list = (List) PaywallState.Loaded.Components.access$getPackages$p(this.this$0).getPackagesByTab().get(Integer.valueOf(this.this$0.getSelectedTabIndex()));
        if (list == null) {
            list = v.n();
        }
        return PaywallState.Loaded.Components.access$mostExpensivePricePerMonthMicros(components, D.v0(packagesOutsideTabs, list));
    }
}

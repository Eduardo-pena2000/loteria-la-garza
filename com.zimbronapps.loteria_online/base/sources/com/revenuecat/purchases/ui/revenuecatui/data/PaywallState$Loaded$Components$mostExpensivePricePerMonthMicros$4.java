package com.revenuecat.purchases.ui.revenuecatui.data;

import Qa.l;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$4 extends u implements l {
    public static final PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$4 INSTANCE = new PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$4();

    public PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$4() {
        super(1);
    }

    public final StoreProduct invoke(PaywallState.Loaded.Components.AvailablePackages.Info info) {
        t.g(info, "info");
        return info.getPkg().getProduct();
    }
}

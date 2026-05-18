package com.revenuecat.purchases.ui.revenuecatui.data;

import Qa.l;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.Locale;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$5 extends u implements l {
    public static final PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$5 INSTANCE = new PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$5();

    public PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$5() {
        super(1);
    }

    public final Price invoke(StoreProduct product) {
        t.g(product, "product");
        return StoreProduct.pricePerMonth$default(product, (Locale) null, 1, (Object) null);
    }
}

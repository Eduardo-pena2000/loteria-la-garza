package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Qa.l;
import com.revenuecat.purchases.models.Period;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VariableProcessorV2$productOfferPeriodInMonths$1 extends u implements l {
    public static final VariableProcessorV2$productOfferPeriodInMonths$1 INSTANCE = new VariableProcessorV2$productOfferPeriodInMonths$1();

    public VariableProcessorV2$productOfferPeriodInMonths$1() {
        super(1);
    }

    public final String invoke(Period productOfferPeriodInPeriodUnit) {
        t.g(productOfferPeriodInPeriodUnit, "$this$productOfferPeriodInPeriodUnit");
        return VariableProcessorV2.access$getRoundedValueInMonths(VariableProcessorV2.INSTANCE, productOfferPeriodInPeriodUnit);
    }
}

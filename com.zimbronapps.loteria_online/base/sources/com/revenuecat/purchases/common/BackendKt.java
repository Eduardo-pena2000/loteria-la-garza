package com.revenuecat.purchases.common;

import Ca.q;
import Ca.x;
import Da.S;
import com.revenuecat.purchases.models.PricingPhase;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BackendKt {
    public static final String ATTRIBUTES_ERROR_RESPONSE_KEY = "attributes_error_response";
    public static final String ATTRIBUTE_ERRORS_KEY = "attribute_errors";

    public static /* synthetic */ void CustomerCenterCallback$annotations() {
    }

    public static /* synthetic */ void OfferingsCallback$annotations() {
    }

    public static /* synthetic */ void ProductEntitlementCallback$annotations() {
    }

    public static final Map toMap(PricingPhase pricingPhase) {
        t.g(pricingPhase, "<this>");
        return S.l(new q[]{x.a("billingPeriod", pricingPhase.getBillingPeriod().getIso8601()), x.a("billingCycleCount", pricingPhase.getBillingCycleCount()), x.a("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier()), x.a("formattedPrice", pricingPhase.getPrice().getFormatted()), x.a("priceAmountMicros", Long.valueOf(pricingPhase.getPrice().getAmountMicros())), x.a("priceCurrencyCode", pricingPhase.getPrice().getCurrencyCode())});
    }
}

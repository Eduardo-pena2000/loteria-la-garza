package com.revenuecat.purchases.google;

import com.android.billingclient.api.ProductDetails;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(ProductDetails.PricingPhase pricingPhase) {
        t.g(pricingPhase, "<this>");
        Period.Factory factory = Period.Factory;
        String billingPeriod = pricingPhase.getBillingPeriod();
        t.f(billingPeriod, "billingPeriod");
        Period create = factory.create(billingPeriod);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(pricingPhase.getRecurrenceMode()));
        Integer valueOf = Integer.valueOf(pricingPhase.getBillingCycleCount());
        String formattedPrice = pricingPhase.getFormattedPrice();
        t.f(formattedPrice, "formattedPrice");
        long priceAmountMicros = pricingPhase.getPriceAmountMicros();
        String priceCurrencyCode = pricingPhase.getPriceCurrencyCode();
        t.f(priceCurrencyCode, "priceCurrencyCode");
        return new PricingPhase(create, recurrenceMode, valueOf, new Price(formattedPrice, priceAmountMicros, priceCurrencyCode));
    }
}

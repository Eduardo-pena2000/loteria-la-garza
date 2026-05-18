package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PriceExtensionsKt {
    public static final /* synthetic */ Price pricePerDay(Price price, Period billingPeriod, Locale locale) {
        t.g(price, "<this>");
        t.g(billingPeriod, "billingPeriod");
        t.g(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInDays(), locale);
    }

    public static final Price pricePerMonth(Price price, Period billingPeriod, Locale locale) {
        t.g(price, "<this>");
        t.g(billingPeriod, "billingPeriod");
        t.g(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInMonths(), locale);
    }

    private static final Price pricePerPeriod(Price price, double d, Locale locale) {
        return PriceFactory.INSTANCE.createPrice$purchases_defaultsBc8Release((long) (price.getAmountMicros() / d), price.getCurrencyCode(), locale);
    }

    public static final Price pricePerWeek(Price price, Period billingPeriod, Locale locale) {
        t.g(price, "<this>");
        t.g(billingPeriod, "billingPeriod");
        t.g(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInWeeks(), locale);
    }

    public static final Price pricePerYear(Price price, Period billingPeriod, Locale locale) {
        t.g(price, "<this>");
        t.g(billingPeriod, "billingPeriod");
        t.g(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInYears(), locale);
    }
}

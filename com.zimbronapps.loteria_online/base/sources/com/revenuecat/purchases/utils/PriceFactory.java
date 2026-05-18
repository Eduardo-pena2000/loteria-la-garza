package com.revenuecat.purchases.utils;

import Wa.n;
import com.revenuecat.purchases.models.Price;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PriceFactory {
    public static final PriceFactory INSTANCE = new PriceFactory();

    private PriceFactory() {
    }

    public final /* synthetic */ Price createPrice$purchases_defaultsBc8Release(long j, String currencyCode, Locale locale) {
        t.g(currencyCode, "currencyCode");
        t.g(locale, "locale");
        Currency currency = Currency.getInstance(currencyCode);
        int e = n.e(currency.getDefaultFractionDigits(), 0);
        double roundToDecimalPlaces = DoubleExtensionsKt.roundToDecimalPlaces(j / 1000000.0d, e);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(e);
        currencyInstance.setMinimumFractionDigits(e);
        String formatted = currencyInstance.format(roundToDecimalPlaces);
        t.f(formatted, "formatted");
        return new Price(formatted, j, currencyCode);
    }
}

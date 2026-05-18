package com.revenuecat.purchases.ui.revenuecatui.extensions;

import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProviderKt;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class PriceExtensionsKt {
    public static final /* synthetic */ String localized(Price price, Locale locale, boolean z) {
        t.g(price, "<this>");
        t.g(locale, "locale");
        return (z && VariableDataProviderKt.endsIn00Cents(price)) ? VariableDataProviderKt.getTruncatedFormatted(price, locale) : price.getFormatted();
    }

    public static final /* synthetic */ String localizedPerPeriod(Price price, Period period, Locale locale, boolean z) {
        t.g(price, "<this>");
        t.g(period, "period");
        t.g(locale, "locale");
        return localized(price, locale, z) + '/' + PeriodExtensionsKt.localizedAbbreviatedPeriod(period, locale);
    }
}

package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Sa.c;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VariableDataProviderKt {
    private static final double MICRO_MULTIPLIER = 1000000.0d;

    public static final /* synthetic */ String access$localizedDiscount(ResourceProvider resourceProvider, Double d) {
        return localizedDiscount(resourceProvider, d);
    }

    public static final /* synthetic */ Period access$normalizedMonths(Period period) {
        return normalizedMonths(period);
    }

    public static final boolean endsIn00Cents(Price price) {
        t.g(price, "<this>");
        double d = 100;
        return ((((double) Math.round((((double) price.getAmountMicros()) / 1000000.0d) * d)) / 100.0d) * d) % d == 0.0d;
    }

    public static final String getTruncatedFormatted(Price price, Locale locale) {
        t.g(price, "<this>");
        t.g(locale, "locale");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(price.getCurrencyCode()));
        currencyInstance.setMaximumFractionDigits(0);
        String format = currencyInstance.format(price.getAmountMicros() / 1000000.0d);
        t.f(format, "numberFormat.format(amount)");
        return format;
    }

    public static /* synthetic */ String getTruncatedFormatted$default(Price price, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return getTruncatedFormatted(price, locale);
    }

    public static final String localizedDiscount(TemplateConfiguration.PackageInfo packageInfo, ResourceProvider resourceProvider) {
        t.g(packageInfo, "<this>");
        t.g(resourceProvider, "resourceProvider");
        return localizedDiscount(resourceProvider, packageInfo.getDiscountRelativeToMostExpensivePerMonth());
    }

    private static final Period normalizedMonths(Period period) {
        if (period.getUnit() != Period.Unit.YEAR) {
            return period;
        }
        int value = period.getValue() * 12;
        Period.Unit unit = Period.Unit.MONTH;
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        sb.append(value);
        sb.append('M');
        return new Period(value, unit, sb.toString());
    }

    private static final String localizedDiscount(ResourceProvider resourceProvider, Double d) {
        if (d == null) {
            return null;
        }
        return resourceProvider.getString(R.string.package_discount, Integer.valueOf(c.c(d.doubleValue() * 100.0d)));
    }
}

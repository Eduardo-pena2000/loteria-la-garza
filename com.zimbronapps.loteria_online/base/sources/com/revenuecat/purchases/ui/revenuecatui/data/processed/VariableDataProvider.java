package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Ca.o;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PeriodExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PriceExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VariableDataProvider {
    public static final int $stable = 8;
    private final boolean preview;
    private final ResourceProvider resourceProvider;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PackageType.values().length];
            try {
                iArr[PackageType.LIFETIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackageType.ANNUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PackageType.SIX_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PackageType.THREE_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PackageType.TWO_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PackageType.MONTHLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PackageType.WEEKLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PackageType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PackageType.CUSTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VariableDataProvider(ResourceProvider resourceProvider, boolean z) {
        t.g(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
        this.preview = z;
    }

    private final PricingPhase getFirstIntroOfferToApply(Package r2) {
        PricingPhase freePhase;
        SubscriptionOption defaultOption = r2.getProduct().getDefaultOption();
        if (defaultOption != null && (freePhase = defaultOption.getFreePhase()) != null) {
            return freePhase;
        }
        if (defaultOption != null) {
            return defaultOption.getIntroPhase();
        }
        return null;
    }

    private final PricingPhase getSecondIntroOfferToApply(Package r3) {
        SubscriptionOption defaultOption = r3.getProduct().getDefaultOption();
        if ((defaultOption != null ? defaultOption.getFreePhase() : null) != null) {
            return defaultOption.getIntroPhase();
        }
        return null;
    }

    public final String firstIntroductoryOfferDuration(Package rcPackage, Locale locale) {
        Period billingPeriod;
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        PricingPhase firstIntroOfferToApply = getFirstIntroOfferToApply(rcPackage);
        if (firstIntroOfferToApply == null || (billingPeriod = firstIntroOfferToApply.getBillingPeriod()) == null) {
            return null;
        }
        return PeriodExtensionsKt.localizedPeriod$default(billingPeriod, locale, null, 2, null);
    }

    public final String getApplicationName() {
        return !this.preview ? this.resourceProvider.getApplicationName() : "Application Name";
    }

    public final String localizedFirstIntroductoryOfferPrice(Package rcPackage, Locale locale, boolean z) {
        Price price;
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        PricingPhase firstIntroOfferToApply = getFirstIntroOfferToApply(rcPackage);
        if (firstIntroOfferToApply == null || (price = firstIntroOfferToApply.getPrice()) == null) {
            return null;
        }
        return (z && VariableDataProviderKt.endsIn00Cents(price)) ? VariableDataProviderKt.getTruncatedFormatted(price, locale) : price.getFormatted();
    }

    public final String localizedPrice(Package rcPackage, Locale locale, boolean z) {
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        return PriceExtensionsKt.localized(rcPackage.getProduct().getPrice(), locale, z);
    }

    public final String localizedPriceAndPerMonth(Package rcPackage, Locale locale, boolean z) {
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        if (!PackageExtensionsKt.isSubscription(rcPackage) || PackageExtensionsKt.isMonthly(rcPackage)) {
            return localizedPricePerPeriod(rcPackage, locale, z);
        }
        String localizedAbbreviatedPeriod = PeriodExtensionsKt.localizedAbbreviatedPeriod(new Period(1, Period.Unit.MONTH, "P1M"), locale);
        return localizedPricePerPeriod(rcPackage, locale, z) + " (" + localizedPricePerMonth(rcPackage, locale, z) + '/' + localizedAbbreviatedPeriod + ')';
    }

    public final String localizedPriceAndPerMonthFull(Package rcPackage, Locale locale, boolean z) {
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        if (!PackageExtensionsKt.isSubscription(rcPackage) || PackageExtensionsKt.isMonthly(rcPackage)) {
            return localizedPricePerPeriodFull(rcPackage, locale, z);
        }
        String localizedUnitPeriod = PeriodExtensionsKt.localizedUnitPeriod(new Period(1, Period.Unit.MONTH, "P1M"), locale);
        return localizedPricePerPeriodFull(rcPackage, locale, z) + " (" + localizedPricePerMonth(rcPackage, locale, z) + '/' + localizedUnitPeriod + ')';
    }

    public final String localizedPricePerDay(Package rcPackage, Locale locale, boolean z) {
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        Price pricePerDay = rcPackage.getProduct().pricePerDay(locale);
        if (pricePerDay == null) {
            return null;
        }
        return (z && VariableDataProviderKt.endsIn00Cents(pricePerDay)) ? VariableDataProviderKt.getTruncatedFormatted(pricePerDay, locale) : pricePerDay.getFormatted();
    }

    public final String localizedPricePerMonth(Package rcPackage, Locale locale, boolean z) {
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        Price pricePerMonth = rcPackage.getProduct().pricePerMonth(locale);
        if (pricePerMonth == null) {
            return null;
        }
        return (z && VariableDataProviderKt.endsIn00Cents(pricePerMonth)) ? VariableDataProviderKt.getTruncatedFormatted(pricePerMonth, locale) : pricePerMonth.getFormatted();
    }

    public final String localizedPricePerPeriod(Package rcPackage, Locale locale, boolean z) {
        String localizedPerPeriod;
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        StoreProduct product = rcPackage.getProduct();
        Period period = product.getPeriod();
        return (period == null || (localizedPerPeriod = PriceExtensionsKt.localizedPerPeriod(product.getPrice(), period, locale, z)) == null) ? PriceExtensionsKt.localized(product.getPrice(), locale, z) : localizedPerPeriod;
    }

    public final String localizedPricePerPeriodFull(Package rcPackage, Locale locale, boolean z) {
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        StoreProduct product = rcPackage.getProduct();
        String localized = PriceExtensionsKt.localized(product.getPrice(), locale, z);
        Period period = product.getPeriod();
        if (period == null) {
            return localized;
        }
        String str = localized + '/' + PeriodExtensionsKt.localizedUnitPeriod(period, locale);
        return str == null ? localized : str;
    }

    public final String localizedPricePerWeek(Package rcPackage, Locale locale, boolean z) {
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        Price pricePerWeek = rcPackage.getProduct().pricePerWeek(locale);
        if (pricePerWeek == null) {
            return null;
        }
        return (z && VariableDataProviderKt.endsIn00Cents(pricePerWeek)) ? VariableDataProviderKt.getTruncatedFormatted(pricePerWeek, locale) : pricePerWeek.getFormatted();
    }

    public final String localizedPricePerYear(Package rcPackage, Locale locale, boolean z) {
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        Price pricePerYear = rcPackage.getProduct().pricePerYear(locale);
        if (pricePerYear == null) {
            return null;
        }
        return (z && VariableDataProviderKt.endsIn00Cents(pricePerYear)) ? VariableDataProviderKt.getTruncatedFormatted(pricePerYear, locale) : pricePerYear.getFormatted();
    }

    public final String localizedRelativeDiscount(Double d) {
        return VariableDataProviderKt.access$localizedDiscount(this.resourceProvider, d);
    }

    public final String localizedSecondIntroductoryOfferPrice(Package rcPackage, Locale locale, boolean z) {
        Price price;
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        PricingPhase secondIntroOfferToApply = getSecondIntroOfferToApply(rcPackage);
        if (secondIntroOfferToApply == null || (price = secondIntroOfferToApply.getPrice()) == null) {
            return null;
        }
        return (z && VariableDataProviderKt.endsIn00Cents(price)) ? VariableDataProviderKt.getTruncatedFormatted(price, locale) : price.getFormatted();
    }

    public final String periodLength(Package rcPackage, Locale locale) {
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        Period period = rcPackage.getProduct().getPeriod();
        if (period != null) {
            return PeriodExtensionsKt.localizedUnitPeriod(period, locale);
        }
        return null;
    }

    public final String periodName(Package rcPackage) {
        Number valueOf;
        t.g(rcPackage, "rcPackage");
        if (rcPackage.getPackageType() == PackageType.CUSTOM || rcPackage.getPackageType() == PackageType.UNKNOWN) {
            return rcPackage.getIdentifier();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[rcPackage.getPackageType().ordinal()]) {
            case 1:
                valueOf = Integer.valueOf(R.string.lifetime);
                break;
            case 2:
                valueOf = Integer.valueOf(R.string.annual);
                break;
            case 3:
                valueOf = Integer.valueOf(R.string.semester);
                break;
            case 4:
                valueOf = Integer.valueOf(R.string.quarter);
                break;
            case 5:
                valueOf = Integer.valueOf(R.string.bimonthly);
                break;
            case 6:
                valueOf = Integer.valueOf(R.string.monthly);
                break;
            case 7:
                valueOf = Integer.valueOf(R.string.weekly);
                break;
            case 8:
            case 9:
                valueOf = null;
                break;
            default:
                throw new o();
        }
        if (valueOf == null) {
            return null;
        }
        return this.resourceProvider.getString(valueOf.intValue(), new Object[0]);
    }

    public final String periodNameAbbreviation(Package rcPackage, Locale locale) {
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        Period period = rcPackage.getProduct().getPeriod();
        if (period != null) {
            return PeriodExtensionsKt.localizedAbbreviatedPeriod(period, locale);
        }
        return null;
    }

    public final String productName(Package rcPackage) {
        t.g(rcPackage, "rcPackage");
        return rcPackage.getProduct().getName();
    }

    public final String secondIntroductoryOfferDuration(Package rcPackage, Locale locale) {
        Period billingPeriod;
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        PricingPhase secondIntroOfferToApply = getSecondIntroOfferToApply(rcPackage);
        if (secondIntroOfferToApply == null || (billingPeriod = secondIntroOfferToApply.getBillingPeriod()) == null) {
            return null;
        }
        return PeriodExtensionsKt.localizedPeriod$default(billingPeriod, locale, null, 2, null);
    }

    public final String subscriptionDuration(Package rcPackage, Locale locale) {
        String localizedPeriod$default;
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        Period period = rcPackage.getProduct().getPeriod();
        return (period == null || (localizedPeriod$default = PeriodExtensionsKt.localizedPeriod$default(period, locale, null, 2, null)) == null) ? periodName(rcPackage) : localizedPeriod$default;
    }

    public final String subscriptionDurationInMonths(Package rcPackage, Locale locale) {
        Period access$normalizedMonths;
        String localizedPeriod$default;
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        Period period = rcPackage.getProduct().getPeriod();
        return (period == null || (access$normalizedMonths = VariableDataProviderKt.access$normalizedMonths(period)) == null || (localizedPeriod$default = PeriodExtensionsKt.localizedPeriod$default(access$normalizedMonths, locale, null, 2, null)) == null) ? periodName(rcPackage) : localizedPeriod$default;
    }

    public /* synthetic */ VariableDataProvider(ResourceProvider resourceProvider, boolean z, int i, k kVar) {
        this(resourceProvider, (i & 2) != 0 ? false : z);
    }
}

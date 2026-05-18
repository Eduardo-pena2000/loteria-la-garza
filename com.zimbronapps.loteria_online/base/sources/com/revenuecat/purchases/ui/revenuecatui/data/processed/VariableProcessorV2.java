package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Ca.l;
import Ca.m;
import Da.D;
import Da.S;
import Da.v;
import Da.w;
import Qa.p;
import Sa.c;
import Za.B;
import Za.E;
import Za.a;
import Za.o;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownTime;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VariableProcessorV2 {
    private static final float PERCENT_SCALE = 100.0f;
    public static final VariableProcessorV2 INSTANCE = new VariableProcessorV2();
    private static final o regex = new o("\\{\\{\\s*(.*?)\\s*\\}\\}");
    private static final List customVariablePrefixes = v.q("custom.", "$custom.");
    public static final int $stable = 8;

    public enum Function {
        LOWERCASE("lowercase"),
        UPPERCASE("uppercase"),
        CAPITALIZE("capitalize");

        private final String identifier;
        public static final Companion Companion = new Companion(null);
        private static final l valuesByIdentifier$delegate = m.b(VariableProcessorV2$Function$Companion$valuesByIdentifier$2.INSTANCE);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private final Map getValuesByIdentifier() {
                return (Map) Function.access$getValuesByIdentifier$delegate$cp().getValue();
            }

            public final Function valueOfIdentifier(String identifier) {
                t.g(identifier, "identifier");
                return (Function) getValuesByIdentifier().get(identifier);
            }

            private Companion() {
            }
        }

        Function(String str) {
            this.identifier = str;
        }

        public static final /* synthetic */ l access$getValuesByIdentifier$delegate$cp() {
            return valuesByIdentifier$delegate;
        }

        public final /* synthetic */ String getIdentifier() {
            return this.identifier;
        }
    }

    public enum Variable {
        PRODUCT_CURRENCY_CODE("product.currency_code"),
        PRODUCT_CURRENCY_SYMBOL("product.currency_symbol"),
        PRODUCT_PERIODLY("product.periodly"),
        PRODUCT_PRICE("product.price"),
        PRODUCT_PRICE_PER_PERIOD("product.price_per_period"),
        PRODUCT_PRICE_PER_PERIOD_ABBREVIATED("product.price_per_period_abbreviated"),
        PRODUCT_PRICE_PER_DAY("product.price_per_day"),
        PRODUCT_PRICE_PER_WEEK("product.price_per_week"),
        PRODUCT_PRICE_PER_MONTH("product.price_per_month"),
        PRODUCT_PRICE_PER_YEAR("product.price_per_year"),
        PRODUCT_PERIOD("product.period"),
        PRODUCT_PERIOD_ABBREVIATED("product.period_abbreviated"),
        PRODUCT_PERIOD_IN_DAYS("product.period_in_days"),
        PRODUCT_PERIOD_IN_WEEKS("product.period_in_weeks"),
        PRODUCT_PERIOD_IN_MONTHS("product.period_in_months"),
        PRODUCT_PERIOD_IN_YEARS("product.period_in_years"),
        PRODUCT_PERIOD_WITH_UNIT("product.period_with_unit"),
        PRODUCT_OFFER_PRICE("product.offer_price"),
        PRODUCT_OFFER_PRICE_PER_DAY("product.offer_price_per_day"),
        PRODUCT_OFFER_PRICE_PER_WEEK("product.offer_price_per_week"),
        PRODUCT_OFFER_PRICE_PER_MONTH("product.offer_price_per_month"),
        PRODUCT_OFFER_PRICE_PER_YEAR("product.offer_price_per_year"),
        PRODUCT_OFFER_PERIOD("product.offer_period"),
        PRODUCT_OFFER_PERIOD_ABBREVIATED("product.offer_period_abbreviated"),
        PRODUCT_OFFER_PERIOD_IN_DAYS("product.offer_period_in_days"),
        PRODUCT_OFFER_PERIOD_IN_WEEKS("product.offer_period_in_weeks"),
        PRODUCT_OFFER_PERIOD_IN_MONTHS("product.offer_period_in_months"),
        PRODUCT_OFFER_PERIOD_IN_YEARS("product.offer_period_in_years"),
        PRODUCT_OFFER_PERIOD_WITH_UNIT("product.offer_period_with_unit"),
        PRODUCT_OFFER_END_DATE("product.offer_end_date"),
        PRODUCT_SECONDARY_OFFER_PRICE("product.secondary_offer_price"),
        PRODUCT_SECONDARY_OFFER_PERIOD("product.secondary_offer_period"),
        PRODUCT_SECONDARY_OFFER_PERIOD_ABBREVIATED("product.secondary_offer_period_abbreviated"),
        PRODUCT_RELATIVE_DISCOUNT("product.relative_discount"),
        PRODUCT_STORE_PRODUCT_NAME("product.store_product_name"),
        COUNT_DAYS_WITH_ZERO("count_days_with_zero"),
        COUNT_DAYS_WITHOUT_ZERO("count_days_without_zero"),
        COUNT_HOURS_WITH_ZERO("count_hours_with_zero"),
        COUNT_HOURS_WITHOUT_ZERO("count_hours_without_zero"),
        COUNT_MINUTES_WITH_ZERO("count_minutes_with_zero"),
        COUNT_MINUTES_WITHOUT_ZERO("count_minutes_without_zero"),
        COUNT_SECONDS_WITH_ZERO("count_seconds_with_zero"),
        COUNT_SECONDS_WITHOUT_ZERO("count_seconds_without_zero");

        private final String identifier;
        public static final Companion Companion = new Companion(null);
        private static final l valuesByIdentifier$delegate = m.b(VariableProcessorV2$Variable$Companion$valuesByIdentifier$2.INSTANCE);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private final Map getValuesByIdentifier() {
                return (Map) Variable.access$getValuesByIdentifier$delegate$cp().getValue();
            }

            public final Variable valueOfIdentifier(String identifier) {
                t.g(identifier, "identifier");
                return (Variable) getValuesByIdentifier().get(identifier);
            }

            private Companion() {
            }
        }

        Variable(String str) {
            this.identifier = str;
        }

        public static final /* synthetic */ l access$getValuesByIdentifier$delegate$cp() {
            return valuesByIdentifier$delegate;
        }

        public final /* synthetic */ String getIdentifier() {
            return this.identifier;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CountdownComponent.CountFrom.values().length];
            try {
                iArr[CountdownComponent.CountFrom.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountdownComponent.CountFrom.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountdownComponent.CountFrom.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Variable.values().length];
            try {
                iArr2[Variable.PRODUCT_CURRENCY_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Variable.PRODUCT_CURRENCY_SYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIODLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_PERIOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_PERIOD_ABBREVIATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_WEEK.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_MONTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Variable.PRODUCT_PRICE_PER_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_ABBREVIATED.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_IN_DAYS.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_IN_WEEKS.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_IN_MONTHS.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_IN_YEARS.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[Variable.PRODUCT_PERIOD_WITH_UNIT.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PRICE.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PRICE_PER_DAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PRICE_PER_WEEK.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PRICE_PER_MONTH.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PRICE_PER_YEAR.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_ABBREVIATED.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_IN_DAYS.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_IN_WEEKS.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_IN_MONTHS.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_IN_YEARS.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_PERIOD_WITH_UNIT.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[Variable.PRODUCT_OFFER_END_DATE.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[Variable.PRODUCT_SECONDARY_OFFER_PRICE.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[Variable.PRODUCT_SECONDARY_OFFER_PERIOD.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[Variable.PRODUCT_SECONDARY_OFFER_PERIOD_ABBREVIATED.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[Variable.PRODUCT_RELATIVE_DISCOUNT.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[Variable.PRODUCT_STORE_PRODUCT_NAME.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[Variable.COUNT_DAYS_WITH_ZERO.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[Variable.COUNT_DAYS_WITHOUT_ZERO.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[Variable.COUNT_HOURS_WITH_ZERO.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[Variable.COUNT_HOURS_WITHOUT_ZERO.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[Variable.COUNT_MINUTES_WITH_ZERO.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[Variable.COUNT_MINUTES_WITHOUT_ZERO.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[Variable.COUNT_SECONDS_WITH_ZERO.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[Variable.COUNT_SECONDS_WITHOUT_ZERO.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Function.values().length];
            try {
                iArr3[Function.LOWERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr3[Function.UPPERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr3[Function.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Period.Unit.values().length];
            try {
                iArr4[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr4[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr4[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr4[Period.Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr4[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused54) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CountdownComponent.CountFrom $countFrom;
        final /* synthetic */ CountdownTime $countdownTime;
        final /* synthetic */ Locale $currencyLocale;
        final /* synthetic */ Map $customVariables;
        final /* synthetic */ Date $date;
        final /* synthetic */ Locale $dateLocale;
        final /* synthetic */ Map $defaultCustomVariables;
        final /* synthetic */ Map $localizedVariableKeys;
        final /* synthetic */ VariableProcessor.PackageContext $packageContext;
        final /* synthetic */ Package $rcPackage;
        final /* synthetic */ SubscriptionOption $subscriptionOption;
        final /* synthetic */ UiConfig.VariableConfig $variableConfig;
        final /* synthetic */ VariableDataProvider $variableDataProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Map map, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r5, SubscriptionOption subscriptionOption, Locale locale, Locale locale2, Date date, CountdownTime countdownTime, CountdownComponent.CountFrom countFrom, Map map2, Map map3) {
            super(2);
            this.$localizedVariableKeys = map;
            this.$variableConfig = variableConfig;
            this.$variableDataProvider = variableDataProvider;
            this.$packageContext = packageContext;
            this.$rcPackage = r5;
            this.$subscriptionOption = subscriptionOption;
            this.$currencyLocale = locale;
            this.$dateLocale = locale2;
            this.$date = date;
            this.$countdownTime = countdownTime;
            this.$countFrom = countFrom;
            this.$customVariables = map2;
            this.$defaultCustomVariables = map3;
        }

        public final String invoke(String variable, List functions) {
            t.g(variable, "variable");
            t.g(functions, "functions");
            return VariableProcessorV2.access$getVariableValue(VariableProcessorV2.INSTANCE, variable, functions, this.$localizedVariableKeys, this.$variableConfig, this.$variableDataProvider, this.$packageContext, this.$rcPackage, this.$subscriptionOption, this.$currencyLocale, this.$dateLocale, this.$date, this.$countdownTime, this.$countFrom, this.$customVariables, this.$defaultCustomVariables);
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ Locale $locale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Locale locale) {
            super(1);
            this.$locale = locale;
        }

        public final Price invoke(PricingPhase productOfferPricePerPeriod) {
            t.g(productOfferPricePerPeriod, "$this$productOfferPricePerPeriod");
            return productOfferPricePerPeriod.pricePerDay(this.$locale);
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ Locale $locale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Locale locale) {
            super(1);
            this.$locale = locale;
        }

        public final Price invoke(PricingPhase productOfferPricePerPeriod) {
            t.g(productOfferPricePerPeriod, "$this$productOfferPricePerPeriod");
            return productOfferPricePerPeriod.pricePerMonth(this.$locale);
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ Locale $locale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Locale locale) {
            super(1);
            this.$locale = locale;
        }

        public final Price invoke(PricingPhase productOfferPricePerPeriod) {
            t.g(productOfferPricePerPeriod, "$this$productOfferPricePerPeriod");
            return productOfferPricePerPeriod.pricePerWeek(this.$locale);
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ Locale $locale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Locale locale) {
            super(1);
            this.$locale = locale;
        }

        public final Price invoke(PricingPhase productOfferPricePerPeriod) {
            t.g(productOfferPricePerPeriod, "$this$productOfferPricePerPeriod");
            return productOfferPricePerPeriod.pricePerYear(this.$locale);
        }
    }

    private VariableProcessorV2() {
    }

    public static final /* synthetic */ String access$getRoundedValueInDays(VariableProcessorV2 variableProcessorV2, Period period) {
        return variableProcessorV2.getRoundedValueInDays(period);
    }

    public static final /* synthetic */ String access$getRoundedValueInMonths(VariableProcessorV2 variableProcessorV2, Period period) {
        return variableProcessorV2.getRoundedValueInMonths(period);
    }

    public static final /* synthetic */ String access$getRoundedValueInWeeks(VariableProcessorV2 variableProcessorV2, Period period) {
        return variableProcessorV2.getRoundedValueInWeeks(period);
    }

    public static final /* synthetic */ String access$getRoundedValueInYears(VariableProcessorV2 variableProcessorV2, Period period) {
        return variableProcessorV2.getRoundedValueInYears(period);
    }

    public static final /* synthetic */ String access$getVariableValue(VariableProcessorV2 variableProcessorV2, String str, List list, Map map, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r7, SubscriptionOption subscriptionOption, Locale locale, Locale locale2, Date date, CountdownTime countdownTime, CountdownComponent.CountFrom countFrom, Map map2, Map map3) {
        return variableProcessorV2.getVariableValue(str, list, map, variableConfig, variableDataProvider, packageContext, r7, subscriptionOption, locale, locale2, date, countdownTime, countFrom, map2, map3);
    }

    private final boolean canDisplay(PricingPhase pricingPhase, Period.Unit unit) {
        return unit.ordinal() <= pricingPhase.getBillingPeriod().getUnit().ordinal();
    }

    private final void checkForMalformedCustomVariable(String str) {
        for (String str2 : v.q("custom", "$custom")) {
            if (!t.c(str, str2)) {
                if (B.N(str, str2 + ' ', false, 2, null)) {
                }
            }
            Logger.INSTANCE.w("Variable '" + str + "' looks like it might be intended as a custom variable. Use 'custom.<variable_name>' or '$custom.<variable_name>' syntax instead.");
            return;
        }
    }

    private final String extractCustomVariableKey(String str) {
        for (String str2 : customVariablePrefixes) {
            if (B.N(str, str2, false, 2, null)) {
                String B0 = E.B0(str, str2);
                if (B0.length() != 0) {
                    return B0;
                }
                Logger.INSTANCE.w("Custom variable '" + str + "' appears to be malformed. Expected format: 'custom.<variable_name>' or '$custom.<variable_name>'.");
                return null;
            }
        }
        checkForMalformedCustomVariable(str);
        return null;
    }

    private final void failedToGetValue(Logger logger, String str, Package r5) {
        logger.w("Could not process value for variable '" + str + "' for package '" + r5.getIdentifier() + "'. Please check that the product for that package matches the requirements for that variable. Defaulting to empty string.");
    }

    private final Function findFunction(String str, Map map) {
        Function valueOfIdentifier = Function.Companion.valueOfIdentifier(str);
        if (valueOfIdentifier != null) {
            return valueOfIdentifier;
        }
        String str2 = (String) map.get(str);
        if (str2 != null) {
            Function findFunction = findFunction(str2, map);
            if (findFunction != null) {
                INSTANCE.usingFallbackFunction(Logger.INSTANCE, str, str2);
                return findFunction;
            }
        } else {
            unsupportedFunctionWithoutFallback(Logger.INSTANCE, str);
        }
        return null;
    }

    private final Variable findVariable(String str, Map map) {
        Variable valueOfIdentifier = Variable.Companion.valueOfIdentifier(str);
        if (valueOfIdentifier != null) {
            return valueOfIdentifier;
        }
        String str2 = (String) map.get(str);
        if (str2 != null) {
            Variable findVariable = findVariable(str2, map);
            if (findVariable != null) {
                INSTANCE.usingFallbackVariable(Logger.INSTANCE, str, str2);
                return findVariable;
            }
        } else {
            unsupportedVariableWithoutFallback(Logger.INSTANCE, str);
        }
        return null;
    }

    private final VariableLocalizationKey getPeriodUnitAbbreviatedLocalizationKey(Package r2) {
        if (isLifetime(r2)) {
            return VariableLocalizationKey.LIFETIME;
        }
        Period period = r2.getProduct().getPeriod();
        if (period != null) {
            return getPeriodUnitAbbreviatedLocalizationKey(period);
        }
        return null;
    }

    private final VariableLocalizationKey getPeriodUnitLocalizationKey(Package r2) {
        if (isLifetime(r2)) {
            return VariableLocalizationKey.LIFETIME;
        }
        Period period = r2.getProduct().getPeriod();
        if (period != null) {
            return getPeriodUnitLocalizationKey(period);
        }
        return null;
    }

    private final VariableLocalizationKey getPeriodValueWithUnitAbbreviatedLocalizationKey(Period period) {
        int i = WhenMappings.$EnumSwitchMapping$3[period.getUnit().ordinal()];
        if (i == 1) {
            return VariableLocalizationKey.NUM_DAYS_SHORT;
        }
        if (i == 2) {
            return VariableLocalizationKey.NUM_WEEKS_SHORT;
        }
        if (i == 3) {
            return VariableLocalizationKey.NUM_MONTHS_SHORT;
        }
        if (i == 4) {
            return VariableLocalizationKey.NUM_YEARS_SHORT;
        }
        if (i == 5) {
            return null;
        }
        throw new Ca.o();
    }

    private final VariableLocalizationKey getPeriodValueWithUnitLocalizationKey(Period period) {
        if (period.getValue() == 0 && period.getUnit() == Period.Unit.DAY) {
            return VariableLocalizationKey.NUM_DAY_ZERO;
        }
        if (period.getValue() == 0 && period.getUnit() == Period.Unit.WEEK) {
            return VariableLocalizationKey.NUM_WEEK_ZERO;
        }
        if (period.getValue() == 0 && period.getUnit() == Period.Unit.MONTH) {
            return VariableLocalizationKey.NUM_MONTH_ZERO;
        }
        if (period.getValue() == 0 && period.getUnit() == Period.Unit.YEAR) {
            return VariableLocalizationKey.NUM_YEAR_ZERO;
        }
        if (period.getValue() == 1 && period.getUnit() == Period.Unit.DAY) {
            return VariableLocalizationKey.NUM_DAY_ONE;
        }
        if (period.getValue() == 1 && period.getUnit() == Period.Unit.WEEK) {
            return VariableLocalizationKey.NUM_WEEK_ONE;
        }
        if (period.getValue() == 1 && period.getUnit() == Period.Unit.MONTH) {
            return VariableLocalizationKey.NUM_MONTH_ONE;
        }
        if (period.getValue() == 1 && period.getUnit() == Period.Unit.YEAR) {
            return VariableLocalizationKey.NUM_YEAR_ONE;
        }
        if (period.getValue() == 2 && period.getUnit() == Period.Unit.DAY) {
            return VariableLocalizationKey.NUM_DAY_TWO;
        }
        if (period.getValue() == 2 && period.getUnit() == Period.Unit.WEEK) {
            return VariableLocalizationKey.NUM_WEEK_TWO;
        }
        if (period.getValue() == 2 && period.getUnit() == Period.Unit.MONTH) {
            return VariableLocalizationKey.NUM_MONTH_TWO;
        }
        if (period.getValue() == 2 && period.getUnit() == Period.Unit.YEAR) {
            return VariableLocalizationKey.NUM_YEAR_TWO;
        }
        int value = period.getValue();
        if (3 <= value && value < 5 && period.getUnit() == Period.Unit.DAY) {
            return VariableLocalizationKey.NUM_DAY_FEW;
        }
        int value2 = period.getValue();
        if (3 <= value2 && value2 < 5 && period.getUnit() == Period.Unit.WEEK) {
            return VariableLocalizationKey.NUM_WEEK_FEW;
        }
        int value3 = period.getValue();
        if (3 <= value3 && value3 < 5 && period.getUnit() == Period.Unit.MONTH) {
            return VariableLocalizationKey.NUM_MONTH_FEW;
        }
        int value4 = period.getValue();
        if (3 <= value4 && value4 < 5 && period.getUnit() == Period.Unit.YEAR) {
            return VariableLocalizationKey.NUM_YEAR_FEW;
        }
        int value5 = period.getValue();
        if (5 <= value5 && value5 < 11 && period.getUnit() == Period.Unit.DAY) {
            return VariableLocalizationKey.NUM_DAY_MANY;
        }
        int value6 = period.getValue();
        if (5 <= value6 && value6 < 11 && period.getUnit() == Period.Unit.WEEK) {
            return VariableLocalizationKey.NUM_WEEK_MANY;
        }
        int value7 = period.getValue();
        if (5 <= value7 && value7 < 11 && period.getUnit() == Period.Unit.MONTH) {
            return VariableLocalizationKey.NUM_MONTH_MANY;
        }
        int value8 = period.getValue();
        return (5 > value8 || value8 >= 11 || period.getUnit() != Period.Unit.YEAR) ? period.getUnit() == Period.Unit.DAY ? VariableLocalizationKey.NUM_DAY_OTHER : period.getUnit() == Period.Unit.WEEK ? VariableLocalizationKey.NUM_WEEK_OTHER : period.getUnit() == Period.Unit.MONTH ? VariableLocalizationKey.NUM_MONTH_OTHER : period.getUnit() == Period.Unit.YEAR ? VariableLocalizationKey.NUM_YEAR_OTHER : VariableLocalizationKey.NUM_DAY_OTHER : VariableLocalizationKey.NUM_YEAR_MANY;
    }

    private static /* synthetic */ void getPeriodValueWithUnitLocalizationKey$annotations(Period period) {
    }

    private final String getProductOfferPeriodInDays(PricingPhase pricingPhase) {
        return productOfferPeriodInPeriodUnit(pricingPhase, Period.Unit.DAY, VariableProcessorV2$productOfferPeriodInDays$1.INSTANCE);
    }

    private final String getProductOfferPeriodInMonths(PricingPhase pricingPhase) {
        return productOfferPeriodInPeriodUnit(pricingPhase, Period.Unit.MONTH, VariableProcessorV2$productOfferPeriodInMonths$1.INSTANCE);
    }

    private final String getProductOfferPeriodInWeeks(PricingPhase pricingPhase) {
        return productOfferPeriodInPeriodUnit(pricingPhase, Period.Unit.WEEK, VariableProcessorV2$productOfferPeriodInWeeks$1.INSTANCE);
    }

    private final String getProductOfferPeriodInYears(PricingPhase pricingPhase) {
        return productOfferPeriodInPeriodUnit(pricingPhase, Period.Unit.YEAR, VariableProcessorV2$productOfferPeriodInYears$1.INSTANCE);
    }

    private final String getRoundedValueInDays(Period period) {
        return String.valueOf(c.c(period.getValueInDays()));
    }

    private final String getRoundedValueInMonths(Period period) {
        return String.valueOf(c.c(period.getValueInMonths()));
    }

    private final String getRoundedValueInWeeks(Period period) {
        return String.valueOf(c.c(period.getValueInWeeks()));
    }

    private final String getRoundedValueInYears(Period period) {
        return String.valueOf(c.c(period.getValueInYears()));
    }

    private final String getStringOrLogError(Map map, VariableLocalizationKey variableLocalizationKey) {
        String str = (String) map.get(variableLocalizationKey);
        if (str == null) {
            Logger.INSTANCE.e("Could not find localized string for variable key: " + variableLocalizationKey);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x038c A[PHI: r2
      0x038c: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:251:0x03c4, B:240:0x038a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getValue(com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2.Variable r19, java.util.Map r20, com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider r21, com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor.PackageContext r22, com.revenuecat.purchases.Package r23, com.revenuecat.purchases.models.SubscriptionOption r24, java.util.Locale r25, java.util.Locale r26, java.util.Date r27, com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownTime r28, com.revenuecat.purchases.paywalls.components.CountdownComponent.CountFrom r29) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2.getValue(com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2$Variable, java.util.Map, com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider, com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor$PackageContext, com.revenuecat.purchases.Package, com.revenuecat.purchases.models.SubscriptionOption, java.util.Locale, java.util.Locale, java.util.Date, com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownTime, com.revenuecat.purchases.paywalls.components.CountdownComponent$CountFrom):java.lang.String");
    }

    private final String getVariableValue(String str, List list, Map map, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r24, SubscriptionOption subscriptionOption, Locale locale, Locale locale2, Date date, CountdownTime countdownTime, CountdownComponent.CountFrom countFrom, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Function findFunction = INSTANCE.findFunction((String) it.next(), variableConfig.getFunctionCompatibilityMap());
            if (findFunction != null) {
                arrayList.add(findFunction);
            }
        }
        String extractCustomVariableKey = extractCustomVariableKey(str);
        if (extractCustomVariableKey != null) {
            return resolveCustomVariable(extractCustomVariableKey, map2, map3, arrayList, locale);
        }
        Variable findVariable = findVariable(str, variableConfig.getVariableCompatibilityMap());
        if (findVariable == null) {
            return "";
        }
        String value = getValue(findVariable, map, variableDataProvider, packageContext, r24, subscriptionOption, locale, locale2, date, countdownTime, countFrom);
        if (value != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                value = INSTANCE.processFunction(value, (Function) it2.next(), locale);
            }
        } else {
            value = null;
        }
        if (value != null) {
            return value;
        }
        if (r24 == null) {
            return "";
        }
        failedToGetValue(Logger.INSTANCE, str, r24);
        return "";
    }

    private final boolean isLifetime(Package r2) {
        return r2.getPackageType() == PackageType.LIFETIME;
    }

    private final PricingPhase primaryDiscountPhase(SubscriptionOption subscriptionOption, Package r3) {
        StoreProduct product;
        if (subscriptionOption == null) {
            subscriptionOption = (r3 == null || (product = r3.getProduct()) == null) ? null : product.getDefaultOption();
        }
        if (subscriptionOption == null) {
            return null;
        }
        PricingPhase freePhase = subscriptionOption.getFreePhase();
        return freePhase == null ? subscriptionOption.getIntroPhase() : freePhase;
    }

    private final String processFunction(String str, Function function, Locale locale) {
        int i = WhenMappings.$EnumSwitchMapping$2[function.ordinal()];
        if (i == 1) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            t.f(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        if (i == 2) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            t.f(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (i != 3) {
            throw new Ca.o();
        }
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append(Character.isLowerCase(charAt) ? a.d(charAt, locale) : String.valueOf(charAt));
        String substring = str.substring(1);
        t.f(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }

    public static /* synthetic */ String processVariables$default(VariableProcessorV2 variableProcessorV2, String str, Map map, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r23, SubscriptionOption subscriptionOption, Locale locale, Locale locale2, Date date, CountdownTime countdownTime, CountdownComponent.CountFrom countFrom, Map map2, Map map3, int i, Object obj) {
        Locale locale3;
        Map h = (i & 2) != 0 ? S.h() : map;
        VariableDataProvider variableDataProvider2 = (i & 8) != 0 ? null : variableDataProvider;
        VariableProcessor.PackageContext packageContext2 = (i & 16) != 0 ? null : packageContext;
        Package r8 = (i & 32) != 0 ? null : r23;
        SubscriptionOption subscriptionOption2 = (i & 64) != 0 ? null : subscriptionOption;
        if ((i & 128) != 0) {
            Locale locale4 = Locale.getDefault();
            t.f(locale4, "getDefault()");
            locale3 = locale4;
        } else {
            locale3 = locale;
        }
        return variableProcessorV2.processVariables(str, h, variableConfig, variableDataProvider2, packageContext2, r8, subscriptionOption2, locale3, locale2, (i & 512) != 0 ? new Date() : date, (i & 1024) != 0 ? null : countdownTime, (i & 2048) != 0 ? CountdownComponent.CountFrom.DAYS : countFrom, (i & 4096) != 0 ? S.h() : map2, (i & 8192) != 0 ? S.h() : map3);
    }

    private final String productOfferEndDate(PricingPhase pricingPhase, Locale locale, Date date) {
        Calendar calendar = Calendar.getInstance(locale);
        calendar.setTime(date);
        calendar.add(6, c.c(pricingPhase.getBillingPeriod().getValueInDays()));
        return DateFormat.getDateInstance(1, locale).format(calendar.getTime());
    }

    private final String productOfferPeriod(PricingPhase pricingPhase, Map map) {
        VariableLocalizationKey periodUnitLocalizationKey = getPeriodUnitLocalizationKey(pricingPhase.getBillingPeriod());
        if (periodUnitLocalizationKey != null) {
            return INSTANCE.getStringOrLogError(map, periodUnitLocalizationKey);
        }
        return null;
    }

    private final String productOfferPeriodAbbreviated(PricingPhase pricingPhase, Map map) {
        VariableLocalizationKey periodUnitAbbreviatedLocalizationKey = getPeriodUnitAbbreviatedLocalizationKey(pricingPhase.getBillingPeriod());
        if (periodUnitAbbreviatedLocalizationKey != null) {
            return INSTANCE.getStringOrLogError(map, periodUnitAbbreviatedLocalizationKey);
        }
        return null;
    }

    private final String productOfferPeriodInPeriodUnit(PricingPhase pricingPhase, Period.Unit unit, Qa.l lVar) {
        Period billingPeriod;
        if (!INSTANCE.canDisplay(pricingPhase, unit)) {
            pricingPhase = null;
        }
        if (pricingPhase == null || (billingPeriod = pricingPhase.getBillingPeriod()) == null) {
            return null;
        }
        return (String) lVar.invoke(billingPeriod);
    }

    private final String productOfferPeriodWithUnit(PricingPhase pricingPhase, Map map) {
        String stringOrLogError = getStringOrLogError(map, getPeriodValueWithUnitLocalizationKey(pricingPhase.getBillingPeriod()));
        if (stringOrLogError == null) {
            return null;
        }
        String format = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(pricingPhase.getBillingPeriod().getValue())}, 1));
        t.f(format, "format(...)");
        return format;
    }

    private final String productOfferPrice(PricingPhase pricingPhase, Map map) {
        return pricingPhase.getPrice().getAmountMicros() == 0 ? getStringOrLogError(map, VariableLocalizationKey.FREE_PRICE) : pricingPhase.getPrice().getFormatted();
    }

    private final String productOfferPricePerDay(PricingPhase pricingPhase, Locale locale, Map map) {
        return productOfferPricePerPeriod(pricingPhase, map, Period.Unit.DAY, new 1(locale));
    }

    private final String productOfferPricePerMonth(PricingPhase pricingPhase, Locale locale, Map map) {
        return productOfferPricePerPeriod(pricingPhase, map, Period.Unit.MONTH, new 1(locale));
    }

    private final String productOfferPricePerPeriod(PricingPhase pricingPhase, Map map, Period.Unit unit, Qa.l lVar) {
        Price price;
        VariableProcessorV2 variableProcessorV2 = INSTANCE;
        if (!variableProcessorV2.canDisplay(pricingPhase, unit)) {
            pricingPhase = null;
        }
        if (pricingPhase == null || (price = (Price) lVar.invoke(pricingPhase)) == null) {
            return null;
        }
        return price.getAmountMicros() == 0 ? variableProcessorV2.getStringOrLogError(map, VariableLocalizationKey.FREE_PRICE) : price.getFormatted();
    }

    private final String productOfferPricePerWeek(PricingPhase pricingPhase, Locale locale, Map map) {
        return productOfferPricePerPeriod(pricingPhase, map, Period.Unit.WEEK, new 1(locale));
    }

    private final String productOfferPricePerYear(PricingPhase pricingPhase, Locale locale, Map map) {
        return productOfferPricePerPeriod(pricingPhase, map, Period.Unit.YEAR, new 1(locale));
    }

    private final String productPeriod(Package r5, Map map) {
        Period period = r5.getProduct().getPeriod();
        if (isLifetime(r5)) {
            return getStringOrLogError(map, VariableLocalizationKey.LIFETIME);
        }
        if (period != null) {
            if (period.getValue() > 1) {
                String stringOrLogError = getStringOrLogError(map, getPeriodValueWithUnitLocalizationKey(period));
                if (stringOrLogError != null) {
                    String format = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(period.getValue())}, 1));
                    t.f(format, "format(...)");
                    return format;
                }
            } else {
                VariableLocalizationKey periodUnitLocalizationKey = getPeriodUnitLocalizationKey(r5);
                if (periodUnitLocalizationKey != null) {
                    return INSTANCE.getStringOrLogError(map, periodUnitLocalizationKey);
                }
            }
        }
        return null;
    }

    private final String productPeriodAbbreviated(Package r5, Map map) {
        String stringOrLogError;
        Period period = r5.getProduct().getPeriod();
        if (isLifetime(r5)) {
            return getStringOrLogError(map, VariableLocalizationKey.LIFETIME);
        }
        if (period != null) {
            if (period.getValue() > 1) {
                VariableLocalizationKey periodValueWithUnitAbbreviatedLocalizationKey = getPeriodValueWithUnitAbbreviatedLocalizationKey(period);
                if (periodValueWithUnitAbbreviatedLocalizationKey != null && (stringOrLogError = INSTANCE.getStringOrLogError(map, periodValueWithUnitAbbreviatedLocalizationKey)) != null) {
                    String format = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(period.getValue())}, 1));
                    t.f(format, "format(...)");
                    return format;
                }
            } else {
                VariableLocalizationKey periodUnitAbbreviatedLocalizationKey = getPeriodUnitAbbreviatedLocalizationKey(r5);
                if (periodUnitAbbreviatedLocalizationKey != null) {
                    return INSTANCE.getStringOrLogError(map, periodUnitAbbreviatedLocalizationKey);
                }
            }
        }
        return null;
    }

    private final String productPeriodWithUnit(Package r4, Map map) {
        if (isLifetime(r4)) {
            return getStringOrLogError(map, VariableLocalizationKey.LIFETIME);
        }
        Period period = r4.getProduct().getPeriod();
        if (period != null) {
            VariableProcessorV2 variableProcessorV2 = INSTANCE;
            String stringOrLogError = variableProcessorV2.getStringOrLogError(map, variableProcessorV2.getPeriodValueWithUnitLocalizationKey(period));
            if (stringOrLogError != null) {
                String format = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(period.getValue())}, 1));
                t.f(format, "format(...)");
                return format;
            }
        }
        return null;
    }

    private final String productPeriodly(Package r4, Map map) {
        VariableLocalizationKey variableLocalizationKey;
        Period period = r4.getProduct().getPeriod();
        if (isLifetime(r4)) {
            return getStringOrLogError(map, VariableLocalizationKey.LIFETIME);
        }
        if (period == null) {
            return null;
        }
        if (period.getValue() > 1) {
            String stringOrLogError = getStringOrLogError(map, getPeriodValueWithUnitLocalizationKey(period));
            if (stringOrLogError == null) {
                return null;
            }
            String format = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(period.getValue())}, 1));
            t.f(format, "format(...)");
            return format;
        }
        int i = WhenMappings.$EnumSwitchMapping$3[period.getUnit().ordinal()];
        if (i == 1) {
            variableLocalizationKey = VariableLocalizationKey.DAILY;
        } else if (i == 2) {
            variableLocalizationKey = VariableLocalizationKey.WEEKLY;
        } else if (i == 3) {
            variableLocalizationKey = VariableLocalizationKey.MONTHLY;
        } else if (i == 4) {
            variableLocalizationKey = VariableLocalizationKey.YEARLY;
        } else {
            if (i != 5) {
                throw new Ca.o();
            }
            variableLocalizationKey = null;
        }
        if (variableLocalizationKey != null) {
            return INSTANCE.getStringOrLogError(map, variableLocalizationKey);
        }
        return null;
    }

    private final String relativeDiscount(VariableProcessor.PackageContext packageContext, Map map) {
        Double discountRelativeToMostExpensivePerMonth = packageContext.getDiscountRelativeToMostExpensivePerMonth();
        if (discountRelativeToMostExpensivePerMonth == null) {
            return null;
        }
        int c = c.c(discountRelativeToMostExpensivePerMonth.doubleValue() * 100.0f);
        String stringOrLogError = INSTANCE.getStringOrLogError(map, VariableLocalizationKey.PERCENT);
        if (stringOrLogError == null) {
            return null;
        }
        String format = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(c)}, 1));
        t.f(format, "format(...)");
        return format;
    }

    private final String replaceVariablesWithValues(String str, p pVar) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Za.k kVar : o.e(regex, str, 0, 2, null)) {
            sb.append(str, i, kVar.c().f());
            List M0 = E.M0((String) kVar.a().a().b().get(1), new String[]{"|"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(w.y(M0, 10));
            Iterator it = M0.iterator();
            while (it.hasNext()) {
                arrayList.add(E.j1((String) it.next()).toString());
            }
            sb.append((String) pVar.invoke((String) arrayList.get(0), arrayList.size() > 1 ? D.a0(arrayList, 1) : v.n()));
            i = kVar.c().g() + 1;
        }
        sb.append(str, i, str.length());
        String sb2 = sb.toString();
        t.f(sb2, "toString(...)");
        return sb2;
    }

    private final String resolveCustomVariable(String str, Map map, Map map2, List list, Locale locale) {
        CustomVariableValue customVariableValue = (CustomVariableValue) map.get(str);
        if (customVariableValue != null || (customVariableValue = (CustomVariableValue) map2.get(str)) != null) {
            String stringValue = customVariableValue.getStringValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                stringValue = INSTANCE.processFunction(stringValue, (Function) it.next(), locale);
            }
            return stringValue;
        }
        Logger.INSTANCE.w("Custom variable '" + str + "' was not provided and has no default value. Defaulting to empty string.");
        return "";
    }

    private final PricingPhase secondaryDiscountPhase(SubscriptionOption subscriptionOption, Package r3) {
        StoreProduct product;
        if (subscriptionOption == null) {
            subscriptionOption = (r3 == null || (product = r3.getProduct()) == null) ? null : product.getDefaultOption();
        }
        if (subscriptionOption == null || subscriptionOption.getFreePhase() == null) {
            return null;
        }
        return subscriptionOption.getIntroPhase();
    }

    private final void unsupportedFunctionWithoutFallback(Logger logger, String str) {
        logger.e("Paywall function '" + str + "' is not supported and no backwards compatible replacement found.");
    }

    private final void unsupportedVariableWithoutFallback(Logger logger, String str) {
        logger.e("Paywall variable '" + str + "' is not supported and no backwards compatible replacement found.");
    }

    private final void usingFallbackFunction(Logger logger, String str, String str2) {
        logger.w("Paywall function '" + str + "' is not supported. Using backward compatible '" + str2 + "' instead.");
    }

    private final void usingFallbackVariable(Logger logger, String str, String str2) {
        logger.w("Paywall variable '" + str + "' is not supported. Using backwards compatible '" + str2 + "' instead.");
    }

    public final String processVariables(String template, Map localizedVariableKeys, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r22, SubscriptionOption subscriptionOption, Locale currencyLocale, Locale dateLocale, Date date, CountdownTime countdownTime, CountdownComponent.CountFrom countFrom, Map customVariables, Map defaultCustomVariables) {
        t.g(template, "template");
        t.g(localizedVariableKeys, "localizedVariableKeys");
        t.g(variableConfig, "variableConfig");
        t.g(currencyLocale, "currencyLocale");
        t.g(dateLocale, "dateLocale");
        t.g(date, "date");
        t.g(countFrom, "countFrom");
        t.g(customVariables, "customVariables");
        t.g(defaultCustomVariables, "defaultCustomVariables");
        return replaceVariablesWithValues(template, new 1(localizedVariableKeys, variableConfig, variableDataProvider, packageContext, r22, subscriptionOption, currencyLocale, dateLocale, date, countdownTime, countFrom, customVariables, defaultCustomVariables));
    }

    private final VariableLocalizationKey getPeriodUnitLocalizationKey(Period period) {
        int i = WhenMappings.$EnumSwitchMapping$3[period.getUnit().ordinal()];
        if (i == 1) {
            return VariableLocalizationKey.DAY;
        }
        if (i == 2) {
            return VariableLocalizationKey.WEEK;
        }
        if (i == 3) {
            return VariableLocalizationKey.MONTH;
        }
        if (i == 4) {
            return VariableLocalizationKey.YEAR;
        }
        if (i == 5) {
            return null;
        }
        throw new Ca.o();
    }

    private final VariableLocalizationKey getPeriodUnitAbbreviatedLocalizationKey(Period period) {
        int i = WhenMappings.$EnumSwitchMapping$3[period.getUnit().ordinal()];
        if (i == 1) {
            return VariableLocalizationKey.DAY_SHORT;
        }
        if (i == 2) {
            return VariableLocalizationKey.WEEK_SHORT;
        }
        if (i == 3) {
            return VariableLocalizationKey.MONTH_SHORT;
        }
        if (i == 4) {
            return VariableLocalizationKey.YEAR_SHORT;
        }
        if (i == 5) {
            return null;
        }
        throw new Ca.o();
    }
}

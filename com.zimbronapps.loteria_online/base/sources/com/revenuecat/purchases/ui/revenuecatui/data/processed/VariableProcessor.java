package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Ca.l;
import Ca.m;
import Da.D;
import Ya.r;
import Za.E;
import Za.o;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VariableProcessor {
    public static final VariableProcessor INSTANCE = new VariableProcessor();
    private static final o REGEX = new o("\\{\\{\\s[a-zA-Z0-9_]+\\s\\}\\}");
    public static final int $stable = 8;

    public enum VariableName {
        APP_NAME("app_name"),
        PRICE("price"),
        PRICE_PER_PERIOD("price_per_period"),
        PRICE_PER_PERIOD_FULL("price_per_period_full"),
        TOTAL_PRICE_AND_PER_MONTH("total_price_and_per_month"),
        TOTAL_PRICE_AND_PER_MONTH_FULL("total_price_and_per_month_full"),
        PRODUCT_NAME("product_name"),
        SUB_PERIOD("sub_period"),
        SUB_PERIOD_LENGTH("sub_period_length"),
        SUB_PERIOD_ABBREVIATED("sub_period_abbreviated"),
        SUB_PRICE_PER_WEEK("sub_price_per_week"),
        SUB_PRICE_PER_MONTH("sub_price_per_month"),
        SUB_DURATION("sub_duration"),
        SUB_DURATION_IN_MONTHS("sub_duration_in_months"),
        SUB_OFFER_DURATION("sub_offer_duration"),
        SUB_OFFER_DURATION_2("sub_offer_duration_2"),
        SUB_OFFER_PRICE("sub_offer_price"),
        SUB_OFFER_PRICE_2("sub_offer_price_2"),
        SUB_RELATIVE_DISCOUNT("sub_relative_discount");

        private final String identifier;
        public static final Companion Companion = new Companion(null);
        private static final l valueMap$delegate = m.b(VariableProcessor$VariableName$Companion$valueMap$2.INSTANCE);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private final Map getValueMap() {
                return (Map) VariableName.access$getValueMap$delegate$cp().getValue();
            }

            public final VariableName valueOfIdentifier(String identifier) {
                t.g(identifier, "identifier");
                return (VariableName) getValueMap().get(identifier);
            }

            private Companion() {
            }
        }

        VariableName(String str) {
            this.identifier = str;
        }

        public static final /* synthetic */ l access$getValueMap$delegate$cp() {
            return valueMap$delegate;
        }

        public final String getIdentifier() {
            return this.identifier;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VariableName.values().length];
            try {
                iArr[VariableName.APP_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VariableName.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VariableName.PRICE_PER_PERIOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VariableName.PRICE_PER_PERIOD_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VariableName.TOTAL_PRICE_AND_PER_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VariableName.TOTAL_PRICE_AND_PER_MONTH_FULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VariableName.PRODUCT_NAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VariableName.SUB_PERIOD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VariableName.SUB_PERIOD_LENGTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VariableName.SUB_PERIOD_ABBREVIATED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VariableName.SUB_PRICE_PER_WEEK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VariableName.SUB_PRICE_PER_MONTH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[VariableName.SUB_DURATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[VariableName.SUB_DURATION_IN_MONTHS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[VariableName.SUB_OFFER_DURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[VariableName.SUB_OFFER_DURATION_2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[VariableName.SUB_OFFER_PRICE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[VariableName.SUB_OFFER_PRICE_2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[VariableName.SUB_RELATIVE_DISCOUNT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ List $errors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(List list) {
            super(1);
            this.$errors = list;
        }

        public final String invoke(String variable) {
            t.g(variable, "variable");
            if (VariableName.Companion.valueOfIdentifier(variable) != null) {
                return null;
            }
            this.$errors.add(variable);
            return null;
        }
    }

    private VariableProcessor() {
    }

    public static final /* synthetic */ String access$variableValue(VariableProcessor variableProcessor, VariableDataProvider variableDataProvider, PackageContext packageContext, String str, Package r4, Locale locale) {
        return variableProcessor.variableValue(variableDataProvider, packageContext, str, r4, locale);
    }

    private final String handleVariablesAndReplace(String str, Qa.l lVar) {
        for (Za.k kVar : D.x0(r.G(o.e(REGEX, str, 0, 2, null)))) {
            String value = kVar.getValue();
            String substring = value.substring(2, value.length() - 2);
            t.f(substring, "substring(...)");
            String str2 = (String) lVar.invoke(E.j1(substring).toString());
            if (str2 != null) {
                str = E.G0(str, kVar.c(), str2).toString();
            }
        }
        return str;
    }

    private final String processVariable(VariableName variableName, VariableDataProvider variableDataProvider, PackageContext packageContext, Package r5, Locale locale) {
        switch (WhenMappings.$EnumSwitchMapping$0[variableName.ordinal()]) {
            case 1:
                return variableDataProvider.getApplicationName();
            case 2:
                return variableDataProvider.localizedPrice(r5, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 3:
                return variableDataProvider.localizedPricePerPeriod(r5, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 4:
                return variableDataProvider.localizedPricePerPeriodFull(r5, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 5:
                return variableDataProvider.localizedPriceAndPerMonth(r5, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 6:
                return variableDataProvider.localizedPriceAndPerMonthFull(r5, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 7:
                return variableDataProvider.productName(r5);
            case 8:
                return variableDataProvider.periodName(r5);
            case 9:
                return variableDataProvider.periodLength(r5, locale);
            case 10:
                return variableDataProvider.periodNameAbbreviation(r5, locale);
            case 11:
                return variableDataProvider.localizedPricePerWeek(r5, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 12:
                return variableDataProvider.localizedPricePerMonth(r5, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 13:
                return variableDataProvider.subscriptionDuration(r5, locale);
            case 14:
                return variableDataProvider.subscriptionDurationInMonths(r5, locale);
            case 15:
                return variableDataProvider.firstIntroductoryOfferDuration(r5, locale);
            case 16:
                return variableDataProvider.secondIntroductoryOfferDuration(r5, locale);
            case 17:
                return variableDataProvider.localizedFirstIntroductoryOfferPrice(r5, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 18:
                return variableDataProvider.localizedSecondIntroductoryOfferPrice(r5, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 19:
                return variableDataProvider.localizedRelativeDiscount(packageContext.getDiscountRelativeToMostExpensivePerMonth());
            default:
                throw new Ca.o();
        }
    }

    private final String variableValue(VariableDataProvider variableDataProvider, PackageContext packageContext, String str, Package r11, Locale locale) {
        VariableName valueOfIdentifier = VariableName.Companion.valueOfIdentifier(str);
        if (valueOfIdentifier == null) {
            Logger.INSTANCE.e("Unknown variable: " + str);
            return null;
        }
        String processVariable = processVariable(valueOfIdentifier, variableDataProvider, packageContext, r11, locale);
        if (processVariable != null) {
            return processVariable;
        }
        Logger.INSTANCE.w("Could not process value for variable '" + str + "' for package '" + r11.getIdentifier() + "'. Please check that the product for that package matches the requirements for that variable. Defaulting to empty string.");
        return "";
    }

    public final String processVariables(VariableDataProvider variableDataProvider, PackageContext context, String originalString, Package rcPackage, Locale locale) {
        t.g(variableDataProvider, "variableDataProvider");
        t.g(context, "context");
        t.g(originalString, "originalString");
        t.g(rcPackage, "rcPackage");
        t.g(locale, "locale");
        return handleVariablesAndReplace(originalString, new VariableProcessor$processVariables$resultString$1(variableDataProvider, context, rcPackage, locale));
    }

    public final Set validateVariables(String originalString) {
        t.g(originalString, "originalString");
        ArrayList arrayList = new ArrayList();
        handleVariablesAndReplace(originalString, new 1(arrayList));
        return D.Q0(arrayList);
    }

    public static final class PackageContext {
        public static final int $stable = 0;
        private final Double discountRelativeToMostExpensivePerMonth;
        private final boolean showZeroDecimalPlacePrices;

        public PackageContext(Double d, boolean z) {
            this.discountRelativeToMostExpensivePerMonth = d;
            this.showZeroDecimalPlacePrices = z;
        }

        public static /* synthetic */ PackageContext copy$default(PackageContext packageContext, Double d, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                d = packageContext.discountRelativeToMostExpensivePerMonth;
            }
            if ((i & 2) != 0) {
                z = packageContext.showZeroDecimalPlacePrices;
            }
            return packageContext.copy(d, z);
        }

        public final Double component1() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final boolean component2() {
            return this.showZeroDecimalPlacePrices;
        }

        public final PackageContext copy(Double d, boolean z) {
            return new PackageContext(d, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PackageContext)) {
                return false;
            }
            PackageContext packageContext = (PackageContext) obj;
            return t.c(this.discountRelativeToMostExpensivePerMonth, packageContext.discountRelativeToMostExpensivePerMonth) && this.showZeroDecimalPlacePrices == packageContext.showZeroDecimalPlacePrices;
        }

        public final Double getDiscountRelativeToMostExpensivePerMonth() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final boolean getShowZeroDecimalPlacePrices() {
            return this.showZeroDecimalPlacePrices;
        }

        public int hashCode() {
            Double d = this.discountRelativeToMostExpensivePerMonth;
            return ((d == null ? 0 : d.hashCode()) * 31) + Boolean.hashCode(this.showZeroDecimalPlacePrices);
        }

        public String toString() {
            return "PackageContext(discountRelativeToMostExpensivePerMonth=" + this.discountRelativeToMostExpensivePerMonth + ", showZeroDecimalPlacePrices=" + this.showZeroDecimalPlacePrices + ')';
        }

        public /* synthetic */ PackageContext(Double d, boolean z, int i, k kVar) {
            this(d, (i & 2) != 0 ? false : z);
        }
    }
}

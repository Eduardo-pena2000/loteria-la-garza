package com.revenuecat.purchases.ui.revenuecatui.customercenter.extensions;

import Ca.x;
import Da.D;
import Da.S;
import Qa.l;
import Za.E;
import Za.k;
import Za.o;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.OfferPaymentMode;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PeriodExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PriceExtensionsKt;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class SubscriptionOptionExtensionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfferPaymentMode.values().length];
            try {
                iArr[OfferPaymentMode.FREE_TRIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfferPaymentMode.SINGLE_PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfferPaymentMode.DISCOUNTED_RECURRING_PAYMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ Map $replacements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Map map) {
            super(1);
            this.$replacements = map;
        }

        public final CharSequence invoke(k matchResult) {
            Object obj;
            String str;
            t.g(matchResult, "matchResult");
            String obj2 = E.j1((String) matchResult.b().get(1)).toString();
            Iterator it = this.$replacements.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (t.c(((CustomerCenterConfigData.Localization.VariableName) ((Map.Entry) obj).getKey()).getIdentifier(), obj2)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            return (entry == null || (str = (String) entry.getValue()) == null) ? matchResult.getValue() : str;
        }
    }

    public static final /* synthetic */ String getLocalizedDescription(SubscriptionOption subscriptionOption, CustomerCenterConfigData.Localization localization, Locale locale) {
        t.g(subscriptionOption, "<this>");
        t.g(localization, "localization");
        t.g(locale, "locale");
        int size = subscriptionOption.getPricingPhases().size();
        return size != 2 ? size != 3 ? ((PricingPhase) D.f0(subscriptionOption.getPricingPhases())).getPrice().getFormatted() : getThreePhaseDescription(subscriptionOption, localization, locale) : getTwoPhaseDescription(subscriptionOption, localization, locale);
    }

    private static final String getThreePhaseDescription(SubscriptionOption subscriptionOption, CustomerCenterConfigData.Localization localization, Locale locale) {
        PricingPhase pricingPhase = (PricingPhase) D.f0(subscriptionOption.getPricingPhases());
        PricingPhase pricingPhase2 = (PricingPhase) subscriptionOption.getPricingPhases().get(1);
        PricingPhase pricingPhase3 = (PricingPhase) D.p0(subscriptionOption.getPricingPhases());
        String localizedPerPeriod = PriceExtensionsKt.localizedPerPeriod(pricingPhase3.getPrice(), pricingPhase3.getBillingPeriod(), locale, false);
        if (pricingPhase.getOfferPaymentMode() != OfferPaymentMode.FREE_TRIAL) {
            return getTwoPhaseDescription(subscriptionOption, localization, locale);
        }
        String localizedTotalDuration = localizedTotalDuration(pricingPhase, locale);
        String localizedTotalDuration2 = localizedTotalDuration(pricingPhase2, locale);
        Integer billingCycleCount = pricingPhase2.getBillingCycleCount();
        Map l = S.l(x.a(CustomerCenterConfigData.Localization.VariableName.SUB_OFFER_DURATION, localizedTotalDuration), x.a(CustomerCenterConfigData.Localization.VariableName.SUB_OFFER_DURATION_2, localizedTotalDuration2), x.a(CustomerCenterConfigData.Localization.VariableName.SUB_OFFER_PRICE_2, pricingPhase2.getPrice().getFormatted()), x.a(CustomerCenterConfigData.Localization.VariableName.DISCOUNTED_RECURRING_PAYMENT_PRICE_PER_PERIOD, PriceExtensionsKt.localizedPerPeriod(pricingPhase2.getPrice(), pricingPhase2.getBillingPeriod(), locale, false)), x.a(CustomerCenterConfigData.Localization.VariableName.PRICE, localizedPerPeriod), x.a(CustomerCenterConfigData.Localization.VariableName.DISCOUNTED_RECURRING_PAYMENT_CYCLES, String.valueOf(billingCycleCount != null ? billingCycleCount.intValue() : 1)));
        OfferPaymentMode offerPaymentMode = pricingPhase2.getOfferPaymentMode();
        int i = offerPaymentMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[offerPaymentMode.ordinal()];
        return i != 2 ? i != 3 ? localizedPerPeriod : replaceVariables(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.FREE_TRIAL_DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE), l) : replaceVariables(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE), l);
    }

    private static final String getTwoPhaseDescription(SubscriptionOption subscriptionOption, CustomerCenterConfigData.Localization localization, Locale locale) {
        PricingPhase pricingPhase = (PricingPhase) D.f0(subscriptionOption.getPricingPhases());
        String localizedTotalDuration = localizedTotalDuration(pricingPhase, locale);
        PricingPhase pricingPhase2 = (PricingPhase) D.p0(subscriptionOption.getPricingPhases());
        String localizedPerPeriod = PriceExtensionsKt.localizedPerPeriod(pricingPhase2.getPrice(), pricingPhase2.getBillingPeriod(), locale, false);
        Integer billingCycleCount = pricingPhase.getBillingCycleCount();
        Map l = S.l(x.a(CustomerCenterConfigData.Localization.VariableName.SUB_OFFER_DURATION, localizedTotalDuration), x.a(CustomerCenterConfigData.Localization.VariableName.SUB_OFFER_PRICE, pricingPhase.getPrice().getFormatted()), x.a(CustomerCenterConfigData.Localization.VariableName.PRICE, localizedPerPeriod), x.a(CustomerCenterConfigData.Localization.VariableName.DISCOUNTED_RECURRING_PAYMENT_PRICE_PER_PERIOD, PriceExtensionsKt.localizedPerPeriod(pricingPhase.getPrice(), pricingPhase.getBillingPeriod(), locale, false)), x.a(CustomerCenterConfigData.Localization.VariableName.DISCOUNTED_RECURRING_PAYMENT_CYCLES, String.valueOf(billingCycleCount != null ? billingCycleCount.intValue() : 1)));
        OfferPaymentMode offerPaymentMode = pricingPhase.getOfferPaymentMode();
        int i = offerPaymentMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[offerPaymentMode.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? localizedPerPeriod : replaceVariables(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE), l) : replaceVariables(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.SINGLE_PAYMENT_THEN_PRICE), l) : replaceVariables(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.FREE_TRIAL_THEN_PRICE), l);
    }

    private static final String localizedTotalDuration(PricingPhase pricingPhase, Locale locale) {
        Integer billingCycleCount = pricingPhase.getBillingCycleCount();
        String format = MeasureFormat.getInstance(locale, MeasureFormat.FormatWidth.WIDE).format(new Measure(Integer.valueOf((billingCycleCount != null ? billingCycleCount.intValue() : 1) * pricingPhase.getBillingPeriod().getValue()), PeriodExtensionsKt.getMeasureUnit(pricingPhase.getBillingPeriod().getUnit())));
        t.f(format, "getInstance(locale, Meas….unit.measureUnit),\n    )");
        return format;
    }

    private static final String replaceVariables(String str, Map map) {
        return new o("\\{\\{\\s*([^}]+)\\s*\\}\\}").i(str, new 1(map));
    }
}

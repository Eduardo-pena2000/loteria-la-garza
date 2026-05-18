package com.revenuecat.purchases.models;

import Ca.e;
import Da.D;
import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface SubscriptionOption {

    public static final class DefaultImpls {
        @Deprecated
        public static Period getBillingPeriod(SubscriptionOption subscriptionOption) {
            return SubscriptionOption.access$getBillingPeriod$jd(subscriptionOption);
        }

        @Deprecated
        public static PricingPhase getFreePhase(SubscriptionOption subscriptionOption) {
            return SubscriptionOption.access$getFreePhase$jd(subscriptionOption);
        }

        @Deprecated
        public static PricingPhase getFullPricePhase(SubscriptionOption subscriptionOption) {
            return SubscriptionOption.access$getFullPricePhase$jd(subscriptionOption);
        }

        @Deprecated
        public static PricingPhase getIntroPhase(SubscriptionOption subscriptionOption) {
            return SubscriptionOption.access$getIntroPhase$jd(subscriptionOption);
        }

        @e
        public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
        }

        @Deprecated
        public static boolean isBasePlan(SubscriptionOption subscriptionOption) {
            return SubscriptionOption.access$isBasePlan$jd(subscriptionOption);
        }

        @Deprecated
        public static boolean isPrepaid(SubscriptionOption subscriptionOption) {
            return SubscriptionOption.access$isPrepaid$jd(subscriptionOption);
        }
    }

    static /* synthetic */ Period access$getBillingPeriod$jd(SubscriptionOption subscriptionOption) {
        return super.getBillingPeriod();
    }

    static /* synthetic */ PricingPhase access$getFreePhase$jd(SubscriptionOption subscriptionOption) {
        return super.getFreePhase();
    }

    static /* synthetic */ PricingPhase access$getFullPricePhase$jd(SubscriptionOption subscriptionOption) {
        return super.getFullPricePhase();
    }

    static /* synthetic */ PricingPhase access$getIntroPhase$jd(SubscriptionOption subscriptionOption) {
        return super.getIntroPhase();
    }

    static /* synthetic */ boolean access$isBasePlan$jd(SubscriptionOption subscriptionOption) {
        return super.isBasePlan();
    }

    static /* synthetic */ boolean access$isPrepaid$jd(SubscriptionOption subscriptionOption) {
        return super.isPrepaid();
    }

    default Period getBillingPeriod() {
        PricingPhase fullPricePhase = getFullPricePhase();
        if (fullPricePhase != null) {
            return fullPricePhase.getBillingPeriod();
        }
        return null;
    }

    default PricingPhase getFreePhase() {
        Object obj;
        Iterator it = D.b0(getPricingPhases(), 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PricingPhase) obj).getPrice().getAmountMicros() == 0) {
                break;
            }
        }
        return (PricingPhase) obj;
    }

    default PricingPhase getFullPricePhase() {
        return (PricingPhase) D.q0(getPricingPhases());
    }

    String getId();

    InstallmentsInfo getInstallmentsInfo();

    default PricingPhase getIntroPhase() {
        Object obj;
        Iterator it = D.b0(getPricingPhases(), 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PricingPhase) obj).getPrice().getAmountMicros() > 0) {
                break;
            }
        }
        return (PricingPhase) obj;
    }

    PresentedOfferingContext getPresentedOfferingContext();

    String getPresentedOfferingIdentifier();

    List getPricingPhases();

    PurchasingData getPurchasingData();

    List getTags();

    default boolean isBasePlan() {
        return getPricingPhases().size() == 1;
    }

    default boolean isPrepaid() {
        PricingPhase fullPricePhase = getFullPricePhase();
        return (fullPricePhase != null ? fullPricePhase.getRecurrenceMode() : null) == RecurrenceMode.NON_RECURRING;
    }
}

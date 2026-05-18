package com.revenuecat.purchases.ui.revenuecatui.extensions;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PackageExtensionsKt {
    public static final OfferEligibility calculateOfferEligibility(ResolvedOffer resolvedOffer, Package rcPackage) {
        t.g(rcPackage, "rcPackage");
        if (resolvedOffer != null && resolvedOffer.isPromoOffer()) {
            OfferEligibility promoOfferEligibility = promoOfferEligibility(resolvedOffer);
            if (!t.c(promoOfferEligibility, OfferEligibility.PromoOfferIneligible.INSTANCE)) {
                return promoOfferEligibility;
            }
        }
        return getIntroOfferEligibility(rcPackage);
    }

    public static final OfferEligibility getIntroOfferEligibility(Package r1) {
        List pricingPhases;
        t.g(r1, "<this>");
        SubscriptionOption defaultOption = r1.getProduct().getDefaultOption();
        int size = ((defaultOption == null || (pricingPhases = defaultOption.getPricingPhases()) == null) ? 0 : pricingPhases.size()) - 1;
        return size != 1 ? size != 2 ? OfferEligibility.Ineligible.INSTANCE : OfferEligibility.IntroOfferMultiple.INSTANCE : OfferEligibility.IntroOfferSingle.INSTANCE;
    }

    public static final OfferEligibility getOfferEligibility(TemplateConfiguration.PackageInfo packageInfo) {
        t.g(packageInfo, "<this>");
        return getIntroOfferEligibility(packageInfo.getRcPackage());
    }

    public static final boolean isMonthly(Package r3) {
        t.g(r3, "<this>");
        Period period = r3.getProduct().getPeriod();
        return period != null && period.getUnit() == Period.Unit.MONTH && period.getValue() == 1;
    }

    public static final boolean isSubscription(Package r1) {
        t.g(r1, "<this>");
        return r1.getProduct().getType() == ProductType.SUBS;
    }

    private static final OfferEligibility promoOfferEligibility(ResolvedOffer resolvedOffer) {
        List pricingPhases;
        SubscriptionOption subscriptionOption = resolvedOffer.getSubscriptionOption();
        int size = ((subscriptionOption == null || (pricingPhases = subscriptionOption.getPricingPhases()) == null) ? 0 : pricingPhases.size()) - 1;
        return size != 1 ? size != 2 ? OfferEligibility.PromoOfferIneligible.INSTANCE : OfferEligibility.PromoOfferMultiple.INSTANCE : OfferEligibility.PromoOfferSingle.INSTANCE;
    }
}

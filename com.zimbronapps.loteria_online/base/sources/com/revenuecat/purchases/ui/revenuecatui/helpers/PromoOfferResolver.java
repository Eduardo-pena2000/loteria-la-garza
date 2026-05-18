package com.revenuecat.purchases.ui.revenuecatui.helpers;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.components.common.PromoOfferConfig;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PromoOfferResolver {
    public static final int $stable = 0;
    public static final PromoOfferResolver INSTANCE = new PromoOfferResolver();

    private PromoOfferResolver() {
    }

    private final SubscriptionOption findOfferById(List list, String str) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            GoogleSubscriptionOption googleSubscriptionOption = (SubscriptionOption) next;
            GoogleSubscriptionOption googleSubscriptionOption2 = googleSubscriptionOption instanceof GoogleSubscriptionOption ? googleSubscriptionOption : null;
            if (t.c(googleSubscriptionOption2 != null ? googleSubscriptionOption2.getOfferId() : null, str)) {
                obj = next;
                break;
            }
        }
        return (SubscriptionOption) obj;
    }

    public final ResolvedOffer resolve(Package rcPackage, PromoOfferConfig promoOfferConfig) {
        t.g(rcPackage, "rcPackage");
        SubscriptionOption defaultOption = rcPackage.getProduct().getDefaultOption();
        if (promoOfferConfig == null) {
            return new ResolvedOffer.NoConfiguration(defaultOption);
        }
        List subscriptionOptions = rcPackage.getProduct().getSubscriptionOptions();
        SubscriptionOption findOfferById = subscriptionOptions != null ? INSTANCE.findOfferById(subscriptionOptions, promoOfferConfig.getOfferId()) : null;
        if (findOfferById != null) {
            return new ResolvedOffer.ConfiguredOffer(findOfferById);
        }
        String str = subscriptionOptions == null ? "product has no subscription options" : "offer not found in available options";
        Logger.INSTANCE.w("Configured offer '" + promoOfferConfig.getOfferId() + "' for package '" + rcPackage.getIdentifier() + "': " + str + ". Falling back to default option.");
        return new ResolvedOffer.OfferNotFound(promoOfferConfig.getOfferId(), defaultOption);
    }
}

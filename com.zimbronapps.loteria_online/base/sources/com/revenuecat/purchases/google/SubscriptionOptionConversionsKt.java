package com.revenuecat.purchases.google;

import Da.D;
import Da.w;
import com.android.billingclient.api.ProductDetails;
import com.revenuecat.purchases.models.GoogleInstallmentsInfo;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriptionOptionConversionsKt {
    private static final GoogleInstallmentsInfo getInstallmentsInfo(ProductDetails.InstallmentPlanDetails installmentPlanDetails) {
        return new GoogleInstallmentsInfo(installmentPlanDetails.getInstallmentPlanCommitmentPaymentsCount(), installmentPlanDetails.getSubsequentInstallmentPlanCommitmentPaymentsCount());
    }

    public static final String getSubscriptionBillingPeriod(ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails) {
        t.g(subscriptionOfferDetails, "<this>");
        List pricingPhaseList = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList();
        t.f(pricingPhaseList, "this.pricingPhases.pricingPhaseList");
        ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) D.q0(pricingPhaseList);
        if (pricingPhase != null) {
            return pricingPhase.getBillingPeriod();
        }
        return null;
    }

    public static final boolean isBasePlan(ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails) {
        t.g(subscriptionOfferDetails, "<this>");
        return subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().size() == 1;
    }

    public static final GoogleSubscriptionOption toSubscriptionOption(ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails, String str, ProductDetails productDetails) {
        t.g(subscriptionOfferDetails, "<this>");
        t.g(str, "productId");
        t.g(productDetails, "productDetails");
        List<ProductDetails.PricingPhase> pricingPhaseList = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList();
        t.f(pricingPhaseList, "pricingPhases.pricingPhaseList");
        ArrayList arrayList = new ArrayList(w.y(pricingPhaseList, 10));
        for (ProductDetails.PricingPhase pricingPhase : pricingPhaseList) {
            t.f(pricingPhase, "it");
            arrayList.add(PricingPhaseConversionsKt.toRevenueCatPricingPhase(pricingPhase));
        }
        String basePlanId = subscriptionOfferDetails.getBasePlanId();
        t.f(basePlanId, "basePlanId");
        String offerId = subscriptionOfferDetails.getOfferId();
        List offerTags = subscriptionOfferDetails.getOfferTags();
        t.f(offerTags, "offerTags");
        String offerToken = subscriptionOfferDetails.getOfferToken();
        t.f(offerToken, "offerToken");
        ProductDetails.InstallmentPlanDetails installmentPlanDetails = subscriptionOfferDetails.getInstallmentPlanDetails();
        return new GoogleSubscriptionOption(str, basePlanId, offerId, arrayList, offerTags, productDetails, offerToken, null, installmentPlanDetails != null ? getInstallmentsInfo(installmentPlanDetails) : null);
    }
}

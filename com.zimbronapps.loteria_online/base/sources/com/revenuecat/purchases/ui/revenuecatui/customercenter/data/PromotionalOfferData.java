package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.SubscriptionOption;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PromotionalOfferData {
    public static final int $stable = 8;
    private final CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer configuredPromotionalOffer;
    private final String localizedPricingPhasesDescription;
    private final CustomerCenterConfigData.HelpPath originalPath;
    private final SubscriptionOption subscriptionOption;

    public PromotionalOfferData(CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer configuredPromotionalOffer, SubscriptionOption subscriptionOption, CustomerCenterConfigData.HelpPath originalPath, String localizedPricingPhasesDescription) {
        t.g(configuredPromotionalOffer, "configuredPromotionalOffer");
        t.g(subscriptionOption, "subscriptionOption");
        t.g(originalPath, "originalPath");
        t.g(localizedPricingPhasesDescription, "localizedPricingPhasesDescription");
        this.configuredPromotionalOffer = configuredPromotionalOffer;
        this.subscriptionOption = subscriptionOption;
        this.originalPath = originalPath;
        this.localizedPricingPhasesDescription = localizedPricingPhasesDescription;
    }

    public static /* synthetic */ PromotionalOfferData copy$default(PromotionalOfferData promotionalOfferData, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, SubscriptionOption subscriptionOption, CustomerCenterConfigData.HelpPath helpPath, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            promotionalOffer = promotionalOfferData.configuredPromotionalOffer;
        }
        if ((i & 2) != 0) {
            subscriptionOption = promotionalOfferData.subscriptionOption;
        }
        if ((i & 4) != 0) {
            helpPath = promotionalOfferData.originalPath;
        }
        if ((i & 8) != 0) {
            str = promotionalOfferData.localizedPricingPhasesDescription;
        }
        return promotionalOfferData.copy(promotionalOffer, subscriptionOption, helpPath, str);
    }

    public final CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer component1() {
        return this.configuredPromotionalOffer;
    }

    public final SubscriptionOption component2() {
        return this.subscriptionOption;
    }

    public final CustomerCenterConfigData.HelpPath component3() {
        return this.originalPath;
    }

    public final String component4() {
        return this.localizedPricingPhasesDescription;
    }

    public final PromotionalOfferData copy(CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer configuredPromotionalOffer, SubscriptionOption subscriptionOption, CustomerCenterConfigData.HelpPath originalPath, String localizedPricingPhasesDescription) {
        t.g(configuredPromotionalOffer, "configuredPromotionalOffer");
        t.g(subscriptionOption, "subscriptionOption");
        t.g(originalPath, "originalPath");
        t.g(localizedPricingPhasesDescription, "localizedPricingPhasesDescription");
        return new PromotionalOfferData(configuredPromotionalOffer, subscriptionOption, originalPath, localizedPricingPhasesDescription);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionalOfferData)) {
            return false;
        }
        PromotionalOfferData promotionalOfferData = (PromotionalOfferData) obj;
        return t.c(this.configuredPromotionalOffer, promotionalOfferData.configuredPromotionalOffer) && t.c(this.subscriptionOption, promotionalOfferData.subscriptionOption) && t.c(this.originalPath, promotionalOfferData.originalPath) && t.c(this.localizedPricingPhasesDescription, promotionalOfferData.localizedPricingPhasesDescription);
    }

    public final /* synthetic */ CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer getConfiguredPromotionalOffer() {
        return this.configuredPromotionalOffer;
    }

    public final /* synthetic */ String getLocalizedPricingPhasesDescription() {
        return this.localizedPricingPhasesDescription;
    }

    public final /* synthetic */ CustomerCenterConfigData.HelpPath getOriginalPath() {
        return this.originalPath;
    }

    public final /* synthetic */ SubscriptionOption getSubscriptionOption() {
        return this.subscriptionOption;
    }

    public int hashCode() {
        return (((((this.configuredPromotionalOffer.hashCode() * 31) + this.subscriptionOption.hashCode()) * 31) + this.originalPath.hashCode()) * 31) + this.localizedPricingPhasesDescription.hashCode();
    }

    public String toString() {
        return "PromotionalOfferData(configuredPromotionalOffer=" + this.configuredPromotionalOffer + ", subscriptionOption=" + this.subscriptionOption + ", originalPath=" + this.originalPath + ", localizedPricingPhasesDescription=" + this.localizedPricingPhasesDescription + ')';
    }
}

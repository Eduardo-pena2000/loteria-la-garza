package com.revenuecat.purchases.models;

import Ca.e;
import Da.D;
import Da.v;
import Za.E;
import com.android.billingclient.api.ProductDetails;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.GooglePurchasingData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GoogleSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final GoogleInstallmentsInfo installmentsInfo;
    private final String offerId;
    private final String offerToken;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List pricingPhases;
    private final ProductDetails productDetails;
    private final String productId;
    private final List tags;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, ProductDetails productDetails, String str4) {
        this(str, str2, str3, list, list2, productDetails, str4, null, null, 384, null);
        t.g(str, "productId");
        t.g(str2, "basePlanId");
        t.g(list, "pricingPhases");
        t.g(list2, "tags");
        t.g(productDetails, "productDetails");
        t.g(str4, "offerToken");
    }

    @e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    private final PricingPhase getPrimaryPricingPhase() {
        Object obj;
        Iterator it = getPricingPhases().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PricingPhase) obj).getRecurrenceMode() == RecurrenceMode.INFINITE_RECURRING) {
                break;
            }
        }
        PricingPhase pricingPhase = (PricingPhase) obj;
        return pricingPhase == null ? (PricingPhase) D.q0(getPricingPhases()) : pricingPhase;
    }

    public static /* synthetic */ void getPurchasingData$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleSubscriptionOption)) {
            return false;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) obj;
        return t.c(this.productId, googleSubscriptionOption.productId) && t.c(this.basePlanId, googleSubscriptionOption.basePlanId) && t.c(this.offerId, googleSubscriptionOption.offerId) && t.c(this.pricingPhases, googleSubscriptionOption.pricingPhases) && t.c(this.tags, googleSubscriptionOption.tags) && t.c(this.productDetails, googleSubscriptionOption.productDetails) && t.c(this.offerToken, googleSubscriptionOption.offerToken) && t.c(this.presentedOfferingContext, googleSubscriptionOption.presentedOfferingContext) && t.c(this.installmentsInfo, googleSubscriptionOption.installmentsInfo);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public String getId() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.basePlanId);
        String str2 = this.offerId;
        if (str2 == null || E.h0(str2)) {
            str = "";
        } else {
            str = ':' + this.offerId;
        }
        sb.append(str);
        return sb.toString();
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    public List getPricingPhases() {
        return this.pricingPhases;
    }

    public final ProductDetails getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    public PurchasingData getPurchasingData() {
        String str = this.productId;
        String id = getId();
        ProductDetails productDetails = this.productDetails;
        String str2 = this.offerToken;
        PricingPhase primaryPricingPhase = getPrimaryPricingPhase();
        return new GooglePurchasingData.Subscription(str, id, productDetails, str2, primaryPricingPhase != null ? primaryPricingPhase.getBillingPeriod() : null, v.n());
    }

    public List getTags() {
        return this.tags;
    }

    public int hashCode() {
        int hashCode = ((this.productId.hashCode() * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.pricingPhases.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.offerToken.hashCode()) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int hashCode3 = (hashCode2 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        GoogleInstallmentsInfo googleInstallmentsInfo = this.installmentsInfo;
        return hashCode3 + (googleInstallmentsInfo != null ? googleInstallmentsInfo.hashCode() : 0);
    }

    public String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + this.pricingPhases + ", tags=" + this.tags + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingContext=" + this.presentedOfferingContext + ", installmentsInfo=" + this.installmentsInfo + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, ProductDetails productDetails, String str4, PresentedOfferingContext presentedOfferingContext) {
        this(str, str2, str3, list, list2, productDetails, str4, presentedOfferingContext, null, 256, null);
        t.g(str, "productId");
        t.g(str2, "basePlanId");
        t.g(list, "pricingPhases");
        t.g(list2, "tags");
        t.g(productDetails, "productDetails");
        t.g(str4, "offerToken");
    }

    public GoogleInstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    public GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, ProductDetails productDetails, String str4, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo) {
        t.g(str, "productId");
        t.g(str2, "basePlanId");
        t.g(list, "pricingPhases");
        t.g(list2, "tags");
        t.g(productDetails, "productDetails");
        t.g(str4, "offerToken");
        this.productId = str;
        this.basePlanId = str2;
        this.offerId = str3;
        this.pricingPhases = list;
        this.tags = list2;
        this.productDetails = productDetails;
        this.offerToken = str4;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = googleInstallmentsInfo;
    }

    public /* synthetic */ GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, ProductDetails productDetails, String str4, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo, int i, k kVar) {
        this(str, str2, str3, list, list2, productDetails, str4, (i & 128) != 0 ? null : presentedOfferingContext, (i & 256) != 0 ? null : googleInstallmentsInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, ProductDetails productDetails, String str4, String str5) {
        this(str, str2, str3, list, list2, productDetails, str4, new PresentedOfferingContext(str5), null, 256, null);
        t.g(str, "productId");
        t.g(str2, "basePlanId");
        t.g(list, "pricingPhases");
        t.g(list2, "tags");
        t.g(productDetails, "productDetails");
        t.g(str4, "offerToken");
        t.g(str5, "presentedOfferingId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(GoogleSubscriptionOption googleSubscriptionOption, PresentedOfferingContext presentedOfferingContext) {
        this(googleSubscriptionOption.productId, googleSubscriptionOption.basePlanId, googleSubscriptionOption.offerId, googleSubscriptionOption.getPricingPhases(), googleSubscriptionOption.getTags(), googleSubscriptionOption.productDetails, googleSubscriptionOption.offerToken, presentedOfferingContext, googleSubscriptionOption.getInstallmentsInfo());
        t.g(googleSubscriptionOption, "subscriptionOption");
    }
}

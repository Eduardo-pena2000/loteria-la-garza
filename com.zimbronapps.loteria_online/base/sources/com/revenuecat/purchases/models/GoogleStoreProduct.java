package com.revenuecat.purchases.models;

import Ca.e;
import Da.D;
import com.android.billingclient.api.ProductDetails;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GooglePurchasingData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GoogleStoreProduct implements StoreProduct {
    private final String basePlanId;
    private final SubscriptionOption defaultOption;
    private final String description;
    private final String name;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final String presentedOfferingIdentifier;
    private final Price price;
    private final ProductDetails productDetails;
    private final String productId;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, ProductDetails productDetails) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, productDetails, null, null, 6144, null);
        t.g(str, "productId");
        t.g(productType, "type");
        t.g(price, "price");
        t.g(str3, "name");
        t.g(str4, "title");
        t.g(str5, "description");
        t.g(productDetails, "productDetails");
    }

    @e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @e
    public static /* synthetic */ void getSku$annotations() {
    }

    @e
    public StoreProduct copyWithOfferingId(String str) {
        PresentedOfferingContext presentedOfferingContext;
        t.g(str, "offeringId");
        PresentedOfferingContext presentedOfferingContext2 = getPresentedOfferingContext();
        if (presentedOfferingContext2 == null || (presentedOfferingContext = PresentedOfferingContext.copy$default(presentedOfferingContext2, str, null, null, 6, null)) == null) {
            presentedOfferingContext = new PresentedOfferingContext(str);
        }
        return copyWithPresentedOfferingContext(presentedOfferingContext);
    }

    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        ArrayList arrayList;
        SubscriptionOptions<SubscriptionOption> subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            arrayList = new ArrayList();
            for (SubscriptionOption subscriptionOption : subscriptionOptions) {
                GoogleSubscriptionOption googleSubscriptionOption = subscriptionOption instanceof GoogleSubscriptionOption ? (GoogleSubscriptionOption) subscriptionOption : null;
                GoogleSubscriptionOption googleSubscriptionOption2 = googleSubscriptionOption != null ? new GoogleSubscriptionOption(googleSubscriptionOption, presentedOfferingContext) : null;
                if (googleSubscriptionOption2 != null) {
                    arrayList.add(googleSubscriptionOption2);
                }
            }
        } else {
            arrayList = null;
        }
        SubscriptionOption defaultOption = getDefaultOption();
        GoogleSubscriptionOption googleSubscriptionOption3 = defaultOption instanceof GoogleSubscriptionOption ? (GoogleSubscriptionOption) defaultOption : null;
        return new GoogleStoreProduct(this, googleSubscriptionOption3 != null ? new GoogleSubscriptionOption(googleSubscriptionOption3, presentedOfferingContext) : null, arrayList != null ? new SubscriptionOptions(arrayList) : null, presentedOfferingContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleStoreProduct)) {
            return false;
        }
        GoogleStoreProduct googleStoreProduct = (GoogleStoreProduct) obj;
        return t.c(this.productId, googleStoreProduct.productId) && t.c(this.basePlanId, googleStoreProduct.basePlanId) && this.type == googleStoreProduct.type && t.c(this.price, googleStoreProduct.price) && t.c(this.name, googleStoreProduct.name) && t.c(this.title, googleStoreProduct.title) && t.c(this.description, googleStoreProduct.description) && t.c(this.period, googleStoreProduct.period) && t.c(this.subscriptionOptions, googleStoreProduct.subscriptionOptions) && t.c(this.defaultOption, googleStoreProduct.defaultOption) && t.c(this.productDetails, googleStoreProduct.productDetails) && t.c(this.presentedOfferingIdentifier, googleStoreProduct.presentedOfferingIdentifier) && t.c(this.presentedOfferingContext, googleStoreProduct.presentedOfferingContext);
    }

    public String formattedPricePerMonth(Locale locale) {
        SubscriptionOption basePlan;
        List pricingPhases;
        PricingPhase pricingPhase;
        t.g(locale, "locale");
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions == null || (basePlan = subscriptionOptions.getBasePlan()) == null || (pricingPhases = basePlan.getPricingPhases()) == null || (pricingPhase = (PricingPhase) D.p0(pricingPhases)) == null) {
            return null;
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        if (this.basePlanId != null) {
            String str = this.productId + ':' + this.basePlanId;
            if (str != null) {
                return str;
            }
        }
        return this.productId;
    }

    public String getName() {
        return this.name;
    }

    public Period getPeriod() {
        return this.period;
    }

    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    public Price getPrice() {
        return this.price;
    }

    public final ProductDetails getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    public PurchasingData getPurchasingData() {
        return (getType() != ProductType.SUBS || getDefaultOption() == null) ? new GooglePurchasingData.InAppProduct(getId(), this.productDetails) : getDefaultOption().getPurchasingData();
    }

    public String getSku() {
        return this.productId;
    }

    public SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    public String getTitle() {
        return this.title;
    }

    public ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.productId.hashCode() * 31;
        String str = this.basePlanId;
        int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + this.price.hashCode()) * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        Period period = this.period;
        int hashCode3 = (hashCode2 + (period == null ? 0 : period.hashCode())) * 31;
        SubscriptionOptions subscriptionOptions = this.subscriptionOptions;
        int hashCode4 = (hashCode3 + (subscriptionOptions == null ? 0 : subscriptionOptions.hashCode())) * 31;
        SubscriptionOption subscriptionOption = this.defaultOption;
        int hashCode5 = (((hashCode4 + (subscriptionOption == null ? 0 : subscriptionOption.hashCode())) * 31) + this.productDetails.hashCode()) * 31;
        String str2 = this.presentedOfferingIdentifier;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        return hashCode6 + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0);
    }

    public String toString() {
        return "GoogleStoreProduct(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", type=" + this.type + ", price=" + this.price + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", productDetails=" + this.productDetails + ", presentedOfferingIdentifier=" + this.presentedOfferingIdentifier + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, ProductDetails productDetails, String str6) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, productDetails, str6, null, 4096, null);
        t.g(str, "productId");
        t.g(productType, "type");
        t.g(price, "price");
        t.g(str3, "name");
        t.g(str4, "title");
        t.g(str5, "description");
        t.g(productDetails, "productDetails");
    }

    @e
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, ProductDetails productDetails, String str6, PresentedOfferingContext presentedOfferingContext) {
        t.g(str, "productId");
        t.g(productType, "type");
        t.g(price, "price");
        t.g(str3, "name");
        t.g(str4, "title");
        t.g(str5, "description");
        t.g(productDetails, "productDetails");
        this.productId = str;
        this.basePlanId = str2;
        this.type = productType;
        this.price = price;
        this.name = str3;
        this.title = str4;
        this.description = str5;
        this.period = period;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.productDetails = productDetails;
        this.presentedOfferingIdentifier = str6;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, ProductDetails productDetails, String str6, PresentedOfferingContext presentedOfferingContext, int i, k kVar) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, productDetails, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : presentedOfferingContext);
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, ProductDetails productDetails, PresentedOfferingContext presentedOfferingContext, int i, k kVar) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, productDetails, (i & 2048) != 0 ? null : presentedOfferingContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, ProductDetails productDetails, PresentedOfferingContext presentedOfferingContext) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, productDetails, presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null, presentedOfferingContext);
        t.g(str, "productId");
        t.g(productType, "type");
        t.g(price, "price");
        t.g(str3, "name");
        t.g(str4, "title");
        t.g(str5, "description");
        t.g(productDetails, "productDetails");
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, ProductDetails productDetails, String str5, int i, k kVar) {
        this(str, str2, productType, price, str3, str4, period, subscriptionOptions, subscriptionOption, productDetails, (i & 1024) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, ProductDetails productDetails, String str5) {
        this(str, str2, productType, price, str3, str3, str4, period, subscriptionOptions, subscriptionOption, productDetails, str5 != null ? new PresentedOfferingContext(str5) : null);
        t.g(str, "productId");
        t.g(productType, "type");
        t.g(price, "price");
        t.g(str3, "title");
        t.g(str4, "description");
        t.g(productDetails, "productDetails");
    }

    private GoogleStoreProduct(GoogleStoreProduct googleStoreProduct, SubscriptionOption subscriptionOption, SubscriptionOptions subscriptionOptions, PresentedOfferingContext presentedOfferingContext) {
        this(googleStoreProduct.productId, googleStoreProduct.basePlanId, googleStoreProduct.getType(), googleStoreProduct.getPrice(), googleStoreProduct.getName(), googleStoreProduct.getTitle(), googleStoreProduct.getDescription(), googleStoreProduct.getPeriod(), subscriptionOptions, subscriptionOption, googleStoreProduct.productDetails, presentedOfferingContext);
    }
}

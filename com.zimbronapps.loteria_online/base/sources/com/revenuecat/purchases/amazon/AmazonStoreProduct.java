package com.revenuecat.purchases.amazon;

import Ca.e;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.AmazonPurchasingData;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonStoreProduct implements StoreProduct {
    private final SubscriptionOption defaultOption;
    private final String description;
    private final Period freeTrialPeriod;
    private final String iconUrl;
    private final String id;
    private final String name;
    private final JSONObject originalProductJSON;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Price price;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonStoreProduct(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject) {
        this(str, productType, str2, str3, str4, period, price, subscriptionOptions, subscriptionOption, str5, period2, jSONObject, null, 4096, null);
        t.g(str, "id");
        t.g(productType, "type");
        t.g(str2, "name");
        t.g(str3, "title");
        t.g(str4, "description");
        t.g(price, "price");
        t.g(str5, "iconUrl");
        t.g(jSONObject, "originalProductJSON");
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
        return new AmazonStoreProduct(getId(), getType(), getName(), getTitle(), getDescription(), getPeriod(), getPrice(), getSubscriptionOptions(), getDefaultOption(), this.iconUrl, this.freeTrialPeriod, this.originalProductJSON, presentedOfferingContext);
    }

    public boolean equals(Object obj) {
        return (obj instanceof AmazonStoreProduct) && t.c(new ComparableData(this), new ComparableData((AmazonStoreProduct) obj));
    }

    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    public String getDescription() {
        return this.description;
    }

    public final Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public final JSONObject getOriginalProductJSON() {
        return this.originalProductJSON;
    }

    public Period getPeriod() {
        return this.period;
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

    public Price getPrice() {
        return this.price;
    }

    public String getSku() {
        return getId();
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
        return new ComparableData(this).hashCode();
    }

    public String toString() {
        return "AmazonStoreProduct(id=" + this.id + ", type=" + this.type + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", price=" + this.price + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", iconUrl=" + this.iconUrl + ", freeTrialPeriod=" + this.freeTrialPeriod + ", originalProductJSON=" + this.originalProductJSON + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    public AmazonStoreProduct(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext) {
        t.g(str, "id");
        t.g(productType, "type");
        t.g(str2, "name");
        t.g(str3, "title");
        t.g(str4, "description");
        t.g(price, "price");
        t.g(str5, "iconUrl");
        t.g(jSONObject, "originalProductJSON");
        this.id = str;
        this.type = productType;
        this.name = str2;
        this.title = str3;
        this.description = str4;
        this.period = period;
        this.price = price;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.iconUrl = str5;
        this.freeTrialPeriod = period2;
        this.originalProductJSON = jSONObject;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public AmazonPurchasingData getPurchasingData() {
        return new AmazonPurchasingData.Product(this);
    }

    public /* synthetic */ AmazonStoreProduct(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext, int i, k kVar) {
        this(str, productType, str2, str3, str4, period, price, subscriptionOptions, subscriptionOption, str5, period2, jSONObject, (i & 4096) != 0 ? null : presentedOfferingContext);
    }

    public /* synthetic */ AmazonStoreProduct(String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, JSONObject jSONObject, String str5, int i, k kVar) {
        this(str, productType, str2, str3, period, price, subscriptionOptions, subscriptionOption, str4, period2, jSONObject, (i & 2048) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public AmazonStoreProduct(String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, JSONObject jSONObject, String str5) {
        this(str, productType, str2, str2, str3, period, price, subscriptionOptions, subscriptionOption, str4, period2, jSONObject, str5 != null ? new PresentedOfferingContext(str5) : null);
        t.g(str, "id");
        t.g(productType, "type");
        t.g(str2, "title");
        t.g(str3, "description");
        t.g(price, "price");
        t.g(str4, "iconUrl");
        t.g(jSONObject, "originalProductJSON");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public AmazonStoreProduct(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject, String str6) {
        this(str, productType, str2, str3, str4, period, price, subscriptionOptions, subscriptionOption, str5, period2, jSONObject, new PresentedOfferingContext(str6));
        t.g(str, "id");
        t.g(productType, "type");
        t.g(str2, "name");
        t.g(str3, "title");
        t.g(str4, "description");
        t.g(price, "price");
        t.g(str5, "iconUrl");
        t.g(jSONObject, "originalProductJSON");
        t.g(str6, "presentedOfferingIdentifier");
    }
}

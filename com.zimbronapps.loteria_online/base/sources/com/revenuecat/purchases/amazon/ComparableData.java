package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class ComparableData {
    private final SubscriptionOption defaultOption;
    private final String description;
    private final Period freeTrialPeriod;
    private final String iconUrl;
    private final String id;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Price price;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    public ComparableData(String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, PresentedOfferingContext presentedOfferingContext) {
        t.g(str, "id");
        t.g(productType, "type");
        t.g(str2, "title");
        t.g(str3, "description");
        t.g(price, "price");
        t.g(str4, "iconUrl");
        this.id = str;
        this.type = productType;
        this.title = str2;
        this.description = str3;
        this.period = period;
        this.price = price;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.iconUrl = str4;
        this.freeTrialPeriod = period2;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public static /* synthetic */ ComparableData copy$default(ComparableData comparableData, String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, PresentedOfferingContext presentedOfferingContext, int i, Object obj) {
        return comparableData.copy((i & 1) != 0 ? comparableData.id : str, (i & 2) != 0 ? comparableData.type : productType, (i & 4) != 0 ? comparableData.title : str2, (i & 8) != 0 ? comparableData.description : str3, (i & 16) != 0 ? comparableData.period : period, (i & 32) != 0 ? comparableData.price : price, (i & 64) != 0 ? comparableData.subscriptionOptions : subscriptionOptions, (i & 128) != 0 ? comparableData.defaultOption : subscriptionOption, (i & 256) != 0 ? comparableData.iconUrl : str4, (i & 512) != 0 ? comparableData.freeTrialPeriod : period2, (i & 1024) != 0 ? comparableData.presentedOfferingContext : presentedOfferingContext);
    }

    public final String component1() {
        return this.id;
    }

    public final Period component10() {
        return this.freeTrialPeriod;
    }

    public final PresentedOfferingContext component11() {
        return this.presentedOfferingContext;
    }

    public final ProductType component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final Period component5() {
        return this.period;
    }

    public final Price component6() {
        return this.price;
    }

    public final SubscriptionOptions component7() {
        return this.subscriptionOptions;
    }

    public final SubscriptionOption component8() {
        return this.defaultOption;
    }

    public final String component9() {
        return this.iconUrl;
    }

    public final ComparableData copy(String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, PresentedOfferingContext presentedOfferingContext) {
        t.g(str, "id");
        t.g(productType, "type");
        t.g(str2, "title");
        t.g(str3, "description");
        t.g(price, "price");
        t.g(str4, "iconUrl");
        return new ComparableData(str, productType, str2, str3, period, price, subscriptionOptions, subscriptionOption, str4, period2, presentedOfferingContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableData)) {
            return false;
        }
        ComparableData comparableData = (ComparableData) obj;
        return t.c(this.id, comparableData.id) && this.type == comparableData.type && t.c(this.title, comparableData.title) && t.c(this.description, comparableData.description) && t.c(this.period, comparableData.period) && t.c(this.price, comparableData.price) && t.c(this.subscriptionOptions, comparableData.subscriptionOptions) && t.c(this.defaultOption, comparableData.defaultOption) && t.c(this.iconUrl, comparableData.iconUrl) && t.c(this.freeTrialPeriod, comparableData.freeTrialPeriod) && t.c(this.presentedOfferingContext, comparableData.presentedOfferingContext);
    }

    public final SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final Period getPeriod() {
        return this.period;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        Period period = this.period;
        int hashCode2 = (((hashCode + (period == null ? 0 : period.hashCode())) * 31) + this.price.hashCode()) * 31;
        SubscriptionOptions subscriptionOptions = this.subscriptionOptions;
        int hashCode3 = (hashCode2 + (subscriptionOptions == null ? 0 : subscriptionOptions.hashCode())) * 31;
        SubscriptionOption subscriptionOption = this.defaultOption;
        int hashCode4 = (((hashCode3 + (subscriptionOption == null ? 0 : subscriptionOption.hashCode())) * 31) + this.iconUrl.hashCode()) * 31;
        Period period2 = this.freeTrialPeriod;
        int hashCode5 = (hashCode4 + (period2 == null ? 0 : period2.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        return hashCode5 + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0);
    }

    public String toString() {
        return "ComparableData(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", price=" + this.price + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", iconUrl=" + this.iconUrl + ", freeTrialPeriod=" + this.freeTrialPeriod + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparableData(AmazonStoreProduct amazonStoreProduct) {
        this(amazonStoreProduct.getId(), amazonStoreProduct.getType(), amazonStoreProduct.getTitle(), amazonStoreProduct.getDescription(), amazonStoreProduct.getPeriod(), amazonStoreProduct.getPrice(), amazonStoreProduct.getSubscriptionOptions(), amazonStoreProduct.getDefaultOption(), amazonStoreProduct.getIconUrl(), amazonStoreProduct.getFreeTrialPeriod(), amazonStoreProduct.getPresentedOfferingContext());
        t.g(amazonStoreProduct, "amazonStoreProduct");
    }
}

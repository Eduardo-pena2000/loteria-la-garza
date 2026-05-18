package com.revenuecat.purchases.models;

import Ca.e;
import Da.u;
import Da.v;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.simulatedstore.SimulatedStorePurchasingData;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TestStoreProduct implements StoreProduct {
    private final String description;
    private final PricingPhase freeTrialPricingPhase;
    private final String id;
    private final PricingPhase introPricePricingPhase;
    private final String name;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Price price;
    private final PurchasingData purchasingData;
    private final String title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(String str, String str2, String str3, String str4, Price price) {
        this(str, str2, str3, str4, price, null, null, null, null, 480, null);
        t.g(str, "id");
        t.g(str2, "name");
        t.g(str3, "title");
        t.g(str4, "description");
        t.g(price, "price");
    }

    private final SubscriptionOptions buildSubscriptionOptions() {
        if (getPeriod() == null) {
            return null;
        }
        PricingPhase pricingPhase = new PricingPhase(getPeriod(), RecurrenceMode.INFINITE_RECURRING, null, getPrice());
        return new SubscriptionOptions(v.s(new TestSubscriptionOption[]{(this.freeTrialPricingPhase == null && this.introPricePricingPhase == null) ? null : new TestSubscriptionOption(v.s(new PricingPhase[]{this.freeTrialPricingPhase, this.introPricePricingPhase, pricingPhase}), null, null, null, null, getPurchasingData(), 30, null), new TestSubscriptionOption(u.e(pricingPhase), null, null, null, null, getPurchasingData(), 30, null)}));
    }

    @e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @e
    public StoreProduct copyWithOfferingId(String str) {
        t.g(str, "offeringId");
        return copyWithPresentedOfferingContext(new PresentedOfferingContext(str));
    }

    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        return new TestStoreProduct(getId(), getName(), getTitle(), getDescription(), getPrice(), getPeriod(), this.freeTrialPricingPhase, this.introPricePricingPhase, presentedOfferingContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestStoreProduct)) {
            return false;
        }
        TestStoreProduct testStoreProduct = (TestStoreProduct) obj;
        return t.c(this.id, testStoreProduct.id) && t.c(this.name, testStoreProduct.name) && t.c(this.title, testStoreProduct.title) && t.c(this.description, testStoreProduct.description) && t.c(this.price, testStoreProduct.price) && t.c(this.period, testStoreProduct.period) && t.c(this.freeTrialPricingPhase, testStoreProduct.freeTrialPricingPhase) && t.c(this.introPricePricingPhase, testStoreProduct.introPricePricingPhase) && t.c(this.presentedOfferingContext, testStoreProduct.presentedOfferingContext);
    }

    public SubscriptionOption getDefaultOption() {
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            return subscriptionOptions.getDefaultOffer();
        }
        return null;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
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
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    public Price getPrice() {
        return this.price;
    }

    public PurchasingData getPurchasingData() {
        return this.purchasingData;
    }

    public String getSku() {
        return getId();
    }

    public SubscriptionOptions getSubscriptionOptions() {
        return buildSubscriptionOptions();
    }

    public String getTitle() {
        return this.title;
    }

    public ProductType getType() {
        return getPeriod() == null ? ProductType.INAPP : ProductType.SUBS;
    }

    public int hashCode() {
        int hashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.price.hashCode()) * 31;
        Period period = this.period;
        int hashCode2 = (hashCode + (period == null ? 0 : period.hashCode())) * 31;
        PricingPhase pricingPhase = this.freeTrialPricingPhase;
        int hashCode3 = (hashCode2 + (pricingPhase == null ? 0 : pricingPhase.hashCode())) * 31;
        PricingPhase pricingPhase2 = this.introPricePricingPhase;
        int hashCode4 = (hashCode3 + (pricingPhase2 == null ? 0 : pricingPhase2.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        return hashCode4 + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0);
    }

    public String toString() {
        return "TestStoreProduct(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", price=" + this.price + ", period=" + this.period + ", freeTrialPricingPhase=" + this.freeTrialPricingPhase + ", introPricePricingPhase=" + this.introPricePricingPhase + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period) {
        this(str, str2, str3, str4, price, period, null, null, null, 448, null);
        t.g(str, "id");
        t.g(str2, "name");
        t.g(str3, "title");
        t.g(str4, "description");
        t.g(price, "price");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, PricingPhase pricingPhase) {
        this(str, str2, str3, str4, price, period, pricingPhase, null, null, 384, null);
        t.g(str, "id");
        t.g(str2, "name");
        t.g(str3, "title");
        t.g(str4, "description");
        t.g(price, "price");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, PricingPhase pricingPhase, PricingPhase pricingPhase2) {
        this(str, str2, str3, str4, price, period, pricingPhase, pricingPhase2, null, 256, null);
        t.g(str, "id");
        t.g(str2, "name");
        t.g(str3, "title");
        t.g(str4, "description");
        t.g(price, "price");
    }

    public TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, PricingPhase pricingPhase, PricingPhase pricingPhase2, PresentedOfferingContext presentedOfferingContext) {
        t.g(str, "id");
        t.g(str2, "name");
        t.g(str3, "title");
        t.g(str4, "description");
        t.g(price, "price");
        this.id = str;
        this.name = str2;
        this.title = str3;
        this.description = str4;
        this.price = price;
        this.period = period;
        this.freeTrialPricingPhase = pricingPhase;
        this.introPricePricingPhase = pricingPhase2;
        this.presentedOfferingContext = presentedOfferingContext;
        this.purchasingData = new SimulatedStorePurchasingData(getId(), getType(), this);
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, PricingPhase pricingPhase, PricingPhase pricingPhase2, PresentedOfferingContext presentedOfferingContext, int i, k kVar) {
        this(str, str2, str3, str4, price, (i & 32) != 0 ? null : period, (i & 64) != 0 ? null : pricingPhase, (i & 128) != 0 ? null : pricingPhase2, (i & 256) != 0 ? null : presentedOfferingContext);
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2, int i, k kVar) {
        this(str, str2, str3, str4, price, (i & 32) != 0 ? null : period, (i & 64) != 0 ? null : period2, (i & 128) != 0 ? null : price2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2) {
        this(str, str2, str3, str4, price, period, period2 != null ? new PricingPhase(period2, RecurrenceMode.FINITE_RECURRING, 1, new Price("Free", 0L, price.getCurrencyCode())) : null, price2 != null ? new PricingPhase(new Period(1, Period.Unit.MONTH, "P1M"), RecurrenceMode.FINITE_RECURRING, 1, price2) : null, null, 256, null);
        t.g(str, "id");
        t.g(str2, "name");
        t.g(str3, "title");
        t.g(str4, "description");
        t.g(price, "price");
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, Price price, Period period, Period period2, Price price2, int i, k kVar) {
        this(str, str2, str3, price, period, (i & 32) != 0 ? null : period2, (i & 64) != 0 ? null : price2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public TestStoreProduct(String str, String str2, String str3, Price price, Period period, Period period2, Price price2) {
        this(str, str2, str2, str3, price, period, period2, price2);
        t.g(str, "id");
        t.g(str2, "title");
        t.g(str3, "description");
        t.g(price, "price");
    }
}

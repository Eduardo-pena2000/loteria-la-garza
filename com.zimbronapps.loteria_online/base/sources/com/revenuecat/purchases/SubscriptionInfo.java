package com.revenuecat.purchases;

import Za.u;
import android.net.Uri;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.EntitlementInfoHelper;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriptionInfo {
    private final Date autoResumeDate;
    private final Date billingIssuesDetectedAt;
    private final String displayName;
    private final Date expiresDate;
    private final Date gracePeriodExpiresDate;
    private final boolean isActive;
    private final boolean isSandbox;
    private final Uri managementURL;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final Price price;
    private final String productIdentifier;
    private final String productPlanIdentifier;
    private final Date purchaseDate;
    private final Date refundedAt;
    private final Date requestDate;
    private final Store store;
    private final String storeTransactionId;
    private final Date unsubscribeDetectedAt;
    private final boolean willRenew;

    public SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store, Date date4, boolean z, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str2, Date date8, String str3, Price price, String str4, Uri uri, Date date9) {
        t.g(str, "productIdentifier");
        t.g(date, "purchaseDate");
        t.g(store, "store");
        t.g(ownershipType, "ownershipType");
        t.g(periodType, "periodType");
        t.g(date9, "requestDate");
        this.productIdentifier = str;
        this.purchaseDate = date;
        this.originalPurchaseDate = date2;
        this.expiresDate = date3;
        this.store = store;
        this.unsubscribeDetectedAt = date4;
        this.isSandbox = z;
        this.billingIssuesDetectedAt = date5;
        this.gracePeriodExpiresDate = date6;
        this.ownershipType = ownershipType;
        this.periodType = periodType;
        this.refundedAt = date7;
        this.storeTransactionId = str2;
        this.autoResumeDate = date8;
        this.displayName = str3;
        this.price = price;
        this.productPlanIdentifier = str4;
        this.managementURL = uri;
        this.requestDate = date9;
        this.isActive = DateHelper.Companion.isDateActive-SxA4cEA$default(DateHelper.Companion, date3, date9, 0L, 4, (Object) null).isActive();
        this.willRenew = EntitlementInfoHelper.INSTANCE.getWillRenew(store, date3, date4, date5, periodType);
    }

    public final Date getAutoResumeDate() {
        return this.autoResumeDate;
    }

    public final Date getBillingIssuesDetectedAt() {
        return this.billingIssuesDetectedAt;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Date getExpiresDate() {
        return this.expiresDate;
    }

    public final Date getGracePeriodExpiresDate() {
        return this.gracePeriodExpiresDate;
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final Date getRefundedAt() {
        return this.refundedAt;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return u.j("\n            SubscriptionInfo {\n                purchaseDate: " + this.purchaseDate + ",\n                originalPurchaseDate: " + this.originalPurchaseDate + ",\n                expiresDate: " + this.expiresDate + ",\n                store: " + this.store + ",\n                isSandbox: " + this.isSandbox + ",\n                unsubscribeDetectedAt: " + this.unsubscribeDetectedAt + ",\n                billingIssuesDetectedAt: " + this.billingIssuesDetectedAt + ",\n                gracePeriodExpiresDate: " + this.gracePeriodExpiresDate + ",\n                ownershipType: " + this.ownershipType + ",\n                periodType: " + this.periodType + ",\n                refundedAt: " + this.refundedAt + ",\n                storeTransactionId: " + this.storeTransactionId + ",\n                isActive: " + this.isActive + ",\n                willRenew: " + this.willRenew + ",\n                price: " + this.price + ",\n                productPlanIdentifier: " + this.productPlanIdentifier + ",\n                displayName: " + this.displayName + ",\n                autoResumeDate: " + this.autoResumeDate + ",\n                managementURL: " + this.managementURL + ",\n                requestDate: " + this.requestDate + ",\n                productIdentifier: " + this.productIdentifier + "\n            }\n        ");
    }

    public /* synthetic */ SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store, Date date4, boolean z, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str2, Date date8, String str3, Price price, String str4, Uri uri, Date date9, int i, kotlin.jvm.internal.k kVar) {
        this(str, date, date2, date3, store, date4, z, date5, date6, (i & 512) != 0 ? OwnershipType.UNKNOWN : ownershipType, periodType, date7, str2, date8, str3, price, str4, uri, date9);
    }

    public /* synthetic */ SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store, Date date4, boolean z, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str2, Date date8, int i, kotlin.jvm.internal.k kVar) {
        this(str, date, date2, date3, store, date4, z, date5, date6, (i & 512) != 0 ? OwnershipType.UNKNOWN : ownershipType, periodType, date7, str2, date8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Ca.e
    public SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store, Date date4, boolean z, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str2, Date date8) {
        this(str, date, date2, date3, store, date4, z, date5, date6, ownershipType, periodType, date7, str2, null, null, null, null, null, date8);
        t.g(str, "productIdentifier");
        t.g(date, "purchaseDate");
        t.g(store, "store");
        t.g(ownershipType, "ownershipType");
        t.g(periodType, "periodType");
        t.g(date8, "requestDate");
    }

    public /* synthetic */ SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store, Date date4, boolean z, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str2, Date date8, String str3, Price price, String str4, Date date9, int i, kotlin.jvm.internal.k kVar) {
        this(str, date, date2, date3, store, date4, z, date5, date6, (i & 512) != 0 ? OwnershipType.UNKNOWN : ownershipType, periodType, date7, str2, date8, str3, price, str4, date9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Ca.e
    public SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store, Date date4, boolean z, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str2, Date date8, String str3, Price price, String str4, Date date9) {
        this(str, date, date2, date3, store, date4, z, date5, date6, ownershipType, periodType, date7, str2, date8, str3, price, str4, null, date9);
        t.g(str, "productIdentifier");
        t.g(date, "purchaseDate");
        t.g(store, "store");
        t.g(ownershipType, "ownershipType");
        t.g(periodType, "periodType");
        t.g(date9, "requestDate");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubscriptionInfo(String str, Date date, SubscriptionInfoResponse subscriptionInfoResponse, Locale locale, int i, kotlin.jvm.internal.k kVar) {
        if ((i & 8) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        this(str, date, subscriptionInfoResponse, locale);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SubscriptionInfo(String str, Date date, SubscriptionInfoResponse subscriptionInfoResponse, Locale locale) {
        t.g(str, "productIdentifier");
        t.g(date, "requestDate");
        t.g(subscriptionInfoResponse, "response");
        t.g(locale, "locale");
        Date purchaseDate = subscriptionInfoResponse.getPurchaseDate();
        Date originalPurchaseDate = subscriptionInfoResponse.getOriginalPurchaseDate();
        Date expiresDate = subscriptionInfoResponse.getExpiresDate();
        Store store = subscriptionInfoResponse.getStore();
        boolean isSandbox = subscriptionInfoResponse.isSandbox();
        Date unsubscribeDetectedAt = subscriptionInfoResponse.getUnsubscribeDetectedAt();
        Date billingIssuesDetectedAt = subscriptionInfoResponse.getBillingIssuesDetectedAt();
        Date gracePeriodExpiresDate = subscriptionInfoResponse.getGracePeriodExpiresDate();
        OwnershipType ownershipType = subscriptionInfoResponse.getOwnershipType();
        PeriodType periodType = subscriptionInfoResponse.getPeriodType();
        Date refundedAt = subscriptionInfoResponse.getRefundedAt();
        String storeTransactionId = subscriptionInfoResponse.getStoreTransactionId();
        Date autoResumeDate = subscriptionInfoResponse.getAutoResumeDate();
        String displayName = subscriptionInfoResponse.getDisplayName();
        SubscriptionInfoResponse.PriceResponse price = subscriptionInfoResponse.getPrice();
        Price price2 = price != null ? price.toPrice(locale) : null;
        String productPlanIdentifier = subscriptionInfoResponse.getProductPlanIdentifier();
        String managementURL = subscriptionInfoResponse.getManagementURL();
        this(str, purchaseDate, originalPurchaseDate, expiresDate, store, unsubscribeDetectedAt, isSandbox, billingIssuesDetectedAt, gracePeriodExpiresDate, ownershipType, periodType, refundedAt, storeTransactionId, autoResumeDate, displayName, price2, productPlanIdentifier, managementURL != null ? Uri.parse(managementURL) : null, date);
    }
}

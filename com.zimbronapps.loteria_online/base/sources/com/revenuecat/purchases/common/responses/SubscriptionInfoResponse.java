package com.revenuecat.purchases.common.responses;

import Ca.e;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.StoreSerializer;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;
import sb.x0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriptionInfoResponse {
    private final Date autoResumeDate;
    private final Date billingIssuesDetectedAt;
    private final String displayName;
    private final Date expiresDate;
    private final Date gracePeriodExpiresDate;
    private final boolean isSandbox;
    private final String managementURL;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final PriceResponse price;
    private final String productPlanIdentifier;
    private final Date purchaseDate;
    private final Date refundedAt;
    private final Store store;
    private final String storeTransactionId;
    private final Date unsubscribeDetectedAt;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, OwnershipType.Companion.serializer(), PeriodType.Companion.serializer(), null, null, null, null, null, null, null};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return SubscriptionInfoResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ SubscriptionInfoResponse(int i, Date date, Date date2, Date date3, Store store, boolean z, Date date4, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str, Date date8, String str2, PriceResponse priceResponse, String str3, String str4, t0 t0Var) {
        if (537 != (i & 537)) {
            f0.a(i, 537, SubscriptionInfoResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.purchaseDate = date;
        if ((i & 2) == 0) {
            this.originalPurchaseDate = null;
        } else {
            this.originalPurchaseDate = date2;
        }
        if ((i & 4) == 0) {
            this.expiresDate = null;
        } else {
            this.expiresDate = date3;
        }
        this.store = store;
        this.isSandbox = z;
        if ((i & 32) == 0) {
            this.unsubscribeDetectedAt = null;
        } else {
            this.unsubscribeDetectedAt = date4;
        }
        if ((i & 64) == 0) {
            this.billingIssuesDetectedAt = null;
        } else {
            this.billingIssuesDetectedAt = date5;
        }
        if ((i & 128) == 0) {
            this.gracePeriodExpiresDate = null;
        } else {
            this.gracePeriodExpiresDate = date6;
        }
        this.ownershipType = (i & 256) == 0 ? OwnershipType.UNKNOWN : ownershipType;
        this.periodType = periodType;
        if ((i & 1024) == 0) {
            this.refundedAt = null;
        } else {
            this.refundedAt = date7;
        }
        if ((i & 2048) == 0) {
            this.storeTransactionId = null;
        } else {
            this.storeTransactionId = str;
        }
        if ((i & 4096) == 0) {
            this.autoResumeDate = null;
        } else {
            this.autoResumeDate = date8;
        }
        if ((i & 8192) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str2;
        }
        if ((i & 16384) == 0) {
            this.price = null;
        } else {
            this.price = priceResponse;
        }
        if ((32768 & i) == 0) {
            this.productPlanIdentifier = null;
        } else {
            this.productPlanIdentifier = str3;
        }
        if ((i & 65536) == 0) {
            this.managementURL = null;
        } else {
            this.managementURL = str4;
        }
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ SubscriptionInfoResponse copy$default(SubscriptionInfoResponse subscriptionInfoResponse, Date date, Date date2, Date date3, Store store, boolean z, Date date4, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str, Date date8, String str2, PriceResponse priceResponse, String str3, String str4, int i, Object obj) {
        return subscriptionInfoResponse.copy((i & 1) != 0 ? subscriptionInfoResponse.purchaseDate : date, (i & 2) != 0 ? subscriptionInfoResponse.originalPurchaseDate : date2, (i & 4) != 0 ? subscriptionInfoResponse.expiresDate : date3, (i & 8) != 0 ? subscriptionInfoResponse.store : store, (i & 16) != 0 ? subscriptionInfoResponse.isSandbox : z, (i & 32) != 0 ? subscriptionInfoResponse.unsubscribeDetectedAt : date4, (i & 64) != 0 ? subscriptionInfoResponse.billingIssuesDetectedAt : date5, (i & 128) != 0 ? subscriptionInfoResponse.gracePeriodExpiresDate : date6, (i & 256) != 0 ? subscriptionInfoResponse.ownershipType : ownershipType, (i & 512) != 0 ? subscriptionInfoResponse.periodType : periodType, (i & 1024) != 0 ? subscriptionInfoResponse.refundedAt : date7, (i & 2048) != 0 ? subscriptionInfoResponse.storeTransactionId : str, (i & 4096) != 0 ? subscriptionInfoResponse.autoResumeDate : date8, (i & 8192) != 0 ? subscriptionInfoResponse.displayName : str2, (i & 16384) != 0 ? subscriptionInfoResponse.price : priceResponse, (i & 32768) != 0 ? subscriptionInfoResponse.productPlanIdentifier : str3, (i & 65536) != 0 ? subscriptionInfoResponse.managementURL : str4);
    }

    public static /* synthetic */ void getAutoResumeDate$annotations() {
    }

    public static /* synthetic */ void getBillingIssuesDetectedAt$annotations() {
    }

    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getExpiresDate$annotations() {
    }

    public static /* synthetic */ void getGracePeriodExpiresDate$annotations() {
    }

    public static /* synthetic */ void getManagementURL$annotations() {
    }

    public static /* synthetic */ void getOriginalPurchaseDate$annotations() {
    }

    public static /* synthetic */ void getOwnershipType$annotations() {
    }

    public static /* synthetic */ void getPeriodType$annotations() {
    }

    public static /* synthetic */ void getPrice$annotations() {
    }

    public static /* synthetic */ void getProductPlanIdentifier$annotations() {
    }

    public static /* synthetic */ void getPurchaseDate$annotations() {
    }

    public static /* synthetic */ void getRefundedAt$annotations() {
    }

    public static /* synthetic */ void getStore$annotations() {
    }

    public static /* synthetic */ void getStoreTransactionId$annotations() {
    }

    public static /* synthetic */ void getUnsubscribeDetectedAt$annotations() {
    }

    public static /* synthetic */ void isSandbox$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(SubscriptionInfoResponse subscriptionInfoResponse, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        ISO8601DateSerializer iSO8601DateSerializer = ISO8601DateSerializer.INSTANCE;
        dVar.k(eVar, 0, iSO8601DateSerializer, subscriptionInfoResponse.purchaseDate);
        if (dVar.e(eVar, 1) || subscriptionInfoResponse.originalPurchaseDate != null) {
            dVar.j(eVar, 1, iSO8601DateSerializer, subscriptionInfoResponse.originalPurchaseDate);
        }
        if (dVar.e(eVar, 2) || subscriptionInfoResponse.expiresDate != null) {
            dVar.j(eVar, 2, iSO8601DateSerializer, subscriptionInfoResponse.expiresDate);
        }
        dVar.k(eVar, 3, StoreSerializer.INSTANCE, subscriptionInfoResponse.store);
        dVar.B(eVar, 4, subscriptionInfoResponse.isSandbox);
        if (dVar.e(eVar, 5) || subscriptionInfoResponse.unsubscribeDetectedAt != null) {
            dVar.j(eVar, 5, iSO8601DateSerializer, subscriptionInfoResponse.unsubscribeDetectedAt);
        }
        if (dVar.e(eVar, 6) || subscriptionInfoResponse.billingIssuesDetectedAt != null) {
            dVar.j(eVar, 6, iSO8601DateSerializer, subscriptionInfoResponse.billingIssuesDetectedAt);
        }
        if (dVar.e(eVar, 7) || subscriptionInfoResponse.gracePeriodExpiresDate != null) {
            dVar.j(eVar, 7, iSO8601DateSerializer, subscriptionInfoResponse.gracePeriodExpiresDate);
        }
        if (dVar.e(eVar, 8) || subscriptionInfoResponse.ownershipType != OwnershipType.UNKNOWN) {
            dVar.k(eVar, 8, kVarArr[8], subscriptionInfoResponse.ownershipType);
        }
        dVar.k(eVar, 9, kVarArr[9], subscriptionInfoResponse.periodType);
        if (dVar.e(eVar, 10) || subscriptionInfoResponse.refundedAt != null) {
            dVar.j(eVar, 10, iSO8601DateSerializer, subscriptionInfoResponse.refundedAt);
        }
        if (dVar.e(eVar, 11) || subscriptionInfoResponse.storeTransactionId != null) {
            dVar.j(eVar, 11, x0.a, subscriptionInfoResponse.storeTransactionId);
        }
        if (dVar.e(eVar, 12) || subscriptionInfoResponse.autoResumeDate != null) {
            dVar.j(eVar, 12, iSO8601DateSerializer, subscriptionInfoResponse.autoResumeDate);
        }
        if (dVar.e(eVar, 13) || subscriptionInfoResponse.displayName != null) {
            dVar.j(eVar, 13, x0.a, subscriptionInfoResponse.displayName);
        }
        if (dVar.e(eVar, 14) || subscriptionInfoResponse.price != null) {
            dVar.j(eVar, 14, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE, subscriptionInfoResponse.price);
        }
        if (dVar.e(eVar, 15) || subscriptionInfoResponse.productPlanIdentifier != null) {
            dVar.j(eVar, 15, x0.a, subscriptionInfoResponse.productPlanIdentifier);
        }
        if (!dVar.e(eVar, 16) && subscriptionInfoResponse.managementURL == null) {
            return;
        }
        dVar.j(eVar, 16, x0.a, subscriptionInfoResponse.managementURL);
    }

    public final Date component1() {
        return this.purchaseDate;
    }

    public final PeriodType component10() {
        return this.periodType;
    }

    public final Date component11() {
        return this.refundedAt;
    }

    public final String component12() {
        return this.storeTransactionId;
    }

    public final Date component13() {
        return this.autoResumeDate;
    }

    public final String component14() {
        return this.displayName;
    }

    public final PriceResponse component15() {
        return this.price;
    }

    public final String component16() {
        return this.productPlanIdentifier;
    }

    public final String component17() {
        return this.managementURL;
    }

    public final Date component2() {
        return this.originalPurchaseDate;
    }

    public final Date component3() {
        return this.expiresDate;
    }

    public final Store component4() {
        return this.store;
    }

    public final boolean component5() {
        return this.isSandbox;
    }

    public final Date component6() {
        return this.unsubscribeDetectedAt;
    }

    public final Date component7() {
        return this.billingIssuesDetectedAt;
    }

    public final Date component8() {
        return this.gracePeriodExpiresDate;
    }

    public final OwnershipType component9() {
        return this.ownershipType;
    }

    public final SubscriptionInfoResponse copy(Date date, Date date2, Date date3, Store store, boolean z, Date date4, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str, Date date8, String str2, PriceResponse priceResponse, String str3, String str4) {
        t.g(date, "purchaseDate");
        t.g(store, "store");
        t.g(ownershipType, "ownershipType");
        t.g(periodType, "periodType");
        return new SubscriptionInfoResponse(date, date2, date3, store, z, date4, date5, date6, ownershipType, periodType, date7, str, date8, str2, priceResponse, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionInfoResponse)) {
            return false;
        }
        SubscriptionInfoResponse subscriptionInfoResponse = (SubscriptionInfoResponse) obj;
        return t.c(this.purchaseDate, subscriptionInfoResponse.purchaseDate) && t.c(this.originalPurchaseDate, subscriptionInfoResponse.originalPurchaseDate) && t.c(this.expiresDate, subscriptionInfoResponse.expiresDate) && this.store == subscriptionInfoResponse.store && this.isSandbox == subscriptionInfoResponse.isSandbox && t.c(this.unsubscribeDetectedAt, subscriptionInfoResponse.unsubscribeDetectedAt) && t.c(this.billingIssuesDetectedAt, subscriptionInfoResponse.billingIssuesDetectedAt) && t.c(this.gracePeriodExpiresDate, subscriptionInfoResponse.gracePeriodExpiresDate) && this.ownershipType == subscriptionInfoResponse.ownershipType && this.periodType == subscriptionInfoResponse.periodType && t.c(this.refundedAt, subscriptionInfoResponse.refundedAt) && t.c(this.storeTransactionId, subscriptionInfoResponse.storeTransactionId) && t.c(this.autoResumeDate, subscriptionInfoResponse.autoResumeDate) && t.c(this.displayName, subscriptionInfoResponse.displayName) && t.c(this.price, subscriptionInfoResponse.price) && t.c(this.productPlanIdentifier, subscriptionInfoResponse.productPlanIdentifier) && t.c(this.managementURL, subscriptionInfoResponse.managementURL);
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

    public final String getManagementURL() {
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

    public final PriceResponse getPrice() {
        return this.price;
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

    public int hashCode() {
        int hashCode = this.purchaseDate.hashCode() * 31;
        Date date = this.originalPurchaseDate;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expiresDate;
        int hashCode3 = (((((hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.isSandbox)) * 31;
        Date date3 = this.unsubscribeDetectedAt;
        int hashCode4 = (hashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.billingIssuesDetectedAt;
        int hashCode5 = (hashCode4 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.gracePeriodExpiresDate;
        int hashCode6 = (((((hashCode5 + (date5 == null ? 0 : date5.hashCode())) * 31) + this.ownershipType.hashCode()) * 31) + this.periodType.hashCode()) * 31;
        Date date6 = this.refundedAt;
        int hashCode7 = (hashCode6 + (date6 == null ? 0 : date6.hashCode())) * 31;
        String str = this.storeTransactionId;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Date date7 = this.autoResumeDate;
        int hashCode9 = (hashCode8 + (date7 == null ? 0 : date7.hashCode())) * 31;
        String str2 = this.displayName;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceResponse priceResponse = this.price;
        int hashCode11 = (hashCode10 + (priceResponse == null ? 0 : priceResponse.hashCode())) * 31;
        String str3 = this.productPlanIdentifier;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.managementURL;
        return hashCode12 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return "SubscriptionInfoResponse(purchaseDate=" + this.purchaseDate + ", originalPurchaseDate=" + this.originalPurchaseDate + ", expiresDate=" + this.expiresDate + ", store=" + this.store + ", isSandbox=" + this.isSandbox + ", unsubscribeDetectedAt=" + this.unsubscribeDetectedAt + ", billingIssuesDetectedAt=" + this.billingIssuesDetectedAt + ", gracePeriodExpiresDate=" + this.gracePeriodExpiresDate + ", ownershipType=" + this.ownershipType + ", periodType=" + this.periodType + ", refundedAt=" + this.refundedAt + ", storeTransactionId=" + this.storeTransactionId + ", autoResumeDate=" + this.autoResumeDate + ", displayName=" + this.displayName + ", price=" + this.price + ", productPlanIdentifier=" + this.productPlanIdentifier + ", managementURL=" + this.managementURL + ')';
    }

    public static final class PriceResponse {
        public static final Companion Companion = new Companion(null);
        private final double amount;
        private final String currencyCode;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public PriceResponse(double d, String str) {
            t.g(str, "currencyCode");
            this.amount = d;
            this.currencyCode = str;
        }

        public static /* synthetic */ PriceResponse copy$default(PriceResponse priceResponse, double d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                d = priceResponse.amount;
            }
            if ((i & 2) != 0) {
                str = priceResponse.currencyCode;
            }
            return priceResponse.copy(d, str);
        }

        public static /* synthetic */ void getAmount$annotations() {
        }

        public static /* synthetic */ void getCurrencyCode$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PriceResponse priceResponse, d dVar, qb.e eVar) {
            dVar.q(eVar, 0, priceResponse.amount);
            dVar.v(eVar, 1, priceResponse.currencyCode);
        }

        public final double component1() {
            return this.amount;
        }

        public final String component2() {
            return this.currencyCode;
        }

        public final PriceResponse copy(double d, String str) {
            t.g(str, "currencyCode");
            return new PriceResponse(d, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceResponse)) {
                return false;
            }
            PriceResponse priceResponse = (PriceResponse) obj;
            return Double.compare(this.amount, priceResponse.amount) == 0 && t.c(this.currencyCode, priceResponse.currencyCode);
        }

        public final double getAmount() {
            return this.amount;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public int hashCode() {
            return (Double.hashCode(this.amount) * 31) + this.currencyCode.hashCode();
        }

        public final /* synthetic */ Price toPrice(Locale locale) {
            t.g(locale, "locale");
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
            currencyInstance.setCurrency(Currency.getInstance(this.currencyCode));
            String format = currencyInstance.format(this.amount);
            t.f(format, "formatted");
            return new Price(format, (long) (this.amount * 1000000.0d), this.currencyCode);
        }

        public String toString() {
            return "PriceResponse(amount=" + this.amount + ", currencyCode=" + this.currencyCode + ')';
        }

        @e
        public /* synthetic */ PriceResponse(int i, double d, String str, t0 t0Var) {
            if (3 != (i & 3)) {
                f0.a(i, 3, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE.getDescriptor());
            }
            this.amount = d;
            this.currencyCode = str;
        }
    }

    public SubscriptionInfoResponse(Date date, Date date2, Date date3, Store store, boolean z, Date date4, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str, Date date8, String str2, PriceResponse priceResponse, String str3, String str4) {
        t.g(date, "purchaseDate");
        t.g(store, "store");
        t.g(ownershipType, "ownershipType");
        t.g(periodType, "periodType");
        this.purchaseDate = date;
        this.originalPurchaseDate = date2;
        this.expiresDate = date3;
        this.store = store;
        this.isSandbox = z;
        this.unsubscribeDetectedAt = date4;
        this.billingIssuesDetectedAt = date5;
        this.gracePeriodExpiresDate = date6;
        this.ownershipType = ownershipType;
        this.periodType = periodType;
        this.refundedAt = date7;
        this.storeTransactionId = str;
        this.autoResumeDate = date8;
        this.displayName = str2;
        this.price = priceResponse;
        this.productPlanIdentifier = str3;
        this.managementURL = str4;
    }

    public /* synthetic */ SubscriptionInfoResponse(Date date, Date date2, Date date3, Store store, boolean z, Date date4, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str, Date date8, String str2, PriceResponse priceResponse, String str3, String str4, int i, k kVar) {
        this(date, (i & 2) != 0 ? null : date2, (i & 4) != 0 ? null : date3, store, z, (i & 32) != 0 ? null : date4, (i & 64) != 0 ? null : date5, (i & 128) != 0 ? null : date6, (i & 256) != 0 ? OwnershipType.UNKNOWN : ownershipType, periodType, (i & 1024) != 0 ? null : date7, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : date8, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : priceResponse, (32768 & i) != 0 ? null : str3, (i & 65536) != 0 ? null : str4);
    }
}

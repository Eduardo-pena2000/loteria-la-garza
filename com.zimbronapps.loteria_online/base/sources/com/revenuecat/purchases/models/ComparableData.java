package com.revenuecat.purchases.models;

import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class ComparableData {
    private final Boolean isAutoRenewing;
    private final String marketplace;
    private final String orderId;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List productIds;
    private final PurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final PurchaseType purchaseType;
    private final String signature;
    private final String storeUserID;
    private final String subscriptionOptionId;
    private final ProductType type;

    public ComparableData(String str, List list, ProductType productType, long j, String str2, PurchaseState purchaseState, Boolean bool, String str3, PresentedOfferingContext presentedOfferingContext, String str4, PurchaseType purchaseType, String str5, String str6) {
        t.g(list, "productIds");
        t.g(productType, "type");
        t.g(str2, "purchaseToken");
        t.g(purchaseState, "purchaseState");
        t.g(purchaseType, "purchaseType");
        this.orderId = str;
        this.productIds = list;
        this.type = productType;
        this.purchaseTime = j;
        this.purchaseToken = str2;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = bool;
        this.signature = str3;
        this.presentedOfferingContext = presentedOfferingContext;
        this.storeUserID = str4;
        this.purchaseType = purchaseType;
        this.marketplace = str5;
        this.subscriptionOptionId = str6;
    }

    public static /* synthetic */ ComparableData copy$default(ComparableData comparableData, String str, List list, ProductType productType, long j, String str2, PurchaseState purchaseState, Boolean bool, String str3, PresentedOfferingContext presentedOfferingContext, String str4, PurchaseType purchaseType, String str5, String str6, int i, Object obj) {
        return comparableData.copy((i & 1) != 0 ? comparableData.orderId : str, (i & 2) != 0 ? comparableData.productIds : list, (i & 4) != 0 ? comparableData.type : productType, (i & 8) != 0 ? comparableData.purchaseTime : j, (i & 16) != 0 ? comparableData.purchaseToken : str2, (i & 32) != 0 ? comparableData.purchaseState : purchaseState, (i & 64) != 0 ? comparableData.isAutoRenewing : bool, (i & 128) != 0 ? comparableData.signature : str3, (i & 256) != 0 ? comparableData.presentedOfferingContext : presentedOfferingContext, (i & 512) != 0 ? comparableData.storeUserID : str4, (i & 1024) != 0 ? comparableData.purchaseType : purchaseType, (i & 2048) != 0 ? comparableData.marketplace : str5, (i & 4096) != 0 ? comparableData.subscriptionOptionId : str6);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component10() {
        return this.storeUserID;
    }

    public final PurchaseType component11() {
        return this.purchaseType;
    }

    public final String component12() {
        return this.marketplace;
    }

    public final String component13() {
        return this.subscriptionOptionId;
    }

    public final List component2() {
        return this.productIds;
    }

    public final ProductType component3() {
        return this.type;
    }

    public final long component4() {
        return this.purchaseTime;
    }

    public final String component5() {
        return this.purchaseToken;
    }

    public final PurchaseState component6() {
        return this.purchaseState;
    }

    public final Boolean component7() {
        return this.isAutoRenewing;
    }

    public final String component8() {
        return this.signature;
    }

    public final PresentedOfferingContext component9() {
        return this.presentedOfferingContext;
    }

    public final ComparableData copy(String str, List list, ProductType productType, long j, String str2, PurchaseState purchaseState, Boolean bool, String str3, PresentedOfferingContext presentedOfferingContext, String str4, PurchaseType purchaseType, String str5, String str6) {
        t.g(list, "productIds");
        t.g(productType, "type");
        t.g(str2, "purchaseToken");
        t.g(purchaseState, "purchaseState");
        t.g(purchaseType, "purchaseType");
        return new ComparableData(str, list, productType, j, str2, purchaseState, bool, str3, presentedOfferingContext, str4, purchaseType, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableData)) {
            return false;
        }
        ComparableData comparableData = (ComparableData) obj;
        return t.c(this.orderId, comparableData.orderId) && t.c(this.productIds, comparableData.productIds) && this.type == comparableData.type && this.purchaseTime == comparableData.purchaseTime && t.c(this.purchaseToken, comparableData.purchaseToken) && this.purchaseState == comparableData.purchaseState && t.c(this.isAutoRenewing, comparableData.isAutoRenewing) && t.c(this.signature, comparableData.signature) && t.c(this.presentedOfferingContext, comparableData.presentedOfferingContext) && t.c(this.storeUserID, comparableData.storeUserID) && this.purchaseType == comparableData.purchaseType && t.c(this.marketplace, comparableData.marketplace) && t.c(this.subscriptionOptionId, comparableData.subscriptionOptionId);
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final List getProductIds() {
        return this.productIds;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.orderId;
        int hashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + this.productIds.hashCode()) * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.purchaseTime)) * 31) + this.purchaseToken.hashCode()) * 31) + this.purchaseState.hashCode()) * 31;
        Boolean bool = this.isAutoRenewing;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.signature;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int hashCode4 = (hashCode3 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        String str3 = this.storeUserID;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.purchaseType.hashCode()) * 31;
        String str4 = this.marketplace;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subscriptionOptionId;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return "ComparableData(orderId=" + this.orderId + ", productIds=" + this.productIds + ", type=" + this.type + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", purchaseState=" + this.purchaseState + ", isAutoRenewing=" + this.isAutoRenewing + ", signature=" + this.signature + ", presentedOfferingContext=" + this.presentedOfferingContext + ", storeUserID=" + this.storeUserID + ", purchaseType=" + this.purchaseType + ", marketplace=" + this.marketplace + ", subscriptionOptionId=" + this.subscriptionOptionId + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparableData(StoreTransaction storeTransaction) {
        this(storeTransaction.getOrderId(), storeTransaction.getProductIds(), storeTransaction.getType(), storeTransaction.getPurchaseTime(), storeTransaction.getPurchaseToken(), storeTransaction.getPurchaseState(), storeTransaction.isAutoRenewing(), storeTransaction.getSignature(), storeTransaction.getPresentedOfferingContext(), storeTransaction.getStoreUserID(), storeTransaction.getPurchaseType(), storeTransaction.getMarketplace(), storeTransaction.getSubscriptionOptionId());
        t.g(storeTransaction, "storeTransaction");
    }
}

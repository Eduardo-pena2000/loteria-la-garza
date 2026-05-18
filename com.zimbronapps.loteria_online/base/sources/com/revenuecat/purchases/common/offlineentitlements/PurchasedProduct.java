package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasedProduct {
    private final String basePlanId;
    private final List entitlements;
    private final Date expiresDate;
    private final String productIdentifier;
    private final StoreTransaction storeTransaction;

    public PurchasedProduct(String str, String str2, StoreTransaction storeTransaction, List list, Date date) {
        t.g(str, "productIdentifier");
        t.g(storeTransaction, "storeTransaction");
        t.g(list, "entitlements");
        this.productIdentifier = str;
        this.basePlanId = str2;
        this.storeTransaction = storeTransaction;
        this.entitlements = list;
        this.expiresDate = date;
    }

    public static /* synthetic */ PurchasedProduct copy$default(PurchasedProduct purchasedProduct, String str, String str2, StoreTransaction storeTransaction, List list, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchasedProduct.productIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = purchasedProduct.basePlanId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            storeTransaction = purchasedProduct.storeTransaction;
        }
        StoreTransaction storeTransaction2 = storeTransaction;
        if ((i & 8) != 0) {
            list = purchasedProduct.entitlements;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            date = purchasedProduct.expiresDate;
        }
        return purchasedProduct.copy(str, str3, storeTransaction2, list2, date);
    }

    public final String component1() {
        return this.productIdentifier;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final StoreTransaction component3() {
        return this.storeTransaction;
    }

    public final List component4() {
        return this.entitlements;
    }

    public final Date component5() {
        return this.expiresDate;
    }

    public final PurchasedProduct copy(String str, String str2, StoreTransaction storeTransaction, List list, Date date) {
        t.g(str, "productIdentifier");
        t.g(storeTransaction, "storeTransaction");
        t.g(list, "entitlements");
        return new PurchasedProduct(str, str2, storeTransaction, list, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasedProduct)) {
            return false;
        }
        PurchasedProduct purchasedProduct = (PurchasedProduct) obj;
        return t.c(this.productIdentifier, purchasedProduct.productIdentifier) && t.c(this.basePlanId, purchasedProduct.basePlanId) && t.c(this.storeTransaction, purchasedProduct.storeTransaction) && t.c(this.entitlements, purchasedProduct.entitlements) && t.c(this.expiresDate, purchasedProduct.expiresDate);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final List getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpiresDate() {
        return this.expiresDate;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    public int hashCode() {
        int hashCode = this.productIdentifier.hashCode() * 31;
        String str = this.basePlanId;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.storeTransaction.hashCode()) * 31) + this.entitlements.hashCode()) * 31;
        Date date = this.expiresDate;
        return hashCode2 + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        return "PurchasedProduct(productIdentifier=" + this.productIdentifier + ", basePlanId=" + this.basePlanId + ", storeTransaction=" + this.storeTransaction + ", entitlements=" + this.entitlements + ", expiresDate=" + this.expiresDate + ')';
    }
}

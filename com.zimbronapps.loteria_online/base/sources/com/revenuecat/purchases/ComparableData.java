package com.revenuecat.purchases;

import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class ComparableData {
    private final Map allExpirationDatesByProduct;
    private final Map allPurchaseDatesByProduct;
    private final EntitlementInfos entitlements;
    private final Date firstSeen;
    private final String originalAppUserId;
    private final Date originalPurchaseDate;
    private final int schemaVersion;

    public ComparableData(EntitlementInfos entitlementInfos, Map map, Map map2, int i, Date date, String str, Date date2) {
        t.g(entitlementInfos, "entitlements");
        t.g(map, "allExpirationDatesByProduct");
        t.g(map2, "allPurchaseDatesByProduct");
        t.g(date, "firstSeen");
        t.g(str, "originalAppUserId");
        this.entitlements = entitlementInfos;
        this.allExpirationDatesByProduct = map;
        this.allPurchaseDatesByProduct = map2;
        this.schemaVersion = i;
        this.firstSeen = date;
        this.originalAppUserId = str;
        this.originalPurchaseDate = date2;
    }

    public static /* synthetic */ ComparableData copy$default(ComparableData comparableData, EntitlementInfos entitlementInfos, Map map, Map map2, int i, Date date, String str, Date date2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            entitlementInfos = comparableData.entitlements;
        }
        if ((i2 & 2) != 0) {
            map = comparableData.allExpirationDatesByProduct;
        }
        Map map3 = map;
        if ((i2 & 4) != 0) {
            map2 = comparableData.allPurchaseDatesByProduct;
        }
        Map map4 = map2;
        if ((i2 & 8) != 0) {
            i = comparableData.schemaVersion;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            date = comparableData.firstSeen;
        }
        Date date3 = date;
        if ((i2 & 32) != 0) {
            str = comparableData.originalAppUserId;
        }
        String str2 = str;
        if ((i2 & 64) != 0) {
            date2 = comparableData.originalPurchaseDate;
        }
        return comparableData.copy(entitlementInfos, map3, map4, i3, date3, str2, date2);
    }

    public final EntitlementInfos component1() {
        return this.entitlements;
    }

    public final Map component2() {
        return this.allExpirationDatesByProduct;
    }

    public final Map component3() {
        return this.allPurchaseDatesByProduct;
    }

    public final int component4() {
        return this.schemaVersion;
    }

    public final Date component5() {
        return this.firstSeen;
    }

    public final String component6() {
        return this.originalAppUserId;
    }

    public final Date component7() {
        return this.originalPurchaseDate;
    }

    public final ComparableData copy(EntitlementInfos entitlementInfos, Map map, Map map2, int i, Date date, String str, Date date2) {
        t.g(entitlementInfos, "entitlements");
        t.g(map, "allExpirationDatesByProduct");
        t.g(map2, "allPurchaseDatesByProduct");
        t.g(date, "firstSeen");
        t.g(str, "originalAppUserId");
        return new ComparableData(entitlementInfos, map, map2, i, date, str, date2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableData)) {
            return false;
        }
        ComparableData comparableData = (ComparableData) obj;
        return t.c(this.entitlements, comparableData.entitlements) && t.c(this.allExpirationDatesByProduct, comparableData.allExpirationDatesByProduct) && t.c(this.allPurchaseDatesByProduct, comparableData.allPurchaseDatesByProduct) && this.schemaVersion == comparableData.schemaVersion && t.c(this.firstSeen, comparableData.firstSeen) && t.c(this.originalAppUserId, comparableData.originalAppUserId) && t.c(this.originalPurchaseDate, comparableData.originalPurchaseDate);
    }

    public final Map getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final Map getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.entitlements.hashCode() * 31) + this.allExpirationDatesByProduct.hashCode()) * 31) + this.allPurchaseDatesByProduct.hashCode()) * 31) + Integer.hashCode(this.schemaVersion)) * 31) + this.firstSeen.hashCode()) * 31) + this.originalAppUserId.hashCode()) * 31;
        Date date = this.originalPurchaseDate;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "ComparableData(entitlements=" + this.entitlements + ", allExpirationDatesByProduct=" + this.allExpirationDatesByProduct + ", allPurchaseDatesByProduct=" + this.allPurchaseDatesByProduct + ", schemaVersion=" + this.schemaVersion + ", firstSeen=" + this.firstSeen + ", originalAppUserId=" + this.originalAppUserId + ", originalPurchaseDate=" + this.originalPurchaseDate + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparableData(CustomerInfo customerInfo) {
        this(customerInfo.getEntitlements(), customerInfo.getAllExpirationDatesByProduct(), customerInfo.getAllPurchaseDatesByProduct(), customerInfo.getSchemaVersion(), customerInfo.getFirstSeen(), customerInfo.getOriginalAppUserId(), customerInfo.getOriginalPurchaseDate());
        t.g(customerInfo, "customerInfo");
    }
}

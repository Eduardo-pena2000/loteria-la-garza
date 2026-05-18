package com.revenuecat.purchases.hybridcommon;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class CommonPurchaseParams {
    private final List addOnPackages;
    private final List addOnStoreProducts;
    private final List addOnSubscriptionOptions;
    private final Boolean googleIsPersonalizedPrice;
    private final String googleOldProductId;
    private final Integer googleReplacementMode;
    private final Map presentedOfferingContext;
    private final PurchasableItem purchasableItem;

    public CommonPurchaseParams(PurchasableItem purchasableItem, String str, Integer num, Boolean bool, Map map, List list, List list2, List list3) {
        t.g(purchasableItem, "purchasableItem");
        this.purchasableItem = purchasableItem;
        this.googleOldProductId = str;
        this.googleReplacementMode = num;
        this.googleIsPersonalizedPrice = bool;
        this.presentedOfferingContext = map;
        this.addOnStoreProducts = list;
        this.addOnSubscriptionOptions = list2;
        this.addOnPackages = list3;
    }

    public static /* synthetic */ CommonPurchaseParams copy$default(CommonPurchaseParams commonPurchaseParams, PurchasableItem purchasableItem, String str, Integer num, Boolean bool, Map map, List list, List list2, List list3, int i, Object obj) {
        return commonPurchaseParams.copy((i & 1) != 0 ? commonPurchaseParams.purchasableItem : purchasableItem, (i & 2) != 0 ? commonPurchaseParams.googleOldProductId : str, (i & 4) != 0 ? commonPurchaseParams.googleReplacementMode : num, (i & 8) != 0 ? commonPurchaseParams.googleIsPersonalizedPrice : bool, (i & 16) != 0 ? commonPurchaseParams.presentedOfferingContext : map, (i & 32) != 0 ? commonPurchaseParams.addOnStoreProducts : list, (i & 64) != 0 ? commonPurchaseParams.addOnSubscriptionOptions : list2, (i & 128) != 0 ? commonPurchaseParams.addOnPackages : list3);
    }

    public final PurchasableItem component1() {
        return this.purchasableItem;
    }

    public final String component2() {
        return this.googleOldProductId;
    }

    public final Integer component3() {
        return this.googleReplacementMode;
    }

    public final Boolean component4() {
        return this.googleIsPersonalizedPrice;
    }

    public final Map component5() {
        return this.presentedOfferingContext;
    }

    public final List component6() {
        return this.addOnStoreProducts;
    }

    public final List component7() {
        return this.addOnSubscriptionOptions;
    }

    public final List component8() {
        return this.addOnPackages;
    }

    public final CommonPurchaseParams copy(PurchasableItem purchasableItem, String str, Integer num, Boolean bool, Map map, List list, List list2, List list3) {
        t.g(purchasableItem, "purchasableItem");
        return new CommonPurchaseParams(purchasableItem, str, num, bool, map, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonPurchaseParams)) {
            return false;
        }
        CommonPurchaseParams commonPurchaseParams = (CommonPurchaseParams) obj;
        return t.c(this.purchasableItem, commonPurchaseParams.purchasableItem) && t.c(this.googleOldProductId, commonPurchaseParams.googleOldProductId) && t.c(this.googleReplacementMode, commonPurchaseParams.googleReplacementMode) && t.c(this.googleIsPersonalizedPrice, commonPurchaseParams.googleIsPersonalizedPrice) && t.c(this.presentedOfferingContext, commonPurchaseParams.presentedOfferingContext) && t.c(this.addOnStoreProducts, commonPurchaseParams.addOnStoreProducts) && t.c(this.addOnSubscriptionOptions, commonPurchaseParams.addOnSubscriptionOptions) && t.c(this.addOnPackages, commonPurchaseParams.addOnPackages);
    }

    public final List getAddOnPackages() {
        return this.addOnPackages;
    }

    public final List getAddOnStoreProducts() {
        return this.addOnStoreProducts;
    }

    public final List getAddOnSubscriptionOptions() {
        return this.addOnSubscriptionOptions;
    }

    public final Boolean getGoogleIsPersonalizedPrice() {
        return this.googleIsPersonalizedPrice;
    }

    public final String getGoogleOldProductId() {
        return this.googleOldProductId;
    }

    public final Integer getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final Map getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final PurchasableItem getPurchasableItem() {
        return this.purchasableItem;
    }

    public int hashCode() {
        int hashCode = this.purchasableItem.hashCode() * 31;
        String str = this.googleOldProductId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.googleReplacementMode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.googleIsPersonalizedPrice;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map map = this.presentedOfferingContext;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        List list = this.addOnStoreProducts;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.addOnSubscriptionOptions;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.addOnPackages;
        return hashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "CommonPurchaseParams(purchasableItem=" + this.purchasableItem + ", googleOldProductId=" + this.googleOldProductId + ", googleReplacementMode=" + this.googleReplacementMode + ", googleIsPersonalizedPrice=" + this.googleIsPersonalizedPrice + ", presentedOfferingContext=" + this.presentedOfferingContext + ", addOnStoreProducts=" + this.addOnStoreProducts + ", addOnSubscriptionOptions=" + this.addOnSubscriptionOptions + ", addOnPackages=" + this.addOnPackages + ')';
    }
}

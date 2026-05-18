package com.revenuecat.purchases.ui.revenuecatui.utils;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.PurchasingData;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PreviewPurchasingData implements PurchasingData {
    public static final int $stable = 0;
    private final String productId;

    public PreviewPurchasingData(String productId) {
        t.g(productId, "productId");
        this.productId = productId;
    }

    public static /* synthetic */ PreviewPurchasingData copy$default(PreviewPurchasingData previewPurchasingData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previewPurchasingData.productId;
        }
        return previewPurchasingData.copy(str);
    }

    public final String component1() {
        return this.productId;
    }

    public final PreviewPurchasingData copy(String productId) {
        t.g(productId, "productId");
        return new PreviewPurchasingData(productId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreviewPurchasingData) && t.c(this.productId, ((PreviewPurchasingData) obj).productId);
    }

    public /* synthetic */ String getProductId() {
        return this.productId;
    }

    public /* synthetic */ ProductType getProductType() {
        return ProductType.SUBS;
    }

    public int hashCode() {
        return this.productId.hashCode();
    }

    public String toString() {
        return "PreviewPurchasingData(productId=" + this.productId + ')';
    }
}

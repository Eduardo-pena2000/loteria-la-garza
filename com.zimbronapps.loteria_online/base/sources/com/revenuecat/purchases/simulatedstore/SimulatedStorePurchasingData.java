package com.revenuecat.purchases.simulatedstore;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SimulatedStorePurchasingData implements PurchasingData {
    private final String productId;
    private final ProductType productType;
    private final StoreProduct storeProduct;

    public SimulatedStorePurchasingData(String str, ProductType productType, StoreProduct storeProduct) {
        t.g(str, "productId");
        t.g(productType, "productType");
        t.g(storeProduct, "storeProduct");
        this.productId = str;
        this.productType = productType;
        this.storeProduct = storeProduct;
    }

    public static /* synthetic */ SimulatedStorePurchasingData copy$default(SimulatedStorePurchasingData simulatedStorePurchasingData, String str, ProductType productType, StoreProduct storeProduct, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simulatedStorePurchasingData.productId;
        }
        if ((i & 2) != 0) {
            productType = simulatedStorePurchasingData.productType;
        }
        if ((i & 4) != 0) {
            storeProduct = simulatedStorePurchasingData.storeProduct;
        }
        return simulatedStorePurchasingData.copy(str, productType, storeProduct);
    }

    public final String component1() {
        return this.productId;
    }

    public final ProductType component2() {
        return this.productType;
    }

    public final StoreProduct component3() {
        return this.storeProduct;
    }

    public final SimulatedStorePurchasingData copy(String str, ProductType productType, StoreProduct storeProduct) {
        t.g(str, "productId");
        t.g(productType, "productType");
        t.g(storeProduct, "storeProduct");
        return new SimulatedStorePurchasingData(str, productType, storeProduct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimulatedStorePurchasingData)) {
            return false;
        }
        SimulatedStorePurchasingData simulatedStorePurchasingData = (SimulatedStorePurchasingData) obj;
        return t.c(this.productId, simulatedStorePurchasingData.productId) && this.productType == simulatedStorePurchasingData.productType && t.c(this.storeProduct, simulatedStorePurchasingData.storeProduct);
    }

    public String getProductId() {
        return this.productId;
    }

    public ProductType getProductType() {
        return this.productType;
    }

    public final StoreProduct getStoreProduct() {
        return this.storeProduct;
    }

    public int hashCode() {
        return (((this.productId.hashCode() * 31) + this.productType.hashCode()) * 31) + this.storeProduct.hashCode();
    }

    public String toString() {
        return "SimulatedStorePurchasingData(productId=" + this.productId + ", productType=" + this.productType + ", storeProduct=" + this.storeProduct + ')';
    }
}

package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.PurchasingData;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class AmazonPurchasingData implements PurchasingData {

    public static final class Product extends AmazonPurchasingData {
        private final AmazonStoreProduct storeProduct;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Product(AmazonStoreProduct amazonStoreProduct) {
            super(null);
            t.g(amazonStoreProduct, "storeProduct");
            this.storeProduct = amazonStoreProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Product) && t.c(this.storeProduct, ((Product) obj).storeProduct);
        }

        public String getProductId() {
            return this.storeProduct.getId();
        }

        public ProductType getProductType() {
            return this.storeProduct.getType();
        }

        public final AmazonStoreProduct getStoreProduct() {
            return this.storeProduct;
        }

        public int hashCode() {
            return this.storeProduct.hashCode();
        }

        public String toString() {
            return "Product(storeProduct=" + this.storeProduct + ')';
        }
    }

    public /* synthetic */ AmazonPurchasingData(k kVar) {
        this();
    }

    private AmazonPurchasingData() {
    }
}

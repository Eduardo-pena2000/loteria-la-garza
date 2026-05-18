package com.revenuecat.purchases.models;

import Ca.o;
import com.android.billingclient.api.ProductDetails;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.ProductType;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class GooglePurchasingData implements PurchasingData {

    public static final class InAppProduct extends GooglePurchasingData {
        private final ProductDetails productDetails;
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppProduct(String str, ProductDetails productDetails) {
            super(null);
            t.g(str, "productId");
            t.g(productDetails, "productDetails");
            this.productId = str;
            this.productDetails = productDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) obj;
            return t.c(this.productId, inAppProduct.productId) && t.c(this.productDetails, inAppProduct.productDetails);
        }

        public final ProductDetails getProductDetails() {
            return this.productDetails;
        }

        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return (this.productId.hashCode() * 31) + this.productDetails.hashCode();
        }

        public String toString() {
            return "InAppProduct(productId=" + this.productId + ", productDetails=" + this.productDetails + ')';
        }
    }

    public static final class Subscription extends GooglePurchasingData {
        private final List addOnProducts;
        private final Period billingPeriod;
        private final String optionId;
        private final ProductDetails productDetails;
        private final String productId;
        private final String token;

        public /* synthetic */ Subscription(String str, String str2, ProductDetails productDetails, String str3, Period period, List list, int i, k kVar) {
            this(str, str2, productDetails, str3, (i & 16) != 0 ? null : period, (i & 32) != 0 ? null : list);
        }

        @ExperimentalPreviewRevenueCatPurchasesAPI
        public static /* synthetic */ void getAddOnProducts$annotations() {
        }

        @ExperimentalPreviewRevenueCatPurchasesAPI
        public static /* synthetic */ void getBillingPeriod$annotations() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return t.c(this.productId, subscription.productId) && t.c(this.optionId, subscription.optionId) && t.c(this.productDetails, subscription.productDetails) && t.c(this.token, subscription.token) && t.c(this.billingPeriod, subscription.billingPeriod) && t.c(this.addOnProducts, subscription.addOnProducts);
        }

        public final /* synthetic */ List getAddOnProducts() {
            return this.addOnProducts;
        }

        public final /* synthetic */ Period getBillingPeriod() {
            return this.billingPeriod;
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final ProductDetails getProductDetails() {
            return this.productDetails;
        }

        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            int hashCode = ((((((this.productId.hashCode() * 31) + this.optionId.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.token.hashCode()) * 31;
            Period period = this.billingPeriod;
            int hashCode2 = (hashCode + (period == null ? 0 : period.hashCode())) * 31;
            List list = this.addOnProducts;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Subscription(productId=" + this.productId + ", optionId=" + this.optionId + ", productDetails=" + this.productDetails + ", token=" + this.token + ", billingPeriod=" + this.billingPeriod + ", addOnProducts=" + this.addOnProducts + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ExperimentalPreviewRevenueCatPurchasesAPI
        public Subscription(String str, String str2, ProductDetails productDetails, String str3, Period period, List list) {
            super(null);
            t.g(str, "productId");
            t.g(str2, "optionId");
            t.g(productDetails, "productDetails");
            t.g(str3, "token");
            this.productId = str;
            this.optionId = str2;
            this.productDetails = productDetails;
            this.token = str3;
            this.billingPeriod = period;
            this.addOnProducts = list;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Subscription(String str, String str2, ProductDetails productDetails, String str3) {
            this(str, str2, productDetails, str3, null, null);
            t.g(str, "productId");
            t.g(str2, "optionId");
            t.g(productDetails, "productDetails");
            t.g(str3, "token");
        }
    }

    public /* synthetic */ GooglePurchasingData(k kVar) {
        this();
    }

    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new o();
    }

    private GooglePurchasingData() {
    }
}

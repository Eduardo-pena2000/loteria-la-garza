package com.revenuecat.purchases.hybridcommon;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
interface PurchasableItem {

    public static final class Package implements PurchasableItem {
        private final String packageIdentifier;

        public Package(String str) {
            t.g(str, "packageIdentifier");
            this.packageIdentifier = str;
        }

        public static /* synthetic */ Package copy$default(Package r0, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.packageIdentifier;
            }
            return r0.copy(str);
        }

        public final String component1() {
            return this.packageIdentifier;
        }

        public final Package copy(String str) {
            t.g(str, "packageIdentifier");
            return new Package(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Package) && t.c(this.packageIdentifier, ((Package) obj).packageIdentifier);
        }

        public final String getPackageIdentifier() {
            return this.packageIdentifier;
        }

        public int hashCode() {
            return this.packageIdentifier.hashCode();
        }

        public String toString() {
            return "Package(packageIdentifier=" + this.packageIdentifier + ')';
        }
    }

    public static final class Product implements PurchasableItem {
        private final String googleBasePlanId;
        private final String productIdentifier;
        private final String type;

        public Product(String str, String str2, String str3) {
            t.g(str, "productIdentifier");
            t.g(str2, "type");
            this.productIdentifier = str;
            this.type = str2;
            this.googleBasePlanId = str3;
        }

        public static /* synthetic */ Product copy$default(Product product, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = product.productIdentifier;
            }
            if ((i & 2) != 0) {
                str2 = product.type;
            }
            if ((i & 4) != 0) {
                str3 = product.googleBasePlanId;
            }
            return product.copy(str, str2, str3);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final String component2() {
            return this.type;
        }

        public final String component3() {
            return this.googleBasePlanId;
        }

        public final Product copy(String str, String str2, String str3) {
            t.g(str, "productIdentifier");
            t.g(str2, "type");
            return new Product(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return t.c(this.productIdentifier, product.productIdentifier) && t.c(this.type, product.type) && t.c(this.googleBasePlanId, product.googleBasePlanId);
        }

        public final String getGoogleBasePlanId() {
            return this.googleBasePlanId;
        }

        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = ((this.productIdentifier.hashCode() * 31) + this.type.hashCode()) * 31;
            String str = this.googleBasePlanId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Product(productIdentifier=" + this.productIdentifier + ", type=" + this.type + ", googleBasePlanId=" + this.googleBasePlanId + ')';
        }
    }

    public static final class SubscriptionOption implements PurchasableItem {
        private final String optionIdentifier;
        private final String productIdentifier;

        public SubscriptionOption(String str, String str2) {
            t.g(str, "productIdentifier");
            t.g(str2, "optionIdentifier");
            this.productIdentifier = str;
            this.optionIdentifier = str2;
        }

        public static /* synthetic */ SubscriptionOption copy$default(SubscriptionOption subscriptionOption, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscriptionOption.productIdentifier;
            }
            if ((i & 2) != 0) {
                str2 = subscriptionOption.optionIdentifier;
            }
            return subscriptionOption.copy(str, str2);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final String component2() {
            return this.optionIdentifier;
        }

        public final SubscriptionOption copy(String str, String str2) {
            t.g(str, "productIdentifier");
            t.g(str2, "optionIdentifier");
            return new SubscriptionOption(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubscriptionOption)) {
                return false;
            }
            SubscriptionOption subscriptionOption = (SubscriptionOption) obj;
            return t.c(this.productIdentifier, subscriptionOption.productIdentifier) && t.c(this.optionIdentifier, subscriptionOption.optionIdentifier);
        }

        public final String getOptionIdentifier() {
            return this.optionIdentifier;
        }

        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        public int hashCode() {
            return (this.productIdentifier.hashCode() * 31) + this.optionIdentifier.hashCode();
        }

        public String toString() {
            return "SubscriptionOption(productIdentifier=" + this.productIdentifier + ", optionIdentifier=" + this.optionIdentifier + ')';
        }
    }
}

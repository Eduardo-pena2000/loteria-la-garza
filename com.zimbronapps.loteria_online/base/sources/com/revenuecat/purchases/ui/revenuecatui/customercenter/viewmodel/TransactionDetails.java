package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import android.net.Uri;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.models.Price;
import java.util.Date;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class TransactionDetails {
    public static final int $stable = 0;
    private final boolean isSandbox;
    private final Price price;
    private final String productIdentifier;
    private final Store store;

    public static final class NonSubscription extends TransactionDetails {
        public static final int $stable = 0;
        private final boolean isSandbox;
        private final Price price;
        private final String productIdentifier;
        private final Store store;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonSubscription(String productIdentifier, Store store, Price price, boolean z) {
            super(productIdentifier, store, price, z, null);
            t.g(productIdentifier, "productIdentifier");
            t.g(store, "store");
            this.productIdentifier = productIdentifier;
            this.store = store;
            this.price = price;
            this.isSandbox = z;
        }

        public static /* synthetic */ NonSubscription copy$default(NonSubscription nonSubscription, String str, Store store, Price price, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nonSubscription.productIdentifier;
            }
            if ((i & 2) != 0) {
                store = nonSubscription.store;
            }
            if ((i & 4) != 0) {
                price = nonSubscription.price;
            }
            if ((i & 8) != 0) {
                z = nonSubscription.isSandbox;
            }
            return nonSubscription.copy(str, store, price, z);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final Store component2() {
            return this.store;
        }

        public final Price component3() {
            return this.price;
        }

        public final boolean component4() {
            return this.isSandbox;
        }

        public final NonSubscription copy(String productIdentifier, Store store, Price price, boolean z) {
            t.g(productIdentifier, "productIdentifier");
            t.g(store, "store");
            return new NonSubscription(productIdentifier, store, price, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NonSubscription)) {
                return false;
            }
            NonSubscription nonSubscription = (NonSubscription) obj;
            return t.c(this.productIdentifier, nonSubscription.productIdentifier) && this.store == nonSubscription.store && t.c(this.price, nonSubscription.price) && this.isSandbox == nonSubscription.isSandbox;
        }

        public Price getPrice() {
            return this.price;
        }

        public String getProductIdentifier() {
            return this.productIdentifier;
        }

        public Store getStore() {
            return this.store;
        }

        public int hashCode() {
            int hashCode = ((this.productIdentifier.hashCode() * 31) + this.store.hashCode()) * 31;
            Price price = this.price;
            return ((hashCode + (price == null ? 0 : price.hashCode())) * 31) + Boolean.hashCode(this.isSandbox);
        }

        public boolean isSandbox() {
            return this.isSandbox;
        }

        public String toString() {
            return "NonSubscription(productIdentifier=" + this.productIdentifier + ", store=" + this.store + ", price=" + this.price + ", isSandbox=" + this.isSandbox + ')';
        }
    }

    public static final class Subscription extends TransactionDetails {
        public static final int $stable = 0;
        private final Date expiresDate;
        private final boolean isActive;
        private final boolean isSandbox;
        private final boolean isTrial;
        private final Uri managementURL;
        private final Price price;
        private final String productIdentifier;
        private final String productPlanIdentifier;
        private final Store store;
        private final boolean willRenew;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(String productIdentifier, String str, Store store, boolean z, boolean z2, Date date, boolean z3, Uri uri, Price price, boolean z4) {
            super(productIdentifier, store, price, z4, null);
            t.g(productIdentifier, "productIdentifier");
            t.g(store, "store");
            this.productIdentifier = productIdentifier;
            this.productPlanIdentifier = str;
            this.store = store;
            this.isActive = z;
            this.willRenew = z2;
            this.expiresDate = date;
            this.isTrial = z3;
            this.managementURL = uri;
            this.price = price;
            this.isSandbox = z4;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, Store store, boolean z, boolean z2, Date date, boolean z3, Uri uri, Price price, boolean z4, int i, Object obj) {
            return subscription.copy((i & 1) != 0 ? subscription.productIdentifier : str, (i & 2) != 0 ? subscription.productPlanIdentifier : str2, (i & 4) != 0 ? subscription.store : store, (i & 8) != 0 ? subscription.isActive : z, (i & 16) != 0 ? subscription.willRenew : z2, (i & 32) != 0 ? subscription.expiresDate : date, (i & 64) != 0 ? subscription.isTrial : z3, (i & 128) != 0 ? subscription.managementURL : uri, (i & 256) != 0 ? subscription.price : price, (i & 512) != 0 ? subscription.isSandbox : z4);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final boolean component10() {
            return this.isSandbox;
        }

        public final String component2() {
            return this.productPlanIdentifier;
        }

        public final Store component3() {
            return this.store;
        }

        public final boolean component4() {
            return this.isActive;
        }

        public final boolean component5() {
            return this.willRenew;
        }

        public final Date component6() {
            return this.expiresDate;
        }

        public final boolean component7() {
            return this.isTrial;
        }

        public final Uri component8() {
            return this.managementURL;
        }

        public final Price component9() {
            return this.price;
        }

        public final Subscription copy(String productIdentifier, String str, Store store, boolean z, boolean z2, Date date, boolean z3, Uri uri, Price price, boolean z4) {
            t.g(productIdentifier, "productIdentifier");
            t.g(store, "store");
            return new Subscription(productIdentifier, str, store, z, z2, date, z3, uri, price, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return t.c(this.productIdentifier, subscription.productIdentifier) && t.c(this.productPlanIdentifier, subscription.productPlanIdentifier) && this.store == subscription.store && this.isActive == subscription.isActive && this.willRenew == subscription.willRenew && t.c(this.expiresDate, subscription.expiresDate) && this.isTrial == subscription.isTrial && t.c(this.managementURL, subscription.managementURL) && t.c(this.price, subscription.price) && this.isSandbox == subscription.isSandbox;
        }

        public final Date getExpiresDate() {
            return this.expiresDate;
        }

        public final Uri getManagementURL() {
            return this.managementURL;
        }

        public Price getPrice() {
            return this.price;
        }

        public String getProductIdentifier() {
            return this.productIdentifier;
        }

        public final String getProductPlanIdentifier() {
            return this.productPlanIdentifier;
        }

        public Store getStore() {
            return this.store;
        }

        public final boolean getWillRenew() {
            return this.willRenew;
        }

        public int hashCode() {
            int hashCode = this.productIdentifier.hashCode() * 31;
            String str = this.productPlanIdentifier;
            int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.willRenew)) * 31;
            Date date = this.expiresDate;
            int hashCode3 = (((hashCode2 + (date == null ? 0 : date.hashCode())) * 31) + Boolean.hashCode(this.isTrial)) * 31;
            Uri uri = this.managementURL;
            int hashCode4 = (hashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
            Price price = this.price;
            return ((hashCode4 + (price != null ? price.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSandbox);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public boolean isSandbox() {
            return this.isSandbox;
        }

        public final boolean isTrial() {
            return this.isTrial;
        }

        public String toString() {
            return "Subscription(productIdentifier=" + this.productIdentifier + ", productPlanIdentifier=" + this.productPlanIdentifier + ", store=" + this.store + ", isActive=" + this.isActive + ", willRenew=" + this.willRenew + ", expiresDate=" + this.expiresDate + ", isTrial=" + this.isTrial + ", managementURL=" + this.managementURL + ", price=" + this.price + ", isSandbox=" + this.isSandbox + ')';
        }
    }

    public /* synthetic */ TransactionDetails(String str, Store store, Price price, boolean z, k kVar) {
        this(str, store, price, z);
    }

    public Price getPrice() {
        return this.price;
    }

    public String getProductIdentifier() {
        return this.productIdentifier;
    }

    public Store getStore() {
        return this.store;
    }

    public boolean isSandbox() {
        return this.isSandbox;
    }

    private TransactionDetails(String str, Store store, Price price, boolean z) {
        this.productIdentifier = str;
        this.store = store;
        this.price = price;
        this.isSandbox = z;
    }
}

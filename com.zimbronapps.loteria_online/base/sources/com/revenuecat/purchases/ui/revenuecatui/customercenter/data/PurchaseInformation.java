package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Ca.o;
import Za.B;
import android.net.Uri;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PriceDetails;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails;
import com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter;
import com.revenuecat.purchases.ui.revenuecatui.utils.DefaultDateFormatter;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseInformation {
    public static final int $stable = 8;
    private final ExpirationOrRenewal expirationOrRenewal;
    private final boolean isCancelled;
    private final boolean isExpired;
    private final boolean isLifetime;
    private boolean isSubscription;
    private final boolean isTrial;
    private final Uri managementURL;
    private final PriceDetails pricePaid;
    private final StoreProduct product;
    private final Store store;
    private final String title;

    public PurchaseInformation(String str, PriceDetails pricePaid, ExpirationOrRenewal expirationOrRenewal, StoreProduct storeProduct, Store store, boolean z, Uri uri, boolean z2, boolean z3, boolean z4, boolean z5) {
        t.g(pricePaid, "pricePaid");
        t.g(store, "store");
        this.title = str;
        this.pricePaid = pricePaid;
        this.expirationOrRenewal = expirationOrRenewal;
        this.product = storeProduct;
        this.store = store;
        this.isSubscription = z;
        this.managementURL = uri;
        this.isExpired = z2;
        this.isTrial = z3;
        this.isCancelled = z4;
        this.isLifetime = z5;
    }

    public static /* synthetic */ PurchaseInformation copy$default(PurchaseInformation purchaseInformation, String str, PriceDetails priceDetails, ExpirationOrRenewal expirationOrRenewal, StoreProduct storeProduct, Store store, boolean z, Uri uri, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        return purchaseInformation.copy((i & 1) != 0 ? purchaseInformation.title : str, (i & 2) != 0 ? purchaseInformation.pricePaid : priceDetails, (i & 4) != 0 ? purchaseInformation.expirationOrRenewal : expirationOrRenewal, (i & 8) != 0 ? purchaseInformation.product : storeProduct, (i & 16) != 0 ? purchaseInformation.store : store, (i & 32) != 0 ? purchaseInformation.isSubscription : z, (i & 64) != 0 ? purchaseInformation.managementURL : uri, (i & 128) != 0 ? purchaseInformation.isExpired : z2, (i & 256) != 0 ? purchaseInformation.isTrial : z3, (i & 512) != 0 ? purchaseInformation.isCancelled : z4, (i & 1024) != 0 ? purchaseInformation.isLifetime : z5);
    }

    public final String component1() {
        return this.title;
    }

    public final boolean component10() {
        return this.isCancelled;
    }

    public final boolean component11() {
        return this.isLifetime;
    }

    public final PriceDetails component2() {
        return this.pricePaid;
    }

    public final ExpirationOrRenewal component3() {
        return this.expirationOrRenewal;
    }

    public final StoreProduct component4() {
        return this.product;
    }

    public final Store component5() {
        return this.store;
    }

    public final boolean component6() {
        return this.isSubscription;
    }

    public final Uri component7() {
        return this.managementURL;
    }

    public final boolean component8() {
        return this.isExpired;
    }

    public final boolean component9() {
        return this.isTrial;
    }

    public final PurchaseInformation copy(String str, PriceDetails pricePaid, ExpirationOrRenewal expirationOrRenewal, StoreProduct storeProduct, Store store, boolean z, Uri uri, boolean z2, boolean z3, boolean z4, boolean z5) {
        t.g(pricePaid, "pricePaid");
        t.g(store, "store");
        return new PurchaseInformation(str, pricePaid, expirationOrRenewal, storeProduct, store, z, uri, z2, z3, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseInformation)) {
            return false;
        }
        PurchaseInformation purchaseInformation = (PurchaseInformation) obj;
        return t.c(this.title, purchaseInformation.title) && t.c(this.pricePaid, purchaseInformation.pricePaid) && t.c(this.expirationOrRenewal, purchaseInformation.expirationOrRenewal) && t.c(this.product, purchaseInformation.product) && this.store == purchaseInformation.store && this.isSubscription == purchaseInformation.isSubscription && t.c(this.managementURL, purchaseInformation.managementURL) && this.isExpired == purchaseInformation.isExpired && this.isTrial == purchaseInformation.isTrial && this.isCancelled == purchaseInformation.isCancelled && this.isLifetime == purchaseInformation.isLifetime;
    }

    public final String expirationString(String expirationDate, CustomerCenterConfigData.Localization localization) {
        t.g(expirationDate, "expirationDate");
        t.g(localization, "localization");
        return this.isExpired ? B.H(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASE_INFO_EXPIRED_ON_DATE), "{{ date }}", expirationDate, false, 4, null) : B.H(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASE_INFO_EXPIRES_ON_DATE), "{{ date }}", expirationDate, false, 4, null);
    }

    public final ExpirationOrRenewal getExpirationOrRenewal() {
        return this.expirationOrRenewal;
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final PriceDetails getPricePaid() {
        return this.pricePaid;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.pricePaid.hashCode()) * 31;
        ExpirationOrRenewal expirationOrRenewal = this.expirationOrRenewal;
        int hashCode2 = (hashCode + (expirationOrRenewal == null ? 0 : expirationOrRenewal.hashCode())) * 31;
        StoreProduct storeProduct = this.product;
        int hashCode3 = (((((hashCode2 + (storeProduct == null ? 0 : storeProduct.hashCode())) * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.isSubscription)) * 31;
        Uri uri = this.managementURL;
        return ((((((((hashCode3 + (uri != null ? uri.hashCode() : 0)) * 31) + Boolean.hashCode(this.isExpired)) * 31) + Boolean.hashCode(this.isTrial)) * 31) + Boolean.hashCode(this.isCancelled)) * 31) + Boolean.hashCode(this.isLifetime);
    }

    public final boolean isCancelled() {
        return this.isCancelled;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public final boolean isLifetime() {
        return this.isLifetime;
    }

    public final boolean isSubscription() {
        return this.isSubscription;
    }

    public final boolean isTrial() {
        return this.isTrial;
    }

    public final String renewalString(String renewalDate, CustomerCenterConfigData.Localization localization) {
        t.g(renewalDate, "renewalDate");
        t.g(localization, "localization");
        PriceDetails priceDetails = this.pricePaid;
        if (t.c(priceDetails, PriceDetails.Free.INSTANCE) ? true : t.c(priceDetails, PriceDetails.Unknown.INSTANCE)) {
            return B.H(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.RENEWS_ON_DATE), "{{ date }}", renewalDate, false, 4, null);
        }
        if (!(priceDetails instanceof PriceDetails.Paid)) {
            throw new o();
        }
        return B.H(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.LAST_CHARGE_WAS), "{{ price }}", ((PriceDetails.Paid) this.pricePaid).getPrice(), false, 4, null) + '\n' + B.H(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.NEXT_BILLING_DATE_ON), "{{ date }}", renewalDate, false, 4, null);
    }

    public final void setSubscription(boolean z) {
        this.isSubscription = z;
    }

    public String toString() {
        return "PurchaseInformation(title=" + this.title + ", pricePaid=" + this.pricePaid + ", expirationOrRenewal=" + this.expirationOrRenewal + ", product=" + this.product + ", store=" + this.store + ", isSubscription=" + this.isSubscription + ", managementURL=" + this.managementURL + ", isExpired=" + this.isExpired + ", isTrial=" + this.isTrial + ", isCancelled=" + this.isCancelled + ", isLifetime=" + this.isLifetime + ')';
    }

    public /* synthetic */ PurchaseInformation(EntitlementInfo entitlementInfo, StoreProduct storeProduct, TransactionDetails transactionDetails, DateFormatter dateFormatter, Locale locale, CustomerCenterConfigData.Localization localization, int i, k kVar) {
        this((i & 1) != 0 ? null : entitlementInfo, (i & 2) != 0 ? null : storeProduct, transactionDetails, (i & 8) != 0 ? new DefaultDateFormatter() : dateFormatter, locale, localization);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseInformation(EntitlementInfo entitlementInfo, StoreProduct storeProduct, TransactionDetails transaction, DateFormatter dateFormatter, Locale locale, CustomerCenterConfigData.Localization localization) {
        boolean z;
        Store store;
        t.g(transaction, "transaction");
        t.g(dateFormatter, "dateFormatter");
        t.g(locale, "locale");
        t.g(localization, "localization");
        String access$determineTitle = PurchaseInformationKt.access$determineTitle(entitlementInfo, storeProduct, transaction, localization);
        ExpirationOrRenewal access$determineExpirationOrRenewal = PurchaseInformationKt.access$determineExpirationOrRenewal(entitlementInfo, transaction, dateFormatter, locale);
        Store store2 = (entitlementInfo == null || (store = entitlementInfo.getStore()) == null) ? transaction.getStore() : store;
        PriceDetails access$determinePrice = PurchaseInformationKt.access$determinePrice(storeProduct, transaction);
        boolean z2 = transaction instanceof TransactionDetails.Subscription;
        boolean z3 = z2 && transaction.getStore() != Store.PROMOTIONAL;
        TransactionDetails.Subscription subscription = z2 ? (TransactionDetails.Subscription) transaction : null;
        Uri managementURL = subscription != null ? subscription.getManagementURL() : null;
        if (entitlementInfo != null) {
            z = !entitlementInfo.isActive();
        } else {
            if (z2) {
                if (!((TransactionDetails.Subscription) transaction).isActive()) {
                    z = true;
                }
            } else if (!(transaction instanceof TransactionDetails.NonSubscription)) {
                throw new o();
            }
            z = false;
        }
        this(access$determineTitle, access$determinePrice, access$determineExpirationOrRenewal, storeProduct, store2, z3, managementURL, z, PurchaseInformationKt.access$determineTrialStatus(entitlementInfo, transaction), PurchaseInformationKt.access$determineCancellationStatus(entitlementInfo, transaction), PurchaseInformationKt.access$determineLifetimeStatus(entitlementInfo, transaction));
    }
}

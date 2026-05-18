package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Ca.o;
import Za.B;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.ExpirationOrRenewal;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PriceDetails;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails;
import com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseInformationKt {
    public static final /* synthetic */ boolean access$determineCancellationStatus(EntitlementInfo entitlementInfo, TransactionDetails transactionDetails) {
        return determineCancellationStatus(entitlementInfo, transactionDetails);
    }

    public static final /* synthetic */ ExpirationOrRenewal access$determineExpirationOrRenewal(EntitlementInfo entitlementInfo, TransactionDetails transactionDetails, DateFormatter dateFormatter, Locale locale) {
        return determineExpirationOrRenewal(entitlementInfo, transactionDetails, dateFormatter, locale);
    }

    public static final /* synthetic */ boolean access$determineLifetimeStatus(EntitlementInfo entitlementInfo, TransactionDetails transactionDetails) {
        return determineLifetimeStatus(entitlementInfo, transactionDetails);
    }

    public static final /* synthetic */ PriceDetails access$determinePrice(StoreProduct storeProduct, TransactionDetails transactionDetails) {
        return determinePrice(storeProduct, transactionDetails);
    }

    public static final /* synthetic */ String access$determineTitle(EntitlementInfo entitlementInfo, StoreProduct storeProduct, TransactionDetails transactionDetails, CustomerCenterConfigData.Localization localization) {
        return determineTitle(entitlementInfo, storeProduct, transactionDetails, localization);
    }

    public static final /* synthetic */ boolean access$determineTrialStatus(EntitlementInfo entitlementInfo, TransactionDetails transactionDetails) {
        return determineTrialStatus(entitlementInfo, transactionDetails);
    }

    private static final boolean determineCancellationStatus(EntitlementInfo entitlementInfo, TransactionDetails transactionDetails) {
        boolean z = (entitlementInfo == null || entitlementInfo.getUnsubscribeDetectedAt() == null || entitlementInfo.getWillRenew()) ? false : true;
        TransactionDetails.Subscription subscription = transactionDetails instanceof TransactionDetails.Subscription ? (TransactionDetails.Subscription) transactionDetails : null;
        return z || (subscription != null ? subscription.getWillRenew() ^ true : false);
    }

    private static final ExpirationOrRenewal determineExpirationOrRenewal(EntitlementInfo entitlementInfo, TransactionDetails transactionDetails, DateFormatter dateFormatter, Locale locale) {
        String expirationDate;
        String renewalDate;
        ExpirationOrRenewal expirationOrRenewal = null;
        ExpirationOrRenewal expiration = (entitlementInfo == null || (renewalDate = renewalDate(entitlementInfo, dateFormatter, locale)) == null) ? (entitlementInfo == null || (expirationDate = expirationDate(entitlementInfo, dateFormatter, locale)) == null) ? null : new ExpirationOrRenewal.Expiration(expirationDate) : new ExpirationOrRenewal.Renewal(renewalDate);
        String renewalDate2 = renewalDate(transactionDetails, dateFormatter, locale);
        if (renewalDate2 != null) {
            expirationOrRenewal = new ExpirationOrRenewal.Renewal(renewalDate2);
        } else {
            String expirationDate2 = expirationDate(transactionDetails, dateFormatter, locale);
            if (expirationDate2 != null) {
                expirationOrRenewal = new ExpirationOrRenewal.Expiration(expirationDate2);
            }
        }
        return expiration == null ? expirationOrRenewal : expiration;
    }

    private static final boolean determineLifetimeStatus(EntitlementInfo entitlementInfo, TransactionDetails transactionDetails) {
        return (entitlementInfo != null && isPromotionalLifetime(entitlementInfo)) || (!(transactionDetails instanceof TransactionDetails.Subscription) && transactionDetails.getStore() != Store.PROMOTIONAL && entitlementInfo != null);
    }

    private static final PriceDetails determinePrice(StoreProduct storeProduct, TransactionDetails transactionDetails) {
        Price price;
        if (transactionDetails.getStore() == Store.PROMOTIONAL || ((price = transactionDetails.getPrice()) != null && price.getAmountMicros() == 0)) {
            return PriceDetails.Free.INSTANCE;
        }
        Price price2 = transactionDetails.getPrice();
        if (price2 == null || price2.getAmountMicros() <= 0) {
            return storeProduct != null ? storeProduct.getPrice().getAmountMicros() == 0 ? PriceDetails.Free.INSTANCE : new PriceDetails.Paid(storeProduct.getPrice().getFormatted()) : PriceDetails.Unknown.INSTANCE;
        }
        Price price3 = transactionDetails.getPrice();
        return price3 != null ? new PriceDetails.Paid(price3.getFormatted()) : PriceDetails.Unknown.INSTANCE;
    }

    private static final String determineTitle(EntitlementInfo entitlementInfo, StoreProduct storeProduct, TransactionDetails transactionDetails, CustomerCenterConfigData.Localization localization) {
        String title;
        if (transactionDetails.getStore() == Store.PROMOTIONAL && entitlementInfo != null) {
            return entitlementInfo.getIdentifier();
        }
        if (storeProduct != null && (title = storeProduct.getTitle()) != null) {
            return title;
        }
        if (transactionDetails instanceof TransactionDetails.Subscription) {
            return localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.TYPE_SUBSCRIPTION);
        }
        if (transactionDetails instanceof TransactionDetails.NonSubscription) {
            return localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.TYPE_ONE_TIME_PURCHASE);
        }
        throw new o();
    }

    private static final boolean determineTrialStatus(EntitlementInfo entitlementInfo, TransactionDetails transactionDetails) {
        if ((entitlementInfo != null ? entitlementInfo.getPeriodType() : null) == PeriodType.TRIAL) {
            return true;
        }
        TransactionDetails.Subscription subscription = transactionDetails instanceof TransactionDetails.Subscription ? (TransactionDetails.Subscription) transactionDetails : null;
        return subscription != null && subscription.isTrial();
    }

    private static final String expirationDate(EntitlementInfo entitlementInfo, DateFormatter dateFormatter, Locale locale) {
        Date expirationDate;
        if (isPromotionalLifetime(entitlementInfo)) {
            return null;
        }
        if ((entitlementInfo.getWillRenew() && entitlementInfo.isActive()) || (expirationDate = entitlementInfo.getExpirationDate()) == null) {
            return null;
        }
        return dateFormatter.format(expirationDate, locale);
    }

    private static final boolean isExpiringOrExpired(TransactionDetails.Subscription subscription) {
        return (subscription.getWillRenew() && subscription.isActive()) ? false : true;
    }

    private static final boolean isPromotionalLifetime(EntitlementInfo entitlementInfo) {
        return entitlementInfo.getStore() == Store.PROMOTIONAL && B.y(entitlementInfo.getProductIdentifier(), "_lifetime", false, 2, null);
    }

    private static final String renewalDate(EntitlementInfo entitlementInfo, DateFormatter dateFormatter, Locale locale) {
        Date expirationDate;
        if (!entitlementInfo.getWillRenew() || isPromotionalLifetime(entitlementInfo) || (expirationDate = entitlementInfo.getExpirationDate()) == null) {
            return null;
        }
        return dateFormatter.format(expirationDate, locale);
    }

    private static final String expirationDate(TransactionDetails transactionDetails, DateFormatter dateFormatter, Locale locale) {
        if ((transactionDetails instanceof TransactionDetails.Subscription) && ((TransactionDetails.Subscription) transactionDetails).getExpiresDate() != null) {
            t.e(transactionDetails, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails.Subscription");
            if (isExpiringOrExpired((TransactionDetails.Subscription) transactionDetails)) {
                t.e(transactionDetails, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails.Subscription");
                Date expiresDate = ((TransactionDetails.Subscription) transactionDetails).getExpiresDate();
                t.d(expiresDate);
                return dateFormatter.format(expiresDate, locale);
            }
        }
        return null;
    }

    private static final String renewalDate(TransactionDetails transactionDetails, DateFormatter dateFormatter, Locale locale) {
        if (!(transactionDetails instanceof TransactionDetails.Subscription)) {
            return null;
        }
        TransactionDetails.Subscription subscription = (TransactionDetails.Subscription) transactionDetails;
        if (!subscription.getWillRenew() || subscription.getExpiresDate() == null) {
            return null;
        }
        return dateFormatter.format(subscription.getExpiresDate(), locale);
    }
}

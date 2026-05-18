package com.revenuecat.purchases.common;

import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ReceiptInfoKt {
    public static final /* synthetic */ PlatformProductId access$platformProductId(StoreProduct storeProduct) {
        return platformProductId(storeProduct);
    }

    private static final PlatformProductId platformProductId(StoreProduct storeProduct) {
        return new PlatformProductId(storeProduct.getId());
    }

    public static final /* synthetic */ PlatformProductId access$platformProductId(SubscriptionOption subscriptionOption) {
        return platformProductId(subscriptionOption);
    }

    private static final PlatformProductId platformProductId(SubscriptionOption subscriptionOption) {
        if (!(subscriptionOption instanceof GoogleSubscriptionOption)) {
            return null;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) subscriptionOption;
        return new GooglePlatformProductId(googleSubscriptionOption.getProductId(), googleSubscriptionOption.getBasePlanId(), googleSubscriptionOption.getOfferId());
    }
}

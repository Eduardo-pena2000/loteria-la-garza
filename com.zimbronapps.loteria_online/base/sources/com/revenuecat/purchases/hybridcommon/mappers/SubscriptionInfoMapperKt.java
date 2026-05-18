package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.q;
import Ca.x;
import Da.S;
import com.revenuecat.purchases.SubscriptionInfo;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriptionInfoMapperKt {
    public static final Map map(SubscriptionInfo subscriptionInfo) {
        t.g(subscriptionInfo, "<this>");
        q a = x.a("productIdentifier", subscriptionInfo.getProductIdentifier());
        q a2 = x.a("purchaseDate", MappersHelpersKt.toIso8601(subscriptionInfo.getPurchaseDate()));
        Date originalPurchaseDate = subscriptionInfo.getOriginalPurchaseDate();
        q a3 = x.a("originalPurchaseDate", originalPurchaseDate != null ? MappersHelpersKt.toIso8601(originalPurchaseDate) : null);
        Date expiresDate = subscriptionInfo.getExpiresDate();
        q a4 = x.a("expiresDate", expiresDate != null ? MappersHelpersKt.toIso8601(expiresDate) : null);
        q a5 = x.a("store", subscriptionInfo.getStore().name());
        Date unsubscribeDetectedAt = subscriptionInfo.getUnsubscribeDetectedAt();
        q a6 = x.a("unsubscribeDetectedAt", unsubscribeDetectedAt != null ? MappersHelpersKt.toIso8601(unsubscribeDetectedAt) : null);
        q a7 = x.a("isSandbox", Boolean.valueOf(subscriptionInfo.isSandbox()));
        Date billingIssuesDetectedAt = subscriptionInfo.getBillingIssuesDetectedAt();
        q a8 = x.a("billingIssuesDetectedAt", billingIssuesDetectedAt != null ? MappersHelpersKt.toIso8601(billingIssuesDetectedAt) : null);
        Date gracePeriodExpiresDate = subscriptionInfo.getGracePeriodExpiresDate();
        q a9 = x.a("gracePeriodExpiresDate", gracePeriodExpiresDate != null ? MappersHelpersKt.toIso8601(gracePeriodExpiresDate) : null);
        q a10 = x.a("ownershipType", subscriptionInfo.getOwnershipType().name());
        q a11 = x.a("periodType", subscriptionInfo.getPeriodType().name());
        Date refundedAt = subscriptionInfo.getRefundedAt();
        return S.l(new q[]{a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, x.a("refundedAt", refundedAt != null ? MappersHelpersKt.toIso8601(refundedAt) : null), x.a("storeTransactionId", subscriptionInfo.getStoreTransactionId()), x.a("isActive", Boolean.valueOf(subscriptionInfo.isActive())), x.a("willRenew", Boolean.valueOf(subscriptionInfo.getWillRenew()))});
    }
}

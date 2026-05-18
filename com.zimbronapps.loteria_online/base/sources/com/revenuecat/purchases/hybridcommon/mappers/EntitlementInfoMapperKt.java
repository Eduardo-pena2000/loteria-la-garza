package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.q;
import Ca.x;
import Da.S;
import com.revenuecat.purchases.EntitlementInfo;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EntitlementInfoMapperKt {
    public static final Map map(EntitlementInfo entitlementInfo) {
        t.g(entitlementInfo, "<this>");
        q a = x.a("identifier", entitlementInfo.getIdentifier());
        q a2 = x.a("isActive", Boolean.valueOf(entitlementInfo.isActive()));
        q a3 = x.a("willRenew", Boolean.valueOf(entitlementInfo.getWillRenew()));
        q a4 = x.a("periodType", entitlementInfo.getPeriodType().name());
        q a5 = x.a("latestPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getLatestPurchaseDate())));
        q a6 = x.a("latestPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getLatestPurchaseDate()));
        q a7 = x.a("originalPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getOriginalPurchaseDate())));
        q a8 = x.a("originalPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getOriginalPurchaseDate()));
        Date expirationDate = entitlementInfo.getExpirationDate();
        q a9 = x.a("expirationDateMillis", expirationDate != null ? Long.valueOf(MappersHelpersKt.toMillis(expirationDate)) : null);
        Date expirationDate2 = entitlementInfo.getExpirationDate();
        q a10 = x.a("expirationDate", expirationDate2 != null ? MappersHelpersKt.toIso8601(expirationDate2) : null);
        q a11 = x.a("store", entitlementInfo.getStore().name());
        q a12 = x.a("productIdentifier", entitlementInfo.getProductIdentifier());
        q a13 = x.a("productPlanIdentifier", entitlementInfo.getProductPlanIdentifier());
        q a14 = x.a("isSandbox", Boolean.valueOf(entitlementInfo.isSandbox()));
        Date unsubscribeDetectedAt = entitlementInfo.getUnsubscribeDetectedAt();
        q a15 = x.a("unsubscribeDetectedAt", unsubscribeDetectedAt != null ? MappersHelpersKt.toIso8601(unsubscribeDetectedAt) : null);
        Date unsubscribeDetectedAt2 = entitlementInfo.getUnsubscribeDetectedAt();
        q a16 = x.a("unsubscribeDetectedAtMillis", unsubscribeDetectedAt2 != null ? Long.valueOf(MappersHelpersKt.toMillis(unsubscribeDetectedAt2)) : null);
        Date billingIssueDetectedAt = entitlementInfo.getBillingIssueDetectedAt();
        q a17 = x.a("billingIssueDetectedAt", billingIssueDetectedAt != null ? MappersHelpersKt.toIso8601(billingIssueDetectedAt) : null);
        Date billingIssueDetectedAt2 = entitlementInfo.getBillingIssueDetectedAt();
        return S.l(new q[]{a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, x.a("billingIssueDetectedAtMillis", billingIssueDetectedAt2 != null ? Long.valueOf(MappersHelpersKt.toMillis(billingIssueDetectedAt2)) : null), x.a("ownershipType", entitlementInfo.getOwnershipType().name()), x.a("verification", entitlementInfo.getVerification().name())});
    }
}

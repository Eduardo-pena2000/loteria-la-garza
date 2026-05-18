package com.revenuecat.purchases.google;

import com.android.billingclient.api.BillingResult;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingResultExtensionsBillingIndependentKt {
    private static final String getOnPurchasesUpdatedSubResponseCodeName(int i) {
        if (i == 0) {
            return "NO_APPLICABLE_SUB_RESPONSE_CODE";
        }
        if (i == 1) {
            return "PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS";
        }
        if (i == 2) {
            return "USER_INELIGIBLE";
        }
        return "UNKNOWN_SUB_RESPONSE_CODE (" + i + ')';
    }

    public static final String toHumanReadableDescription(BillingResult billingResult) {
        t.g(billingResult, "<this>");
        return "DebugMessage: " + billingResult.getDebugMessage() + ". ErrorCode: " + ErrorsKt.getBillingResponseCodeName(billingResult.getResponseCode()) + ". SubResponseCode: " + getOnPurchasesUpdatedSubResponseCodeName(billingResult.getOnPurchasesUpdatedSubResponseCode()) + '.';
    }
}

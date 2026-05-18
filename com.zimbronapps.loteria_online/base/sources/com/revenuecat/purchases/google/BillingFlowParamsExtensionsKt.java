package com.revenuecat.purchases.google;

import com.android.billingclient.api.BillingFlowParams;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingFlowParamsExtensionsKt {
    public static final void setUpgradeInfo(BillingFlowParams.Builder builder, ReplaceProductInfo replaceProductInfo) {
        t.g(builder, "<this>");
        t.g(replaceProductInfo, "replaceProductInfo");
        BillingFlowParams.SubscriptionUpdateParams.Builder newBuilder = BillingFlowParams.SubscriptionUpdateParams.newBuilder();
        newBuilder.setOldPurchaseToken(replaceProductInfo.getOldPurchase().getPurchaseToken());
        ReplacementMode replacementMode = replaceProductInfo.getReplacementMode();
        if (replacementMode != null) {
            GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
            if (googleReplacementMode == null) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Got non-Google replacement mode", null);
            } else {
                newBuilder.setSubscriptionReplacementMode(googleReplacementMode.getPlayBillingClientMode());
            }
        }
        t.f(newBuilder, "newBuilder().apply {\n   …        }\n        }\n    }");
        builder.setSubscriptionUpdateParams(newBuilder.build());
    }
}

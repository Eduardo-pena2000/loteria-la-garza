package com.revenuecat.purchases.deeplinks;

import Za.E;
import android.net.Uri;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DeepLinkParser {
    public static final DeepLinkParser INSTANCE = new DeepLinkParser();
    private static final String REDEEM_WEB_PURCHASE_HOST = "redeem_web_purchase";

    private DeepLinkParser() {
    }

    public final WebPurchaseRedemption parseWebPurchaseRedemption(Uri uri) {
        t.g(uri, "data");
        if (t.c(uri.getHost(), "redeem_web_purchase")) {
            String queryParameter = uri.getQueryParameter("redemption_token");
            if (queryParameter != null && !E.h0(queryParameter)) {
                return new WebPurchaseRedemption(queryParameter);
            }
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Redemption token is missing web redemption deep link. Ignoring.");
            }
            return null;
        }
        LogLevel logLevel2 = LogLevel.DEBUG;
        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
            currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Unrecognized deep link host: " + uri.getHost() + ". Ignoring");
        }
        return null;
    }
}

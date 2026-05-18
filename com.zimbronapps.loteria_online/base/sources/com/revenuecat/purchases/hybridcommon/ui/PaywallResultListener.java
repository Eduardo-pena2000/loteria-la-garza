package com.revenuecat.purchases.hybridcommon.ui;

import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface PaywallResultListener {

    public static final class DefaultImpls {
        @Ca.e
        public static void onPaywallResult(PaywallResultListener paywallResultListener, PaywallResult paywallResult) {
            t.g(paywallResult, "paywallResult");
        }
    }

    @Ca.e
    void onPaywallResult(PaywallResult paywallResult);

    void onPaywallResult(String str);
}

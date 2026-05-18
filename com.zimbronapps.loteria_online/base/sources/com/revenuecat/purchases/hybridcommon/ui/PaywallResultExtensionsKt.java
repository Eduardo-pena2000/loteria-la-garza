package com.revenuecat.purchases.hybridcommon.ui;

import Ca.o;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallResultExtensionsKt {
    public static final String getName(PaywallResult paywallResult) {
        t.g(paywallResult, "<this>");
        if (t.c(paywallResult, PaywallResult.Cancelled.INSTANCE)) {
            return "CANCELLED";
        }
        if (paywallResult instanceof PaywallResult.Error) {
            return "ERROR";
        }
        if (paywallResult instanceof PaywallResult.Purchased) {
            return "PURCHASED";
        }
        if (paywallResult instanceof PaywallResult.Restored) {
            return "RESTORED";
        }
        throw new o();
    }
}

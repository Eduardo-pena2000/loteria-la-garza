package com.revenuecat.purchases;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class WebPurchaseRedemption {
    private final String redemptionToken;

    public WebPurchaseRedemption(String str) {
        t.g(str, "redemptionToken");
        this.redemptionToken = str;
    }

    public final String getRedemptionToken$purchases_defaultsBc8Release() {
        return this.redemptionToken;
    }
}

package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.PostReceiptInitiationSource;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AcknowledgePurchaseUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final PostReceiptInitiationSource initiationSource;
    private final String purchaseToken;

    public AcknowledgePurchaseUseCaseParams(String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z) {
        t.g(str, "purchaseToken");
        t.g(postReceiptInitiationSource, "initiationSource");
        this.purchaseToken = str;
        this.initiationSource = postReceiptInitiationSource;
        this.appInBackground = z;
    }

    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final PostReceiptInitiationSource getInitiationSource() {
        return this.initiationSource;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }
}

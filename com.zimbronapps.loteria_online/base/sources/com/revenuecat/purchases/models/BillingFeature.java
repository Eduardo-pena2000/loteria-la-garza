package com.revenuecat.purchases.models;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum BillingFeature {
    SUBSCRIPTIONS("subscriptions"),
    SUBSCRIPTIONS_UPDATE("subscriptionsUpdate"),
    PRICE_CHANGE_CONFIRMATION("priceChangeConfirmation");

    private final String playBillingClientName;

    BillingFeature(String str) {
        this.playBillingClientName = str;
    }

    public final String getPlayBillingClientName() {
        return this.playBillingClientName;
    }
}

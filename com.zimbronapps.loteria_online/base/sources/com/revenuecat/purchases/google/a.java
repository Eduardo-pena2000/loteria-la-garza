package com.revenuecat.purchases.google;

import com.android.billingclient.api.BillingResult;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ BillingResult a;
    public final /* synthetic */ BillingWrapper b;

    public /* synthetic */ a(BillingResult billingResult, BillingWrapper billingWrapper) {
        this.a = billingResult;
        this.b = billingWrapper;
    }

    public final void run() {
        BillingWrapper.c(this.a, this.b);
    }
}

package com.revenuecat.purchases.google;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ BillingWrapper a;

    public /* synthetic */ d(BillingWrapper billingWrapper) {
        this.a = billingWrapper;
    }

    public final void run() {
        BillingWrapper.b(this.a);
    }
}

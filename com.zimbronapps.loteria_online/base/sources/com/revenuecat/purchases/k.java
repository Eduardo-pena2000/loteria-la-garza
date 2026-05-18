package com.revenuecat.purchases;

import com.android.billingclient.api.BillingClient;
import com.revenuecat.purchases.interfaces.Callback;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ BillingClient a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ Callback c;

    public /* synthetic */ k(BillingClient billingClient, AtomicBoolean atomicBoolean, Callback callback) {
        this.a = billingClient;
        this.b = atomicBoolean;
        this.c = callback;
    }

    public final void run() {
        PurchasesOrchestrator$Companion$canMakePayments$2$1.b(this.a, this.b, this.c);
    }
}

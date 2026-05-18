package com.revenuecat.purchases;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.revenuecat.purchases.interfaces.Callback;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ BillingResult b;
    public final /* synthetic */ Callback c;
    public final /* synthetic */ BillingClient d;
    public final /* synthetic */ List e;

    public /* synthetic */ l(AtomicBoolean atomicBoolean, BillingResult billingResult, Callback callback, BillingClient billingClient, List list) {
        this.a = atomicBoolean;
        this.b = billingResult;
        this.c = callback;
        this.d = billingClient;
        this.e = list;
    }

    public final void run() {
        PurchasesOrchestrator$Companion$canMakePayments$2$1.a(this.a, this.b, this.c, this.d, this.e);
    }
}

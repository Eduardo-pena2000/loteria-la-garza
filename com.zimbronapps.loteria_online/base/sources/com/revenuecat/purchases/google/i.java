package com.revenuecat.purchases.google;

import Qa.l;
import com.revenuecat.purchases.google.BillingWrapper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ BillingWrapper a;
    public final /* synthetic */ l b;
    public final /* synthetic */ l c;

    public /* synthetic */ i(BillingWrapper billingWrapper, l lVar, l lVar2) {
        this.a = billingWrapper;
        this.b = lVar;
        this.c = lVar2;
    }

    public final void run() {
        BillingWrapper.1.k(this.a, this.b, this.c);
    }
}

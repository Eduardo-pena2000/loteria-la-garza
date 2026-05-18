package com.revenuecat.purchases.google;

import Qa.l;
import com.revenuecat.purchases.PurchasesError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ l a;
    public final /* synthetic */ PurchasesError b;

    public /* synthetic */ e(l lVar, PurchasesError purchasesError) {
        this.a = lVar;
        this.b = purchasesError;
    }

    public final void run() {
        BillingWrapper.e(this.a, this.b);
    }
}

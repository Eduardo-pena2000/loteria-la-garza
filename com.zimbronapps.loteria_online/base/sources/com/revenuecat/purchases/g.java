package com.revenuecat.purchases;

import com.revenuecat.purchases.PurchasesFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ g(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        PurchasesFactory.LowPriorityThreadFactory.a(this.a);
    }
}

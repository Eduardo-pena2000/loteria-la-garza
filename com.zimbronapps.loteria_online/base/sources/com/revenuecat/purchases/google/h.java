package com.revenuecat.purchases.google;

import Qa.l;
import com.revenuecat.purchases.google.BillingWrapper;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ l a;
    public final /* synthetic */ List b;

    public /* synthetic */ h(l lVar, List list) {
        this.a = lVar;
        this.b = list;
    }

    public final void run() {
        BillingWrapper.1.a(this.a, this.b);
    }
}

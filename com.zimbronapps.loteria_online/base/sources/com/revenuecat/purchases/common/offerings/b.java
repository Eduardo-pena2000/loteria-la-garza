package com.revenuecat.purchases.common.offerings;

import Qa.l;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ Map a;
    public final /* synthetic */ List b;
    public final /* synthetic */ l c;

    public /* synthetic */ b(Map map, List list, l lVar) {
        this.a = map;
        this.b = list;
        this.c = lVar;
    }

    public final void run() {
        OfferingsFactory$getStoreProductsById$1$1$1.a(this.a, this.b, this.c);
    }
}

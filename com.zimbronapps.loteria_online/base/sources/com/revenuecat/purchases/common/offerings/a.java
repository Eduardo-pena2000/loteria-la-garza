package com.revenuecat.purchases.common.offerings;

import Qa.l;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ OfferingsFactory c;
    public final /* synthetic */ l d;
    public final /* synthetic */ l e;

    public /* synthetic */ a(List list, Set set, OfferingsFactory offeringsFactory, l lVar, l lVar2) {
        this.a = list;
        this.b = set;
        this.c = offeringsFactory;
        this.d = lVar;
        this.e = lVar2;
    }

    public final void run() {
        OfferingsFactory.1.a(this.a, this.b, this.c, this.d, this.e);
    }
}

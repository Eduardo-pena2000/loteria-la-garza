package com.revenuecat.purchases.google;

import Ca.I;
import Qa.l;
import Qa.p;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public /* synthetic */ class BillingWrapper$findPurchaseInPurchaseHistory$2$3 extends q implements p {
    public BillingWrapper$findPurchaseInPurchaseHistory$2$3(Object obj) {
        super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Long) obj, (l) obj2);
        return I.a;
    }

    public final void invoke(Long l, l lVar) {
        t.g(lVar, "p1");
        BillingWrapper.access$executeRequestOnUIThread((BillingWrapper) ((kotlin.jvm.internal.f) this).receiver, l, lVar);
    }
}

package com.revenuecat.purchases;

import Ca.I;
import Ca.s;
import Qa.p;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$1 extends u implements p {
    final /* synthetic */ Ga.e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$1(Ga.e eVar) {
        super(2);
        this.$continuation = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return I.a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        t.g(storeTransaction, "storeTransaction");
        t.g(customerInfo, "customerInfo");
        Ga.e eVar = this.$continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(s.a(s.b(new PurchaseResult(storeTransaction, customerInfo)))));
    }
}

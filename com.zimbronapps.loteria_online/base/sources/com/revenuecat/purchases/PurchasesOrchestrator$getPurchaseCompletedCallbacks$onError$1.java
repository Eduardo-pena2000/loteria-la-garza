package com.revenuecat.purchases;

import Ca.I;
import Qa.p;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1 extends u implements p {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.this$0 = purchasesOrchestrator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (PurchasesError) obj2);
        return I.a;
    }

    public final void invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
        t.g(storeTransaction, "purchase");
        t.g(purchasesError, "error");
        PurchaseCallback access$getPurchaseCallback = PurchasesOrchestrator.access$getPurchaseCallback(this.this$0, (String) storeTransaction.getProductIds().get(0));
        if (access$getPurchaseCallback != null) {
            PurchasesOrchestrator.access$dispatch(this.this$0, access$getPurchaseCallback, purchasesError);
        }
    }
}

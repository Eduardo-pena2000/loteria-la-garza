package com.revenuecat.purchases;

import Ca.I;
import Qa.p;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1 extends u implements p {
    final /* synthetic */ ProductChangeCallback $productChangeListener;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1(ProductChangeCallback productChangeCallback, PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.$productChangeListener = productChangeCallback;
        this.this$0 = purchasesOrchestrator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return I.a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        t.g(storeTransaction, "storeTransaction");
        t.g(customerInfo, "info");
        ProductChangeCallback productChangeCallback = this.$productChangeListener;
        if (productChangeCallback != null) {
            PurchasesOrchestrator.access$dispatch(this.this$0, new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1$1$1(productChangeCallback, storeTransaction, customerInfo));
        }
    }
}

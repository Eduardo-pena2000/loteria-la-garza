package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1$1 extends u implements Qa.a {
    final /* synthetic */ CustomerInfo $info;
    final /* synthetic */ PurchaseCallback $purchaseCallback;
    final /* synthetic */ StoreTransaction $storeTransaction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1$1(PurchaseCallback purchaseCallback, StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        super(0);
        this.$purchaseCallback = purchaseCallback;
        this.$storeTransaction = storeTransaction;
        this.$info = customerInfo;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$purchaseCallback.onCompleted(this.$storeTransaction, this.$info);
    }
}

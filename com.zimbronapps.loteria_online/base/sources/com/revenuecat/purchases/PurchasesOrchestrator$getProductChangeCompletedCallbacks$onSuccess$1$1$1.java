package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1$1$1 extends u implements Qa.a {
    final /* synthetic */ CustomerInfo $info;
    final /* synthetic */ ProductChangeCallback $productChangeCallback;
    final /* synthetic */ StoreTransaction $storeTransaction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1$1$1(ProductChangeCallback productChangeCallback, StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        super(0);
        this.$productChangeCallback = productChangeCallback;
        this.$storeTransaction = storeTransaction;
        this.$info = customerInfo;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$productChangeCallback.onCompleted(this.$storeTransaction, this.$info);
    }
}

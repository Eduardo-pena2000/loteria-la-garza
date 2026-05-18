package com.revenuecat.purchases;

import Ca.I;
import Qa.p;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1 extends u implements p {
    final /* synthetic */ PurchasesOrchestrator this$0;

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ CustomerInfo $info;
        final /* synthetic */ StoreTransaction $storeTransaction;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PurchasesOrchestrator purchasesOrchestrator, CustomerInfo customerInfo, StoreTransaction storeTransaction) {
            super(0);
            this.this$0 = purchasesOrchestrator;
            this.$info = customerInfo;
            this.$storeTransaction = storeTransaction;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            PurchasesOrchestrator.access$getBlockstoreHelper$p(this.this$0).storeUserIdIfNeeded(this.$info);
            PurchaseCallback access$getPurchaseCallback = PurchasesOrchestrator.access$getPurchaseCallback(this.this$0, (String) this.$storeTransaction.getProductIds().get(0));
            if (access$getPurchaseCallback != null) {
                PurchasesOrchestrator.access$dispatch(this.this$0, new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1$1(access$getPurchaseCallback, this.$storeTransaction, this.$info));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.this$0 = purchasesOrchestrator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return I.a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        t.g(storeTransaction, "storeTransaction");
        t.g(customerInfo, "info");
        PurchasesOrchestrator.access$getBackupManager$p(this.this$0).dataChanged();
        PurchasesOrchestrator.access$getBlockstoreHelper$p(this.this$0).aliasCurrentAndStoredUserIdsIfNeeded(new 1(this.this$0, customerInfo, storeTransaction));
    }
}

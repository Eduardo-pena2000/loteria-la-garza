package com.revenuecat.purchases.google;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$onPurchasesUpdated$1$1 extends u implements l {
    final /* synthetic */ List $notNullPurchasesList;
    final /* synthetic */ List $storeTransactions;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$onPurchasesUpdated$1$1(List list, List list2, BillingWrapper billingWrapper) {
        super(1);
        this.$storeTransactions = list;
        this.$notNullPurchasesList = list2;
        this.this$0 = billingWrapper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StoreTransaction) obj);
        return I.a;
    }

    public final void invoke(StoreTransaction storeTransaction) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
        t.g(storeTransaction, "storeTxn");
        this.$storeTransactions.add(storeTransaction);
        if (this.$storeTransactions.size() != this.$notNullPurchasesList.size() || (purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener()) == null) {
            return;
        }
        purchasesUpdatedListener.onPurchasesUpdated(this.$storeTransactions);
    }
}

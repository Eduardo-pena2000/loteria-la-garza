package com.revenuecat.purchases;

import Ca.I;
import Da.D;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$getProductsOfTypes$1$1 extends u implements Qa.l {
    final /* synthetic */ GetStoreProductsCallback $callback;
    final /* synthetic */ List $collectedStoreProducts;
    final /* synthetic */ Date $nonNullStartTime;
    final /* synthetic */ Set $productIds;
    final /* synthetic */ Set $typesRemaining;
    final /* synthetic */ PurchasesOrchestrator this$0;

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ GetStoreProductsCallback $callback;
        final /* synthetic */ List $collectedStoreProducts;
        final /* synthetic */ Date $nonNullStartTime;
        final /* synthetic */ Set $productIds;
        final /* synthetic */ List $storeProducts;
        final /* synthetic */ Set $typesRemaining;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PurchasesOrchestrator purchasesOrchestrator, Set set, Set set2, List list, List list2, Date date, GetStoreProductsCallback getStoreProductsCallback) {
            super(0);
            this.this$0 = purchasesOrchestrator;
            this.$productIds = set;
            this.$typesRemaining = set2;
            this.$collectedStoreProducts = list;
            this.$storeProducts = list2;
            this.$nonNullStartTime = date;
            this.$callback = getStoreProductsCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            PurchasesOrchestrator.access$getProductsOfTypes(this.this$0, this.$productIds, this.$typesRemaining, D.v0(this.$collectedStoreProducts, this.$storeProducts), this.$nonNullStartTime, this.$callback);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getProductsOfTypes$1$1(PurchasesOrchestrator purchasesOrchestrator, Set set, Set set2, List list, Date date, GetStoreProductsCallback getStoreProductsCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$productIds = set;
        this.$typesRemaining = set2;
        this.$collectedStoreProducts = list;
        this.$nonNullStartTime = date;
        this.$callback = getStoreProductsCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return I.a;
    }

    public final void invoke(List list) {
        t.g(list, "storeProducts");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        PurchasesOrchestrator.access$dispatch(purchasesOrchestrator, new 1(purchasesOrchestrator, this.$productIds, this.$typesRemaining, this.$collectedStoreProducts, list, this.$nonNullStartTime, this.$callback));
    }
}

package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import java.util.Date;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$getProductsOfTypes$1$2 extends u implements Qa.l {
    final /* synthetic */ GetStoreProductsCallback $callback;
    final /* synthetic */ Date $nonNullStartTime;
    final /* synthetic */ Set $productIds;
    final /* synthetic */ PurchasesOrchestrator this$0;

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ GetStoreProductsCallback $callback;
        final /* synthetic */ PurchasesError $it;
        final /* synthetic */ Date $nonNullStartTime;
        final /* synthetic */ Set $productIds;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PurchasesOrchestrator purchasesOrchestrator, Date date, Set set, PurchasesError purchasesError, GetStoreProductsCallback getStoreProductsCallback) {
            super(0);
            this.this$0 = purchasesOrchestrator;
            this.$nonNullStartTime = date;
            this.$productIds = set;
            this.$it = purchasesError;
            this.$callback = getStoreProductsCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            Date date = this.$nonNullStartTime;
            Set set = this.$productIds;
            PurchasesOrchestrator.access$trackGetProductsResult(purchasesOrchestrator, date, set, set, this.$it);
            this.$callback.onError(this.$it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getProductsOfTypes$1$2(PurchasesOrchestrator purchasesOrchestrator, Date date, Set set, GetStoreProductsCallback getStoreProductsCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$nonNullStartTime = date;
        this.$productIds = set;
        this.$callback = getStoreProductsCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return I.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        t.g(purchasesError, "it");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        PurchasesOrchestrator.access$dispatch(purchasesOrchestrator, new 1(purchasesOrchestrator, this.$nonNullStartTime, this.$productIds, purchasesError, this.$callback));
    }
}

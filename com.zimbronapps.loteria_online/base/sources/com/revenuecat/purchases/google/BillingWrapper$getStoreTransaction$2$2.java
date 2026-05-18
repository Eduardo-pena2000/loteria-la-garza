package com.revenuecat.purchases.google;

import Ca.I;
import Qa.l;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.ProductType;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$getStoreTransaction$2$2 extends u implements l {
    final /* synthetic */ l $completion;
    final /* synthetic */ Purchase $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$getStoreTransaction$2$2(l lVar, Purchase purchase) {
        super(1);
        this.$completion = lVar;
        this.$purchase = purchase;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProductType) obj);
        return I.a;
    }

    public final void invoke(ProductType productType) {
        t.g(productType, "type");
        this.$completion.invoke(StoreTransactionConversionsKt.toStoreTransaction$default(this.$purchase, productType, null, null, null, null, 30, null));
    }
}

package com.revenuecat.purchases.google;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$consumeAndSave$addToken$1 extends u implements l {
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$consumeAndSave$addToken$1(BillingWrapper billingWrapper, StoreTransaction storeTransaction) {
        super(1);
        this.this$0 = billingWrapper;
        this.$purchase = storeTransaction;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return I.a;
    }

    public final void invoke(String str) {
        t.g(str, "token");
        BillingWrapper.access$getDeviceCache$p(this.this$0).addSuccessfullyPostedToken(str, this.$purchase.isAutoRenewing());
    }
}

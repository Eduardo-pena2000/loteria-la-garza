package com.revenuecat.purchases.common.offerings;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsFactory$getStoreProductsById$1$1$2 extends u implements l {
    final /* synthetic */ l $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$getStoreProductsById$1$1$2(l lVar) {
        super(1);
        this.$onError = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return I.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        t.g(purchasesError, "it");
        this.$onError.invoke(purchasesError);
    }
}

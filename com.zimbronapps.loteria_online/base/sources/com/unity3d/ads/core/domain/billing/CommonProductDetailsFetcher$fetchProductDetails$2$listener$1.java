package com.unity3d.ads.core.domain.billing;

import Ca.s;
import cb.n;
import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonProductDetailsFetcher$fetchProductDetails$2$listener$1 implements ProductDetailsListener {
    final /* synthetic */ n $continuation;

    public CommonProductDetailsFetcher$fetchProductDetails$2$listener$1(n nVar) {
        this.$continuation = nVar;
    }

    public final void onProductDetailsResponse(BillingResultBridge billingResult, String str) {
        t.g(billingResult, "billingResult");
        if (str != null && billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            n nVar = this.$continuation;
            s.a aVar = s.b;
            nVar.resumeWith(s.b(new ProductDetailsResult.Success(str)));
        } else if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            n nVar2 = this.$continuation;
            s.a aVar2 = s.b;
            nVar2.resumeWith(s.b(ProductDetailsResult.NotFound.INSTANCE));
        } else {
            n nVar3 = this.$continuation;
            s.a aVar3 = s.b;
            nVar3.resumeWith(s.b(new ProductDetailsResult.Failure(billingResult)));
        }
    }
}

package com.unity3d.ads.core.domain.billing;

import Ga.e;
import Ha.b;
import Ha.c;
import Ia.h;
import cb.p;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonProductDetailsFetcher implements ProductDetailsFetcher {
    private final BillingClientAdapter billingClientAdapter;
    private final String productType;

    public CommonProductDetailsFetcher(BillingClientAdapter billingClientAdapter, String productType) {
        t.g(productType, "productType");
        this.billingClientAdapter = billingClientAdapter;
        this.productType = productType;
    }

    public static final /* synthetic */ BillingClientAdapter access$getBillingClientAdapter$p(CommonProductDetailsFetcher commonProductDetailsFetcher) {
        return commonProductDetailsFetcher.billingClientAdapter;
    }

    public static final /* synthetic */ String access$getProductType$p(CommonProductDetailsFetcher commonProductDetailsFetcher) {
        return commonProductDetailsFetcher.productType;
    }

    public Object fetchProductDetails(String str, e eVar) {
        p pVar = new p(b.c(eVar), 1);
        pVar.E();
        CommonProductDetailsFetcher$fetchProductDetails$2$listener$1 commonProductDetailsFetcher$fetchProductDetails$2$listener$1 = new CommonProductDetailsFetcher$fetchProductDetails$2$listener$1(pVar);
        BillingClientAdapter access$getBillingClientAdapter$p = access$getBillingClientAdapter$p(this);
        if (access$getBillingClientAdapter$p != null) {
            access$getBillingClientAdapter$p.queryProductDetailsAsync(str, access$getProductType$p(this), commonProductDetailsFetcher$fetchProductDetails$2$listener$1);
        }
        Object w = pVar.w();
        if (w == c.f()) {
            h.c(eVar);
        }
        return w;
    }
}

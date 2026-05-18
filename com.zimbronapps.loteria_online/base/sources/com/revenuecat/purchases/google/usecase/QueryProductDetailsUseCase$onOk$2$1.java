package com.revenuecat.purchases.google.usecase;

import Qa.l;
import com.android.billingclient.api.ProductDetails;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryProductDetailsUseCase$onOk$2$1 extends u implements l {
    public static final QueryProductDetailsUseCase$onOk$2$1 INSTANCE = new QueryProductDetailsUseCase$onOk$2$1();

    public QueryProductDetailsUseCase$onOk$2$1() {
        super(1);
    }

    public final CharSequence invoke(ProductDetails productDetails) {
        String productDetails2 = productDetails.toString();
        t.f(productDetails2, "it.toString()");
        return productDetails2;
    }
}

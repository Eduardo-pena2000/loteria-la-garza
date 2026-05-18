package com.revenuecat.purchases.google.usecase;

import Qa.l;
import com.android.billingclient.api.UnfetchedProduct;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryProductDetailsUseCase$onOk$4$1$1 extends u implements l {
    public static final QueryProductDetailsUseCase$onOk$4$1$1 INSTANCE = new QueryProductDetailsUseCase$onOk$4$1$1();

    public QueryProductDetailsUseCase$onOk$4$1$1() {
        super(1);
    }

    public final CharSequence invoke(UnfetchedProduct unfetchedProduct) {
        String unfetchedProduct2 = unfetchedProduct.toString();
        t.f(unfetchedProduct2, "it.toString()");
        return unfetchedProduct2;
    }
}

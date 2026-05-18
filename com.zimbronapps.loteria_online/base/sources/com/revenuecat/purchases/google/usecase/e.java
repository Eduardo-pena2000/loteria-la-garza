package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class e implements ProductDetailsResponseListener {
    public final /* synthetic */ QueryProductDetailsUseCase a;

    public /* synthetic */ e(QueryProductDetailsUseCase queryProductDetailsUseCase) {
        this.a = queryProductDetailsUseCase;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        QueryProductDetailsUseCase.2.a(this.a, billingResult, queryProductDetailsResult);
    }
}

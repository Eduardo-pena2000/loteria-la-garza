package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class h implements PurchasesResponseListener {
    public final /* synthetic */ QueryPurchasesByTypeUseCase a;

    public /* synthetic */ h(QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase) {
        this.a = queryPurchasesByTypeUseCase;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        QueryPurchasesByTypeUseCase.1.a(this.a, billingResult, list);
    }
}

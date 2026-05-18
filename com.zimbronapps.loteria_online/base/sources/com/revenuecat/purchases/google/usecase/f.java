package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class f implements PurchasesResponseListener {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ QueryPurchaseHistoryUseCase b;
    public final /* synthetic */ Date c;

    public /* synthetic */ f(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date) {
        this.a = atomicBoolean;
        this.b = queryPurchaseHistoryUseCase;
        this.c = date;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        QueryPurchaseHistoryUseCase.1.a(this.a, this.b, this.c, billingResult, list);
    }
}

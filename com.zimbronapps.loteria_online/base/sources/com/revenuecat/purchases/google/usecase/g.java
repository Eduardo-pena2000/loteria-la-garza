package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class g implements PurchasesResponseListener {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ QueryPurchasesByTypeUseCase b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Date d;
    public final /* synthetic */ PurchasesResponseListener e;

    public /* synthetic */ g(AtomicBoolean atomicBoolean, QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, String str, Date date, PurchasesResponseListener purchasesResponseListener) {
        this.a = atomicBoolean;
        this.b = queryPurchasesByTypeUseCase;
        this.c = str;
        this.d = date;
        this.e = purchasesResponseListener;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        QueryPurchasesByTypeUseCase.a(this.a, this.b, this.c, this.d, this.e, billingResult, list);
    }
}

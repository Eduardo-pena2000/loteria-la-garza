package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class d implements ProductDetailsResponseListener {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ QueryProductDetailsUseCase b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Date e;
    public final /* synthetic */ ProductDetailsResponseListener f;

    public /* synthetic */ d(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, Set set, String str, Date date, ProductDetailsResponseListener productDetailsResponseListener) {
        this.a = atomicBoolean;
        this.b = queryProductDetailsUseCase;
        this.c = set;
        this.d = str;
        this.e = date;
        this.f = productDetailsResponseListener;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        QueryProductDetailsUseCase.a(this.a, this.b, this.c, this.d, this.e, this.f, billingResult, queryProductDetailsResult);
    }
}

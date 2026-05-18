package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b implements ConsumeResponseListener {
    public final /* synthetic */ ConsumePurchaseUseCase a;

    public /* synthetic */ b(ConsumePurchaseUseCase consumePurchaseUseCase) {
        this.a = consumePurchaseUseCase;
    }

    public final void onConsumeResponse(BillingResult billingResult, String str) {
        ConsumePurchaseUseCase.1.a(this.a, billingResult, str);
    }
}

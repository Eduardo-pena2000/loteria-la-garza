package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingResult;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements AcknowledgePurchaseResponseListener {
    public final /* synthetic */ AcknowledgePurchaseUseCase a;

    public /* synthetic */ a(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase) {
        this.a = acknowledgePurchaseUseCase;
    }

    public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
        AcknowledgePurchaseUseCase.1.a(this.a, billingResult);
    }
}

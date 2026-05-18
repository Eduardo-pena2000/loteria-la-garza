package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingResult;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class c implements BillingConfigResponseListener {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ GetBillingConfigUseCase b;

    public /* synthetic */ c(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase) {
        this.a = atomicBoolean;
        this.b = getBillingConfigUseCase;
    }

    public final void onBillingConfigResponse(BillingResult billingResult, BillingConfig billingConfig) {
        GetBillingConfigUseCase.1.a(this.a, this.b, billingResult, billingConfig);
    }
}

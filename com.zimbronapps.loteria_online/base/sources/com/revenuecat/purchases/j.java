package com.revenuecat.purchases;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.revenuecat.purchases.PurchasesOrchestrator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class j implements PurchasesUpdatedListener {
    public final void onPurchasesUpdated(BillingResult billingResult, List list) {
        PurchasesOrchestrator.Companion.a(billingResult, list);
    }
}

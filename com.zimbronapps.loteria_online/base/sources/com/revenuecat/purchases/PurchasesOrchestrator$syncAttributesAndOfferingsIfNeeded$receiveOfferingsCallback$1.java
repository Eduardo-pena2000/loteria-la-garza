package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 implements ReceiveOfferingsCallback {
    final /* synthetic */ SyncAttributesAndOfferingsCallback $callback;

    public PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1(SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsCallback) {
        this.$callback = syncAttributesAndOfferingsCallback;
    }

    public void onError(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        this.$callback.onError(purchasesError);
    }

    public void onReceived(Offerings offerings) {
        t.g(offerings, "offerings");
        this.$callback.onSuccess(offerings);
    }
}

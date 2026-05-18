package com.revenuecat.purchases;

import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import java.util.Date;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$restorePurchases$callbackWithTracking$1 implements ReceiveCustomerInfoCallback {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ Date $startTime;
    final /* synthetic */ PurchasesOrchestrator this$0;

    public PurchasesOrchestrator$restorePurchases$callbackWithTracking$1(PurchasesOrchestrator purchasesOrchestrator, Date date, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.this$0 = purchasesOrchestrator;
        this.$startTime = date;
        this.$callback = receiveCustomerInfoCallback;
    }

    public void onError(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        PurchasesOrchestrator.access$getDiagnosticsTrackerIfEnabled$p(this.this$0).trackRestorePurchasesResult-SxA4cEA(Integer.valueOf(purchasesError.getCode().getCode()), purchasesError.getMessage(), DurationExtensionsKt.between(ab.b.b, this.$startTime, PurchasesOrchestrator.access$getDateProvider$p(this.this$0).getNow()));
        this.$callback.onError(purchasesError);
    }

    public void onReceived(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
        PurchasesOrchestrator.access$getDiagnosticsTrackerIfEnabled$p(this.this$0).trackRestorePurchasesResult-SxA4cEA(null, null, DurationExtensionsKt.between(ab.b.b, this.$startTime, PurchasesOrchestrator.access$getDateProvider$p(this.this$0).getNow()));
        this.$callback.onReceived(customerInfo);
    }
}

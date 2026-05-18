package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.utils.Result;
import java.util.Date;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 extends u implements Qa.l {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ CacheFetchPolicy $fetchPolicy;
    final /* synthetic */ Date $startTime;
    final /* synthetic */ boolean $trackDiagnostics;
    final /* synthetic */ CustomerInfoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1(CustomerInfoHelper customerInfoHelper, boolean z, Date date, CacheFetchPolicy cacheFetchPolicy, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(1);
        this.this$0 = customerInfoHelper;
        this.$trackDiagnostics = z;
        this.$startTime = date;
        this.$fetchPolicy = cacheFetchPolicy;
        this.$callback = receiveCustomerInfoCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfoDataResult) obj);
        return I.a;
    }

    public final void invoke(CustomerInfoDataResult customerInfoDataResult) {
        t.g(customerInfoDataResult, "customerInfoDataResult");
        CustomerInfoHelper.access$trackGetCustomerInfoResultIfNeeded(this.this$0, this.$trackDiagnostics, this.$startTime, customerInfoDataResult, this.$fetchPolicy);
        ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
        if (receiveCustomerInfoCallback != null) {
            Result result = customerInfoDataResult.getResult();
            if (result instanceof Result.Success) {
                receiveCustomerInfoCallback.onReceived((CustomerInfo) customerInfoDataResult.getResult().getValue());
            } else if (result instanceof Result.Error) {
                receiveCustomerInfoCallback.onError((PurchasesError) customerInfoDataResult.getResult().getValue());
            }
        }
    }
}

package com.revenuecat.purchases;

import Ca.I;
import java.util.Date;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SyncPurchasesHelper$syncPurchases$handleSuccess$1 extends u implements Qa.l {
    final /* synthetic */ Qa.l $onSuccess;
    final /* synthetic */ Date $startTime;
    final /* synthetic */ SyncPurchasesHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPurchasesHelper$syncPurchases$handleSuccess$1(SyncPurchasesHelper syncPurchasesHelper, Date date, Qa.l lVar) {
        super(1);
        this.this$0 = syncPurchasesHelper;
        this.$startTime = date;
        this.$onSuccess = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return I.a;
    }

    public final void invoke(CustomerInfo customerInfo) {
        t.g(customerInfo, "it");
        SyncPurchasesHelper.access$trackSyncPurchasesResultIfNeeded(this.this$0, null, this.$startTime);
        this.$onSuccess.invoke(customerInfo);
    }
}

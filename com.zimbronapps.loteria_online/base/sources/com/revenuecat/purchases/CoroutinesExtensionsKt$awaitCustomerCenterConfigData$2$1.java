package com.revenuecat.purchases;

import Ca.s;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CoroutinesExtensionsKt$awaitCustomerCenterConfigData$2$1 implements GetCustomerCenterConfigCallback {
    final /* synthetic */ Ga.e $continuation;

    public CoroutinesExtensionsKt$awaitCustomerCenterConfigData$2$1(Ga.e eVar) {
        this.$continuation = eVar;
    }

    public void onError(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        Ga.e eVar = this.$continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(Ca.t.a(new PurchasesException(purchasesError))));
    }

    public void onSuccess(CustomerCenterConfigData customerCenterConfigData) {
        t.g(customerCenterConfigData, "customerCenterConfig");
        this.$continuation.resumeWith(s.b(customerCenterConfigData));
    }
}

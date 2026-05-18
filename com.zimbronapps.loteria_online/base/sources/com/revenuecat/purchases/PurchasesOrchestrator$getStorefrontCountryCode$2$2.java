package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$getStorefrontCountryCode$2$2 extends u implements Qa.l {
    final /* synthetic */ GetStorefrontCallback $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getStorefrontCountryCode$2$2(GetStorefrontCallback getStorefrontCallback) {
        super(1);
        this.$callback = getStorefrontCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return I.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        LogUtilsKt.errorLog(purchasesError);
        this.$callback.onError(purchasesError);
    }
}

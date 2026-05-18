package com.revenuecat.purchases.hybridcommon;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CommonKt$getProductInfo$onError$1 extends u implements l {
    final /* synthetic */ OnResultList $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonKt$getProductInfo$onError$1(OnResultList onResultList) {
        super(1);
        this.$onResult = onResultList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return I.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        t.g(purchasesError, "it");
        this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
    }
}

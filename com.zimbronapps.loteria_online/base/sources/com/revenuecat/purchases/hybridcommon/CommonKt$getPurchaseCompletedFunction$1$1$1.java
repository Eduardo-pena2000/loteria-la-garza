package com.revenuecat.purchases.hybridcommon;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.S;
import Qa.l;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CommonKt$getPurchaseCompletedFunction$1$1$1 extends u implements l {
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ StoreTransaction $transaction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonKt$getPurchaseCompletedFunction$1$1$1(OnResult onResult, StoreTransaction storeTransaction) {
        super(1);
        this.$onResult = onResult;
        this.$transaction = storeTransaction;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return I.a;
    }

    public final void invoke(Map map) {
        t.g(map, "map");
        this.$onResult.onReceived(S.l(new q[]{x.a("productIdentifier", this.$transaction.getProductIds().get(0)), x.a("customerInfo", map), x.a("transaction", StoreTransactionMapperKt.map(this.$transaction))}));
    }
}

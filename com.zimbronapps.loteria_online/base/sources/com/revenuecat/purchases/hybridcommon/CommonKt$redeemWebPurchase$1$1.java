package com.revenuecat.purchases.hybridcommon;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.S;
import Qa.l;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CommonKt$redeemWebPurchase$1$1 extends u implements l {
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ RedeemWebPurchaseListener.Result $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonKt$redeemWebPurchase$1$1(OnResult onResult, RedeemWebPurchaseListener.Result result) {
        super(1);
        this.$onResult = onResult;
        this.$result = result;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return I.a;
    }

    public final void invoke(Map map) {
        t.g(map, "map");
        this.$onResult.onReceived(S.o(new q[]{x.a("result", CommonKt.access$toResultName(this.$result)), x.a("customerInfo", map)}));
    }
}

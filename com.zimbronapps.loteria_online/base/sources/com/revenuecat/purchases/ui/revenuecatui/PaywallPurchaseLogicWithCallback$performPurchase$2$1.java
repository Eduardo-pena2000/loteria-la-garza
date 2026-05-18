package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Ca.s;
import Ga.e;
import Qa.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallPurchaseLogicWithCallback$performPurchase$2$1 extends u implements l {
    final /* synthetic */ e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallPurchaseLogicWithCallback$performPurchase$2$1(e eVar) {
        super(1);
        this.$continuation = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchaseLogicResult) obj);
        return I.a;
    }

    public final void invoke(PurchaseLogicResult result) {
        t.g(result, "result");
        this.$continuation.resumeWith(s.b(result));
    }
}

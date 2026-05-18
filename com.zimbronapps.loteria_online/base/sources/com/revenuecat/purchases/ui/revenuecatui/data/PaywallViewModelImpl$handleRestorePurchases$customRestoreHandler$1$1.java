package com.revenuecat.purchases.ui.revenuecatui.data;

import Ga.e;
import Qa.p;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import kotlin.jvm.internal.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class PaywallViewModelImpl$handleRestorePurchases$customRestoreHandler$1$1 extends q implements p {
    public PaywallViewModelImpl$handleRestorePurchases$customRestoreHandler$1$1(Object obj) {
        super(2, obj, PaywallPurchaseLogic.class, "performRestore", "performRestore(Lcom/revenuecat/purchases/CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(CustomerInfo customerInfo, e eVar) {
        return ((PaywallPurchaseLogic) this.receiver).performRestore(customerInfo, eVar);
    }
}

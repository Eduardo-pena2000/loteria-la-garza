package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$MainScreenContent$1$1$1 extends u implements l {
    final /* synthetic */ l $onAction;
    final /* synthetic */ CustomerCenterState.Success $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$MainScreenContent$1$1$1(CustomerCenterState.Success success, l lVar) {
        super(1);
        this.$state = success;
        this.$onAction = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchaseInformation) obj);
        return I.a;
    }

    public final void invoke(PurchaseInformation purchase) {
        t.g(purchase, "purchase");
        if (this.$state.getPurchases().size() > 1) {
            this.$onAction.invoke(new CustomerCenterAction.SelectPurchase(purchase));
        }
    }
}

package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$CustomerCenterNavHost$2$2$1 extends u implements Qa.a {
    final /* synthetic */ CustomerCenterDestination $destination;
    final /* synthetic */ l $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$CustomerCenterNavHost$2$2$1(l lVar, CustomerCenterDestination customerCenterDestination) {
        super(0);
        this.$onAction = lVar;
        this.$destination = customerCenterDestination;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$onAction.invoke(new CustomerCenterAction.DismissPromotionalOffer(((CustomerCenterDestination.PromotionalOffer) this.$destination).getData().getOriginalPath()));
    }
}

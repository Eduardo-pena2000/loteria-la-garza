package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$CustomerCenterNavHost$2$1$1 extends u implements l {
    final /* synthetic */ l $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$CustomerCenterNavHost$2$1$1(l lVar) {
        super(1);
        this.$onAction = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SubscriptionOption) obj);
        return I.a;
    }

    public final void invoke(SubscriptionOption subscriptionOption) {
        t.g(subscriptionOption, "subscriptionOption");
        this.$onAction.invoke(new CustomerCenterAction.PurchasePromotionalOffer(subscriptionOption));
    }
}

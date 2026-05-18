package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$2$1 extends u implements Qa.a {
    final /* synthetic */ l $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$2$1(l lVar) {
        super(0);
        this.$onAction = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$onAction.invoke(CustomerCenterAction.ShowSupportTicketCreation.INSTANCE);
    }
}

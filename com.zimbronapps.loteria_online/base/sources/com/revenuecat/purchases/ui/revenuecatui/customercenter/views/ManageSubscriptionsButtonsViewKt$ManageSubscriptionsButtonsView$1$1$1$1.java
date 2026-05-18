package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$1$1$1 extends u implements Qa.a {
    final /* synthetic */ l $onAction;
    final /* synthetic */ CustomerCenterAction.PathButtonPressed $pathButtonPressed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$1$1$1(l lVar, CustomerCenterAction.PathButtonPressed pathButtonPressed) {
        super(0);
        this.$onAction = lVar;
        this.$pathButtonPressed = pathButtonPressed;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$onAction.invoke(this.$pathButtonPressed);
    }
}

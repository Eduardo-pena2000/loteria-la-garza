package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$CustomerCenterNavHost$5$1$1 extends u implements Qa.a {
    final /* synthetic */ String $email;
    final /* synthetic */ l $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$CustomerCenterNavHost$5$1$1(l lVar, String str) {
        super(0);
        this.$onAction = lVar;
        this.$email = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$onAction.invoke(new CustomerCenterAction.ContactSupport(this.$email));
    }
}

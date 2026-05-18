package com.revenuecat.purchases.ui.revenuecatui.activity;

import Ca.I;
import Qa.p;
import com.revenuecat.purchases.Offering;
import kotlin.jvm.internal.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class PaywallActivity$onCreate$1$1$1$1$paywallOptions$2$1 extends q implements p {
    public PaywallActivity$onCreate$1$1$1$1$paywallOptions$2$1(Object obj) {
        super(2, obj, PaywallActivity.class, "onDismissRequest", "onDismissRequest(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Offering) obj, (PaywallResult) obj2);
        return I.a;
    }

    public final void invoke(Offering offering, PaywallResult paywallResult) {
        PaywallActivity.access$onDismissRequest((PaywallActivity) this.receiver, offering, paywallResult);
    }
}

package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import b0.C0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CreateSupportTicketViewKt$CreateSupportTicketView$1$3$1 extends u implements l {
    final /* synthetic */ C0 $description$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSupportTicketViewKt$CreateSupportTicketView$1$3$1(C0 c0) {
        super(1);
        this.$description$delegate = c0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return I.a;
    }

    public final void invoke(String newValue) {
        t.g(newValue, "newValue");
        if (newValue.length() <= 250) {
            CreateSupportTicketViewKt.access$CreateSupportTicketView$lambda$9(this.$description$delegate, newValue);
        }
    }
}

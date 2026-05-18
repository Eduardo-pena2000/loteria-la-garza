package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import b0.C0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CreateSupportTicketViewKt$CreateSupportTicketView$1$1$1 extends u implements l {
    final /* synthetic */ C0 $email$delegate;
    final /* synthetic */ C0 $emailDirty$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSupportTicketViewKt$CreateSupportTicketView$1$1$1(C0 c0, C0 c02) {
        super(1);
        this.$email$delegate = c0;
        this.$emailDirty$delegate = c02;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return I.a;
    }

    public final void invoke(String it) {
        t.g(it, "it");
        CreateSupportTicketViewKt.access$CreateSupportTicketView$lambda$2(this.$email$delegate, it);
        if (CreateSupportTicketViewKt.access$CreateSupportTicketView$lambda$3(this.$emailDirty$delegate)) {
            return;
        }
        CreateSupportTicketViewKt.access$CreateSupportTicketView$lambda$4(this.$emailDirty$delegate, true);
    }
}

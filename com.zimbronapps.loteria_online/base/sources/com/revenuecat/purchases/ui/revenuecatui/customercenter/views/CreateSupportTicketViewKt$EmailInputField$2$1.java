package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import t0.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CreateSupportTicketViewKt$EmailInputField$2$1 extends u implements l {
    final /* synthetic */ EmailInputState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSupportTicketViewKt$EmailInputField$2$1(EmailInputState emailInputState) {
        super(1);
        this.$state = emailInputState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((p) obj);
        return I.a;
    }

    public final void invoke(p focusState) {
        t.g(focusState, "focusState");
        this.$state.getOnFocusChanged().invoke(Boolean.valueOf(focusState.a()));
    }
}

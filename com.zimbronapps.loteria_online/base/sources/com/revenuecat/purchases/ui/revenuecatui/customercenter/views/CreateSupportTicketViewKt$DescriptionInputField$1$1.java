package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import N.v;
import Qa.l;
import Za.E;
import b0.h2;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CreateSupportTicketViewKt$DescriptionInputField$1$1 extends u implements l {
    final /* synthetic */ h2 $currentOnSubmit$delegate;
    final /* synthetic */ DescriptionInputState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSupportTicketViewKt$DescriptionInputField$1$1(DescriptionInputState descriptionInputState, h2 h2Var) {
        super(1);
        this.$state = descriptionInputState;
        this.$currentOnSubmit$delegate = h2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((v) obj);
        return I.a;
    }

    public final void invoke(v $receiver) {
        t.g($receiver, "$this$$receiver");
        if (!this.$state.getShowDone() || E.h0(this.$state.getDescription())) {
            return;
        }
        CreateSupportTicketViewKt.access$DescriptionInputField$lambda$23(this.$currentOnSubmit$delegate).invoke();
    }
}

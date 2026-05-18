package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.a;
import b0.C0;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallDialogKt$PaywallDialog$dismissDialog$1$1 extends u implements a {
    final /* synthetic */ C0 $currentDialogOffering$delegate;
    final /* synthetic */ PaywallDialogOptions $paywallDialogOptions;
    final /* synthetic */ C0 $shouldDisplayDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallDialogKt$PaywallDialog$dismissDialog$1$1(PaywallDialogOptions paywallDialogOptions, C0 c0, C0 c02) {
        super(0);
        this.$paywallDialogOptions = paywallDialogOptions;
        this.$currentDialogOffering$delegate = c0;
        this.$shouldDisplayDialog$delegate = c02;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        PaywallDialogKt.access$PaywallDialog$lambda$6(this.$currentDialogOffering$delegate, null);
        PaywallDialogKt.access$PaywallDialog$lambda$2(this.$shouldDisplayDialog$delegate, false);
        a dismissRequest = this.$paywallDialogOptions.getDismissRequest();
        if (dismissRequest != null) {
            dismissRequest.invoke();
        }
    }
}

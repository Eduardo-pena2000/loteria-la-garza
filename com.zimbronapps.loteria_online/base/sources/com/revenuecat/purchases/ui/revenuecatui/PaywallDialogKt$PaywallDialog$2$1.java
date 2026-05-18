package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import b0.C0;
import cb.O;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$2$1", f = "PaywallDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallDialogKt$PaywallDialog$2$1 extends l implements p {
    final /* synthetic */ C0 $currentDialogOffering$delegate;
    final /* synthetic */ PaywallDialogOptions $paywallDialogOptions;
    final /* synthetic */ C0 $shouldDisplayDialog$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallDialogKt$PaywallDialog$2$1(PaywallDialogOptions paywallDialogOptions, C0 c0, C0 c02, e eVar) {
        super(2, eVar);
        this.$paywallDialogOptions = paywallDialogOptions;
        this.$shouldDisplayDialog$delegate = c0;
        this.$currentDialogOffering$delegate = c02;
    }

    public final e create(Object obj, e eVar) {
        return new PaywallDialogKt$PaywallDialog$2$1(this.$paywallDialogOptions, this.$shouldDisplayDialog$delegate, this.$currentDialogOffering$delegate, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((PaywallDialogKt$PaywallDialog$2$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        if (PaywallDialogKt.access$PaywallDialog$lambda$1(this.$shouldDisplayDialog$delegate) && PaywallDialogKt.access$PaywallDialog$lambda$5(this.$currentDialogOffering$delegate) == null) {
            PaywallDialogKt.access$PaywallDialog$lambda$6(this.$currentDialogOffering$delegate, this.$paywallDialogOptions.getOfferingSelection$revenuecatui_defaultsBc8Release());
        }
        return I.a;
    }
}

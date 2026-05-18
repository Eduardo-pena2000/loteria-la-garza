package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.a;
import Qa.p;
import b0.C0;
import cb.O;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$3$1", f = "PaywallDialog.kt", l = {81}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallDialogKt$PaywallDialog$3$1 extends l implements p {
    final /* synthetic */ C0 $currentDialogOffering$delegate;
    final /* synthetic */ a $dismissDialog;
    final /* synthetic */ C0 $pendingExitOffering$delegate;
    final /* synthetic */ Qa.l $shouldDisplayBlock;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallDialogKt$PaywallDialog$3$1(Qa.l lVar, a aVar, C0 c0, C0 c02, e eVar) {
        super(2, eVar);
        this.$shouldDisplayBlock = lVar;
        this.$dismissDialog = aVar;
        this.$currentDialogOffering$delegate = c0;
        this.$pendingExitOffering$delegate = c02;
    }

    public final e create(Object obj, e eVar) {
        return new PaywallDialogKt$PaywallDialog$3$1(this.$shouldDisplayBlock, this.$dismissDialog, this.$currentDialogOffering$delegate, this.$pendingExitOffering$delegate, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((PaywallDialogKt$PaywallDialog$3$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            if (PaywallDialogKt.access$PaywallDialog$lambda$5(this.$currentDialogOffering$delegate) == null && PaywallDialogKt.access$PaywallDialog$lambda$8(this.$pendingExitOffering$delegate) != null) {
                Qa.l lVar = this.$shouldDisplayBlock;
                if (lVar != null) {
                    this.label = 1;
                    obj = HelperFunctionsKt.shouldDisplayPaywall(lVar, this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    PaywallDialogKt.access$PaywallDialog$lambda$6(this.$currentDialogOffering$delegate, PaywallDialogKt.access$PaywallDialog$lambda$8(this.$pendingExitOffering$delegate));
                    PaywallDialogKt.access$PaywallDialog$lambda$9(this.$pendingExitOffering$delegate, null);
                }
            }
            return I.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        if (((Boolean) obj).booleanValue()) {
            PaywallDialogKt.access$PaywallDialog$lambda$6(this.$currentDialogOffering$delegate, PaywallDialogKt.access$PaywallDialog$lambda$8(this.$pendingExitOffering$delegate));
        } else {
            this.$dismissDialog.invoke();
        }
        PaywallDialogKt.access$PaywallDialog$lambda$9(this.$pendingExitOffering$delegate, null);
        return I.a;
    }
}

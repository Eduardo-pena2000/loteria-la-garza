package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.a;
import Qa.l;
import b0.C0;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallDialogKt$PaywallDialog$4$1$1 extends u implements l {
    final /* synthetic */ C0 $currentDialogOffering$delegate;
    final /* synthetic */ a $dismissDialog;
    final /* synthetic */ C0 $pendingExitOffering$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallDialogKt$PaywallDialog$4$1$1(a aVar, C0 c0, C0 c02) {
        super(1);
        this.$dismissDialog = aVar;
        this.$pendingExitOffering$delegate = c0;
        this.$currentDialogOffering$delegate = c02;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((OfferingSelection) obj);
        return I.a;
    }

    public final void invoke(OfferingSelection offeringSelection) {
        if (offeringSelection == null) {
            this.$dismissDialog.invoke();
        } else {
            PaywallDialogKt.access$PaywallDialog$lambda$9(this.$pendingExitOffering$delegate, offeringSelection);
            PaywallDialogKt.access$PaywallDialog$lambda$6(this.$currentDialogOffering$delegate, null);
        }
    }
}

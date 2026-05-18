package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.a;
import Qa.l;
import b0.h2;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallDialogKt$PaywallDialogContent$handleCloseRequest$1$1 extends u implements a {
    final /* synthetic */ l $onDismissRequest;
    final /* synthetic */ h2 $preloadedExitOffering$delegate;
    final /* synthetic */ h2 $purchaseCompleted$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallDialogKt$PaywallDialogContent$handleCloseRequest$1$1(l lVar, h2 h2Var, h2 h2Var2) {
        super(0);
        this.$onDismissRequest = lVar;
        this.$purchaseCompleted$delegate = h2Var;
        this.$preloadedExitOffering$delegate = h2Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        OfferingSelection.OfferingType offeringType;
        if (PaywallDialogKt.access$PaywallDialogContent$lambda$17(this.$purchaseCompleted$delegate) || PaywallDialogKt.access$PaywallDialogContent$lambda$18(this.$preloadedExitOffering$delegate) == null) {
            offeringType = null;
        } else {
            Offering access$PaywallDialogContent$lambda$18 = PaywallDialogKt.access$PaywallDialogContent$lambda$18(this.$preloadedExitOffering$delegate);
            t.d(access$PaywallDialogContent$lambda$18);
            offeringType = new OfferingSelection.OfferingType(access$PaywallDialogContent$lambda$18);
        }
        this.$onDismissRequest.invoke(offeringType);
    }
}

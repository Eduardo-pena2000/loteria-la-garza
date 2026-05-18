package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.a;
import Qa.p;
import Xa.f;
import b0.m;
import b0.w;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialogKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalPaywallKt$InternalPaywall$7$errorDialog$1 extends u implements p {
    final /* synthetic */ PurchasesError $it;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPaywallKt$InternalPaywall$7$errorDialog$1(PaywallViewModel paywallViewModel, PurchasesError purchasesError) {
        super(2);
        this.$viewModel = paywallViewModel;
        this.$it = purchasesError;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        if ((i & 3) == 2 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-2015353972, i, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:144)");
        }
        PaywallViewModel paywallViewModel = this.$viewModel;
        mVar.V(1191363525);
        boolean U = mVar.U(paywallViewModel);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = new InternalPaywallKt$InternalPaywall$7$errorDialog$1$1$1(paywallViewModel);
            mVar.t(C);
        }
        mVar.P();
        ErrorDialogKt.ErrorDialog((a) ((f) C), this.$it.getMessage(), mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}

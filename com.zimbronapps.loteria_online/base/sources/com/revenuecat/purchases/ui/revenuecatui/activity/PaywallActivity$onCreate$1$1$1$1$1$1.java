package com.revenuecat.purchases.ui.revenuecatui.activity;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity$onCreate$1$1$1$1$1$1", f = "PaywallActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallActivity$onCreate$1$1$1$1$1$1 extends l implements p {
    final /* synthetic */ PaywallViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallActivity$onCreate$1$1$1$1$1$1(PaywallViewModel paywallViewModel, e eVar) {
        super(2, eVar);
        this.$viewModel = paywallViewModel;
    }

    public final e create(Object obj, e eVar) {
        return new PaywallActivity$onCreate$1$1$1$1$1$1(this.$viewModel, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((PaywallActivity$onCreate$1$1$1$1$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        this.$viewModel.preloadExitOffering();
        return I.a;
    }
}

package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import b0.h2;
import cb.O;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$2$1", f = "InternalCustomerCenter.kt", l = {108}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$InternalCustomerCenter$2$1 extends l implements p {
    final /* synthetic */ h2 $state$delegate;
    final /* synthetic */ CustomerCenterViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$InternalCustomerCenter$2$1(CustomerCenterViewModel customerCenterViewModel, h2 h2Var, e eVar) {
        super(2, eVar);
        this.$viewModel = customerCenterViewModel;
        this.$state$delegate = h2Var;
    }

    public final e create(Object obj, e eVar) {
        return new InternalCustomerCenterKt$InternalCustomerCenter$2$1(this.$viewModel, this.$state$delegate, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InternalCustomerCenterKt$InternalCustomerCenter$2$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            if (InternalCustomerCenterKt.access$InternalCustomerCenter$lambda$1(this.$state$delegate) instanceof CustomerCenterState.NotLoaded) {
                CustomerCenterViewModel customerCenterViewModel = this.$viewModel;
                this.label = 1;
                if (customerCenterViewModel.loadCustomerCenter(this) == f) {
                    return f;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return I.a;
    }
}

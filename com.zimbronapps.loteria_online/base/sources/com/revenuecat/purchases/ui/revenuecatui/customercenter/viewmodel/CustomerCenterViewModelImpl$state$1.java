package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$state$1", f = "CustomerCenterViewModel.kt", l = {215}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterViewModelImpl$state$1 extends l implements p {
    int label;
    final /* synthetic */ CustomerCenterViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCenterViewModelImpl$state$1(CustomerCenterViewModelImpl customerCenterViewModelImpl, e eVar) {
        super(2, eVar);
        this.this$0 = customerCenterViewModelImpl;
    }

    public final e create(Object obj, e eVar) {
        return new CustomerCenterViewModelImpl$state$1(this.this$0, eVar);
    }

    public final Object invoke(fb.f fVar, e eVar) {
        return ((CustomerCenterViewModelImpl$state$1) create(fVar, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            CustomerCenterState customerCenterState = (CustomerCenterState) CustomerCenterViewModelImpl.access$get_state$p(this.this$0).getValue();
            if ((customerCenterState instanceof CustomerCenterState.NotLoaded) || (customerCenterState instanceof CustomerCenterState.Loading) || (customerCenterState instanceof CustomerCenterState.Error)) {
                CustomerCenterViewModelImpl customerCenterViewModelImpl = this.this$0;
                this.label = 1;
                if (customerCenterViewModelImpl.loadCustomerCenter(this) == f) {
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

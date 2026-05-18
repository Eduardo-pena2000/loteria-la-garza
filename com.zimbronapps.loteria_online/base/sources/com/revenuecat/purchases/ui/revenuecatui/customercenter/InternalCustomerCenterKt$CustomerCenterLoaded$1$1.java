package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import X.b0;
import X.d0;
import b0.h2;
import cb.O;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$CustomerCenterLoaded$1$1", f = "InternalCustomerCenter.kt", l = {423}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$CustomerCenterLoaded$1$1 extends l implements p {
    final /* synthetic */ h2 $latestMessage$delegate;
    final /* synthetic */ h2 $latestOnAction$delegate;
    final /* synthetic */ d0 $snackbarHostState;
    final /* synthetic */ CustomerCenterState.Success $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$CustomerCenterLoaded$1$1(CustomerCenterState.Success success, d0 d0Var, h2 h2Var, h2 h2Var2, e eVar) {
        super(2, eVar);
        this.$state = success;
        this.$snackbarHostState = d0Var;
        this.$latestMessage$delegate = h2Var;
        this.$latestOnAction$delegate = h2Var2;
    }

    public final e create(Object obj, e eVar) {
        return new InternalCustomerCenterKt$CustomerCenterLoaded$1$1(this.$state, this.$snackbarHostState, this.$latestMessage$delegate, this.$latestOnAction$delegate, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InternalCustomerCenterKt$CustomerCenterLoaded$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            if (this.$state.getShowSupportTicketSuccessSnackbar()) {
                d0 d0Var = this.$snackbarHostState;
                String access$CustomerCenterLoaded$lambda$14 = InternalCustomerCenterKt.access$CustomerCenterLoaded$lambda$14(this.$latestMessage$delegate);
                this.label = 1;
                if (d0.f(d0Var, access$CustomerCenterLoaded$lambda$14, (String) null, false, (b0) null, this, 14, (Object) null) == f) {
                    return f;
                }
            }
            return I.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        InternalCustomerCenterKt.access$CustomerCenterLoaded$lambda$13(this.$latestOnAction$delegate).invoke(CustomerCenterAction.DismissSupportTicketSuccessSnackbar.INSTANCE);
        return I.a;
    }
}

package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import X.b0;
import X.d0;
import b0.h2;
import cb.O;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$ErrorSnackbar$1$1", f = "CreateSupportTicketView.kt", l = {353}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CreateSupportTicketViewKt$ErrorSnackbar$1$1 extends l implements p {
    final /* synthetic */ h2 $currentOnErrorShow$delegate;
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ d0 $errorSnackbarHostState;
    final /* synthetic */ boolean $hasError;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSupportTicketViewKt$ErrorSnackbar$1$1(boolean z, d0 d0Var, String str, h2 h2Var, e eVar) {
        super(2, eVar);
        this.$hasError = z;
        this.$errorSnackbarHostState = d0Var;
        this.$errorMessage = str;
        this.$currentOnErrorShow$delegate = h2Var;
    }

    public final e create(Object obj, e eVar) {
        return new CreateSupportTicketViewKt$ErrorSnackbar$1$1(this.$hasError, this.$errorSnackbarHostState, this.$errorMessage, this.$currentOnErrorShow$delegate, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((CreateSupportTicketViewKt$ErrorSnackbar$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            if (this.$hasError) {
                d0 d0Var = this.$errorSnackbarHostState;
                String str = this.$errorMessage;
                this.label = 1;
                if (d0.f(d0Var, str, (String) null, false, (b0) null, this, 14, (Object) null) == f) {
                    return f;
                }
            }
            return I.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        CreateSupportTicketViewKt.access$ErrorSnackbar$lambda$26(this.$currentOnErrorShow$delegate).invoke();
        return I.a;
    }
}

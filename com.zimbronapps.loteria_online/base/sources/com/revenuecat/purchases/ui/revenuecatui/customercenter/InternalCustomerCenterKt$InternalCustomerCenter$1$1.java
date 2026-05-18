package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$1$1", f = "InternalCustomerCenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$InternalCustomerCenter$1$1 extends l implements p {
    final /* synthetic */ X.l $colorScheme;
    final /* synthetic */ boolean $isDark;
    final /* synthetic */ CustomerCenterViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$InternalCustomerCenter$1$1(CustomerCenterViewModel customerCenterViewModel, X.l lVar, boolean z, e eVar) {
        super(2, eVar);
        this.$viewModel = customerCenterViewModel;
        this.$colorScheme = lVar;
        this.$isDark = z;
    }

    public final e create(Object obj, e eVar) {
        return new InternalCustomerCenterKt$InternalCustomerCenter$1$1(this.$viewModel, this.$colorScheme, this.$isDark, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((InternalCustomerCenterKt$InternalCustomerCenter$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        this.$viewModel.refreshColors(this.$colorScheme, this.$isDark);
        return I.a;
    }
}

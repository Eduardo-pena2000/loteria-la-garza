package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import android.content.Context;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$InternalCustomerCenter$5$1 extends u implements Qa.a {
    final /* synthetic */ Context $context;
    final /* synthetic */ Qa.a $onDismiss;
    final /* synthetic */ CustomerCenterViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$InternalCustomerCenter$5$1(CustomerCenterViewModel customerCenterViewModel, Context context, Qa.a aVar) {
        super(0);
        this.$viewModel = customerCenterViewModel;
        this.$context = context;
        this.$onDismiss = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$viewModel.onNavigationButtonPressed(this.$context, this.$onDismiss);
    }
}

package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Da.D;
import Qa.p;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-3$1 extends u implements p {
    public static final ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-3$1 INSTANCE = new ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-3$1();

    public ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-3$1() {
        super(2);
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
            w.U(-1872635862, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$VirtualCurrencyBalancesScreenKt.lambda-3.<anonymous> (VirtualCurrencyBalancesScreen.kt:206)");
        }
        CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
        VirtualCurrencyBalancesScreenKt.access$InternalVirtualCurrencyBalancesScreen(customerCenterConfigTestData.getStandardAppearance(), CustomerCenterConfigTestData.customerCenterData$default(customerCenterConfigTestData, false, false, 3, null).getLocalization(), new VirtualCurrencyBalancesScreenViewState.Loaded(D.C0(customerCenterConfigTestData.getFourVirtualCurrencies().getAll().values(), new ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-3$1$invoke$$inlined$sortedByDescending$1())), null, mVar, 0, 8);
        if (w.L()) {
            w.T();
        }
    }
}

package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.p;
import b0.m;
import b0.w;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-6$1 extends u implements p {
    public static final ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-6$1 INSTANCE = new ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-6$1();

    public ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-6$1() {
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
            w.U(669156317, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$VirtualCurrencyBalancesScreenKt.lambda-6.<anonymous> (VirtualCurrencyBalancesScreen.kt:255)");
        }
        CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
        VirtualCurrencyBalancesScreenKt.access$InternalVirtualCurrencyBalancesScreen(customerCenterConfigTestData.getStandardAppearance(), CustomerCenterConfigTestData.customerCenterData$default(customerCenterConfigTestData, false, false, 3, null).getLocalization(), new VirtualCurrencyBalancesScreenViewState.Error(new PurchasesError(PurchasesErrorCode.UnknownError, "Mock error")), null, mVar, 0, 8);
        if (w.L()) {
            w.T();
        }
    }
}

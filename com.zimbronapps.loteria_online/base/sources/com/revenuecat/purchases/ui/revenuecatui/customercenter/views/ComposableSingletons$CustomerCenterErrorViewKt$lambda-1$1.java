package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.p;
import b0.m;
import b0.w;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$CustomerCenterErrorViewKt$lambda-1$1 extends u implements p {
    public static final ComposableSingletons$CustomerCenterErrorViewKt$lambda-1$1 INSTANCE = new ComposableSingletons$CustomerCenterErrorViewKt$lambda-1$1();

    public ComposableSingletons$CustomerCenterErrorViewKt$lambda-1$1() {
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
            w.U(-1516678677, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$CustomerCenterErrorViewKt.lambda-1.<anonymous> (CustomerCenterErrorView.kt:23)");
        }
        CustomerCenterErrorViewKt.CustomerCenterErrorView(new CustomerCenterState.Error(new PurchasesError(PurchasesErrorCode.UnknownError, "Mock error")), mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}

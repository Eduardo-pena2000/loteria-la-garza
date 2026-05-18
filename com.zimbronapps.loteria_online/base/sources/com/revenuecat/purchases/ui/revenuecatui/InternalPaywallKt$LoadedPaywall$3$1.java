package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.p;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalPaywallKt$LoadedPaywall$3$1 extends u implements p {
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPaywallKt$LoadedPaywall$3$1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel) {
        super(2);
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
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
            w.U(1771404190, i, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadedPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:204)");
        }
        InternalPaywallKt.access$TemplatePaywall(this.$state, this.$viewModel, mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}

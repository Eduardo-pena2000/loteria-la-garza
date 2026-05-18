package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import Qa.q;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import y.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template4Kt$Template4MainContent$1$1$1 extends u implements q {
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template4Kt$Template4MainContent$1$1$1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel) {
        super(3);
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(f AnimatedVisibility, m mVar, int i) {
        t.g(AnimatedVisibility, "$this$AnimatedVisibility");
        if (w.L()) {
            w.U(492758735, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4MainContent.<anonymous>.<anonymous>.<anonymous> (Template4.kt:182)");
        }
        Template4Kt.access$Packages(this.$state, this.$viewModel, mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}

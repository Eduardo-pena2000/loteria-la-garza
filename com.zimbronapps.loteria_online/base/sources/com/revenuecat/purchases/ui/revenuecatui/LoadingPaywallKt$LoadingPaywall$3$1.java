package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import M.h;
import M.i;
import Qa.p;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.composables.Fade;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderDefaults;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt;
import kotlin.jvm.internal.u;
import z.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LoadingPaywallKt$LoadingPaywall$3$1 extends u implements p {
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingPaywallKt$LoadingPaywall$3$1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel) {
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
            w.U(-1190756256, i, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywall.<anonymous>.<anonymous> (LoadingPaywall.kt:101)");
        }
        PaywallState.Loaded.Legacy legacy = this.$state;
        PaywallViewModel paywallViewModel = this.$viewModel;
        e.a aVar = e.a;
        h d = i.d(UIConstant.INSTANCE.getDefaultPackageCornerRadius-D9Ej5fM());
        LoadingPaywallConstants loadingPaywallConstants = LoadingPaywallConstants.INSTANCE;
        Template2Kt.Template2(legacy, paywallViewModel, PlaceholderKt.placeholder-TgFrcIs(aVar, true, loadingPaywallConstants.getPlaceholderColor-0d7_KjU(), d, new Fade(loadingPaywallConstants.getPlaceholderColor-0d7_KjU(), PlaceholderDefaults.INSTANCE.getFadeAnimationSpec(), null), null, null, mVar, (M.d << 12) | 54, 48), mVar, 0, 0);
        if (w.L()) {
            w.T();
        }
    }
}

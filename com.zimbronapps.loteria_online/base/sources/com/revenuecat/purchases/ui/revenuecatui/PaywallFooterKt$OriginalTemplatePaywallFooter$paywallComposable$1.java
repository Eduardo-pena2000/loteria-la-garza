package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.p;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallFooterKt$OriginalTemplatePaywallFooter$paywallComposable$1 extends u implements p {
    final /* synthetic */ boolean $condensed;
    final /* synthetic */ PaywallOptions $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallFooterKt$OriginalTemplatePaywallFooter$paywallComposable$1(boolean z, PaywallOptions paywallOptions) {
        super(2);
        this.$condensed = z;
        this.$options = paywallOptions;
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
            w.U(-1974808778, i, -1, "com.revenuecat.purchases.ui.revenuecatui.OriginalTemplatePaywallFooter.<anonymous> (PaywallFooter.kt:56)");
        }
        PaywallKt.Paywall(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(this.$options, null, false, null, null, null, PaywallMode.Companion.footerMode(this.$condensed), null, null, null, 477, null), mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}

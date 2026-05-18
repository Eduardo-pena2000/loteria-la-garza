package com.revenuecat.purchases.ui.revenuecatui.views;

import Ca.I;
import Qa.p;
import b0.C0;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.PaywallFooterKt;
import com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OriginalTemplatePaywallFooterView$init$2$Content$1 extends u implements p {
    final /* synthetic */ C0 $paywallOptions$delegate;
    final /* synthetic */ OriginalTemplatePaywallFooterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView$init$2$Content$1(OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView, C0 c0) {
        super(2);
        this.this$0 = originalTemplatePaywallFooterView;
        this.$paywallOptions$delegate = c0;
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
            w.U(-1757622246, i, -1, "com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView.init.<no name provided>.Content.<anonymous> (OriginalTemplatePaywallFooterView.kt:193)");
        }
        PaywallFooterKt.OriginalTemplatePaywallFooter(OriginalTemplatePaywallFooterView.2.access$Content$lambda$1(this.$paywallOptions$delegate), OriginalTemplatePaywallFooterView.access$getInitialCondensed$p(this.this$0), null, mVar, 0, 4);
        if (w.L()) {
            w.T();
        }
    }
}

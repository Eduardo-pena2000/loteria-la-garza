package com.revenuecat.purchases.ui.revenuecatui.views;

import Ca.I;
import Qa.a;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OriginalTemplatePaywallFooterView$paywallOptionsState$1 extends u implements a {
    final /* synthetic */ OriginalTemplatePaywallFooterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView$paywallOptionsState$1(OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView) {
        super(0);
        this.this$0 = originalTemplatePaywallFooterView;
    }

    public final void invoke() {
        a access$getDismissHandler$p = OriginalTemplatePaywallFooterView.access$getDismissHandler$p(this.this$0);
        if (access$getDismissHandler$p != null) {
            access$getDismissHandler$p.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }
}

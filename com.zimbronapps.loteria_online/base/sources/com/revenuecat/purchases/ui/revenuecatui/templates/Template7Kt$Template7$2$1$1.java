package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import Qa.l;
import b0.C0;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template7Kt$Template7$2$1$1 extends u implements l {
    final /* synthetic */ C0 $selectedTier$delegate;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template7Kt$Template7$2$1$1(PaywallState.Loaded.Legacy legacy, C0 c0) {
        super(1);
        this.$state = legacy;
        this.$selectedTier$delegate = c0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TemplateConfiguration.TierInfo) obj);
        return I.a;
    }

    public final void invoke(TemplateConfiguration.TierInfo it) {
        t.g(it, "it");
        Template7Kt.access$Template7$lambda$6(this.$selectedTier$delegate, it);
        this.$state.selectPackage(Template7Kt.access$Template7$lambda$5(this.$selectedTier$delegate).getDefaultPackage());
    }
}

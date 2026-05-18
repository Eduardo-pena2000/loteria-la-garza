package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import Qa.q;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import y.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template4Kt$CheckmarkBox$1$1 extends u implements q {
    final /* synthetic */ TemplateConfiguration.Colors $colors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template4Kt$CheckmarkBox$1$1(TemplateConfiguration.Colors colors) {
        super(3);
        this.$colors = colors;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(f AnimatedVisibility, m mVar, int i) {
        t.g(AnimatedVisibility, "$this$AnimatedVisibility");
        if (w.L()) {
            w.U(-2128395201, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox.<anonymous>.<anonymous> (Template4.kt:445)");
        }
        PaywallIconKt.PaywallIcon-FNF3uiM(PaywallIconName.CHECK_CIRCLE, null, this.$colors.getAccent1-0d7_KjU(), mVar, 6, 2);
        if (w.L()) {
            w.T();
        }
    }
}

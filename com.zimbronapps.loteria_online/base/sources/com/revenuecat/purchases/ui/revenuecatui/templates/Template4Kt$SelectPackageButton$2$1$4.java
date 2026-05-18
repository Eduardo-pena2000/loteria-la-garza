package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import F.V;
import Qa.q;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template4Kt$SelectPackageButton$2$1$4 extends u implements q {
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template4Kt$SelectPackageButton$2$1$4(TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors) {
        super(3);
        this.$packageInfo = packageInfo;
        this.$colors = colors;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(V Button, m mVar, int i) {
        t.g(Button, "$this$Button");
        if ((i & 17) == 16 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-1357178314, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous>.<anonymous>.<anonymous> (Template4.kt:325)");
        }
        Template4Kt.access$SelectPackageButtonContent(this.$packageInfo, this.$colors, mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}

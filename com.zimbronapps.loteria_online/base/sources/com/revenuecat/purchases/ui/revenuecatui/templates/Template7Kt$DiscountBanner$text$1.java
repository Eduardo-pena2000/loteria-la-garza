package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import F.V;
import Qa.p;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template7Kt$DiscountBanner$text$1 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ V $this_DiscountBanner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template7Kt$DiscountBanner$text$1(V v, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i) {
        super(2);
        this.$this_DiscountBanner = v;
        this.$state = legacy;
        this.$packageInfo = packageInfo;
        this.$colors = colors;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        Template7Kt.access$DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, this.$colors, mVar, g1.a(this.$$changed | 1));
    }
}

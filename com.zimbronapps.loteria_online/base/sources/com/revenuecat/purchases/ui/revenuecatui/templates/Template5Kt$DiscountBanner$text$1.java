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
public final class Template5Kt$DiscountBanner$text$1 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ V $this_DiscountBanner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template5Kt$DiscountBanner$text$1(V v, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, int i) {
        super(2);
        this.$this_DiscountBanner = v;
        this.$state = legacy;
        this.$packageInfo = packageInfo;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        Template5Kt.access$DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, mVar, g1.a(this.$$changed | 1));
    }
}

package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template4Kt$OfferName$3 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
    final /* synthetic */ long $textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template4Kt$OfferName$3(TemplateConfiguration.PackageInfo packageInfo, long j, e eVar, int i, int i2) {
        super(2);
        this.$packageInfo = packageInfo;
        this.$textColor = j;
        this.$modifier = eVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        Template4Kt.access$OfferName-3IgeMak(this.$packageInfo, this.$textColor, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}

package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallWarningKt$DefaultPaywallWarning$1 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ PaywallWarning $warning;
    final /* synthetic */ long $warningColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallWarningKt$DefaultPaywallWarning$1(PaywallWarning paywallWarning, long j, e eVar, int i, int i2) {
        super(2);
        this.$warning = paywallWarning;
        this.$warningColor = j;
        this.$modifier = eVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        DefaultPaywallWarningKt.DefaultPaywallWarning-3IgeMak(this.$warning, this.$warningColor, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}

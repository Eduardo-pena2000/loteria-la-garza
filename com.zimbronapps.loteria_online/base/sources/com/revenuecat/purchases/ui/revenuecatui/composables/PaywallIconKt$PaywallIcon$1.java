package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallIconKt$PaywallIcon$1 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ PaywallIconName $icon;
    final /* synthetic */ e $modifier;
    final /* synthetic */ long $tintColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallIconKt$PaywallIcon$1(PaywallIconName paywallIconName, e eVar, long j, int i, int i2) {
        super(2);
        this.$icon = paywallIconName;
        this.$modifier = eVar;
        this.$tintColor = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        PaywallIconKt.PaywallIcon-FNF3uiM(this.$icon, this.$modifier, this.$tintColor, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}

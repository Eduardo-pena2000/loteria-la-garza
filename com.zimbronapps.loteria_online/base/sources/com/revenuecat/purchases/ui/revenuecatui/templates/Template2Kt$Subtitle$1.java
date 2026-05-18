package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template2Kt$Subtitle$1 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template2Kt$Subtitle$1(PaywallState.Loaded.Legacy legacy, e eVar, int i, int i2, int i3) {
        super(2);
        this.$state = legacy;
        this.$childModifier = eVar;
        this.$textAlign = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        Template2Kt.access$Subtitle-8iNrtrE(this.$state, this.$childModifier, this.$textAlign, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}

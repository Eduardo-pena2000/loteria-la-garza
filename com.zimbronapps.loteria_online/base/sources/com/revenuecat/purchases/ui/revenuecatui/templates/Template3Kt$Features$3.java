package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import F.n;
import Qa.p;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template3Kt$Features$3 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $spacing;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ n $this_Features;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template3Kt$Features$3(n nVar, PaywallState.Loaded.Legacy legacy, float f, int i) {
        super(2);
        this.$this_Features = nVar;
        this.$state = legacy;
        this.$spacing = f;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        Template3Kt.access$Features-TDGSqEk(this.$this_Features, this.$state, this.$spacing, mVar, g1.a(this.$$changed | 1));
    }
}

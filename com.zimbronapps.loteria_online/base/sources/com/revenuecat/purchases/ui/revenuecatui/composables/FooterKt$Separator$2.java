package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.V;
import Qa.p;
import b0.g1;
import b0.m;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FooterKt$Separator$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ V $this_Separator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterKt$Separator$2(V v, long j, int i) {
        super(2);
        this.$this_Separator = v;
        this.$color = j;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        FooterKt.access$Separator-RPmYEkk(this.$this_Separator, this.$color, mVar, g1.a(this.$$changed | 1));
    }
}

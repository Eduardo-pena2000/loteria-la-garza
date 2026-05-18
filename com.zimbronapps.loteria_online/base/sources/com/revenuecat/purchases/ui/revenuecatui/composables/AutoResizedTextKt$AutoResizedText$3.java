package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import Z0.Y0;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import d1.L;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AutoResizedTextKt$AutoResizedText$3 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Y0 $style;
    final /* synthetic */ String $text;
    final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoResizedTextKt$AutoResizedText$3(String str, e eVar, long j, Y0 y0, L l, int i, int i2, int i3) {
        super(2);
        this.$text = str;
        this.$modifier = eVar;
        this.$color = j;
        this.$style = y0;
        this.$fontWeight = l;
        this.$textAlign = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        AutoResizedTextKt.AutoResizedText-W72HBGU(this.$text, this.$modifier, this.$color, this.$style, this.$fontWeight, this.$textAlign, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}

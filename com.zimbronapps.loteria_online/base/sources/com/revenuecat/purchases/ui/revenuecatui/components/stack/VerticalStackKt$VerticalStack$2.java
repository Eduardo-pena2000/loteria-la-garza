package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Qa.l;
import Qa.p;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VerticalStackKt$VerticalStack$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ l $content;
    final /* synthetic */ Dimension.Vertical $dimension;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Size $size;
    final /* synthetic */ float $spacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalStackKt$VerticalStack$2(Size size, Dimension.Vertical vertical, float f, e eVar, l lVar, int i, int i2) {
        super(2);
        this.$size = size;
        this.$dimension = vertical;
        this.$spacing = f;
        this.$modifier = eVar;
        this.$content = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        VerticalStackKt.VerticalStack-TN_CM5M(this.$size, this.$dimension, this.$spacing, this.$modifier, this.$content, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}

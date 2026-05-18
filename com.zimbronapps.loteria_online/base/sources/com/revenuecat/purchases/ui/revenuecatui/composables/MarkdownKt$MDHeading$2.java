package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import Sb.j;
import Z0.Y0;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import d1.L;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MarkdownKt$MDHeading$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ boolean $applyFontSizeToParagraph;
    final /* synthetic */ long $color;
    final /* synthetic */ d1.u $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ j $heading;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Y0 $style;
    final /* synthetic */ l1.j $textAlign;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownKt$MDHeading$2(j jVar, long j, Y0 y0, long j2, L l, d1.u uVar, l1.j jVar2, boolean z, boolean z2, boolean z3, e eVar, int i, int i2, int i3) {
        super(2);
        this.$heading = jVar;
        this.$color = j;
        this.$style = y0;
        this.$fontSize = j2;
        this.$fontWeight = l;
        this.$fontFamily = uVar;
        this.$textAlign = jVar2;
        this.$allowLinks = z;
        this.$textFillMaxWidth = z2;
        this.$applyFontSizeToParagraph = z3;
        this.$modifier = eVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        MarkdownKt.access$MDHeading-JFVkrdg(this.$heading, this.$color, this.$style, this.$fontSize, this.$fontWeight, this.$fontFamily, this.$textAlign, this.$allowLinks, this.$textFillMaxWidth, this.$applyFontSizeToParagraph, this.$modifier, mVar, g1.a(this.$$changed | 1), g1.a(this.$$changed1), this.$$default);
    }
}

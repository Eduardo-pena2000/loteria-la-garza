package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import Sb.b;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import d1.L;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MarkdownKt$MDBlockQuote$3 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ L $baseFontWeight;
    final /* synthetic */ b $blockQuote;
    final /* synthetic */ long $color;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownKt$MDBlockQuote$3(b bVar, long j, boolean z, L l, e eVar, int i, int i2) {
        super(2);
        this.$blockQuote = bVar;
        this.$color = j;
        this.$allowLinks = z;
        this.$baseFontWeight = l;
        this.$modifier = eVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        MarkdownKt.access$MDBlockQuote-8V94_ZQ(this.$blockQuote, this.$color, this.$allowLinks, this.$baseFontWeight, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}

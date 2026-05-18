package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import Sb.c;
import Z0.Y0;
import b0.g1;
import b0.m;
import d1.L;
import kotlin.jvm.internal.u;
import l1.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MarkdownKt$MDBulletList$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ c $bulletList;
    final /* synthetic */ long $color;
    final /* synthetic */ d1.u $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ Y0 $style;
    final /* synthetic */ j $textAlign;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownKt$MDBulletList$2(c cVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar, boolean z, boolean z2, int i) {
        super(2);
        this.$bulletList = cVar;
        this.$color = j;
        this.$style = y0;
        this.$fontSize = j2;
        this.$fontWeight = l;
        this.$fontFamily = uVar;
        this.$textAlign = jVar;
        this.$allowLinks = z;
        this.$textFillMaxWidth = z2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        MarkdownKt.access$MDBulletList-lzeOXFE(this.$bulletList, this.$color, this.$style, this.$fontSize, this.$fontWeight, this.$fontFamily, this.$textAlign, this.$allowLinks, this.$textFillMaxWidth, mVar, g1.a(this.$$changed | 1));
    }
}

package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.q;
import Sb.s;
import Z0.Y0;
import Z0.e;
import b0.m;
import b0.w;
import d1.L;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MarkdownKt$MDBulletList$1 extends u implements q {
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ char $marker;
    final /* synthetic */ Y0 $resolvedTextStyle;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownKt$MDBulletList$1(Y0 y0, boolean z, char c, long j, boolean z2, L l) {
        super(3);
        this.$resolvedTextStyle = y0;
        this.$textFillMaxWidth = z;
        this.$marker = c;
        this.$color = j;
        this.$allowLinks = z2;
        this.$fontWeight = l;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((s) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(s it, m mVar, int i) {
        t.g(it, "it");
        if (w.L()) {
            w.U(1682895250, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDBulletList.<anonymous> (Markdown.kt:280)");
        }
        Y0 y0 = this.$resolvedTextStyle;
        char c = this.$marker;
        long j = this.$color;
        boolean z = this.$allowLinks;
        L l = this.$fontWeight;
        e.b bVar = new e.b(0, 1, (k) null);
        bVar.k(y0.O());
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(' ');
        bVar.g(sb.toString());
        MarkdownKt.access$appendMarkdownChildren-XO-JAsU(bVar, it, j, z, l);
        bVar.h();
        MarkdownKt.access$MarkdownText(bVar.l(), this.$resolvedTextStyle, this.$textFillMaxWidth, null, mVar, 0, 8);
        if (w.L()) {
            w.T();
        }
    }
}

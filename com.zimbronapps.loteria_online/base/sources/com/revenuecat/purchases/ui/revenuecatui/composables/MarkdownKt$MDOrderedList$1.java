package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.q;
import Sb.s;
import Z0.Y0;
import Z0.e;
import b0.m;
import b0.w;
import d1.L;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MarkdownKt$MDOrderedList$1 extends u implements q {
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ char $delimiter;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ M $number;
    final /* synthetic */ Y0 $resolvedTextStyle;
    final /* synthetic */ boolean $textFillMaxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownKt$MDOrderedList$1(Y0 y0, boolean z, M m, char c, long j, boolean z2, L l) {
        super(3);
        this.$resolvedTextStyle = y0;
        this.$textFillMaxWidth = z;
        this.$number = m;
        this.$delimiter = c;
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
            w.U(-1609568168, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDOrderedList.<anonymous> (Markdown.kt:330)");
        }
        Y0 y0 = this.$resolvedTextStyle;
        M m = this.$number;
        char c = this.$delimiter;
        long j = this.$color;
        boolean z = this.$allowLinks;
        L l = this.$fontWeight;
        e.b bVar = new e.b(0, 1, (k) null);
        bVar.k(y0.O());
        StringBuilder sb = new StringBuilder();
        int i2 = m.a;
        m.a = i2 + 1;
        sb.append(i2);
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

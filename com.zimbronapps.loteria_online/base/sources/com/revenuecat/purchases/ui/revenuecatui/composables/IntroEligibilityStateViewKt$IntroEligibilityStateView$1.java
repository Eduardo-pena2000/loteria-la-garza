package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.q;
import Z0.Y0;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import d1.L;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IntroEligibilityStateViewKt$IntroEligibilityStateView$1 extends u implements q {
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Y0 $style;
    final /* synthetic */ j $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroEligibilityStateViewKt$IntroEligibilityStateView$1(e eVar, long j, Y0 y0, L l, j jVar, boolean z) {
        super(3);
        this.$modifier = eVar;
        this.$color = j;
        this.$style = y0;
        this.$fontWeight = l;
        this.$textAlign = jVar;
        this.$allowLinks = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((String) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(String it, m mVar, int i) {
        int i2;
        t.g(it, "it");
        if ((i & 6) == 0) {
            i2 = i | (mVar.U(it) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-88431708, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateView.<anonymous> (IntroEligibilityStateView.kt:40)");
        }
        MarkdownKt.Markdown-DkhmgE0(it, this.$modifier, this.$color, this.$style, 0L, this.$fontWeight, null, null, this.$textAlign, this.$allowLinks, true, false, mVar, i2 & 14, 54, 208);
        if (w.L()) {
            w.T();
        }
    }
}

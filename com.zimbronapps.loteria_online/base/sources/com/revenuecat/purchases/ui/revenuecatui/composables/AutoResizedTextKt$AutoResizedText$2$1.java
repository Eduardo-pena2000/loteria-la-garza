package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.l;
import Z0.G;
import Z0.T0;
import Z0.Y0;
import b0.C0;
import d1.H;
import d1.L;
import h1.e;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.a;
import l1.h;
import l1.k;
import l1.q;
import l1.s;
import n1.v;
import n1.w;
import v0.C1;
import x0.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AutoResizedTextKt$AutoResizedText$2$1 extends u implements l {
    final /* synthetic */ long $defaultFontSize;
    final /* synthetic */ C0 $resizedTextStyle$delegate;
    final /* synthetic */ C0 $shouldDraw$delegate;
    final /* synthetic */ Y0 $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoResizedTextKt$AutoResizedText$2$1(Y0 y0, long j, C0 c0, C0 c02) {
        super(1);
        this.$style = y0;
        this.$defaultFontSize = j;
        this.$resizedTextStyle$delegate = c0;
        this.$shouldDraw$delegate = c02;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((T0) obj);
        return I.a;
    }

    public final void invoke(T0 result) {
        t.g(result, "result");
        if (!result.g()) {
            AutoResizedTextKt.access$AutoResizedText_W72HBGU$lambda$5(this.$shouldDraw$delegate, true);
            return;
        }
        if (w.g(this.$style.n())) {
            C0 c0 = this.$resizedTextStyle$delegate;
            AutoResizedTextKt.access$AutoResizedText_W72HBGU$lambda$2(c0, Y0.e(AutoResizedTextKt.access$AutoResizedText_W72HBGU$lambda$1(c0), 0L, this.$defaultFontSize, (L) null, (H) null, (d1.I) null, (d1.u) null, (String) null, 0L, (a) null, (q) null, (e) null, 0L, (k) null, (C1) null, (g) null, 0, 0, 0L, (s) null, (G) null, (h) null, 0, 0, (l1.u) null, 16777213, (Object) null));
        }
        long n = AutoResizedTextKt.access$AutoResizedText_W72HBGU$lambda$1(this.$resizedTextStyle$delegate).n();
        w.b(n);
        long i = w.i(v.f(n), (float) (v.h(n) * 0.95d));
        C0 c02 = this.$resizedTextStyle$delegate;
        AutoResizedTextKt.access$AutoResizedText_W72HBGU$lambda$2(c02, Y0.e(AutoResizedTextKt.access$AutoResizedText_W72HBGU$lambda$1(c02), 0L, i, (L) null, (H) null, (d1.I) null, (d1.u) null, (String) null, 0L, (a) null, (q) null, (e) null, 0L, (k) null, (C1) null, (g) null, 0, 0, 0L, (s) null, (G) null, (h) null, 0, 0, (l1.u) null, 16777213, (Object) null));
    }
}

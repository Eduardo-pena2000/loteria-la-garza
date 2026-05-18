package com.revenuecat.purchases.ui.revenuecatui.views;

import A.q;
import Ca.I;
import Qa.p;
import X.F;
import X.X;
import X.r0;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RevenueCatThemeKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(p pVar, int i) {
            super(2);
            this.$content = pVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RevenueCatThemeKt.RevenueCatTheme(this.$content, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void RevenueCatTheme(p content, m mVar, int i) {
        int i2;
        t.g(content, "content");
        m i3 = mVar.i(450518819);
        if ((i & 6) == 0) {
            i2 = (i3.E(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(450518819, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.views.RevenueCatTheme (RevenueCatTheme.kt:9)");
            }
            F.a(q.a(i3, 0) ? X.m.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, (Object) null) : X.m.j(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, (Object) null), (X) null, (r0) null, content, i3, (i2 << 9) & 7168, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(content, i));
        }
    }
}

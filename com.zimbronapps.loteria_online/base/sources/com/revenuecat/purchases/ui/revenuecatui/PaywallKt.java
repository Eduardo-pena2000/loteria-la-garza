package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.p;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallOptions paywallOptions, int i) {
            super(2);
            this.$options = paywallOptions;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PaywallKt.Paywall(this.$options, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void Paywall(PaywallOptions options, m mVar, int i) {
        int i2;
        t.g(options, "options");
        m i3 = mVar.i(377521151);
        if ((i & 6) == 0) {
            i2 = (i3.U(options) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(377521151, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.Paywall (Paywall.kt:9)");
            }
            InternalPaywallKt.InternalPaywall(options, null, i3, i2 & 14, 2);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(options, i));
        }
    }
}

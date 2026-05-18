package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.Y;
import F.e0;
import F.k0;
import F.l0;
import Qa.p;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InsetSpacersKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InsetSpacersKt.StatusBarSpacer(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InsetSpacersKt.SystemBarsSpacer(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void StatusBarSpacer(m mVar, int i) {
        m i2 = mVar.i(-585549758);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-585549758, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.StatusBarSpacer (InsetSpacers.kt:12)");
            }
            Y.a(k0.b(e.a, l0.d(e0.a, i2, 6)), i2, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final void SystemBarsSpacer(m mVar, int i) {
        m i2 = mVar.i(1253623468);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1253623468, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SystemBarsSpacer (InsetSpacers.kt:21)");
            }
            Y.a(k0.a(e.a, l0.e(e0.a, i2, 6)), i2, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }
}

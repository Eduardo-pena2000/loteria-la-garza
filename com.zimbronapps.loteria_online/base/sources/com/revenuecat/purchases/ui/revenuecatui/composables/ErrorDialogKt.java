package com.revenuecat.purchases.ui.revenuecatui.composables;

import A.i;
import Ca.I;
import F.L;
import Qa.a;
import Qa.l;
import Qa.p;
import X.c;
import X.h;
import X.j;
import X.k;
import X.m0;
import Z0.Y0;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import d1.H;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ErrorDialogKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ a $dismissRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(a aVar) {
            super(2);
            this.$dismissRequest = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1928946396, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialog.<anonymous> (ErrorDialog.kt:22)");
            }
            k.c(this.$dismissRequest, (e) null, false, (E1) null, (h) null, (j) null, (i) null, (L) null, (E.m) null, ComposableSingletons$ErrorDialogKt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), mVar, 805306368, 510);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ String $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str) {
            super(2);
            this.$error = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-1457354655, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialog.<anonymous> (ErrorDialog.kt:33)");
            }
            m0.b(this.$error, (e) null, 0L, 0L, (H) null, (d1.L) null, (d1.u) null, 0L, (l1.k) null, (l1.j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ a $dismissRequest;
        final /* synthetic */ String $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(a aVar, String str, int i) {
            super(2);
            this.$dismissRequest = aVar;
            this.$error = str;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ErrorDialogKt.ErrorDialog(this.$dismissRequest, this.$error, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final /* synthetic */ void ErrorDialog(a dismissRequest, String error, m mVar, int i) {
        int i2;
        m mVar2;
        t.g(dismissRequest, "dismissRequest");
        t.g(error, "error");
        m i3 = mVar.i(875108500);
        if ((i & 6) == 0) {
            i2 = (i3.E(dismissRequest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(error) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(875108500, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialog (ErrorDialog.kt:18)");
            }
            mVar2 = i3;
            c.a(dismissRequest, j0.i.d(1928946396, true, new 1(dismissRequest), i3, 54), (e) null, (p) null, ComposableSingletons$ErrorDialogKt.INSTANCE.getLambda-2$revenuecatui_defaultsBc8Release(), (p) null, j0.i.d(-1457354655, true, new 2(error), i3, 54), (E1) null, 0L, 0L, 0L, 0L, 0.0f, (r1.k) null, mVar2, (i2 & 14) | 1597488, 0, 16300);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 3(dismissRequest, error, i));
        }
    }
}

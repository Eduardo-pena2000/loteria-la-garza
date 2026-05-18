package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.n;
import Ca.I;
import F.L;
import F.c;
import H.b;
import Qa.l;
import Qa.p;
import U0.c;
import X.C;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallIconKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PaywallIconKt.PaywallIconPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void PaywallIcon-FNF3uiM(PaywallIconName icon, e eVar, long j, m mVar, int i, int i2) {
        int i3;
        t.g(icon, "icon");
        m i4 = mVar.i(269660957);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.U(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.U(eVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i4.e(j) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && i4.j()) {
            i4.M();
        } else {
            if (i5 != 0) {
                eVar = e.a;
            }
            if (w.L()) {
                w.U(269660957, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIcon (PaywallIcon.kt:23)");
            }
            C.a(c.c(icon.drawable$revenuecatui_defaultsBc8Release(), i4, 0), (String) null, g.f(b.b(e.a, 1.0f, false, 2, (Object) null), 0.0f, 1, (Object) null).then(eVar), j, i4, ((i3 << 3) & 7168) | 48, 0);
            if (w.L()) {
                w.T();
            }
        }
        e eVar2 = eVar;
        B1 l = i4.l();
        if (l != null) {
            l.a(new PaywallIconKt$PaywallIcon$1(icon, eVar2, j, i, i2));
        }
    }

    public static final void PaywallIconPreview(m mVar, int i) {
        m i2 = mVar.i(1356053803);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1356053803, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconPreview (PaywallIcon.kt:150)");
            }
            PaywallIconName[] values = PaywallIconName.values();
            b.a aVar = new b.a(h.g(40), (k) null);
            i2.V(914039657);
            boolean E = i2.E(values);
            Object C = i2.C();
            if (E || C == m.a.a()) {
                C = new PaywallIconKt$PaywallIconPreview$1$1(values);
                i2.t(C);
            }
            i2.P();
            H.h.a(aVar, (e) null, (H.I) null, (L) null, false, (c.m) null, (c.e) null, (n) null, false, (l) C, i2, 0, 510);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }
}

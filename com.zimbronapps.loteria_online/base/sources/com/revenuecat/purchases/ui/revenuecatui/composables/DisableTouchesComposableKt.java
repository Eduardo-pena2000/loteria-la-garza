package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.f;
import I0.V;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DisableTouchesComposableKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $content;
        final /* synthetic */ boolean $shouldDisable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(boolean z, p pVar, int i, int i2) {
            super(2);
            this.$shouldDisable = z;
            this.$content = pVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            DisableTouchesComposableKt.DisableTouchesComposable(this.$shouldDisable, this.$content, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final void DisableTouchesComposable(boolean z, p content, m mVar, int i, int i2) {
        int i3;
        t.g(content, "content");
        m i4 = mVar.i(1296500023);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.E(content) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && i4.j()) {
            i4.M();
        } else {
            if (i5 != 0) {
                z = true;
            }
            if (w.L()) {
                w.U(1296500023, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposable (DisableTouchesComposable.kt:11)");
            }
            e.a aVar = e.a;
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(i4, 0);
            b0.I r = i4.r();
            e f = c.f(i4, aVar);
            g.a aVar2 = g.E8;
            a a2 = aVar2.a();
            if (i4.k() == null) {
                h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a2);
            } else {
                i4.s();
            }
            m b = m2.b(i4);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            content.invoke(i4, Integer.valueOf((i3 >> 3) & 14));
            i4.V(882999730);
            if (z) {
                f.a(V.c(cVar.c(aVar), I.a, new DisableTouchesComposableKt$DisableTouchesComposable$1$1(null)), i4, 0);
            }
            i4.P();
            i4.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new 2(z, content, i, i2));
        }
    }
}

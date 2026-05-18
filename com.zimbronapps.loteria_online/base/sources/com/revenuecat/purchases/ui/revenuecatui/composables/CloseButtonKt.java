package com.revenuecat.purchases.ui.revenuecatui.composables;

import F.c;
import F.h;
import F.l;
import F.o;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import X.z;
import androidx.compose.ui.e;
import b0.B1;
import b0.I;
import b0.m;
import b0.m2;
import b0.w;
import j0.i;
import kotlin.jvm.internal.t;
import o0.e;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CloseButtonKt {
    public static final void CloseButton-drOMvmE(h CloseButton, boolean z, r0 r0Var, boolean z2, a onClick, m mVar, int i) {
        int i2;
        m mVar2;
        t.g(CloseButton, "$this$CloseButton");
        t.g(onClick, "onClick");
        m i3 = mVar.i(-396768639);
        if ((i & 6) == 0) {
            i2 = (i3.U(CloseButton) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.U(r0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.a(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.E(onClick) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(-396768639, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.CloseButton (CloseButton.kt:20)");
            }
            if (z) {
                e.a aVar = e.a;
                e.a aVar2 = o0.e.a;
                androidx.compose.ui.e a = CloseButton.a(aVar, aVar2.o());
                B a2 = l.a(c.a.h(), aVar2.k(), i3, 0);
                int a3 = b0.h.a(i3, 0);
                I r = i3.r();
                androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, a);
                g.a aVar3 = g.E8;
                a a4 = aVar3.a();
                if (i3.k() == null) {
                    b0.h.d();
                }
                i3.I();
                if (i3.f()) {
                    i3.p(a4);
                } else {
                    i3.s();
                }
                m b = m2.b(i3);
                m2.e(b, a2, aVar3.e());
                m2.e(b, r, aVar3.g());
                p b2 = aVar3.b();
                if (b.f() || !t.c(b.C(), Integer.valueOf(a3))) {
                    b.t(Integer.valueOf(a3));
                    b.J(Integer.valueOf(a3), b2);
                }
                m2.e(b, f, aVar3.f());
                o oVar = o.a;
                InsetSpacersKt.StatusBarSpacer(i3, 0);
                mVar2 = i3;
                X.B.a(onClick, (androidx.compose.ui.e) null, !z2, (z) null, (E.m) null, i.d(170484435, true, new CloseButtonKt$CloseButton$1$1(r0Var), i3, 54), i3, ((i2 >> 12) & 14) | 196608, 26);
                mVar2.v();
            } else {
                mVar2 = i3;
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new CloseButtonKt$CloseButton$2(CloseButton, z, r0Var, z2, onClick, i));
        }
    }
}

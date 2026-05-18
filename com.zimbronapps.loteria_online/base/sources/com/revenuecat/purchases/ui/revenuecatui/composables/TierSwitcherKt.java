package com.revenuecat.purchases.ui.revenuecatui.composables;

import A.M;
import F.T;
import F.V;
import F.W;
import F.c;
import M.i;
import M0.B;
import O0.g;
import P0.p0;
import Qa.l;
import Qa.p;
import X.E;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.a;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.o;
import b0.B1;
import b0.C0;
import b0.I;
import b0.T1;
import b0.U1;
import b0.h;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import d1.H;
import d1.L;
import d1.u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import l1.j;
import l1.k;
import n1.d;
import o0.e;
import v0.E1;
import v0.r0;
import y.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TierSwitcherKt {
    public static final void SelectedTierView-1wkBAMs(TemplateConfiguration.TierInfo selectedTier, long j, long j2, m mVar, int i) {
        int i2;
        t.g(selectedTier, "selectedTier");
        m i3 = mVar.i(-474734628);
        if ((i & 6) == 0) {
            i2 = (i3.U(selectedTier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.e(j2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-474734628, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SelectedTierView (TierSwitcher.kt:52)");
            }
            e c = a.c(e.a, j, i.a(50));
            TierSwitcherUIConstants tierSwitcherUIConstants = TierSwitcherUIConstants.INSTANCE;
            e j3 = f.j(c, tierSwitcherUIConstants.getTierHorizontalPadding-D9Ej5fM(), tierSwitcherUIConstants.getTierVerticalPadding-D9Ej5fM());
            B h = F.f.h(o0.e.a.o(), false);
            int a = h.a(i3, 0);
            I r = i3.r();
            e f = c.f(i3, j3);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            m0.b(selectedTier.getName(), (e) null, j2, 0L, (H) null, (L) null, (u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, E.a.c(i3, E.b).c(), i3, i2 & 896, 0, 65530);
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new TierSwitcherKt$SelectedTierView$2(selectedTier, j, j2, i));
        }
    }

    public static final void TierSwitcher-UFBoNtE(List tiers, TemplateConfiguration.TierInfo selectedTier, l onTierSelected, long j, long j2, long j3, long j4, m mVar, int i) {
        int i2;
        m mVar2;
        t.g(tiers, "tiers");
        t.g(selectedTier, "selectedTier");
        t.g(onTierSelected, "onTierSelected");
        m i3 = mVar.i(1054819874);
        if ((i & 6) == 0) {
            i2 = (i3.E(tiers) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(selectedTier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.E(onTierSelected) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.e(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= i3.e(j3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= i3.e(j4) ? 1048576 : 524288;
        }
        int i4 = i2;
        if ((599187 & i4) == 599186 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1054819874, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.TierSwitcher (TierSwitcher.kt:82)");
            }
            int indexOf = tiers.indexOf(selectedTier);
            i3.V(-1638624750);
            Object C = i3.C();
            m.a aVar = m.a;
            if (C == aVar.a()) {
                C = U1.i(0, (T1) null, 2, (Object) null);
                i3.t(C);
            }
            C0 c0 = (C0) C;
            i3.P();
            i3.V(-1638622858);
            Object C2 = i3.C();
            if (C2 == aVar.a()) {
                C2 = U1.i(n1.h.d(n1.h.g(40)), (T1) null, 2, (Object) null);
                i3.t(C2);
            }
            C0 c02 = (C0) C2;
            i3.P();
            d dVar = (d) i3.x(p0.e());
            UIConstant uIConstant = UIConstant.INSTANCE;
            int i5 = i4;
            h2 a = z.a(j, uIConstant.getDefaultColorAnimation(), "backgroundColor", (l) null, i3, ((i4 >> 9) & 14) | 384, 8);
            h2 a2 = z.a(j2, uIConstant.getDefaultColorAnimation(), "backgroundSelectedColor", (l) null, i3, ((i5 >> 12) & 14) | 384, 8);
            h2 a3 = z.a(j3, uIConstant.getDefaultColorAnimation(), "foregroundColor", (l) null, i3, ((i5 >> 15) & 14) | 384, 8);
            h2 a4 = z.a(j4, uIConstant.getDefaultColorAnimation(), "foregroundSelectedColor", (l) null, i3, ((i5 >> 18) & 14) | 384, 8);
            e.a aVar2 = e.a;
            e h = androidx.compose.foundation.layout.g.h(a.d(s0.h.a(aVar2, i.a(50)), TierSwitcher_UFBoNtE$lambda$7(a), (E1) null, 2, (Object) null), 0.0f, 1, (Object) null);
            i3.V(-1638586667);
            Object C3 = i3.C();
            if (C3 == aVar.a()) {
                C3 = new TierSwitcherKt$TierSwitcher$1$1(c0);
                i3.t(C3);
            }
            i3.P();
            e a5 = o.a(h, (l) C3);
            e.a aVar3 = o0.e.a;
            B h2 = F.f.h(aVar3.o(), false);
            int a6 = h.a(i3, 0);
            I r = i3.r();
            androidx.compose.ui.e f = c.f(i3, a5);
            g.a aVar4 = g.E8;
            Qa.a a7 = aVar4.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a7);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, h2, aVar4.e());
            m2.e(b, r, aVar4.g());
            p b2 = aVar4.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a6))) {
                b.t(Integer.valueOf(a6));
                b.J(Integer.valueOf(a6), b2);
            }
            m2.e(b, f, aVar4.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            float g = n1.h.g(dVar.A(TierSwitcher_UFBoNtE$lambda$2(c0) / tiers.size()) * indexOf);
            float f2 = 0.0f;
            androidx.compose.ui.e i6 = androidx.compose.foundation.layout.g.i(androidx.compose.foundation.layout.g.g(androidx.compose.foundation.layout.e.b(aVar2, TierSwitcher_UFBoNtE$lambda$20$lambda$13(z.c.c(g, (z.i) null, "tier_switcher", (l) null, i3, 384, 10)), 0.0f, 2, (Object) null), 1.0f / tiers.size()), TierSwitcher_UFBoNtE$lambda$5(c02));
            TierSwitcherUIConstants tierSwitcherUIConstants = TierSwitcherUIConstants.INSTANCE;
            F.f.a(a.d(s0.h.a(f.i(i6, tierSwitcherUIConstants.getSelectedTierPadding-D9Ej5fM()), i.a(50)), TierSwitcher_UFBoNtE$lambda$8(a2), (E1) null, 2, (Object) null), i3, 0);
            e.c i7 = aVar3.i();
            c.f f3 = F.c.a.f();
            i3.V(1157748976);
            boolean U = i3.U(dVar);
            Object C4 = i3.C();
            if (U || C4 == aVar.a()) {
                C4 = new TierSwitcherKt$TierSwitcher$2$1$1(dVar, c02);
                i3.t(C4);
            }
            i3.P();
            androidx.compose.ui.e k = androidx.compose.foundation.layout.g.k(androidx.compose.foundation.layout.d.a(o.a(aVar2, (l) C4), F.E.b), tierSwitcherUIConstants.getMinimumHeight-D9Ej5fM(), 0.0f, 2, (Object) null);
            B b3 = T.b(f3, i7, i3, 54);
            int a8 = h.a(i3, 0);
            I r2 = i3.r();
            androidx.compose.ui.e f4 = androidx.compose.ui.c.f(i3, k);
            Qa.a a9 = aVar4.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a9);
            } else {
                i3.s();
            }
            m b4 = m2.b(i3);
            m2.e(b4, b3, aVar4.e());
            m2.e(b4, r2, aVar4.g());
            p b5 = aVar4.b();
            if (b4.f() || !t.c(b4.C(), Integer.valueOf(a8))) {
                b4.t(Integer.valueOf(a8));
                b4.J(Integer.valueOf(a8), b5);
            }
            m2.e(b4, f4, aVar4.f());
            W w = W.a;
            i3.V(686110850);
            Iterator it = tiers.iterator();
            while (it.hasNext()) {
                TemplateConfiguration.TierInfo tierInfo = (TemplateConfiguration.TierInfo) it.next();
                o0.e e = o0.e.a.e();
                e.a aVar5 = androidx.compose.ui.e.a;
                androidx.compose.ui.e d = androidx.compose.foundation.layout.g.d(V.c(w, aVar5, 1.0f, false, 2, (Object) null), f2, 1, (Object) null);
                i3.V(-606775784);
                Object C5 = i3.C();
                m.a aVar6 = m.a;
                if (C5 == aVar6.a()) {
                    C5 = E.l.a();
                    i3.t(C5);
                }
                E.m mVar3 = (E.m) C5;
                i3.P();
                i3.V(-606773603);
                boolean U2 = ((i5 & 896) == 256) | i3.U(tierInfo);
                Object C6 = i3.C();
                if (U2 || C6 == aVar6.a()) {
                    C6 = new TierSwitcherKt$TierSwitcher$2$2$1$2$1(onTierSelected, tierInfo);
                    i3.t(C6);
                }
                i3.P();
                androidx.compose.ui.e b6 = b.b(d, mVar3, (M) null, false, (String) null, (W0.h) null, (Qa.a) C6, 28, (Object) null);
                B h3 = F.f.h(e, false);
                int a10 = h.a(i3, 0);
                I r3 = i3.r();
                androidx.compose.ui.e f5 = androidx.compose.ui.c.f(i3, b6);
                g.a aVar7 = g.E8;
                Qa.a a11 = aVar7.a();
                if (i3.k() == null) {
                    h.d();
                }
                i3.I();
                if (i3.f()) {
                    i3.p(a11);
                } else {
                    i3.s();
                }
                m b7 = m2.b(i3);
                m2.e(b7, h3, aVar7.e());
                m2.e(b7, r3, aVar7.g());
                p b8 = aVar7.b();
                if (b7.f() || !t.c(b7.C(), Integer.valueOf(a10))) {
                    b7.t(Integer.valueOf(a10));
                    b7.J(Integer.valueOf(a10), b8);
                }
                m2.e(b7, f5, aVar7.f());
                androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.c.a;
                String name = tierInfo.getName();
                Y0 c = E.a.c(i3, E.b).c();
                int a12 = j.b.a();
                TierSwitcherUIConstants tierSwitcherUIConstants2 = TierSwitcherUIConstants.INSTANCE;
                androidx.compose.ui.e j5 = f.j(aVar5, tierSwitcherUIConstants2.getTierTextPaddingHorizontal-D9Ej5fM(), tierSwitcherUIConstants2.getTierTextPaddingVertical-D9Ej5fM());
                m mVar4 = i3;
                m0.b(name, j5, t.c(selectedTier, tierInfo) ? TierSwitcher_UFBoNtE$lambda$10(a4) : TierSwitcher_UFBoNtE$lambda$9(a3), 0L, (H) null, (L) null, (u) null, 0L, (k) null, j.h(a12), 0L, 0, false, 0, 0, (l) null, c, mVar4, 48, 0, 65016);
                mVar4.v();
                i5 = i5;
                i3 = mVar4;
                f2 = 0.0f;
            }
            mVar2 = i3;
            mVar2.P();
            mVar2.v();
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new TierSwitcherKt$TierSwitcher$3(tiers, selectedTier, onTierSelected, j, j2, j3, j4, i));
        }
    }

    private static final long TierSwitcher_UFBoNtE$lambda$10(h2 h2Var) {
        return ((r0) h2Var.getValue()).A();
    }

    private static final int TierSwitcher_UFBoNtE$lambda$2(C0 c0) {
        return ((Number) c0.getValue()).intValue();
    }

    private static final float TierSwitcher_UFBoNtE$lambda$20$lambda$13(h2 h2Var) {
        return ((n1.h) h2Var.getValue()).m();
    }

    private static final void TierSwitcher_UFBoNtE$lambda$3(C0 c0, int i) {
        c0.setValue(Integer.valueOf(i));
    }

    private static final float TierSwitcher_UFBoNtE$lambda$5(C0 c0) {
        return ((n1.h) c0.getValue()).m();
    }

    private static final void TierSwitcher_UFBoNtE$lambda$6(C0 c0, float f) {
        c0.setValue(n1.h.d(f));
    }

    private static final long TierSwitcher_UFBoNtE$lambda$7(h2 h2Var) {
        return ((r0) h2Var.getValue()).A();
    }

    private static final long TierSwitcher_UFBoNtE$lambda$8(h2 h2Var) {
        return ((r0) h2Var.getValue()).A();
    }

    private static final long TierSwitcher_UFBoNtE$lambda$9(h2 h2Var) {
        return ((r0) h2Var.getValue()).A();
    }

    public static final /* synthetic */ void access$TierSwitcher_UFBoNtE$lambda$3(C0 c0, int i) {
        TierSwitcher_UFBoNtE$lambda$3(c0, i);
    }

    public static final /* synthetic */ void access$TierSwitcher_UFBoNtE$lambda$6(C0 c0, float f) {
        TierSwitcher_UFBoNtE$lambda$6(c0, f);
    }
}

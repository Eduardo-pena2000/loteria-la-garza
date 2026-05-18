package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.f;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import Qa.q;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ConsistentPackageContentViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ q $creator;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallState.Loaded.Legacy legacy, q qVar, int i) {
            super(2);
            this.$state = legacy;
            this.$creator = qVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ConsistentPackageContentViewKt.ConsistentPackageContentView(this.$state, this.$creator, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ q $creator;
        final /* synthetic */ List $packages;
        final /* synthetic */ TemplateConfiguration.PackageInfo $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(List list, TemplateConfiguration.PackageInfo packageInfo, q qVar, int i) {
            super(2);
            this.$packages = list;
            this.$selected = packageInfo;
            this.$creator = qVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ConsistentPackageContentViewKt.ConsistentPackageContentView(this.$packages, this.$selected, this.$creator, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void ConsistentPackageContentView(PaywallState.Loaded.Legacy state, q creator, m mVar, int i) {
        int i2;
        t.g(state, "state");
        t.g(creator, "creator");
        m i3 = mVar.i(-499614075);
        if ((i & 6) == 0) {
            i2 = (i3.U(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(creator) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-499614075, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentView (ConsistentPackageContentView.kt:14)");
            }
            ConsistentPackageContentView(state.getTemplateConfiguration().getPackages().getAll(), (TemplateConfiguration.PackageInfo) state.getSelectedPackage().getValue(), creator, i3, (i2 << 3) & 896);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(state, creator, i));
        }
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    public static final void ConsistentPackageContentView(List packages, TemplateConfiguration.PackageInfo selected, q creator, m mVar, int i) {
        t.g(packages, "packages");
        t.g(selected, "selected");
        t.g(creator, "creator");
        m i2 = mVar.i(-1899321464);
        int i3 = (i & 6) == 0 ? (i2.E(packages) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= i2.U(selected) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= i2.E(creator) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1899321464, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentView (ConsistentPackageContentView.kt:31)");
            }
            e.a aVar = e.a;
            ?? r8 = 0;
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(i2, 0);
            b0.I r = i2.r();
            e f = c.f(i2, aVar);
            g.a aVar2 = g.E8;
            a a2 = aVar2.a();
            if (i2.k() == null) {
                h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a2);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            i2.V(533206241);
            for (Object obj : packages) {
                e a3 = s0.a.a(e.a, 0.0f);
                e.a aVar3 = o0.e.a;
                androidx.compose.ui.e a4 = cVar.a(a3, aVar3.e());
                B h2 = f.h(aVar3.o(), (boolean) r8);
                int a5 = h.a(i2, (int) r8);
                b0.I r2 = i2.r();
                androidx.compose.ui.e f2 = c.f(i2, a4);
                g.a aVar4 = g.E8;
                a a6 = aVar4.a();
                if (i2.k() == null) {
                    h.d();
                }
                i2.I();
                if (i2.f()) {
                    i2.p(a6);
                } else {
                    i2.s();
                }
                m b3 = m2.b(i2);
                m2.e(b3, h2, aVar4.e());
                m2.e(b3, r2, aVar4.g());
                p b4 = aVar4.b();
                if (b3.f() || !t.c(b3.C(), Integer.valueOf(a5))) {
                    b3.t(Integer.valueOf(a5));
                    b3.J(Integer.valueOf(a5), b4);
                }
                m2.e(b3, f2, aVar4.f());
                androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.c.a;
                creator.invoke(obj, i2, Integer.valueOf((i3 >> 3) & 112));
                i2.v();
                r8 = 0;
            }
            i2.P();
            e.a aVar5 = androidx.compose.ui.e.a;
            e.a aVar6 = o0.e.a;
            androidx.compose.ui.e a7 = cVar.a(aVar5, aVar6.e());
            B h3 = f.h(aVar6.o(), false);
            int a8 = h.a(i2, 0);
            b0.I r3 = i2.r();
            androidx.compose.ui.e f3 = c.f(i2, a7);
            g.a aVar7 = g.E8;
            a a9 = aVar7.a();
            if (i2.k() == null) {
                h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a9);
            } else {
                i2.s();
            }
            m b5 = m2.b(i2);
            m2.e(b5, h3, aVar7.e());
            m2.e(b5, r3, aVar7.g());
            p b6 = aVar7.b();
            if (b5.f() || !t.c(b5.C(), Integer.valueOf(a8))) {
                b5.t(Integer.valueOf(a8));
                b5.J(Integer.valueOf(a8), b6);
            }
            m2.e(b5, f3, aVar7.f());
            androidx.compose.foundation.layout.c cVar3 = androidx.compose.foundation.layout.c.a;
            creator.invoke(selected, i2, Integer.valueOf((i3 >> 3) & 126));
            i2.v();
            i2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 3(packages, selected, creator, i));
        }
    }
}

package com.revenuecat.purchases.ui.revenuecatui.composables;

import A.g;
import Ca.I;
import F.f;
import H.C;
import H.o;
import M0.B;
import O0.g;
import Qa.l;
import Qa.p;
import Qa.r;
import androidx.compose.foundation.a;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.m;
import b0.m2;
import b0.w;
import j0.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import v0.E1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallIconKt$PaywallIconPreview$1$1 extends u implements l {
    final /* synthetic */ PaywallIconName[] $icons;

    public static final class 1 extends u implements r {
        final /* synthetic */ PaywallIconName[] $icons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallIconName[] paywallIconNameArr) {
            super(4);
            this.$icons = paywallIconNameArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((o) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
            return I.a;
        }

        public final void invoke(o items, int i, m mVar, int i2) {
            int i3;
            t.g(items, "$this$items");
            if ((i2 & 48) == 0) {
                i3 = i2 | (mVar.d(i) ? 32 : 16);
            } else {
                i3 = i2;
            }
            if ((i3 & 145) == 144 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-320278688, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconPreview.<anonymous>.<anonymous>.<anonymous> (PaywallIcon.kt:155)");
            }
            e.a aVar = e.a;
            r0.a aVar2 = r0.b;
            e g = g.g(a.d(aVar, aVar2.k(), (E1) null, 2, (Object) null), h.g(1), aVar2.a(), (E1) null, 4, (Object) null);
            PaywallIconName[] paywallIconNameArr = this.$icons;
            B h = f.h(o0.e.a.o(), false);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = c.f(mVar, g);
            g.a aVar3 = O0.g.E8;
            Qa.a a2 = aVar3.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar3.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            PaywallIconKt.PaywallIcon-FNF3uiM(paywallIconNameArr[i], null, aVar2.a(), mVar, 384, 2);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallIconKt$PaywallIconPreview$1$1(PaywallIconName[] paywallIconNameArr) {
        super(1);
        this.$icons = paywallIconNameArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C) obj);
        return I.a;
    }

    public final void invoke(C LazyVerticalGrid) {
        t.g(LazyVerticalGrid, "$this$LazyVerticalGrid");
        PaywallIconName[] paywallIconNameArr = this.$icons;
        C.c(LazyVerticalGrid, paywallIconNameArr.length, (l) null, (p) null, (l) null, i.b(-320278688, true, new 1(paywallIconNameArr)), 14, (Object) null);
    }
}
